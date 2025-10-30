package i7;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.util.ArrayList;
import l6.C1574f;

/* loaded from: classes.dex */
public final class b0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18830a;

    /* renamed from: b, reason: collision with root package name */
    public long f18831b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f18832c;

    public b0(Looper looper) {
        super(looper);
        this.f18832c = new ArrayList();
    }

    public final void a() {
        Log.d("SessionLifecycleService", "Broadcasting new session");
        P p9 = (P) ((C1394i) ((InterfaceC1403s) C1574f.c().b(InterfaceC1403s.class))).f18883k.get();
        M m9 = ((V) ((C1394i) ((InterfaceC1403s) C1574f.c().b(InterfaceC1403s.class))).f18885m.get()).f18807e;
        if (m9 != null) {
            T t7 = (T) p9;
            t7.getClass();
            Y7.B.r(Y7.B.a(t7.f18796e), null, new Q(t7, m9, null), 3);
            ArrayList arrayList = new ArrayList(this.f18832c);
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                Messenger it = (Messenger) obj;
                kotlin.jvm.internal.h.d(it, "it");
                b(it);
            }
            return;
        }
        kotlin.jvm.internal.h.h("currentSession");
        throw null;
    }

    public final void b(Messenger messenger) {
        try {
            String str = null;
            if (this.f18830a) {
                M m9 = ((V) ((C1394i) ((InterfaceC1403s) C1574f.c().b(InterfaceC1403s.class))).f18885m.get()).f18807e;
                if (m9 != null) {
                    d(messenger, m9.f18769a);
                    return;
                } else {
                    kotlin.jvm.internal.h.h("currentSession");
                    throw null;
                }
            }
            C1406v c1406v = (C1406v) ((K) ((C1394i) ((InterfaceC1403s) C1574f.c().b(InterfaceC1403s.class))).j.get()).f18764c.get();
            if (c1406v != null) {
                str = c1406v.f18915a;
            }
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session.");
            if (str != null) {
                d(messenger, str);
            }
        } catch (IllegalStateException e8) {
            Log.w("SessionLifecycleService", "Failed to send session to client.", e8);
        }
    }

    public final void c() {
        String a5;
        try {
            V v8 = (V) ((C1394i) ((InterfaceC1403s) C1574f.c().b(InterfaceC1403s.class))).f18885m.get();
            int i9 = v8.f18806d + 1;
            v8.f18806d = i9;
            if (i9 == 0) {
                a5 = v8.f18805c;
            } else {
                a5 = v8.a();
            }
            String str = a5;
            int i10 = v8.f18806d;
            v8.f18803a.getClass();
            v8.f18807e = new M(System.currentTimeMillis() * 1000, str, v8.f18805c, i10);
            Log.d("SessionLifecycleService", "Generated new session.");
            a();
            K k5 = (K) ((C1394i) ((InterfaceC1403s) C1574f.c().b(InterfaceC1403s.class))).j.get();
            M m9 = ((V) ((C1394i) ((InterfaceC1403s) C1574f.c().b(InterfaceC1403s.class))).f18885m.get()).f18807e;
            if (m9 != null) {
                String sessionId = m9.f18769a;
                k5.getClass();
                kotlin.jvm.internal.h.e(sessionId, "sessionId");
                Y7.B.r(Y7.B.a(k5.f18762a), null, new J(k5, sessionId, null), 3);
                return;
            }
            kotlin.jvm.internal.h.h("currentSession");
            throw null;
        } catch (IllegalStateException e8) {
            Log.w("SessionLifecycleService", "Failed to generate new session.", e8);
        }
    }

    public final void d(Messenger messenger, String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("SessionUpdateExtra", str);
            Message obtain = Message.obtain(null, 3, 0, 0);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (DeadObjectException unused) {
            Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
            this.f18832c.remove(messenger);
        } catch (Exception e8) {
            Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x010a, code lost:
    
        if (X7.a.c(r8) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0121, code lost:
    
        if (X7.a.c(r8) == false) goto L36;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.b0.handleMessage(android.os.Message):void");
    }
}
