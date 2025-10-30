package s;

import java.util.ConcurrentModificationException;
import t.AbstractC1964a;

/* renamed from: s.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1938h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f22656a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f22657b = new Object();

    public static final void a(C1940j c1940j) {
        int i9 = c1940j.f22664d;
        int[] iArr = c1940j.f22662b;
        Object[] objArr = c1940j.f22663c;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            Object obj = objArr[i11];
            if (obj != f22657b) {
                if (i11 != i10) {
                    iArr[i10] = iArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        c1940j.f22661a = false;
        c1940j.f22664d = i10;
    }

    public static final void b(C1936f c1936f, int i9) {
        kotlin.jvm.internal.h.e(c1936f, "<this>");
        c1936f.f22649a = new int[i9];
        c1936f.f22650b = new Object[i9];
    }

    public static final int c(C1936f c1936f, Object obj, int i9) {
        kotlin.jvm.internal.h.e(c1936f, "<this>");
        int i10 = c1936f.f22651c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int a5 = AbstractC1964a.a(c1936f.f22651c, i9, c1936f.f22649a);
            if (a5 < 0 || kotlin.jvm.internal.h.a(obj, c1936f.f22650b[a5])) {
                return a5;
            }
            int i11 = a5 + 1;
            while (i11 < i10 && c1936f.f22649a[i11] == i9) {
                if (kotlin.jvm.internal.h.a(obj, c1936f.f22650b[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a5 - 1; i12 >= 0 && c1936f.f22649a[i12] == i9; i12--) {
                if (kotlin.jvm.internal.h.a(obj, c1936f.f22650b[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
