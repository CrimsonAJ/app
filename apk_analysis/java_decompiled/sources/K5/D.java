package K5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class D extends U.b {
    public static final Parcelable.Creator<D> CREATOR = new B.h(3);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f4310c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4311d;

    public D(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4310c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4311d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f4310c) + "}";
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        TextUtils.writeToParcel(this.f4310c, parcel, i9);
        parcel.writeInt(this.f4311d ? 1 : 0);
    }
}
