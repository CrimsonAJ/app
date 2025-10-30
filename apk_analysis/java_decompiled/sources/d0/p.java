package d0;

import A3.C0005f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class p implements InterfaceC1090h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16662a;

    /* renamed from: b, reason: collision with root package name */
    public final M.d f16663b;

    /* renamed from: c, reason: collision with root package name */
    public final o f16664c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f16665d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f16666e;

    /* renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f16667f;

    /* renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f16668g;

    /* renamed from: h, reason: collision with root package name */
    public Z0.a f16669h;

    public p(Context context, M.d dVar) {
        o oVar = q.f16670d;
        this.f16665d = new Object();
        s8.e.g(context, "Context cannot be null");
        this.f16662a = context.getApplicationContext();
        this.f16663b = dVar;
        this.f16664c = oVar;
    }

    @Override // d0.InterfaceC1090h
    public final void a(Z0.a aVar) {
        synchronized (this.f16665d) {
            this.f16669h = aVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f16665d) {
            try {
                this.f16669h = null;
                Handler handler = this.f16666e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f16666e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f16668g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f16667f = null;
                this.f16668g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f16665d) {
            try {
                if (this.f16669h == null) {
                    return;
                }
                if (this.f16667f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1083a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f16668g = threadPoolExecutor;
                    this.f16667f = threadPoolExecutor;
                }
                this.f16667f.execute(new A6.s(20, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final M.i d() {
        try {
            o oVar = this.f16664c;
            Context context = this.f16662a;
            M.d dVar = this.f16663b;
            oVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            C0005f a5 = M.c.a(context, Collections.unmodifiableList(arrayList));
            int i9 = a5.f127a;
            if (i9 == 0) {
                M.i[] iVarArr = (M.i[]) a5.f128b.get(0);
                if (iVarArr != null && iVarArr.length != 0) {
                    return iVarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(A0.a.m("fetchFonts failed (", i9, ")"));
        } catch (PackageManager.NameNotFoundException e8) {
            throw new RuntimeException("provider not found", e8);
        }
    }
}
