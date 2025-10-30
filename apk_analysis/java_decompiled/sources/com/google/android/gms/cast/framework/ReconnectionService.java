package com.google.android.gms.cast.framework;

import F4.y;
import N4.a;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.AbstractC0826h;
import com.google.android.gms.internal.cast.C;
import com.google.android.gms.internal.cast.C0834j;
import u4.C2077b;
import u4.C2080e;
import u4.h;
import u4.k;
import u4.r;
import u4.s;
import u4.u;
import y4.b;

/* loaded from: classes.dex */
public class ReconnectionService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public static final b f14634b = new b("ReconnectionService", null);

    /* renamed from: a, reason: collision with root package name */
    public u f14635a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        u uVar = this.f14635a;
        if (uVar != null) {
            try {
                s sVar = (s) uVar;
                Parcel Q7 = sVar.Q();
                C.c(Q7, intent);
                Parcel f12 = sVar.f1(Q7, 3);
                IBinder readStrongBinder = f12.readStrongBinder();
                f12.recycle();
                return readStrongBinder;
            } catch (RemoteException e8) {
                f14634b.a(e8, "Unable to call %s on %s.", "onBind", u.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        a aVar;
        a aVar2;
        C2077b a5 = C2077b.a(this);
        a5.getClass();
        y.d();
        h hVar = a5.f23648c;
        hVar.getClass();
        u uVar = null;
        try {
            u4.y yVar = hVar.f23689a;
            Parcel f12 = yVar.f1(yVar.Q(), 7);
            aVar = N4.b.h1(f12.readStrongBinder());
            f12.recycle();
        } catch (RemoteException e8) {
            h.f23688c.a(e8, "Unable to call %s on %s.", "getWrappedThis", u4.y.class.getSimpleName());
            aVar = null;
        }
        y.d();
        k kVar = a5.f23649d;
        kVar.getClass();
        try {
            r rVar = kVar.f23694a;
            Parcel f13 = rVar.f1(rVar.Q(), 5);
            aVar2 = N4.b.h1(f13.readStrongBinder());
            f13.recycle();
        } catch (RemoteException e9) {
            k.f23693b.a(e9, "Unable to call %s on %s.", "getWrappedThis", r.class.getSimpleName());
            aVar2 = null;
        }
        b bVar = AbstractC0826h.f14853a;
        if (aVar != null && aVar2 != null) {
            try {
                uVar = AbstractC0826h.b(getApplicationContext()).k1(new N4.b(this), aVar, aVar2);
            } catch (RemoteException | C2080e e10) {
                AbstractC0826h.f14853a.a(e10, "Unable to call %s on %s.", "newReconnectionServiceImpl", C0834j.class.getSimpleName());
            }
        }
        this.f14635a = uVar;
        if (uVar != null) {
            try {
                s sVar = (s) uVar;
                sVar.g1(sVar.Q(), 1);
            } catch (RemoteException e11) {
                f14634b.a(e11, "Unable to call %s on %s.", "onCreate", u.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        u uVar = this.f14635a;
        if (uVar != null) {
            try {
                s sVar = (s) uVar;
                sVar.g1(sVar.Q(), 4);
            } catch (RemoteException e8) {
                f14634b.a(e8, "Unable to call %s on %s.", "onDestroy", u.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i9, int i10) {
        u uVar = this.f14635a;
        if (uVar != null) {
            try {
                s sVar = (s) uVar;
                Parcel Q7 = sVar.Q();
                C.c(Q7, intent);
                Q7.writeInt(i9);
                Q7.writeInt(i10);
                Parcel f12 = sVar.f1(Q7, 2);
                int readInt = f12.readInt();
                f12.recycle();
                return readInt;
            } catch (RemoteException e8) {
                f14634b.a(e8, "Unable to call %s on %s.", "onStartCommand", u.class.getSimpleName());
            }
        }
        return 2;
    }
}
