package R0;

import C2.P;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class c implements Q0.a, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f6466b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f6467c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f6468d;

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f6469a;

    static {
        A7.f fVar = A7.f.f545a;
        f6467c = Z0.a.p(fVar, new P(4));
        f6468d = Z0.a.p(fVar, new P(5));
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        this.f6469a = sQLiteDatabase;
    }

    @Override // Q0.a
    public final boolean B() {
        return this.f6469a.inTransaction();
    }

    @Override // Q0.a
    public final boolean J() {
        return this.f6469a.isWriteAheadLoggingEnabled();
    }

    @Override // Q0.a
    public final void L(Object[] objArr) {
        this.f6469a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // Q0.a
    public final void M() {
        this.f6469a.setTransactionSuccessful();
    }

    @Override // Q0.a
    public final void P() {
        this.f6469a.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6469a.close();
    }

    @Override // Q0.a
    public final void e() {
        this.f6469a.endTransaction();
    }

    @Override // Q0.a
    public final void f() {
        this.f6469a.beginTransaction();
    }

    @Override // Q0.a
    public final boolean isOpen() {
        return this.f6469a.isOpen();
    }

    @Override // Q0.a
    public final void l(String sql) {
        kotlin.jvm.internal.h.e(sql, "sql");
        this.f6469a.execSQL(sql);
    }

    @Override // Q0.a
    public final j q(String sql) {
        kotlin.jvm.internal.h.e(sql, "sql");
        SQLiteStatement compileStatement = this.f6469a.compileStatement(sql);
        kotlin.jvm.internal.h.d(compileStatement, "compileStatement(...)");
        return new j(compileStatement);
    }

    @Override // Q0.a
    public final Cursor r(Q0.f fVar) {
        final a aVar = new a(fVar);
        Cursor rawQueryWithFactory = this.f6469a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: R0.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) a.this.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, fVar.d(), f6466b, null);
        kotlin.jvm.internal.h.d(rawQueryWithFactory, "rawQueryWithFactory(...)");
        return rawQueryWithFactory;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [A7.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [A7.e, java.lang.Object] */
    @Override // Q0.a
    public final void w() {
        ?? r1 = f6468d;
        if (((Method) r1.getValue()) != null) {
            ?? r22 = f6467c;
            if (((Method) r22.getValue()) != null) {
                Method method = (Method) r1.getValue();
                kotlin.jvm.internal.h.b(method);
                Method method2 = (Method) r22.getValue();
                kotlin.jvm.internal.h.b(method2);
                Object invoke = method2.invoke(this.f6469a, null);
                if (invoke != null) {
                    method.invoke(invoke, 0, null, 0, null);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        f();
    }
}
