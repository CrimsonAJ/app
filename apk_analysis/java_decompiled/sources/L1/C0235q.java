package L1;

import L2.C0237a;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import c7.C0782b;
import c7.C0785e;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.gms.internal.measurement.Y1;
import f5.C1185q;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import t6.EnumC2024i;

/* renamed from: L1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235q extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public C0785e f4539r;

    /* renamed from: s, reason: collision with root package name */
    public int f4540s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0237a f4541t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0235q(C0237a c0237a, E7.d dVar) {
        super(2, dVar);
        this.f4541t = c0237a;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0235q(this.f4541t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0235q) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        C0785e c0785e;
        Object h7;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4540s;
        if (i9 != 0) {
            if (i9 == 1) {
                c0785e = this.f4539r;
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            C0785e v8 = D1.v();
            d7.i iVar = v8.f11717e;
            d7.m mVar = iVar.f16922g;
            long j = mVar.f16951a.getLong("minimum_fetch_interval_in_seconds", d7.i.f16915i);
            HashMap hashMap = new HashMap(iVar.f16923h);
            hashMap.put("X-Firebase-RC-Fetch-Type", "BASE/1");
            C1185q m9 = iVar.f16920e.b().e(iVar.f16918c, new d7.f(iVar, j, hashMap)).m(EnumC2024i.f23310a, new X0.k(10)).m(v8.f11714b, new C0782b(v8));
            this.f4539r = v8;
            this.f4540s = 1;
            Object a5 = Y1.a(m9, this);
            if (a5 == aVar) {
                return aVar;
            }
            c0785e = v8;
            obj = a5;
        }
        if (((Boolean) obj).booleanValue()) {
            HashMap a9 = c0785e.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(B7.y.D(a9.size()));
            for (Map.Entry entry : a9.entrySet()) {
                Object key = entry.getKey();
                try {
                    d7.o oVar = (d7.o) entry.getValue();
                    if (oVar.f16959b == 0) {
                        h7 = "";
                    } else {
                        h7 = oVar.f16958a;
                    }
                } catch (Throwable th) {
                    h7 = AbstractC0485a.h(th);
                }
                if (h7 instanceof A7.i) {
                    h7 = "";
                }
                linkedHashMap.put(key, (String) h7);
            }
            this.f4541t.a(linkedHashMap);
        }
        return A7.n.f558a;
    }
}
