package b5;

/* renamed from: b5.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0669v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0609A f11330c;

    public /* synthetic */ RunnableC0669v(AbstractC0609A abstractC0609A, long j, int i9) {
        this.f11328a = i9;
        this.f11329b = j;
        this.f11330c = abstractC0609A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11328a) {
            case 0:
                ((C0677z) this.f11330c).r0(this.f11329b);
                return;
            default:
                C0621d1 c0621d1 = (C0621d1) this.f11330c;
                C0677z c0677z = ((C0650n0) c0621d1.f1707a).f11236q;
                C0650n0.c(c0677z);
                c0677z.o0(this.f11329b);
                c0621d1.f11066e = null;
                return;
        }
    }
}
