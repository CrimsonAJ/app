package l1;

import android.content.Intent;
import android.content.IntentFilter;
import e1.q;
import u0.z;

/* renamed from: l1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1534f extends AbstractC1531c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f20179i = q.j("StorageNotLowTracker");

    @Override // l1.AbstractC1532d
    public final Object a() {
        Intent registerReceiver = this.f20172b.registerReceiver(null, f());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override // l1.AbstractC1531c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // l1.AbstractC1531c
    public final void g(Intent intent) {
        if (intent.getAction() != null) {
            q.d().a(f20179i, z.e("Received ", intent.getAction()), new Throwable[0]);
            String action = intent.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return;
                }
                c(Boolean.TRUE);
                return;
            }
            c(Boolean.FALSE);
        }
    }
}
