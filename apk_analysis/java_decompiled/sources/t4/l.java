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
public final class l extends G4.a {
    public static final Parcelable.Creator<l> CREATOR = new C1381b(21);

    /* renamed from: a, reason: collision with root package name */
    public int f23200a;

    /* renamed from: b, reason: collision with root package name */
    public String f23201b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f23202c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f23203d;

    /* renamed from: e, reason: collision with root package name */
    public double f23204e;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (this.f23200a == lVar.f23200a && TextUtils.equals(this.f23201b, lVar.f23201b) && F4.y.k(this.f23202c, lVar.f23202c) && F4.y.k(this.f23203d, lVar.f23203d) && this.f23204e == lVar.f23204e) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23200a), this.f23201b, this.f23202c, this.f23203d, Double.valueOf(this.f23204e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        List unmodifiableList;
        int R2 = s8.n.R(parcel, 20293);
        int i10 = this.f23200a;
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(i10);
        s8.n.M(parcel, 3, this.f23201b);
        ArrayList arrayList = this.f23202c;
        List list = null;
        if (arrayList == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        s8.n.P(parcel, 4, unmodifiableList);
        ArrayList arrayList2 = this.f23203d;
        if (arrayList2 != null) {
            list = Collections.unmodifiableList(arrayList2);
        }
        s8.n.P(parcel, 5, list);
        double d9 = this.f23204e;
        s8.n.V(parcel, 6, 8);
        parcel.writeDouble(d9);
        s8.n.U(parcel, R2);
    }
}
