package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class h0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f16359a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16359a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f16359a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
