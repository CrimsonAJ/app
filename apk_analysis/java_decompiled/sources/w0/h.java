package w0;

import A7.n;
import O7.l;
import androidx.lifecycle.C0563y;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.InterfaceC0560v;
import androidx.lifecycle.InterfaceC0561w;
import i0.AbstractComponentCallbacksC1366v;
import i0.W;
import java.util.ArrayList;
import u0.C2042m;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.i implements l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f23991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC1366v f23992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2042m f23993f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v, C2042m c2042m) {
        super(1);
        this.f23991d = fVar;
        this.f23992e = abstractComponentCallbacksC1366v;
        this.f23993f = c2042m;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        boolean z9;
        InterfaceC0561w interfaceC0561w = (InterfaceC0561w) obj;
        f fVar = this.f23991d;
        ArrayList arrayList = fVar.f23986g;
        boolean z10 = false;
        if (arrayList != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f23992e;
        if (!z9 || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                }
                Object obj2 = arrayList.get(i9);
                i9++;
                if (kotlin.jvm.internal.h.a(((A7.h) obj2).f547a, abstractComponentCallbacksC1366v.f18422y)) {
                    z10 = true;
                    break;
                }
            }
        }
        if (interfaceC0561w != null && !z10) {
            W t7 = abstractComponentCallbacksC1366v.t();
            t7.b();
            C0563y c0563y = t7.f18267e;
            if (c0563y.f9908d.compareTo(EnumC0555p.f9895c) >= 0) {
                c0563y.V((InterfaceC0560v) fVar.f23988i.invoke(this.f23993f));
            }
        }
        return n.f558a;
    }
}
