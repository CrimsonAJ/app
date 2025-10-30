package com.google.android.gms.internal.cast;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.cast.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0827h0 extends AbstractC0807c0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0831i0 f14854c;

    public C0827h0(C0831i0 c0831i0) {
        this.f14854c = c0831i0;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i9) {
        C0831i0 c0831i0 = this.f14854c;
        J.i(i9, c0831i0.f14863f);
        int i10 = i9 + i9;
        Object[] objArr = c0831i0.f14862e;
        Object obj = objArr[i10];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i10 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14854c.f14863f;
    }
}
