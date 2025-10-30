package C0;

import A7.n;
import Y7.B;
import Y7.C0464h;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import com.google.android.gms.internal.measurement.D1;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f1152a;

    public g(MeasurementManager mMeasurementManager) {
        kotlin.jvm.internal.h.e(mMeasurementManager, "mMeasurementManager");
        this.f1152a = mMeasurementManager;
    }

    public static Object b(g gVar, a aVar, E7.d<? super n> dVar) {
        new C0464h(1, D1.A(dVar)).s();
        MeasurementManager measurementManager = gVar.f1152a;
        throw null;
    }

    public static Object d(g gVar, E7.d<? super Integer> dVar) {
        C0464h c0464h = new C0464h(1, D1.A(dVar));
        c0464h.s();
        gVar.f1152a.getMeasurementApiStatus(new e(0), new L.e(c0464h));
        return c0464h.r();
    }

    public static Object g(g gVar, h hVar, E7.d<? super n> dVar) {
        Object f9 = B.f(new f(gVar, null), dVar);
        if (f9 == F7.a.f2587a) {
            return f9;
        }
        return n.f558a;
    }

    public static Object h(g gVar, Uri uri, InputEvent inputEvent, E7.d<? super n> dVar) {
        C0464h c0464h = new C0464h(1, D1.A(dVar));
        c0464h.s();
        gVar.f1152a.registerSource(uri, inputEvent, new e(0), new L.e(c0464h));
        Object r5 = c0464h.r();
        if (r5 == F7.a.f2587a) {
            return r5;
        }
        return n.f558a;
    }

    public static Object j(g gVar, Uri uri, E7.d<? super n> dVar) {
        C0464h c0464h = new C0464h(1, D1.A(dVar));
        c0464h.s();
        gVar.f1152a.registerTrigger(uri, new e(0), new L.e(c0464h));
        Object r5 = c0464h.r();
        if (r5 == F7.a.f2587a) {
            return r5;
        }
        return n.f558a;
    }

    public static Object l(g gVar, i iVar, E7.d<? super n> dVar) {
        new C0464h(1, D1.A(dVar)).s();
        MeasurementManager measurementManager = gVar.f1152a;
        throw null;
    }

    public static Object n(g gVar, j jVar, E7.d<? super n> dVar) {
        new C0464h(1, D1.A(dVar)).s();
        MeasurementManager measurementManager = gVar.f1152a;
        throw null;
    }

    public Object a(a aVar, E7.d<? super n> dVar) {
        return b(this, aVar, dVar);
    }

    public Object c(E7.d<? super Integer> dVar) {
        return d(this, dVar);
    }

    public Object e(h hVar, E7.d<? super n> dVar) {
        return g(this, hVar, dVar);
    }

    public Object f(Uri uri, InputEvent inputEvent, E7.d<? super n> dVar) {
        return h(this, uri, inputEvent, dVar);
    }

    public Object i(Uri uri, E7.d<? super n> dVar) {
        return j(this, uri, dVar);
    }

    public Object k(i iVar, E7.d<? super n> dVar) {
        return l(this, iVar, dVar);
    }

    public Object m(j jVar, E7.d<? super n> dVar) {
        return n(this, jVar, dVar);
    }
}
