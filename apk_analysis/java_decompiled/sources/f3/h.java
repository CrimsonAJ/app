package f3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import b3.EnumC0602c;
import c7.C0784d;
import g3.InterfaceC1251b;
import h3.InterfaceC1276a;
import i3.AbstractC1379a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import z7.InterfaceC2251a;

/* loaded from: classes.dex */
public final class h implements d, g3.c, c, AutoCloseable {

    /* renamed from: f, reason: collision with root package name */
    public static final V2.c f17344f = new V2.c("proto");

    /* renamed from: a, reason: collision with root package name */
    public final j f17345a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1276a f17346b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1276a f17347c;

    /* renamed from: d, reason: collision with root package name */
    public final C1162a f17348d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2251a f17349e;

    public h(InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2, C1162a c1162a, j jVar, InterfaceC2251a interfaceC2251a) {
        this.f17345a = jVar;
        this.f17346b = interfaceC1276a;
        this.f17347c = interfaceC1276a2;
        this.f17348d = c1162a;
        this.f17349e = interfaceC2251a;
    }

    public static String I(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((b) it.next()).f17337a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object N(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long d(SQLiteDatabase sQLiteDatabase, Y2.j jVar) {
        Long valueOf;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jVar.f8629a, String.valueOf(AbstractC1379a.a(jVar.f8631c))));
        byte[] bArr = jVar.f8630b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public final Object F(InterfaceC1251b interfaceC1251b) {
        SQLiteDatabase a5 = a();
        InterfaceC1276a interfaceC1276a = this.f17347c;
        long l9 = interfaceC1276a.l();
        while (true) {
            try {
                a5.beginTransaction();
                try {
                    Object f9 = interfaceC1251b.f();
                    a5.setTransactionSuccessful();
                    return f9;
                } finally {
                    a5.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e8) {
                if (interfaceC1276a.l() < this.f17348d.f17334c + l9) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e8);
                }
            }
        }
    }

    public final SQLiteDatabase a() {
        j jVar = this.f17345a;
        Objects.requireNonNull(jVar);
        InterfaceC1276a interfaceC1276a = this.f17347c;
        long l9 = interfaceC1276a.l();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e8) {
                if (interfaceC1276a.l() < this.f17348d.f17334c + l9) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e8);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17345a.close();
    }

    public final Object g(f fVar) {
        SQLiteDatabase a5 = a();
        a5.beginTransaction();
        try {
            Object apply = fVar.apply(a5);
            a5.setTransactionSuccessful();
            return apply;
        } finally {
            a5.endTransaction();
        }
    }

    public final ArrayList s(SQLiteDatabase sQLiteDatabase, Y2.j jVar, int i9) {
        ArrayList arrayList = new ArrayList();
        Long d9 = d(sQLiteDatabase, jVar);
        if (d9 == null) {
            return arrayList;
        }
        N(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{d9.toString()}, null, null, null, String.valueOf(i9)), new C0784d(this, arrayList, jVar, 6));
        return arrayList;
    }

    public final void x(long j, EnumC0602c enumC0602c, String str) {
        g(new d7.f(str, enumC0602c, j));
    }
}
