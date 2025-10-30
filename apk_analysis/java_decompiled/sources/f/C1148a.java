package f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1148a implements Parcelable {
    public static final Parcelable.Creator<C1148a> CREATOR = new android.support.v4.media.a(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f17224a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f17225b;

    public C1148a(Intent intent, int i9) {
        this.f17224a = i9;
        this.f17225b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i9 = this.f17224a;
        if (i9 != -1) {
            if (i9 != 0) {
                str = String.valueOf(i9);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.f17225b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int i10;
        parcel.writeInt(this.f17224a);
        Intent intent = this.f17225b;
        if (intent == null) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        parcel.writeInt(i10);
        if (intent != null) {
            intent.writeToParcel(parcel, i9);
        }
    }

    public C1148a(Parcel parcel) {
        this.f17224a = parcel.readInt();
        this.f17225b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
