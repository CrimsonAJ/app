package i0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: i0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1347c implements Parcelable {
    public static final Parcelable.Creator<C1347c> CREATOR = new android.support.v4.media.a(26);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18315a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18316b;

    public C1347c(ArrayList arrayList, ArrayList arrayList2) {
        this.f18315a = arrayList;
        this.f18316b = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeStringList(this.f18315a);
        parcel.writeTypedList(this.f18316b);
    }

    public C1347c(Parcel parcel) {
        this.f18315a = parcel.createStringArrayList();
        this.f18316b = parcel.createTypedArrayList(C1346b.CREATOR);
    }
}
