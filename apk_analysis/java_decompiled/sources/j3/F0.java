package j3;

import java.util.Arrays;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class F0 implements InterfaceC1453f {

    /* renamed from: a, reason: collision with root package name */
    public final int f19325a;

    /* renamed from: b, reason: collision with root package name */
    public final N3.m0 f19326b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19327c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f19328d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f19329e;

    public F0(N3.m0 m0Var, boolean z9, int[] iArr, boolean[] zArr) {
        boolean z10;
        int i9 = m0Var.f5164a;
        this.f19325a = i9;
        boolean z11 = false;
        if (i9 == iArr.length && i9 == zArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC1566a.h(z10);
        this.f19326b = m0Var;
        if (z9 && i9 > 1) {
            z11 = true;
        }
        this.f19327c = z11;
        this.f19328d = (int[]) iArr.clone();
        this.f19329e = (boolean[]) zArr.clone();
    }

    public final boolean a(int i9) {
        if (this.f19328d[i9] != 4) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F0.class == obj.getClass()) {
            F0 f02 = (F0) obj;
            if (this.f19327c == f02.f19327c && this.f19326b.equals(f02.f19326b) && Arrays.equals(this.f19328d, f02.f19328d) && Arrays.equals(this.f19329e, f02.f19329e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19329e) + ((Arrays.hashCode(this.f19328d) + (((this.f19326b.hashCode() * 31) + (this.f19327c ? 1 : 0)) * 31)) * 31);
    }
}
