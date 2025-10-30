package d7;

import f5.InterfaceC1170b;
import f5.InterfaceC1172d;
import f5.InterfaceC1173e;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class c implements InterfaceC1173e, InterfaceC1172d, InterfaceC1170b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16889a;

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f16890b;

    public c(int i9) {
        this.f16889a = i9;
        switch (i9) {
            case 1:
                this.f16890b = new CountDownLatch(1);
                return;
            default:
                this.f16890b = new CountDownLatch(1);
                return;
        }
    }

    @Override // f5.InterfaceC1170b
    public final void a() {
        switch (this.f16889a) {
            case 0:
                this.f16890b.countDown();
                return;
            default:
                this.f16890b.countDown();
                return;
        }
    }

    @Override // f5.InterfaceC1173e
    public final void o(Object obj) {
        switch (this.f16889a) {
            case 0:
                this.f16890b.countDown();
                return;
            default:
                this.f16890b.countDown();
                return;
        }
    }

    @Override // f5.InterfaceC1172d
    public final void y(Exception exc) {
        switch (this.f16889a) {
            case 0:
                this.f16890b.countDown();
                return;
            default:
                this.f16890b.countDown();
                return;
        }
    }
}
