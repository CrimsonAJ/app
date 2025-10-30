package D;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.AbstractBinderC0581b;
import b.InterfaceC0582c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class v implements Handler.Callback, ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1719a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1720b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1721c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public HashSet f1722d = new HashSet();

    public v(Context context) {
        this.f1719a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f1720b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(u uVar) {
        boolean z9;
        ArrayDeque arrayDeque;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = uVar.f1714a;
        if (isLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + uVar.f1717d.size() + " queued tasks");
        }
        if (!uVar.f1717d.isEmpty()) {
            if (uVar.f1715b) {
                z9 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f1719a;
                boolean bindService = context.bindService(component, this, 33);
                uVar.f1715b = bindService;
                if (bindService) {
                    uVar.f1718e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z9 = uVar.f1715b;
            }
            if (z9 && uVar.f1716c != null) {
                while (true) {
                    arrayDeque = uVar.f1717d;
                    s sVar = (s) arrayDeque.peek();
                    if (sVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + sVar);
                        }
                        sVar.a(uVar.f1716c);
                        arrayDeque.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + componentName);
                        }
                    } catch (RemoteException e8) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e8);
                    }
                }
                if (!arrayDeque.isEmpty()) {
                    b(uVar);
                    return;
                }
                return;
            }
            b(uVar);
        }
    }

    public final void b(u uVar) {
        Handler handler = this.f1720b;
        ComponentName componentName = uVar.f1714a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i9 = uVar.f1718e;
        int i10 = i9 + 1;
        uVar.f1718e = i10;
        if (i10 > 6) {
            StringBuilder sb = new StringBuilder("Giving up on delivering ");
            ArrayDeque arrayDeque = uVar.f1717d;
            sb.append(arrayDeque.size());
            sb.append(" tasks to ");
            sb.append(componentName);
            sb.append(" after ");
            sb.append(uVar.f1718e);
            sb.append(" retries");
            Log.w("NotifManCompat", sb.toString());
            arrayDeque.clear();
            return;
        }
        int i11 = (1 << i9) * 1000;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [b.a, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i9 = message.what;
        InterfaceC0582c interfaceC0582c = null;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        return false;
                    }
                    u uVar = (u) this.f1721c.get((ComponentName) message.obj);
                    if (uVar != null) {
                        a(uVar);
                        return true;
                    }
                } else {
                    u uVar2 = (u) this.f1721c.get((ComponentName) message.obj);
                    if (uVar2 != null) {
                        if (uVar2.f1715b) {
                            this.f1719a.unbindService(this);
                            uVar2.f1715b = false;
                        }
                        uVar2.f1716c = null;
                        return true;
                    }
                }
            } else {
                t tVar = (t) message.obj;
                ComponentName componentName = tVar.f1712a;
                IBinder iBinder = tVar.f1713b;
                u uVar3 = (u) this.f1721c.get(componentName);
                if (uVar3 != null) {
                    int i10 = AbstractBinderC0581b.f10454e;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0582c.f10455c);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0582c)) {
                            interfaceC0582c = (InterfaceC0582c) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.f10453e = iBinder;
                            interfaceC0582c = obj;
                        }
                    }
                    uVar3.f1716c = interfaceC0582c;
                    uVar3.f1718e = 0;
                    a(uVar3);
                    return true;
                }
            }
        } else {
            s sVar = (s) message.obj;
            String string = Settings.Secure.getString(this.f1719a.getContentResolver(), "enabled_notification_listeners");
            synchronized (w.f1723c) {
                if (string != null) {
                    try {
                        if (!string.equals(w.f1724d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            w.f1725e = hashSet2;
                            w.f1724d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = w.f1725e;
            }
            if (!hashSet.equals(this.f1722d)) {
                this.f1722d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f1719a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName2);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName3 = (ComponentName) it.next();
                    if (!this.f1721c.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.f1721c.put(componentName3, new u(componentName3));
                    }
                }
                Iterator it2 = this.f1721c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        u uVar4 = (u) entry.getValue();
                        if (uVar4.f1715b) {
                            this.f1719a.unbindService(this);
                            uVar4.f1715b = false;
                        }
                        uVar4.f1716c = null;
                        it2.remove();
                    }
                }
            }
            for (u uVar5 : this.f1721c.values()) {
                uVar5.f1717d.add(sVar);
                a(uVar5);
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f1720b.obtainMessage(1, new t(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f1720b.obtainMessage(2, componentName).sendToTarget();
    }
}
