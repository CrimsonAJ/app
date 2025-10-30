package com.google.android.gms.common.internal;

import A1.a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import y4.u;

@KeepName
/* loaded from: classes.dex */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new a(15);

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f14677a;

    public BinderWrapper(u uVar) {
        this.f14677a = uVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeStrongBinder(this.f14677a);
    }

    public /* synthetic */ BinderWrapper(Parcel parcel) {
        this.f14677a = parcel.readStrongBinder();
    }
}
