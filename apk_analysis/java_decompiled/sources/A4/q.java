package A4;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.cast.Y;
import f5.C1185q;
import f5.InterfaceC1173e;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class q implements InterfaceC1173e {

    /* renamed from: e, reason: collision with root package name */
    public static q f377e;

    /* renamed from: a, reason: collision with root package name */
    public int f378a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f379b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f380c;

    /* renamed from: d, reason: collision with root package name */
    public Object f381d;

    public /* synthetic */ q(Y y9, String str, int i9, SharedPreferences sharedPreferences) {
        this.f379b = y9;
        this.f380c = str;
        this.f378a = i9;
        this.f381d = sharedPreferences;
    }

    public static synchronized q b(Context context) {
        q qVar;
        synchronized (q.class) {
            try {
                if (f377e == null) {
                    f377e = new q(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new L4.a("MessengerIpcClient"))));
                }
                qVar = f377e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public String a(long j, String str, long j4, int i9) {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (true) {
            String[] strArr = (String[]) this.f379b;
            int i11 = this.f378a;
            if (i10 < i11) {
                sb.append(strArr[i10]);
                int i12 = ((int[]) this.f380c)[i10];
                if (i12 == 1) {
                    sb.append(str);
                } else {
                    String[] strArr2 = (String[]) this.f381d;
                    if (i12 == 2) {
                        sb.append(String.format(Locale.US, strArr2[i10], Long.valueOf(j)));
                    } else if (i12 == 3) {
                        sb.append(String.format(Locale.US, strArr2[i10], Integer.valueOf(i9)));
                    } else if (i12 == 4) {
                        sb.append(String.format(Locale.US, strArr2[i10], Long.valueOf(j4)));
                    }
                }
                i10++;
            } else {
                sb.append(strArr[i11]);
                return sb.toString();
            }
        }
    }

    public synchronized C1185q c(o oVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(oVar.toString()));
            }
            if (!((n) this.f381d).d(oVar)) {
                n nVar = new n(this);
                this.f381d = nVar;
                nVar.d(oVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return oVar.f373b.f17413a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [Y2.r, java.lang.Object] */
    @Override // f5.InterfaceC1173e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 3
            r1 = 0
            r2 = 1
            r7 = r14
            android.os.Bundle r7 = (android.os.Bundle) r7
            java.lang.Object r14 = r13.f379b
            r5 = r14
            com.google.android.gms.internal.cast.Y r5 = (com.google.android.gms.internal.cast.Y) r5
            u4.h r14 = r5.f14791a
            F4.y.h(r14)
            java.lang.String r9 = "register callback = %s"
            java.lang.Object r3 = r13.f380c
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            int r3 = r13.f378a
            r4 = 2
            com.google.android.gms.internal.cast.w r10 = r5.f14792b
            if (r3 == r0) goto L21
            if (r3 != r4) goto L55
            r3 = r4
        L21:
            Y2.r r6 = new Y2.r
            com.google.android.gms.internal.cast.g r11 = r5.f14793c
            r6.<init>()
            r6.f8647a = r5
            r6.f8649c = r11
            r6.f8648b = r8
            com.google.android.gms.internal.cast.H1 r11 = new com.google.android.gms.internal.cast.H1
            r11.<init>(r6)
            r6.f8651e = r11
            com.google.android.gms.internal.cast.H1 r11 = new com.google.android.gms.internal.cast.H1
            r11.<init>(r6)
            r14.a(r11)
            if (r10 == 0) goto L55
            com.google.android.gms.internal.cast.p0 r11 = new com.google.android.gms.internal.cast.p0
            r11.<init>(r2, r6)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r11
            y4.b r12 = com.google.android.gms.internal.cast.C0885w.f15073g
            r12.b(r9, r6)
            F4.y.d()
            java.util.Set r6 = r10.f15075b
            r6.add(r11)
        L55:
            if (r3 == r2) goto L59
            if (r3 != r4) goto L84
        L59:
            com.google.android.gms.internal.cast.s0 r3 = new com.google.android.gms.internal.cast.s0
            com.google.android.gms.internal.cast.g r6 = r5.f14793c
            java.lang.Object r4 = r13.f381d
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            r3.<init>(r4, r5, r6, r7, r8)
            com.google.android.gms.internal.cast.W2 r4 = new com.google.android.gms.internal.cast.W2
            r4.<init>(r0, r3)
            r14.a(r4)
            if (r10 == 0) goto L84
            com.google.android.gms.internal.cast.p0 r14 = new com.google.android.gms.internal.cast.p0
            r14.<init>(r1, r3)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r1] = r14
            y4.b r1 = com.google.android.gms.internal.cast.C0885w.f15073g
            r1.b(r9, r0)
            F4.y.d()
            java.util.Set r0 = r10.f15075b
            r0.add(r14)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.q.o(java.lang.Object):void");
    }

    public q(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f381d = new n(this);
        this.f378a = 1;
        this.f380c = scheduledExecutorService;
        this.f379b = context.getApplicationContext();
    }

    public q(String[] strArr, int[] iArr, String[] strArr2, int i9) {
        this.f379b = strArr;
        this.f380c = iArr;
        this.f381d = strArr2;
        this.f378a = i9;
    }
}
