package F0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y0 implements Parcelable {
    public static final Parcelable.Creator<y0> CREATOR = new A1.a(8);

    /* renamed from: a, reason: collision with root package name */
    public int f2294a;

    /* renamed from: b, reason: collision with root package name */
    public int f2295b;

    /* renamed from: c, reason: collision with root package name */
    public int f2296c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f2297d;

    /* renamed from: e, reason: collision with root package name */
    public int f2298e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2299f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2300g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2301h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2302i;
    public boolean j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f2294a);
        parcel.writeInt(this.f2295b);
        parcel.writeInt(this.f2296c);
        if (this.f2296c > 0) {
            parcel.writeIntArray(this.f2297d);
        }
        parcel.writeInt(this.f2298e);
        if (this.f2298e > 0) {
            parcel.writeIntArray(this.f2299f);
        }
        parcel.writeInt(this.f2301h ? 1 : 0);
        parcel.writeInt(this.f2302i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeList(this.f2300g);
    }
}
