package C1;

import Y7.y0;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import u0.z;

/* loaded from: classes.dex */
public final class t implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f1249a;

    /* renamed from: b, reason: collision with root package name */
    public k f1250b;

    /* renamed from: c, reason: collision with root package name */
    public y0 f1251c;

    /* renamed from: d, reason: collision with root package name */
    public r f1252d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1253e;

    public t(ImageView imageView) {
        this.f1249a = imageView;
    }

    public final synchronized k a() {
        k kVar = this.f1250b;
        if (kVar != null && kotlin.jvm.internal.h.a(Looper.myLooper(), Looper.getMainLooper()) && this.f1253e) {
            this.f1253e = false;
            return kVar;
        }
        y0 y0Var = this.f1251c;
        if (y0Var != null) {
            y0Var.d(null);
        }
        this.f1251c = null;
        k kVar2 = new k(this.f1249a);
        this.f1250b = kVar2;
        return kVar2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        r rVar = this.f1252d;
        if (rVar == null) {
            return;
        }
        this.f1253e = true;
        rVar.f1243a.b(rVar.f1244b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        r rVar = this.f1252d;
        if (rVar != null) {
            rVar.f1247e.d(null);
            E1.a aVar = rVar.f1245c;
            boolean i9 = z.i(aVar);
            D.n nVar = rVar.f1246d;
            if (i9) {
                nVar.g0(aVar);
            }
            nVar.g0(rVar);
        }
    }
}
