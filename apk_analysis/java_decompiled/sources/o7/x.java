package o7;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21740a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f21741b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public boolean f21742c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f21743d;

    public x(y yVar) {
        this.f21743d = yVar;
    }

    public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        if (!this.f21742c) {
            this.f21742c = true;
            ArrayDeque arrayDeque = this.f21741b;
            if (arrayDeque.size() != 1 || ((C1731w) arrayDeque.getFirst()).f21737b != null) {
                StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                Iterator descendingIterator = arrayDeque.descendingIterator();
                while (descendingIterator.hasNext()) {
                    C1731w c1731w = (C1731w) descendingIterator.next();
                    sb.append("\nfor ");
                    sb.append(c1731w.f21736a);
                    String str = c1731w.f21737b;
                    if (str != null) {
                        sb.append(' ');
                        sb.append(str);
                    }
                }
                return new IllegalArgumentException(sb.toString(), illegalArgumentException);
            }
        }
        return illegalArgumentException;
    }

    public final void b(boolean z9) {
        this.f21741b.removeLast();
        if (this.f21741b.isEmpty()) {
            this.f21743d.f21746b.remove();
            if (z9) {
                synchronized (this.f21743d.f21747c) {
                    try {
                        int size = this.f21740a.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            C1731w c1731w = (C1731w) this.f21740a.get(i9);
                            AbstractC1719k abstractC1719k = (AbstractC1719k) this.f21743d.f21747c.put(c1731w.f21738c, c1731w.f21739d);
                            if (abstractC1719k != null) {
                                c1731w.f21739d = abstractC1719k;
                                this.f21743d.f21747c.put(c1731w.f21738c, abstractC1719k);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }
}
