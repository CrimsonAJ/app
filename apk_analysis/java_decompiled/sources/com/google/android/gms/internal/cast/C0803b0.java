package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803b0 extends AbstractC0807c0 {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f14813c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f14814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0807c0 f14815e;

    public C0803b0(AbstractC0807c0 abstractC0807c0, int i9, int i10) {
        this.f14815e = abstractC0807c0;
        this.f14813c = i9;
        this.f14814d = i10;
    }

    @Override // com.google.android.gms.internal.cast.Z
    public final int c() {
        return this.f14815e.d() + this.f14813c + this.f14814d;
    }

    @Override // com.google.android.gms.internal.cast.Z
    public final int d() {
        return this.f14815e.d() + this.f14813c;
    }

    @Override // com.google.android.gms.internal.cast.Z
    public final Object[] e() {
        return this.f14815e.e();
    }

    @Override // com.google.android.gms.internal.cast.AbstractC0807c0, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final AbstractC0807c0 subList(int i9, int i10) {
        J.n(i9, i10, this.f14814d);
        int i11 = this.f14813c;
        return this.f14815e.subList(i9 + i11, i10 + i11);
    }

    @Override // java.util.List
    public final Object get(int i9) {
        J.i(i9, this.f14814d);
        return this.f14815e.get(i9 + this.f14813c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14814d;
    }
}
