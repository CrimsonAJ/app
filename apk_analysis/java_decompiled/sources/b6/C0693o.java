package b6;

import A3.E;
import C3.v;
import N3.A;
import P5.F;
import Y7.B;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import c5.C0777a;
import co.notix.R;
import com.anilab.data.model.response.LoginResponse;
import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import f5.C1185q;
import h6.X;
import h6.r0;
import i8.G;
import i8.InterfaceC1412b;
import i8.L;
import i8.O;
import j3.C0;
import j3.C1441D;
import j3.E0;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import l4.y;
import p.AbstractC1761O0;
import p.C1749I0;
import p.C1821t;
import y2.C2203a;

/* renamed from: b6.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693o implements InterfaceC1412b {

    /* renamed from: a, reason: collision with root package name */
    public Object f11382a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11383b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11384c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11385d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11386e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11387f;

    public C0693o(Set set, String str, String str2) {
        Set unmodifiableSet;
        C0777a c0777a = C0777a.f11659a;
        if (set == null) {
            unmodifiableSet = Collections.EMPTY_SET;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.f11383b = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f11382a = str;
        this.f11385d = str2;
        this.f11386e = c0777a;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.f11384c = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw A0.a.h(it);
    }

    public static final void b(C0693o c0693o, String str, String str2) {
        C2203a c2203a = (C2203a) c0693o.f11384c;
        LoginResponse z9 = O4.h.z(c2203a);
        if (z9 != null) {
            z9.f14201b.f14358a.f14362a = str;
        }
        if (z9 != null) {
            z9.f14201b.f14359b.f14362a = str2;
        }
        String o02 = g6.o.f17761a.o0();
        SharedPreferences.Editor edit = c2203a.f24771a.edit();
        edit.putString(o02, c2203a.f24772b.a(LoginResponse.class).d(z9));
        edit.apply();
    }

    public static boolean d(int[] iArr, int i9) {
        for (int i10 : iArr) {
            if (i10 == i9) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b6.o, java.lang.Object] */
    public static C0693o e(String str, AbstractC1037h abstractC1037h, X x5, r0 r0Var, Integer num) {
        if (r0Var == r0.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        ?? obj = new Object();
        obj.f11382a = str;
        obj.f11383b = AbstractC0698t.b(str);
        obj.f11384c = abstractC1037h;
        obj.f11385d = x5;
        obj.f11386e = r0Var;
        obj.f11387f = num;
        return obj;
    }

    public static ColorStateList f(Context context, int i9) {
        int c3 = AbstractC1761O0.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{AbstractC1761O0.f21896b, AbstractC1761O0.f21898d, AbstractC1761O0.f21897c, AbstractC1761O0.f21900f}, new int[]{AbstractC1761O0.b(context, R.attr.colorButtonNormal), H.a.f(c3, i9), H.a.f(c3, i9), i9});
    }

    public static A h(C1441D c1441d, F f9, A a5, C0 c02) {
        Object l9;
        int i9;
        E0 I4 = c1441d.I();
        int t7 = c1441d.t();
        if (I4.p()) {
            l9 = null;
        } else {
            l9 = I4.l(t7);
        }
        if (!c1441d.g() && !I4.p()) {
            i9 = I4.f(t7, c02, false).b(y.H(c1441d.T()) - c02.f19239e);
        } else {
            i9 = -1;
        }
        int i10 = i9;
        for (int i11 = 0; i11 < f9.size(); i11++) {
            A a9 = (A) f9.get(i11);
            if (k(a9, l9, c1441d.g(), c1441d.r0(), c1441d.s0(), i10)) {
                return a9;
            }
        }
        if (!f9.isEmpty() || a5 == null || !k(a5, l9, c1441d.g(), c1441d.r0(), c1441d.s0(), i10)) {
            return null;
        }
        return a5;
    }

    public static LayerDrawable i(C1749I0 c1749i0, Context context, int i9) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i9);
        Drawable f9 = c1749i0.f(context, R.drawable.abc_star_black_48dp);
        Drawable f10 = c1749i0.f(context, R.drawable.abc_star_half_black_48dp);
        if ((f9 instanceof BitmapDrawable) && f9.getIntrinsicWidth() == dimensionPixelSize && f9.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) f9;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f9.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f9.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((f10 instanceof BitmapDrawable) && f10.getIntrinsicWidth() == dimensionPixelSize && f10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) f10;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            f10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f10.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean k(A a5, Object obj, boolean z9, int i9, int i10, int i11) {
        if (!a5.f5207a.equals(obj)) {
            return false;
        }
        int i12 = a5.f5208b;
        if (!z9 || i12 != i9 || a5.f5209c != i10) {
            if (z9 || i12 != -1 || a5.f5211e != i11) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void m(Drawable drawable, int i9, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C1821t.f22077b;
        }
        mutate.setColorFilter(C1821t.c(i9, mode));
    }

    @Override // i8.InterfaceC1412b
    public G a(O o9, L response) {
        kotlin.jvm.internal.h.e(response, "response");
        return (G) B.v(E7.j.f1978a, new B2.j((g8.d) this.f11385d, null, response, this));
    }

    public void c(E e8, A a5, E0 e02) {
        if (a5 != null) {
            if (e02.b(a5.f5207a) != -1) {
                e8.n(a5, e02);
                return;
            }
            E0 e03 = (E0) ((P5.X) this.f11384c).get(a5);
            if (e03 != null) {
                e8.n(a5, e03);
            }
        }
    }

    public C1185q g(C1185q c1185q) {
        return c1185q.l(new C0.e(0), new v(19, this));
    }

    public ColorStateList j(Context context, int i9) {
        if (i9 == R.drawable.abc_edit_text_material) {
            return E.d.c(context, R.color.abc_tint_edittext);
        }
        if (i9 == R.drawable.abc_switch_track_mtrl_alpha) {
            return E.d.c(context, R.color.abc_tint_switch_track);
        }
        if (i9 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d9 = AbstractC1761O0.d(context, R.attr.colorSwitchThumbNormal);
            if (d9 != null && d9.isStateful()) {
                int[] iArr3 = AbstractC1761O0.f21896b;
                iArr[0] = iArr3;
                iArr2[0] = d9.getColorForState(iArr3, 0);
                iArr[1] = AbstractC1761O0.f21899e;
                iArr2[1] = AbstractC1761O0.c(context, R.attr.colorControlActivated);
                iArr[2] = AbstractC1761O0.f21900f;
                iArr2[2] = d9.getDefaultColor();
            } else {
                iArr[0] = AbstractC1761O0.f21896b;
                iArr2[0] = AbstractC1761O0.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = AbstractC1761O0.f21899e;
                iArr2[1] = AbstractC1761O0.c(context, R.attr.colorControlActivated);
                iArr[2] = AbstractC1761O0.f21900f;
                iArr2[2] = AbstractC1761O0.c(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i9 == R.drawable.abc_btn_default_mtrl_shape) {
            return f(context, AbstractC1761O0.c(context, R.attr.colorButtonNormal));
        }
        if (i9 == R.drawable.abc_btn_borderless_material) {
            return f(context, 0);
        }
        if (i9 == R.drawable.abc_btn_colored_material) {
            return f(context, AbstractC1761O0.c(context, R.attr.colorAccent));
        }
        if (i9 != R.drawable.abc_spinner_mtrl_am_alpha && i9 != R.drawable.abc_spinner_textfield_background_material) {
            if (d((int[]) this.f11383b, i9)) {
                return AbstractC1761O0.d(context, R.attr.colorControlNormal);
            }
            if (d((int[]) this.f11386e, i9)) {
                return E.d.c(context, R.color.abc_tint_default);
            }
            if (d((int[]) this.f11387f, i9)) {
                return E.d.c(context, R.color.abc_tint_btn_checkable);
            }
            if (i9 == R.drawable.abc_seekbar_thumb_material) {
                return E.d.c(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        return E.d.c(context, R.color.abc_tint_spinner);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.C0693o.l(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public C1185q n(String str, String str2, Bundle bundle) {
        int i9;
        try {
            l(str, str2, bundle);
            A4.b bVar = (A4.b) this.f11384c;
            A4.r rVar = bVar.f336c;
            int J8 = rVar.J();
            A4.i iVar = A4.i.f351c;
            if (J8 < 12000000) {
                if (rVar.K() != 0) {
                    return bVar.a(bundle).e(iVar, new A1.g(bVar, 4, bundle));
                }
                return s8.n.o(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            A4.q b9 = A4.q.b(bVar.f335b);
            synchronized (b9) {
                i9 = b9.f378a;
                b9.f378a = i9 + 1;
            }
            return b9.c(new A4.o(i9, 1, bundle, 1)).l(iVar, A4.d.f342b);
        } catch (InterruptedException | ExecutionException e8) {
            return s8.n.o(e8);
        }
    }

    public void o(E0 e02) {
        E e8 = new E(4, 6);
        if (((F) this.f11383b).isEmpty()) {
            c(e8, (A) this.f11386e, e02);
            if (!M4.a.l((A) this.f11387f, (A) this.f11386e)) {
                c(e8, (A) this.f11387f, e02);
            }
            if (!M4.a.l((A) this.f11385d, (A) this.f11386e) && !M4.a.l((A) this.f11385d, (A) this.f11387f)) {
                c(e8, (A) this.f11385d, e02);
            }
        } else {
            for (int i9 = 0; i9 < ((F) this.f11383b).size(); i9++) {
                c(e8, (A) ((F) this.f11383b).get(i9), e02);
            }
            if (!((F) this.f11383b).contains((A) this.f11385d)) {
                c(e8, (A) this.f11385d, e02);
            }
        }
        this.f11384c = e8.d();
    }
}
