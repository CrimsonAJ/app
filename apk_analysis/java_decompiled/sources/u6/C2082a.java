package u6;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.u;
import d0.C1088f;
import f5.C1183o;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import k4.C1499E;
import p6.C1862c;
import p6.InterfaceC1861b;
import v4.q;
import v6.C2112c;
import x6.InterfaceC2178a;
import y6.n;

/* renamed from: u6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2082a implements InterfaceC2178a, w6.a, S6.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1088f f23707a;

    public /* synthetic */ C2082a(C1088f c1088f) {
        this.f23707a = c1088f;
    }

    @Override // S6.a
    public void h(S6.b bVar) {
        C1088f c1088f = this.f23707a;
        c1088f.getClass();
        C2112c c2112c = C2112c.f23900a;
        c2112c.c("AnalyticsConnector now available.");
        InterfaceC1861b interfaceC1861b = (InterfaceC1861b) bVar.get();
        u uVar = new u(interfaceC1861b);
        C1499E c1499e = new C1499E(17, false);
        C1862c c1862c = (C1862c) interfaceC1861b;
        e0.c b9 = c1862c.b("clx", c1499e);
        if (b9 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            e0.c b10 = c1862c.b("crash", c1499e);
            if (b10 != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
            b9 = b10;
        }
        if (b9 != null) {
            c2112c.c("Registered Firebase Analytics listener.");
            C1183o c1183o = new C1183o(23);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            q qVar = new q(uVar);
            synchronized (c1088f) {
                try {
                    ArrayList arrayList = (ArrayList) c1088f.f16641c;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        c1183o.i((n) obj);
                    }
                    c1499e.f19986c = c1183o;
                    c1499e.f19985b = qVar;
                    c1088f.f16640b = c1183o;
                    c1088f.f16639a = qVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        c2112c.g("Could not register Firebase Analytics listener; a listener is already registered.", null);
    }

    @Override // x6.InterfaceC2178a
    public void i(n nVar) {
        C1088f c1088f = this.f23707a;
        synchronized (c1088f) {
            if (((InterfaceC2178a) c1088f.f16640b) instanceof x6.b) {
                ((ArrayList) c1088f.f16641c).add(nVar);
            }
            ((InterfaceC2178a) c1088f.f16640b).i(nVar);
        }
    }

    @Override // w6.a
    public void j(Bundle bundle) {
        ((w6.a) this.f23707a.f16639a).j(bundle);
    }
}
