package K3;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final long f4279a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4280b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4281c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4282d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4283e;

    /* renamed from: f, reason: collision with root package name */
    public final List f4284f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4285g;

    /* renamed from: h, reason: collision with root package name */
    public final long f4286h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4287i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4288k;

    public h(long j, boolean z9, boolean z10, boolean z11, ArrayList arrayList, long j4, boolean z12, long j9, int i9, int i10, int i11) {
        this.f4279a = j;
        this.f4280b = z9;
        this.f4281c = z10;
        this.f4282d = z11;
        this.f4284f = Collections.unmodifiableList(arrayList);
        this.f4283e = j4;
        this.f4285g = z12;
        this.f4286h = j9;
        this.f4287i = i9;
        this.j = i10;
        this.f4288k = i11;
    }

    public h(Parcel parcel) {
        this.f4279a = parcel.readLong();
        this.f4280b = parcel.readByte() == 1;
        this.f4281c = parcel.readByte() == 1;
        this.f4282d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayList.add(new g(parcel.readLong(), parcel.readInt()));
        }
        this.f4284f = Collections.unmodifiableList(arrayList);
        this.f4283e = parcel.readLong();
        this.f4285g = parcel.readByte() == 1;
        this.f4286h = parcel.readLong();
        this.f4287i = parcel.readInt();
        this.j = parcel.readInt();
        this.f4288k = parcel.readInt();
    }
}
