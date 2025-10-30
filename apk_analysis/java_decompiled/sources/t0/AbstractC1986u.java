package t0;

import android.content.ComponentName;
import android.content.Context;
import f5.C1183o;
import java.util.Objects;

/* renamed from: t0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1986u {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23035a;

    /* renamed from: b, reason: collision with root package name */
    public final C1183o f23036b;

    /* renamed from: c, reason: collision with root package name */
    public final C3.e f23037c = new C3.e(9, this);

    /* renamed from: d, reason: collision with root package name */
    public i.G f23038d;

    /* renamed from: e, reason: collision with root package name */
    public C1981o f23039e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23040f;

    /* renamed from: g, reason: collision with root package name */
    public C1987v f23041g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23042h;

    public AbstractC1986u(Context context, C1183o c1183o) {
        if (context != null) {
            this.f23035a = context;
            if (c1183o == null) {
                this.f23036b = new C1183o(16, new ComponentName(context, getClass()));
                return;
            } else {
                this.f23036b = c1183o;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public r a(String str, C1985t c1985t) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public AbstractC1984s b(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public AbstractC1984s c(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return d(str, C1985t.f23033b);
            }
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public AbstractC1984s d(String str, C1985t c1985t) {
        return b(str);
    }

    public abstract void e(C1981o c1981o);

    public final void f(C1987v c1987v) {
        D.b();
        if (this.f23041g != c1987v) {
            this.f23041g = c1987v;
            if (!this.f23042h) {
                this.f23042h = true;
                this.f23037c.sendEmptyMessage(1);
            }
        }
    }

    public final void g(C1981o c1981o) {
        D.b();
        if (!Objects.equals(this.f23039e, c1981o)) {
            this.f23039e = c1981o;
            if (!this.f23040f) {
                this.f23040f = true;
                this.f23037c.sendEmptyMessage(2);
            }
        }
    }
}
