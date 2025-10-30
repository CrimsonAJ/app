package l1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.mediarouter.app.C0568d;
import e1.q;
import q1.InterfaceC1871a;

/* renamed from: l1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1531c extends AbstractC1532d {

    /* renamed from: h, reason: collision with root package name */
    public static final String f20168h = q.j("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final C0568d f20169g;

    public AbstractC1531c(Context context, InterfaceC1871a interfaceC1871a) {
        super(context, interfaceC1871a);
        this.f20169g = new C0568d(4, this);
    }

    @Override // l1.AbstractC1532d
    public final void d() {
        q.d().a(f20168h, getClass().getSimpleName().concat(": registering receiver"), new Throwable[0]);
        this.f20172b.registerReceiver(this.f20169g, f());
    }

    @Override // l1.AbstractC1532d
    public final void e() {
        q.d().a(f20168h, getClass().getSimpleName().concat(": unregistering receiver"), new Throwable[0]);
        this.f20172b.unregisterReceiver(this.f20169g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
