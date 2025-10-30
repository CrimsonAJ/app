package X1;

import J1.P;
import Y7.y0;
import c1.C0753b;
import com.anilab.android.ui.home.HomeFragment;
import com.anilab.domain.model.Movie;
import d1.AbstractC1103i;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public final class p extends AbstractC1103i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8283a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8284b;

    public /* synthetic */ p(int i9, Object obj) {
        this.f8283a = i9;
        this.f8284b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    @Override // d1.AbstractC1103i
    public final void a(int i9) {
        switch (this.f8283a) {
            case 0:
                HomeFragment homeFragment = (HomeFragment) this.f8284b;
                if (i9 == 1) {
                    y0 y0Var = homeFragment.f13775I0;
                    if (y0Var != null) {
                        y0Var.d(null);
                        return;
                    }
                    return;
                }
                if (i9 == 0) {
                    int currentItem = ((P) homeFragment.e0()).f3747B.getCurrentItem();
                    H h7 = homeFragment.f13774H0;
                    if (h7 != null) {
                        if (currentItem == h7.f8246e.size() - 1) {
                            ((P) homeFragment.e0()).f3747B.b(1, false);
                        } else if (currentItem == 0) {
                            P p9 = (P) homeFragment.e0();
                            if (homeFragment.f13774H0 != null) {
                                p9.f3747B.b(r2.f8246e.size() - 2, false);
                            } else {
                                kotlin.jvm.internal.h.h("sliderAdapter");
                                throw null;
                            }
                        }
                    } else {
                        kotlin.jvm.internal.h.h("sliderAdapter");
                        throw null;
                    }
                }
                homeFragment.x0();
                return;
            case 1:
                ((C0753b) this.f8284b).b(false);
                return;
            default:
                try {
                    ArrayList arrayList = (ArrayList) this.f8284b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((AbstractC1103i) obj).a(i9);
                    }
                    return;
                } catch (ConcurrentModificationException e8) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e8);
                }
        }
    }

    @Override // d1.AbstractC1103i
    public void b(int i9, float f9, int i10) {
        switch (this.f8283a) {
            case 2:
                try {
                    ArrayList arrayList = (ArrayList) this.f8284b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((AbstractC1103i) obj).b(i9, f9, i10);
                    }
                    return;
                } catch (ConcurrentModificationException e8) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e8);
                }
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List, java.lang.Object] */
    @Override // d1.AbstractC1103i
    public final void c(int i9) {
        switch (this.f8283a) {
            case 0:
                HomeFragment homeFragment = (HomeFragment) this.f8284b;
                P p9 = (P) homeFragment.e0();
                H h7 = homeFragment.f13774H0;
                if (h7 != null) {
                    Movie movie = (Movie) h7.f8246e.get(i9);
                    p9.f3749D.setText(movie.f14416c);
                    p9.f3748C.setText(movie.a());
                    homeFragment.A0(i9);
                    return;
                }
                return;
            case 1:
                ((C0753b) this.f8284b).b(false);
                return;
            default:
                try {
                    ArrayList arrayList = (ArrayList) this.f8284b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((AbstractC1103i) obj).c(i9);
                    }
                    return;
                } catch (ConcurrentModificationException e8) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e8);
                }
        }
    }

    public p() {
        this.f8283a = 2;
        this.f8284b = new ArrayList(3);
    }
}
