package C0;

import A7.m;
import A7.n;
import O7.l;
import S5.p;
import X.O;
import X.P;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.EnumC0554o;
import androidx.lifecycle.InterfaceC0559u;
import androidx.lifecycle.InterfaceC0561w;
import b8.C0718Q;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import p1.C1847j;
import u0.C2042m;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.i implements l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i9, Object obj) {
        super(1);
        this.f1147d = i9;
        this.f1148e = obj;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        MeasurementManager measurementManager;
        switch (this.f1147d) {
            case 0:
                Context it = (Context) obj;
                kotlin.jvm.internal.h.e(it, "it");
                Context context = (Context) this.f1148e;
                kotlin.jvm.internal.h.e(context, "context");
                measurementManager = MeasurementManager.get(context);
                kotlin.jvm.internal.h.d(measurementManager, "get(context)");
                return new g(measurementManager);
            case 1:
                Throwable th = (Throwable) obj;
                O o9 = (O) this.f1148e;
                if (th != null) {
                    o9.f8018h.c(new P(th));
                }
                if (o9.j.f555b != m.f557a) {
                    ((Z.i) o9.j.getValue()).close();
                }
                return n.f558a;
            case 2:
                Throwable th2 = (Throwable) obj;
                e1.l lVar = (e1.l) this.f1148e;
                if (th2 == null) {
                    if (!lVar.f17057a.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th2 instanceof CancellationException) {
                    lVar.f17057a.cancel(true);
                } else {
                    C1847j c1847j = lVar.f17057a;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    c1847j.k(th2);
                }
                return n.f558a;
            case 3:
                ((p) this.f1148e).cancel(false);
                return n.f558a;
            case 4:
                ((g8.i) this.f1148e).e();
                return n.f558a;
            case 5:
                IOException it2 = (IOException) obj;
                kotlin.jvm.internal.h.e(it2, "it");
                byte[] bArr = k8.c.f20141a;
                ((l8.g) this.f1148e).f20648i = true;
                return n.f558a;
            default:
                final C2042m entry = (C2042m) obj;
                kotlin.jvm.internal.h.e(entry, "entry");
                final w0.f fVar = (w0.f) this.f1148e;
                return new InterfaceC0559u() { // from class: w0.i
                    @Override // androidx.lifecycle.InterfaceC0559u
                    public final void d(InterfaceC0561w interfaceC0561w, EnumC0554o enumC0554o) {
                        f this$0 = f.this;
                        kotlin.jvm.internal.h.e(this$0, "this$0");
                        C2042m entry2 = entry;
                        kotlin.jvm.internal.h.e(entry2, "$entry");
                        if (enumC0554o == EnumC0554o.ON_RESUME && ((List) ((C0718Q) this$0.b().f23515e.f11422a).h()).contains(entry2)) {
                            if (f.n()) {
                                Log.v("FragmentNavigator", "Marking transition complete for entry " + entry2 + " due to fragment " + interfaceC0561w + " view lifecycle reaching RESUMED");
                            }
                            this$0.b().b(entry2);
                        }
                        if (enumC0554o == EnumC0554o.ON_DESTROY) {
                            if (f.n()) {
                                Log.v("FragmentNavigator", "Marking transition complete for entry " + entry2 + " due to fragment " + interfaceC0561w + " view lifecycle reaching DESTROYED");
                            }
                            this$0.b().b(entry2);
                        }
                    }
                };
        }
    }
}
