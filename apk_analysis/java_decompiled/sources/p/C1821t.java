package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import co.notix.R;
import i8.C1425o;

/* renamed from: p.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1821t {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f22077b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C1821t f22078c;

    /* renamed from: a, reason: collision with root package name */
    public C1749I0 f22079a;

    public static synchronized C1821t a() {
        C1821t c1821t;
        synchronized (C1821t.class) {
            try {
                if (f22078c == null) {
                    d();
                }
                c1821t = f22078c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1821t;
    }

    public static synchronized PorterDuffColorFilter c(int i9, PorterDuff.Mode mode) {
        PorterDuffColorFilter h7;
        synchronized (C1821t.class) {
            h7 = C1749I0.h(i9, mode);
        }
        return h7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [p.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [b6.o, java.lang.Object] */
    public static synchronized void d() {
        synchronized (C1821t.class) {
            if (f22078c == null) {
                ?? obj = new Object();
                f22078c = obj;
                obj.f22079a = C1749I0.d();
                C1749I0 c1749i0 = f22078c.f22079a;
                ?? obj2 = new Object();
                obj2.f11382a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                obj2.f11383b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                obj2.f11384c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                obj2.f11385d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                obj2.f11386e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                obj2.f11387f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                c1749i0.m(obj2);
            }
        }
    }

    public static void e(Drawable drawable, C1425o c1425o, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = C1749I0.f21822h;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z9 = c1425o.f19127b;
            if (!z9 && !c1425o.f19126a) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z9) {
                    colorStateList = (ColorStateList) c1425o.f19128c;
                } else {
                    colorStateList = null;
                }
                if (c1425o.f19126a) {
                    mode = (PorterDuff.Mode) c1425o.f19129d;
                } else {
                    mode = C1749I0.f21822h;
                }
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilter = C1749I0.h(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable b(Context context, int i9) {
        return this.f22079a.f(context, i9);
    }
}
