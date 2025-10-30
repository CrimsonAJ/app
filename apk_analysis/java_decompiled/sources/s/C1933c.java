package s;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1933c implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f22641a;

    /* renamed from: b, reason: collision with root package name */
    public int f22642b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22643c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1935e f22644d;

    public C1933c(C1935e c1935e) {
        this.f22644d = c1935e;
        this.f22641a = c1935e.f22660c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.f22643c) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i9 = this.f22642b;
                C1935e c1935e = this.f22644d;
                if (kotlin.jvm.internal.h.a(key, c1935e.f(i9)) && kotlin.jvm.internal.h.a(entry.getValue(), c1935e.i(this.f22642b))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f22643c) {
            return this.f22644d.f(this.f22642b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f22643c) {
            return this.f22644d.i(this.f22642b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f22642b < this.f22641a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.f22643c) {
            int i9 = this.f22642b;
            C1935e c1935e = this.f22644d;
            Object f9 = c1935e.f(i9);
            Object i10 = c1935e.i(this.f22642b);
            int i11 = 0;
            if (f9 == null) {
                hashCode = 0;
            } else {
                hashCode = f9.hashCode();
            }
            if (i10 != null) {
                i11 = i10.hashCode();
            }
            return hashCode ^ i11;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f22642b++;
            this.f22643c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f22643c) {
            this.f22644d.g(this.f22642b);
            this.f22642b--;
            this.f22641a--;
            this.f22643c = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f22643c) {
            return this.f22644d.h(this.f22642b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
