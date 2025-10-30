package com.google.android.gms.internal.cast;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.cast.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0799a0 extends AbstractC0855o0 implements ListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final int f14802a;

    /* renamed from: b, reason: collision with root package name */
    public int f14803b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0807c0 f14804c;

    public C0799a0(AbstractC0807c0 abstractC0807c0, int i9) {
        int size = abstractC0807c0.size();
        J.l(i9, size);
        this.f14802a = size;
        this.f14803b = i9;
        this.f14804c = abstractC0807c0;
    }

    public final Object a(int i9) {
        return this.f14804c.get(i9);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f14803b < this.f14802a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f14803b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i9 = this.f14803b;
            this.f14803b = i9 + 1;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14803b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i9 = this.f14803b - 1;
            this.f14803b = i9;
            return a(i9);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14803b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
