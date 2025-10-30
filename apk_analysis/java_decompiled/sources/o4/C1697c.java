package o4;

import com.google.android.flexbox.FlexboxLayoutManager;

/* renamed from: o4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1697c {

    /* renamed from: a, reason: collision with root package name */
    public int f21610a;

    /* renamed from: b, reason: collision with root package name */
    public int f21611b;

    /* renamed from: c, reason: collision with root package name */
    public int f21612c;

    /* renamed from: d, reason: collision with root package name */
    public int f21613d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f21614e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21615f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21616g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ FlexboxLayoutManager f21617h;

    public C1697c(FlexboxLayoutManager flexboxLayoutManager) {
        this.f21617h = flexboxLayoutManager;
    }

    public static void a(C1697c c1697c) {
        int m9;
        int m10;
        FlexboxLayoutManager flexboxLayoutManager = c1697c.f21617h;
        if (!flexboxLayoutManager.c1() && flexboxLayoutManager.f14537t) {
            if (c1697c.f21614e) {
                m10 = flexboxLayoutManager.f14522B.i();
            } else {
                m10 = flexboxLayoutManager.f10349n - flexboxLayoutManager.f14522B.m();
            }
            c1697c.f21612c = m10;
            return;
        }
        if (c1697c.f21614e) {
            m9 = flexboxLayoutManager.f14522B.i();
        } else {
            m9 = flexboxLayoutManager.f14522B.m();
        }
        c1697c.f21612c = m9;
    }

    public static void b(C1697c c1697c) {
        c1697c.f21610a = -1;
        c1697c.f21611b = -1;
        c1697c.f21612c = Integer.MIN_VALUE;
        boolean z9 = false;
        c1697c.f21615f = false;
        c1697c.f21616g = false;
        FlexboxLayoutManager flexboxLayoutManager = c1697c.f21617h;
        if (flexboxLayoutManager.c1()) {
            int i9 = flexboxLayoutManager.f14534q;
            if (i9 == 0) {
                if (flexboxLayoutManager.f14533p == 1) {
                    z9 = true;
                }
                c1697c.f21614e = z9;
                return;
            } else {
                if (i9 == 2) {
                    z9 = true;
                }
                c1697c.f21614e = z9;
                return;
            }
        }
        int i10 = flexboxLayoutManager.f14534q;
        if (i10 == 0) {
            if (flexboxLayoutManager.f14533p == 3) {
                z9 = true;
            }
            c1697c.f21614e = z9;
        } else {
            if (i10 == 2) {
                z9 = true;
            }
            c1697c.f21614e = z9;
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f21610a + ", mFlexLinePosition=" + this.f21611b + ", mCoordinate=" + this.f21612c + ", mPerpendicularCoordinate=" + this.f21613d + ", mLayoutFromEnd=" + this.f21614e + ", mValid=" + this.f21615f + ", mAssignedFromSavedState=" + this.f21616g + '}';
    }
}
