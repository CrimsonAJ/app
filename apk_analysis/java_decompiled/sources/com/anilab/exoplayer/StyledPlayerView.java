package com.anilab.exoplayer;

import D.n;
import P.C0320v;
import P1.q;
import P5.F;
import Q2.AbstractC0365h;
import Q2.C;
import Q2.D;
import Q2.I;
import Q2.InterfaceC0358a;
import Q2.J;
import Q2.K;
import Q2.L;
import Q2.M;
import Q2.r;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import co.notix.R;
import j3.r0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l4.AbstractC1566a;
import l4.e;
import l4.y;
import m4.m;
import m4.v;
import n4.k;

/* loaded from: classes.dex */
public class StyledPlayerView extends FrameLayout {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f14447D = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f14448A;

    /* renamed from: B, reason: collision with root package name */
    public int f14449B;

    /* renamed from: C, reason: collision with root package name */
    public final GestureDetector f14450C;

    /* renamed from: a, reason: collision with root package name */
    public final K f14451a;

    /* renamed from: b, reason: collision with root package name */
    public final AspectRatioFrameLayout f14452b;

    /* renamed from: c, reason: collision with root package name */
    public final View f14453c;

    /* renamed from: d, reason: collision with root package name */
    public final View f14454d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14455e;

    /* renamed from: f, reason: collision with root package name */
    public final ImageView f14456f;

    /* renamed from: g, reason: collision with root package name */
    public final SubtitleView f14457g;

    /* renamed from: h, reason: collision with root package name */
    public final View f14458h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f14459i;
    public final D j;

    /* renamed from: k, reason: collision with root package name */
    public final FrameLayout f14460k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f14461l;

    /* renamed from: m, reason: collision with root package name */
    public final View f14462m;

    /* renamed from: n, reason: collision with root package name */
    public final View f14463n;

    /* renamed from: o, reason: collision with root package name */
    public r0 f14464o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14465p;

    /* renamed from: q, reason: collision with root package name */
    public C f14466q;

    /* renamed from: r, reason: collision with root package name */
    public M f14467r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14468s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f14469t;

    /* renamed from: u, reason: collision with root package name */
    public int f14470u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14471v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f14472w;

    /* renamed from: x, reason: collision with root package name */
    public int f14473x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14474y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f14475z;

