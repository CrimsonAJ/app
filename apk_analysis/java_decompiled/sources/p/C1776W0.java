package p;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p.W0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1776W0 extends U.b {
    public static final Parcelable.Creator<C1776W0> CREATOR = new B.h(9);

    /* renamed from: c, reason: collision with root package name */
    public int f21924c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21925d;

    public C1776W0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z9;
        this.f21924c = parcel.readInt();
        if (parcel.readInt() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f21925d = z9;
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.f21924c);
        parcel.writeInt(this.f21925d ? 1 : 0);
    }
}
