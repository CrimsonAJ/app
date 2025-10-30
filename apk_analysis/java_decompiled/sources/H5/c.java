package H5;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends View.BaseSavedState {
    public static final Parcelable.Creator<c> CREATOR = new H3.b(2);

    /* renamed from: a, reason: collision with root package name */
    public float f3114a;

    /* renamed from: b, reason: collision with root package name */
    public float f3115b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f3116c;

    /* renamed from: d, reason: collision with root package name */
    public float f3117d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3118e;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeFloat(this.f3114a);
        parcel.writeFloat(this.f3115b);
        parcel.writeList(this.f3116c);
        parcel.writeFloat(this.f3117d);
        parcel.writeBooleanArray(new boolean[]{this.f3118e});
    }
}
