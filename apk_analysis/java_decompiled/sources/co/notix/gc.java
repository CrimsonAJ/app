package co.notix;

import co.notix.interstitial.InterstitialButton;

/* loaded from: classes.dex */
public final class gc implements fc {

    /* renamed from: a, reason: collision with root package name */
    public final i f12305a;

    /* renamed from: b, reason: collision with root package name */
    public final InterstitialButton f12306b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12307c;

    /* renamed from: d, reason: collision with root package name */
    public final O7.a f12308d;

    /* renamed from: e, reason: collision with root package name */
    public final O7.a f12309e;

    /* renamed from: f, reason: collision with root package name */
    public final O7.l f12310f;

    public gc(i model, InterstitialButton interstitialButton, boolean z9, O7.a aVar, O7.a aVar2, O7.l lVar) {
        kotlin.jvm.internal.h.e(model, "model");
        this.f12305a = model;
        this.f12306b = interstitialButton;
        this.f12307c = z9;
        this.f12308d = aVar;
        this.f12309e = aVar2;
        this.f12310f = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        if (kotlin.jvm.internal.h.a(this.f12305a, gcVar.f12305a) && kotlin.jvm.internal.h.a(this.f12306b, gcVar.f12306b) && this.f12307c == gcVar.f12307c && kotlin.jvm.internal.h.a(this.f12308d, gcVar.f12308d) && kotlin.jvm.internal.h.a(this.f12309e, gcVar.f12309e) && kotlin.jvm.internal.h.a(this.f12310f, gcVar.f12310f)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f12305a.hashCode() * 31;
        InterstitialButton interstitialButton = this.f12306b;
        int i9 = 0;
        if (interstitialButton == null) {
            hashCode = 0;
        } else {
            hashCode = interstitialButton.hashCode();
        }
        int i10 = (hashCode4 + hashCode) * 31;
        boolean z9 = this.f12307c;
        int i11 = z9;
        if (z9 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        O7.a aVar = this.f12308d;
        if (aVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aVar.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        O7.a aVar2 = this.f12309e;
        if (aVar2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = aVar2.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        O7.l lVar = this.f12310f;
        if (lVar != null) {
            i9 = lVar.hashCode();
        }
        return i14 + i9;
    }

    public final String toString() {
        return "InterstitialStartParamBmp(model=" + this.f12305a + ", interstitialButton=" + this.f12306b + ", closeOnClick=" + this.f12307c + ", onClick=" + this.f12308d + ", onDismiss=" + this.f12309e + ", onShowError=" + this.f12310f + ')';
    }
}
