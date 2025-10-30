package o7;

import F0.C0120y;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

/* renamed from: o7.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1729u extends AbstractMap implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final B.j f21726i = new B.j(15);

    /* renamed from: g, reason: collision with root package name */
    public C1727s f21733g;

    /* renamed from: h, reason: collision with root package name */
    public C1727s f21734h;

    /* renamed from: d, reason: collision with root package name */
    public int f21730d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f21731e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f21727a = f21726i;

    /* renamed from: c, reason: collision with root package name */
    public final C1728t f21729c = new C1728t();

    /* renamed from: b, reason: collision with root package name */
    public C1728t[] f21728b = new C1728t[16];

    /* renamed from: f, reason: collision with root package name */
    public int f21732f = 12;

    public final C1728t a(Object obj, boolean z9) {
        int i9;
        C1728t c1728t;
        boolean z10;
        C1728t c1728t2;
        C1728t c1728t3;
        C1728t c1728t4;
        C1728t c1728t5;
        C1728t c1728t6;
        Comparable comparable;
        C1728t c1728t7;
        C1728t[] c1728tArr = this.f21728b;
        int hashCode = obj.hashCode();
        int i10 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i11 = ((i10 >>> 7) ^ i10) ^ (i10 >>> 4);
        boolean z11 = true;
        int length = i11 & (c1728tArr.length - 1);
        C1728t c1728t8 = c1728tArr[length];
        B.j jVar = f21726i;
        C1728t c1728t9 = null;
        Comparator comparator = this.f21727a;
        if (c1728t8 != null) {
            if (comparator == jVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = c1728t8.f21722f;
                if (comparable != null) {
                    i9 = comparable.compareTo(obj2);
                } else {
                    i9 = comparator.compare(obj, obj2);
                }
                if (i9 == 0) {
                    return c1728t8;
                }
                if (i9 < 0) {
                    c1728t7 = c1728t8.f21718b;
                } else {
                    c1728t7 = c1728t8.f21719c;
                }
                if (c1728t7 == null) {
                    break;
                }
                c1728t8 = c1728t7;
            }
        } else {
            i9 = 0;
        }
        if (!z9) {
            return null;
        }
        C1728t c1728t10 = this.f21729c;
        if (c1728t8 == null) {
            if (comparator == jVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            c1728t = new C1728t(c1728t8, obj, i11, c1728t10, c1728t10.f21721e);
            c1728tArr[length] = c1728t;
        } else {
            C1728t c1728t11 = c1728t8;
            c1728t = new C1728t(c1728t11, obj, i11, c1728t10, c1728t10.f21721e);
            if (i9 < 0) {
                c1728t11.f21718b = c1728t;
            } else {
                c1728t11.f21719c = c1728t;
            }
            b(c1728t11, true);
        }
        int i12 = this.f21730d;
        this.f21730d = i12 + 1;
        if (i12 > this.f21732f) {
            C1728t[] c1728tArr2 = this.f21728b;
            int length2 = c1728tArr2.length;
            int i13 = length2 * 2;
            C1728t[] c1728tArr3 = new C1728t[i13];
            C0120y c0120y = new C0120y(3);
            C0120y c0120y2 = new C0120y(3);
            int i14 = 0;
            while (i14 < length2) {
                C1728t c1728t12 = c1728tArr2[i14];
                if (c1728t12 == null) {
                    z10 = z11;
                    c1728t3 = c1728t9;
                } else {
                    C1728t c1728t13 = c1728t9;
                    for (C1728t c1728t14 = c1728t12; c1728t14 != null; c1728t14 = c1728t14.f21718b) {
                        c1728t14.f21717a = c1728t13;
                        c1728t13 = c1728t14;
                    }
                    int i15 = 0;
                    int i16 = 0;
                    while (true) {
                        if (c1728t13 == null) {
                            C1728t c1728t15 = c1728t13;
                            c1728t13 = c1728t9;
                            c1728t2 = c1728t15;
                            z10 = z11;
                        } else {
                            z10 = z11;
                            C1728t c1728t16 = c1728t13.f21717a;
                            c1728t13.f21717a = c1728t9;
                            C1728t c1728t17 = c1728t13.f21719c;
                            while (true) {
                                C1728t c1728t18 = c1728t17;
                                c1728t2 = c1728t16;
                                c1728t16 = c1728t18;
                                if (c1728t16 == null) {
                                    break;
                                }
                                c1728t16.f21717a = c1728t2;
                                c1728t17 = c1728t16.f21718b;
                            }
                        }
                        if (c1728t13 == null) {
                            break;
                        }
                        if ((c1728t13.f21723g & length2) == 0) {
                            i15++;
                        } else {
                            i16++;
                        }
                        c1728t13 = c1728t2;
                        z11 = z10;
                        c1728t9 = null;
                    }
                    c0120y.f2290b = ((Integer.highestOneBit(i15) * 2) - 1) - i15;
                    c0120y.f2292d = 0;
                    c0120y.f2291c = 0;
                    c1728t3 = null;
                    c0120y.f2293e = null;
                    c0120y2.f2290b = ((Integer.highestOneBit(i16) * 2) - 1) - i16;
                    c0120y2.f2292d = 0;
                    c0120y2.f2291c = 0;
                    c0120y2.f2293e = null;
                    C1728t c1728t19 = null;
                    while (c1728t12 != null) {
                        c1728t12.f21717a = c1728t19;
                        C1728t c1728t20 = c1728t12;
                        c1728t12 = c1728t12.f21718b;
                        c1728t19 = c1728t20;
                    }
                    while (true) {
                        if (c1728t19 == null) {
                            c1728t4 = c1728t19;
                            c1728t19 = null;
                        } else {
                            C1728t c1728t21 = c1728t19.f21717a;
                            c1728t19.f21717a = null;
                            C1728t c1728t22 = c1728t19.f21719c;
                            while (true) {
                                C1728t c1728t23 = c1728t22;
                                c1728t4 = c1728t21;
                                c1728t21 = c1728t23;
                                if (c1728t21 == null) {
                                    break;
                                }
                                c1728t21.f21717a = c1728t4;
                                c1728t22 = c1728t21.f21718b;
                            }
                        }
                        if (c1728t19 == null) {
                            break;
                        }
                        if ((c1728t19.f21723g & length2) == 0) {
                            c0120y.a(c1728t19);
                        } else {
                            c0120y2.a(c1728t19);
                        }
                        c1728t19 = c1728t4;
                    }
                    if (i15 > 0) {
                        c1728t5 = (C1728t) c0120y.f2293e;
                        if (c1728t5.f21717a != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        c1728t5 = null;
                    }
                    c1728tArr3[i14] = c1728t5;
                    int i17 = i14 + length2;
                    if (i16 > 0) {
                        c1728t6 = (C1728t) c0120y2.f2293e;
                        if (c1728t6.f21717a != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        c1728t6 = null;
                    }
                    c1728tArr3[i17] = c1728t6;
                }
                i14++;
                c1728t9 = c1728t3;
                z11 = z10;
            }
            this.f21728b = c1728tArr3;
            this.f21732f = (i13 / 4) + (i13 / 2);
        }
        this.f21731e++;
        return c1728t;
    }

    public final void b(C1728t c1728t, boolean z9) {
        int i9;
        int i10;
        int i11;
        int i12;
        while (c1728t != null) {
            C1728t c1728t2 = c1728t.f21718b;
            C1728t c1728t3 = c1728t.f21719c;
            int i13 = 0;
            if (c1728t2 != null) {
                i9 = c1728t2.f21725i;
            } else {
                i9 = 0;
            }
            if (c1728t3 != null) {
                i10 = c1728t3.f21725i;
            } else {
                i10 = 0;
            }
            int i14 = i9 - i10;
            if (i14 == -2) {
                C1728t c1728t4 = c1728t3.f21718b;
                C1728t c1728t5 = c1728t3.f21719c;
                if (c1728t5 != null) {
                    i12 = c1728t5.f21725i;
                } else {
                    i12 = 0;
                }
                if (c1728t4 != null) {
                    i13 = c1728t4.f21725i;
                }
                int i15 = i13 - i12;
                if (i15 != -1 && (i15 != 0 || z9)) {
                    f(c1728t3);
                }
                e(c1728t);
                if (z9) {
                    return;
                }
            } else if (i14 == 2) {
                C1728t c1728t6 = c1728t2.f21718b;
                C1728t c1728t7 = c1728t2.f21719c;
                if (c1728t7 != null) {
                    i11 = c1728t7.f21725i;
                } else {
                    i11 = 0;
                }
                if (c1728t6 != null) {
                    i13 = c1728t6.f21725i;
                }
                int i16 = i13 - i11;
                if (i16 != 1 && (i16 != 0 || z9)) {
                    e(c1728t2);
                }
                f(c1728t);
                if (z9) {
                    return;
                }
            } else if (i14 == 0) {
                c1728t.f21725i = i9 + 1;
                if (z9) {
                    return;
                }
            } else {
                c1728t.f21725i = Math.max(i9, i10) + 1;
                if (!z9) {
                    return;
                }
            }
            c1728t = c1728t.f21717a;
        }
    }

    public final void c(C1728t c1728t, boolean z9) {
        C1728t c1728t2;
        C1728t c1728t3;
        int i9;
        if (z9) {
            C1728t c1728t4 = c1728t.f21721e;
            c1728t4.f21720d = c1728t.f21720d;
            c1728t.f21720d.f21721e = c1728t4;
            c1728t.f21721e = null;
            c1728t.f21720d = null;
        }
        C1728t c1728t5 = c1728t.f21718b;
        C1728t c1728t6 = c1728t.f21719c;
        C1728t c1728t7 = c1728t.f21717a;
        int i10 = 0;
        if (c1728t5 != null && c1728t6 != null) {
            if (c1728t5.f21725i > c1728t6.f21725i) {
                C1728t c1728t8 = c1728t5.f21719c;
                while (true) {
                    C1728t c1728t9 = c1728t8;
                    c1728t3 = c1728t5;
                    c1728t5 = c1728t9;
                    if (c1728t5 == null) {
                        break;
                    } else {
                        c1728t8 = c1728t5.f21719c;
                    }
                }
            } else {
                C1728t c1728t10 = c1728t6.f21718b;
                while (true) {
                    c1728t2 = c1728t6;
                    c1728t6 = c1728t10;
                    if (c1728t6 == null) {
                        break;
                    } else {
                        c1728t10 = c1728t6.f21718b;
                    }
                }
                c1728t3 = c1728t2;
            }
            c(c1728t3, false);
            C1728t c1728t11 = c1728t.f21718b;
            if (c1728t11 != null) {
                i9 = c1728t11.f21725i;
                c1728t3.f21718b = c1728t11;
                c1728t11.f21717a = c1728t3;
                c1728t.f21718b = null;
            } else {
                i9 = 0;
            }
            C1728t c1728t12 = c1728t.f21719c;
            if (c1728t12 != null) {
                i10 = c1728t12.f21725i;
                c1728t3.f21719c = c1728t12;
                c1728t12.f21717a = c1728t3;
                c1728t.f21719c = null;
            }
            c1728t3.f21725i = Math.max(i9, i10) + 1;
            d(c1728t, c1728t3);
            return;
        }
        if (c1728t5 != null) {
            d(c1728t, c1728t5);
            c1728t.f21718b = null;
        } else if (c1728t6 != null) {
            d(c1728t, c1728t6);
            c1728t.f21719c = null;
        } else {
            d(c1728t, null);
        }
        b(c1728t7, false);
        this.f21730d--;
        this.f21731e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f21728b, (Object) null);
        this.f21730d = 0;
        this.f21731e++;
        C1728t c1728t = this.f21729c;
        C1728t c1728t2 = c1728t.f21720d;
        while (c1728t2 != c1728t) {
            C1728t c1728t3 = c1728t2.f21720d;
            c1728t2.f21721e = null;
            c1728t2.f21720d = null;
            c1728t2 = c1728t3;
        }
        c1728t.f21721e = c1728t;
        c1728t.f21720d = c1728t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C1728t c1728t = null;
        if (obj != null) {
            try {
                c1728t = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (c1728t == null) {
            return false;
        }
        return true;
    }

    public final void d(C1728t c1728t, C1728t c1728t2) {
        C1728t c1728t3 = c1728t.f21717a;
        c1728t.f21717a = null;
        if (c1728t2 != null) {
            c1728t2.f21717a = c1728t3;
        }
        if (c1728t3 != null) {
            if (c1728t3.f21718b == c1728t) {
                c1728t3.f21718b = c1728t2;
                return;
            } else {
                c1728t3.f21719c = c1728t2;
                return;
            }
        }
        this.f21728b[c1728t.f21723g & (r0.length - 1)] = c1728t2;
    }

    public final void e(C1728t c1728t) {
        int i9;
        int i10;
        C1728t c1728t2 = c1728t.f21718b;
        C1728t c1728t3 = c1728t.f21719c;
        C1728t c1728t4 = c1728t3.f21718b;
        C1728t c1728t5 = c1728t3.f21719c;
        c1728t.f21719c = c1728t4;
        if (c1728t4 != null) {
            c1728t4.f21717a = c1728t;
        }
        d(c1728t, c1728t3);
        c1728t3.f21718b = c1728t;
        c1728t.f21717a = c1728t3;
        int i11 = 0;
        if (c1728t2 != null) {
            i9 = c1728t2.f21725i;
        } else {
            i9 = 0;
        }
        if (c1728t4 != null) {
            i10 = c1728t4.f21725i;
        } else {
            i10 = 0;
        }
        int max = Math.max(i9, i10) + 1;
        c1728t.f21725i = max;
        if (c1728t5 != null) {
            i11 = c1728t5.f21725i;
        }
        c1728t3.f21725i = Math.max(max, i11) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C1727s c1727s = this.f21733g;
        if (c1727s != null) {
            return c1727s;
        }
        C1727s c1727s2 = new C1727s(this, 0);
        this.f21733g = c1727s2;
        return c1727s2;
    }

    public final void f(C1728t c1728t) {
        int i9;
        int i10;
        C1728t c1728t2 = c1728t.f21718b;
        C1728t c1728t3 = c1728t.f21719c;
        C1728t c1728t4 = c1728t2.f21718b;
        C1728t c1728t5 = c1728t2.f21719c;
        c1728t.f21718b = c1728t5;
        if (c1728t5 != null) {
            c1728t5.f21717a = c1728t;
        }
        d(c1728t, c1728t2);
        c1728t2.f21719c = c1728t;
        c1728t.f21717a = c1728t2;
        int i11 = 0;
        if (c1728t3 != null) {
            i9 = c1728t3.f21725i;
        } else {
            i9 = 0;
        }
        if (c1728t5 != null) {
            i10 = c1728t5.f21725i;
        } else {
            i10 = 0;
        }
        int max = Math.max(i9, i10) + 1;
        c1728t.f21725i = max;
        if (c1728t4 != null) {
            i11 = c1728t4.f21725i;
        }
        c1728t2.f21725i = Math.max(max, i11) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            o7.t r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto Lf
            java.lang.Object r3 = r3.f21724h
            return r3
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.C1729u.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C1727s c1727s = this.f21734h;
        if (c1727s != null) {
            return c1727s;
        }
        C1727s c1727s2 = new C1727s(this, 1);
        this.f21734h = c1727s2;
        return c1727s2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            C1728t a5 = a(obj, true);
            Object obj3 = a5.f21724h;
            a5.f21724h = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            o7.t r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.c(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r3 = r3.f21724h
            return r3
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.C1729u.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f21730d;
    }
}
