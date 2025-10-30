package co.notix;

import f5.AbstractC1176h;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class qa extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1176h f13029a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(AbstractC1176h abstractC1176h) {
        super(1);
        this.f13029a = abstractC1176h;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        String str;
        Throwable cause;
        ((Number) obj).intValue();
        try {
            Object b9 = s8.n.b(this.f13029a);
            kotlin.jvm.internal.h.d(b9, "await(task)");
            return new va((String) b9);
        } catch (ExecutionException e8) {
            Exception f9 = this.f13029a.f();
            if (f9 != null) {
                Throwable cause2 = f9.getCause();
                if (cause2 != null && (cause = cause2.getCause()) != null) {
                    str = cause.getMessage();
                } else {
                    str = null;
                }
                if (kotlin.jvm.internal.h.a(str, "MISSING_INSTANCEID_SERVICE")) {
                    return new sa(f9);
                }
                throw e8;
            }
            throw e8;
        }
    }
}
