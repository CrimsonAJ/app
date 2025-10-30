package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class A2 {

    /* renamed from: a, reason: collision with root package name */
    public final N1 f15176a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15177b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f15178c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15179d;

    public A2(N1 n12, String str, Object[] objArr) {
        this.f15176a = n12;
        this.f15177b = str;
        this.f15178c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f15179d = charAt;
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
                this.f15179d = i9 | (charAt2 << i10);
                return;
            }
        }
    }

    public final int a() {
        int i9 = this.f15179d;
        if ((i9 & 1) != 0) {
            return 1;
        }
        return (i9 & 4) == 4 ? 3 : 2;
    }
}
