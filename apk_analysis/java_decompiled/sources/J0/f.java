package J0;

import R0.j;
import kotlin.jvm.internal.h;
import s8.n;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: d, reason: collision with root package name */
    public final j f3597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Q0.a db, String sql) {
        super(db, sql);
        h.e(db, "db");
        h.e(sql, "sql");
        this.f3597d = db.q(sql);
    }

    @Override // P0.c
    public final long H(int i9) {
        a();
        n.y(21, "no row");
        throw null;
    }

    @Override // P0.c
    public final boolean R(int i9) {
        a();
        n.y(21, "no row");
        throw null;
    }

    @Override // P0.c
    public final String T(int i9) {
        a();
        n.y(21, "no row");
        throw null;
    }

    @Override // P0.c
    public final boolean W() {
        a();
        this.f3597d.f6494b.execute();
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f3597d.close();
        this.f3600c = true;
    }

    @Override // P0.c
    public final String i(int i9) {
        a();
        n.y(21, "no row");
        throw null;
    }

    @Override // P0.c
    public final int j() {
        a();
        return 0;
    }

    @Override // P0.c
    public final void reset() {
    }
}
