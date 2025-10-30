package W7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, P7.a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f7937a;

    /* renamed from: b, reason: collision with root package name */
    public int f7938b;

    /* renamed from: c, reason: collision with root package name */
    public int f7939c;

    /* renamed from: d, reason: collision with root package name */
    public int f7940d;

    /* renamed from: e, reason: collision with root package name */
    public int f7941e;

    public b(CharSequence string) {
        kotlin.jvm.internal.h.e(string, "string");
        this.f7937a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i9;
        int i10 = this.f7938b;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            return true;
        }
        int i11 = 2;
        if (this.f7941e < 0) {
            this.f7938b = 2;
            return false;
        }
        CharSequence charSequence = this.f7937a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.f7939c; i12 < length2; i12++) {
            char charAt = charSequence.charAt(i12);
            if (charAt == '\n' || charAt == '\r') {
                if (charAt != '\r' || (i9 = i12 + 1) >= charSequence.length() || charSequence.charAt(i9) != '\n') {
                    i11 = 1;
                }
                length = i12;
                this.f7938b = 1;
                this.f7941e = i11;
                this.f7940d = length;
                return true;
            }
        }
        i11 = -1;
        this.f7938b = 1;
        this.f7941e = i11;
        this.f7940d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f7938b = 0;
            int i9 = this.f7940d;
            int i10 = this.f7939c;
            this.f7939c = this.f7941e + i9;
            return this.f7937a.subSequence(i10, i9).toString();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
