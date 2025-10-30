package i8;

import android.util.Log;
import b8.C0718Q;
import com.google.android.gms.internal.measurement.D1;
import i0.AbstractComponentCallbacksC1366v;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import u0.C2042m;
import u0.C2044o;

/* renamed from: i8.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1421k extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f19101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19102f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f19103g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1421k(C1422l c1422l, Object obj, Object obj2, int i9) {
        super(0);
        this.f19100d = i9;
        this.f19101e = c1422l;
        this.f19102f = obj;
        this.f19103g = obj2;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f19100d) {
            case 0:
                D1 d12 = ((C1422l) this.f19101e).f19106b;
                List<Certificate> list = (List) this.f19102f;
                if (d12 != null) {
                    list = d12.g((String) this.f19103g, list);
                }
                ArrayList arrayList = new ArrayList(B7.m.f0(list, 10));
                for (Certificate certificate : list) {
                    kotlin.jvm.internal.h.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 1:
                D1 d13 = ((C1422l) this.f19101e).f19106b;
                kotlin.jvm.internal.h.b(d13);
                return d13.g(((C1411a) this.f19103g).f19063h.f19172d, ((v) this.f19102f).a());
            default:
                C2044o c2044o = (C2044o) this.f19101e;
                for (C2042m c2042m : (Iterable) ((C0718Q) c2044o.f23516f.f11422a).h()) {
                    ((w0.f) this.f19102f).getClass();
                    if (w0.f.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + c2042m + " due to fragment " + ((AbstractComponentCallbacksC1366v) this.f19103g) + " viewmodel being cleared");
                    }
                    c2044o.b(c2042m);
                }
                return A7.n.f558a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1421k(C2042m c2042m, C2044o c2044o, w0.f fVar, AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        super(0);
        this.f19100d = 2;
        this.f19101e = c2044o;
        this.f19102f = fVar;
        this.f19103g = abstractComponentCallbacksC1366v;
    }
}
