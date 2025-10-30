package i0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: i0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1365u implements Parcelable {
    public static final Parcelable.Creator<C1365u> CREATOR = new B.h(6);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f18377a;

    public C1365u(Bundle bundle) {
        this.f18377a = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeBundle(this.f18377a);
    }

    public C1365u(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.f18377a = readBundle;
        if (classLoader == null || readBundle == null) {
            return;
        }
        readBundle.setClassLoader(classLoader);
    }
}
