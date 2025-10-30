package F5;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import u5.C2081a;

/* loaded from: classes.dex */
public class g extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public m f2466a;

    /* renamed from: b, reason: collision with root package name */
    public C2081a f2467b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f2468c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f2469d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f2470e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f2471f;

    /* renamed from: g, reason: collision with root package name */
    public Rect f2472g;

    /* renamed from: h, reason: collision with root package name */
    public final float f2473h;

    /* renamed from: i, reason: collision with root package name */
    public float f2474i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public int f2475k;

    /* renamed from: l, reason: collision with root package name */
    public float f2476l;

    /* renamed from: m, reason: collision with root package name */
    public float f2477m;

    /* renamed from: n, reason: collision with root package name */
    public int f2478n;

    /* renamed from: o, reason: collision with root package name */
    public int f2479o;

    /* renamed from: p, reason: collision with root package name */
    public int f2480p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint.Style f2481q;

    public g(m mVar) {
        this.f2468c = null;
        this.f2469d = null;
        this.f2470e = null;
        this.f2471f = PorterDuff.Mode.SRC_IN;
        this.f2472g = null;
        this.f2473h = 1.0f;
        this.f2474i = 1.0f;
        this.f2475k = 255;
        this.f2476l = 0.0f;
        this.f2477m = 0.0f;
        this.f2478n = 0;
        this.f2479o = 0;
        this.f2480p = 0;
        this.f2481q = Paint.Style.FILL_AND_STROKE;
        this.f2466a = mVar;
        this.f2467b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        h hVar = new h(this);
        hVar.f2487e = true;
        return hVar;
    }

    public g(g gVar) {
        this.f2468c = null;
        this.f2469d = null;
        this.f2470e = null;
        this.f2471f = PorterDuff.Mode.SRC_IN;
        this.f2472g = null;
        this.f2473h = 1.0f;
        this.f2474i = 1.0f;
        this.f2475k = 255;
        this.f2476l = 0.0f;
        this.f2477m = 0.0f;
        this.f2478n = 0;
        this.f2479o = 0;
        this.f2480p = 0;
        this.f2481q = Paint.Style.FILL_AND_STROKE;
        this.f2466a = gVar.f2466a;
        this.f2467b = gVar.f2467b;
        this.j = gVar.j;
        this.f2468c = gVar.f2468c;
        this.f2469d = gVar.f2469d;
        this.f2471f = gVar.f2471f;
        this.f2470e = gVar.f2470e;
        this.f2475k = gVar.f2475k;
        this.f2473h = gVar.f2473h;
        this.f2480p = gVar.f2480p;
        this.f2478n = gVar.f2478n;
        this.f2474i = gVar.f2474i;
        this.f2476l = gVar.f2476l;
        this.f2477m = gVar.f2477m;
        this.f2479o = gVar.f2479o;
        this.f2481q = gVar.f2481q;
        if (gVar.f2472g != null) {
            this.f2472g = new Rect(gVar.f2472g);
        }
    }
}
