package k4;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final /* synthetic */ class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1518s f20091a;

    public final void a(int i9) {
        int i10;
        C1518s c1518s = this.f20091a;
        synchronized (c1518s) {
            int i11 = c1518s.f20107i;
            if (i11 != 0 && !c1518s.f20103e) {
                return;
            }
            if (i11 == i9) {
                return;
            }
            c1518s.f20107i = i9;
            if (i9 != 1 && i9 != 0 && i9 != 8) {
                c1518s.f20109l = c1518s.a(i9);
                c1518s.f20102d.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (c1518s.f20104f > 0) {
                    i10 = (int) (elapsedRealtime - c1518s.f20105g);
                } else {
                    i10 = 0;
                }
                c1518s.b(c1518s.f20106h, c1518s.f20109l, i10);
                c1518s.f20105g = elapsedRealtime;
                c1518s.f20106h = 0L;
                c1518s.f20108k = 0L;
                c1518s.j = 0L;
                U u9 = c1518s.f20101c;
                u9.f20026b.clear();
                u9.f20028d = -1;
                u9.f20029e = 0;
                u9.f20030f = 0;
            }
        }
    }
}
