package F4;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f2448a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0126e f2450c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2451d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f2452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0126e f2453f;

    public s(AbstractC0126e abstractC0126e, int i9, Bundle bundle) {
        this.f2453f = abstractC0126e;
        Boolean bool = Boolean.TRUE;
        this.f2450c = abstractC0126e;
        this.f2448a = bool;
        this.f2449b = false;
        this.f2451d = i9;
        this.f2452e = bundle;
    }

    public abstract void a(B4.b bVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f2448a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f2450c.f2379m) {
            this.f2450c.f2379m.remove(this);
        }
    }
}
