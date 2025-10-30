package n3;

import android.os.Parcel;
import android.os.Parcelable;
import i5.C1381b;
import j3.AbstractC1455g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: n3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1630g implements Comparator, Parcelable {
    public static final Parcelable.Creator<C1630g> CREATOR = new C1381b(1);

    /* renamed from: a, reason: collision with root package name */
    public final C1629f[] f21120a;

    /* renamed from: b, reason: collision with root package name */
    public int f21121b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21122c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21123d;

    public C1630g(String str, ArrayList arrayList) {
        this(str, false, (C1629f[]) arrayList.toArray(new C1629f[0]));
    }

    public final C1630g a(String str) {
        if (l4.y.a(this.f21122c, str)) {
            return this;
        }
        return new C1630g(str, false, this.f21120a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C1629f c1629f = (C1629f) obj;
        C1629f c1629f2 = (C1629f) obj2;
        UUID uuid = AbstractC1455g.f19616a;
        if (uuid.equals(c1629f.f21116b)) {
            if (uuid.equals(c1629f2.f21116b)) {
                return 0;
            }
            return 1;
        }
        return c1629f.f21116b.compareTo(c1629f2.f21116b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1630g.class == obj.getClass()) {
            C1630g c1630g = (C1630g) obj;
            if (l4.y.a(this.f21122c, c1630g.f21122c) && Arrays.equals(this.f21120a, c1630g.f21120a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f21121b == 0) {
            String str = this.f21122c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f21121b = (hashCode * 31) + Arrays.hashCode(this.f21120a);
        }
        return this.f21121b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f21122c);
        parcel.writeTypedArray(this.f21120a, 0);
    }

    public C1630g(C1629f... c1629fArr) {
        this(null, true, c1629fArr);
    }

    public C1630g(String str, boolean z9, C1629f... c1629fArr) {
        this.f21122c = str;
        c1629fArr = z9 ? (C1629f[]) c1629fArr.clone() : c1629fArr;
        this.f21120a = c1629fArr;
        this.f21123d = c1629fArr.length;
        Arrays.sort(c1629fArr, this);
    }

    public C1630g(Parcel parcel) {
        this.f21122c = parcel.readString();
        C1629f[] c1629fArr = (C1629f[]) parcel.createTypedArray(C1629f.CREATOR);
        int i9 = l4.y.f20553a;
        this.f21120a = c1629fArr;
        this.f21123d = c1629fArr.length;
    }
}
