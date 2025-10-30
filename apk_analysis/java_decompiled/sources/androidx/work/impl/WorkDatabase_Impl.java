package androidx.work.impl;

import A6.t;
import G0.C0135a;
import G0.C0145k;
import G0.F;
import G6.e;
import Q0.d;
import android.content.Context;
import b5.G1;
import b7.C0701c;
import com.google.firebase.messaging.s;
import java.util.HashMap;
import k4.C1499E;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f10424t = 0;

    /* renamed from: m, reason: collision with root package name */
    public volatile e f10425m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C1499E f10426n;

    /* renamed from: o, reason: collision with root package name */
    public volatile C1499E f10427o;

    /* renamed from: p, reason: collision with root package name */
    public volatile G1 f10428p;

    /* renamed from: q, reason: collision with root package name */
    public volatile C1499E f10429q;

    /* renamed from: r, reason: collision with root package name */
    public volatile s f10430r;

    /* renamed from: s, reason: collision with root package name */
    public volatile C1499E f10431s;

    @Override // G0.E
    public final C0145k e() {
        return new C0145k(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // G0.E
    public final d g(C0135a c0135a) {
        F f9 = new F(c0135a, new C0701c(29, this));
        Context context = c0135a.f2739a;
        h.e(context, "context");
        return c0135a.f2741c.e(new t(context, c0135a.f2740b, f9, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C1499E q() {
        C1499E c1499e;
        if (this.f10426n != null) {
            return this.f10426n;
        }
        synchronized (this) {
            try {
                if (this.f10426n == null) {
                    this.f10426n = new C1499E(this, 4);
                }
                c1499e = this.f10426n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1499e;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C1499E r() {
        C1499E c1499e;
        if (this.f10431s != null) {
            return this.f10431s;
        }
        synchronized (this) {
            try {
                if (this.f10431s == null) {
                    this.f10431s = new C1499E(this, 5);
                }
                c1499e = this.f10431s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1499e;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final G1 s() {
        G1 g12;
        if (this.f10428p != null) {
            return this.f10428p;
        }
        synchronized (this) {
            try {
                if (this.f10428p == null) {
                    this.f10428p = new G1(this);
                }
                g12 = this.f10428p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return g12;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C1499E t() {
        C1499E c1499e;
        if (this.f10429q != null) {
            return this.f10429q;
        }
        synchronized (this) {
            try {
                if (this.f10429q == null) {
                    this.f10429q = new C1499E(this, 6);
                }
                c1499e = this.f10429q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1499e;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final s u() {
        s sVar;
        if (this.f10430r != null) {
            return this.f10430r;
        }
        synchronized (this) {
            try {
                if (this.f10430r == null) {
                    this.f10430r = new s(this);
                }
                sVar = this.f10430r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e v() {
        e eVar;
        if (this.f10425m != null) {
            return this.f10425m;
        }
        synchronized (this) {
            try {
                if (this.f10425m == null) {
                    this.f10425m = new e(this);
                }
                eVar = this.f10425m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final C1499E w() {
        C1499E c1499e;
        if (this.f10427o != null) {
            return this.f10427o;
        }
        synchronized (this) {
            try {
                if (this.f10427o == null) {
                    this.f10427o = new C1499E(this, 7);
                }
                c1499e = this.f10427o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1499e;
    }
}
