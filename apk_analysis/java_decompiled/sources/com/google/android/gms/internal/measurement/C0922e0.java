package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0922e0 extends AbstractRunnableC0932g0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15467e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f15468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f15469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f15470h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0952k0 f15471i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0922e0(C0952k0 c0952k0, String str, String str2, Bundle bundle, boolean z9) {
        super(c0952k0, true);
        this.f15468f = str;
        this.f15469g = str2;
        this.j = bundle;
        this.f15470h = z9;
        this.f15471i = c0952k0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0932g0
    public final void a() {
        switch (this.f15467e) {
            case 0:
                J j = this.f15471i.f15520h;
                F4.y.h(j);
                j.getUserProperties(this.f15468f, this.f15469g, this.f15470h, (G) this.j);
                return;
            default:
                long j4 = this.f15488a;
                J j9 = this.f15471i.f15520h;
                F4.y.h(j9);
                j9.logEvent(this.f15468f, this.f15469g, (Bundle) this.j, this.f15470h, true, j4);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0932g0
    public void b() {
        switch (this.f15467e) {
            case 0:
                ((G) this.j).v0(null);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0922e0(C0952k0 c0952k0, String str, String str2, boolean z9, G g9) {
        super(c0952k0, true);
        this.f15468f = str;
        this.f15469g = str2;
        this.f15470h = z9;
        this.j = g9;
        this.f15471i = c0952k0;
    }
}
