package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class Z extends AbstractRunnableC0932g0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15422e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f15423f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f15424g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0952k0 f15425h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f15426i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(C0952k0 c0952k0, String str, String str2, Object obj, int i9) {
        super(c0952k0, true);
        this.f15422e = i9;
        this.f15423f = str;
        this.f15424g = str2;
        this.f15426i = obj;
        this.f15425h = c0952k0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0932g0
    public final void a() {
        switch (this.f15422e) {
            case 0:
                J j = this.f15425h.f15520h;
                F4.y.h(j);
                j.clearConditionalUserProperty(this.f15423f, this.f15424g, (Bundle) this.f15426i);
                return;
            case 1:
                J j4 = this.f15425h.f15520h;
                F4.y.h(j4);
                j4.getConditionalUserProperties(this.f15423f, this.f15424g, (G) this.f15426i);
                return;
            default:
                J j9 = this.f15425h.f15520h;
                F4.y.h(j9);
                j9.setCurrentScreenByScionActivityInfo((W) this.f15426i, this.f15423f, this.f15424g, this.f15488a);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0932g0
    public void b() {
        switch (this.f15422e) {
            case 1:
                ((G) this.f15426i).v0(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C0952k0 c0952k0, W w7, String str, String str2) {
        super(c0952k0, true);
        this.f15422e = 2;
        this.f15426i = w7;
        this.f15423f = str;
        this.f15424g = str2;
        this.f15425h = c0952k0;
    }
}
