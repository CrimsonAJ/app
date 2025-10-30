package o1;

import android.content.Context;
import androidx.work.ListenableWorker;
import b5.G1;
import n1.C1613j;
import p1.C1847j;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final String f21489g = e1.q.j("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final C1847j f21490a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Context f21491b;

    /* renamed from: c, reason: collision with root package name */
    public final C1613j f21492c;

    /* renamed from: d, reason: collision with root package name */
    public final ListenableWorker f21493d;

    /* renamed from: e, reason: collision with root package name */
    public final n f21494e;

    /* renamed from: f, reason: collision with root package name */
    public final G1 f21495f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p1.j] */
    public m(Context context, C1613j c1613j, ListenableWorker listenableWorker, n nVar, G1 g12) {
        this.f21491b = context;
        this.f21492c = c1613j;
        this.f21493d = listenableWorker;
        this.f21494e = nVar;
        this.f21495f = g12;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [p1.h, java.lang.Object, p1.j] */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f21492c.f21046q && !L.a.a()) {
            ?? obj = new Object();
            G1 g12 = this.f21495f;
            ((D4.q) g12.f10719d).execute(new l(this, obj, 0));
            obj.a(new l(this, obj, 1), (D4.q) g12.f10719d);
            return;
        }
        this.f21490a.j(null);
    }
}
