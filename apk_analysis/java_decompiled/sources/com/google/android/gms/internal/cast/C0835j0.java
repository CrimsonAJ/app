package com.google.android.gms.internal.cast;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.cast.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835j0 extends AbstractC0815e0 {

    /* renamed from: d, reason: collision with root package name */
    public final transient C0843l0 f14891d;

    /* renamed from: e, reason: collision with root package name */
    public final transient C0839k0 f14892e;

    public C0835j0(C0843l0 c0843l0, C0839k0 c0839k0) {
        this.f14891d = c0843l0;
        this.f14892e = c0839k0;
    }

    @Override // com.google.android.gms.internal.cast.Z
    public final int b(Object[] objArr) {
        return this.f14892e.b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f14891d.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f14892e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14891d.f14909f;
    }
}
