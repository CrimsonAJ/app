package co.notix.startup;

import B6.u0;
import T0.b;
import Y7.B;
import android.content.Context;
import androidx.work.WorkManagerInitializer;
import co.notix.d9;
import co.notix.rg;
import co.notix.sg;
import co.notix.wq;
import java.util.List;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class NotixInitializer implements b {
    @Override // T0.b
    public final Object create(Context context) {
        h.e(context, "context");
        sg sgVar = wq.f13466C;
        sgVar.getClass();
        ((d9) sgVar.f13170b).a(context);
        B.r(sgVar.f13173e, null, new rg(sgVar, context, null), 3);
        return wq.f13467D;
    }

    @Override // T0.b
    public final List dependencies() {
        return u0.D(WorkManagerInitializer.class);
    }
}
