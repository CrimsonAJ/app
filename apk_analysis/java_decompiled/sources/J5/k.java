package J5;

import A6.t;
import C3.v;
import F0.S;
import U3.C0394a;
import android.text.TextUtils;
import androidx.viewpager2.widget.ViewPager2;
import co.notix.R;
import com.anilab.android.ui.mal.MalSyncFragment;
import com.google.android.material.tabs.TabLayout;
import i8.C1416f;
import i8.C1417g;
import i8.K;
import i8.L;
import i8.M;
import java.io.IOException;
import q8.A;
import q8.C1918a;
import x8.G;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4223a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4224b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4225c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4226d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4227e;

    public k(n8.g call, C0394a finder, o8.b bVar) {
        kotlin.jvm.internal.h.e(call, "call");
        kotlin.jvm.internal.h.e(finder, "finder");
        this.f4224b = call;
        this.f4225c = finder;
        this.f4226d = bVar;
        this.f4227e = bVar.h();
    }

    public void a() {
        synchronized (((C1417g) this.f4227e)) {
            if (this.f4223a) {
                return;
            }
            this.f4223a = true;
            k8.c.d((G) this.f4225c);
            try {
                ((t) this.f4224b).a();
            } catch (IOException unused) {
            }
        }
    }

    public IOException b(boolean z9, boolean z10, IOException iOException) {
        if (iOException != null) {
            f(iOException);
        }
        n8.g call = (n8.g) this.f4224b;
        if (z10) {
            if (iOException != null) {
                kotlin.jvm.internal.h.e(call, "call");
            } else {
                kotlin.jvm.internal.h.e(call, "call");
            }
        }
        if (z9) {
            if (iOException != null) {
                kotlin.jvm.internal.h.e(call, "call");
            } else {
                kotlin.jvm.internal.h.e(call, "call");
            }
        }
        return call.k(this, z10, z9, iOException);
    }

    public M c(L l9) {
        o8.b bVar = (o8.b) this.f4226d;
        try {
            String d9 = L.d(l9, "Content-Type");
            long e8 = bVar.e(l9);
            return new M(d9, e8, v4.e.b(new n8.c(this, bVar.f(l9), e8)), 1);
        } catch (IOException e9) {
            n8.g call = (n8.g) this.f4224b;
            kotlin.jvm.internal.h.e(call, "call");
            f(e9);
            throw e9;
        }
    }

    public void d() {
        int i9;
        TabLayout tabLayout = (TabLayout) this.f4224b;
        tabLayout.j();
        S s9 = (S) this.f4227e;
        if (s9 != null) {
            int a5 = s9.a();
            int i10 = 0;
            while (true) {
                boolean z9 = true;
                if (i10 >= a5) {
                    break;
                }
                f i11 = tabLayout.i();
                MalSyncFragment malSyncFragment = (MalSyncFragment) ((v) this.f4226d).f1562b;
                if (i10 == 0) {
                    i9 = R.string.label_import;
                } else {
                    i9 = R.string.label_export;
                }
                String r5 = malSyncFragment.r(i9);
                if (TextUtils.isEmpty(i11.f4200c) && !TextUtils.isEmpty(r5)) {
                    i11.f4204g.setContentDescription(r5);
                }
                i11.f4199b = r5;
                h hVar = i11.f4204g;
                if (hVar != null) {
                    hVar.e();
                    f fVar = hVar.f4208a;
                    if (fVar == null || !fVar.a()) {
                        z9 = false;
                    }
                    hVar.setSelected(z9);
                }
                tabLayout.b(i11, false);
                i10++;
            }
            if (a5 > 0) {
                int min = Math.min(((ViewPager2) this.f4225c).getCurrentItem(), tabLayout.getTabCount() - 1);
                if (min != tabLayout.getSelectedTabPosition()) {
                    tabLayout.k(tabLayout.h(min), true);
                }
            }
        }
    }

    public K e(boolean z9) {
        try {
            K g9 = ((o8.b) this.f4226d).g(z9);
            if (g9 != null) {
                g9.f19028m = this;
            }
            return g9;
        } catch (IOException e8) {
            n8.g call = (n8.g) this.f4224b;
            kotlin.jvm.internal.h.e(call, "call");
            f(e8);
            throw e8;
        }
    }

    public void f(IOException iOException) {
        boolean z9;
        this.f4223a = true;
        ((C0394a) this.f4225c).e(iOException);
        n8.i h7 = ((o8.b) this.f4226d).h();
        n8.g call = (n8.g) this.f4224b;
        synchronized (h7) {
            try {
                kotlin.jvm.internal.h.e(call, "call");
                if (iOException instanceof A) {
                    if (((A) iOException).f22446a == 8) {
                        int i9 = h7.f21288n + 1;
                        h7.f21288n = i9;
                        if (i9 > 1) {
                            h7.j = true;
                            h7.f21286l++;
                        }
                    } else if (((A) iOException).f22446a != 9 || !call.f21273m) {
                        h7.j = true;
                        h7.f21286l++;
                    }
                } else {
                    if (h7.f21282g != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9 || (iOException instanceof C1918a)) {
                        h7.j = true;
                        if (h7.f21287m == 0) {
                            n8.i.d(call.f21262a, h7.f21277b, iOException);
                            h7.f21286l++;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public k(TabLayout tabLayout, ViewPager2 viewPager2, v vVar) {
        this.f4224b = tabLayout;
        this.f4225c = viewPager2;
        this.f4226d = vVar;
    }

    public k(C1417g c1417g, t tVar) {
        this.f4227e = c1417g;
        this.f4224b = tVar;
        G j = tVar.j(1);
        this.f4225c = j;
        this.f4226d = new C1416f(c1417g, this, j);
    }
}
