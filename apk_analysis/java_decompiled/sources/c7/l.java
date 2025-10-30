package c7;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.u;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import t6.ScheduledExecutorServiceC2021f;
import t6.ThreadFactoryC2016a;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements S6.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11725a;

    public /* synthetic */ l(int i9) {
        this.f11725a = i9;
    }

    @Override // S6.b
    public final Object get() {
        switch (this.f11725a) {
            case 0:
                Random random = n.j;
                return null;
            case 1:
                u uVar = FirebaseMessaging.f16440l;
                return null;
            case 2:
                return Collections.EMPTY_SET;
            case 3:
                return null;
            case 4:
                s6.l lVar = ExecutorsRegistrar.f16409a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i9 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i9 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new ScheduledExecutorServiceC2021f(Executors.newFixedThreadPool(4, new ThreadFactoryC2016a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f16412d.get());
            case 5:
                s6.l lVar2 = ExecutorsRegistrar.f16409a;
                return new ScheduledExecutorServiceC2021f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ThreadFactoryC2016a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f16412d.get());
            case 6:
                s6.l lVar3 = ExecutorsRegistrar.f16409a;
                return new ScheduledExecutorServiceC2021f(Executors.newCachedThreadPool(new ThreadFactoryC2016a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f16412d.get());
            default:
                s6.l lVar4 = ExecutorsRegistrar.f16409a;
                return Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC2016a("Firebase Scheduler", 0, null));
        }
    }
}
