package androidx.lifecycle;

/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0562x {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0555p f9904a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0559u f9905b;

    public final void a(InterfaceC0561w interfaceC0561w, EnumC0554o enumC0554o) {
        EnumC0555p a5 = enumC0554o.a();
        EnumC0555p state1 = this.f9904a;
        kotlin.jvm.internal.h.e(state1, "state1");
        if (a5.compareTo(state1) < 0) {
            state1 = a5;
        }
        this.f9904a = state1;
        this.f9905b.d(interfaceC0561w, enumC0554o);
        this.f9904a = a5;
    }
}
