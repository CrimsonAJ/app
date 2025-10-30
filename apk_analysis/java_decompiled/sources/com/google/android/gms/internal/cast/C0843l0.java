package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.cast.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0843l0 implements Map, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final C0843l0 f14903g = new C0843l0(null, new Object[0], 0);

    /* renamed from: a, reason: collision with root package name */
    public transient C0831i0 f14904a;

    /* renamed from: b, reason: collision with root package name */
    public transient C0835j0 f14905b;

    /* renamed from: c, reason: collision with root package name */
    public transient C0839k0 f14906c;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f14907d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Object[] f14908e;

    /* renamed from: f, reason: collision with root package name */
    public final transient int f14909f;

    public C0843l0(Object obj, Object[] objArr, int i9) {
        this.f14907d = obj;
        this.f14908e = objArr;
        this.f14909f = i9;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r4v4 ??, r4v10 ??, r4v5 ??, r4v8 ??, r4v6 ??, r4v7 ??, r4v9 ??, r4v12 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:695)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    public static void a(java.util.Set r18) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C0843l0.a(java.util.Set):void");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C0839k0 c0839k0 = this.f14906c;
        if (c0839k0 == null) {
            c0839k0 = new C0839k0(this.f14908e, 1, this.f14909f);
            this.f14906c = c0839k0;
        }
        return c0839k0.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0831i0 c0831i0 = this.f14904a;
        if (c0831i0 == null) {
            C0831i0 c0831i02 = new C0831i0(this, this.f14908e, this.f14909f);
            this.f14904a = c0831i02;
            return c0831i02;
        }
        return c0831i0;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009f A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            r1 = 1
            int r2 = r9.f14909f
            java.lang.Object[] r3 = r9.f14908e
            if (r2 != r1) goto L20
            r2 = 0
            r2 = r3[r2]
            java.util.Objects.requireNonNull(r2)
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L3
            r10 = r3[r1]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r2 = r9.f14907d
            if (r2 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r2 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r2
            byte[] r4 = (byte[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = com.google.android.gms.internal.cast.J.b(r2)
        L38:
            r2 = r2 & r6
            r5 = r4[r2]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L4e:
            int r2 = r2 + 1
            goto L38
        L51:
            boolean r4 = r2 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r2
            short[] r4 = (short[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = com.google.android.gms.internal.cast.J.b(r2)
        L63:
            r2 = r2 & r6
            short r5 = r4[r2]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L7a:
            int r2 = r2 + 1
            goto L63
        L7d:
            int[] r2 = (int[]) r2
            int r4 = r2.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.cast.J.b(r6)
        L89:
            r6 = r6 & r4
            r7 = r2[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r3[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r3[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C0843l0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i9;
        C0831i0 c0831i0 = this.f14904a;
        if (c0831i0 == null) {
            c0831i0 = new C0831i0(this, this.f14908e, this.f14909f);
            this.f14904a = c0831i0;
        }
        int i10 = 0;
        for (Object obj : c0831i0) {
            if (obj != null) {
                i9 = obj.hashCode();
            } else {
                i9 = 0;
            }
            i10 += i9;
        }
        return i10;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0835j0 c0835j0 = this.f14905b;
        if (c0835j0 == null) {
            C0835j0 c0835j02 = new C0835j0(this, new C0839k0(this.f14908e, 0, this.f14909f));
            this.f14905b = c0835j02;
            return c0835j02;
        }
        return c0835j0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f14909f;
    }

    public final String toString() {
        int i9 = this.f14909f;
        if (i9 >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(i9 * 8, 1073741824L));
            sb.append('{');
            Iterator it = ((C0831i0) entrySet()).iterator();
            boolean z9 = true;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!z9) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z9 = false;
            }
            sb.append('}');
            return sb.toString();
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(i9, "size cannot be negative but was: "));
    }

    @Override // java.util.Map
    public final Collection values() {
        C0839k0 c0839k0 = this.f14906c;
        if (c0839k0 == null) {
            C0839k0 c0839k02 = new C0839k0(this.f14908e, 1, this.f14909f);
            this.f14906c = c0839k02;
            return c0839k02;
        }
        return c0839k0;
    }
}
