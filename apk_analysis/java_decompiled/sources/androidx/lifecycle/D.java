package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public final F f9786a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9787b;

    /* renamed from: c, reason: collision with root package name */
    public int f9788c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E f9789d;

    public D(E e8, F f9) {
        this.f9789d = e8;
        this.f9786a = f9;
    }

    public final void g(boolean z9) {
        int i9;
        boolean z10;
        boolean z11;
        if (z9 != this.f9787b) {
            this.f9787b = z9;
            if (z9) {
                i9 = 1;
            } else {
                i9 = -1;
            }
            E e8 = this.f9789d;
            int i10 = e8.f9793c;
            e8.f9793c = i9 + i10;
            if (!e8.f9794d) {
                e8.f9794d = true;
                while (true) {
                    try {
                        int i11 = e8.f9793c;
                        if (i10 == i11) {
                            break;
                        }
                        if (i10 == 0 && i11 > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (i10 > 0 && i11 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10) {
                            e8.e();
                        } else if (z11) {
                            e8.f();
                        }
                        i10 = i11;
                    } catch (Throwable th) {
                        e8.f9794d = false;
                        throw th;
                    }
                }
                e8.f9794d = false;
            }
            if (this.f9787b) {
                e8.c(this);
            }
        }
    }

    public void k() {
    }

    public boolean l(InterfaceC0561w interfaceC0561w) {
        return false;
    }

    public abstract boolean m();
}
