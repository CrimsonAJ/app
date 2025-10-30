package R3;

import P5.F;
import j3.M;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends m implements Q3.i {

    /* renamed from: f, reason: collision with root package name */
    public final n f6628f;

    public k(M m9, F f9, n nVar, ArrayList arrayList) {
        super(m9, f9, nVar, arrayList);
        this.f6628f = nVar;
    }

    @Override // Q3.i
    public final long A(long j, long j4) {
        return this.f6628f.b(j, j4);
    }

    @Override // R3.m
    public final String a() {
        return null;
    }

    @Override // Q3.i
    public final long c(long j) {
        return this.f6628f.g(j);
    }

    @Override // Q3.i
    public final long d(long j, long j4) {
        return this.f6628f.f(j, j4);
    }

    @Override // R3.m
    public final j e() {
        return null;
    }

    @Override // Q3.i
    public final long h(long j, long j4) {
        return this.f6628f.e(j, j4);
    }

    @Override // Q3.i
    public final long k(long j, long j4) {
        return this.f6628f.c(j, j4);
    }

    @Override // Q3.i
    public final long o(long j, long j4) {
        n nVar = this.f6628f;
        if (nVar.f6638f != null) {
            return -9223372036854775807L;
        }
        long b9 = nVar.b(j, j4) + nVar.c(j, j4);
        return (nVar.e(b9, j) + nVar.g(b9)) - nVar.f6641i;
    }

    @Override // Q3.i
    public final j p(long j) {
        return this.f6628f.h(this, j);
    }

    @Override // Q3.i
    public final boolean q() {
        return this.f6628f.i();
    }

    @Override // Q3.i
    public final long v() {
        return this.f6628f.f6636d;
    }

    @Override // Q3.i
    public final long z(long j) {
        return this.f6628f.d(j);
    }

    @Override // R3.m
    public final Q3.i b() {
        return this;
    }
}
