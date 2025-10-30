package Y7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class k0 extends r0 implements InterfaceC0474o {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(InterfaceC0465h0 interfaceC0465h0) {
        super(true);
        C0471l c0471l;
        C0471l c0471l2;
        boolean z9 = true;
        H(interfaceC0465h0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r0.f8849b;
        InterfaceC0470k interfaceC0470k = (InterfaceC0470k) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0470k instanceof C0471l) {
            c0471l = (C0471l) interfaceC0470k;
        } else {
            c0471l = null;
        }
        if (c0471l != null) {
            r0 k5 = c0471l.k();
            while (!k5.A()) {
                InterfaceC0470k interfaceC0470k2 = (InterfaceC0470k) atomicReferenceFieldUpdater.get(k5);
                if (interfaceC0470k2 instanceof C0471l) {
                    c0471l2 = (C0471l) interfaceC0470k2;
                } else {
                    c0471l2 = null;
                }
                if (c0471l2 != null) {
                    k5 = c0471l2.k();
                }
            }
            this.f8820c = z9;
        }
        z9 = false;
        this.f8820c = z9;
    }

    @Override // Y7.r0
    public final boolean A() {
        return this.f8820c;
    }

    @Override // Y7.r0
    public final boolean B() {
        return true;
    }
}
