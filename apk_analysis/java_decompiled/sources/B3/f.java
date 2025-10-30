package B3;

import A4.r;
import l4.AbstractC1566a;
import q3.C1902g;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f674a;

    /* renamed from: b, reason: collision with root package name */
    public final long f675b;

    public /* synthetic */ f(int i9, long j, boolean z9) {
        this.f674a = i9;
        this.f675b = j;
    }

    public static f b(C1902g c1902g, r rVar) {
        c1902g.t((byte[]) rVar.f384c, 0, 8, false);
        rVar.H(0);
        return new f(rVar.i(), rVar.n(), false);
    }

    public boolean a() {
        int i9 = this.f674a;
        if (i9 == 0 || i9 == 1) {
            return true;
        }
        return false;
    }

    public f(long j, int i9) {
        AbstractC1566a.h(j >= 0);
        this.f674a = i9;
        this.f675b = j;
    }
}
