package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.cast.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0831i0 extends AbstractC0815e0 {

    /* renamed from: d, reason: collision with root package name */
    public final transient C0843l0 f14861d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f14862e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f14863f;

    public C0831i0(C0843l0 c0843l0, Object[] objArr, int i9) {
        this.f14861d = c0843l0;
        this.f14862e = objArr;
        this.f14863f = i9;
    }

    @Override // com.google.android.gms.internal.cast.Z
    public final int b(Object[] objArr) {
        AbstractC0807c0 abstractC0807c0 = this.f14827b;
        if (abstractC0807c0 == null) {
            abstractC0807c0 = i();
            this.f14827b = abstractC0807c0;
        }
        return abstractC0807c0.b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f14861d.get(key))) {
                return true;
            }
        }
        return false;
    }

    public final AbstractC0807c0 i() {
        return new C0827h0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC0807c0 abstractC0807c0 = this.f14827b;
        if (abstractC0807c0 == null) {
            abstractC0807c0 = i();
            this.f14827b = abstractC0807c0;
        }
        return abstractC0807c0.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14863f;
    }
}
