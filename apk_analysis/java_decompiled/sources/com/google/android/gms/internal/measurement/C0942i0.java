package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* renamed from: com.google.android.gms.internal.measurement.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0942i0 extends AbstractRunnableC0932g0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f15500f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0947j0 f15501g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0942i0(C0947j0 c0947j0, Activity activity, int i9) {
        super(c0947j0.f15508a, true);
        this.f15499e = i9;
        switch (i9) {
            case 1:
                this.f15500f = activity;
                this.f15501g = c0947j0;
                super(c0947j0.f15508a, true);
                return;
            case 2:
                this.f15500f = activity;
                this.f15501g = c0947j0;
                super(c0947j0.f15508a, true);
                return;
            case 3:
                this.f15500f = activity;
                this.f15501g = c0947j0;
                super(c0947j0.f15508a, true);
                return;
            case 4:
                this.f15500f = activity;
                this.f15501g = c0947j0;
                super(c0947j0.f15508a, true);
                return;
            default:
                this.f15500f = activity;
                this.f15501g = c0947j0;
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0932g0
    public final void a() {
        switch (this.f15499e) {
            case 0:
                J j = this.f15501g.f15508a.f15520h;
                F4.y.h(j);
                j.onActivityStartedByScionActivityInfo(W.f(this.f15500f), this.f15489b);
                return;
            case 1:
                J j4 = this.f15501g.f15508a.f15520h;
                F4.y.h(j4);
                j4.onActivityResumedByScionActivityInfo(W.f(this.f15500f), this.f15489b);
                return;
            case 2:
                J j9 = this.f15501g.f15508a.f15520h;
                F4.y.h(j9);
                j9.onActivityPausedByScionActivityInfo(W.f(this.f15500f), this.f15489b);
                return;
            case 3:
                J j10 = this.f15501g.f15508a.f15520h;
                F4.y.h(j10);
                j10.onActivityStoppedByScionActivityInfo(W.f(this.f15500f), this.f15489b);
                return;
            default:
                J j11 = this.f15501g.f15508a.f15520h;
                F4.y.h(j11);
                j11.onActivityDestroyedByScionActivityInfo(W.f(this.f15500f), this.f15489b);
                return;
        }
    }
}
