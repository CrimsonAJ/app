package t4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import i5.C1381b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: t4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2014d extends G4.a {
    public static final Parcelable.Creator<C2014d> CREATOR = new C1381b(26);

    /* renamed from: a, reason: collision with root package name */
    public final String f23170a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23171b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f23172c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23173d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f23174e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23175f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23176g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f23177h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f23178i;
    public final int j;

    public C2014d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2, int i9) {
        this.f23170a = str;
        this.f23171b = str2;
        this.f23172c = arrayList;
        this.f23173d = str3;
        this.f23174e = uri;
        this.f23175f = str4;
        this.f23176g = str5;
        this.f23177h = bool;
        this.f23178i = bool2;
        this.j = i9;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C2014d) {
                C2014d c2014d = (C2014d) obj;
                if (y4.a.e(this.f23170a, c2014d.f23170a) && y4.a.e(this.f23171b, c2014d.f23171b) && y4.a.e(this.f23172c, c2014d.f23172c) && y4.a.e(this.f23173d, c2014d.f23173d) && y4.a.e(this.f23174e, c2014d.f23174e) && y4.a.e(this.f23175f, c2014d.f23175f) && y4.a.e(this.f23176g, c2014d.f23176g) && this.j == c2014d.j) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.j);
        return Arrays.hashCode(new Object[]{this.f23170a, this.f23171b, this.f23172c, this.f23173d, this.f23174e, this.f23175f, valueOf});
    }

    public final String toString() {
        int size;
        ArrayList arrayList = this.f23172c;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        return "applicationId: " + this.f23170a + ", name: " + this.f23171b + ", namespaces.count: " + size + ", senderAppIdentifier: " + this.f23173d + ", senderAppLaunchUrl: " + String.valueOf(this.f23174e) + ", iconUrl: " + this.f23175f + ", type: " + this.f23176g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.M(parcel, 2, this.f23170a);
        s8.n.M(parcel, 3, this.f23171b);
        s8.n.N(parcel, 5, Collections.unmodifiableList(this.f23172c));
        s8.n.M(parcel, 6, this.f23173d);
        s8.n.L(parcel, 7, this.f23174e, i9);
        s8.n.M(parcel, 8, this.f23175f);
        s8.n.M(parcel, 9, this.f23176g);
        s8.n.E(parcel, 10, this.f23177h);
        s8.n.E(parcel, 11, this.f23178i);
        s8.n.V(parcel, 12, 4);
        parcel.writeInt(this.j);
        s8.n.U(parcel, R2);
    }
}
