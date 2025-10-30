package com.google.android.gms.common.api.internal;

import C4.o;
import C4.p;
import D4.HandlerC0087f;
import D4.K;
import D4.w;
import F4.y;
import T4.d;
import a.AbstractC0485a;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends o> extends AbstractC0485a {

    /* renamed from: w, reason: collision with root package name */
    public static final K f14664w = new K(0);

    /* renamed from: l, reason: collision with root package name */
    public final HandlerC0087f f14666l;

    /* renamed from: o, reason: collision with root package name */
    public p f14669o;

    /* renamed from: q, reason: collision with root package name */
    public o f14671q;

    /* renamed from: r, reason: collision with root package name */
    public Status f14672r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f14673s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14674t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14675u;

    /* renamed from: k, reason: collision with root package name */
    public final Object f14665k = new Object();

    /* renamed from: m, reason: collision with root package name */
    public final CountDownLatch f14667m = new CountDownLatch(1);

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f14668n = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReference f14670p = new AtomicReference();

    /* renamed from: v, reason: collision with root package name */
    public boolean f14676v = false;

    /* JADX WARN: Type inference failed for: r1v1, types: [T4.d, D4.f] */
    public BasePendingResult(w wVar) {
        Looper mainLooper;
        if (wVar != null) {
            mainLooper = wVar.f1901b.f1583f;
        } else {
            mainLooper = Looper.getMainLooper();
        }
        this.f14666l = new d(mainLooper, 0);
        new WeakReference(wVar);
    }

    public final void D(D4.o oVar) {
        synchronized (this.f14665k) {
            try {
                if (I()) {
                    oVar.a(this.f14672r);
                } else {
                    this.f14668n.add(oVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void E() {
        synchronized (this.f14665k) {
            try {
                if (!this.f14674t && !this.f14673s) {
                    this.f14674t = true;
                    M(F(Status.f14659i));
                }
            } finally {
            }
        }
    }

    public abstract o F(Status status);

    public final void G(Status status) {
        synchronized (this.f14665k) {
            try {
                if (!I()) {
                    J(F(status));
                    this.f14675u = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean H() {
        boolean z9;
        synchronized (this.f14665k) {
            z9 = this.f14674t;
        }
        return z9;
    }

    public final boolean I() {
        if (this.f14667m.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final void J(o oVar) {
        synchronized (this.f14665k) {
            try {
                if (!this.f14675u && !this.f14674t) {
                    I();
                    y.j("Results have already been set", !I());
                    y.j("Result has already been consumed", !this.f14673s);
                    M(oVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void K(p pVar) {
        synchronized (this.f14665k) {
            try {
                if (pVar == null) {
                    this.f14669o = null;
                    return;
                }
                y.j("Result has already been consumed.", !this.f14673s);
                if (H()) {
                    return;
                }
                if (I()) {
                    HandlerC0087f handlerC0087f = this.f14666l;
                    o L8 = L();
                    handlerC0087f.getClass();
                    handlerC0087f.sendMessage(handlerC0087f.obtainMessage(1, new Pair(pVar, L8)));
                } else {
                    this.f14669o = pVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final o L() {
        o oVar;
        synchronized (this.f14665k) {
            y.j("Result has already been consumed.", !this.f14673s);
            y.j("Result is not ready.", I());
            oVar = this.f14671q;
            this.f14671q = null;
            this.f14669o = null;
            this.f14673s = true;
        }
        if (this.f14670p.getAndSet(null) == null) {
            y.h(oVar);
            return oVar;
        }
        throw new ClassCastException();
    }

    public final void M(o oVar) {
        this.f14671q = oVar;
        this.f14672r = oVar.d();
        this.f14667m.countDown();
        if (this.f14674t) {
            this.f14669o = null;
        } else {
            p pVar = this.f14669o;
            if (pVar != null) {
                HandlerC0087f handlerC0087f = this.f14666l;
                handlerC0087f.removeMessages(2);
                handlerC0087f.sendMessage(handlerC0087f.obtainMessage(1, new Pair(pVar, L())));
            }
        }
        ArrayList arrayList = this.f14668n;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((D4.o) arrayList.get(i9)).a(this.f14672r);
        }
        arrayList.clear();
    }
}
