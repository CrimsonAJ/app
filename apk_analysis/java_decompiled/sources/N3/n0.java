package N3;

import j3.InterfaceC1453f;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class n0 implements InterfaceC1453f {

    /* renamed from: d, reason: collision with root package name */
    public static final n0 f5169d = new n0(new m0[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f5170a;

    /* renamed from: b, reason: collision with root package name */
    public final P5.S f5171b;

    /* renamed from: c, reason: collision with root package name */
    public int f5172c;

    public n0(m0... m0VarArr) {
        this.f5171b = P5.F.p(m0VarArr);
        this.f5170a = m0VarArr.length;
        int i9 = 0;
        while (true) {
            P5.S s9 = this.f5171b;
            if (i9 < s9.f5928d) {
                int i10 = i9 + 1;
                for (int i11 = i10; i11 < s9.f5928d; i11++) {
                    if (((m0) s9.get(i9)).equals(s9.get(i11))) {
                        AbstractC1566a.u("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i9 = i10;
            } else {
                return;
            }
        }
    }

    public final m0 a(int i9) {
        return (m0) this.f5171b.get(i9);
    }

    public final int b(m0 m0Var) {
        int indexOf = this.f5171b.indexOf(m0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n0.class == obj.getClass()) {
                n0 n0Var = (n0) obj;
                if (this.f5170a == n0Var.f5170a && this.f5171b.equals(n0Var.f5171b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f5172c == 0) {
            this.f5172c = this.f5171b.hashCode();
        }
        return this.f5172c;
    }
}
