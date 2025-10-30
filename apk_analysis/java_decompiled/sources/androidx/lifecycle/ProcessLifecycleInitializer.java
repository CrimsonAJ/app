package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements T0.b {
    @Override // T0.b
    public final Object create(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        T0.a c3 = T0.a.c(context);
        kotlin.jvm.internal.h.d(c3, "getInstance(context)");
        if (c3.f6970b.contains(ProcessLifecycleInitializer.class)) {
            if (!AbstractC0558t.f9903a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0557s());
            }
            J j = J.f9800i;
            j.getClass();
            j.f9805e = new Handler();
            j.f9806f.o0(EnumC0554o.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            kotlin.jvm.internal.h.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new I(j));
            return j;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }

    @Override // T0.b
    public final List dependencies() {
        return B7.t.f1135a;
    }
}
