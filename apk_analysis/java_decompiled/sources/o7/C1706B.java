package o7;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Set;
import k4.C1499E;

/* renamed from: o7.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1706B extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final Class f21643a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f21644b;

    /* renamed from: c, reason: collision with root package name */
    public final Enum[] f21645c;

    /* renamed from: d, reason: collision with root package name */
    public final C1499E f21646d;

    public C1706B(Class cls) {
        this.f21643a = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.f21645c = enumArr;
            this.f21644b = new String[enumArr.length];
            int i9 = 0;
            while (true) {
                Enum[] enumArr2 = this.f21645c;
                if (i9 < enumArr2.length) {
                    String name = enumArr2[i9].name();
                    String[] strArr = this.f21644b;
                    Field field = cls.getField(name);
                    Set set = p7.e.f22206a;
                    InterfaceC1717i interfaceC1717i = (InterfaceC1717i) field.getAnnotation(InterfaceC1717i.class);
                    if (interfaceC1717i != null) {
                        String name2 = interfaceC1717i.name();
                        if (!"\u0000".equals(name2)) {
                            name = name2;
                        }
                    }
                    strArr[i9] = name;
                    i9++;
                } else {
                    this.f21646d = C1499E.o(this.f21644b);
                    return;
                }
            }
        } catch (NoSuchFieldException e8) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e8);
        }
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n abstractC1722n) {
        int i9;
        C1723o c1723o = (C1723o) abstractC1722n;
        int i10 = c1723o.f21698g;
        if (i10 == 0) {
            i10 = c1723o.m0();
        }
        if (i10 >= 8 && i10 <= 11) {
            C1499E c1499e = this.f21646d;
            if (i10 == 11) {
                i9 = c1723o.o0(c1723o.j, c1499e);
            } else {
                int Q7 = c1723o.f21696e.Q((x8.x) c1499e.f19986c);
                if (Q7 != -1) {
                    c1723o.f21698g = 0;
                    int[] iArr = c1723o.f21690d;
                    int i11 = c1723o.f21687a - 1;
                    iArr[i11] = iArr[i11] + 1;
                    i9 = Q7;
                } else {
                    String S8 = c1723o.S();
                    int o02 = c1723o.o0(S8, c1499e);
                    if (o02 == -1) {
                        c1723o.f21698g = 11;
                        c1723o.j = S8;
                        c1723o.f21690d[c1723o.f21687a - 1] = r1[r0] - 1;
                    }
                    i9 = o02;
                }
            }
        } else {
            i9 = -1;
        }
        if (i9 != -1) {
            return this.f21645c[i9];
        }
        String x5 = abstractC1722n.x();
        throw new RuntimeException("Expected one of " + Arrays.asList(this.f21644b) + " but was " + abstractC1722n.S() + " at path " + x5);
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q abstractC1725q, Object obj) {
        abstractC1725q.O(this.f21644b[((Enum) obj).ordinal()]);
    }

    public final String toString() {
        return "JsonAdapter(" + this.f21643a.getName() + ")";
    }
}
