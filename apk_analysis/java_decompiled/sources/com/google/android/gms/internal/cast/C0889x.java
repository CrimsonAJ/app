package com.google.android.gms.internal.cast;

import f5.C1177i;
import f5.InterfaceC1172d;
import f5.InterfaceC1173e;

/* renamed from: com.google.android.gms.internal.cast.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0889x implements InterfaceC1173e, InterfaceC1172d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1177i f15097a;

    public /* synthetic */ C0889x(C1177i c1177i) {
        this.f15097a = c1177i;
    }

    @Override // f5.InterfaceC1173e
    public void o(Object obj) {
        M m9 = (M) obj;
        y4.b bVar = C0897z.f15168d;
        boolean z9 = false;
        if (m9 != null) {
            P p9 = m9.f14746a.f14764a;
            F4.y.h(p9);
            if (p9.f14756a == 1) {
                z9 = true;
            }
        }
        this.f15097a.d(Boolean.valueOf(z9));
    }

    @Override // f5.InterfaceC1172d
    public void y(Exception exc) {
        C0897z.f15168d.a(exc, "get checkbox consent failed", new Object[0]);
        this.f15097a.d(Boolean.FALSE);
    }
}
