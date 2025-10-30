package b5;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import t0.RunnableC1967a;

/* renamed from: b5.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617c0 implements l4.m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11049a;

    /* renamed from: b, reason: collision with root package name */
    public long f11050b;

    /* renamed from: c, reason: collision with root package name */
    public long f11051c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11052d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11053e;

    public C0617c0(C0623e0 c0623e0, String str, long j) {
        this.f11053e = c0623e0;
        F4.y.e(str);
        this.f11052d = str;
        this.f11050b = j;
    }

    @Override // l4.m
    public void a(j3.m0 m0Var) {
        if (this.f11049a) {
            d(b());
        }
        this.f11053e = m0Var;
    }

    @Override // l4.m
    public long b() {
        long j = this.f11050b;
        if (this.f11049a) {
            ((l4.u) this.f11052d).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f11051c;
            if (((j3.m0) this.f11053e).f19694a == 1.0f) {
                return l4.y.H(elapsedRealtime) + j;
            }
            return (elapsedRealtime * r4.f19696c) + j;
        }
        return j;
    }

    @Override // l4.m
    public j3.m0 c() {
        return (j3.m0) this.f11053e;
    }

    public void d(long j) {
        this.f11050b = j;
        if (this.f11049a) {
            ((l4.u) this.f11052d).getClass();
            this.f11051c = SystemClock.elapsedRealtime();
        }
    }

    public void e() {
        if (!this.f11049a) {
            ((l4.u) this.f11052d).getClass();
            this.f11051c = SystemClock.elapsedRealtime();
            this.f11049a = true;
        }
    }

    public long f() {
        if (!this.f11049a) {
            this.f11049a = true;
            this.f11051c = ((C0623e0) this.f11053e).q0().getLong((String) this.f11052d, this.f11050b);
        }
        return this.f11051c;
    }

    public void g(long j) {
        SharedPreferences.Editor edit = ((C0623e0) this.f11053e).q0().edit();
        edit.putLong((String) this.f11052d, j);
        edit.apply();
        this.f11051c = j;
    }

    public C0617c0(RunnableC1967a runnableC1967a) {
        this.f11052d = new Handler(Looper.getMainLooper());
        this.f11053e = runnableC1967a;
    }

    public C0617c0(l4.u uVar) {
        this.f11052d = uVar;
        this.f11053e = j3.m0.f19693d;
    }
}
