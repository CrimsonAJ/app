package u0;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class N extends S {

    /* renamed from: s, reason: collision with root package name */
    public final Class f23438s;

    public N(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.f23438s = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // u0.S, u0.T
    public final String b() {
        return this.f23438s.getName();
    }

    @Override // u0.S
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Enum d(String value) {
        Object obj;
        kotlin.jvm.internal.h.e(value, "value");
        Class cls = this.f23438s;
        Object[] enumConstants = cls.getEnumConstants();
        kotlin.jvm.internal.h.d(enumConstants, "type.enumConstants");
        int length = enumConstants.length;
        int i9 = 0;
        while (true) {
            if (i9 < length) {
                obj = enumConstants[i9];
                if (W7.l.H(((Enum) obj).name(), value, true)) {
                    break;
                }
                i9++;
            } else {
                obj = null;
                break;
            }
        }
        Enum r42 = (Enum) obj;
        if (r42 != null) {
            return r42;
        }
        StringBuilder r5 = AbstractC0953k1.r("Enum value ", value, " not found for type ");
        r5.append(cls.getName());
        r5.append('.');
        throw new IllegalArgumentException(r5.toString());
    }
}
