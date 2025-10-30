package o7;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f21744d;

    /* renamed from: a, reason: collision with root package name */
    public final List f21745a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f21746b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f21747c = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList(5);
        f21744d = arrayList;
        arrayList.add(AbstractC1708D.f21653a);
        arrayList.add(C1716h.f21684c);
        arrayList.add(C1710b.f21664e);
        arrayList.add(C1710b.f21663d);
        arrayList.add(z.f21748a);
        arrayList.add(C1715g.f21680d);
    }

    public y(C1730v c1730v) {
        ArrayList arrayList = c1730v.f21735a;
        int size = arrayList.size();
        ArrayList arrayList2 = f21744d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.f21745a = Collections.unmodifiableList(arrayList3);
    }

    public final AbstractC1719k a(Class cls) {
        return b(cls, p7.e.f22206a, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [o7.k] */
    public final AbstractC1719k b(Type type, Set set, String str) {
        Object asList;
        C1731w c1731w;
        if (type != null) {
            if (set != null) {
                Type a5 = p7.e.a(type);
                if (a5 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) a5;
                    if (wildcardType.getLowerBounds().length == 0) {
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        if (upperBounds.length == 1) {
                            a5 = upperBounds[0];
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                if (set.isEmpty()) {
                    asList = a5;
                } else {
                    asList = Arrays.asList(a5, set);
                }
                synchronized (this.f21747c) {
                    try {
                        AbstractC1719k abstractC1719k = (AbstractC1719k) this.f21747c.get(asList);
                        if (abstractC1719k != null) {
                            return abstractC1719k;
                        }
                        x xVar = (x) this.f21746b.get();
                        if (xVar == null) {
                            xVar = new x(this);
                            this.f21746b.set(xVar);
                        }
                        ArrayList arrayList = xVar.f21740a;
                        int size = arrayList.size();
                        int i9 = 0;
                        while (true) {
                            ArrayDeque arrayDeque = xVar.f21741b;
                            if (i9 < size) {
                                c1731w = (C1731w) arrayList.get(i9);
                                if (c1731w.f21738c.equals(asList)) {
                                    arrayDeque.add(c1731w);
                                    ?? r13 = c1731w.f21739d;
                                    if (r13 != 0) {
                                        c1731w = r13;
                                    }
                                } else {
                                    i9++;
                                }
                            } else {
                                C1731w c1731w2 = new C1731w(a5, str, asList);
                                arrayList.add(c1731w2);
                                arrayDeque.add(c1731w2);
                                c1731w = null;
                                break;
                            }
                        }
                        try {
                            if (c1731w != null) {
                                return c1731w;
                            }
                            try {
                                int size2 = this.f21745a.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    AbstractC1719k a9 = ((C1709a) this.f21745a.get(i10)).a(a5, set, this);
                                    if (a9 != null) {
                                        ((C1731w) xVar.f21741b.getLast()).f21739d = a9;
                                        xVar.b(true);
                                        return a9;
                                    }
                                }
                                throw new IllegalArgumentException("No JsonAdapter for " + p7.e.h(a5, set));
                            } catch (IllegalArgumentException e8) {
                                throw xVar.a(e8);
                            }
                        } finally {
                            xVar.b(false);
                        }
                    } finally {
                    }
                }
            }
            throw new NullPointerException("annotations == null");
        }
        throw new NullPointerException("type == null");
    }
}
