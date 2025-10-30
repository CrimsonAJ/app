package S3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6910a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f6910a) {
            case 0:
                return new u(parcel);
            default:
                return new t(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.f6910a) {
            case 0:
                return new u[i9];
            default:
                return new t[i9];
        }
    }
}
