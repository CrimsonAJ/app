package J3;

import android.os.Parcel;
import android.os.Parcelable;
import j3.C1444a0;
import j3.M;

/* loaded from: classes.dex */
public final class e implements D3.b {
    public static final Parcelable.Creator<e> CREATOR = new H3.b(19);

    /* renamed from: a, reason: collision with root package name */
    public final float f4186a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4187b;

    public e(int i9, float f9) {
        this.f4186a = f9;
        this.f4187b = i9;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f4186a == eVar.f4186a && this.f4187b == eVar.f4187b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f4186a).hashCode() + 527) * 31) + this.f4187b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f4186a + ", svcTemporalLayerCount=" + this.f4187b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeFloat(this.f4186a);
        parcel.writeInt(this.f4187b);
    }

    public e(Parcel parcel) {
        this.f4186a = parcel.readFloat();
        this.f4187b = parcel.readInt();
    }
}
