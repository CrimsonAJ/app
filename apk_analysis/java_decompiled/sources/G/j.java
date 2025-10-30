package G;

import android.view.View;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.material.sidesheet.SideSheetBehavior;
import j3.C1441D;
import j3.C1445b;
import j3.C1447c;
import j3.SurfaceHolderCallbackC1438A;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2622c;

    public /* synthetic */ j(int i9, int i10, Object obj) {
        this.f2620a = i10;
        this.f2622c = obj;
        this.f2621b = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2620a) {
            case 0:
                ((b) this.f2622c).h(this.f2621b);
                return;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f2622c;
                View view = (View) sideSheetBehavior.f16105p.get();
                if (view != null) {
                    sideSheetBehavior.z(view, this.f2621b, false);
                    return;
                }
                return;
            default:
                C1447c c1447c = ((C1445b) this.f2622c).f19532b;
                c1447c.getClass();
                int i9 = 2;
                int i10 = 1;
                int i11 = this.f2621b;
                if (i11 != -3 && i11 != -2) {
                    if (i11 != -1) {
                        if (i11 != 1) {
                            AbstractC0953k1.v("Unknown focus change type: ", i11, "AudioFocusManager");
                            return;
                        }
                        c1447c.b(1);
                        SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A = c1447c.f19567c;
                        if (surfaceHolderCallbackC1438A != null) {
                            C1441D c1441d = surfaceHolderCallbackC1438A.f19226a;
                            c1441d.J0(1, 1, c1441d.m());
                            return;
                        }
                        return;
                    }
                    SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A2 = c1447c.f19567c;
                    if (surfaceHolderCallbackC1438A2 != null) {
                        C1441D c1441d2 = surfaceHolderCallbackC1438A2.f19226a;
                        boolean m9 = c1441d2.m();
                        if (!m9) {
                            i9 = 1;
                        }
                        c1441d2.J0(-1, i9, m9);
                    }
                    c1447c.a();
                    return;
                }
                if (i11 != -2) {
                    c1447c.b(3);
                    return;
                }
                SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A3 = c1447c.f19567c;
                if (surfaceHolderCallbackC1438A3 != null) {
                    C1441D c1441d3 = surfaceHolderCallbackC1438A3.f19226a;
                    boolean m10 = c1441d3.m();
                    if (m10) {
                        i10 = 2;
                    }
                    c1441d3.J0(0, i10, m10);
                }
                c1447c.b(2);
                return;
        }
    }
}
