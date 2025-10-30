package d5;

import C4.o;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import s8.n;

/* loaded from: classes.dex */
public final class b extends G4.a implements o {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(20);

    /* renamed from: a, reason: collision with root package name */
    public final int f16873a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16874b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f16875c;

    public b(int i9, int i10, Intent intent) {
        this.f16873a = i9;
        this.f16874b = i10;
        this.f16875c = intent;
    }

    @Override // C4.o
    public final Status d() {
        if (this.f16874b == 0) {
            return Status.f14655e;
        }
        return Status.f14659i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = n.R(parcel, 20293);
        n.V(parcel, 1, 4);
        parcel.writeInt(this.f16873a);
        n.V(parcel, 2, 4);
        parcel.writeInt(this.f16874b);
        n.L(parcel, 3, this.f16875c, i9);
        n.U(parcel, R2);
    }
}
