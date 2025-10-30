package P5;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class E extends F {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f5898c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f5899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F f5900e;

    public E(F f9, int i9, int i10) {
        this.f5900e = f9;
        this.f5898c = i9;
        this.f5899d = i10;
    }

    @Override // P5.A
    public final Object[] d() {
        return this.f5900e.d();
    }

    @Override // P5.A
    public final int e() {
        return this.f5900e.f() + this.f5898c + this.f5899d;
    }

    @Override // P5.A
    public final int f() {
        return this.f5900e.f() + this.f5898c;
    }

    @Override // P5.A
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        O4.h.f(i9, this.f5899d);
        return this.f5900e.get(i9 + this.f5898c);
    }

    @Override // P5.F, P5.A, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // P5.F, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5899d;
    }

    @Override // P5.F, java.util.List
    /* renamed from: u */
    public final F subList(int i9, int i10) {
        O4.h.i(i9, i10, this.f5899d);
        int i11 = this.f5898c;
        return this.f5900e.subList(i9 + i11, i10 + i11);
    }

    @Override // P5.F, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i9) {
        return listIterator(i9);
    }
}
