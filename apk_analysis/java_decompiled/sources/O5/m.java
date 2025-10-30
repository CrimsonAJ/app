package O5;

import A3.E;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o1.C1671f;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class m implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public String f5499b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f5500c;

    /* renamed from: d, reason: collision with root package name */
    public final d f5501d;

    /* renamed from: f, reason: collision with root package name */
    public int f5503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1671f f5504g;

    /* renamed from: a, reason: collision with root package name */
    public int f5498a = 2;

    /* renamed from: e, reason: collision with root package name */
    public int f5502e = 0;

    public m(C1671f c1671f, E e8, CharSequence charSequence) {
        this.f5504g = c1671f;
        this.f5501d = (d) e8.f47c;
        this.f5503f = e8.f46b;
        this.f5500c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i9 = this.f5498a;
        if (i9 != 4) {
            int b9 = AbstractC2128h.b(i9);
            if (b9 == 0) {
                return true;
            }
            if (b9 != 2) {
                this.f5498a = 4;
                int i10 = this.f5502e;
                while (true) {
                    int i11 = this.f5502e;
                    if (i11 != -1) {
                        c cVar = (c) this.f5504g.f21473b;
                        CharSequence charSequence = this.f5500c;
                        int length = charSequence.length();
                        O4.h.h(i11, length);
                        while (true) {
                            if (i11 < length) {
                                if (cVar.a(charSequence.charAt(i11))) {
                                    break;
                                }
                                i11++;
                            } else {
                                i11 = -1;
                                break;
                            }
                        }
                        if (i11 == -1) {
                            i11 = charSequence.length();
                            this.f5502e = -1;
                        } else {
                            this.f5502e = i11 + 1;
                        }
                        int i12 = this.f5502e;
                        if (i12 == i10) {
                            int i13 = i12 + 1;
                            this.f5502e = i13;
                            if (i13 > charSequence.length()) {
                                this.f5502e = -1;
                            }
                        } else {
                            d dVar = this.f5501d;
                            if (i10 < i11) {
                                charSequence.charAt(i10);
                                dVar.getClass();
                            }
                            if (i11 > i10) {
                                charSequence.charAt(i11 - 1);
                                dVar.getClass();
                            }
                            int i14 = this.f5503f;
                            if (i14 == 1) {
                                i11 = charSequence.length();
                                this.f5502e = -1;
                                if (i11 > i10) {
                                    charSequence.charAt(i11 - 1);
                                    dVar.getClass();
                                }
                            } else {
                                this.f5503f = i14 - 1;
                            }
                            str = charSequence.subSequence(i10, i11).toString();
                        }
                    } else {
                        this.f5498a = 3;
                        str = null;
                        break;
                    }
                }
                this.f5499b = str;
                if (this.f5498a != 3) {
                    this.f5498a = 1;
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f5498a = 2;
            String str = this.f5499b;
            this.f5499b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
