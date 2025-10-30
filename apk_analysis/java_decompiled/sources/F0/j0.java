package F0;

import J1.AbstractC0200s0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c1.C0753b;
import co.notix.R;
import com.anilab.android.ui.releaseCalendar.ReleaseCalendarFragment;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j0 extends U {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2133b;

    public /* synthetic */ j0(int i9, Object obj) {
        this.f2132a = i9;
        this.f2133b = obj;
    }

    @Override // F0.U
    public final void a() {
        LinearLayoutManager linearLayoutManager;
        switch (this.f2132a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f2133b;
                recyclerView.k(null);
                recyclerView.f10250F0.f2169f = true;
                recyclerView.Z(true);
                if (!recyclerView.f10275e.j()) {
                    recyclerView.requestLayout();
                    return;
                }
                return;
            case 1:
                ((J5.k) this.f2133b).d();
                return;
            case 2:
                ((C0753b) this.f2133b).b(true);
                return;
            default:
                ReleaseCalendarFragment releaseCalendarFragment = (ReleaseCalendarFragment) this.f2133b;
                releaseCalendarFragment.s0().f2055a.unregisterObserver(this);
                androidx.recyclerview.widget.a layoutManager = ((AbstractC0200s0) releaseCalendarFragment.e0()).f4076x.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager;
                } else {
                    linearLayoutManager = null;
                }
                if (linearLayoutManager != null) {
                    linearLayoutManager.k1(releaseCalendarFragment.s0().f19881f, (((AbstractC0200s0) releaseCalendarFragment.e0()).f4076x.getMeasuredWidth() / 2) - releaseCalendarFragment.q().getDimensionPixelOffset(R.dimen.dp_33));
                    return;
                }
                return;
        }
    }

    @Override // F0.U
    public void b() {
        switch (this.f2132a) {
            case 1:
                ((J5.k) this.f2133b).d();
                return;
            case 2:
                a();
                return;
            default:
                return;
        }
    }

    @Override // F0.U
    public void c(int i9, int i10, Object obj) {
        switch (this.f2132a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f2133b;
                recyclerView.k(null);
                C0096b c0096b = recyclerView.f10275e;
                if (i10 < 1) {
                    c0096b.getClass();
                    return;
                }
                ArrayList arrayList = (ArrayList) c0096b.f2072c;
                arrayList.add(c0096b.l(obj, 4, i9, i10));
                c0096b.f2070a |= 4;
                if (arrayList.size() == 1) {
                    g();
                    return;
                }
                return;
            case 1:
                ((J5.k) this.f2133b).d();
                return;
            case 2:
                a();
                return;
            default:
                super.c(i9, i10, obj);
                return;
        }
    }

    @Override // F0.U
    public void d(int i9, int i10) {
        switch (this.f2132a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f2133b;
                recyclerView.k(null);
                C0096b c0096b = recyclerView.f10275e;
                if (i10 < 1) {
                    c0096b.getClass();
                    return;
                }
                ArrayList arrayList = (ArrayList) c0096b.f2072c;
                arrayList.add(c0096b.l(null, 1, i9, i10));
                c0096b.f2070a |= 1;
                if (arrayList.size() == 1) {
                    g();
                    return;
                }
                return;
            case 1:
                ((J5.k) this.f2133b).d();
                return;
            case 2:
                a();
                return;
            default:
                return;
        }
    }

    @Override // F0.U
    public void e(int i9, int i10) {
        switch (this.f2132a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f2133b;
                recyclerView.k(null);
                C0096b c0096b = recyclerView.f10275e;
                c0096b.getClass();
                if (i9 != i10) {
                    ArrayList arrayList = (ArrayList) c0096b.f2072c;
                    arrayList.add(c0096b.l(null, 8, i9, i10));
                    c0096b.f2070a |= 8;
                    if (arrayList.size() == 1) {
                        g();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((J5.k) this.f2133b).d();
                return;
            case 2:
                a();
                return;
            default:
                return;
        }
    }

    @Override // F0.U
    public void f(int i9, int i10) {
        switch (this.f2132a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f2133b;
                recyclerView.k(null);
                C0096b c0096b = recyclerView.f10275e;
                if (i10 < 1) {
                    c0096b.getClass();
                    return;
                }
                ArrayList arrayList = (ArrayList) c0096b.f2072c;
                arrayList.add(c0096b.l(null, 2, i9, i10));
                c0096b.f2070a |= 2;
                if (arrayList.size() == 1) {
                    g();
                    return;
                }
                return;
            case 1:
                ((J5.k) this.f2133b).d();
                return;
            case 2:
                a();
                return;
            default:
                return;
        }
    }

    public void g() {
        RecyclerView recyclerView = (RecyclerView) this.f2133b;
        if (recyclerView.f10302t && recyclerView.f10300s) {
            WeakHashMap weakHashMap = P.Q.f5546a;
            recyclerView.postOnAnimation(recyclerView.f10282i);
        } else {
            recyclerView.f10241A = true;
            recyclerView.requestLayout();
        }
    }
}
