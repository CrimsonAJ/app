package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0911c implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f15448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f15449b;

    public C0911c(Iterator it, Iterator it2) {
        this.f15448a = it;
        this.f15449b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15448a.hasNext()) {
            return true;
        }
        return this.f15449b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f15448a;
        if (it.hasNext()) {
            return new C0981q(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f15449b;
        if (it2.hasNext()) {
            return new C0981q((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
