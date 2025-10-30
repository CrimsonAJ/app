package co.notix;

/* loaded from: classes.dex */
public final class pq extends t8 {

    /* renamed from: a, reason: collision with root package name */
    public final xe f12996a;

    public pq(df notificationHandler) {
        kotlin.jvm.internal.h.e(notificationHandler, "notificationHandler");
        this.f12996a = notificationHandler;
    }

    @Override // co.notix.t8
    public final Object a(u8 u8Var, mj mjVar) {
        return ((df) this.f12996a).a(((qq) u8Var).f13073a, mjVar);
    }
}
