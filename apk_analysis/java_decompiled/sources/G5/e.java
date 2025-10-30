package G5;

import B.h;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class e extends U.b {
    public static final Parcelable.Creator<e> CREATOR = new h(2);

    /* renamed from: c, reason: collision with root package name */
    public final int f2873c;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2873c = parcel.readInt();
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.f2873c);
    }

    public e(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f2873c = sideSheetBehavior.f16098h;
    }
}
