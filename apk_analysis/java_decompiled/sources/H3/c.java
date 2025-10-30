package H3;

import android.os.Parcel;
import android.os.Parcelable;
import j3.C1444a0;
import j3.M;
import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public final class c implements D3.b {
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f3099a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3100b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3101c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3102d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3103e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3104f;

    public c(int i9, int i10, String str, String str2, String str3, boolean z9) {
        AbstractC1566a.h(i10 == -1 || i10 > 0);
        this.f3099a = i9;
        this.f3100b = str;
        this.f3101c = str2;
        this.f3102d = str3;
        this.f3103e = z9;
        this.f3104f = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static H3.c a(java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.c.a(java.util.Map):H3.c");
    }

    @Override // D3.b
    public final void b(C1444a0 c1444a0) {
        String str = this.f3101c;
        if (str != null) {
            c1444a0.f19504D = str;
        }
        String str2 = this.f3100b;
        if (str2 != null) {
            c1444a0.f19502B = str2;
        }
    }

    @Override // D3.b
    public final /* synthetic */ M c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // D3.b
    public final /* synthetic */ byte[] e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f3099a == cVar.f3099a && y.a(this.f3100b, cVar.f3100b) && y.a(this.f3101c, cVar.f3101c) && y.a(this.f3102d, cVar.f3102d) && this.f3103e == cVar.f3103e && this.f3104f == cVar.f3104f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11 = (527 + this.f3099a) * 31;
        int i12 = 0;
        String str = this.f3100b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = (i11 + i9) * 31;
        String str2 = this.f3101c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        String str3 = this.f3102d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return ((((i14 + i12) * 31) + (this.f3103e ? 1 : 0)) * 31) + this.f3104f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f3101c + "\", genre=\"" + this.f3100b + "\", bitrate=" + this.f3099a + ", metadataInterval=" + this.f3104f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f3099a);
        parcel.writeString(this.f3100b);
        parcel.writeString(this.f3101c);
        parcel.writeString(this.f3102d);
        int i10 = y.f20553a;
        parcel.writeInt(this.f3103e ? 1 : 0);
        parcel.writeInt(this.f3104f);
    }

    public c(Parcel parcel) {
        this.f3099a = parcel.readInt();
        this.f3100b = parcel.readString();
        this.f3101c = parcel.readString();
        this.f3102d = parcel.readString();
        int i9 = y.f20553a;
        this.f3103e = parcel.readInt() != 0;
        this.f3104f = parcel.readInt();
    }
}