    /* JADX WARN: Multi-variable type inference failed */
    public StyledPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i9;
        int i10;
        boolean z9;
        boolean z10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        int i16;
        boolean z15;
        boolean z16;
        int i17;
        boolean z17;
        this.f14450C = new GestureDetector(getContext(), new J(this));
        K k5 = new K(this);
        this.f14451a = k5;
        if (isInEditMode()) {
            this.f14452b = null;
            this.f14453c = null;
            this.f14454d = null;
            this.f14455e = false;
            this.f14456f = null;
            this.f14457g = null;
            this.f14458h = null;
            this.f14459i = null;
            this.j = null;
            this.f14460k = null;
            this.f14461l = null;
            ImageView imageView = new ImageView(context);
            if (y.f20553a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, null));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC0365h.f6272e, 0, 0);
            try {
                z11 = obtainStyledAttributes.hasValue(27);
                i13 = obtainStyledAttributes.getColor(27, 0);
                int resourceId = obtainStyledAttributes.getResourceId(14, R.layout.exo_styled_player_view);
                z12 = obtainStyledAttributes.getBoolean(32, true);
                i14 = obtainStyledAttributes.getResourceId(8, 0);
                boolean z18 = obtainStyledAttributes.getBoolean(33, true);
                int i18 = obtainStyledAttributes.getInt(28, 1);
                int i19 = obtainStyledAttributes.getInt(16, 0);
                int i20 = obtainStyledAttributes.getInt(25, 5000);
                boolean z19 = obtainStyledAttributes.getBoolean(10, true);
                boolean z20 = obtainStyledAttributes.getBoolean(3, true);
                int integer = obtainStyledAttributes.getInteger(22, 0);
                this.f14471v = obtainStyledAttributes.getBoolean(11, this.f14471v);
                boolean z21 = obtainStyledAttributes.getBoolean(9, true);
                obtainStyledAttributes.recycle();
                i15 = resourceId;
                z14 = z20;
                i9 = i20;
                z9 = z19;
                z13 = z18;
                i12 = i18;
                i11 = i19;
                z10 = z21;
                i10 = integer;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i9 = 5000;
            i10 = 0;
            z9 = true;
            z10 = true;
            i11 = 0;
            i12 = 1;
            i13 = 0;
            z11 = false;
            z12 = true;
            i14 = 0;
            z13 = true;
            i15 = R.layout.exo_styled_player_view;
            z14 = true;
        }
        LayoutInflater.from(context).inflate(i15, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f14452b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i11);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.f14453c = findViewById;
        if (findViewById != null && z11) {
            findViewById.setBackgroundColor(i13);
        }
        if (aspectRatioFrameLayout != null && i12 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        this.f14454d = new SurfaceView(context);
                    } else {
                        try {
                            int i21 = m.f20802b;
                            this.f14454d = (View) m.class.getConstructor(Context.class).newInstance(context);
                        } catch (Exception e8) {
                            throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e8);
                        }
                    }
                } else {
                    try {
                        int i22 = k.f21200l;
                        this.f14454d = (View) k.class.getConstructor(Context.class).newInstance(context);
                        z15 = true;
                        this.f14454d.setLayoutParams(layoutParams);
                        this.f14454d.setOnClickListener(k5);
                        i16 = 0;
                        this.f14454d.setClickable(false);
                        aspectRatioFrameLayout.addView(this.f14454d, 0);
                    } catch (Exception e9) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e9);
                    }
                }
            } else {
                this.f14454d = new TextureView(context);
            }
            z15 = false;
            this.f14454d.setLayoutParams(layoutParams);
            this.f14454d.setOnClickListener(k5);
            i16 = 0;
            this.f14454d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f14454d, 0);
        } else {
            i16 = 0;
            this.f14454d = null;
            z15 = false;
        }
        this.f14455e = z15;
        this.f14460k = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f14461l = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f14456f = imageView2;
        if (z12 && imageView2 != null) {
            z16 = 1;
        } else {
            z16 = i16;
        }
        this.f14468s = z16;
        if (i14 != 0) {
            this.f14469t = getContext().getDrawable(i14);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f14457g = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        this.f14462m = findViewById(R.id.imageIconForward);
        this.f14463n = findViewById(R.id.imageIconRewind);
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.f14458h = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f14470u = i10;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f14459i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        D d9 = (D) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (d9 != null) {
            this.j = d9;
        } else if (findViewById3 != null) {
            D d10 = new D(context, attributeSet);
            this.j = d10;
            d10.setId(R.id.exo_controller);
            d10.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(d10, indexOfChild);
        } else {
            this.j = null;
        }
        D d11 = this.j;
        if (d11 != null) {
            i17 = i9;
        } else {
            i17 = i16;
        }
        this.f14473x = i17;
        this.f14448A = z9;
        this.f14474y = z14;
        this.f14475z = z10;
        if (z13 && d11 != null) {
            z17 = 1;
        } else {
            z17 = i16;
        }
        this.f14465p = z17;
        if (d11 != null) {
            I i23 = d11.f6052B0;
            int i24 = i23.f6155z;
            if (i24 != 3 && i24 != 2) {
                i23.f();
                i23.i(2);
            }
            this.j.f6076c.add(k5);
        }
        if (z13) {
            setClickable(true);
        }
        j();
    }

    public static void a(StyledPlayerView styledPlayerView, View view) {
        view.clearAnimation();
        D d9 = styledPlayerView.j;
        if (d9 != null && d9.f()) {
            view.setVisibility(4);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(250L);
        alphaAnimation.setRepeatCount(1);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setAnimationListener(new q(1, view));
        view.startAnimation(alphaAnimation);
    }

    public static void b(TextureView textureView, int i9) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i9 != 0) {
            float f9 = width / 2.0f;
            float f10 = height / 2.0f;
            matrix.postRotate(i9, f9, f10);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f9, f10);
        }
        textureView.setTransform(matrix);
    }

    public final boolean c() {
        r0 r0Var = this.f14464o;
        if (r0Var != null && r0Var.g() && this.f14464o.m()) {
            return true;
        }
        return false;
    }

    public final void d(boolean z9) {
        boolean z10;
        if ((!c() || !this.f14475z) && m()) {
            D d9 = this.j;
            if (d9.f() && d9.getShowTimeoutMs() <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean f9 = f();
            if (z9 || z10 || f9) {
                g(f9);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z9;
        r0 r0Var = this.f14464o;
        if (r0Var != null && r0Var.g()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19 && keyCode != 270 && keyCode != 22 && keyCode != 271 && keyCode != 20 && keyCode != 269 && keyCode != 21 && keyCode != 268 && keyCode != 23) {
            z9 = false;
        } else {
            z9 = true;
        }
        D d9 = this.j;
        if (z9 && m() && !d9.f()) {
            d(true);
            return true;
        }
        if ((m() && d9.b(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            d(true);
            return true;
        }
        if (z9 && m()) {
            d(true);
        }
        return false;
    }

    public final boolean e(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f9 = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f14452b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f9);
                }
                ImageView imageView = this.f14456f;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        r0 r0Var = this.f14464o;
        if (r0Var == null) {
            return true;
        }
        int e8 = r0Var.e();
        if (this.f14474y && !this.f14464o.I().p()) {
            if (e8 != 1 && e8 != 4) {
                r0 r0Var2 = this.f14464o;
                r0Var2.getClass();
                if (r0Var2.m()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final void g(boolean z9) {
        int i9;
        if (!m()) {
            return;
        }
        if (z9) {
            i9 = 0;
        } else {
            i9 = this.f14473x;
        }
        D d9 = this.j;
        d9.setShowTimeoutMs(i9);
        I i10 = d9.f6052B0;
        D d10 = i10.f6131a;
        if (!d10.g()) {
            d10.setVisibility(0);
            d10.i();
            View view = d10.f6079f;
            if (view != null) {
                view.requestFocus();
            }
        }
        i10.k();
    }

    public List<C0320v> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f14461l;
        if (frameLayout != null) {
            arrayList.add(new C0320v(frameLayout));
        }
        D d9 = this.j;
        if (d9 != null) {
            arrayList.add(new C0320v(d9));
        }
        return F.o(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f14460k;
        AbstractC1566a.o(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public AspectRatioFrameLayout getContentFrame() {
        return this.f14452b;
    }

    public boolean getControllerAutoShow() {
        return this.f14474y;
    }

    public boolean getControllerHideOnTouch() {
        return this.f14448A;
    }

    public int getControllerShowTimeoutMs() {
        return this.f14473x;
    }

    public Drawable getDefaultArtwork() {
        return this.f14469t;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f14461l;
    }

    public r0 getPlayer() {
        return this.f14464o;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f14452b;
        AbstractC1566a.n(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f14457g;
    }

    public boolean getUseArtwork() {
        return this.f14468s;
    }

    public boolean getUseController() {
        return this.f14465p;
    }

    public View getVideoSurfaceView() {
        return this.f14454d;
    }

    public final void h() {
        v vVar;
        float f9;
        r0 r0Var = this.f14464o;
        if (r0Var != null) {
            vVar = r0Var.w();
        } else {
            vVar = v.f20829e;
        }
        int i9 = vVar.f20830a;
        float f10 = 0.0f;
        int i10 = vVar.f20831b;
        if (i10 != 0 && i9 != 0) {
            f9 = (i9 * vVar.f20833d) / i10;
        } else {
            f9 = 0.0f;
        }
        View view = this.f14454d;
        if (view instanceof TextureView) {
            int i11 = vVar.f20832c;
            if (f9 > 0.0f && (i11 == 90 || i11 == 270)) {
                f9 = 1.0f / f9;
            }
            int i12 = this.f14449B;
            K k5 = this.f14451a;
            if (i12 != 0) {
                view.removeOnLayoutChangeListener(k5);
            }
            this.f14449B = i11;
            if (i11 != 0) {
                view.addOnLayoutChangeListener(k5);
            }
            b((TextureView) view, this.f14449B);
        }
        if (!this.f14455e) {
            f10 = f9;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f14452b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r5.f14464o.m() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r5 = this;
            android.view.View r0 = r5.f14458h
            if (r0 == 0) goto L29
            j3.r0 r1 = r5.f14464o
            r2 = 0
            if (r1 == 0) goto L20
            int r1 = r1.e()
            r3 = 2
            if (r1 != r3) goto L20
            int r1 = r5.f14470u
            r4 = 1
            if (r1 == r3) goto L21
            if (r1 != r4) goto L20
            j3.r0 r1 = r5.f14464o
            boolean r1 = r1.m()
            if (r1 == 0) goto L20
            goto L21
        L20:
            r4 = r2
        L21:
            if (r4 == 0) goto L24
            goto L26
        L24:
            r2 = 8
        L26:
            r0.setVisibility(r2)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anilab.exoplayer.StyledPlayerView.i():void");
    }

    public final void j() {
        String str = null;
        D d9 = this.j;
        if (d9 != null && this.f14465p) {
            if (d9.f()) {
                if (this.f14448A) {
                    str = getResources().getString(R.string.exo_controls_hide);
                }
                setContentDescription(str);
                return;
            }
            setContentDescription(getResources().getString(R.string.exo_controls_show));
            return;
        }
        setContentDescription(null);
    }

    public final void k() {
        TextView textView = this.f14459i;
        if (textView != null) {
            CharSequence charSequence = this.f14472w;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                r0 r0Var = this.f14464o;
                if (r0Var != null) {
                    r0Var.d();
                }
                textView.setVisibility(8);
            }
        }
    }

    public final void l(boolean z9) {
        r0 r0Var = this.f14464o;
        View view = this.f14453c;
        ImageView imageView = this.f14456f;
        boolean z10 = false;
        if (r0Var != null && !r0Var.q().f19338a.isEmpty()) {
            if (z9 && !this.f14471v && view != null) {
                view.setVisibility(0);
            }
            if (r0Var.q().a(2)) {
                if (imageView != null) {
                    imageView.setImageResource(android.R.color.transparent);
                    imageView.setVisibility(4);
                    return;
                }
                return;
            }
            if (view != null) {
                view.setVisibility(0);
            }
            if (this.f14468s) {
                AbstractC1566a.n(imageView);
                byte[] bArr = r0Var.R().j;
                if (bArr != null) {
                    z10 = e(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (z10 || e(this.f14469t)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
                return;
            }
            return;
        }
        if (!this.f14471v) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public final boolean m() {
        if (this.f14465p) {
            AbstractC1566a.n(this.j);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f14450C.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (m() && this.f14464o != null) {
            d(true);
            return true;
        }
        return false;
    }

    public void setAspectRatioListener(InterfaceC0358a interfaceC0358a) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f14452b;
        AbstractC1566a.n(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(interfaceC0358a);
    }

    public void setControllerAutoShow(boolean z9) {
        this.f14474y = z9;
    }

    public void setControllerHideDuringAds(boolean z9) {
        this.f14475z = z9;
    }

    public void setControllerHideOnTouch(boolean z9) {
        AbstractC1566a.n(this.j);
        this.f14448A = z9;
        j();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(r rVar) {
        D d9 = this.j;
        AbstractC1566a.n(d9);
        this.f14467r = null;
        d9.setOnFullScreenModeChangedListener(rVar);
    }

    public void setControllerShowTimeoutMs(int i9) {
        D d9 = this.j;
        AbstractC1566a.n(d9);
        this.f14473x = i9;
        if (d9.f()) {
            g(f());
        }
    }

    public void setControllerVisibilityListener(L l9) {
        setControllerVisibilityListener((C) null);
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean z9;
        if (this.f14459i != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        this.f14472w = charSequence;
        k();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f14469t != drawable) {
            this.f14469t = drawable;
            l(false);
        }
    }

    public void setErrorMessageProvider(e eVar) {
        if (eVar != null) {
            k();
        }
    }

    public void setFullscreenButtonClickListener(M m9) {
        D d9 = this.j;
        AbstractC1566a.n(d9);
        this.f14467r = m9;
        d9.setOnFullScreenModeChangedListener(this.f14451a);
    }

    public void setKeepContentOnPlayerReset(boolean z9) {
        if (this.f14471v != z9) {
            this.f14471v = z9;
            l(false);
        }
    }

    public void setPlayer(r0 r0Var) {
        boolean z9;
        boolean z10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        if (r0Var != null && r0Var.J() != Looper.getMainLooper()) {
            z10 = false;
        } else {
            z10 = true;
        }
        AbstractC1566a.h(z10);
        r0 r0Var2 = this.f14464o;
        if (r0Var2 != r0Var) {
            View view = this.f14454d;
            K k5 = this.f14451a;
            if (r0Var2 != null) {
                r0Var2.x(k5);
                if (view instanceof TextureView) {
                    r0Var2.v((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    r0Var2.D((SurfaceView) view);
                }
            }
            SubtitleView subtitleView = this.f14457g;
            if (subtitleView != null) {
                subtitleView.setCues(null);
            }
            this.f14464o = r0Var;
            boolean m9 = m();
            D d9 = this.j;
            if (m9) {
                d9.setPlayer(r0Var);
            }
            i();
            k();
            l(true);
            if (r0Var != null) {
                n nVar = (n) r0Var;
                if (nVar.b0(27)) {
                    if (view instanceof TextureView) {
                        r0Var.O((TextureView) view);
                    } else if (view instanceof SurfaceView) {
                        r0Var.C((SurfaceView) view);
                    }
                    h();
                }
                if (subtitleView != null && nVar.b0(28)) {
                    subtitleView.setCues(r0Var.u().f8696a);
                }
                r0Var.y(k5);
                d(false);
                return;
            }
            if (d9 != null) {
                d9.e();
            }
        }
    }

    public void setRepeatToggleModes(int i9) {
        D d9 = this.j;
        AbstractC1566a.n(d9);
        d9.setRepeatToggleModes(i9);
    }

    public void setResizeMode(int i9) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f14452b;
        AbstractC1566a.n(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i9);
    }

    public void setShowBuffering(int i9) {
        if (this.f14470u != i9) {
            this.f14470u = i9;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z9) {
        D d9 = this.j;
        AbstractC1566a.n(d9);
        d9.setShowFastForwardButton(z9);
    }

    public void setShowMultiWindowTimeBar(boolean z9) {
        D d9 = this.j;
        AbstractC1566a.n(d9);
        d9.setShowMultiWindowTimeBar(z9);
    }

    public void setShowNextButton(boolean z9) {
        D d9 = this.j;
        AbstractC1566a.n(d9);
        d9.setShowNextButton(z9);
    }

    public void setShowPreviousButton(boolean z9) {
        D d9 = this.j;
        AbstractC1566a.n(d9);
        d9.setShowPreviousButton(z9);
    }

    public void setShowRewindButton(boolean z9) {
        D d9 = this.j;
        AbstractC1566a.n(d9);
        d9.setShowRewindButton(z9);
    }

    public void setShowShuffleButton(boolean z9) {
        D d9 = this.j;
        AbstractC1566a.n(d9);
        d9.setShowShuffleButton(z9);
    }

    public void setShowSubtitleButton(boolean z9) {
        D d9 = this.j;
        AbstractC1566a.n(d9);
        d9.setShowSubtitleButton(z9);
    }

    public void setShowVrButton(boolean z9) {
        D d9 = this.j;
        AbstractC1566a.n(d9);
        d9.setShowVrButton(z9);
    }

    public void setShutterBackgroundColor(int i9) {
        View view = this.f14453c;
        if (view != null) {
            view.setBackgroundColor(i9);
        }
    }

    public void setUseArtwork(boolean z9) {
        boolean z10;
        if (z9 && this.f14456f == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        AbstractC1566a.m(z10);
        if (this.f14468s != z9) {
            this.f14468s = z9;
            l(false);
        }
    }

    public void setUseController(boolean z9) {
        boolean z10;
        boolean z11 = true;
        D d9 = this.j;
        if (z9 && d9 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        AbstractC1566a.m(z10);
        if (!z9 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.f14465p == z9) {
            return;
        }
        this.f14465p = z9;
        if (m()) {
            d9.setPlayer(this.f14464o);
        } else if (d9 != null) {
            d9.e();
            d9.setPlayer(null);
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        View view = this.f14454d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i9);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(C c3) {
        D d9 = this.j;
        AbstractC1566a.n(d9);
        C c9 = this.f14466q;
        if (c9 == c3) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = d9.f6076c;
        if (c9 != null) {
            copyOnWriteArrayList.remove(c9);
        }
        this.f14466q = c3;
        if (c3 != null) {
            copyOnWriteArrayList.add(c3);
        }
        setControllerVisibilityListener((L) null);
    }
}
