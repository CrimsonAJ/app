package z5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j extends U.b {
    public static final Parcelable.Creator<j> CREATOR = new B.h(12);

    /* renamed from: c, reason: collision with root package name */
    public Bundle f25494c;

    public j(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f25494c = parcel.readBundle(classLoader == null ? j.class.getClassLoader() : classLoader);
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeBundle(this.f25494c);
    }
}
