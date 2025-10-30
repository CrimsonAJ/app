package co.notix;

import Y7.C0464h;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.google.android.gms.internal.measurement.D1;
import e1.r;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p1.C1847j;

/* loaded from: classes.dex */
public final class wo extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13458a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13459b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ap f13460c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f13461d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo(ap apVar, long j, E7.d dVar) {
        super(2, dVar);
        this.f13460c = apVar;
        this.f13461d = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        wo woVar = new wo(this.f13460c, this.f13461d, dVar);
        woVar.f13459b = obj;
        return woVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((wo) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object h7;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13458a;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
                ap apVar = this.f13460c;
                long j = this.f13461d;
                f1.k b02 = f1.k.b0(((d9) apVar.f11872a).a());
                String a5 = apVar.a();
                r rVar = new r(apVar.b());
                rVar.f17064c.f21037g = TimeUnit.MILLISECONDS.toMillis(j);
                if (Long.MAX_VALUE - System.currentTimeMillis() > rVar.f17064c.f21037g) {
                    e1.w f02 = new f1.e(b02, a5, 1, Collections.singletonList(ap.a(apVar, rVar))).f0();
                    kotlin.jvm.internal.h.d(f02, "workManager.enqueueUniqu…sAndBuild()\n            )");
                    C1847j result = (C1847j) ((O0.c) f02).f5264c;
                    kotlin.jvm.internal.h.d(result, "result");
                    if (result.isDone()) {
                        try {
                            obj = result.get();
                        } catch (ExecutionException e8) {
                            Throwable cause = e8.getCause();
                            if (cause == null) {
                                throw e8;
                            }
                            throw cause;
                        }
                    } else {
                        this.f13459b = this;
                        this.f13458a = 1;
                        C0464h c0464h = new C0464h(1, D1.A(this));
                        c0464h.s();
                        result.a(new uo(c0464h, result), e1.i.f17051a);
                        c0464h.u(new vo(result));
                        obj = c0464h.r();
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
                }
            }
            kotlin.jvm.internal.h.d(obj, "result.await()");
            h7 = (e1.v) obj;
        } catch (Throwable th) {
            h7 = AbstractC0485a.h(th);
        }
        ap apVar2 = this.f13460c;
        long j4 = this.f13461d;
        Throwable a9 = A7.j.a(h7);
        if (a9 == null) {
            md.f12779a.b(apVar2.a() + " enqueue success. delayMillis=" + j4);
        } else {
            md.f12779a.a(apVar2.a() + " enqueue failure", a9);
        }
        return A7.n.f558a;
    }
}
