package r;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: r.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1924f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public C1921c f22585a;

    /* renamed from: b, reason: collision with root package name */
    public C1921c f22586b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f22587c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    public int f22588d = 0;

    public C1921c b(Object obj) {
        C1921c c1921c = this.f22585a;
        while (c1921c != null && !c1921c.f22578a.equals(obj)) {
            c1921c = c1921c.f22580c;
        }
        return c1921c;
    }

    public Object c(Object obj) {
        C1921c b9 = b(obj);
        if (b9 == null) {
            return null;
        }
        this.f22588d--;
        WeakHashMap weakHashMap = this.f22587c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC1923e) it.next()).a(b9);
            }
        }
        C1921c c1921c = b9.f22581d;
        if (c1921c != null) {
            c1921c.f22580c = b9.f22580c;
        } else {
            this.f22585a = b9.f22580c;
        }
        C1921c c1921c2 = b9.f22580c;
        if (c1921c2 != null) {
            c1921c2.f22581d = c1921c;
        } else {
            this.f22586b = c1921c;
        }
        b9.f22580c = null;
        b9.f22581d = null;
        return b9.f22579b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((r.C1920b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof r.C1924f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r.f r7 = (r.C1924f) r7
            int r1 = r6.f22588d
            int r3 = r7.f22588d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            r.b r3 = (r.C1920b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            r.b r4 = (r.C1920b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            r.b r7 = (r.C1920b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1924f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i9 = 0;
        while (true) {
            C1920b c1920b = (C1920b) it;
            if (c1920b.hasNext()) {
                i9 += ((Map.Entry) c1920b.next()).hashCode();
            } else {
                return i9;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1920b c1920b = new C1920b(this.f22585a, this.f22586b, 0);
        this.f22587c.put(c1920b, Boolean.FALSE);
        return c1920b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1920b c1920b = (C1920b) it;
            if (c1920b.hasNext()) {
                sb.append(((Map.Entry) c1920b.next()).toString());
                if (c1920b.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
