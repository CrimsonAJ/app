package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.measurement.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0902a0 extends AbstractRunnableC0932g0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15435f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f15436g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f15437h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0902a0(C0952k0 c0952k0, Object obj, Object obj2, int i9) {
        super(c0952k0, true);
        this.f15434e = i9;
        this.f15436g = obj;
        this.f15437h = obj2;
        this.f15435f = c0952k0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0932g0
    public final void a() {
        J j;
        boolean z9;
        Bundle bundle;
        switch (this.f15434e) {
            case 0:
                try {
                    C0952k0 c0952k0 = (C0952k0) this.f15435f;
                    c0952k0.getClass();
                    Context context = (Context) this.f15436g;
                    F4.y.h(context);
                    try {
                        j = I.asInterface(O4.f.c(context, O4.f.f5463c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (O4.b e8) {
                        c0952k0.a(e8, true, false);
                        j = null;
                    }
                    c0952k0.f15520h = j;
                    if (c0952k0.f15520h == null) {
                        Log.w(c0952k0.f15513a, "Failed to connect to measurement client.");
                        return;
                    }
                    int a5 = O4.f.a(context, ModuleDescriptor.MODULE_ID);
                    int d9 = O4.f.d(context, ModuleDescriptor.MODULE_ID, false);
                    int max = Math.max(a5, d9);
                    if (d9 < a5) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    U u9 = new U(119002L, max, z9, null, null, null, (Bundle) this.f15437h, b5.D0.b(context));
                    J j4 = c0952k0.f15520h;
                    F4.y.h(j4);
                    j4.initialize(new N4.b(context), u9, this.f15488a);
                    return;
                } catch (Exception e9) {
                    ((C0952k0) this.f15435f).a(e9, true, false);
                    return;
                }
            case 1:
                J j9 = ((C0952k0) this.f15435f).f15520h;
                F4.y.h(j9);
                j9.getMaxUserProperties((String) this.f15436g, (G) this.f15437h);
                return;
            case 2:
                Bundle bundle2 = (Bundle) this.f15437h;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                J j10 = ((C0947j0) this.f15435f).f15508a.f15520h;
                F4.y.h(j10);
                j10.onActivityCreatedByScionActivityInfo(W.f((Activity) this.f15436g), bundle, this.f15489b);
                return;
            default:
                J j11 = ((C0947j0) this.f15435f).f15508a.f15520h;
                F4.y.h(j11);
                j11.onActivitySaveInstanceStateByScionActivityInfo(W.f((Activity) this.f15436g), (G) this.f15437h, this.f15489b);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0932g0
    public void b() {
        switch (this.f15434e) {
            case 1:
                ((G) this.f15437h).v0(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0902a0(C0947j0 c0947j0, Activity activity, G g9) {
        super(c0947j0.f15508a, true);
        this.f15434e = 3;
        this.f15436g = activity;
        this.f15437h = g9;
        this.f15435f = c0947j0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0902a0(C0947j0 c0947j0, Bundle bundle, Activity activity) {
        super(c0947j0.f15508a, true);
        this.f15434e = 2;
        this.f15437h = bundle;
        this.f15436g = activity;
        this.f15435f = c0947j0;
    }
}
