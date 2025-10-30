package D4;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import s.C1936f;

/* loaded from: classes.dex */
public final class p implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1868a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f1869b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f1870c;

    /* renamed from: d, reason: collision with root package name */
    public final T4.d f1871d;

    /* renamed from: e, reason: collision with root package name */
    public final B4.f f1872e;

    /* renamed from: f, reason: collision with root package name */
    public final C1936f f1873f;

    /* renamed from: g, reason: collision with root package name */
    public final C0088g f1874g;

    public p(InterfaceC0089h interfaceC0089h, C0088g c0088g) {
        B4.f fVar = B4.f.f695d;
        this.f1868a = interfaceC0089h;
        this.f1870c = new AtomicReference(null);
        this.f1871d = new T4.d(Looper.getMainLooper(), 0);
        this.f1872e = fVar;
        this.f1873f = new C1936f(0);
        this.f1874g = c0088g;
        interfaceC0089h.d(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [D4.h, java.lang.Object] */
    public final Activity a() {
        Activity f9 = this.f1868a.f();
        F4.y.h(f9);
        return f9;
    }

    public final void b(Bundle bundle) {
        J j;
        if (bundle != null) {
            AtomicReference atomicReference = this.f1870c;
            if (bundle.getBoolean("resolving_error", false)) {
                j = new J(new B4.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                j = null;
            }
            atomicReference.set(j);
        }
    }

    public final void c() {
        this.f1869b = false;
        C0088g c0088g = this.f1874g;
        c0088g.getClass();
        synchronized (C0088g.f1841r) {
            try {
                if (c0088g.f1852k == this) {
                    c0088g.f1852k = null;
                    c0088g.f1853l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (!this.f1873f.isEmpty()) {
            this.f1874g.a(this);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i9;
        B4.b bVar = new B4.b(13, null);
        AtomicReference atomicReference = this.f1870c;
        J j = (J) atomicReference.get();
        if (j == null) {
            i9 = -1;
        } else {
            i9 = j.f1825a;
        }
        atomicReference.set(null);
        this.f1874g.h(bVar, i9);
    }
}
