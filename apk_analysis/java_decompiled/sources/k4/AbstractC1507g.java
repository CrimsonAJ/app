package k4;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import l4.AbstractC1566a;

/* renamed from: k4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1507g implements InterfaceC1513m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20057a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f20058b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f20059c;

    /* renamed from: d, reason: collision with root package name */
    public C1516p f20060d;

    public AbstractC1507g(boolean z9) {
        this.f20057a = z9;
    }

    @Override // k4.InterfaceC1513m
    public final void a(W w7) {
        w7.getClass();
        ArrayList arrayList = this.f20058b;
        if (!arrayList.contains(w7)) {
            arrayList.add(w7);
            this.f20059c++;
        }
    }

    public final void c(int i9) {
        boolean z9;
        C1516p c1516p = this.f20060d;
        int i10 = l4.y.f20553a;
        for (int i11 = 0; i11 < this.f20059c; i11++) {
            W w7 = (W) this.f20058b.get(i11);
            boolean z10 = this.f20057a;
            C1518s c1518s = (C1518s) w7;
            synchronized (c1518s) {
                P5.S s9 = C1518s.f20092n;
                if (z10 && (c1516p.f20084h & 8) != 8) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    c1518s.f20106h += i9;
                }
            }
        }
    }

    public final void d() {
        boolean z9;
        boolean z10;
        C1516p c1516p = this.f20060d;
        int i9 = l4.y.f20553a;
        for (int i10 = 0; i10 < this.f20059c; i10++) {
            W w7 = (W) this.f20058b.get(i10);
            boolean z11 = this.f20057a;
            C1518s c1518s = (C1518s) w7;
            synchronized (c1518s) {
                try {
                    P5.S s9 = C1518s.f20092n;
                    if (z11 && (c1516p.f20084h & 8) != 8) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        if (c1518s.f20104f > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        AbstractC1566a.m(z10);
                        c1518s.f20102d.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i11 = (int) (elapsedRealtime - c1518s.f20105g);
                        c1518s.j += i11;
                        long j = c1518s.f20108k;
                        long j4 = c1518s.f20106h;
                        c1518s.f20108k = j + j4;
                        if (i11 > 0) {
                            c1518s.f20101c.a((int) Math.sqrt(j4), (((float) j4) * 8000.0f) / i11);
                            if (c1518s.j < 2000) {
                                if (c1518s.f20108k >= 524288) {
                                }
                                c1518s.b(c1518s.f20106h, c1518s.f20109l, i11);
                                c1518s.f20105g = elapsedRealtime;
                                c1518s.f20106h = 0L;
                            }
                            c1518s.f20109l = c1518s.f20101c.b();
                            c1518s.b(c1518s.f20106h, c1518s.f20109l, i11);
                            c1518s.f20105g = elapsedRealtime;
                            c1518s.f20106h = 0L;
                        }
                        c1518s.f20104f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f20060d = null;
    }

    public final void h() {
        for (int i9 = 0; i9 < this.f20059c; i9++) {
            ((W) this.f20058b.get(i9)).getClass();
        }
    }

    public final void i(C1516p c1516p) {
        boolean z9;
        this.f20060d = c1516p;
        for (int i9 = 0; i9 < this.f20059c; i9++) {
            W w7 = (W) this.f20058b.get(i9);
            boolean z10 = this.f20057a;
            C1518s c1518s = (C1518s) w7;
            synchronized (c1518s) {
                try {
                    P5.S s9 = C1518s.f20092n;
                    if (z10 && (c1516p.f20084h & 8) != 8) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        if (c1518s.f20104f == 0) {
                            c1518s.f20102d.getClass();
                            c1518s.f20105g = SystemClock.elapsedRealtime();
                        }
                        c1518s.f20104f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // k4.InterfaceC1513m
    public Map l() {
        return Collections.EMPTY_MAP;
    }
}
