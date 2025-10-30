package A4;

import android.util.Log;
import androidx.lifecycle.E;
import b5.C0611a0;
import b5.J1;
import c7.C0784d;
import e5.C1144a;
import f5.C1181m;
import f5.C1185q;
import f5.InterfaceC1170b;
import java.util.Date;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f346a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f347b;

    public /* synthetic */ e(int i9, Object obj) {
        this.f346a = i9;
        this.f347b = obj;
    }

    private final void a() {
        Object obj;
        synchronized (((E) this.f347b).f9791a) {
            obj = ((E) this.f347b).f9796f;
            ((E) this.f347b).f9796f = E.f9790k;
        }
        ((E) this.f347b).i(obj);
    }

    private final void b() {
        boolean a5;
        d7.k kVar = (d7.k) this.f347b;
        synchronized (kVar) {
            a5 = kVar.a();
            if (a5) {
                kVar.j(true);
            }
        }
        if (!a5) {
            return;
        }
        d7.l c3 = kVar.f16945q.c();
        kVar.f16944p.getClass();
        if (new Date(System.currentTimeMillis()).before(c3.f16948b)) {
            kVar.i();
            return;
        }
        T6.d dVar = (T6.d) kVar.f16939k;
        C1185q e8 = dVar.e();
        C1185q d9 = dVar.d();
        C1185q e9 = s8.n.D(e8, d9).e(kVar.f16937h, new C0784d(kVar, e8, d9, 3));
        s8.n.D(e9).l(kVar.f16937h, new N1.h(kVar, 10, e9));
    }

    private final void c() {
        C1144a c1144a = (C1144a) this.f347b;
        synchronized (c1144a.f17202a) {
            try {
                if (!c1144a.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(c1144a.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                c1144a.d();
                if (!c1144a.b()) {
                    return;
                }
                c1144a.f17204c = 1;
                c1144a.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d() {
        synchronized (((C1181m) this.f347b).f17430c) {
            try {
                InterfaceC1170b interfaceC1170b = (InterfaceC1170b) ((C1181m) this.f347b).f17431d;
                if (interfaceC1170b != null) {
                    interfaceC1170b.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x02a8, code lost:
    
        if (r5.t1() >= 242600) goto L82;
     */
    /* JADX WARN: Type inference failed for: r0v122, types: [k4.K, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [b5.D1, b5.c] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.e.run():void");
    }

    public e(C0611a0 c0611a0, boolean z9) {
        this.f346a = 11;
        this.f347b = c0611a0;
    }

    public e(J1 j12, Y2.k kVar) {
        this.f346a = 15;
        this.f347b = j12;
    }
}
