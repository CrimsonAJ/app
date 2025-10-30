package e3;

import C3.v;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import g3.C1250a;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f17156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y2.j f17157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17158c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f17159d;

    public /* synthetic */ f(j jVar, Y2.j jVar2, int i9, Runnable runnable) {
        this.f17156a = jVar;
        this.f17157b = jVar2;
        this.f17158c = i9;
        this.f17159d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y2.j jVar = this.f17157b;
        int i9 = this.f17158c;
        Runnable runnable = this.f17159d;
        j jVar2 = this.f17156a;
        g3.c cVar = jVar2.f17176f;
        try {
            try {
                f3.d dVar = jVar2.f17173c;
                Objects.requireNonNull(dVar);
                ((f3.h) cVar).F(new v(25, dVar));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) jVar2.f17171a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    jVar2.a(jVar, i9);
                } else {
                    ((f3.h) cVar).F(new g(jVar2, jVar, i9));
                }
                runnable.run();
            } catch (C1250a unused) {
                jVar2.f17174d.a(jVar, i9 + 1, false);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }
}
