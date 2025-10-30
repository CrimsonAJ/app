package H7;

import B7.AbstractC0054e;
import java.io.Serializable;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class a extends AbstractC0054e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f3186a;

    public a(Enum[] enumArr) {
        this.f3186a = enumArr;
    }

    @Override // B7.AbstractC0054e
    public final int b() {
        return this.f3186a.length;
    }

    @Override // B7.AbstractC0054e, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        Enum r0;
        if (obj instanceof Enum) {
            Enum element = (Enum) obj;
            h.e(element, "element");
            Enum[] enumArr = this.f3186a;
            int ordinal = element.ordinal();
            if (ordinal >= 0 && ordinal < enumArr.length) {
                r0 = enumArr[ordinal];
            } else {
                r0 = null;
            }
            if (r0 == element) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        Enum[] enumArr = this.f3186a;
        int length = enumArr.length;
        if (i9 >= 0 && i9 < length) {
            return enumArr[i9];
        }
        throw new IndexOutOfBoundsException(A0.a.l("index: ", i9, length, ", size: "));
    }

    @Override // B7.AbstractC0054e, java.util.List
    public final int indexOf(Object obj) {
        Enum r1;
        if (obj instanceof Enum) {
            Enum element = (Enum) obj;
            h.e(element, "element");
            int ordinal = element.ordinal();
            Enum[] enumArr = this.f3186a;
            if (ordinal >= 0 && ordinal < enumArr.length) {
                r1 = enumArr[ordinal];
            } else {
                r1 = null;
            }
            if (r1 == element) {
                return ordinal;
            }
            return -1;
        }
        return -1;
    }

    @Override // B7.AbstractC0054e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        h.e(element, "element");
        return indexOf(element);
    }
}
