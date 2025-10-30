package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0941i implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f15498a;

    public C0941i(Iterator it) {
        this.f15498a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15498a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new C0981q((String) this.f15498a.next());
    }
}
