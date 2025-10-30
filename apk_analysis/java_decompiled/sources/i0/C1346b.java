package i0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.EnumC0555p;
import java.util.ArrayList;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1346b implements Parcelable {
    public static final Parcelable.Creator<C1346b> CREATOR = new android.support.v4.media.a(25);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f18302a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18303b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f18304c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f18305d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18306e;

    /* renamed from: f, reason: collision with root package name */
    public final String f18307f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18308g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18309h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f18310i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f18311k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f18312l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f18313m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f18314n;

    public C1346b(C1345a c1345a) {
        int size = c1345a.f18282a.size();
        this.f18302a = new int[size * 6];
        if (c1345a.f18288g) {
            this.f18303b = new ArrayList(size);
            this.f18304c = new int[size];
            this.f18305d = new int[size];
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                C1344V c1344v = (C1344V) c1345a.f18282a.get(i10);
                int i11 = i9 + 1;
                this.f18302a[i9] = c1344v.f18254a;
                ArrayList arrayList = this.f18303b;
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = c1344v.f18255b;
                arrayList.add(abstractComponentCallbacksC1366v != null ? abstractComponentCallbacksC1366v.f18389e : null);
                int[] iArr = this.f18302a;
                iArr[i11] = c1344v.f18256c ? 1 : 0;
                iArr[i9 + 2] = c1344v.f18257d;
                iArr[i9 + 3] = c1344v.f18258e;
                int i12 = i9 + 5;
                iArr[i9 + 4] = c1344v.f18259f;
                i9 += 6;
                iArr[i12] = c1344v.f18260g;
                this.f18304c[i10] = c1344v.f18261h.ordinal();
                this.f18305d[i10] = c1344v.f18262i.ordinal();
            }
            this.f18306e = c1345a.f18287f;
            this.f18307f = c1345a.f18290i;
            this.f18308g = c1345a.f18299s;
            this.f18309h = c1345a.j;
            this.f18310i = c1345a.f18291k;
            this.j = c1345a.f18292l;
            this.f18311k = c1345a.f18293m;
            this.f18312l = c1345a.f18294n;
            this.f18313m = c1345a.f18295o;
            this.f18314n = c1345a.f18296p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, i0.V] */
    public final void a(C1345a c1345a) {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.f18302a;
            boolean z9 = true;
            if (i9 < iArr.length) {
                ?? obj = new Object();
                int i11 = i9 + 1;
                obj.f18254a = iArr[i9];
                if (AbstractC1336M.H(2)) {
                    Log.v("FragmentManager", "Instantiate " + c1345a + " op #" + i10 + " base fragment #" + iArr[i11]);
                }
                obj.f18261h = EnumC0555p.values()[this.f18304c[i10]];
                obj.f18262i = EnumC0555p.values()[this.f18305d[i10]];
                int i12 = i9 + 2;
                if (iArr[i11] == 0) {
                    z9 = false;
                }
                obj.f18256c = z9;
                int i13 = iArr[i12];
                obj.f18257d = i13;
                int i14 = iArr[i9 + 3];
                obj.f18258e = i14;
                int i15 = i9 + 5;
                int i16 = iArr[i9 + 4];
                obj.f18259f = i16;
                i9 += 6;
                int i17 = iArr[i15];
                obj.f18260g = i17;
                c1345a.f18283b = i13;
                c1345a.f18284c = i14;
                c1345a.f18285d = i16;
                c1345a.f18286e = i17;
                c1345a.b(obj);
                i10++;
            } else {
                c1345a.f18287f = this.f18306e;
                c1345a.f18290i = this.f18307f;
                c1345a.f18288g = true;
                c1345a.j = this.f18309h;
                c1345a.f18291k = this.f18310i;
                c1345a.f18292l = this.j;
                c1345a.f18293m = this.f18311k;
                c1345a.f18294n = this.f18312l;
                c1345a.f18295o = this.f18313m;
                c1345a.f18296p = this.f18314n;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeIntArray(this.f18302a);
        parcel.writeStringList(this.f18303b);
        parcel.writeIntArray(this.f18304c);
        parcel.writeIntArray(this.f18305d);
        parcel.writeInt(this.f18306e);
        parcel.writeString(this.f18307f);
        parcel.writeInt(this.f18308g);
        parcel.writeInt(this.f18309h);
        TextUtils.writeToParcel(this.f18310i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.f18311k, parcel, 0);
        parcel.writeStringList(this.f18312l);
        parcel.writeStringList(this.f18313m);
        parcel.writeInt(this.f18314n ? 1 : 0);
    }

    public C1346b(Parcel parcel) {
        this.f18302a = parcel.createIntArray();
        this.f18303b = parcel.createStringArrayList();
        this.f18304c = parcel.createIntArray();
        this.f18305d = parcel.createIntArray();
        this.f18306e = parcel.readInt();
        this.f18307f = parcel.readString();
        this.f18308g = parcel.readInt();
        this.f18309h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f18310i = (CharSequence) creator.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.f18311k = (CharSequence) creator.createFromParcel(parcel);
        this.f18312l = parcel.createStringArrayList();
        this.f18313m = parcel.createStringArrayList();
        this.f18314n = parcel.readInt() != 0;
    }
}
