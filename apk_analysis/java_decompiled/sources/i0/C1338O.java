package i0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: i0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1338O implements Parcelable {
    public static final Parcelable.Creator<C1338O> CREATOR = new android.support.v4.media.a(28);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f18221a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f18222b;

    /* renamed from: c, reason: collision with root package name */
    public C1346b[] f18223c;

    /* renamed from: d, reason: collision with root package name */
    public int f18224d;

    /* renamed from: e, reason: collision with root package name */
    public String f18225e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f18226f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f18227g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f18228h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeStringList(this.f18221a);
        parcel.writeStringList(this.f18222b);
        parcel.writeTypedArray(this.f18223c, i9);
        parcel.writeInt(this.f18224d);
        parcel.writeString(this.f18225e);
        parcel.writeStringList(this.f18226f);
        parcel.writeTypedList(this.f18227g);
        parcel.writeTypedList(this.f18228h);
    }
}
