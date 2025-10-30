package A4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import b5.C0622e;
import b5.C0648m1;
import b5.C0650n0;
import b5.C0665t;
import b5.G;
import b5.M1;
import b5.Q1;
import b5.V;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Parcelable f359c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f361e;

    public /* synthetic */ k(C0648m1 c0648m1, Q1 q12, boolean z9, G4.a aVar, int i9) {
        this.f357a = i9;
        this.f359c = q12;
        this.f358b = z9;
        this.f360d = aVar;
        this.f361e = c0648m1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intent intent;
        int i9;
        M1 m12;
        C0665t c0665t;
        C0622e c0622e;
        switch (this.f357a) {
            case 0:
                Intent intent2 = (Intent) this.f359c;
                Context context = (Context) this.f360d;
                boolean z9 = this.f358b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f361e;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Executor executor = null;
                    if (parcelableExtra instanceof Intent) {
                        intent = (Intent) parcelableExtra;
                    } else {
                        intent = null;
                    }
                    if (intent != null) {
                        i9 = FirebaseInstanceIdReceiver.a(intent);
                    } else {
                        int i10 = 500;
                        if (intent2.getExtras() != null) {
                            a aVar = new a(intent2);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f16418b;
                                    if (softReference != null) {
                                        executor = (Executor) softReference.get();
                                    }
                                    if (executor == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new L4.a("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f16418b = new SoftReference(executor);
                                    }
                                } finally {
                                }
                            }
                            executor.execute(new j(context, aVar, countDownLatch, 0));
                            try {
                                i10 = ((Integer) s8.n.b(new com.google.firebase.messaging.j(context).b(intent2))).intValue();
                            } catch (InterruptedException | ExecutionException e8) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e8);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e9) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e9.toString()));
                            }
                        }
                        i9 = i10;
                    }
                    if (z9 && pendingResult != null) {
                        pendingResult.setResultCode(i9);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th;
                }
            case 1:
                C0648m1 c0648m1 = (C0648m1) this.f361e;
                G g9 = c0648m1.f11196d;
                if (g9 == null) {
                    V v8 = ((C0650n0) c0648m1.f1707a).f11229i;
                    C0650n0.f(v8);
                    v8.f10971f.b("Discarding data. Failed to set user property");
                    return;
                } else {
                    Q1 q12 = (Q1) this.f359c;
                    if (this.f358b) {
                        m12 = null;
                    } else {
                        m12 = (M1) this.f360d;
                    }
                    c0648m1.s0(g9, m12, q12);
                    c0648m1.B0();
                    return;
                }
            case 2:
                C0648m1 c0648m12 = (C0648m1) this.f361e;
                G g10 = c0648m12.f11196d;
                if (g10 == null) {
                    V v9 = ((C0650n0) c0648m12.f1707a).f11229i;
                    C0650n0.f(v9);
                    v9.f10971f.b("Discarding data. Failed to send event to service");
                    return;
                } else {
                    Q1 q13 = (Q1) this.f359c;
                    if (this.f358b) {
                        c0665t = null;
                    } else {
                        c0665t = (C0665t) this.f360d;
                    }
                    c0648m12.s0(g10, c0665t, q13);
                    c0648m12.B0();
                    return;
                }
            default:
                C0648m1 c0648m13 = (C0648m1) this.f361e;
                G g11 = c0648m13.f11196d;
                if (g11 == null) {
                    V v10 = ((C0650n0) c0648m13.f1707a).f11229i;
                    C0650n0.f(v10);
                    v10.f10971f.b("Discarding data. Failed to send conditional user property to service");
                    return;
                } else {
                    Q1 q14 = (Q1) this.f359c;
                    if (this.f358b) {
                        c0622e = null;
                    } else {
                        c0622e = (C0622e) this.f360d;
                    }
                    c0648m13.s0(g11, c0622e, q14);
                    c0648m13.B0();
                    return;
                }
        }
    }

    public /* synthetic */ k(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z9, BroadcastReceiver.PendingResult pendingResult) {
        this.f357a = 0;
        this.f359c = intent;
        this.f360d = context;
        this.f358b = z9;
        this.f361e = pendingResult;
    }
}
