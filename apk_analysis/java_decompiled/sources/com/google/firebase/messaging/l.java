package com.google.firebase.messaging;

import f5.InterfaceC1173e;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements InterfaceC1173e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f16484b;

    public /* synthetic */ l(FirebaseMessaging firebaseMessaging, int i9) {
        this.f16483a = i9;
        this.f16484b = firebaseMessaging;
    }

    @Override // f5.InterfaceC1173e
    public final void o(Object obj) {
        FirebaseMessaging firebaseMessaging = this.f16484b;
        switch (this.f16483a) {
            case 0:
                y yVar = (y) obj;
                if (firebaseMessaging.f16447e.i()) {
                    yVar.h();
                    return;
                }
                return;
            default:
                A4.a aVar = (A4.a) obj;
                u uVar = FirebaseMessaging.f16440l;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    v4.e.I(aVar.f331a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
