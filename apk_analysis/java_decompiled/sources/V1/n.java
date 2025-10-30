package V1;

import B7.t;
import M1.r;
import O2.C0286l;
import b8.AbstractC0714M;
import b8.C0709H;
import b8.C0718Q;
import com.anilab.domain.model.FilterConfig;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends r {

    /* renamed from: f, reason: collision with root package name */
    public final C0286l f7644f;

    /* renamed from: g, reason: collision with root package name */
    public final C0718Q f7645g;

    /* renamed from: h, reason: collision with root package name */
    public final C0709H f7646h;

    /* renamed from: i, reason: collision with root package name */
    public final C0718Q f7647i;

    public n(C0286l filterUseCase) {
        kotlin.jvm.internal.h.e(filterUseCase, "filterUseCase");
        this.f7644f = filterUseCase;
        C0718Q c3 = AbstractC0714M.c(t.f1135a);
        this.f7645g = c3;
        this.f7646h = new C0709H(c3);
        this.f7647i = AbstractC0714M.c(new M1.t(Boolean.FALSE));
    }

    public final void g(int i9, FilterConfig filterConfig, FilterConfig filterConfig2, FilterConfig filterConfig3, List list) {
        d(true, new m(this, i9, filterConfig3, filterConfig2, filterConfig, list, null));
    }
}
