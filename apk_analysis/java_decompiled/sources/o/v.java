package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import co.notix.R;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21441a;

    /* renamed from: b, reason: collision with root package name */
    public final l f21442b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21443c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21444d;

    /* renamed from: e, reason: collision with root package name */
    public View f21445e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21447g;

    /* renamed from: h, reason: collision with root package name */
    public w f21448h;

    /* renamed from: i, reason: collision with root package name */
    public t f21449i;
    public u j;

    /* renamed from: f, reason: collision with root package name */
    public int f21446f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final u f21450k = new u(this);

    public v(int i9, Context context, View view, l lVar, boolean z9) {
        this.f21441a = context;
        this.f21442b = lVar;
        this.f21445e = view;
        this.f21443c = z9;
        this.f21444d = i9;
    }

    public final t a() {
        t viewOnKeyListenerC1658C;
        if (this.f21449i == null) {
            Context context = this.f21441a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1658C = new f(context, this.f21445e, this.f21444d, this.f21443c);
            } else {
                View view = this.f21445e;
                Context context2 = this.f21441a;
                boolean z9 = this.f21443c;
                viewOnKeyListenerC1658C = new ViewOnKeyListenerC1658C(this.f21444d, context2, view, this.f21442b, z9);
            }
            viewOnKeyListenerC1658C.n(this.f21442b);
            viewOnKeyListenerC1658C.t(this.f21450k);
            viewOnKeyListenerC1658C.p(this.f21445e);
            viewOnKeyListenerC1658C.h(this.f21448h);
            viewOnKeyListenerC1658C.q(this.f21447g);
            viewOnKeyListenerC1658C.r(this.f21446f);
            this.f21449i = viewOnKeyListenerC1658C;
        }
        return this.f21449i;
    }

    public final boolean b() {
        t tVar = this.f21449i;
        if (tVar != null && tVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f21449i = null;
        u uVar = this.j;
        if (uVar != null) {
            uVar.onDismiss();
        }
    }

    public final void d(int i9, int i10, boolean z9, boolean z10) {
        t a5 = a();
        a5.u(z10);
        if (z9) {
            if ((Gravity.getAbsoluteGravity(this.f21446f, this.f21445e.getLayoutDirection()) & 7) == 5) {
                i9 -= this.f21445e.getWidth();
            }
            a5.s(i9);
            a5.v(i10);
            int i11 = (int) ((this.f21441a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a5.f21439a = new Rect(i9 - i11, i10 - i11, i9 + i11, i10 + i11);
        }
        a5.d();
    }
}
