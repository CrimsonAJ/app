package n5;

import F5.h;
import F5.m;
import F5.x;
import P.Q;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import co.notix.R;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import s8.n;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f21218a;

    /* renamed from: b, reason: collision with root package name */
    public m f21219b;

    /* renamed from: c, reason: collision with root package name */
    public int f21220c;

    /* renamed from: d, reason: collision with root package name */
    public int f21221d;

    /* renamed from: e, reason: collision with root package name */
    public int f21222e;

    /* renamed from: f, reason: collision with root package name */
    public int f21223f;

    /* renamed from: g, reason: collision with root package name */
    public int f21224g;

    /* renamed from: h, reason: collision with root package name */
    public int f21225h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f21226i;
    public ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f21227k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f21228l;

    /* renamed from: m, reason: collision with root package name */
    public h f21229m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21233q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f21235s;

    /* renamed from: t, reason: collision with root package name */
    public int f21236t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f21230n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21231o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21232p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21234r = true;

    public c(MaterialButton materialButton, m mVar) {
        this.f21218a = materialButton;
        this.f21219b = mVar;
    }

    public final x a() {
        RippleDrawable rippleDrawable = this.f21235s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            if (this.f21235s.getNumberOfLayers() > 2) {
                return (x) this.f21235s.getDrawable(2);
            }
            return (x) this.f21235s.getDrawable(1);
        }
        return null;
    }

    public final h b(boolean z9) {
        RippleDrawable rippleDrawable = this.f21235s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (h) ((LayerDrawable) ((InsetDrawable) this.f21235s.getDrawable(0)).getDrawable()).getDrawable(!z9 ? 1 : 0);
        }
        return null;
    }

    public final void c(m mVar) {
        this.f21219b = mVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(mVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(mVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(mVar);
        }
    }

    public final void d(int i9, int i10) {
        WeakHashMap weakHashMap = Q.f5546a;
        MaterialButton materialButton = this.f21218a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i11 = this.f21222e;
        int i12 = this.f21223f;
        this.f21223f = i10;
        this.f21222e = i9;
        if (!this.f21231o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i9) - i11, paddingEnd, (paddingBottom + i10) - i12);
    }

    public final void e() {
        int i9;
        h hVar = new h(this.f21219b);
        MaterialButton materialButton = this.f21218a;
        hVar.i(materialButton.getContext());
        hVar.setTintList(this.j);
        PorterDuff.Mode mode = this.f21226i;
        if (mode != null) {
            hVar.setTintMode(mode);
        }
        float f9 = this.f21225h;
        ColorStateList colorStateList = this.f21227k;
        hVar.f2483a.j = f9;
        hVar.invalidateSelf();
        hVar.m(colorStateList);
        h hVar2 = new h(this.f21219b);
        hVar2.setTint(0);
        float f10 = this.f21225h;
        if (this.f21230n) {
            i9 = n.r(materialButton, R.attr.colorSurface);
        } else {
            i9 = 0;
        }
        hVar2.f2483a.j = f10;
        hVar2.invalidateSelf();
        hVar2.m(ColorStateList.valueOf(i9));
        h hVar3 = new h(this.f21219b);
        this.f21229m = hVar3;
        hVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(D5.a.c(this.f21228l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{hVar2, hVar}), this.f21220c, this.f21222e, this.f21221d, this.f21223f), this.f21229m);
        this.f21235s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        h b9 = b(false);
        if (b9 != null) {
            b9.j(this.f21236t);
            b9.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i9 = 0;
        h b9 = b(false);
        h b10 = b(true);
        if (b9 != null) {
            float f9 = this.f21225h;
            ColorStateList colorStateList = this.f21227k;
            b9.f2483a.j = f9;
            b9.invalidateSelf();
            b9.m(colorStateList);
            if (b10 != null) {
                float f10 = this.f21225h;
                if (this.f21230n) {
                    i9 = n.r(this.f21218a, R.attr.colorSurface);
                }
                b10.f2483a.j = f10;
                b10.invalidateSelf();
                b10.m(ColorStateList.valueOf(i9));
            }
        }
    }
}
