package l2;

import B7.t;
import M1.r;
import O2.N;
import O2.d0;
import Y7.y0;
import b8.AbstractC0714M;
import b8.C0708G;
import b8.C0718Q;
import java.util.ArrayList;

/* renamed from: l2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1549n extends r {

    /* renamed from: f, reason: collision with root package name */
    public final N f20216f;

    /* renamed from: g, reason: collision with root package name */
    public final d0 f20217g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f20218h;

    /* renamed from: i, reason: collision with root package name */
    public final C0718Q f20219i;
    public final C0708G j;

    /* renamed from: k, reason: collision with root package name */
    public final C0718Q f20220k;

    /* renamed from: l, reason: collision with root package name */
    public y0 f20221l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20222m;

    public C1549n(N topSearchUseCase, d0 searchUseCase) {
        kotlin.jvm.internal.h.e(topSearchUseCase, "topSearchUseCase");
        kotlin.jvm.internal.h.e(searchUseCase, "searchUseCase");
        this.f20216f = topSearchUseCase;
        this.f20217g = searchUseCase;
        this.f20218h = new ArrayList();
        C0718Q c3 = AbstractC0714M.c(new A7.h(Boolean.TRUE, t.f1135a));
        this.f20219i = c3;
        this.j = new C0708G(c3);
        this.f20220k = AbstractC0714M.c(new M1.t(Boolean.FALSE));
        this.f20222m = false;
        y0 y0Var = this.f20221l;
        if (y0Var != null) {
            y0Var.d(null);
        }
        this.f20221l = d(true, new C1546k(this, null));
    }

    public final void g(int i9, String keyword) {
        kotlin.jvm.internal.h.e(keyword, "keyword");
        boolean z9 = true;
        if (i9 <= 1) {
            z9 = false;
        }
        this.f20222m = z9;
        y0 y0Var = this.f20221l;
        if (y0Var != null) {
            y0Var.d(null);
        }
        this.f20221l = d(false, new C1548m(i9, null, keyword, this));
    }
}
