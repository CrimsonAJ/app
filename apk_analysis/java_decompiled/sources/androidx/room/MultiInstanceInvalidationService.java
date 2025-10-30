package androidx.room;

import G0.BinderC0150p;
import G0.RemoteCallbackListC0151q;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f10351a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f10352b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final RemoteCallbackListC0151q f10353c = new RemoteCallbackListC0151q(this);

    /* renamed from: d, reason: collision with root package name */
    public final BinderC0150p f10354d = new BinderC0150p(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        h.e(intent, "intent");
        return this.f10354d;
    }
}
