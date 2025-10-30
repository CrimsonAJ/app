package A4;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f341a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f341a) {
            case 0:
                int f02 = s8.e.f0(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < f02) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        s8.e.e0(parcel, readInt);
                    } else {
                        intent = (Intent) s8.e.n(parcel, readInt, Intent.CREATOR);
                    }
                }
                s8.e.w(parcel, f02);
                return new a(intent);
            default:
                return new h(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i9) {
        switch (this.f341a) {
            case 0:
                return new a[i9];
            default:
                return new h[i9];
        }
    }
}
