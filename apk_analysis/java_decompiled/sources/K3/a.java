package K3;

import android.os.Parcel;
import android.os.Parcelable;
import l4.y;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new H3.b(20);

    /* renamed from: a, reason: collision with root package name */
    public final long f4257a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4258b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4259c;

    public a(long j, byte[] bArr, long j4) {
        this.f4257a = j4;
        this.f4258b = j;
        this.f4259c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f4257a);
        parcel.writeLong(this.f4258b);
        parcel.writeByteArray(this.f4259c);
    }

    public a(Parcel parcel) {
        this.f4257a = parcel.readLong();
        this.f4258b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i9 = y.f20553a;
        this.f4259c = createByteArray;
    }
}
