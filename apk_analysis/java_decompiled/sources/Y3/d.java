package Y3;

import C3.v;
import D4.n;
import java.util.ArrayDeque;
import java.util.List;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class d extends m3.g implements g {

    /* renamed from: d, reason: collision with root package name */
    public g f8697d;

    /* renamed from: e, reason: collision with root package name */
    public long f8698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8699f;

    /* renamed from: g, reason: collision with root package name */
    public Object f8700g;

    public /* synthetic */ d() {
        this.f8699f = 2;
    }

    @Override // Y3.g
    public final int J() {
        g gVar = this.f8697d;
        gVar.getClass();
        return gVar.J();
    }

    @Override // Y3.g
    public final int a(long j) {
        g gVar = this.f8697d;
        gVar.getClass();
        return gVar.a(j - this.f8698e);
    }

    @Override // Y3.g
    public final long m(int i9) {
        g gVar = this.f8697d;
        gVar.getClass();
        return gVar.m(i9) + this.f8698e;
    }

    @Override // m3.g
    public final void r() {
        boolean z9;
        switch (this.f8699f) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) ((n) this.f8700g).f1861b;
                if (arrayDeque.size() < 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC1566a.m(z9);
                AbstractC1566a.h(!arrayDeque.contains(this));
                this.f6039b = 0;
                this.f8697d = null;
                arrayDeque.addFirst(this);
                return;
            case 1:
                f fVar = (f) this.f8700g;
                synchronized (fVar.f8704b) {
                    this.f6039b = 0;
                    this.f8697d = null;
                    int i9 = fVar.f8710h;
                    fVar.f8710h = i9 + 1;
                    fVar.f8708f[i9] = this;
                    if (!fVar.f8705c.isEmpty() && fVar.f8710h > 0) {
                        fVar.f8704b.notify();
                    }
                }
                return;
            default:
                Z3.i iVar = (Z3.i) ((v) this.f8700g).f1562b;
                iVar.getClass();
                this.f6039b = 0;
                this.f8697d = null;
                iVar.f9050b.add(this);
                return;
        }
    }

    public final void s(long j, g gVar, long j4) {
        this.f20709c = j;
        this.f8697d = gVar;
        if (j4 != Long.MAX_VALUE) {
            j = j4;
        }
        this.f8698e = j;
    }

    @Override // Y3.g
    public final List w(long j) {
        g gVar = this.f8697d;
        gVar.getClass();
        return gVar.w(j - this.f8698e);
    }

    public /* synthetic */ d(h hVar, int i9) {
        this.f8699f = i9;
        this.f8700g = hVar;
    }
}
