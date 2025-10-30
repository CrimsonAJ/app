package i0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.C0563y;
import androidx.lifecycle.EnumC0554o;
import androidx.lifecycle.InterfaceC0550k;
import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.google.android.gms.internal.measurement.C1;
import java.util.LinkedHashMap;
import m0.C1581d;

/* loaded from: classes.dex */
public final class W implements InterfaceC0550k, N0.g, k0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractComponentCallbacksC1366v f18263a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f18264b;

    /* renamed from: c, reason: collision with root package name */
    public final A6.s f18265c;

    /* renamed from: d, reason: collision with root package name */
    public h0 f18266d;

    /* renamed from: e, reason: collision with root package name */
    public C0563y f18267e = null;

    /* renamed from: f, reason: collision with root package name */
    public C1 f18268f = null;

    public W(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v, j0 j0Var, A6.s sVar) {
        this.f18263a = abstractComponentCallbacksC1366v;
        this.f18264b = j0Var;
        this.f18265c = sVar;
    }

    public final void a(EnumC0554o enumC0554o) {
        this.f18267e.o0(enumC0554o);
    }

    public final void b() {
        if (this.f18267e == null) {
            this.f18267e = new C0563y(this);
            C1 c12 = new C1(this);
            this.f18268f = c12;
            c12.a();
            this.f18265c.run();
        }
    }

    @Override // N0.g
    public final N0.f c() {
        b();
        return (N0.f) this.f18268f.f15188c;
    }

    @Override // androidx.lifecycle.InterfaceC0550k
    public final h0 j() {
        Application application;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18263a;
        h0 j = abstractComponentCallbacksC1366v.j();
        if (!j.equals(abstractComponentCallbacksC1366v.f18410p0)) {
            this.f18266d = j;
            return j;
        }
        if (this.f18266d == null) {
            Context applicationContext = abstractComponentCallbacksC1366v.X().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.f18266d = new androidx.lifecycle.b0(application, abstractComponentCallbacksC1366v, abstractComponentCallbacksC1366v.f18390f);
        }
        return this.f18266d;
    }

    @Override // androidx.lifecycle.InterfaceC0550k
    public final C1581d p() {
        Application application;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18263a;
        Context applicationContext = abstractComponentCallbacksC1366v.X().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        C1581d c1581d = new C1581d(0);
        LinkedHashMap linkedHashMap = c1581d.f20661a;
        if (application != null) {
            linkedHashMap.put(f0.f9883a, application);
        }
        linkedHashMap.put(androidx.lifecycle.Y.f9853a, abstractComponentCallbacksC1366v);
        linkedHashMap.put(androidx.lifecycle.Y.f9854b, this);
        Bundle bundle = abstractComponentCallbacksC1366v.f18390f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.Y.f9855c, bundle);
        }
        return c1581d;
    }

    @Override // androidx.lifecycle.k0
    public final j0 u() {
        b();
        return this.f18264b;
    }

    @Override // androidx.lifecycle.InterfaceC0561w
    public final D.n x() {
        b();
        return this.f18267e;
    }
}
