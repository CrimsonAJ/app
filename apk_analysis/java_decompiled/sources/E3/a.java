package E3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.C1444a0;
import j3.M;

/* loaded from: classes.dex */
public final class a implements D3.b {
    public static final Parcelable.Creator<a> CREATOR = new A1.a(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f1937a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1938b;

    public a(int i9, String str) {
        this.f1937a = i9;
        this.f1938b = str;
    }

    @Override // D3.b
    public final /* synthetic */ void b(C1444a0 c1444a0) {
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f1937a);
        sb.append(",url=");
        return AbstractC0953k1.q(sb, this.f1938b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f1938b);
        parcel.writeInt(this.f1937a);
    }
}
