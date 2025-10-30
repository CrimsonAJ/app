package Y2;

import a3.InterfaceC0491b;
import android.content.Context;
import d3.C1120b;
import d3.InterfaceC1121c;
import e3.C1142b;
import z7.InterfaceC2251a;

/* loaded from: classes.dex */
public final class t implements InterfaceC0491b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8657a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0491b f8658b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2251a f8659c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0491b f8660d;

    public /* synthetic */ t(InterfaceC0491b interfaceC0491b, InterfaceC2251a interfaceC2251a, InterfaceC0491b interfaceC0491b2, int i9) {
        this.f8657a = i9;
        this.f8658b = interfaceC0491b;
        this.f8659c = interfaceC2251a;
        this.f8660d = interfaceC0491b2;
    }

    @Override // z7.InterfaceC2251a
    public final Object get() {
        switch (this.f8657a) {
            case 0:
                return new s(new d0.o(3), new e0.c(2), (InterfaceC1121c) ((C1120b) this.f8658b).get(), (e3.j) ((e3.k) this.f8659c).get(), (e3.l) ((e3.m) this.f8660d).get());
            default:
                return new e3.d((Context) ((Z2.e) this.f8658b).f8958b, (f3.d) this.f8659c.get(), (C1142b) ((o) this.f8660d).get());
        }
    }
}
