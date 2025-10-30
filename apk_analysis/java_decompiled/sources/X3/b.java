package X3;

import j3.M;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f8416a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8417b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8418c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8419d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8420e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8421f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8422g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8423h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8424i;
    public final M[] j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8425k;

    /* renamed from: l, reason: collision with root package name */
    public final String f8426l;

    /* renamed from: m, reason: collision with root package name */
    public final String f8427m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f8428n;

    /* renamed from: o, reason: collision with root package name */
    public final long[] f8429o;

    /* renamed from: p, reason: collision with root package name */
    public final long f8430p;

    public b(String str, String str2, int i9, String str3, long j, String str4, int i10, int i11, int i12, int i13, String str5, M[] mArr, ArrayList arrayList, long[] jArr, long j4) {
        this.f8426l = str;
        this.f8427m = str2;
        this.f8416a = i9;
        this.f8417b = str3;
        this.f8418c = j;
        this.f8419d = str4;
        this.f8420e = i10;
        this.f8421f = i11;
        this.f8422g = i12;
        this.f8423h = i13;
        this.f8424i = str5;
        this.j = mArr;
        this.f8428n = arrayList;
        this.f8429o = jArr;
        this.f8430p = j4;
        this.f8425k = arrayList.size();
    }

    public final b a(M[] mArr) {
        long[] jArr = this.f8429o;
        return new b(this.f8426l, this.f8427m, this.f8416a, this.f8417b, this.f8418c, this.f8419d, this.f8420e, this.f8421f, this.f8422g, this.f8423h, this.f8424i, mArr, this.f8428n, jArr, this.f8430p);
    }

    public final long b(int i9) {
        if (i9 == this.f8425k - 1) {
            return this.f8430p;
        }
        long[] jArr = this.f8429o;
        return jArr[i9 + 1] - jArr[i9];
    }
}
