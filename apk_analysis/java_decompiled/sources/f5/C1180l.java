package f5;

import d2.v;
import java.util.concurrent.Executor;

/* renamed from: f5.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1180l implements InterfaceC1182n, InterfaceC1173e, InterfaceC1172d, InterfaceC1170b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17424a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f17425b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1169a f17426c;

    /* renamed from: d, reason: collision with root package name */
    public final C1185q f17427d;

    public /* synthetic */ C1180l(Executor executor, InterfaceC1169a interfaceC1169a, C1185q c1185q, int i9) {
        this.f17424a = i9;
        this.f17425b = executor;
        this.f17426c = interfaceC1169a;
        this.f17427d = c1185q;
    }

    @Override // f5.InterfaceC1170b
    public void a() {
        this.f17427d.p();
    }

    @Override // f5.InterfaceC1182n
    public final void b(AbstractC1176h abstractC1176h) {
        switch (this.f17424a) {
            case 0:
                this.f17425b.execute(new v(this, 3, abstractC1176h));
                return;
            default:
                this.f17425b.execute(new v(this, 4, abstractC1176h));
                return;
        }
    }

    @Override // f5.InterfaceC1173e
    public void o(Object obj) {
        this.f17427d.o(obj);
    }

    @Override // f5.InterfaceC1172d
    public void y(Exception exc) {
        this.f17427d.n(exc);
    }
}
