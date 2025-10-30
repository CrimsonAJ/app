package V0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class j extends View.BaseSavedState {
    public static final Parcelable.Creator<j> CREATOR = new H3.b(28);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7616a;

    public j(Parcelable parcelable, boolean z9) {
        super(parcelable);
        this.f7616a = z9;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeByte(this.f7616a ? (byte) 1 : (byte) 0);
    }

    public j(Parcel parcel) {
        super(parcel);
        this.f7616a = parcel.readByte() != 0;
    }
}
