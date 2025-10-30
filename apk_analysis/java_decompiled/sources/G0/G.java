package G0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class G implements Q0.f, Q0.e, AutoCloseable {

    /* renamed from: i, reason: collision with root package name */
    public static final TreeMap f2654i = new TreeMap();

    /* renamed from: a, reason: collision with root package name */
    public final int f2655a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f2656b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f2657c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f2658d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f2659e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[][] f2660f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f2661g;

    /* renamed from: h, reason: collision with root package name */
    public int f2662h;

    public G(int i9) {
        this.f2655a = i9;
        int i10 = i9 + 1;
        this.f2661g = new int[i10];
        this.f2657c = new long[i10];
        this.f2658d = new double[i10];
        this.f2659e = new String[i10];
        this.f2660f = new byte[i10];
    }

    public static final G a(int i9, String query) {
        kotlin.jvm.internal.h.e(query, "query");
        TreeMap treeMap = f2654i;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i9));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                G g9 = (G) ceilingEntry.getValue();
                g9.getClass();
                g9.f2656b = query;
                g9.f2662h = i9;
                return g9;
            }
            G g10 = new G(i9);
            g10.f2656b = query;
            g10.f2662h = i9;
            return g10;
        }
    }

    @Override // Q0.f
    public final void F(Q0.e eVar) {
        int i9 = this.f2662h;
        if (1 <= i9) {
            int i10 = 1;
            while (true) {
                int i11 = this.f2661g[i10];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    byte[] bArr = this.f2660f[i10];
                                    if (bArr != null) {
                                        eVar.U(i10, bArr);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                            } else {
                                String str = this.f2659e[i10];
                                if (str != null) {
                                    eVar.m(i10, str);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }
                        } else {
                            eVar.u(i10, this.f2658d[i10]);
                        }
                    } else {
                        eVar.z(this.f2657c[i10], i10);
                    }
                } else {
                    eVar.t(i10);
                }
                if (i10 != i9) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // Q0.e
    public final void U(int i9, byte[] bArr) {
        this.f2661g[i9] = 5;
        this.f2660f[i9] = bArr;
    }

    @Override // Q0.f
    public final String d() {
        String str = this.f2656b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void g() {
        TreeMap treeMap = f2654i;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f2655a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                kotlin.jvm.internal.h.d(it, "iterator(...)");
                while (true) {
                    int i9 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i9;
                }
            }
        }
    }

    @Override // Q0.e
    public final void m(int i9, String value) {
        kotlin.jvm.internal.h.e(value, "value");
        this.f2661g[i9] = 4;
        this.f2659e[i9] = value;
    }

    @Override // Q0.e
    public final void t(int i9) {
        this.f2661g[i9] = 1;
    }

    @Override // Q0.e
    public final void u(int i9, double d9) {
        this.f2661g[i9] = 3;
        this.f2658d[i9] = d9;
    }

    @Override // Q0.e
    public final void z(long j, int i9) {
        this.f2661g[i9] = 2;
        this.f2657c[i9] = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
