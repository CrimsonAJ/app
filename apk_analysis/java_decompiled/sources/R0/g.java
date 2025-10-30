package R0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import b7.C0701c;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper implements AutoCloseable {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f6480g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6481a;

    /* renamed from: b, reason: collision with root package name */
    public final C0701c f6482b;

    /* renamed from: c, reason: collision with root package name */
    public final Q0.b f6483c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6484d;

    /* renamed from: e, reason: collision with root package name */
    public final S0.a f6485e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6486f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final C0701c c0701c, final Q0.b callback) {
        super(context, str, null, callback.f6039b, new DatabaseErrorHandler() { // from class: R0.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i9 = g.f6480g;
                kotlin.jvm.internal.h.b(sQLiteDatabase);
                c h7 = AbstractC1570b.h(c0701c, sQLiteDatabase);
                Q0.b.this.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + h7 + ".path");
                SQLiteDatabase sQLiteDatabase2 = h7.f6469a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        Q0.b.c(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object second = ((Pair) it.next()).second;
                                kotlin.jvm.internal.h.d(second, "second");
                                Q0.b.c((String) second);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                Q0.b.c(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    h7.close();
                } catch (IOException unused2) {
                }
            }
        });
        String str2;
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(callback, "callback");
        this.f6481a = context;
        this.f6482b = c0701c;
        this.f6483c = callback;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            kotlin.jvm.internal.h.d(str2, "toString(...)");
        } else {
            str2 = str;
        }
        this.f6485e = new S0.a(str2, context.getCacheDir(), false);
    }

    public final Q0.a a(boolean z9) {
        boolean z10;
        S0.a aVar = this.f6485e;
        try {
            if (!this.f6486f && getDatabaseName() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            aVar.a(z10);
            this.f6484d = false;
            SQLiteDatabase d9 = d(z9);
            if (this.f6484d) {
                close();
                Q0.a a5 = a(z9);
                aVar.b();
                return a5;
            }
            c h7 = AbstractC1570b.h(this.f6482b, d9);
            aVar.b();
            return h7;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        S0.a aVar = this.f6485e;
        try {
            aVar.a(aVar.f6702a);
            super.close();
            this.f6482b.f11404b = null;
            this.f6486f = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase d(boolean z9) {
        SQLiteDatabase readableDatabase;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z10 = this.f6486f;
        if (databaseName != null && !z10 && (parentFile = this.f6481a.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z9) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                kotlin.jvm.internal.h.b(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            kotlin.jvm.internal.h.b(readableDatabase2);
            return readableDatabase2;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z9) {
                    readableDatabase = getWritableDatabase();
                    kotlin.jvm.internal.h.b(readableDatabase);
                } else {
                    readableDatabase = getReadableDatabase();
                    kotlin.jvm.internal.h.b(readableDatabase);
                }
                return readableDatabase;
            } catch (Throwable th) {
                th = th;
                if (th instanceof e) {
                    e eVar = (e) th;
                    int ordinal = eVar.f6472a.ordinal();
                    th = eVar.f6473b;
                    if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3) {
                        if (ordinal == 4) {
                            if (!(th instanceof SQLiteException)) {
                                throw th;
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        throw th;
                    }
                }
                boolean z11 = th instanceof SQLiteException;
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db) {
        kotlin.jvm.internal.h.e(db, "db");
        boolean z9 = this.f6484d;
        Q0.b bVar = this.f6483c;
        if (!z9 && bVar.f6039b != db.getVersion()) {
            db.setMaxSqlCacheSize(1);
        }
        try {
            bVar.k(AbstractC1570b.h(this.f6482b, db));
        } catch (Throwable th) {
            throw new e(f.f6474a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        kotlin.jvm.internal.h.e(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f6483c.l(AbstractC1570b.h(this.f6482b, sqLiteDatabase));
        } catch (Throwable th) {
            throw new e(f.f6475b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db, int i9, int i10) {
        kotlin.jvm.internal.h.e(db, "db");
        this.f6484d = true;
        try {
            this.f6483c.n(AbstractC1570b.h(this.f6482b, db), i9, i10);
        } catch (Throwable th) {
            throw new e(f.f6477d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db) {
        kotlin.jvm.internal.h.e(db, "db");
        if (!this.f6484d) {
            try {
                this.f6483c.o(AbstractC1570b.h(this.f6482b, db));
            } catch (Throwable th) {
                throw new e(f.f6478e, th);
            }
        }
        this.f6486f = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i9, int i10) {
        kotlin.jvm.internal.h.e(sqLiteDatabase, "sqLiteDatabase");
        this.f6484d = true;
        try {
            this.f6483c.p(AbstractC1570b.h(this.f6482b, sqLiteDatabase), i9, i10);
        } catch (Throwable th) {
            throw new e(f.f6476c, th);
        }
    }
}
