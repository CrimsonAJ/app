package D4;

import android.os.Bundle;
import android.os.Looper;
import i0.AbstractComponentCallbacksC1366v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class L extends AbstractComponentCallbacksC1366v implements InterfaceC0089h {

    /* renamed from: w0, reason: collision with root package name */
    public static final WeakHashMap f1828w0 = new WeakHashMap();

    /* renamed from: v0, reason: collision with root package name */
    public final A3.E f1829v0 = new A3.E(1, (byte) 0);

    /* JADX WARN: Removed duplicated region for block: B:26:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0011 A[SYNTHETIC] */
    @Override // i0.AbstractComponentCallbacksC1366v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            super.C(r10, r11, r12)
            A3.E r0 = r9.f1829v0
            java.lang.Object r0 = r0.f47c
            java.util.Map r0 = (java.util.Map) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r0.next()
            D4.p r1 = (D4.p) r1
            java.util.concurrent.atomic.AtomicReference r2 = r1.f1870c
            java.lang.Object r2 = r2.get()
            D4.J r2 = (D4.J) r2
            r3 = 3
            r4 = 0
            D4.g r5 = r1.f1874g
            java.util.concurrent.atomic.AtomicReference r6 = r1.f1870c
            r7 = 1
            if (r10 == r7) goto L5a
            r7 = 2
            if (r10 == r7) goto L32
            goto L8c
        L32:
            android.app.Activity r7 = r1.a()
            int r8 = B4.g.f696a
            B4.f r1 = r1.f1872e
            int r1 = r1.b(r7, r8)
            if (r1 != 0) goto L4d
            r6.set(r4)
            T4.d r1 = r5.f1855n
            android.os.Message r2 = r1.obtainMessage(r3)
            r1.sendMessage(r2)
            goto L11
        L4d:
            if (r2 == 0) goto L11
            B4.b r3 = r2.f1826b
            int r3 = r3.f685b
            r7 = 18
            if (r3 != r7) goto L8c
            if (r1 != r7) goto L8c
            goto L11
        L5a:
            r1 = -1
            if (r11 != r1) goto L6a
            r6.set(r4)
            T4.d r1 = r5.f1855n
            android.os.Message r2 = r1.obtainMessage(r3)
            r1.sendMessage(r2)
            goto L11
        L6a:
            if (r11 != 0) goto L8c
            if (r2 == 0) goto L11
            r1 = 13
            if (r12 == 0) goto L78
            java.lang.String r3 = "<<ResolutionFailureErrorDetail>>"
            int r1 = r12.getIntExtra(r3, r1)
        L78:
            B4.b r3 = new B4.b
            B4.b r8 = r2.f1826b
            java.lang.String r8 = r8.toString()
            r3.<init>(r7, r1, r4, r8)
            r6.set(r4)
            int r1 = r2.f1825a
            r5.h(r3, r1)
            goto L11
        L8c:
            if (r2 == 0) goto L11
            r6.set(r4)
            B4.b r1 = r2.f1826b
            int r2 = r2.f1825a
            r5.h(r1, r2)
            goto L11
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.L.C(int, int, android.content.Intent):void");
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void F(Bundle bundle) {
        Bundle bundle2;
        super.F(bundle);
        A3.E e8 = this.f1829v0;
        e8.f46b = 1;
        e8.f48d = bundle;
        for (Map.Entry entry : ((Map) e8.f47c).entrySet()) {
            p pVar = (p) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            pVar.b(bundle2);
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void H() {
        this.f18382D = true;
        A3.E e8 = this.f1829v0;
        e8.f46b = 5;
        Iterator it = ((Map) e8.f47c).values().iterator();
        while (it.hasNext()) {
            ((p) it.next()).getClass();
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void O() {
        this.f18382D = true;
        A3.E e8 = this.f1829v0;
        e8.f46b = 3;
        Iterator it = ((Map) e8.f47c).values().iterator();
        while (it.hasNext()) {
            ((p) it.next()).d();
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void P(Bundle bundle) {
        A3.E e8 = this.f1829v0;
        if (bundle == null) {
            e8.getClass();
            return;
        }
        for (Map.Entry entry : ((Map) e8.f47c).entrySet()) {
            Bundle bundle2 = new Bundle();
            J j = (J) ((p) entry.getValue()).f1870c.get();
            if (j != null) {
                bundle2.putBoolean("resolving_error", true);
                bundle2.putInt("failed_client_id", j.f1825a);
                B4.b bVar = j.f1826b;
                bundle2.putInt("failed_status", bVar.f685b);
                bundle2.putParcelable("failed_resolution", bVar.f686c);
            }
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void Q() {
        this.f18382D = true;
        A3.E e8 = this.f1829v0;
        e8.f46b = 2;
        for (p pVar : ((Map) e8.f47c).values()) {
            pVar.f1869b = true;
            pVar.d();
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void R() {
        this.f18382D = true;
        A3.E e8 = this.f1829v0;
        e8.f46b = 4;
        Iterator it = ((Map) e8.f47c).values().iterator();
        while (it.hasNext()) {
            ((p) it.next()).c();
        }
    }

    @Override // D4.InterfaceC0089h
    public final p b() {
        return (p) p.class.cast(((Map) this.f1829v0.f47c).get("ConnectionlessLifecycleHelper"));
    }

    @Override // D4.InterfaceC0089h
    public final void d(p pVar) {
        A3.E e8 = this.f1829v0;
        Map map = (Map) e8.f47c;
        if (!map.containsKey("ConnectionlessLifecycleHelper")) {
            map.put("ConnectionlessLifecycleHelper", pVar);
            if (e8.f46b > 0) {
                new T4.d(Looper.getMainLooper(), 2).post(new S5.o(e8, pVar, 9, false));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.h(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f1829v0.f47c).values().iterator();
        while (it.hasNext()) {
            ((p) it.next()).getClass();
        }
    }
}
