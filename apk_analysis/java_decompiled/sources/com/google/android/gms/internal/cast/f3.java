package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public final E2 f14843a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14844b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f14845c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14846d;

    public f3(E2 e22, String str, Object[] objArr) {
        this.f14843a = e22;
        this.f14844b = str;
        this.f14845c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f14846d = charAt;
            return;
        }
        int i9 = charAt & 8191;
        int i10 = 13;
        int i11 = 1;
        while (true) {
            int i12 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                i9 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i11 = i12;
            } else {
                this.f14846d = i9 | (charAt2 << i10);
                return;
            }
        }
    }

    public final int a() {
        int i9 = this.f14846d;
        if ((i9 & 1) != 0) {
            return 1;
        }
        return (i9 & 4) == 4 ? 3 : 2;
    }
}
