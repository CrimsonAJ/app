package N3;

import b7.C0701c;
import j3.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class L implements InterfaceC0272x, InterfaceC0271w {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0272x[] f4932a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentityHashMap f4933b;

    /* renamed from: c, reason: collision with root package name */
    public final F5.e f4934c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4935d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f4936e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0271w f4937f;

    /* renamed from: g, reason: collision with root package name */
    public n0 f4938g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0272x[] f4939h;

    /* renamed from: i, reason: collision with root package name */
    public C0701c f4940i;

    public L(F5.e eVar, long[] jArr, InterfaceC0272x... interfaceC0272xArr) {
        this.f4934c = eVar;
        this.f4932a = interfaceC0272xArr;
        eVar.getClass();
        this.f4940i = new C0701c(11, new f0[0]);
        this.f4933b = new IdentityHashMap();
        this.f4939h = new InterfaceC0272x[0];
        for (int i9 = 0; i9 < interfaceC0272xArr.length; i9++) {
            long j = jArr[i9];
            if (j != 0) {
                this.f4932a[i9] = new J(interfaceC0272xArr[i9], j);
            }
        }
    }

    @Override // N3.f0
    public final void B(long j) {
        this.f4940i.B(j);
    }

    @Override // N3.InterfaceC0271w
    public final void C(InterfaceC0272x interfaceC0272x) {
        ArrayList arrayList = this.f4935d;
        arrayList.remove(interfaceC0272x);
        if (!arrayList.isEmpty()) {
            return;
        }
        InterfaceC0272x[] interfaceC0272xArr = this.f4932a;
        int i9 = 0;
        for (InterfaceC0272x interfaceC0272x2 : interfaceC0272xArr) {
            i9 += interfaceC0272x2.l().f5170a;
        }
        m0[] m0VarArr = new m0[i9];
        int i10 = 0;
        for (int i11 = 0; i11 < interfaceC0272xArr.length; i11++) {
            n0 l9 = interfaceC0272xArr[i11].l();
            int i12 = l9.f5170a;
            int i13 = 0;
            while (i13 < i12) {
                m0 a5 = l9.a(i13);
                m0 m0Var = new m0(i11 + ":" + a5.f5165b, a5.f5167d);
                this.f4936e.put(m0Var, a5);
                m0VarArr[i10] = m0Var;
                i13++;
                i10++;
            }
        }
        this.f4938g = new n0(m0VarArr);
        InterfaceC0271w interfaceC0271w = this.f4937f;
        interfaceC0271w.getClass();
        interfaceC0271w.C(this);
    }

    @Override // N3.f0
    public final boolean a() {
        return this.f4940i.a();
    }

    @Override // N3.InterfaceC0272x
    public final long c(long j, x0 x0Var) {
        InterfaceC0272x interfaceC0272x;
        InterfaceC0272x[] interfaceC0272xArr = this.f4939h;
        if (interfaceC0272xArr.length > 0) {
            interfaceC0272x = interfaceC0272xArr[0];
        } else {
            interfaceC0272x = this.f4932a[0];
        }
        return interfaceC0272x.c(j, x0Var);
    }

    @Override // N3.f0
    public final long h() {
        return this.f4940i.h();
    }

    @Override // N3.InterfaceC0272x
    public final long k() {
        long j = -9223372036854775807L;
        for (InterfaceC0272x interfaceC0272x : this.f4939h) {
            long k5 = interfaceC0272x.k();
            if (k5 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (InterfaceC0272x interfaceC0272x2 : this.f4939h) {
                        if (interfaceC0272x2 == interfaceC0272x) {
                            break;
                        }
                        if (interfaceC0272x2.w(k5) != k5) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = k5;
                } else if (k5 != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && interfaceC0272x.w(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // N3.InterfaceC0272x
    public final n0 l() {
        n0 n0Var = this.f4938g;
        n0Var.getClass();
        return n0Var;
    }

    @Override // N3.InterfaceC0272x
    public final void o(InterfaceC0271w interfaceC0271w, long j) {
        this.f4937f = interfaceC0271w;
        ArrayList arrayList = this.f4935d;
        InterfaceC0272x[] interfaceC0272xArr = this.f4932a;
        Collections.addAll(arrayList, interfaceC0272xArr);
        for (InterfaceC0272x interfaceC0272x : interfaceC0272xArr) {
            interfaceC0272x.o(this, j);
        }
    }

    @Override // N3.f0
    public final long p() {
        return this.f4940i.p();
    }

    @Override // N3.InterfaceC0272x
    public final void q() {
        for (InterfaceC0272x interfaceC0272x : this.f4932a) {
            interfaceC0272x.q();
        }
    }

    @Override // N3.e0
    public final void v(f0 f0Var) {
        InterfaceC0271w interfaceC0271w = this.f4937f;
        interfaceC0271w.getClass();
        interfaceC0271w.v(this);
    }

    @Override // N3.InterfaceC0272x
    public final long w(long j) {
        long w7 = this.f4939h[0].w(j);
        int i9 = 1;
        while (true) {
            InterfaceC0272x[] interfaceC0272xArr = this.f4939h;
            if (i9 < interfaceC0272xArr.length) {
                if (interfaceC0272xArr[i9].w(w7) == w7) {
                    i9++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return w7;
            }
        }
    }

    @Override // N3.InterfaceC0272x
    public final void x(long j) {
        for (InterfaceC0272x interfaceC0272x : this.f4939h) {
            interfaceC0272x.x(j);
        }
    }

    @Override // N3.InterfaceC0272x
    public final long y(i4.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j) {
        HashMap hashMap;
        IdentityHashMap identityHashMap;
        InterfaceC0272x[] interfaceC0272xArr;
        d0 d0Var;
        int[] iArr;
        int[] iArr2;
        Integer num;
        int intValue;
        int[] iArr3 = new int[qVarArr.length];
        int[] iArr4 = new int[qVarArr.length];
        int i9 = 0;
        while (true) {
            int length = qVarArr.length;
            hashMap = this.f4936e;
            identityHashMap = this.f4933b;
            interfaceC0272xArr = this.f4932a;
            if (i9 >= length) {
                break;
            }
            d0 d0Var2 = d0VarArr[i9];
            if (d0Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(d0Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr3[i9] = intValue;
            iArr4[i9] = -1;
            i4.q qVar = qVarArr[i9];
            if (qVar != null) {
                m0 m0Var = (m0) hashMap.get(qVar.l());
                m0Var.getClass();
                int i10 = 0;
                while (true) {
                    if (i10 >= interfaceC0272xArr.length) {
                        break;
                    }
                    if (interfaceC0272xArr[i10].l().b(m0Var) != -1) {
                        iArr4[i9] = i10;
                        break;
                    }
                    i10++;
                }
            }
            i9++;
        }
        identityHashMap.clear();
        int length2 = qVarArr.length;
        d0[] d0VarArr2 = new d0[length2];
        d0[] d0VarArr3 = new d0[qVarArr.length];
        i4.q[] qVarArr2 = new i4.q[qVarArr.length];
        ArrayList arrayList = new ArrayList(interfaceC0272xArr.length);
        long j4 = j;
        int i11 = 0;
        while (i11 < interfaceC0272xArr.length) {
            int i12 = 0;
            while (i12 < qVarArr.length) {
                if (iArr3[i12] == i11) {
                    d0Var = d0VarArr[i12];
                } else {
                    d0Var = null;
                }
                d0VarArr3[i12] = d0Var;
                if (iArr4[i12] == i11) {
                    i4.q qVar2 = qVarArr[i12];
                    qVar2.getClass();
                    iArr = iArr3;
                    m0 m0Var2 = (m0) hashMap.get(qVar2.l());
                    m0Var2.getClass();
                    iArr2 = iArr4;
                    qVarArr2[i12] = new I(qVar2, m0Var2);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    qVarArr2[i12] = null;
                }
                i12++;
                iArr3 = iArr;
                iArr4 = iArr2;
            }
            int[] iArr5 = iArr3;
            int[] iArr6 = iArr4;
            ArrayList arrayList2 = arrayList;
            d0[] d0VarArr4 = d0VarArr3;
            int i13 = i11;
            long y9 = interfaceC0272xArr[i11].y(qVarArr2, zArr, d0VarArr4, zArr2, j4);
            if (i13 == 0) {
                j4 = y9;
            } else if (y9 != j4) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z9 = false;
            for (int i14 = 0; i14 < qVarArr.length; i14++) {
                boolean z10 = true;
                if (iArr6[i14] == i13) {
                    d0 d0Var3 = d0VarArr4[i14];
                    d0Var3.getClass();
                    d0VarArr2[i14] = d0VarArr4[i14];
                    identityHashMap.put(d0Var3, Integer.valueOf(i13));
                    z9 = true;
                } else if (iArr5[i14] == i13) {
                    if (d0VarArr4[i14] != null) {
                        z10 = false;
                    }
                    AbstractC1566a.m(z10);
                }
            }
            if (z9) {
                arrayList2.add(interfaceC0272xArr[i13]);
            }
            i11 = i13 + 1;
            arrayList = arrayList2;
            d0VarArr3 = d0VarArr4;
            iArr3 = iArr5;
            iArr4 = iArr6;
        }
        System.arraycopy(d0VarArr2, 0, d0VarArr, 0, length2);
        InterfaceC0272x[] interfaceC0272xArr2 = (InterfaceC0272x[]) arrayList.toArray(new InterfaceC0272x[0]);
        this.f4939h = interfaceC0272xArr2;
        this.f4934c.getClass();
        this.f4940i = new C0701c(11, interfaceC0272xArr2);
        return j4;
    }

    @Override // N3.f0
    public final boolean z(long j) {
        ArrayList arrayList = this.f4935d;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((InterfaceC0272x) arrayList.get(i9)).z(j);
            }
            return false;
        }
        return this.f4940i.z(j);
    }
}
