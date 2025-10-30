package t4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import i5.C1381b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends G4.a {
    public static final Parcelable.Creator<m> CREATOR = new C1381b(22);

    /* renamed from: a, reason: collision with root package name */
    public String f23205a;

    /* renamed from: b, reason: collision with root package name */
    public String f23206b;

    /* renamed from: c, reason: collision with root package name */
    public int f23207c;

    /* renamed from: d, reason: collision with root package name */
    public String f23208d;

    /* renamed from: e, reason: collision with root package name */
    public l f23209e;

    /* renamed from: f, reason: collision with root package name */
    public int f23210f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f23211g;

    /* renamed from: h, reason: collision with root package name */
    public int f23212h;

    /* renamed from: i, reason: collision with root package name */
    public long f23213i;
    public boolean j;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (TextUtils.equals(this.f23205a, mVar.f23205a) && TextUtils.equals(this.f23206b, mVar.f23206b) && this.f23207c == mVar.f23207c && TextUtils.equals(this.f23208d, mVar.f23208d) && F4.y.k(this.f23209e, mVar.f23209e) && this.f23210f == mVar.f23210f && F4.y.k(this.f23211g, mVar.f23211g) && this.f23212h == mVar.f23212h && this.f23213i == mVar.f23213i && this.j == mVar.j) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23205a, this.f23206b, Integer.valueOf(this.f23207c), this.f23208d, this.f23209e, Integer.valueOf(this.f23210f), this.f23211g, Integer.valueOf(this.f23212h), Long.valueOf(this.f23213i), Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        List unmodifiableList;
        int R2 = s8.n.R(parcel, 20293);
        s8.n.M(parcel, 2, this.f23205a);
        s8.n.M(parcel, 3, this.f23206b);
        int i10 = this.f23207c;
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(i10);
        s8.n.M(parcel, 5, this.f23208d);
        s8.n.L(parcel, 6, this.f23209e, i9);
        int i11 = this.f23210f;
        s8.n.V(parcel, 7, 4);
        parcel.writeInt(i11);
        ArrayList arrayList = this.f23211g;
        if (arrayList == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        s8.n.P(parcel, 8, unmodifiableList);
        int i12 = this.f23212h;
        s8.n.V(parcel, 9, 4);
        parcel.writeInt(i12);
        long j = this.f23213i;
        s8.n.V(parcel, 10, 8);
        parcel.writeLong(j);
        boolean z9 = this.j;
        s8.n.V(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        s8.n.U(parcel, R2);
    }
}
