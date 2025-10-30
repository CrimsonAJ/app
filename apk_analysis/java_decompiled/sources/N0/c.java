package N0;

import B7.k;
import android.util.Log;
import androidx.lifecycle.EnumC0554o;
import androidx.lifecycle.InterfaceC0559u;
import androidx.lifecycle.InterfaceC0561w;
import b8.C0718Q;
import i0.AbstractComponentCallbacksC1366v;
import java.util.ArrayList;
import kotlin.jvm.internal.h;
import u0.C2042m;
import u0.H;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC0559u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4819b;

    public /* synthetic */ c(int i9, Object obj) {
        this.f4818a = i9;
        this.f4819b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0559u
    public final void d(InterfaceC0561w interfaceC0561w, EnumC0554o enumC0554o) {
        switch (this.f4818a) {
            case 0:
                f this$0 = (f) this.f4819b;
                h.e(this$0, "this$0");
                if (enumC0554o == EnumC0554o.ON_START) {
                    this$0.f4822c = true;
                    return;
                } else {
                    if (enumC0554o == EnumC0554o.ON_STOP) {
                        this$0.f4822c = false;
                        return;
                    }
                    return;
                }
            case 1:
                H this$02 = (H) this.f4819b;
                h.e(this$02, "this$0");
                this$02.f23409q = enumC0554o.a();
                if (this$02.f23396c != null) {
                    ArrayList I02 = k.I0(this$02.f23400g);
                    int size = I02.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = I02.get(i9);
                        i9++;
                        C2042m c2042m = (C2042m) obj;
                        c2042m.getClass();
                        c2042m.f23498d = enumC0554o.a();
                        c2042m.d();
                    }
                    return;
                }
                return;
            default:
                w0.f this$03 = (w0.f) this.f4819b;
                h.e(this$03, "this$0");
                if (enumC0554o == EnumC0554o.ON_DESTROY) {
                    AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = (AbstractComponentCallbacksC1366v) interfaceC0561w;
                    Object obj2 = null;
                    for (Object obj3 : (Iterable) ((C0718Q) this$03.b().f23516f.f11422a).h()) {
                        if (h.a(((C2042m) obj3).f23500f, abstractComponentCallbacksC1366v.f18422y)) {
                            obj2 = obj3;
                        }
                    }
                    C2042m c2042m2 = (C2042m) obj2;
                    if (c2042m2 != null) {
                        if (w0.f.n()) {
                            Log.v("FragmentNavigator", "Marking transition complete for entry " + c2042m2 + " due to fragment " + interfaceC0561w + " lifecycle reaching DESTROYED");
                        }
                        this$03.b().b(c2042m2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
