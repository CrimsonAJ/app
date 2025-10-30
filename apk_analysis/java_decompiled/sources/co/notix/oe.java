package co.notix;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class oe extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te f12881a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(te teVar) {
        super(0);
        this.f12881a = teVar;
    }

    @Override // O7.a
    public final Object invoke() {
        Object systemService = ((d9) this.f12881a.f13218a).a().getSystemService("connectivity");
        kotlin.jvm.internal.h.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }
}
