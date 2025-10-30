package l3;

import f5.C1183o;
import j3.InterfaceC1453f;

/* renamed from: l3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1556e implements InterfaceC1453f {

    /* renamed from: g, reason: collision with root package name */
    public static final C1556e f20389g = new C1556e(0, 0, 1, 1, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f20390a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20391b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20392c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20393d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20394e;

    /* renamed from: f, reason: collision with root package name */
    public C1183o f20395f;

    public C1556e(int i9, int i10, int i11, int i12, int i13) {
        this.f20390a = i9;
        this.f20391b = i10;
        this.f20392c = i11;
        this.f20393d = i12;
        this.f20394e = i13;
    }

    public final C1183o a() {
        if (this.f20395f == null) {
            this.f20395f = new C1183o(this);
        }
        return this.f20395f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1556e.class == obj.getClass()) {
            C1556e c1556e = (C1556e) obj;
            if (this.f20390a == c1556e.f20390a && this.f20391b == c1556e.f20391b && this.f20392c == c1556e.f20392c && this.f20393d == c1556e.f20393d && this.f20394e == c1556e.f20394e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f20390a) * 31) + this.f20391b) * 31) + this.f20392c) * 31) + this.f20393d) * 31) + this.f20394e;
    }
}
