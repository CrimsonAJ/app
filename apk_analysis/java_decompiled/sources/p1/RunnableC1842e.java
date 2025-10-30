package p1;

import S5.p;

/* renamed from: p1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1842e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final C1847j f22122a;

    /* renamed from: b, reason: collision with root package name */
    public final p f22123b;

    public RunnableC1842e(C1847j c1847j, p pVar) {
        this.f22122a = c1847j;
        this.f22123b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f22122a.f22131a == this) {
            if (AbstractC1845h.f22129f.f(this.f22122a, this, AbstractC1845h.f(this.f22123b))) {
                AbstractC1845h.c(this.f22122a);
            }
        }
    }
}
