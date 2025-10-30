package Y6;

import Y2.r;
import Y7.B;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.h;
import r6.InterfaceC1930a;
import r6.b;
import r6.c;
import s6.d;
import s6.p;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f8735b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f8736c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f8737d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f8738e = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8739a;

    public /* synthetic */ a(int i9) {
        this.f8739a = i9;
    }

    @Override // s6.d
    public final Object e(r rVar) {
        switch (this.f8739a) {
            case 0:
                Object d9 = rVar.d(new p(InterfaceC1930a.class, Executor.class));
                h.d(d9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return B.j((Executor) d9);
            case 1:
                Object d10 = rVar.d(new p(c.class, Executor.class));
                h.d(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return B.j((Executor) d10);
            case 2:
                Object d11 = rVar.d(new p(b.class, Executor.class));
                h.d(d11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return B.j((Executor) d11);
            default:
                Object d12 = rVar.d(new p(r6.d.class, Executor.class));
                h.d(d12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return B.j((Executor) d12);
        }
    }
}
