package t0;

import b5.G1;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1969c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0.n f22952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22953c;

    public /* synthetic */ RunnableC1969c(d0.n nVar, int i9, int i10) {
        this.f22951a = i10;
        this.f22952b = nVar;
        this.f22953c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22951a) {
            case 0:
                C c3 = ((C1971e) ((G1) this.f22952b.f16660f).f10719d).f22966d;
                if (c3 != null) {
                    c3.j(this.f22953c);
                    return;
                }
                return;
            default:
                C c9 = ((C1971e) ((G1) this.f22952b.f16660f).f10719d).f22966d;
                if (c9 != null) {
                    c9.k(this.f22953c);
                    return;
                }
                return;
        }
    }
}
