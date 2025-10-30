package c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.a(15);

    /* renamed from: a, reason: collision with root package name */
    public b f11551a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        synchronized (this) {
            try {
                if (this.f11551a == null) {
                    this.f11551a = new c(this);
                }
                parcel.writeStrongBinder(this.f11551a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i9, Bundle bundle) {
    }
}
