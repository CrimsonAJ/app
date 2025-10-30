package G0;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0713L;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: G0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146l extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public Set f2780r;

    /* renamed from: s, reason: collision with root package name */
    public int f2781s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String[] f2782t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0149o f2783u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0146l(String[] strArr, C0149o c0149o, E7.d dVar) {
        super(2, dVar);
        this.f2782t = strArr;
        this.f2783u = c0149o;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0146l(this.f2782t, this.f2783u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0146l) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Set tables;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f2781s;
        C0149o c0149o = this.f2783u;
        if (i9 != 0) {
            if (i9 == 1) {
                tables = this.f2780r;
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            String[] strArr = this.f2782t;
            Set R2 = B7.D.R(Arrays.copyOf(strArr, strArr.length));
            C0713L c0713l = c0149o.f2794h;
            this.f2780r = R2;
            this.f2781s = 1;
            if (c0713l.emit(R2, this) == aVar) {
                return aVar;
            }
            tables = R2;
        }
        C0145k c0145k = c0149o.f2788b;
        kotlin.jvm.internal.h.e(tables, "tables");
        ReentrantLock reentrantLock = c0145k.f2775e;
        reentrantLock.lock();
        try {
            List H02 = B7.k.H0(c0145k.f2774d.values());
            reentrantLock.unlock();
            Iterator it = H02.iterator();
            while (it.hasNext()) {
                ((C0153t) it.next()).f2805a.getClass();
            }
            return A7.n.f558a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
