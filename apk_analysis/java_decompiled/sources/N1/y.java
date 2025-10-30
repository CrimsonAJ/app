package N1;

import O2.C0280f;
import O2.D;
import O2.E;
import O2.a0;
import b8.AbstractC0714M;
import b8.C0718Q;
import com.anilab.domain.model.Shortcut;
import java.util.Collection;

/* loaded from: classes.dex */
public final class y extends M1.r {

    /* renamed from: f, reason: collision with root package name */
    public final D f4884f;

    /* renamed from: g, reason: collision with root package name */
    public final C0280f f4885g;

    /* renamed from: h, reason: collision with root package name */
    public final a0 f4886h;

    /* renamed from: i, reason: collision with root package name */
    public final E f4887i;
    public final P2.e j;

    /* renamed from: k, reason: collision with root package name */
    public final C0718Q f4888k;

    /* renamed from: l, reason: collision with root package name */
    public final C0718Q f4889l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4890m;

    public y(D getListUseCase, C0280f addToWatchListUseCase, a0 removeFromWatchListUseCase, E getLocalWatchListUseCase, P2.e checkLoginUserCase) {
        kotlin.jvm.internal.h.e(getListUseCase, "getListUseCase");
        kotlin.jvm.internal.h.e(addToWatchListUseCase, "addToWatchListUseCase");
        kotlin.jvm.internal.h.e(removeFromWatchListUseCase, "removeFromWatchListUseCase");
        kotlin.jvm.internal.h.e(getLocalWatchListUseCase, "getLocalWatchListUseCase");
        kotlin.jvm.internal.h.e(checkLoginUserCase, "checkLoginUserCase");
        this.f4884f = getListUseCase;
        this.f4885g = addToWatchListUseCase;
        this.f4886h = removeFromWatchListUseCase;
        this.f4887i = getLocalWatchListUseCase;
        this.j = checkLoginUserCase;
        this.f4888k = AbstractC0714M.c(B7.t.f1135a);
        this.f4889l = AbstractC0714M.c(new M1.t(Boolean.FALSE));
    }

    public final void g(Shortcut shortcut, int i9, boolean z9) {
        boolean z10;
        if (i9 == 1 && !((Collection) this.f4888k.h()).isEmpty() && !z9) {
            return;
        }
        if (i9 > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f4890m = z10;
        d(true, new w(this, shortcut, i9, null));
    }
}
