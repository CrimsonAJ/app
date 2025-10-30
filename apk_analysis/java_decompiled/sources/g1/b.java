package g1;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import b5.G1;
import com.google.firebase.messaging.u;
import d2.v;
import e1.c;
import e1.q;
import f1.InterfaceC1159a;
import f1.InterfaceC1161c;
import f1.k;
import j1.C1433c;
import j1.InterfaceC1432b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n1.C1613j;
import o1.AbstractC1673h;
import u0.z;

/* loaded from: classes.dex */
public final class b implements InterfaceC1161c, InterfaceC1432b, InterfaceC1159a {

    /* renamed from: i, reason: collision with root package name */
    public static final String f17548i = q.j("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f17549a;

    /* renamed from: b, reason: collision with root package name */
    public final k f17550b;

    /* renamed from: c, reason: collision with root package name */
    public final C1433c f17551c;

    /* renamed from: e, reason: collision with root package name */
    public final C1198a f17553e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17554f;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f17556h;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f17552d = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final Object f17555g = new Object();

    public b(Context context, e1.b bVar, G1 g12, k kVar) {
        this.f17549a = context;
        this.f17550b = kVar;
        this.f17551c = new C1433c(context, g12, this);
        this.f17553e = new C1198a(this, bVar.f17026e);
    }

    @Override // f1.InterfaceC1159a
    public final void a(String str, boolean z9) {
        synchronized (this.f17555g) {
            try {
                Iterator it = this.f17552d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1613j c1613j = (C1613j) it.next();
                    if (c1613j.f21031a.equals(str)) {
                        q.d().a(f17548i, "Stopping tracking for " + str, new Throwable[0]);
                        this.f17552d.remove(c1613j);
                        this.f17551c.c(this.f17552d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f1.InterfaceC1161c
    public final void b(String str) {
        Runnable runnable;
        Boolean bool = this.f17556h;
        k kVar = this.f17550b;
        if (bool == null) {
            this.f17556h = Boolean.valueOf(AbstractC1673h.a(this.f17549a, kVar.f17300i));
        }
        boolean booleanValue = this.f17556h.booleanValue();
        String str2 = f17548i;
        if (!booleanValue) {
            q.d().i(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f17554f) {
            kVar.f17303m.b(this);
            this.f17554f = true;
        }
        q.d().a(str2, z.e("Cancelling work ID ", str), new Throwable[0]);
        C1198a c1198a = this.f17553e;
        if (c1198a != null && (runnable = (Runnable) c1198a.f17547c.remove(str)) != null) {
            ((Handler) c1198a.f17546b.f16512a).removeCallbacks(runnable);
        }
        kVar.f0(str);
    }

    @Override // j1.InterfaceC1432b
    public final void c(ArrayList arrayList) {
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            String str = (String) obj;
            q.d().a(f17548i, z.e("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.f17550b.f0(str);
        }
    }

    @Override // f1.InterfaceC1161c
    public final void d(C1613j... c1613jArr) {
        if (this.f17556h == null) {
            this.f17556h = Boolean.valueOf(AbstractC1673h.a(this.f17549a, this.f17550b.f17300i));
        }
        if (!this.f17556h.booleanValue()) {
            q.d().i(f17548i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f17554f) {
            this.f17550b.f17303m.b(this);
            this.f17554f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C1613j c1613j : c1613jArr) {
            long a5 = c1613j.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (c1613j.f21032b == 1) {
                if (currentTimeMillis < a5) {
                    C1198a c1198a = this.f17553e;
                    if (c1198a != null) {
                        HashMap hashMap = c1198a.f17547c;
                        Runnable runnable = (Runnable) hashMap.remove(c1613j.f21031a);
                        u uVar = c1198a.f17546b;
                        if (runnable != null) {
                            ((Handler) uVar.f16512a).removeCallbacks(runnable);
                        }
                        v vVar = new v(c1198a, 10, c1613j);
                        hashMap.put(c1613j.f21031a, vVar);
                        ((Handler) uVar.f16512a).postDelayed(vVar, c1613j.a() - System.currentTimeMillis());
                    }
                } else if (c1613j.b()) {
                    int i9 = Build.VERSION.SDK_INT;
                    c cVar = c1613j.j;
                    if (cVar.f17033c) {
                        q.d().a(f17548i, "Ignoring WorkSpec " + c1613j + ", Requires device idle.", new Throwable[0]);
                    } else if (i9 >= 24 && cVar.f17038h.f17041a.size() > 0) {
                        q.d().a(f17548i, "Ignoring WorkSpec " + c1613j + ", Requires ContentUri triggers.", new Throwable[0]);
                    } else {
                        hashSet.add(c1613j);
                        hashSet2.add(c1613j.f21031a);
                    }
                } else {
                    q.d().a(f17548i, z.e("Starting work for ", c1613j.f21031a), new Throwable[0]);
                    this.f17550b.e0(c1613j.f21031a, null);
                }
            }
        }
        synchronized (this.f17555g) {
            try {
                if (!hashSet.isEmpty()) {
                    q.d().a(f17548i, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.f17552d.addAll(hashSet);
                    this.f17551c.c(this.f17552d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // j1.InterfaceC1432b
    public final void e(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            String str = (String) obj;
            q.d().a(f17548i, z.e("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f17550b.e0(str, null);
        }
    }

    @Override // f1.InterfaceC1161c
    public final boolean f() {
        return false;
    }
}
