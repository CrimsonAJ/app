package Z0;

import android.os.Parcel;
import android.util.SparseIntArray;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import s.C1935e;
import s.C1939i;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f8917d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f8918e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8919f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8920g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8921h;

    /* renamed from: i, reason: collision with root package name */
    public int f8922i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f8923k;

    /* JADX WARN: Type inference failed for: r5v0, types: [s.e, s.i] */
    /* JADX WARN: Type inference failed for: r6v0, types: [s.e, s.i] */
    /* JADX WARN: Type inference failed for: r7v0, types: [s.e, s.i] */
    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1939i(0), new C1939i(0), new C1939i(0));
    }

    @Override // Z0.b
    public final c a() {
        Parcel parcel = this.f8918e;
        int dataPosition = parcel.dataPosition();
        int i9 = this.j;
        if (i9 == this.f8919f) {
            i9 = this.f8920g;
        }
        return new c(parcel, dataPosition, i9, AbstractC0953k1.q(new StringBuilder(), this.f8921h, "  "), this.f8914a, this.f8915b, this.f8916c);
    }

    @Override // Z0.b
    public final boolean e(int i9) {
        while (this.j < this.f8920g) {
            int i10 = this.f8923k;
            if (i10 != i9) {
                if (String.valueOf(i10).compareTo(String.valueOf(i9)) <= 0) {
                    int i11 = this.j;
                    Parcel parcel = this.f8918e;
                    parcel.setDataPosition(i11);
                    int readInt = parcel.readInt();
                    this.f8923k = parcel.readInt();
                    this.j += readInt;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        if (this.f8923k == i9) {
            return true;
        }
        return false;
    }

    @Override // Z0.b
    public final void i(int i9) {
        int i10 = this.f8922i;
        SparseIntArray sparseIntArray = this.f8917d;
        Parcel parcel = this.f8918e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
        this.f8922i = i9;
        sparseIntArray.put(i9, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i9);
    }

    public c(Parcel parcel, int i9, int i10, String str, C1935e c1935e, C1935e c1935e2, C1935e c1935e3) {
        super(c1935e, c1935e2, c1935e3);
        this.f8917d = new SparseIntArray();
        this.f8922i = -1;
        this.f8923k = -1;
        this.f8918e = parcel;
        this.f8919f = i9;
        this.f8920g = i10;
        this.j = i9;
        this.f8921h = str;
    }
}
