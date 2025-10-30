package co.notix;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class yn {
    public static final void a(kd kdVar, String msg, Throwable throwable) {
        kotlin.jvm.internal.h.e(kdVar, "<this>");
        kotlin.jvm.internal.h.e(msg, "msg");
        kotlin.jvm.internal.h.e(throwable, "throwable");
        if (throwable instanceof IOException) {
            StringBuilder r5 = AbstractC0953k1.r("IO| ", msg, ". ");
            r5.append(throwable.getMessage());
            kdVar.a(r5.toString());
            return;
        }
        kdVar.f12607b.a(msg, throwable);
    }
}
