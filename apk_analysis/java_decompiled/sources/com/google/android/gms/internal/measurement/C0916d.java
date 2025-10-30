package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0916d implements Iterable, InterfaceC0966n, InterfaceC0946j {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap f15459a;

    /* renamed from: b, reason: collision with root package name */
    public final TreeMap f15460b;

    public C0916d() {
        this.f15459a = new TreeMap();
        this.f15460b = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Double b() {
        TreeMap treeMap = this.f15459a;
        if (treeMap.size() == 1) {
            return q(0).b();
        }
        if (treeMap.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final String c() {
        return r(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0946j
    public final boolean d(String str) {
        if (!"length".equals(str) && !this.f15460b.containsKey(str)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Iterator e() {
        return new C0911c(this.f15459a.keySet().iterator(), this.f15460b.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C0916d) {
                C0916d c0916d = (C0916d) obj;
                if (p() == c0916d.p()) {
                    TreeMap treeMap = this.f15459a;
                    if (treeMap.isEmpty()) {
                        return c0916d.f15459a.isEmpty();
                    }
                    for (int intValue = ((Integer) treeMap.firstKey()).intValue(); intValue <= ((Integer) treeMap.lastKey()).intValue(); intValue++) {
                        if (!q(intValue).equals(c0916d.q(intValue))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n f() {
        C0916d c0916d = new C0916d();
        for (Map.Entry entry : this.f15459a.entrySet()) {
            boolean z9 = entry.getValue() instanceof InterfaceC0946j;
            TreeMap treeMap = c0916d.f15459a;
            if (z9) {
                treeMap.put((Integer) entry.getKey(), (InterfaceC0966n) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((InterfaceC0966n) entry.getValue()).f());
            }
        }
        return c0916d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0843, code lost:
    
        if (l6.AbstractC1570b.A(r29, r31, (com.google.android.gms.internal.measurement.C0961m) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).p() == p()) goto L378;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:50:0x01d7. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0283  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0966n g(java.lang.String r30, com.google.firebase.messaging.s r31, java.util.ArrayList r32) {
        /*
            Method dump skipped, instructions count: 2358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0916d.g(java.lang.String, com.google.firebase.messaging.s, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final int hashCode() {
        return this.f15459a.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0946j
    public final InterfaceC0966n i(String str) {
        InterfaceC0966n interfaceC0966n;
        if ("length".equals(str)) {
            return new C0931g(Double.valueOf(p()));
        }
        if (d(str) && (interfaceC0966n = (InterfaceC0966n) this.f15460b.get(str)) != null) {
            return interfaceC0966n;
        }
        return InterfaceC0966n.f15543N;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0976p(2, this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0946j
    public final void k(String str, InterfaceC0966n interfaceC0966n) {
        TreeMap treeMap = this.f15460b;
        if (interfaceC0966n == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, interfaceC0966n);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Boolean o() {
        return Boolean.TRUE;
    }

    public final int p() {
        TreeMap treeMap = this.f15459a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final InterfaceC0966n q(int i9) {
        InterfaceC0966n interfaceC0966n;
        if (i9 < p()) {
            if (w(i9) && (interfaceC0966n = (InterfaceC0966n) this.f15459a.get(Integer.valueOf(i9))) != null) {
                return interfaceC0966n;
            }
            return InterfaceC0966n.f15543N;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String r(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f15459a.isEmpty()) {
            int i9 = 0;
            while (true) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i9 >= p()) {
                    break;
                }
                InterfaceC0966n q9 = q(i9);
                sb.append(str2);
                if (!(q9 instanceof r) && !(q9 instanceof C0956l)) {
                    sb.append(q9.c());
                }
                i9++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final Iterator s() {
        return this.f15459a.keySet().iterator();
    }

    public final ArrayList t() {
        ArrayList arrayList = new ArrayList(p());
        for (int i9 = 0; i9 < p(); i9++) {
            arrayList.add(q(i9));
        }
        return arrayList;
    }

    public final String toString() {
        return r(",");
    }

    public final void u(int i9) {
        TreeMap treeMap = this.f15459a;
        int intValue = ((Integer) treeMap.lastKey()).intValue();
        if (i9 <= intValue && i9 >= 0) {
            treeMap.remove(Integer.valueOf(i9));
            if (i9 == intValue) {
                int i10 = i9 - 1;
                Integer valueOf = Integer.valueOf(i10);
                if (!treeMap.containsKey(valueOf) && i10 >= 0) {
                    treeMap.put(valueOf, InterfaceC0966n.f15543N);
                    return;
                }
                return;
            }
            while (true) {
                i9++;
                if (i9 <= ((Integer) treeMap.lastKey()).intValue()) {
                    Integer valueOf2 = Integer.valueOf(i9);
                    InterfaceC0966n interfaceC0966n = (InterfaceC0966n) treeMap.get(valueOf2);
                    if (interfaceC0966n != null) {
                        treeMap.put(Integer.valueOf(i9 - 1), interfaceC0966n);
                        treeMap.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void v(int i9, InterfaceC0966n interfaceC0966n) {
        if (i9 <= 32468) {
            if (i9 >= 0) {
                TreeMap treeMap = this.f15459a;
                if (interfaceC0966n == null) {
                    treeMap.remove(Integer.valueOf(i9));
                    return;
                } else {
                    treeMap.put(Integer.valueOf(i9), interfaceC0966n);
                    return;
                }
            }
            throw new IndexOutOfBoundsException(AbstractC0953k1.j(i9, "Out of bounds index: "));
        }
        throw new IllegalStateException("Array too large");
    }

    public final boolean w(int i9) {
        if (i9 >= 0) {
            TreeMap treeMap = this.f15459a;
            if (i9 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i9));
            }
        }
        throw new IndexOutOfBoundsException(AbstractC0953k1.j(i9, "Out of bounds index: "));
    }

    public C0916d(List list) {
        this();
        if (list != null) {
            for (int i9 = 0; i9 < list.size(); i9++) {
                v(i9, (InterfaceC0966n) list.get(i9));
            }
        }
    }
}
