package i7;

import X.InterfaceC0408h;
import android.content.Context;
import b7.C0701c;
import l6.C1574f;
import z7.InterfaceC2251a;

/* renamed from: i7.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1398m implements l7.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18895a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2251a f18896b;

    public /* synthetic */ C1398m(InterfaceC2251a interfaceC2251a, int i9) {
        this.f18895a = i9;
        this.f18896b = interfaceC2251a;
    }

    @Override // z7.InterfaceC2251a
    public final Object get() {
        InterfaceC2251a interfaceC2251a = this.f18896b;
        switch (this.f18895a) {
            case 0:
                return new C1397l((S6.b) ((l7.c) interfaceC2251a).f20611a);
            case 1:
                C1574f firebaseApp = (C1574f) ((l7.c) interfaceC2251a).f20611a;
                kotlin.jvm.internal.h.e(firebaseApp, "firebaseApp");
                O o9 = O.f18775a;
                return O.a(firebaseApp);
            case 2:
                Context appContext = (Context) ((l7.c) interfaceC2251a).f20611a;
                kotlin.jvm.internal.h.e(appContext, "appContext");
                return b0.f.a(new C0701c(C1402q.f18906e), new r(appContext, 0));
            case 3:
                Context appContext2 = (Context) ((l7.c) interfaceC2251a).f20611a;
                kotlin.jvm.internal.h.e(appContext2, "appContext");
                return b0.f.a(new C0701c(C1402q.f18907f), new r(appContext2, 1));
            case 4:
                return new c0((Context) ((l7.c) interfaceC2251a).f20611a);
            case 5:
                return new m7.a((Context) ((l7.c) interfaceC2251a).f20611a);
            default:
                return new m7.n((InterfaceC0408h) interfaceC2251a.get());
        }
    }
}
