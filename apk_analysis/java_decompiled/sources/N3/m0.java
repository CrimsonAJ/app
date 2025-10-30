package N3;

import j3.InterfaceC1453f;
import java.util.Arrays;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class m0 implements InterfaceC1453f {

    /* renamed from: f, reason: collision with root package name */
    public static final C6.a f5163f = new C6.a(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f5164a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5165b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5166c;

    /* renamed from: d, reason: collision with root package name */
    public final j3.M[] f5167d;

    /* renamed from: e, reason: collision with root package name */
    public int f5168e;

    public m0(String str, j3.M... mArr) {
        boolean z9;
        if (mArr.length > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        this.f5165b = str;
        this.f5167d = mArr;
        this.f5164a = mArr.length;
        int h7 = l4.n.h(mArr[0].f19435l);
        this.f5166c = h7 == -1 ? l4.n.h(mArr[0].f19434k) : h7;
        String str2 = mArr[0].f19427c;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i9 = mArr[0].f19429e | 16384;
        for (int i10 = 1; i10 < mArr.length; i10++) {
            String str3 = mArr[i10].f19427c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b(i10, "languages", mArr[0].f19427c, mArr[i10].f19427c);
                return;
            } else {
                if (i9 != (mArr[i10].f19429e | 16384)) {
                    b(i10, "role flags", Integer.toBinaryString(mArr[0].f19429e), Integer.toBinaryString(mArr[i10].f19429e));
                    return;
                }
            }
        }
    }

    public static void b(int i9, String str, String str2, String str3) {
        AbstractC1566a.u("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i9 + ")"));
    }

    public final int a(j3.M m9) {
        int i9 = 0;
        while (true) {
            j3.M[] mArr = this.f5167d;
            if (i9 < mArr.length) {
                if (m9 == mArr[i9]) {
                    return i9;
                }
                i9++;
            } else {
                return -1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.f5165b.equals(m0Var.f5165b) && Arrays.equals(this.f5167d, m0Var.f5167d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f5168e == 0) {
            this.f5168e = u0.z.c(this.f5165b, 527, 31) + Arrays.hashCode(this.f5167d);
        }
        return this.f5168e;
    }
}
