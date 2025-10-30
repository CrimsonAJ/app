package c8;

import b8.InterfaceC0725e;
import b8.InterfaceC0726f;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.gms.internal.measurement.D1;
import d8.AbstractC1130a;

/* renamed from: c8.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0793c {

    /* renamed from: a, reason: collision with root package name */
    public static final E7.d[] f11751a = new E7.d[0];

    /* renamed from: b, reason: collision with root package name */
    public static final G6.a f11752b = new G6.a("NULL", 3);

    /* renamed from: c, reason: collision with root package name */
    public static final G6.a f11753c = new G6.a("UNINITIALIZED", 3);

    public static final Object a(E7.d dVar, O7.q qVar, InterfaceC0726f interfaceC0726f, InterfaceC0725e[] interfaceC0725eArr) {
        s sVar = new s(null, qVar, interfaceC0726f, interfaceC0725eArr);
        d8.t tVar = new d8.t(dVar, dVar.getContext());
        Object d02 = AbstractC1002u1.d0(tVar, tVar, sVar);
        if (d02 == F7.a.f2587a) {
            return d02;
        }
        return A7.n.f558a;
    }

    public static final Object b(E7.i iVar, Object obj, Object obj2, O7.p pVar, E7.d frame) {
        Object invoke;
        Object m9 = AbstractC1130a.m(iVar, obj2);
        try {
            E e8 = new E(frame, iVar);
            if (!u0.z.i(pVar)) {
                invoke = D1.N(pVar, obj, e8);
            } else {
                kotlin.jvm.internal.r.c(2, pVar);
                invoke = pVar.invoke(obj, e8);
            }
            AbstractC1130a.g(iVar, m9);
            if (invoke == F7.a.f2587a) {
                kotlin.jvm.internal.h.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            AbstractC1130a.g(iVar, m9);
            throw th;
        }
    }
}
