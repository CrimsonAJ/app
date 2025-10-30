package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class i0 extends AbstractList implements E, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final D f16367a;

    public i0(D d9) {
        this.f16367a = d9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        return (String) this.f16367a.get(i9);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, java.lang.Object, com.google.crypto.tink.shaded.protobuf.h0] */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        ?? obj = new Object();
        obj.f16359a = this.f16367a.iterator();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public final void j(AbstractC1037h abstractC1037h) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public final E l() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ListIterator, com.google.crypto.tink.shaded.protobuf.g0, java.lang.Object] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        ?? obj = new Object();
        obj.f16355a = this.f16367a.listIterator(i9);
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public final Object m(int i9) {
        return this.f16367a.f16296b.get(i9);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public final List n() {
        return Collections.unmodifiableList(this.f16367a.f16296b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16367a.size();
    }
}
