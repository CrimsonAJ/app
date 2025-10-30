package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import i5.C1381b;

/* renamed from: p.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1750J extends View.BaseSavedState {
    public static final Parcelable.Creator<C1750J> CREATOR = new C1381b(6);

    /* renamed from: a, reason: collision with root package name */
    public boolean f21831a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeByte(this.f21831a ? (byte) 1 : (byte) 0);
    }
}
