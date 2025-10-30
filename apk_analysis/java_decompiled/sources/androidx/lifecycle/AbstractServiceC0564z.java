package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: androidx.lifecycle.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0564z extends Service implements InterfaceC0561w {

    /* renamed from: a, reason: collision with root package name */
    public final android.support.v4.media.session.y f9914a = new android.support.v4.media.session.y(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kotlin.jvm.internal.h.e(intent, "intent");
        this.f9914a.T(EnumC0554o.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f9914a.T(EnumC0554o.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0554o enumC0554o = EnumC0554o.ON_STOP;
        android.support.v4.media.session.y yVar = this.f9914a;
        yVar.T(enumC0554o);
        yVar.T(EnumC0554o.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i9) {
        this.f9914a.T(EnumC0554o.ON_START);
        super.onStart(intent, i9);
    }

    @Override // androidx.lifecycle.InterfaceC0561w
    public final D.n x() {
        return (C0563y) this.f9914a.f9331b;
    }
}
