package X1;

import com.anilab.domain.model.Movie;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f8235b;

    public /* synthetic */ C(F f9, int i9) {
        this.f8234a = i9;
        this.f8235b = f9;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        Movie it = (Movie) obj;
        switch (this.f8234a) {
            case 0:
                if (it != null) {
                    this.f8235b.f8241d.z0(it);
                }
                return A7.n.f558a;
            default:
                kotlin.jvm.internal.h.e(it, "it");
                this.f8235b.f8241d.z0(it);
                return A7.n.f558a;
        }
    }
}
