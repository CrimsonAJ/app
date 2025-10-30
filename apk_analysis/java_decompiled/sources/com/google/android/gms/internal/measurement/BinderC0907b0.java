package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0907b0 extends AbstractBinderC1015x implements O {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S5.o f15446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0907b0(S5.o oVar) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f15446e = oVar;
    }

    @Override // com.google.android.gms.internal.measurement.O
    public final void c() {
        this.f15446e.run();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1015x
    public final boolean d(int i9, Parcel parcel, Parcel parcel2) {
        if (i9 == 2) {
            c();
            return true;
        }
        return false;
    }
}
