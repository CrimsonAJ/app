package l6;

import Y2.r;
import Y7.B;
import java.util.concurrent.Executor;
import r6.InterfaceC1930a;
import s6.p;

/* renamed from: l6.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1575g implements s6.d {

    /* renamed from: b, reason: collision with root package name */
    public static final C1575g f20596b = new C1575g(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C1575g f20597c = new C1575g(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C1575g f20598d = new C1575g(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C1575g f20599e = new C1575g(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20600a;

    public /* synthetic */ C1575g(int i9) {
        this.f20600a = i9;
    }

    @Override // s6.d
    public final Object e(r rVar) {
        switch (this.f20600a) {
            case 0:
                Object d9 = rVar.d(new p(InterfaceC1930a.class, Executor.class));
                kotlin.jvm.internal.h.d(d9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return B.j((Executor) d9);
            case 1:
                Object d10 = rVar.d(new p(r6.c.class, Executor.class));
                kotlin.jvm.internal.h.d(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return B.j((Executor) d10);
            case 2:
                Object d11 = rVar.d(new p(r6.b.class, Executor.class));
                kotlin.jvm.internal.h.d(d11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return B.j((Executor) d11);
            default:
                Object d12 = rVar.d(new p(r6.d.class, Executor.class));
                kotlin.jvm.internal.h.d(d12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return B.j((Executor) d12);
        }
    }
}
