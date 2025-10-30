package y3;

import com.google.android.gms.internal.measurement.AbstractC1002u1;

/* renamed from: y3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2207c {

    /* renamed from: a, reason: collision with root package name */
    public final int f24778a;

    /* renamed from: b, reason: collision with root package name */
    public int f24779b;

    /* renamed from: c, reason: collision with root package name */
    public int f24780c;

    /* renamed from: d, reason: collision with root package name */
    public long f24781d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24782e;

    /* renamed from: f, reason: collision with root package name */
    public final A4.r f24783f;

    /* renamed from: g, reason: collision with root package name */
    public final A4.r f24784g;

    /* renamed from: h, reason: collision with root package name */
    public int f24785h;

    /* renamed from: i, reason: collision with root package name */
    public int f24786i;

    public C2207c(A4.r rVar, A4.r rVar2, boolean z9) {
        this.f24784g = rVar;
        this.f24783f = rVar2;
        this.f24782e = z9;
        rVar2.H(12);
        this.f24778a = rVar2.A();
        rVar.H(12);
        this.f24786i = rVar.A();
        AbstractC1002u1.h("first_chunk must be 1", rVar.i() == 1);
        this.f24779b = -1;
    }

    public final boolean a() {
        long y9;
        int i9;
        int i10 = this.f24779b + 1;
        this.f24779b = i10;
        if (i10 == this.f24778a) {
            return false;
        }
        boolean z9 = this.f24782e;
        A4.r rVar = this.f24783f;
        if (z9) {
            y9 = rVar.B();
        } else {
            y9 = rVar.y();
        }
        this.f24781d = y9;
        if (this.f24779b == this.f24785h) {
            A4.r rVar2 = this.f24784g;
            this.f24780c = rVar2.A();
            rVar2.I(4);
            int i11 = this.f24786i - 1;
            this.f24786i = i11;
            if (i11 > 0) {
                i9 = rVar2.A() - 1;
            } else {
                i9 = -1;
            }
            this.f24785h = i9;
        }
        return true;
    }
}
