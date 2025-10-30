package n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import co.notix.R;

/* renamed from: n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1597c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f20939f;

    /* renamed from: a, reason: collision with root package name */
    public int f20940a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f20941b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f20942c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f20943d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f20944e;

    public C1597c(Context context, int i9) {
        super(context);
        this.f20940a = i9;
    }

    public final void a(Configuration configuration) {
        if (this.f20944e == null) {
            if (this.f20943d == null) {
                this.f20943d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f20941b == null) {
            this.f20941b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f20941b.setTo(theme);
            }
        }
        this.f20941b.applyStyle(this.f20940a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(n.C1597c.f20939f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f20944e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f20943d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = n.C1597c.f20939f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            n.C1597c.f20939f = r1
        L1c:
            android.content.res.Configuration r1 = n.C1597c.f20939f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f20943d
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f20944e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f20944e = r0
        L38:
            android.content.res.Resources r0 = r3.f20944e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C1597c.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f20942c == null) {
                this.f20942c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f20942c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f20941b;
        if (theme != null) {
            return theme;
        }
        if (this.f20940a == 0) {
            this.f20940a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f20941b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i9) {
        if (this.f20940a != i9) {
            this.f20940a = i9;
            b();
        }
    }
}
