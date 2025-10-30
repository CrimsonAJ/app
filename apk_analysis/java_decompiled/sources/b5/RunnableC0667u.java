package b5;

import android.os.Trace;
import d0.C1091i;
import java.lang.reflect.Method;

/* renamed from: b5.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0667u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11321a;

    public /* synthetic */ RunnableC0667u(int i9) {
        this.f11321a = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        switch (this.f11321a) {
            case 0:
                com.google.android.gms.internal.measurement.J1.f15233i.incrementAndGet();
                return;
            default:
                try {
                    Method method = L.k.f4453b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (C1091i.f16642k != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        C1091i.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    Method method2 = L.k.f4453b;
                    Trace.endSection();
                    throw th;
                }
        }
    }
}
