package t4;

import android.os.Parcel;
import android.os.Parcelable;
import i5.C1381b;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i extends G4.a {
    public static final Parcelable.Creator<i> CREATOR = new C1381b(15);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23186a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23187b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23188c;

    /* renamed from: d, reason: collision with root package name */
    public final h f23189d;

    public i(boolean z9, String str, boolean z10, h hVar) {
        this.f23186a = z9;
        this.f23187b = str;
        this.f23188c = z10;
        this.f23189d = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f23186a == iVar.f23186a && y4.a.e(this.f23187b, iVar.f23187b) && this.f23188c == iVar.f23188c && y4.a.e(this.f23189d, iVar.f23189d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f23186a), this.f23187b, Boolean.valueOf(this.f23188c), this.f23189d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f23186a + ", language=" + this.f23187b + ", androidReceiverCompatible: " + this.f23188c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f23186a ? 1 : 0);
        s8.n.M(parcel, 3, this.f23187b);
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(this.f23188c ? 1 : 0);
        s8.n.L(parcel, 5, this.f23189d, i9);
        s8.n.U(parcel, R2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i() {
        /*
            r5 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.util.regex.Pattern r1 = y4.a.f24915a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 20
            r1.<init>(r2)
            java.lang.String r2 = r0.getLanguage()
            r1.append(r2)
            java.lang.String r2 = r0.getCountry()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 45
            if (r3 != 0) goto L26
            r1.append(r4)
            r1.append(r2)
        L26:
            java.lang.String r0 = r0.getVariant()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L36
            r1.append(r4)
            r1.append(r0)
        L36:
            java.lang.String r0 = r1.toString()
            r1 = 0
            r2 = 0
            r5.<init>(r2, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.i.<init>():void");
    }
}
