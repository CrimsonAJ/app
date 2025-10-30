package v3;

import F0.C0104h;
import q3.q;
import q3.r;
import q3.s;

/* renamed from: v3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2106c implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f23775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0104h f23776b;

    public C2106c(C0104h c0104h, r rVar) {
        this.f23776b = c0104h;
        this.f23775a = rVar;
    }

    @Override // q3.r
    public final boolean e() {
        return this.f23775a.e();
    }

    @Override // q3.r
    public final q g(long j) {
        q g9 = this.f23775a.g(j);
        s sVar = g9.f22342a;
        long j4 = sVar.f22345a;
        long j9 = sVar.f22346b;
        long j10 = this.f23776b.f2114b;
        s sVar2 = new s(j4, j9 + j10);
        s sVar3 = g9.f22343b;
        return new q(sVar2, new s(sVar3.f22345a, sVar3.f22346b + j10));
    }

    @Override // q3.r
    public final long h() {
        return this.f23775a.h();
    }
}
