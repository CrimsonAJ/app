package B7;

import B6.u0;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class B implements Iterator, P7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1101a;

    /* renamed from: b, reason: collision with root package name */
    public int f1102b;

    /* renamed from: c, reason: collision with root package name */
    public int f1103c;

    /* renamed from: d, reason: collision with root package name */
    public int f1104d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1106f;

    public B(C c3) {
        this.f1101a = 0;
        this.f1106f = c3;
        this.f1103c = c3.f1110d;
        this.f1104d = c3.f1109c;
    }

    public void a() {
        int i9 = this.f1104d;
        int i10 = 0;
        if (i9 < 0) {
            this.f1102b = 0;
            this.f1105e = null;
            return;
        }
        V7.i iVar = (V7.i) this.f1106f;
        iVar.getClass();
        String str = (String) iVar.f7833c;
        if (i9 > str.length()) {
            this.f1105e = new T7.a(this.f1103c, W7.d.P(str), 1);
            this.f1104d = -1;
        } else {
            A7.h hVar = (A7.h) ((O7.p) iVar.f7832b).invoke(str, Integer.valueOf(this.f1104d));
            if (hVar == null) {
                this.f1105e = new T7.a(this.f1103c, W7.d.P(str), 1);
                this.f1104d = -1;
            } else {
                int intValue = ((Number) hVar.f547a).intValue();
                int intValue2 = ((Number) hVar.f548b).intValue();
                this.f1105e = u0.N(this.f1103c, intValue);
                int i11 = intValue + intValue2;
                this.f1103c = i11;
                if (intValue2 == 0) {
                    i10 = 1;
                }
                this.f1104d = i11 + i10;
            }
        }
        this.f1102b = 1;
    }

    public boolean b() {
        this.f1102b = 3;
        int i9 = this.f1103c;
        if (i9 == 0) {
            this.f1102b = 2;
        } else {
            C c3 = (C) this.f1106f;
            Object[] objArr = c3.f1107a;
            int i10 = this.f1104d;
            this.f1105e = objArr[i10];
            this.f1102b = 1;
            this.f1104d = (i10 + 1) % c3.f1108b;
            this.f1103c = i9 - 1;
        }
        if (this.f1102b == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1101a) {
            case 0:
                int i9 = this.f1102b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        return true;
                    }
                    if (i9 == 2) {
                        return false;
                    }
                    throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
                }
                return b();
            default:
                if (this.f1102b == -1) {
                    a();
                }
                if (this.f1102b == 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1101a) {
            case 0:
                int i9 = this.f1102b;
                if (i9 == 1) {
                    this.f1102b = 0;
                    return this.f1105e;
                }
                if (i9 != 2 && b()) {
                    this.f1102b = 0;
                    return this.f1105e;
                }
                throw new NoSuchElementException();
            default:
                if (this.f1102b == -1) {
                    a();
                }
                if (this.f1102b != 0) {
                    T7.c cVar = (T7.c) this.f1105e;
                    kotlin.jvm.internal.h.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                    this.f1105e = null;
                    this.f1102b = -1;
                    return cVar;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1101a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public B(V7.i iVar) {
        this.f1101a = 1;
        this.f1106f = iVar;
        this.f1102b = -1;
        iVar.getClass();
        int length = ((String) iVar.f7833c).length();
        if (length >= 0) {
            length = length >= 0 ? 0 : length;
            this.f1103c = length;
            this.f1104d = length;
            return;
        }
        throw new IllegalArgumentException(A0.a.m("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
    }
}
