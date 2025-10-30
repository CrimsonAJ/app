package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1030a f16334a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16335b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f16336c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16337d;

    public a0(AbstractC1030a abstractC1030a, String str, Object[] objArr) {
        this.f16334a = abstractC1030a;
        this.f16335b = str;
        this.f16336c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f16337d = charAt;
            return;
        }
        int i9 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 >= 55296) {
                i9 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            } else {
                this.f16337d = i9 | (charAt2 << i11);
                return;
            }
        }
    }
}
