package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0976p implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15564a;

    /* renamed from: b, reason: collision with root package name */
    public int f15565b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15566c;

    public /* synthetic */ C0976p(int i9, Object obj) {
        this.f15564a = i9;
        this.f15566c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15564a) {
            case 0:
                if (this.f15565b < ((C0981q) this.f15566c).f15572a.length()) {
                    return true;
                }
                return false;
            case 1:
                if (this.f15565b < ((C0981q) this.f15566c).f15572a.length()) {
                    return true;
                }
                return false;
            default:
                if (this.f15565b < ((C0916d) this.f15566c).p()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.f15564a) {
            case 0:
                int i9 = this.f15565b;
                if (i9 < ((C0981q) this.f15566c).f15572a.length()) {
                    this.f15565b = i9 + 1;
                    return new C0981q(String.valueOf(i9));
                }
                throw new NoSuchElementException();
            case 1:
                int i10 = this.f15565b;
                C0981q c0981q = (C0981q) this.f15566c;
                if (i10 < c0981q.f15572a.length()) {
                    this.f15565b = i10 + 1;
                    return new C0981q(String.valueOf(c0981q.f15572a.charAt(i10)));
                }
                throw new NoSuchElementException();
            default:
                int i11 = this.f15565b;
                C0916d c0916d = (C0916d) this.f15566c;
                if (i11 < c0916d.p()) {
                    int i12 = this.f15565b;
                    this.f15565b = i12 + 1;
                    return c0916d.q(i12);
                }
                throw new NoSuchElementException(AbstractC0953k1.j(this.f15565b, "Out of bounds index: "));
        }
    }
}
