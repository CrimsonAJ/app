package d1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class m extends View.BaseSavedState {
    public static final Parcelable.Creator<m> CREATOR = new B.h(5);

    /* renamed from: a, reason: collision with root package name */
    public int f16711a;

    /* renamed from: b, reason: collision with root package name */
    public int f16712b;

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f16713c;

    public m(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f16711a = parcel.readInt();
        this.f16712b = parcel.readInt();
        this.f16713c = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeInt(this.f16711a);
        parcel.writeInt(this.f16712b);
        parcel.writeParcelable(this.f16713c, i9);
    }
}
