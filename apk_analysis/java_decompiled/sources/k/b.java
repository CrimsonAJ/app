package k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import s.AbstractC1938h;
import s.C1937g;
import s.C1940j;
import t.AbstractC1964a;

/* loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* renamed from: A, reason: collision with root package name */
    public boolean f19806A;

    /* renamed from: B, reason: collision with root package name */
    public ColorFilter f19807B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f19808C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f19809D;

    /* renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f19810E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f19811F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f19812G;

    /* renamed from: H, reason: collision with root package name */
    public int[][] f19813H;

    /* renamed from: I, reason: collision with root package name */
    public C1937g f19814I;

    /* renamed from: J, reason: collision with root package name */
    public C1940j f19815J;

    /* renamed from: a, reason: collision with root package name */
    public final e f19816a;

    /* renamed from: b, reason: collision with root package name */
    public Resources f19817b;

    /* renamed from: c, reason: collision with root package name */
    public int f19818c;

    /* renamed from: d, reason: collision with root package name */
    public int f19819d;

    /* renamed from: e, reason: collision with root package name */
    public int f19820e;

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f19821f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable[] f19822g;

    /* renamed from: h, reason: collision with root package name */
    public int f19823h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19824i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f19825k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f19826l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f19827m;

    /* renamed from: n, reason: collision with root package name */
    public int f19828n;

    /* renamed from: o, reason: collision with root package name */
    public int f19829o;

    /* renamed from: p, reason: collision with root package name */
    public int f19830p;

    /* renamed from: q, reason: collision with root package name */
    public int f19831q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f19832r;

    /* renamed from: s, reason: collision with root package name */
    public int f19833s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f19834t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f19835u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f19836v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19837w;

    /* renamed from: x, reason: collision with root package name */
    public int f19838x;

    /* renamed from: y, reason: collision with root package name */
    public int f19839y;

    /* renamed from: z, reason: collision with root package name */
    public int f19840z;

    public b(b bVar, e eVar, Resources resources) {
        Resources resources2;
        int i9;
        this.f19824i = false;
        this.f19826l = false;
        this.f19837w = true;
        this.f19839y = 0;
        this.f19840z = 0;
        this.f19816a = eVar;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f19817b;
        } else {
            resources2 = null;
        }
        this.f19817b = resources2;
        if (bVar != null) {
            i9 = bVar.f19818c;
        } else {
            i9 = 0;
        }
        int i10 = e.f19846t;
        i9 = resources != null ? resources.getDisplayMetrics().densityDpi : i9;
        i9 = i9 == 0 ? 160 : i9;
        this.f19818c = i9;
        if (bVar != null) {
            this.f19819d = bVar.f19819d;
            this.f19820e = bVar.f19820e;
            this.f19835u = true;
            this.f19836v = true;
            this.f19824i = bVar.f19824i;
            this.f19826l = bVar.f19826l;
            this.f19837w = bVar.f19837w;
            this.f19838x = bVar.f19838x;
            this.f19839y = bVar.f19839y;
            this.f19840z = bVar.f19840z;
            this.f19806A = bVar.f19806A;
            this.f19807B = bVar.f19807B;
            this.f19808C = bVar.f19808C;
            this.f19809D = bVar.f19809D;
            this.f19810E = bVar.f19810E;
            this.f19811F = bVar.f19811F;
            this.f19812G = bVar.f19812G;
            if (bVar.f19818c == i9) {
                if (bVar.j) {
                    this.f19825k = bVar.f19825k != null ? new Rect(bVar.f19825k) : null;
                    this.j = true;
                }
                if (bVar.f19827m) {
                    this.f19828n = bVar.f19828n;
                    this.f19829o = bVar.f19829o;
                    this.f19830p = bVar.f19830p;
                    this.f19831q = bVar.f19831q;
                    this.f19827m = true;
                }
            }
            if (bVar.f19832r) {
                this.f19833s = bVar.f19833s;
                this.f19832r = true;
            }
            if (bVar.f19834t) {
                this.f19834t = true;
            }
            Drawable[] drawableArr = bVar.f19822g;
            this.f19822g = new Drawable[drawableArr.length];
            this.f19823h = bVar.f19823h;
            SparseArray sparseArray = bVar.f19821f;
            if (sparseArray != null) {
                this.f19821f = sparseArray.clone();
            } else {
                this.f19821f = new SparseArray(this.f19823h);
            }
            int i11 = this.f19823h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f19821f.put(i12, constantState);
                    } else {
                        this.f19822g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.f19822g = new Drawable[10];
            this.f19823h = 0;
        }
        if (bVar != null) {
            this.f19813H = bVar.f19813H;
        } else {
            this.f19813H = new int[this.f19822g.length];
        }
        if (bVar != null) {
            this.f19814I = bVar.f19814I;
            this.f19815J = bVar.f19815J;
        } else {
            this.f19814I = new C1937g();
            this.f19815J = new C1940j(0);
        }
    }

    public final int a(Drawable drawable) {
        int i9 = this.f19823h;
        if (i9 >= this.f19822g.length) {
            int i10 = i9 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f19822g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i9);
            }
            this.f19822g = drawableArr;
            int[][] iArr = new int[i10];
            System.arraycopy(this.f19813H, 0, iArr, 0, i9);
            this.f19813H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f19816a);
        this.f19822g[i9] = drawable;
        this.f19823h++;
        this.f19820e = drawable.getChangingConfigurations() | this.f19820e;
        this.f19832r = false;
        this.f19834t = false;
        this.f19825k = null;
        this.j = false;
        this.f19827m = false;
        this.f19835u = false;
        return i9;
    }

    public final void b() {
        this.f19827m = true;
        c();
        int i9 = this.f19823h;
        Drawable[] drawableArr = this.f19822g;
        this.f19829o = -1;
        this.f19828n = -1;
        this.f19831q = 0;
        this.f19830p = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f19828n) {
                this.f19828n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f19829o) {
                this.f19829o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f19830p) {
                this.f19830p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f19831q) {
                this.f19831q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f19821f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i9 = 0; i9 < size; i9++) {
                int keyAt = this.f19821f.keyAt(i9);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f19821f.valueAt(i9);
                Drawable[] drawableArr = this.f19822g;
                Drawable newDrawable = constantState.newDrawable(this.f19817b);
                newDrawable.setLayoutDirection(this.f19838x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f19816a);
                drawableArr[keyAt] = mutate;
            }
            this.f19821f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i9 = this.f19823h;
        Drawable[] drawableArr = this.f19822g;
        for (int i10 = 0; i10 < i9; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                if (drawable.canApplyTheme()) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f19821f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i9) {
        int indexOfKey;
        Drawable drawable = this.f19822g[i9];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f19821f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i9)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f19821f.valueAt(indexOfKey)).newDrawable(this.f19817b);
        newDrawable.setLayoutDirection(this.f19838x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f19816a);
        this.f19822g[i9] = mutate;
        this.f19821f.removeAt(indexOfKey);
        if (this.f19821f.size() == 0) {
            this.f19821f = null;
        }
        return mutate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final int e(int i9) {
        ?? r5;
        if (i9 < 0) {
            return 0;
        }
        C1940j c1940j = this.f19815J;
        int i10 = 0;
        int a5 = AbstractC1964a.a(c1940j.f22664d, i9, c1940j.f22662b);
        if (a5 >= 0 && (r5 = c1940j.f22663c[a5]) != AbstractC1938h.f22657b) {
            i10 = r5;
        }
        return i10.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.f19813H;
        int i9 = this.f19823h;
        for (int i10 = 0; i10 < i9; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f19819d | this.f19820e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
