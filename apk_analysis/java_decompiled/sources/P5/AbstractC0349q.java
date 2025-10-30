package P5;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: P5.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0349q {
    public static void a(int i9, Object[] objArr) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (objArr[i10] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i10);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static void b(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(valueOf.length() + 26);
            sb.append("null value in entry: ");
            sb.append(valueOf);
            sb.append("=null");
            throw new NullPointerException(sb.toString());
        }
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
        sb2.append("null key in entry: null=");
        sb2.append(valueOf2);
        throw new NullPointerException(sb2.toString());
    }

    public static void c(int i9, String str) {
        if (i9 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i9);
        throw new IllegalArgumentException(sb.toString());
    }

    public static Object d(int i9) {
        if (i9 >= 2 && i9 <= 1073741824 && Integer.highestOneBit(i9) == i9) {
            if (i9 <= 256) {
                return new byte[i9];
            }
            if (i9 <= 65536) {
                return new short[i9];
            }
            return new int[i9];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i9);
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean e(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean f(Set set, Object obj) {
        if (set != obj) {
            if (obj instanceof Set) {
                Set set2 = (Set) obj;
                try {
                    if (set.size() == set2.size()) {
                        if (set.containsAll(set2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static b0 g(Set set, O5.j jVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (set2 instanceof b0) {
                b0 b0Var = (b0) set2;
                O5.j jVar2 = b0Var.f5961b;
                jVar2.getClass();
                return new b0((SortedSet) b0Var.f5960a, new O5.k(Arrays.asList(jVar2, jVar)));
            }
            set2.getClass();
            return new b0(set2, jVar);
        }
        if (set instanceof b0) {
            b0 b0Var2 = (b0) set;
            O5.j jVar3 = b0Var2.f5961b;
            jVar3.getClass();
            return new b0(b0Var2.f5960a, new O5.k(Arrays.asList(jVar3, jVar)));
        }
        set.getClass();
        return new b0(set, jVar);
    }

    public static Object h(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return str;
    }

    public static Object i(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            throw new NoSuchElementException();
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int j(Set set) {
        int i9;
        int i10 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i9 = obj.hashCode();
            } else {
                i9 = 0;
            }
            i10 = ~(~(i10 + i9));
        }
        return i10;
    }

    public static a0 k(I i9, I i10) {
        O4.h.g(i9, "set1");
        O4.h.g(i10, "set2");
        return new a0(i9, i10);
    }

    public static int l(int i9, int i10, int i11) {
        return (i9 & (~i11)) | (i10 & i11);
    }

    public static ArrayList m(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList n(Object... objArr) {
        int length = objArr.length;
        c(length, "arraySize");
        ArrayList arrayList = new ArrayList(v4.e.L(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        t(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = l(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int o(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = r(r9)
            r1 = r0 & r11
            int r2 = s(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            goto L40
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = M4.a.l(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = M4.a.l(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            t(r1, r9, r12)
            return r2
        L33:
            r10 = r13[r5]
            int r9 = l(r10, r9, r11)
            r13[r5] = r9
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
        L40:
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.AbstractC0349q.o(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void p(List list, O5.j jVar, int i9, int i10) {
        for (int size = list.size() - 1; size > i10; size--) {
            if (jVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i11 = i10 - 1; i11 >= i9; i11--) {
            list.remove(i11);
        }
    }

    public static int q(int i9) {
        return (int) (Integer.rotateLeft((int) (i9 * (-862048943)), 15) * 461845907);
    }

    public static int r(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return q(hashCode);
    }

    public static int s(int i9, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i9] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i9] & 65535;
        }
        return ((int[]) obj)[i9];
    }

    public static void t(int i9, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i9] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i9] = (short) i10;
        } else {
            ((int[]) obj)[i9] = i10;
        }
    }
}
