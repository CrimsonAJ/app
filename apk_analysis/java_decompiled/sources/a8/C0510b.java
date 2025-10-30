package a8;

import Y7.B;
import Y7.C0464h;
import Y7.I0;
import a.AbstractC0485a;
import b8.C0727g;
import com.google.android.gms.internal.measurement.D1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: a8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0510b implements I0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f9188a = g.f9221p;

    /* renamed from: b, reason: collision with root package name */
    public C0464h f9189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f9190c;

    public C0510b(e eVar) {
        this.f9190c = eVar;
    }

    @Override // Y7.I0
    public final void a(d8.u uVar, int i9) {
        C0464h c0464h = this.f9189b;
        if (c0464h != null) {
            c0464h.a(uVar, i9);
        }
    }

    public final Object b(C0727g c0727g) {
        m mVar;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f9202g;
        e eVar = this.f9190c;
        m mVar2 = (m) atomicReferenceFieldUpdater.get(eVar);
        while (!eVar.v()) {
            long andIncrement = e.f9198c.getAndIncrement(eVar);
            long j = g.f9208b;
            long j4 = andIncrement / j;
            int i9 = (int) (andIncrement % j);
            if (mVar2.f17007c != j4) {
                mVar = eVar.o(j4, mVar2);
                if (mVar == null) {
                    continue;
                }
            } else {
                mVar = mVar2;
            }
            Object F2 = eVar.F(mVar, i9, andIncrement, null);
            G6.a aVar = g.f9218m;
            if (F2 != aVar) {
                G6.a aVar2 = g.f9220o;
                if (F2 == aVar2) {
                    if (andIncrement < eVar.s()) {
                        mVar.a();
                    }
                    mVar2 = mVar;
                } else {
                    if (F2 == g.f9219n) {
                        e eVar2 = this.f9190c;
                        C0464h n7 = B.n(D1.A(c0727g));
                        try {
                            this.f9189b = n7;
                            Object F8 = eVar2.F(mVar, i9, andIncrement, this);
                            if (F8 == aVar) {
                                a(mVar, i9);
                            } else {
                                if (F8 == aVar2) {
                                    if (andIncrement < eVar2.s()) {
                                        mVar.a();
                                    }
                                    m mVar3 = (m) e.f9202g.get(eVar2);
                                    while (true) {
                                        if (eVar2.v()) {
                                            C0464h c0464h = this.f9189b;
                                            kotlin.jvm.internal.h.b(c0464h);
                                            this.f9189b = null;
                                            this.f9188a = g.f9217l;
                                            Throwable p9 = eVar.p();
                                            if (p9 == null) {
                                                c0464h.resumeWith(Boolean.FALSE);
                                            } else {
                                                c0464h.resumeWith(AbstractC0485a.h(p9));
                                            }
                                        } else {
                                            long andIncrement2 = e.f9198c.getAndIncrement(eVar2);
                                            long j9 = g.f9208b;
                                            long j10 = andIncrement2 / j9;
                                            int i10 = (int) (andIncrement2 % j9);
                                            if (mVar3.f17007c != j10) {
                                                m o9 = eVar2.o(j10, mVar3);
                                                if (o9 != null) {
                                                    mVar3 = o9;
                                                }
                                            }
                                            Object F9 = eVar2.F(mVar3, i10, andIncrement2, this);
                                            if (F9 == g.f9218m) {
                                                a(mVar3, i10);
                                                break;
                                            }
                                            if (F9 == g.f9220o) {
                                                if (andIncrement2 < eVar2.s()) {
                                                    mVar3.a();
                                                }
                                            } else if (F9 != g.f9219n) {
                                                mVar3.a();
                                                this.f9188a = F9;
                                                this.f9189b = null;
                                                bool = Boolean.TRUE;
                                            } else {
                                                throw new IllegalStateException("unexpected");
                                            }
                                        }
                                    }
                                } else {
                                    mVar.a();
                                    this.f9188a = F8;
                                    this.f9189b = null;
                                    bool = Boolean.TRUE;
                                }
                                n7.b(bool, null);
                            }
                            return n7.r();
                        } catch (Throwable th) {
                            n7.z();
                            throw th;
                        }
                    }
                    mVar.a();
                    this.f9188a = F2;
                    return Boolean.TRUE;
                }
            } else {
                throw new IllegalStateException("unreachable");
            }
        }
        this.f9188a = g.f9217l;
        Throwable p10 = eVar.p();
        if (p10 == null) {
            return Boolean.FALSE;
        }
        int i11 = d8.v.f17008a;
        throw p10;
    }
}
