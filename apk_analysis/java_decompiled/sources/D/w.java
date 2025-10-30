package D;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static String f1724d;

    /* renamed from: g, reason: collision with root package name */
    public static v f1727g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1728a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f1729b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1723c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f1725e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f1726f = new Object();

    public w(Context context) {
        this.f1728a = context;
        this.f1729b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(String str, int i9, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            s sVar = new s(this.f1728a.getPackageName(), i9, str, notification);
            synchronized (f1726f) {
                try {
                    if (f1727g == null) {
                        f1727g = new v(this.f1728a.getApplicationContext());
                    }
                    f1727g.f1720b.obtainMessage(0, sVar).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f1729b.cancel(str, i9);
            return;
        }
        this.f1729b.notify(str, i9, notification);
    }
}
