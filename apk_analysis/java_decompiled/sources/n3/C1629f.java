package n3;

import android.os.Parcel;
import android.os.Parcelable;
import i5.C1381b;
import j3.AbstractC1455g;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: n3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1629f implements Parcelable {
    public static final Parcelable.Creator<C1629f> CREATOR = new C1381b(2);

    /* renamed from: a, reason: collision with root package name */
    public int f21115a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f21116b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21117c;

    /* renamed from: d, reason: collision with root package name */
    public final String f21118d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f21119e;

    public C1629f(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f21116b = uuid;
        this.f21117c = str;
        str2.getClass();
        this.f21118d = str2;
        this.f21119e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = AbstractC1455g.f19616a;
        UUID uuid3 = this.f21116b;
        if (!uuid2.equals(uuid3) && !uuid.equals(uuid3)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1629f)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C1629f c1629f = (C1629f) obj;
        if (!l4.y.a(this.f21117c, c1629f.f21117c) || !l4.y.a(this.f21118d, c1629f.f21118d) || !l4.y.a(this.f21116b, c1629f.f21116b) || !Arrays.equals(this.f21119e, c1629f.f21119e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f21115a == 0) {
            int hashCode2 = this.f21116b.hashCode() * 31;
            String str = this.f21117c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f21115a = Arrays.hashCode(this.f21119e) + u0.z.c(this.f21118d, (hashCode2 + hashCode) * 31, 31);
        }
        return this.f21115a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        UUID uuid = this.f21116b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f21117c);
        parcel.writeString(this.f21118d);
        parcel.writeByteArray(this.f21119e);
    }

    public C1629f(Parcel parcel) {
        this.f21116b = new UUID(parcel.readLong(), parcel.readLong());
        this.f21117c = parcel.readString();
        String readString = parcel.readString();
        int i9 = l4.y.f20553a;
        this.f21118d = readString;
        this.f21119e = parcel.createByteArray();
    }
}
