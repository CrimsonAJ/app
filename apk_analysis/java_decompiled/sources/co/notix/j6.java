package co.notix;

import P.H;
import P.Q;
import Y7.B;
import a.AbstractC0485a;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import co.notix.interstitial.InterstitialButton;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class j6 extends zb {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f12519v = 0;
    public InterstitialButton j;

    /* renamed from: h, reason: collision with root package name */
    public final mg f12520h = new mg();

    /* renamed from: i, reason: collision with root package name */
    public final d f12521i = wq.i();

    /* renamed from: k, reason: collision with root package name */
    public final A7.e f12522k = Z0.a.q(new g6(this));

    /* renamed from: l, reason: collision with root package name */
    public final A7.e f12523l = Z0.a.q(new w5(this));

    /* renamed from: m, reason: collision with root package name */
    public final A7.e f12524m = Z0.a.q(new c6(this));

    /* renamed from: n, reason: collision with root package name */
    public final A7.e f12525n = Z0.a.q(new i6(this));

    /* renamed from: o, reason: collision with root package name */
    public final A7.e f12526o = Z0.a.q(new h6(this));

    /* renamed from: p, reason: collision with root package name */
    public final A7.e f12527p = Z0.a.q(new d6(this));

    /* renamed from: q, reason: collision with root package name */
    public final A7.e f12528q = Z0.a.q(new e6(this));

    /* renamed from: r, reason: collision with root package name */
    public final A7.e f12529r = Z0.a.q(new f6(this));

    /* renamed from: s, reason: collision with root package name */
    public final A7.e f12530s = Z0.a.q(new y5(this));

    /* renamed from: t, reason: collision with root package name */
    public final A7.e f12531t = Z0.a.q(new x5(this));

    /* renamed from: u, reason: collision with root package name */
    public final A7.e f12532u = Z0.a.q(new z5(this));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.renderscript.BaseObj, android.renderscript.ScriptIntrinsicBlur] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(co.notix.j6 r8, android.graphics.Bitmap r9) {
        /*
            A7.e r0 = r8.f12523l
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "<get-background>(...)"
            kotlin.jvm.internal.h.d(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 3
            r1.<init>(r2)
            int r2 = r9.getWidth()
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r3
            int r2 = (int) r2
            int r4 = r9.getHeight()
            float r4 = (float) r4
            float r4 = r4 / r3
            int r4 = (int) r4
            android.graphics.Bitmap$Config r5 = r9.getConfig()
            if (r5 != 0) goto L2b
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L2b:
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r4, r5)
            java.lang.String r4 = "createBitmap(scaledWidth… Bitmap.Config.ARGB_8888)"
            kotlin.jvm.internal.h.d(r2, r4)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r2)
            r5 = 1
            float r6 = (float) r5
            float r6 = r6 / r3
            r4.scale(r6, r6)
            r3 = 0
            r4.drawBitmap(r9, r3, r3, r1)
            r9 = 0
            android.renderscript.RenderScript r8 = android.renderscript.RenderScript.create(r8)     // Catch: java.lang.Throwable -> L8c
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: java.lang.Throwable -> L88
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r8, r2, r1, r5)     // Catch: java.lang.Throwable -> L88
            android.renderscript.Type r3 = r1.getType()     // Catch: java.lang.Throwable -> L83
            android.renderscript.Allocation r3 = android.renderscript.Allocation.createTyped(r8, r3)     // Catch: java.lang.Throwable -> L83
            android.renderscript.Element r4 = android.renderscript.Element.U8_4(r8)     // Catch: java.lang.Throwable -> L7e
            android.renderscript.ScriptIntrinsicBlur r9 = android.renderscript.ScriptIntrinsicBlur.create(r8, r4)     // Catch: java.lang.Throwable -> L7e
            r4 = 1092616192(0x41200000, float:10.0)
            r9.setRadius(r4)     // Catch: java.lang.Throwable -> L7e
            r9.setInput(r1)     // Catch: java.lang.Throwable -> L7e
            r9.forEach(r3)     // Catch: java.lang.Throwable -> L7e
            r3.copyTo(r2)     // Catch: java.lang.Throwable -> L7e
            if (r8 == 0) goto L71
            r8.destroy()
        L71:
            r1.destroy()
            r3.destroy()
            r9.destroy()
            r0.setImageBitmap(r2)
            return
        L7e:
            r0 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L90
        L83:
            r0 = move-exception
            r3 = r9
        L85:
            r9 = r8
            r8 = r3
            goto L90
        L88:
            r0 = move-exception
            r1 = r9
            r3 = r1
            goto L85
        L8c:
            r0 = move-exception
            r8 = r9
            r1 = r8
            r3 = r1
        L90:
            if (r9 == 0) goto L95
            r9.destroy()
        L95:
            if (r1 == 0) goto L9a
            r1.destroy()
        L9a:
            if (r3 == 0) goto L9f
            r3.destroy()
        L9f:
            if (r8 == 0) goto La4
            r8.destroy()
        La4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.j6.a(co.notix.j6, android.graphics.Bitmap):void");
    }

    public final View.OnClickListener b(String str) {
        return new I5.k(this, 12, str);
    }

    @Override // co.notix.zb
    public final void e() {
        setContentView(R.layout.notix_activity_interstitial);
    }

    @Override // co.notix.zb
    public final void f() {
        if (getResources().getDisplayMetrics().heightPixels > getResources().getDisplayMetrics().widthPixels) {
            Object value = this.f12526o.getValue();
            kotlin.jvm.internal.h.d(value, "<get-spacer>(...)");
            Object value2 = this.f12526o.getValue();
            kotlin.jvm.internal.h.d(value2, "<get-spacer>(...)");
            ViewGroup.LayoutParams layoutParams = ((View) value2).getLayoutParams();
            kotlin.jvm.internal.h.c(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = 4.0f;
            ((View) value).setLayoutParams(layoutParams2);
            Object value3 = this.f12527p.getValue();
            kotlin.jvm.internal.h.d(value3, "<get-descAndButtonContainer>(...)");
            ((LinearLayout) value3).setOrientation(1);
            Object value4 = this.f12528q.getValue();
            kotlin.jvm.internal.h.d(value4, "<get-descriptionContainer>(...)");
            Object value5 = this.f12528q.getValue();
            kotlin.jvm.internal.h.d(value5, "<get-descriptionContainer>(...)");
            ViewGroup.LayoutParams layoutParams3 = ((FrameLayout) value5).getLayoutParams();
            kotlin.jvm.internal.h.c(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            layoutParams4.width = -1;
            layoutParams4.height = 0;
            layoutParams4.weight = 1.0f;
            ((FrameLayout) value4).setLayoutParams(layoutParams4);
            Object value6 = this.f12530s.getValue();
            kotlin.jvm.internal.h.d(value6, "<get-buttonContainer>(...)");
            Object value7 = this.f12530s.getValue();
            kotlin.jvm.internal.h.d(value7, "<get-buttonContainer>(...)");
            ViewGroup.LayoutParams layoutParams5 = ((FrameLayout) value7).getLayoutParams();
            kotlin.jvm.internal.h.c(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
            layoutParams6.width = -1;
            layoutParams6.height = 0;
            ((FrameLayout) value6).setLayoutParams(layoutParams6);
            return;
        }
        Object value8 = this.f12526o.getValue();
        kotlin.jvm.internal.h.d(value8, "<get-spacer>(...)");
        Object value9 = this.f12526o.getValue();
        kotlin.jvm.internal.h.d(value9, "<get-spacer>(...)");
        ViewGroup.LayoutParams layoutParams7 = ((View) value9).getLayoutParams();
        kotlin.jvm.internal.h.c(layoutParams7, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
        layoutParams8.weight = 2.0f;
        ((View) value8).setLayoutParams(layoutParams8);
        Object value10 = this.f12527p.getValue();
        kotlin.jvm.internal.h.d(value10, "<get-descAndButtonContainer>(...)");
        ((LinearLayout) value10).setOrientation(0);
        Object value11 = this.f12528q.getValue();
        kotlin.jvm.internal.h.d(value11, "<get-descriptionContainer>(...)");
        Object value12 = this.f12528q.getValue();
        kotlin.jvm.internal.h.d(value12, "<get-descriptionContainer>(...)");
        ViewGroup.LayoutParams layoutParams9 = ((FrameLayout) value12).getLayoutParams();
        kotlin.jvm.internal.h.c(layoutParams9, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) layoutParams9;
        layoutParams10.width = 0;
        layoutParams10.height = -1;
        layoutParams10.weight = 2.0f;
        ((FrameLayout) value11).setLayoutParams(layoutParams10);
        Object value13 = this.f12530s.getValue();
        kotlin.jvm.internal.h.d(value13, "<get-buttonContainer>(...)");
        Object value14 = this.f12530s.getValue();
        kotlin.jvm.internal.h.d(value14, "<get-buttonContainer>(...)");
        ViewGroup.LayoutParams layoutParams11 = ((FrameLayout) value14).getLayoutParams();
        kotlin.jvm.internal.h.c(layoutParams11, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams12 = (LinearLayout.LayoutParams) layoutParams11;
        layoutParams12.width = 0;
        layoutParams12.height = -1;
        ((FrameLayout) value13).setLayoutParams(layoutParams12);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        String stringExtra = getIntent().getStringExtra("start_id");
        if (stringExtra != null) {
            d dVar = this.f12521i;
            dVar.getClass();
        }
        this.f12520h.a(this.f13659f);
    }

    @Override // co.notix.zb
    public final View b() {
        Object value = this.f12532u.getValue();
        kotlin.jvm.internal.h.d(value, "<get-closeButton>(...)");
        return (View) value;
    }

    public static final void a(j6 j6Var, i iVar, A7.h hVar) {
        j6Var.getClass();
        int intValue = ((Number) hVar.f547a).intValue();
        Object value = j6Var.f12525n.getValue();
        kotlin.jvm.internal.h.d(value, "<get-titleText>(...)");
        Number number = (Number) hVar.f548b;
        int intValue2 = number.intValue();
        float a5 = h9.a(8);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(intValue2);
        gradientDrawable.setCornerRadius(a5);
        ((TextView) value).setBackground(gradientDrawable);
        Object value2 = j6Var.f12529r.getValue();
        kotlin.jvm.internal.h.d(value2, "<get-descriptionText>(...)");
        int intValue3 = number.intValue();
        float a9 = h9.a(8);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(intValue3);
        gradientDrawable2.setCornerRadius(a9);
        ((TextView) value2).setBackground(gradientDrawable2);
        Object value3 = j6Var.f12525n.getValue();
        kotlin.jvm.internal.h.d(value3, "<get-titleText>(...)");
        ((TextView) value3).setTextColor(intValue);
        Object value4 = j6Var.f12529r.getValue();
        kotlin.jvm.internal.h.d(value4, "<get-descriptionText>(...)");
        ((TextView) value4).setTextColor(intValue);
        Object value5 = j6Var.f12525n.getValue();
        kotlin.jvm.internal.h.d(value5, "<get-titleText>(...)");
        ((TextView) value5).setText(iVar.f12416a);
        Object value6 = j6Var.f12529r.getValue();
        kotlin.jvm.internal.h.d(value6, "<get-descriptionText>(...)");
        ((TextView) value6).setText(iVar.f12417b);
    }

    public static final void a(j6 j6Var, InterstitialButton interstitialButton, A7.h hVar) {
        j6Var.getClass();
        if (interstitialButton == null) {
            return;
        }
        int intValue = ((Number) hVar.f547a).intValue();
        int intValue2 = ((Number) hVar.f548b).intValue();
        float a5 = h9.a(16);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(intValue2);
        gradientDrawable.setCornerRadius(a5);
        Object value = j6Var.f12531t.getValue();
        kotlin.jvm.internal.h.d(value, "<get-button>(...)");
        TextView textView = (TextView) value;
        textView.setVisibility(0);
        textView.setText(interstitialButton.getText());
        textView.setBackground(gradientDrawable);
        textView.setTextColor(intValue);
    }

    public static final void a(j6 this$0, String url, View view) {
        Object obj;
        kotlin.jvm.internal.h.e(this$0, "this$0");
        kotlin.jvm.internal.h.e(url, "$url");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            this$0.startActivity(intent);
            obj = intent;
        } catch (Throwable th) {
            obj = AbstractC0485a.h(th);
        }
        Throwable a5 = A7.j.a(obj);
        if (a5 == null) {
            md.f12779a.b("successfully started activity with url: ".concat(url));
        } else {
            kd kdVar = md.f12779a;
            StringBuilder r5 = AbstractC0953k1.r("couldn't start activity with url=", url, ", error=");
            r5.append(a5.getMessage());
            kdVar.a(r5.toString(), a5);
        }
        if (this$0.f13657d) {
            this$0.a(p8.CLICK);
        }
        this$0.f12520h.a(this$0.f13658e);
    }

    @Override // co.notix.zb
    public final void a() {
        B.r(this.f13655b, null, new a6(this, null), 3);
    }

    @Override // co.notix.zb
    public final void a(View view) {
        kotlin.jvm.internal.h.e(view, "view");
        C3.v vVar = new C3.v(17, this);
        WeakHashMap weakHashMap = Q.f5546a;
        H.l(view, vVar);
    }

    public static final P.u0 a(j6 this$0, View view, P.u0 u0Var) {
        kotlin.jvm.internal.h.e(this$0, "this$0");
        H.c f9 = u0Var.f5645a.f(519);
        kotlin.jvm.internal.h.d(f9, "insets.getInsets(WindowI…Compat.Type.systemBars())");
        View b9 = this$0.b();
        ViewGroup.LayoutParams layoutParams = this$0.b().getLayoutParams();
        kotlin.jvm.internal.h.c(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int a5 = (int) h9.a(12);
        int i9 = f9.f2915b;
        layoutParams2.topMargin = a5 + i9;
        int a9 = (int) h9.a(12);
        int i10 = f9.f2914a;
        layoutParams2.leftMargin = a9 + i10;
        int a10 = (int) h9.a(12);
        int i11 = f9.f2916c;
        layoutParams2.rightMargin = a10 + i11;
        b9.setLayoutParams(layoutParams2);
        Object value = this$0.f12524m.getValue();
        kotlin.jvm.internal.h.d(value, "<get-contentContainer>(...)");
        Object value2 = this$0.f12524m.getValue();
        kotlin.jvm.internal.h.d(value2, "<get-contentContainer>(...)");
        ViewGroup.LayoutParams layoutParams3 = ((LinearLayout) value2).getLayoutParams();
        kotlin.jvm.internal.h.c(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.leftMargin = i10;
        layoutParams4.topMargin = i9;
        layoutParams4.rightMargin = i11;
        layoutParams4.bottomMargin = f9.f2917d;
        ((LinearLayout) value).setLayoutParams(layoutParams4);
        return P.u0.f5644b;
    }
}
