package K3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new H3.b(21);

    /* renamed from: a, reason: collision with root package name */
    public final long f4265a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4266b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4267c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4268d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4269e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4270f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4271g;

    /* renamed from: h, reason: collision with root package name */
    public final List f4272h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4273i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4274k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4275l;

    /* renamed from: m, reason: collision with root package name */
    public final int f4276m;

    public e(long j, boolean z9, boolean z10, boolean z11, boolean z12, long j4, long j9, List list, boolean z13, long j10, int i9, int i10, int i11) {
        this.f4265a = j;
        this.f4266b = z9;
        this.f4267c = z10;
        this.f4268d = z11;
        this.f4269e = z12;
        this.f4270f = j4;
        this.f4271g = j9;
        this.f4272h = Collections.unmodifiableList(list);
        this.f4273i = z13;
        this.j = j10;
        this.f4274k = i9;
        this.f4275l = i10;
        this.f4276m = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f4265a);
        parcel.writeByte(this.f4266b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4267c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4268d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4269e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f4270f);
        parcel.writeLong(this.f4271g);
        List list = this.f4272h;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) list.get(i10);
            parcel.writeInt(dVar.f4262a);
            parcel.writeLong(dVar.f4263b);
            parcel.writeLong(dVar.f4264c);
        }
        parcel.writeByte(this.f4273i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.j);
        parcel.writeInt(this.f4274k);
        parcel.writeInt(this.f4275l);
        parcel.writeInt(this.f4276m);
    }

    public e(Parcel parcel) {
        this.f4265a = parcel.readLong();
        this.f4266b = parcel.readByte() == 1;
        this.f4267c = parcel.readByte() == 1;
        this.f4268d = parcel.readByte() == 1;
        this.f4269e = parcel.readByte() == 1;
        this.f4270f = parcel.readLong();
        this.f4271g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayList.add(new d(parcel.readLong(), parcel.readLong(), parcel.readInt()));
        }
        this.f4272h = Collections.unmodifiableList(arrayList);
        this.f4273i = parcel.readByte() == 1;
        this.j = parcel.readLong();
        this.f4274k = parcel.readInt();
        this.f4275l = parcel.readInt();
        this.f4276m = parcel.readInt();
    }
}
