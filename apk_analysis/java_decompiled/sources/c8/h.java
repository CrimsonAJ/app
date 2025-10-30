package c8;

import Y7.C0477s;
import a8.EnumC0509a;
import b8.C0723c;
import b8.InterfaceC0725e;
import b8.InterfaceC0726f;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import d8.AbstractC1130a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class h implements v {

    /* renamed from: a, reason: collision with root package name */
    public final E7.i f11764a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11765b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC0509a f11766c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0725e f11767d;

    public h(InterfaceC0725e interfaceC0725e, E7.i iVar, int i9, EnumC0509a enumC0509a) {
        this.f11764a = iVar;
        this.f11765b = i9;
        this.f11766c = enumC0509a;
        this.f11767d = interfaceC0725e;
    }

    @Override // c8.v
    public final InterfaceC0725e a(E7.i iVar, int i9, EnumC0509a enumC0509a) {
        E7.i iVar2 = this.f11764a;
        E7.i plus = iVar.plus(iVar2);
        EnumC0509a enumC0509a2 = EnumC0509a.f9184a;
        EnumC0509a enumC0509a3 = this.f11766c;
        int i10 = this.f11765b;
        if (enumC0509a == enumC0509a2) {
            if (i10 != -3) {
                if (i9 != -3) {
                    if (i10 != -2) {
                        if (i9 != -2) {
                            i9 += i10;
                            if (i9 < 0) {
                                i9 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i9 = i10;
            }
            enumC0509a = enumC0509a3;
        }
        if (kotlin.jvm.internal.h.a(plus, iVar2) && i9 == i10 && enumC0509a == enumC0509a3) {
            return this;
        }
        return b(plus, i9, enumC0509a);
    }

    public abstract h b(E7.i iVar, int i9, EnumC0509a enumC0509a);

    public abstract Object c(InterfaceC0726f interfaceC0726f, E7.d dVar);

    @Override // b8.InterfaceC0725e
    public final Object collect(InterfaceC0726f interfaceC0726f, E7.d dVar) {
        E7.i i9;
        boolean z9;
        A7.n nVar = A7.n.f558a;
        F7.a aVar = F7.a.f2587a;
        if (this.f11765b == -3) {
            E7.i context = dVar.getContext();
            Boolean bool = Boolean.FALSE;
            C0477s c0477s = C0477s.f8851f;
            E7.i iVar = this.f11764a;
            if (!((Boolean) iVar.fold(bool, c0477s)).booleanValue()) {
                i9 = context.plus(iVar);
            } else {
                i9 = Y7.B.i(context, iVar, false);
            }
            if (kotlin.jvm.internal.h.a(i9, context)) {
                Object c3 = c(interfaceC0726f, dVar);
                if (c3 == aVar) {
                    return c3;
                }
            } else {
                E7.e eVar = E7.e.f1977a;
                if (kotlin.jvm.internal.h.a(i9.get(eVar), context.get(eVar))) {
                    E7.i context2 = dVar.getContext();
                    if (interfaceC0726f instanceof D) {
                        z9 = true;
                    } else {
                        z9 = interfaceC0726f instanceof x;
                    }
                    if (!z9) {
                        interfaceC0726f = new C0723c(interfaceC0726f, context2);
                    }
                    Object b9 = AbstractC0793c.b(i9, interfaceC0726f, AbstractC1130a.l(i9), new C0797g(this, null), dVar);
                    if (b9 == aVar) {
                        return b9;
                    }
                }
            }
            return nVar;
        }
        Object f9 = Y7.B.f(new C0795e(interfaceC0726f, this, null), dVar);
        if (f9 != aVar) {
            f9 = nVar;
        }
        if (f9 == aVar) {
            return f9;
        }
        return nVar;
    }

    public final String e() {
        ArrayList arrayList = new ArrayList(4);
        E7.j jVar = E7.j.f1978a;
        E7.i iVar = this.f11764a;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i9 = this.f11765b;
        if (i9 != -3) {
            arrayList.add("capacity=" + i9);
        }
        EnumC0509a enumC0509a = EnumC0509a.f9184a;
        EnumC0509a enumC0509a2 = this.f11766c;
        if (enumC0509a2 != enumC0509a) {
            arrayList.add("onBufferOverflow=" + enumC0509a2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return AbstractC0953k1.p(sb, B7.k.u0(arrayList, ", ", null, null, null, 62), ']');
    }

    public final String toString() {
        return this.f11767d + " -> " + e();
    }
}
