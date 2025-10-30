package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class D extends AbstractC1031b implements E, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16296b;

    static {
        new D(10).f16338a = false;
    }

    public D(int i9) {
        this(new ArrayList(i9));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        b();
        this.f16296b.add(i9, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1031b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f16296b.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1031b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f16296b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        String str;
        ArrayList arrayList = this.f16296b;
        Object obj = arrayList.get(i9);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1037h) {
            AbstractC1037h abstractC1037h = (AbstractC1037h) obj;
            abstractC1037h.getClass();
            Charset charset = AbstractC1054z.f16405a;
            if (abstractC1037h.size() == 0) {
                str = "";
            } else {
                C1036g c1036g = (C1036g) abstractC1037h;
                str = new String(c1036g.f16354d, c1036g.g(), c1036g.size(), charset);
            }
            C1036g c1036g2 = (C1036g) abstractC1037h;
            int g9 = c1036g2.g();
            if (q0.f16400a.L(c1036g2.f16354d, g9, c1036g2.size() + g9)) {
                arrayList.set(i9, str);
            }
            return str;
        }
        byte[] bArr = (byte[]) obj;
        String str2 = new String(bArr, AbstractC1054z.f16405a);
        s8.e eVar = q0.f16400a;
        if (q0.f16400a.L(bArr, 0, bArr.length)) {
            arrayList.set(i9, str2);
        }
        return str2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC1053y
    public final InterfaceC1053y h(int i9) {
        ArrayList arrayList = this.f16296b;
        if (i9 >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i9);
            arrayList2.addAll(arrayList);
            return new D(arrayList2);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public final void j(AbstractC1037h abstractC1037h) {
        b();
        this.f16296b.add(abstractC1037h);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public final E l() {
        if (this.f16338a) {
            return new i0(this);
        }
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public final Object m(int i9) {
        return this.f16296b.get(i9);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public final List n() {
        return Collections.unmodifiableList(this.f16296b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1031b, java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        b();
        Object remove = this.f16296b.remove(i9);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof AbstractC1037h) {
            AbstractC1037h abstractC1037h = (AbstractC1037h) remove;
            abstractC1037h.getClass();
            Charset charset = AbstractC1054z.f16405a;
            if (abstractC1037h.size() == 0) {
                return "";
            }
            C1036g c1036g = (C1036g) abstractC1037h;
            return new String(c1036g.f16354d, c1036g.g(), c1036g.size(), charset);
        }
        return new String((byte[]) remove, AbstractC1054z.f16405a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        b();
        Object obj2 = this.f16296b.set(i9, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof AbstractC1037h) {
            AbstractC1037h abstractC1037h = (AbstractC1037h) obj2;
            abstractC1037h.getClass();
            Charset charset = AbstractC1054z.f16405a;
            if (abstractC1037h.size() == 0) {
                return "";
            }
            C1036g c1036g = (C1036g) abstractC1037h;
            return new String(c1036g.f16354d, c1036g.g(), c1036g.size(), charset);
        }
        return new String((byte[]) obj2, AbstractC1054z.f16405a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16296b.size();
    }

    public D(ArrayList arrayList) {
        this.f16296b = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1031b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection collection) {
        b();
        if (collection instanceof E) {
            collection = ((E) collection).n();
        }
        boolean addAll = this.f16296b.addAll(i9, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
