package F3;

import D3.b;
import android.os.Parcel;
import android.os.Parcelable;
import j3.C1444a0;
import j3.L;
import j3.M;
import java.util.Arrays;
import l4.y;

/* loaded from: classes.dex */
public final class a implements b {
    public static final Parcelable.Creator<a> CREATOR;

    /* renamed from: g, reason: collision with root package name */
    public static final M f2321g;

    /* renamed from: h, reason: collision with root package name */
    public static final M f2322h;

    /* renamed from: a, reason: collision with root package name */
    public final String f2323a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2324b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2325c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2326d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f2327e;

    /* renamed from: f, reason: collision with root package name */
    public int f2328f;

    static {
        L l9 = new L();
        l9.f19402k = "application/id3";
        f2321g = new M(l9);
        L l10 = new L();
        l10.f19402k = "application/x-scte35";
        f2322h = new M(l10);
        CREATOR = new A1.a(9);
    }

    public a(String str, String str2, long j, long j4, byte[] bArr) {
        this.f2323a = str;
        this.f2324b = str2;
        this.f2325c = j;
        this.f2326d = j4;
        this.f2327e = bArr;
    }

    @Override // D3.b
    public final /* synthetic */ void b(C1444a0 c1444a0) {
    }

    @Override // D3.b
    public final M c() {
        String str = this.f2323a;
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c3 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c3 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c3 = 2;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return f2322h;
            case 1:
            case 2:
                return f2321g;
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // D3.b
    public final byte[] e() {
        if (c() != null) {
            return this.f2327e;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f2325c == aVar.f2325c && this.f2326d == aVar.f2326d && y.a(this.f2323a, aVar.f2323a) && y.a(this.f2324b, aVar.f2324b) && Arrays.equals(this.f2327e, aVar.f2327e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        if (this.f2328f == 0) {
            int i10 = 0;
            String str = this.f2323a;
            if (str != null) {
                i9 = str.hashCode();
            } else {
                i9 = 0;
            }
            int i11 = (527 + i9) * 31;
            String str2 = this.f2324b;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            int i12 = (i11 + i10) * 31;
            long j = this.f2325c;
            int i13 = (i12 + ((int) (j ^ (j >>> 32)))) * 31;
            long j4 = this.f2326d;
            this.f2328f = Arrays.hashCode(this.f2327e) + ((i13 + ((int) (j4 ^ (j4 >>> 32)))) * 31);
        }
        return this.f2328f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f2323a + ", id=" + this.f2326d + ", durationMs=" + this.f2325c + ", value=" + this.f2324b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f2323a);
        parcel.writeString(this.f2324b);
        parcel.writeLong(this.f2325c);
        parcel.writeLong(this.f2326d);
        parcel.writeByteArray(this.f2327e);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i9 = y.f20553a;
        this.f2323a = readString;
        this.f2324b = parcel.readString();
        this.f2325c = parcel.readLong();
        this.f2326d = parcel.readLong();
        this.f2327e = parcel.createByteArray();
    }
}
