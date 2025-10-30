package m5;

import B.h;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class b extends U.b {
    public static final Parcelable.Creator<b> CREATOR = new h(7);

    /* renamed from: c, reason: collision with root package name */
    public final int f20834c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20835d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20836e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20837f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20838g;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f20834c = parcel.readInt();
        this.f20835d = parcel.readInt();
        this.f20836e = parcel.readInt() == 1;
        this.f20837f = parcel.readInt() == 1;
        this.f20838g = parcel.readInt() == 1;
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.f20834c);
        parcel.writeInt(this.f20835d);
        parcel.writeInt(this.f20836e ? 1 : 0);
        parcel.writeInt(this.f20837f ? 1 : 0);
        parcel.writeInt(this.f20838g ? 1 : 0);
    }

    public b(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f20834c = bottomSheetBehavior.f15848L;
        this.f20835d = bottomSheetBehavior.f15870e;
        this.f20836e = bottomSheetBehavior.f15864b;
        this.f20837f = bottomSheetBehavior.f15846I;
        this.f20838g = bottomSheetBehavior.f15847J;
    }
}
