package com.google.android.gms.internal.cast;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.cast.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0819f0 extends AbstractC0855o0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14841a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14842b;

    public C0819f0(Object obj) {
        this.f14841a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f14842b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f14842b) {
            this.f14842b = true;
            return this.f14841a;
        }
        throw new NoSuchElementException();
    }
}
