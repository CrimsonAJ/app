package v4;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import l3.I;
import v6.C2112c;
import x.C2149d;
import x.C2150e;

/* loaded from: classes.dex */
public final class q implements w6.b, w6.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f23876a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23877b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23878c;

    public q(h hVar) {
        this.f23878c = hVar;
        this.f23877b = new AtomicLong((y4.a.f24916b.nextLong() & 65535) * 10000);
    }

    public boolean a(I i9, C2149d c2149d, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int[] iArr = c2149d.f24374c0;
        int i10 = iArr[0];
        y.b bVar = (y.b) this.f23877b;
        bVar.f24693a = i10;
        boolean z14 = true;
        bVar.f24694b = iArr[1];
        bVar.f24695c = c2149d.l();
        bVar.f24696d = c2149d.i();
        bVar.f24701i = false;
        bVar.j = z9;
        if (bVar.f24693a == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (bVar.f24694b == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && c2149d.f24355L > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && c2149d.f24355L > 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        int[] iArr2 = c2149d.f24382l;
        if (z12 && iArr2[0] == 4) {
            bVar.f24693a = 1;
        }
        if (z13 && iArr2[1] == 4) {
            bVar.f24694b = 1;
        }
        i9.a(c2149d, bVar);
        c2149d.y(bVar.f24697e);
        c2149d.v(bVar.f24698f);
        c2149d.f24393w = bVar.f24700h;
        int i11 = bVar.f24699g;
        c2149d.f24359P = i11;
        if (i11 <= 0) {
            z14 = false;
        }
        c2149d.f24393w = z14;
        bVar.j = false;
        return bVar.f24701i;
    }

    public void b(C2150e c2150e, int i9, int i10) {
        int i11 = c2150e.f24360Q;
        int i12 = c2150e.f24361R;
        c2150e.f24360Q = 0;
        c2150e.f24361R = 0;
        c2150e.y(i9);
        c2150e.v(i10);
        if (i11 < 0) {
            c2150e.f24360Q = 0;
        } else {
            c2150e.f24360Q = i11;
        }
        if (i12 < 0) {
            c2150e.f24361R = 0;
        } else {
            c2150e.f24361R = i12;
        }
        ((C2150e) this.f23878c).E();
    }

    @Override // w6.a
    public void j(Bundle bundle) {
        synchronized (this.f23877b) {
            try {
                C2112c c2112c = C2112c.f23900a;
                c2112c.f("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f23878c = new CountDownLatch(1);
                ((com.google.firebase.messaging.u) this.f23876a).j(bundle);
                c2112c.f("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f23878c).await(500, TimeUnit.MILLISECONDS)) {
                        c2112c.f("App exception callback received from Analytics listener.");
                    } else {
                        c2112c.g("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f23878c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w6.b
    public void q(String str, Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f23878c;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public q(com.google.firebase.messaging.u uVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f23877b = new Object();
        this.f23876a = uVar;
    }

    public q(y5.b bVar, View view) {
        Object obj;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            obj = new Object();
        } else {
            obj = i9 >= 33 ? new Object() : null;
        }
        this.f23876a = obj;
        this.f23877b = bVar;
        this.f23878c = view;
    }

    public q(C2150e c2150e) {
        this.f23876a = new ArrayList();
        this.f23877b = new Object();
        this.f23878c = c2150e;
    }
}
