package Q6;

import android.content.Context;
import android.os.Build;
import f5.C1185q;
import java.util.Set;
import java.util.concurrent.Executor;
import s8.n;

/* loaded from: classes.dex */
public final class e implements g, h {

    /* renamed from: a, reason: collision with root package name */
    public final c f6453a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f6454b;

    /* renamed from: c, reason: collision with root package name */
    public final S6.b f6455c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f6456d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f6457e;

    public e(Context context, String str, Set set, S6.b bVar, Executor executor) {
        this.f6453a = new c(context, 0, str);
        this.f6456d = set;
        this.f6457e = executor;
        this.f6455c = bVar;
        this.f6454b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        i iVar = (i) this.f6453a.get();
        if (iVar.i(currentTimeMillis)) {
            iVar.g();
            return 3;
        }
        return 1;
    }

    public final C1185q b() {
        boolean z9;
        if (Build.VERSION.SDK_INT >= 24) {
            z9 = L.d.f(this.f6454b);
        } else {
            z9 = true;
        }
        if (!z9) {
            return n.p("");
        }
        return n.e(this.f6457e, new d(this, 0));
    }

    public final void c() {
        boolean z9;
        if (this.f6456d.size() <= 0) {
            n.p(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z9 = L.d.f(this.f6454b);
        } else {
            z9 = true;
        }
        if (!z9) {
            n.p(null);
        } else {
            n.e(this.f6457e, new d(this, 1));
        }
    }
}
