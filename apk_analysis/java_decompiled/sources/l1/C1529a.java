package l1;

import android.content.Intent;
import android.content.IntentFilter;
import e1.q;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1529a extends AbstractC1531c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f20166i = q.j("BatteryChrgTracker");

    @Override // l1.AbstractC1532d
    public final Object a() {
        Intent registerReceiver = this.f20172b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z9 = false;
        if (registerReceiver == null) {
            q.d().c(f20166i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            z9 = true;
        }
        return Boolean.valueOf(z9);
    }

    @Override // l1.AbstractC1531c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r6.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L7;
     */
    @Override // l1.AbstractC1531c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.content.Intent r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r6 = r6.getAction()
            if (r6 != 0) goto L8
            goto L50
        L8:
            e1.q r1 = e1.q.d()
            java.lang.String r2 = "Received "
            java.lang.String r2 = r2.concat(r6)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r0]
            java.lang.String r4 = l1.C1529a.f20166i
            r1.a(r4, r2, r3)
            r1 = -1
            int r2 = r6.hashCode()
            switch(r2) {
                case -1886648615: goto L44;
                case -54942926: goto L39;
                case 948344062: goto L2e;
                case 1019184907: goto L23;
                default: goto L21;
            }
        L21:
            r0 = r1
            goto L4d
        L23:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2c
            goto L21
        L2c:
            r0 = 3
            goto L4d
        L2e:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L37
            goto L21
        L37:
            r0 = 2
            goto L4d
        L39:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L42
            goto L21
        L42:
            r0 = 1
            goto L4d
        L44:
            java.lang.String r2 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L4d
            goto L21
        L4d:
            switch(r0) {
                case 0: goto L63;
                case 1: goto L5d;
                case 2: goto L57;
                case 3: goto L51;
                default: goto L50;
            }
        L50:
            return
        L51:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            return
        L57:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            return
        L5d:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
            return
        L63:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C1529a.g(android.content.Intent):void");
    }
}
