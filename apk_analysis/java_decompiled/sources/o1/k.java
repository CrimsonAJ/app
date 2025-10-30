package o1;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21484a = e1.q.j("WakeLocks");

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f21485b = new WeakHashMap();

    public static PowerManager.WakeLock a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, concat);
        WeakHashMap weakHashMap = f21485b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, concat);
        }
        return newWakeLock;
    }
}
