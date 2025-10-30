package R0;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
public class i implements Q0.e, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f6493a;

    public i(SQLiteProgram delegate) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f6493a = delegate;
    }

    @Override // Q0.e
    public final void U(int i9, byte[] bArr) {
        this.f6493a.bindBlob(i9, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6493a.close();
    }

    @Override // Q0.e
    public final void m(int i9, String value) {
        kotlin.jvm.internal.h.e(value, "value");
        this.f6493a.bindString(i9, value);
    }

    @Override // Q0.e
    public final void t(int i9) {
        this.f6493a.bindNull(i9);
    }

    @Override // Q0.e
    public final void u(int i9, double d9) {
        this.f6493a.bindDouble(i9, d9);
    }

    @Override // Q0.e
    public final void z(long j, int i9) {
        this.f6493a.bindLong(i9, j);
    }
}
