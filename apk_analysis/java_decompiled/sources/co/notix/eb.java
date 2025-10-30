package co.notix;

import Y7.InterfaceC0484z;
import b8.C0718Q;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class eb {

    /* renamed from: a, reason: collision with root package name */
    public final xq f12150a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0484z f12151b;

    /* renamed from: c, reason: collision with root package name */
    public final y8 f12152c;

    public eb(xq storage, InterfaceC0484z cs, d9 contextProvider) {
        kotlin.jvm.internal.h.e(storage, "storage");
        kotlin.jvm.internal.h.e(cs, "cs");
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        this.f12150a = storage;
        this.f12151b = cs;
        this.f12152c = contextProvider;
    }

    public static final boolean a(eb ebVar) {
        y8 y8Var = ebVar.f12152c;
        f state = f.RESUMED;
        d9 d9Var = (d9) y8Var;
        d9Var.getClass();
        kotlin.jvm.internal.h.e(state, "state");
        if (d9.a((WeakHashMap) ((C0718Q) d9Var.f12078b).h(), state) != null) {
            return true;
        }
        return false;
    }
}
