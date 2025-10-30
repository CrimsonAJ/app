package A4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.y;
import android.util.Log;
import f5.C1177i;
import f5.C1185q;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import s.C1939i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static int f332h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f333i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a, reason: collision with root package name */
    public final C1939i f334a = new C1939i(0);

    /* renamed from: b, reason: collision with root package name */
    public final Context f335b;

    /* renamed from: c, reason: collision with root package name */
    public final r f336c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f337d;

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f338e;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f339f;

    /* renamed from: g, reason: collision with root package name */
    public h f340g;

    /* JADX WARN: Type inference failed for: r0v1, types: [A4.r, java.lang.Object] */
    public b(Context context) {
        this.f335b = context;
        ?? obj = new Object();
        obj.f383b = 0;
        obj.f384c = context;
        this.f336c = obj;
        this.f338e = new Messenger(new f(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f337d = scheduledThreadPoolExecutor;
    }

    public static synchronized String b() {
        String num;
        synchronized (b.class) {
            int i9 = f332h;
            f332h = i9 + 1;
            num = Integer.toString(i9);
        }
        return num;
    }

    public static synchronized void c(Context context, Intent intent) {
        synchronized (b.class) {
            try {
                if (f333i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f333i = PendingIntent.getBroadcast(context, 0, intent2, U4.a.f7494a);
                }
                intent.putExtra("app", f333i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1185q a(Bundle bundle) {
        String b9 = b();
        C1177i c1177i = new C1177i();
        synchronized (this.f334a) {
            this.f334a.put(b9, c1177i);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f336c.K() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.f335b, intent);
        intent.putExtra("kid", "|ID|" + b9 + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f338e);
        if (this.f339f != null || this.f340g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f339f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f340g.f349a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            c1177i.f17413a.b(i.f351c, new y(this, b9, this.f337d.schedule(new e(0, c1177i), 30L, TimeUnit.SECONDS), 3));
            return c1177i.f17413a;
        }
        if (this.f336c.K() == 2) {
            this.f335b.sendBroadcast(intent);
        } else {
            this.f335b.startService(intent);
        }
        c1177i.f17413a.b(i.f351c, new y(this, b9, this.f337d.schedule(new e(0, c1177i), 30L, TimeUnit.SECONDS), 3));
        return c1177i.f17413a;
    }

    public final void d(String str, Bundle bundle) {
        synchronized (this.f334a) {
            try {
                C1177i c1177i = (C1177i) this.f334a.remove(str);
                if (c1177i == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                c1177i.b(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
