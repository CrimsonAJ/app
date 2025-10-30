package j3;

import java.util.Locale;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class m0 implements InterfaceC1453f {

    /* renamed from: d, reason: collision with root package name */
    public static final m0 f19693d = new m0(1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f19694a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19695b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19696c;

    public m0(float f9) {
        this(f9, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.f19694a == m0Var.f19694a && this.f19695b == m0Var.f19695b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f19695b) + ((Float.floatToRawIntBits(this.f19694a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f19694a), Float.valueOf(this.f19695b)};
        int i9 = l4.y.f20553a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public m0(float f9, float f10) {
        AbstractC1566a.h(f9 > 0.0f);
        AbstractC1566a.h(f10 > 0.0f);
        this.f19694a = f9;
        this.f19695b = f10;
        this.f19696c = Math.round(f9 * 1000.0f);
    }
}
