package i7;

import X.InterfaceC0408h;
import b8.C0733m;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public final E7.i f18762a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0408h f18763b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f18764c;

    /* renamed from: d, reason: collision with root package name */
    public final C0733m f18765d;

    public K(E7.i backgroundDispatcher, InterfaceC0408h dataStore) {
        kotlin.jvm.internal.h.e(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.h.e(dataStore, "dataStore");
        this.f18762a = backgroundDispatcher;
        this.f18763b = dataStore;
        this.f18764c = new AtomicReference();
        this.f18765d = new C0733m(new C0733m(dataStore.b(), 1, new G7.j(3, null)), 4, this);
        Y7.B.r(Y7.B.a(backgroundDispatcher), null, new F(this, null), 3);
    }
}
