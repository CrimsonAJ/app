package l6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import s.C1934d;

/* renamed from: l6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1573e extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f20583b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f20584a;

    public C1573e(Context context) {
        this.f20584a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (C1574f.f20585k) {
            try {
                Iterator it = ((C1934d) C1574f.f20586l.values()).iterator();
                while (it.hasNext()) {
                    ((C1574f) it.next()).e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f20584a.unregisterReceiver(this);
    }
}
