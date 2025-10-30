package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.cast.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0851n0 extends AbstractC0815e0 {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f14926d;

    public C0851n0(Object obj) {
        this.f14926d = obj;
    }

    @Override // com.google.android.gms.internal.cast.Z
    public final int b(Object[] objArr) {
        objArr[0] = this.f14926d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f14926d.equals(obj);
    }

    @Override // com.google.android.gms.internal.cast.AbstractC0815e0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f14926d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C0819f0(this.f14926d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return A0.a.n("[", this.f14926d.toString(), "]");
    }
}
