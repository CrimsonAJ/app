package B;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class i extends U.b {
    public static final Parcelable.Creator<i> CREATOR = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f584c;

    public i(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f584c = new SparseArray(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            this.f584c.append(iArr[i9], readParcelableArray[i9]);
        }
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int i10;
        super.writeToParcel(parcel, i9);
        SparseArray sparseArray = this.f584c;
        if (sparseArray != null) {
            i10 = sparseArray.size();
        } else {
            i10 = 0;
        }
        parcel.writeInt(i10);
        int[] iArr = new int[i10];
        Parcelable[] parcelableArr = new Parcelable[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = this.f584c.keyAt(i11);
            parcelableArr[i11] = (Parcelable) this.f584c.valueAt(i11);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i9);
    }
}
