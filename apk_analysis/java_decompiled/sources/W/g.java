package W;

import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.y;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.View;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.InterfaceC0561w;
import co.notix.R;
import i0.AbstractComponentCallbacksC1366v;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public abstract class g extends v4.e {

    /* renamed from: s, reason: collision with root package name */
    public static final boolean f7848s = true;

    /* renamed from: t, reason: collision with root package name */
    public static final ReferenceQueue f7849t = new ReferenceQueue();

    /* renamed from: u, reason: collision with root package name */
    public static final d f7850u = new d(0);

    /* renamed from: h, reason: collision with root package name */
    public final A4.e f7851h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7852i;
    public final h[] j;

    /* renamed from: k, reason: collision with root package name */
    public final View f7853k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7854l;

    /* renamed from: m, reason: collision with root package name */
    public final Choreographer f7855m;

    /* renamed from: n, reason: collision with root package name */
    public final e f7856n;

    /* renamed from: o, reason: collision with root package name */
    public final Handler f7857o;

    /* renamed from: p, reason: collision with root package name */
    public g f7858p;

    /* renamed from: q, reason: collision with root package name */
    public Object f7859q;

    /* renamed from: r, reason: collision with root package name */
    public f f7860r;

    public g(Object obj, View view, int i9) {
        if (obj == null) {
            this.f7851h = new A4.e(9, this);
            this.f7852i = false;
            this.j = new h[i9];
            this.f7853k = view;
            if (Looper.myLooper() != null) {
                if (f7848s) {
                    this.f7855m = Choreographer.getInstance();
                    this.f7856n = new e(0, this);
                    return;
                } else {
                    this.f7856n = null;
                    this.f7857o = new Handler(Looper.myLooper());
                    return;
                }
            }
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0098, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0096, code lost:
    
        if (r24 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r24 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f0(android.view.View r22, java.lang.Object[] r23, android.support.v4.media.session.y r24, android.util.SparseIntArray r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W.g.f0(android.view.View, java.lang.Object[], android.support.v4.media.session.y, android.util.SparseIntArray, boolean):void");
    }

    public static Object[] g0(View view, int i9, y yVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i9];
        f0(view, objArr, yVar, sparseIntArray, true);
        return objArr;
    }

    public abstract void a0();

    public final void b0() {
        if (this.f7854l) {
            h0();
        } else {
            if (!d0()) {
                return;
            }
            this.f7854l = true;
            a0();
            this.f7854l = false;
        }
    }

    public final void c0() {
        g gVar = this.f7858p;
        if (gVar == null) {
            b0();
        } else {
            gVar.c0();
        }
    }

    public abstract boolean d0();

    public abstract void e0();

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w, java.lang.Object] */
    public final void h0() {
        g gVar = this.f7858p;
        if (gVar != null) {
            gVar.h0();
            return;
        }
        ?? r0 = this.f7859q;
        if (r0 != 0 && r0.x().a0().compareTo(EnumC0555p.f9896d) < 0) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f7852i) {
                    return;
                }
                this.f7852i = true;
                if (f7848s) {
                    this.f7855m.postFrameCallback(this.f7856n);
                } else {
                    this.f7857o.post(this.f7851h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w, java.lang.Object] */
    public void i0(InterfaceC0561w interfaceC0561w) {
        if (interfaceC0561w instanceof AbstractComponentCallbacksC1366v) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        ?? r0 = this.f7859q;
        if (r0 != interfaceC0561w) {
            if (r0 != 0) {
                r0.x().g0(this.f7860r);
            }
            this.f7859q = interfaceC0561w;
            if (interfaceC0561w != null) {
                if (this.f7860r == null) {
                    this.f7860r = new f(this);
                }
                interfaceC0561w.x().V(this.f7860r);
            }
            for (h hVar : this.j) {
            }
        }
    }

    public final void j0(View view) {
        view.setTag(R.id.dataBinding, this);
    }
}
