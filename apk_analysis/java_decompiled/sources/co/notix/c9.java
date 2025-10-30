package co.notix;

import android.app.Activity;
import b8.C0718Q;
import b8.InterfaceC0707F;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c9 extends kotlin.jvm.internal.i implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d9 f11995a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(d9 d9Var) {
        super(2);
        this.f11995a = d9Var;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0718Q c0718q;
        Object h7;
        WeakHashMap weakHashMap;
        Activity activity = (Activity) obj;
        f newState = (f) obj2;
        kotlin.jvm.internal.h.e(activity, "activity");
        kotlin.jvm.internal.h.e(newState, "newState");
        InterfaceC0707F interfaceC0707F = this.f11995a.f12078b;
        do {
            c0718q = (C0718Q) interfaceC0707F;
            h7 = c0718q.h();
            WeakHashMap weakHashMap2 = (WeakHashMap) h7;
            if (newState == f.NONE) {
                weakHashMap = new WeakHashMap(weakHashMap2);
                weakHashMap.remove(activity);
            } else {
                weakHashMap = new WeakHashMap(weakHashMap2);
                weakHashMap.put(activity, newState);
            }
        } while (!c0718q.g(h7, weakHashMap));
        return A7.n.f558a;
    }
}
