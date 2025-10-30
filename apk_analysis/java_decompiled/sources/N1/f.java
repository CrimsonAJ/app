package N1;

import G0.C0142h;
import J1.M0;
import J1.f1;
import M1.AbstractC0249e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;

/* loaded from: classes.dex */
public final class f extends AbstractC0249e {
    public static final b j = new b(0);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4842e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4843f;

    /* renamed from: g, reason: collision with root package name */
    public final C0142h f4844g;

    /* renamed from: h, reason: collision with root package name */
    public final i f4845h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4846i;

    public f(boolean z9, boolean z10, C0142h c0142h, i iVar) {
        super(j);
        this.f4842e = z9;
        this.f4843f = z10;
        this.f4844g = c0142h;
        this.f4845h = iVar;
    }

    @Override // M1.AbstractC0249e
    public final M1.o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = 0;
        if (this.f4842e) {
            int i10 = f1.f3921A;
            f1 f1Var = (f1) W.c.b(layoutInflater, R.layout.item_movie_large, parent, false);
            kotlin.jvm.internal.h.d(f1Var, "inflate(...)");
            return new d(this, f1Var, i9);
        }
        int i11 = M0.f3719C;
        M0 m02 = (M0) W.c.b(layoutInflater, R.layout.item_category, parent, false);
        kotlin.jvm.internal.h.d(m02, "inflate(...)");
        return new d(this, m02, 1);
    }
}
