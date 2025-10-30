package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0979p2 extends AbstractC0936h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15567c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0979p2(String str, int i9) {
        super(str);
        this.f15567c = i9;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0936h
    public final InterfaceC0966n a(com.google.firebase.messaging.s sVar, List list) {
        switch (this.f15567c) {
            case 0:
                return InterfaceC0966n.f15543N;
            case 1:
            case 2:
                return this;
            case 3:
                return new C0931g(Double.valueOf(0.0d));
            default:
                return InterfaceC0966n.f15543N;
        }
    }
}
