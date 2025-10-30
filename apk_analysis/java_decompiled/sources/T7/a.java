package T7;

import java.util.Iterator;
import v4.e;

/* loaded from: classes.dex */
public class a implements Iterable, P7.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f7237a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7238b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7239c;

    public a(int i9, int i10, int i11) {
        if (i11 != 0) {
            if (i11 != Integer.MIN_VALUE) {
                this.f7237a = i9;
                this.f7238b = e.z(i9, i10, i11);
                this.f7239c = i11;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f7237a == aVar.f7237a && this.f7238b == aVar.f7238b && this.f7239c == aVar.f7239c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f7237a * 31) + this.f7238b) * 31) + this.f7239c;
    }

    public boolean isEmpty() {
        int i9 = this.f7239c;
        int i10 = this.f7238b;
        int i11 = this.f7237a;
        if (i9 > 0) {
            if (i11 <= i10) {
                return false;
            }
            return true;
        }
        if (i11 >= i10) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f7237a, this.f7238b, this.f7239c);
    }

    public String toString() {
        StringBuilder sb;
        int i9 = this.f7238b;
        int i10 = this.f7237a;
        int i11 = this.f7239c;
        if (i11 > 0) {
            sb = new StringBuilder();
            sb.append(i10);
            sb.append("..");
            sb.append(i9);
            sb.append(" step ");
            sb.append(i11);
        } else {
            sb = new StringBuilder();
            sb.append(i10);
            sb.append(" downTo ");
            sb.append(i9);
            sb.append(" step ");
            sb.append(-i11);
        }
        return sb.toString();
    }
}
