package E4;

import F4.y;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import s8.n;

/* loaded from: classes.dex */
public final class a extends G4.a {
    public static final Parcelable.Creator<a> CREATOR = new A1.a(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f1940a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f1941b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1942c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1943d;

    public a(int i9, Uri uri, int i10, int i11) {
        this.f1940a = i9;
        this.f1941b = uri;
        this.f1942c = i10;
        this.f1943d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (y.k(this.f1941b, aVar.f1941b) && this.f1942c == aVar.f1942c && this.f1943d == aVar.f1943d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1941b, Integer.valueOf(this.f1942c), Integer.valueOf(this.f1943d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "Image " + this.f1942c + "x" + this.f1943d + " " + this.f1941b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = n.R(parcel, 20293);
        n.V(parcel, 1, 4);
        parcel.writeInt(this.f1940a);
        n.L(parcel, 2, this.f1941b, i9);
        n.V(parcel, 3, 4);
        parcel.writeInt(this.f1942c);
        n.V(parcel, 4, 4);
        parcel.writeInt(this.f1943d);
        n.U(parcel, R2);
    }

    public a(Uri uri, int i9, int i10) {
        this(1, uri, i9, i10);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i9 < 0 || i10 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(org.json.JSONObject r5) {
        /*
            r4 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            java.lang.String r1 = "url"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L12
            java.lang.String r1 = r5.getString(r1)     // Catch: org.json.JSONException -> L12
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch: org.json.JSONException -> L12
        L12:
            java.lang.String r1 = "width"
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            java.lang.String r3 = "height"
            int r5 = r5.optInt(r3, r2)
            r4.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E4.a.<init>(org.json.JSONObject):void");
    }
}
