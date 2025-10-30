package i;

import L1.C0219a;
import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import i0.AbstractActivityC1369y;
import java.util.Objects;
import n.C1597c;
import p.C1780Y0;
import p.C1821t;
import p.d1;

/* renamed from: i.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1322h extends AbstractActivityC1369y implements InterfaceC1323i {

    /* renamed from: y, reason: collision with root package name */
    public w f18072y;

    public AbstractActivityC1322h() {
        ((N0.f) this.f16589e.f15188c).f("androidx:appcompat", new N0.a(this));
        J(new C0219a(this, 2));
    }

    public final l R() {
        if (this.f18072y == null) {
            G0.I i9 = l.f18073a;
            this.f18072y = new w(this, null, this, this);
        }
        return this.f18072y;
    }

    @Override // d.AbstractActivityC1071l, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        O();
        w wVar = (w) R();
        wVar.v();
        ((ViewGroup) wVar.f18114A.findViewById(R.id.content)).addView(view, layoutParams);
        wVar.f18134m.a(wVar.f18132l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        w wVar = (w) R();
        wVar.f18135m0 = true;
        int i17 = wVar.f18143q0;
        if (i17 == -100) {
            i17 = l.f18074b;
        }
        int C8 = wVar.C(context, i17);
        if (l.b(context) && l.b(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!l.f18078f) {
                    l.f18073a.execute(new D0.e(context, 2));
                }
            } else {
                synchronized (l.f18081i) {
                    try {
                        L.g gVar = l.f18075c;
                        if (gVar == null) {
                            if (l.f18076d == null) {
                                l.f18076d = L.g.b(D.c.e(context));
                            }
                            if (!l.f18076d.f4447a.isEmpty()) {
                                l.f18075c = l.f18076d;
                            }
                        } else if (!gVar.equals(l.f18076d)) {
                            L.g gVar2 = l.f18075c;
                            l.f18076d = gVar2;
                            D.c.d(context, gVar2.f4447a.a());
                        }
                    } finally {
                    }
                }
            }
        }
        L.g n7 = w.n(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(w.r(context, C8, n7, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C1597c) {
            try {
                ((C1597c) context).a(w.r(context, C8, n7, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (w.f18113H0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f9 = configuration3.fontScale;
                    float f10 = configuration4.fontScale;
                    if (f9 != f10) {
                        configuration.fontScale = f10;
                    }
                    int i18 = configuration3.mcc;
                    int i19 = configuration4.mcc;
                    if (i18 != i19) {
                        configuration.mcc = i19;
                    }
                    int i20 = configuration3.mnc;
                    int i21 = configuration4.mnc;
                    if (i20 != i21) {
                        configuration.mnc = i21;
                    }
                    int i22 = Build.VERSION.SDK_INT;
                    if (i22 >= 24) {
                        q.a(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i23 = configuration3.touchscreen;
                    int i24 = configuration4.touchscreen;
                    if (i23 != i24) {
                        configuration.touchscreen = i24;
                    }
                    int i25 = configuration3.keyboard;
                    int i26 = configuration4.keyboard;
                    if (i25 != i26) {
                        configuration.keyboard = i26;
                    }
                    int i27 = configuration3.keyboardHidden;
                    int i28 = configuration4.keyboardHidden;
                    if (i27 != i28) {
                        configuration.keyboardHidden = i28;
                    }
                    int i29 = configuration3.navigation;
                    int i30 = configuration4.navigation;
                    if (i29 != i30) {
                        configuration.navigation = i30;
                    }
                    int i31 = configuration3.navigationHidden;
                    int i32 = configuration4.navigationHidden;
                    if (i31 != i32) {
                        configuration.navigationHidden = i32;
                    }
                    int i33 = configuration3.orientation;
                    int i34 = configuration4.orientation;
                    if (i33 != i34) {
                        configuration.orientation = i34;
                    }
                    int i35 = configuration3.screenLayout & 15;
                    int i36 = configuration4.screenLayout & 15;
                    if (i35 != i36) {
                        configuration.screenLayout |= i36;
                    }
                    int i37 = configuration3.screenLayout & 192;
                    int i38 = configuration4.screenLayout & 192;
                    if (i37 != i38) {
                        configuration.screenLayout |= i38;
                    }
                    int i39 = configuration3.screenLayout & 48;
                    int i40 = configuration4.screenLayout & 48;
                    if (i39 != i40) {
                        configuration.screenLayout |= i40;
                    }
                    int i41 = configuration3.screenLayout & 768;
                    int i42 = configuration4.screenLayout & 768;
                    if (i41 != i42) {
                        configuration.screenLayout |= i42;
                    }
                    if (i22 >= 26) {
                        i9 = configuration3.colorMode;
                        int i43 = i9 & 3;
                        i10 = configuration4.colorMode;
                        if (i43 != (i10 & 3)) {
                            i15 = configuration.colorMode;
                            i16 = configuration4.colorMode;
                            configuration.colorMode = i15 | (i16 & 3);
                        }
                        i11 = configuration3.colorMode;
                        int i44 = i11 & 12;
                        i12 = configuration4.colorMode;
                        if (i44 != (i12 & 12)) {
                            i13 = configuration.colorMode;
                            i14 = configuration4.colorMode;
                            configuration.colorMode = i13 | (i14 & 12);
                        }
                    }
                    int i45 = configuration3.uiMode & 15;
                    int i46 = configuration4.uiMode & 15;
                    if (i45 != i46) {
                        configuration.uiMode |= i46;
                    }
                    int i47 = configuration3.uiMode & 48;
                    int i48 = configuration4.uiMode & 48;
                    if (i47 != i48) {
                        configuration.uiMode |= i48;
                    }
                    int i49 = configuration3.screenWidthDp;
                    int i50 = configuration4.screenWidthDp;
                    if (i49 != i50) {
                        configuration.screenWidthDp = i50;
                    }
                    int i51 = configuration3.screenHeightDp;
                    int i52 = configuration4.screenHeightDp;
                    if (i51 != i52) {
                        configuration.screenHeightDp = i52;
                    }
                    int i53 = configuration3.smallestScreenWidthDp;
                    int i54 = configuration4.smallestScreenWidthDp;
                    if (i53 != i54) {
                        configuration.smallestScreenWidthDp = i54;
                    }
                    int i55 = configuration3.densityDpi;
                    int i56 = configuration4.densityDpi;
                    if (i55 != i56) {
                        configuration.densityDpi = i56;
                    }
                }
            }
            Configuration r5 = w.r(context, C8, n7, configuration, true);
            C1597c c1597c = new C1597c(context, co.notix.R.style.Theme_AppCompat_Empty);
            c1597c.a(r5);
            try {
                if (context.getTheme() != null) {
                    G.b.l(c1597c.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = c1597c;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((w) R()).A();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // D.e, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((w) R()).A();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i9) {
        w wVar = (w) R();
        wVar.v();
        return wVar.f18132l.findViewById(i9);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        w wVar = (w) R();
        if (wVar.f18140p == null) {
            wVar.A();
            I i9 = wVar.f18138o;
            if (i9 != null) {
                context = i9.D();
            } else {
                context = wVar.f18130k;
            }
            wVar.f18140p = new n.h(context);
        }
        return wVar.f18140p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i9 = d1.f21983a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        w wVar = (w) R();
        if (wVar.f18138o != null) {
            wVar.A();
            wVar.f18138o.getClass();
            wVar.B(0);
        }
    }

    @Override // d.AbstractActivityC1071l, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w wVar = (w) R();
        if (wVar.Y && wVar.f18159z) {
            wVar.A();
            I i9 = wVar.f18138o;
            if (i9 != null) {
                i9.G(i9.f18002g.getResources().getBoolean(co.notix.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C1821t a5 = C1821t.a();
        Context context = wVar.f18130k;
        synchronized (a5) {
            a5.f22079a.l(context);
        }
        wVar.f18141p0 = new Configuration(wVar.f18130k.getResources().getConfiguration());
        wVar.k(false, false);
    }

    @Override // i0.AbstractActivityC1369y, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        R().d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // i0.AbstractActivityC1369y, d.AbstractActivityC1071l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i9, MenuItem menuItem) {
        Intent b9;
        if (!super.onMenuItemSelected(i9, menuItem)) {
            w wVar = (w) R();
            wVar.A();
            I i10 = wVar.f18138o;
            if (menuItem.getItemId() == 16908332 && i10 != null && (((C1780Y0) i10.f18005k).f21929b & 4) != 0 && (b9 = D.c.b(this)) != null) {
                if (shouldUpRecreateTask(b9)) {
                    D.z zVar = new D.z(this);
                    Intent b10 = D.c.b(this);
                    if (b10 == null) {
                        b10 = D.c.b(this);
                    }
                    if (b10 != null) {
                        ComponentName component = b10.getComponent();
                        if (component == null) {
                            component = b10.resolveActivity(zVar.f1732b.getPackageManager());
                        }
                        zVar.b(component);
                        zVar.f1731a.add(b10);
                    }
                    zVar.c();
                    try {
                        finishAffinity();
                    } catch (IllegalStateException unused) {
                        finish();
                    }
                } else {
                    navigateUpTo(b9);
                    return true;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((w) R()).v();
    }

    @Override // i0.AbstractActivityC1369y, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        w wVar = (w) R();
        wVar.A();
        I i9 = wVar.f18138o;
        if (i9 != null) {
            i9.f18020z = true;
        }
    }

    @Override // i0.AbstractActivityC1369y, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((w) R()).k(true, false);
    }

    @Override // i0.AbstractActivityC1369y, android.app.Activity
    public final void onStop() {
        super.onStop();
        w wVar = (w) R();
        wVar.A();
        I i9 = wVar.f18138o;
        if (i9 != null) {
            i9.f18020z = false;
            n.j jVar = i9.f18019y;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i9) {
        super.onTitleChanged(charSequence, i9);
        R().j(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((w) R()).A();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // d.AbstractActivityC1071l, android.app.Activity
    public final void setContentView(int i9) {
        O();
        R().g(i9);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i9) {
        super.setTheme(i9);
        ((w) R()).r0 = i9;
    }

    @Override // d.AbstractActivityC1071l, android.app.Activity
    public void setContentView(View view) {
        O();
        R().h(view);
    }

    @Override // d.AbstractActivityC1071l, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        O();
        R().i(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
