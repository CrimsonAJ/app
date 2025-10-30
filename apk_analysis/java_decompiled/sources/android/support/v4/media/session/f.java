package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Pair;
import co.notix.R;
import l4.AbstractC1566a;
import n3.C1622B;
import n3.C1624a;
import n3.C1625b;
import n3.C1643t;
import n3.C1644u;

/* loaded from: classes.dex */
public final class f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9299a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9300b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9301c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C1625b c1625b, Looper looper) {
        super(looper);
        this.f9301c = c1625b;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.os.Message r8, n3.C1622B r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r8.obj
            n3.a r0 = (n3.C1624a) r0
            boolean r1 = r0.f21066b
            r2 = 0
            if (r1 != 0) goto Lb
            goto L88
        Lb:
            int r1 = r0.f21068d
            r3 = 1
            int r1 = r1 + r3
            r0.f21068d = r1
            java.lang.Object r4 = r7.f9301c
            n3.b r4 = (n3.C1625b) r4
            e1.q r4 = r4.f21077i
            r5 = 3
            int r4 = r4.f(r5)
            if (r1 <= r4) goto L20
            goto L88
        L20:
            N3.q r1 = new N3.q
            android.os.SystemClock.elapsedRealtime()
            android.os.SystemClock.elapsedRealtime()
            java.lang.Throwable r1 = r9.getCause()
            boolean r1 = r1 instanceof java.io.IOException
            if (r1 == 0) goto L37
            java.lang.Throwable r9 = r9.getCause()
            java.io.IOException r9 = (java.io.IOException) r9
            goto L41
        L37:
            N3.M r1 = new N3.M
            java.lang.Throwable r9 = r9.getCause()
            r1.<init>(r9)
            r9 = r1
        L41:
            java.lang.Object r1 = r7.f9301c
            n3.b r1 = (n3.C1625b) r1
            e1.q r1 = r1.f21077i
            int r0 = r0.f21068d
            r1.getClass()
            boolean r1 = r9 instanceof j3.j0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L83
            boolean r1 = r9 instanceof java.io.FileNotFoundException
            if (r1 != 0) goto L83
            boolean r1 = r9 instanceof k4.C1495A
            if (r1 != 0) goto L83
            boolean r1 = r9 instanceof k4.L
            if (r1 != 0) goto L83
            int r1 = k4.C1514n.f20070b
        L63:
            if (r9 == 0) goto L78
            boolean r1 = r9 instanceof k4.C1514n
            if (r1 == 0) goto L73
            r1 = r9
            k4.n r1 = (k4.C1514n) r1
            int r1 = r1.f20071a
            r6 = 2008(0x7d8, float:2.814E-42)
            if (r1 != r6) goto L73
            goto L83
        L73:
            java.lang.Throwable r9 = r9.getCause()
            goto L63
        L78:
            int r0 = r0 - r3
            int r0 = r0 * 1000
            r9 = 5000(0x1388, float:7.006E-42)
            int r9 = java.lang.Math.min(r0, r9)
            long r0 = (long) r9
            goto L84
        L83:
            r0 = r4
        L84:
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 != 0) goto L89
        L88:
            return r2
        L89:
            monitor-enter(r7)
            boolean r9 = r7.f9300b     // Catch: java.lang.Throwable -> L97
            if (r9 != 0) goto L99
            android.os.Message r8 = android.os.Message.obtain(r8)     // Catch: java.lang.Throwable -> L97
            r7.sendMessageDelayed(r8, r0)     // Catch: java.lang.Throwable -> L97
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L97
            return r3
        L97:
            r8 = move-exception
            goto L9b
        L99:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L97
            return r2
        L9b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L97
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.f.a(android.os.Message, n3.B):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1622B c1622b;
        switch (this.f9299a) {
            case 0:
                if (this.f9300b) {
                    int i9 = message.what;
                    androidx.mediarouter.app.p pVar = (androidx.mediarouter.app.p) this.f9301c;
                    switch (i9) {
                        case 1:
                            y.E(message.getData());
                            pVar.getClass();
                            return;
                        case 2:
                            pVar.b((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            pVar.a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            pVar.getClass();
                            return;
                        case 5:
                            pVar.getClass();
                            return;
                        case 6:
                            pVar.getClass();
                            return;
                        case 7:
                            y.E((Bundle) message.obj);
                            pVar.getClass();
                            return;
                        case 8:
                            pVar.d();
                            return;
                        case 9:
                            ((Integer) message.obj).getClass();
                            pVar.getClass();
                            return;
                        case R.styleable.GradientColor_android_endX /* 10 */:
                        default:
                            return;
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            ((Boolean) message.obj).getClass();
                            pVar.getClass();
                            return;
                        case 12:
                            ((Integer) message.obj).getClass();
                            pVar.getClass();
                            return;
                        case 13:
                            pVar.getClass();
                            return;
                    }
                }
                return;
            default:
                C1624a c1624a = (C1624a) message.obj;
                try {
                    int i10 = message.what;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            C1625b c1625b = (C1625b) this.f9301c;
                            c1622b = c1625b.f21078k.h(c1625b.f21079l, (C1643t) c1624a.f21067c);
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        c1622b = ((C1625b) this.f9301c).f21078k.k((C1644u) c1624a.f21067c);
                    }
                } catch (C1622B e8) {
                    boolean a5 = a(message, e8);
                    c1622b = e8;
                    if (a5) {
                        return;
                    }
                } catch (Exception e9) {
                    AbstractC1566a.Q("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e9);
                    c1622b = e9;
                }
                e1.q qVar = ((C1625b) this.f9301c).f21077i;
                long j = c1624a.f21065a;
                qVar.getClass();
                synchronized (this) {
                    try {
                        if (!this.f9300b) {
                            ((C1625b) this.f9301c).f21080m.obtainMessage(message.what, Pair.create(c1624a.f21067c, c1622b)).sendToTarget();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.mediarouter.app.p pVar, Looper looper) {
        super(looper);
        this.f9301c = pVar;
        this.f9300b = false;
    }
}
