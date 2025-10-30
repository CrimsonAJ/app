package d;

import G0.D;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.InterfaceC0561w;
import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: d.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1082w {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f16627a;

    /* renamed from: b, reason: collision with root package name */
    public final B7.i f16628b = new B7.i();

    /* renamed from: c, reason: collision with root package name */
    public AbstractC1073n f16629c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f16630d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f16631e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16632f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16633g;

    public C1082w(Runnable runnable) {
        OnBackInvokedCallback a5;
        this.f16627a = runnable;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33) {
            if (i9 >= 34) {
                a5 = C1079t.f16620a.a(new C1074o(this, 0), new C1074o(this, 1), new C1075p(this, 0), new C1075p(this, 1));
            } else {
                a5 = C1077r.f16615a.a(new C1075p(this, 2));
            }
            this.f16630d = a5;
        }
    }

    public final void a(InterfaceC0561w interfaceC0561w, AbstractC1073n onBackPressedCallback) {
        kotlin.jvm.internal.h.e(onBackPressedCallback, "onBackPressedCallback");
        D.n x5 = interfaceC0561w.x();
        if (x5.a0() == EnumC0555p.f9893a) {
            return;
        }
        onBackPressedCallback.f16607b.add(new C1080u(this, x5, onBackPressedCallback));
        e();
        onBackPressedCallback.f16608c = new D(0, this, C1082w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
    }

    public final C1081v b(AbstractC1073n onBackPressedCallback) {
        kotlin.jvm.internal.h.e(onBackPressedCallback, "onBackPressedCallback");
        this.f16628b.addLast(onBackPressedCallback);
        C1081v c1081v = new C1081v(this, onBackPressedCallback);
        onBackPressedCallback.f16607b.add(c1081v);
        e();
        onBackPressedCallback.f16608c = new D(0, this, C1082w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 2);
        return c1081v;
    }

    public final void c() {
        Object obj;
        B7.i iVar = this.f16628b;
        ListIterator listIterator = iVar.listIterator(iVar.b());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((AbstractC1073n) obj).f16606a) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AbstractC1073n abstractC1073n = (AbstractC1073n) obj;
        this.f16629c = null;
        if (abstractC1073n != null) {
            abstractC1073n.a();
        } else {
            this.f16627a.run();
        }
    }

    public final void d(boolean z9) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f16631e;
        OnBackInvokedCallback onBackInvokedCallback = this.f16630d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            C1077r c1077r = C1077r.f16615a;
            if (z9 && !this.f16632f) {
                c1077r.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f16632f = true;
            } else if (!z9 && this.f16632f) {
                c1077r.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f16632f = false;
            }
        }
    }

    public final void e() {
        boolean z9;
        boolean z10 = this.f16633g;
        boolean z11 = false;
        B7.i iVar = this.f16628b;
        if (iVar != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 || !iVar.isEmpty()) {
            Iterator it = iVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC1073n) it.next()).f16606a) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f16633g = z11;
        if (z11 != z10 && Build.VERSION.SDK_INT >= 33) {
            d(z11);
        }
    }
}
