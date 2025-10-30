package K3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new H3.b(23);

    /* renamed from: a, reason: collision with root package name */
    public final List f4289a;

    public i(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayList.add(new h(parcel));
        }
        this.f4289a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        List list = this.f4289a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = (h) list.get(i10);
            parcel.writeLong(hVar.f4279a);
            parcel.writeByte(hVar.f4280b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f4281c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hVar.f4282d ? (byte) 1 : (byte) 0);
            List list2 = hVar.f4284f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                g gVar = (g) list2.get(i11);
                parcel.writeInt(gVar.f4277a);
                parcel.writeLong(gVar.f4278b);
            }
            parcel.writeLong(hVar.f4283e);
            parcel.writeByte(hVar.f4285g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hVar.f4286h);
            parcel.writeInt(hVar.f4287i);
            parcel.writeInt(hVar.j);
            parcel.writeInt(hVar.f4288k);
        }
    }

    public i(ArrayList arrayList) {
        this.f4289a = Collections.unmodifiableList(arrayList);
    }
}
