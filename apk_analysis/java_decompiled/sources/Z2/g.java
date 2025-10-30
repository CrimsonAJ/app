package Z2;

import a3.InterfaceC0491b;
import android.content.Context;
import d0.o;
import f3.C1162a;
import f3.j;
import z7.InterfaceC2251a;

/* loaded from: classes.dex */
public final class g implements InterfaceC0491b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8962a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0491b f8963b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2251a f8964c;

    public /* synthetic */ g(InterfaceC0491b interfaceC0491b, InterfaceC2251a interfaceC2251a, int i9) {
        this.f8962a = i9;
        this.f8963b = interfaceC0491b;
        this.f8964c = interfaceC2251a;
    }

    @Override // z7.InterfaceC2251a
    public final Object get() {
        switch (this.f8962a) {
            case 0:
                return new f((Context) ((e) this.f8963b).f8958b, (d) ((e) this.f8964c).get());
            default:
                return new f3.h(new o(3), new e0.c(2), C1162a.f17331f, (j) ((e) this.f8963b).get(), this.f8964c);
        }
    }
}
