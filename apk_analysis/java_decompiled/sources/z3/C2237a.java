package z3;

import l4.y;
import q3.q;
import q3.r;
import q3.s;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2237a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2238b f25367a;

    public C2237a(C2238b c2238b) {
        this.f25367a = c2238b;
    }

    @Override // q3.r
    public final boolean e() {
        return true;
    }

    @Override // q3.r
    public final q g(long j) {
        C2238b c2238b = this.f25367a;
        long j4 = c2238b.f25370c;
        long j9 = c2238b.f25369b;
        s sVar = new s(j, y.j(((((j4 - j9) * ((c2238b.f25371d.f25407i * j) / 1000000)) / c2238b.f25373f) + j9) - 30000, j9, j4 - 1));
        return new q(sVar, sVar);
    }

    @Override // q3.r
    public final long h() {
        return (this.f25367a.f25373f * 1000000) / r0.f25371d.f25407i;
    }
}
