package Y7;

import d8.AbstractC1130a;

/* loaded from: classes.dex */
public abstract class V extends AbstractC0480v {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f8788e = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f8789b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8790c;

    /* renamed from: d, reason: collision with root package name */
    public B7.i f8791d;

    @Override // Y7.AbstractC0480v
    public final AbstractC0480v j0(int i9) {
        AbstractC1130a.a(1);
        return this;
    }

    public final void k0(boolean z9) {
        long j;
        long j4 = this.f8789b;
        if (z9) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j9 = j4 - j;
        this.f8789b = j9;
        if (j9 <= 0 && this.f8790c) {
            shutdown();
        }
    }

    public final void l0(I i9) {
        B7.i iVar = this.f8791d;
        if (iVar == null) {
            iVar = new B7.i();
            this.f8791d = iVar;
        }
        iVar.addLast(i9);
    }

    public abstract Thread m0();

    public final void n0(boolean z9) {
        long j;
        long j4 = this.f8789b;
        if (z9) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        this.f8789b = j + j4;
        if (!z9) {
            this.f8790c = true;
        }
    }

    public abstract long o0();

    public final boolean p0() {
        Object removeFirst;
        B7.i iVar = this.f8791d;
        if (iVar == null) {
            return false;
        }
        if (iVar.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = iVar.removeFirst();
        }
        I i9 = (I) removeFirst;
        if (i9 == null) {
            return false;
        }
        i9.run();
        return true;
    }

    public void q0(long j, S s9) {
        C.f8758i.u0(j, s9);
    }

    public abstract void shutdown();
}
