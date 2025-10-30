package Q2;

import J1.AbstractC0165c;
import P5.AbstractC0349q;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b7.C0701c;
import co.notix.R;
import com.anilab.android.ui.player.PlayerActivity;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.internal.measurement.Y1;
import g2.C1202D;
import g2.C1228e;
import j3.C0;
import j3.D0;
import j3.F0;
import j3.G0;
import j3.m0;
import j3.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class D extends FrameLayout {

    /* renamed from: V0, reason: collision with root package name */
    public static final float[] f6048V0;

    /* renamed from: A, reason: collision with root package name */
    public final String f6049A;

    /* renamed from: A0, reason: collision with root package name */
    public long f6050A0;

    /* renamed from: B, reason: collision with root package name */
    public final Drawable f6051B;

    /* renamed from: B0, reason: collision with root package name */
    public final I f6052B0;

    /* renamed from: C, reason: collision with root package name */
    public final Drawable f6053C;

    /* renamed from: C0, reason: collision with root package name */
    public final Resources f6054C0;

    /* renamed from: D, reason: collision with root package name */
    public final float f6055D;

    /* renamed from: D0, reason: collision with root package name */
    public final RecyclerView f6056D0;

    /* renamed from: E0, reason: collision with root package name */
    public final TextView f6057E0;

    /* renamed from: F0, reason: collision with root package name */
    public final ImageView f6058F0;

    /* renamed from: G0, reason: collision with root package name */
    public final C0379w f6059G0;

    /* renamed from: H0, reason: collision with root package name */
    public final C0376t f6060H0;

    /* renamed from: I0, reason: collision with root package name */
    public final PopupWindow f6061I0;

    /* renamed from: J0, reason: collision with root package name */
    public final boolean f6062J0;

    /* renamed from: K0, reason: collision with root package name */
    public final C0373p f6063K0;

    /* renamed from: L0, reason: collision with root package name */
    public final C0381y f6064L0;

    /* renamed from: M0, reason: collision with root package name */
    public final C0372o f6065M0;

    /* renamed from: N0, reason: collision with root package name */
    public final C0701c f6066N0;

    /* renamed from: O0, reason: collision with root package name */
    public final View f6067O0;

    /* renamed from: P0, reason: collision with root package name */
    public final View f6068P0;

    /* renamed from: Q0, reason: collision with root package name */
    public final ImageView f6069Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final ImageView f6070R0;

    /* renamed from: S0, reason: collision with root package name */
    public final View f6071S0;

    /* renamed from: T0, reason: collision with root package name */
    public final View f6072T0;

    /* renamed from: U0, reason: collision with root package name */
    public final View f6073U0;

    /* renamed from: a, reason: collision with root package name */
    public final ViewOnClickListenerC0374q f6074a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0362e f6075b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f6076c;

    /* renamed from: d, reason: collision with root package name */
    public final View f6077d;

    /* renamed from: e, reason: collision with root package name */
    public final View f6078e;

    /* renamed from: f, reason: collision with root package name */
    public final View f6079f;

    /* renamed from: f0, reason: collision with root package name */
    public final float f6080f0;

    /* renamed from: g, reason: collision with root package name */
    public final View f6081g;

    /* renamed from: g0, reason: collision with root package name */
    public final String f6082g0;

    /* renamed from: h, reason: collision with root package name */
    public final View f6083h;

    /* renamed from: h0, reason: collision with root package name */
    public final String f6084h0;

    /* renamed from: i, reason: collision with root package name */
    public final View f6085i;

    /* renamed from: i0, reason: collision with root package name */
    public final Drawable f6086i0;
    public final View j;

    /* renamed from: j0, reason: collision with root package name */
    public final Drawable f6087j0;

    /* renamed from: k, reason: collision with root package name */
    public final ImageView f6088k;

    /* renamed from: k0, reason: collision with root package name */
    public final String f6089k0;

    /* renamed from: l, reason: collision with root package name */
    public final ImageView f6090l;

    /* renamed from: l0, reason: collision with root package name */
    public final String f6091l0;

    /* renamed from: m, reason: collision with root package name */
    public final View f6092m;

    /* renamed from: m0, reason: collision with root package name */
    public r0 f6093m0;

    /* renamed from: n, reason: collision with root package name */
    public final TextView f6094n;

    /* renamed from: n0, reason: collision with root package name */
    public r f6095n0;

    /* renamed from: o, reason: collision with root package name */
    public final TextView f6096o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f6097o0;

    /* renamed from: p, reason: collision with root package name */
    public final S f6098p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f6099p0;

    /* renamed from: q, reason: collision with root package name */
    public final StringBuilder f6100q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f6101q0;

    /* renamed from: r, reason: collision with root package name */
    public final Formatter f6102r;
    public boolean r0;

    /* renamed from: s, reason: collision with root package name */
    public final C0 f6103s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f6104s0;

    /* renamed from: t, reason: collision with root package name */
    public final D0 f6105t;

    /* renamed from: t0, reason: collision with root package name */
    public int f6106t0;

    /* renamed from: u, reason: collision with root package name */
    public final A6.s f6107u;

    /* renamed from: u0, reason: collision with root package name */
    public int f6108u0;

    /* renamed from: v, reason: collision with root package name */
    public final Drawable f6109v;

    /* renamed from: v0, reason: collision with root package name */
    public int f6110v0;

    /* renamed from: w, reason: collision with root package name */
    public final Drawable f6111w;

    /* renamed from: w0, reason: collision with root package name */
    public long[] f6112w0;

    /* renamed from: x, reason: collision with root package name */
    public final Drawable f6113x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean[] f6114x0;

    /* renamed from: y, reason: collision with root package name */
    public final String f6115y;

    /* renamed from: y0, reason: collision with root package name */
    public final long[] f6116y0;

    /* renamed from: z, reason: collision with root package name */
    public final String f6117z;

    /* renamed from: z0, reason: collision with root package name */
    public final boolean[] f6118z0;

    static {
        j3.K.a("goog.exo.ui");
        f6048V0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [T2.d, Q2.S, android.view.View, Q2.g] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T2.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [U2.a, java.lang.Object] */
    public D(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        char c3;
        boolean z18;
        View view;
        View view2;
        boolean z19;
        boolean z20;
        boolean z21;
        ViewOnClickListenerC0374q viewOnClickListenerC0374q;
        boolean z22;
        boolean z23;
        View view3;
        View view4;
        ImageView imageView;
        boolean z24;
        boolean z25;
        final int i9 = 0;
        this.f6106t0 = 5000;
        this.f6110v0 = 0;
        this.f6108u0 = 200;
        int i10 = R.layout.exo_styled_player_control_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC0365h.f6271d, 0, 0);
            try {
                i10 = obtainStyledAttributes.getResourceId(6, R.layout.exo_styled_player_control_view);
                this.f6106t0 = obtainStyledAttributes.getInt(21, this.f6106t0);
                this.f6110v0 = obtainStyledAttributes.getInt(9, this.f6110v0);
                z14 = obtainStyledAttributes.getBoolean(18, true);
                boolean z26 = obtainStyledAttributes.getBoolean(15, true);
                boolean z27 = obtainStyledAttributes.getBoolean(17, true);
                z16 = obtainStyledAttributes.getBoolean(16, true);
                boolean z28 = obtainStyledAttributes.getBoolean(19, false);
                boolean z29 = obtainStyledAttributes.getBoolean(20, false);
                boolean z30 = obtainStyledAttributes.getBoolean(22, false);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(23, this.f6108u0));
                boolean z31 = obtainStyledAttributes.getBoolean(2, true);
                obtainStyledAttributes.recycle();
                z15 = z31;
                z9 = z28;
                z10 = z30;
                z12 = z27;
                z11 = z29;
                z13 = z26;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z9 = false;
            z10 = false;
            z11 = false;
            z12 = true;
            z13 = true;
            z14 = true;
            z15 = true;
            z16 = true;
        }
        LayoutInflater.from(context).inflate(i10, this);
        setDescendantFocusability(262144);
        ViewOnClickListenerC0374q viewOnClickListenerC0374q2 = new ViewOnClickListenerC0374q(this);
        this.f6074a = viewOnClickListenerC0374q2;
        this.f6076c = new CopyOnWriteArrayList();
        this.f6103s = new C0();
        this.f6105t = new D0();
        StringBuilder sb = new StringBuilder();
        this.f6100q = sb;
        this.f6102r = new Formatter(sb, Locale.getDefault());
        this.f6112w0 = new long[0];
        this.f6114x0 = new boolean[0];
        this.f6116y0 = new long[0];
        this.f6118z0 = new boolean[0];
        this.f6107u = new A6.s(8, this);
        this.f6094n = (TextView) findViewById(R.id.exo_duration);
        this.f6096o = (TextView) findViewById(R.id.exo_position);
        View findViewById = findViewById(R.id.exo_subtitle);
        this.f6067O0 = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(viewOnClickListenerC0374q2);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f6069Q0 = imageView2;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: Q2.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ D f6284b;

            {
                this.f6284b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                int dimensionPixelSize;
                switch (i9) {
                    case 0:
                        this.f6284b.h();
                        return;
                    case 1:
                        D d9 = this.f6284b;
                        if (d9.f6097o0) {
                            d9.h();
                            return;
                        }
                        InterfaceC0362e interfaceC0362e = d9.f6075b;
                        if (interfaceC0362e != null) {
                            PlayerActivity.T(((C1202D) interfaceC0362e).f17564b);
                            return;
                        }
                        return;
                    case 2:
                        this.f6284b.f6061I0.dismiss();
                        return;
                    default:
                        D d10 = this.f6284b;
                        InterfaceC0362e interfaceC0362e2 = d10.f6075b;
                        if (interfaceC0362e2 != null) {
                            C1202D c1202d = (C1202D) interfaceC0362e2;
                            AbstractC0165c abstractC0165c = c1202d.f17565c;
                            ConstraintLayout layoutSubSync = abstractC0165c.f3852M;
                            kotlin.jvm.internal.h.d(layoutSubSync, "layoutSubSync");
                            ViewGroup.LayoutParams layoutParams = layoutSubSync.getLayoutParams();
                            if (layoutParams != null) {
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                PlayerActivity playerActivity = c1202d.f17564b;
                                if (playerActivity.getResources().getConfiguration().orientation == 2) {
                                    dimensionPixelSize = -1;
                                } else {
                                    dimensionPixelSize = playerActivity.getResources().getDimensionPixelSize(R.dimen.dp_320);
                                }
                                layoutParams2.height = dimensionPixelSize;
                                layoutParams2.width = -1;
                                layoutSubSync.setLayoutParams(layoutParams2);
                                D d11 = abstractC0165c.f3853N.j;
                                if (d11 != null) {
                                    d11.e();
                                }
                                ConstraintLayout layoutSubSync2 = abstractC0165c.f3852M;
                                kotlin.jvm.internal.h.d(layoutSubSync2, "layoutSubSync");
                                layoutSubSync2.setVisibility(0);
                                d10.f6061I0.dismiss();
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                        return;
                }
            }
        };
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(onClickListener);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f6070R0 = imageView3;
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: Q2.m

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ D f6284b;

            {
                this.f6284b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                int dimensionPixelSize;
                switch (i9) {
                    case 0:
                        this.f6284b.h();
                        return;
                    case 1:
                        D d9 = this.f6284b;
                        if (d9.f6097o0) {
                            d9.h();
                            return;
                        }
                        InterfaceC0362e interfaceC0362e = d9.f6075b;
                        if (interfaceC0362e != null) {
                            PlayerActivity.T(((C1202D) interfaceC0362e).f17564b);
                            return;
                        }
                        return;
                    case 2:
                        this.f6284b.f6061I0.dismiss();
                        return;
                    default:
                        D d10 = this.f6284b;
                        InterfaceC0362e interfaceC0362e2 = d10.f6075b;
                        if (interfaceC0362e2 != null) {
                            C1202D c1202d = (C1202D) interfaceC0362e2;
                            AbstractC0165c abstractC0165c = c1202d.f17565c;
                            ConstraintLayout layoutSubSync = abstractC0165c.f3852M;
                            kotlin.jvm.internal.h.d(layoutSubSync, "layoutSubSync");
                            ViewGroup.LayoutParams layoutParams = layoutSubSync.getLayoutParams();
                            if (layoutParams != null) {
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                PlayerActivity playerActivity = c1202d.f17564b;
                                if (playerActivity.getResources().getConfiguration().orientation == 2) {
                                    dimensionPixelSize = -1;
                                } else {
                                    dimensionPixelSize = playerActivity.getResources().getDimensionPixelSize(R.dimen.dp_320);
                                }
                                layoutParams2.height = dimensionPixelSize;
                                layoutParams2.width = -1;
                                layoutSubSync.setLayoutParams(layoutParams2);
                                D d11 = abstractC0165c.f3853N.j;
                                if (d11 != null) {
                                    d11.e();
                                }
                                ConstraintLayout layoutSubSync2 = abstractC0165c.f3852M;
                                kotlin.jvm.internal.h.d(layoutSubSync2, "layoutSubSync");
                                layoutSubSync2.setVisibility(0);
                                d10.f6061I0.dismiss();
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                        return;
                }
            }
        };
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(onClickListener2);
        }
        View findViewById2 = findViewById(R.id.exo_settings);
        this.f6071S0 = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(viewOnClickListenerC0374q2);
        }
        View findViewById3 = findViewById(R.id.exo_playback_speed);
        this.f6072T0 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(viewOnClickListenerC0374q2);
        }
        View findViewById4 = findViewById(R.id.exo_audio_track);
        this.f6073U0 = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(viewOnClickListenerC0374q2);
        }
        View findViewById5 = findViewById(R.id.buttonBack);
        this.f6068P0 = findViewById5;
        if (findViewById5 != null) {
            final int i11 = 1;
            findViewById5.setOnClickListener(new View.OnClickListener(this) { // from class: Q2.m

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ D f6284b;

                {
                    this.f6284b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    int dimensionPixelSize;
                    switch (i11) {
                        case 0:
                            this.f6284b.h();
                            return;
                        case 1:
                            D d9 = this.f6284b;
                            if (d9.f6097o0) {
                                d9.h();
                                return;
                            }
                            InterfaceC0362e interfaceC0362e = d9.f6075b;
                            if (interfaceC0362e != null) {
                                PlayerActivity.T(((C1202D) interfaceC0362e).f17564b);
                                return;
                            }
                            return;
                        case 2:
                            this.f6284b.f6061I0.dismiss();
                            return;
                        default:
                            D d10 = this.f6284b;
                            InterfaceC0362e interfaceC0362e2 = d10.f6075b;
                            if (interfaceC0362e2 != null) {
                                C1202D c1202d = (C1202D) interfaceC0362e2;
                                AbstractC0165c abstractC0165c = c1202d.f17565c;
                                ConstraintLayout layoutSubSync = abstractC0165c.f3852M;
                                kotlin.jvm.internal.h.d(layoutSubSync, "layoutSubSync");
                                ViewGroup.LayoutParams layoutParams = layoutSubSync.getLayoutParams();
                                if (layoutParams != null) {
                                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                    PlayerActivity playerActivity = c1202d.f17564b;
                                    if (playerActivity.getResources().getConfiguration().orientation == 2) {
                                        dimensionPixelSize = -1;
                                    } else {
                                        dimensionPixelSize = playerActivity.getResources().getDimensionPixelSize(R.dimen.dp_320);
                                    }
                                    layoutParams2.height = dimensionPixelSize;
                                    layoutParams2.width = -1;
                                    layoutSubSync.setLayoutParams(layoutParams2);
                                    D d11 = abstractC0165c.f3853N.j;
                                    if (d11 != null) {
                                        d11.e();
                                    }
                                    ConstraintLayout layoutSubSync2 = abstractC0165c.f3852M;
                                    kotlin.jvm.internal.h.d(layoutSubSync2, "layoutSubSync");
                                    layoutSubSync2.setVisibility(0);
                                    d10.f6061I0.dismiss();
                                    return;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            }
                            return;
                    }
                }
            });
        }
        S s9 = (S) findViewById(R.id.exo_progress);
        View findViewById6 = findViewById(R.id.exo_progress_placeholder);
        boolean z32 = z9;
        if (s9 != null) {
            this.f6098p = s9;
            z17 = z12;
            c3 = 65535;
        } else if (findViewById6 != null) {
            ?? abstractC0364g = new AbstractC0364g(context, attributeSet);
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC0365h.f6269b, 0, R.style.ExoStyledControls_TimeBar);
            abstractC0364g.f7065y0 = obtainStyledAttributes2.getInt(7, -1);
            Drawable drawable = obtainStyledAttributes2.getDrawable(10);
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(11, (int) ((12 * context.getResources().getDisplayMetrics().density) + 0.5f));
            z17 = z12;
            int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(8, (int) ((0 * context.getResources().getDisplayMetrics().density) + 0.5f));
            int dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(9, (int) ((16 * context.getResources().getDisplayMetrics().density) + 0.5f));
            if (drawable != null) {
                abstractC0364g.f7061A0 = (drawable.getMinimumWidth() + 1) / 2;
            } else {
                abstractC0364g.f7061A0 = (Math.max(dimensionPixelSize2, Math.max(dimensionPixelSize, dimensionPixelSize3)) + 1) / 2;
            }
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC0365h.f6270c, 0, R.style.ExoStyledControls_PreviewTimeBar);
            c3 = 65535;
            abstractC0364g.f7066z0 = obtainStyledAttributes3.getResourceId(3, -1);
            ?? obj = new Object();
            obj.f7053d = new ArrayList();
            obj.f7054e = new ArrayList();
            obj.f7052c = abstractC0364g;
            obj.f7058i = true;
            obj.j = true;
            obj.f7051b = new Object();
            abstractC0364g.f7062v0 = obj;
            obj.f7057h = abstractC0364g.isEnabled();
            obj.f7058i = obtainStyledAttributes3.getBoolean(0, true);
            obj.f7057h = obtainStyledAttributes3.getBoolean(2, true);
            obj.j = obtainStyledAttributes3.getBoolean(1, true);
            obtainStyledAttributes3.recycle();
            abstractC0364g.f6265x.add(new T2.c(abstractC0364g));
            abstractC0364g.setId(R.id.exo_progress);
            abstractC0364g.setLayoutParams(findViewById6.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById6.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById6);
            viewGroup.removeView(findViewById6);
            viewGroup.addView((View) abstractC0364g, indexOfChild);
            this.f6098p = abstractC0364g;
        } else {
            z17 = z12;
            c3 = 65535;
            this.f6098p = null;
        }
        S s10 = this.f6098p;
        if (s10 != null) {
            ((AbstractC0364g) s10).f6265x.add(viewOnClickListenerC0374q2);
        }
        View findViewById7 = findViewById(R.id.exo_play_pause);
        this.f6079f = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(viewOnClickListenerC0374q2);
        }
        View findViewById8 = findViewById(R.id.exo_prev);
        this.f6077d = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(viewOnClickListenerC0374q2);
        }
        View findViewById9 = findViewById(R.id.exo_next);
        this.f6078e = findViewById9;
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(viewOnClickListenerC0374q2);
        }
        ThreadLocal threadLocal = G.l.f2623a;
        if (context.isRestricted()) {
            z23 = z13;
            z18 = z14;
            view = findViewById9;
            view2 = findViewById;
            z19 = z11;
            z20 = z16;
            viewOnClickListenerC0374q = viewOnClickListenerC0374q2;
            z21 = z10;
            z22 = z17;
        } else {
            z18 = z14;
            view = findViewById9;
            view2 = findViewById;
            z19 = z11;
            z20 = z16;
            z21 = z10;
            viewOnClickListenerC0374q = viewOnClickListenerC0374q2;
            z22 = z17;
            z23 = z13;
            G.l.b(context, R.font.roboto_medium_numbers, new TypedValue(), 0, null, false, false);
        }
        View findViewById10 = findViewById(R.id.exo_rew);
        if (findViewById10 == null) {
            view3 = findViewById(R.id.exo_rew_with_amount);
        } else {
            view3 = null;
        }
        this.j = view3;
        findViewById10 = findViewById10 == null ? view3 : findViewById10;
        this.f6083h = findViewById10;
        if (findViewById10 != null) {
            findViewById10.setOnClickListener(viewOnClickListenerC0374q);
        }
        View findViewById11 = findViewById(R.id.exo_ffwd);
        if (findViewById11 == null) {
            view4 = findViewById(R.id.exo_ffwd_with_amount);
        } else {
            view4 = null;
        }
        this.f6085i = view4;
        findViewById11 = findViewById11 == null ? view4 : findViewById11;
        this.f6081g = findViewById11;
        if (findViewById11 != null) {
            findViewById11.setOnClickListener(viewOnClickListenerC0374q);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f6088k = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(viewOnClickListenerC0374q);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f6090l = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(viewOnClickListenerC0374q);
        }
        Resources resources = context.getResources();
        this.f6054C0 = resources;
        this.f6055D = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f6080f0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View findViewById12 = findViewById(R.id.exo_vr);
        this.f6092m = findViewById12;
        if (findViewById12 != null) {
            j(findViewById12, false);
        }
        I i12 = new I(this);
        this.f6052B0 = i12;
        i12.f6130C = z15;
        C0379w c0379w = new C0379w(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack)});
        this.f6059G0 = c0379w;
        resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) frameLayout.findViewById(R.id.exo_settings_listview);
        this.f6056D0 = recyclerView;
        if (recyclerView != null) {
            getContext();
            imageView = imageView5;
            z24 = true;
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            recyclerView.setAdapter(c0379w);
        } else {
            imageView = imageView5;
            z24 = true;
        }
        PopupWindow popupWindow = new PopupWindow(frameLayout, -1, -1, z24);
        this.f6061I0 = popupWindow;
        popupWindow.setClippingEnabled(false);
        View findViewById13 = frameLayout.findViewById(R.id.imageClose);
        if (findViewById13 != null) {
            final int i13 = 2;
            findViewById13.setOnClickListener(new View.OnClickListener(this) { // from class: Q2.m

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ D f6284b;

                {
                    this.f6284b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    int dimensionPixelSize4;
                    switch (i13) {
                        case 0:
                            this.f6284b.h();
                            return;
                        case 1:
                            D d9 = this.f6284b;
                            if (d9.f6097o0) {
                                d9.h();
                                return;
                            }
                            InterfaceC0362e interfaceC0362e = d9.f6075b;
                            if (interfaceC0362e != null) {
                                PlayerActivity.T(((C1202D) interfaceC0362e).f17564b);
                                return;
                            }
                            return;
                        case 2:
                            this.f6284b.f6061I0.dismiss();
                            return;
                        default:
                            D d10 = this.f6284b;
                            InterfaceC0362e interfaceC0362e2 = d10.f6075b;
                            if (interfaceC0362e2 != null) {
                                C1202D c1202d = (C1202D) interfaceC0362e2;
                                AbstractC0165c abstractC0165c = c1202d.f17565c;
                                ConstraintLayout layoutSubSync = abstractC0165c.f3852M;
                                kotlin.jvm.internal.h.d(layoutSubSync, "layoutSubSync");
                                ViewGroup.LayoutParams layoutParams = layoutSubSync.getLayoutParams();
                                if (layoutParams != null) {
                                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                    PlayerActivity playerActivity = c1202d.f17564b;
                                    if (playerActivity.getResources().getConfiguration().orientation == 2) {
                                        dimensionPixelSize4 = -1;
                                    } else {
                                        dimensionPixelSize4 = playerActivity.getResources().getDimensionPixelSize(R.dimen.dp_320);
                                    }
                                    layoutParams2.height = dimensionPixelSize4;
                                    layoutParams2.width = -1;
                                    layoutSubSync.setLayoutParams(layoutParams2);
                                    D d11 = abstractC0165c.f3853N.j;
                                    if (d11 != null) {
                                        d11.e();
                                    }
                                    ConstraintLayout layoutSubSync2 = abstractC0165c.f3852M;
                                    kotlin.jvm.internal.h.d(layoutSubSync2, "layoutSubSync");
                                    layoutSubSync2.setVisibility(0);
                                    d10.f6061I0.dismiss();
                                    return;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            }
                            return;
                    }
                }
            });
        }
        this.f6057E0 = (TextView) frameLayout.findViewById(R.id.textLabel);
        ImageView imageView6 = (ImageView) frameLayout.findViewById(R.id.imageSettings);
        this.f6058F0 = imageView6;
        if (imageView6 != null) {
            final int i14 = 3;
            imageView6.setOnClickListener(new View.OnClickListener(this) { // from class: Q2.m

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ D f6284b;

                {
                    this.f6284b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    int dimensionPixelSize4;
                    switch (i14) {
                        case 0:
                            this.f6284b.h();
                            return;
                        case 1:
                            D d9 = this.f6284b;
                            if (d9.f6097o0) {
                                d9.h();
                                return;
                            }
                            InterfaceC0362e interfaceC0362e = d9.f6075b;
                            if (interfaceC0362e != null) {
                                PlayerActivity.T(((C1202D) interfaceC0362e).f17564b);
                                return;
                            }
                            return;
                        case 2:
                            this.f6284b.f6061I0.dismiss();
                            return;
                        default:
                            D d10 = this.f6284b;
                            InterfaceC0362e interfaceC0362e2 = d10.f6075b;
                            if (interfaceC0362e2 != null) {
                                C1202D c1202d = (C1202D) interfaceC0362e2;
                                AbstractC0165c abstractC0165c = c1202d.f17565c;
                                ConstraintLayout layoutSubSync = abstractC0165c.f3852M;
                                kotlin.jvm.internal.h.d(layoutSubSync, "layoutSubSync");
                                ViewGroup.LayoutParams layoutParams = layoutSubSync.getLayoutParams();
                                if (layoutParams != null) {
                                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                    PlayerActivity playerActivity = c1202d.f17564b;
                                    if (playerActivity.getResources().getConfiguration().orientation == 2) {
                                        dimensionPixelSize4 = -1;
                                    } else {
                                        dimensionPixelSize4 = playerActivity.getResources().getDimensionPixelSize(R.dimen.dp_320);
                                    }
                                    layoutParams2.height = dimensionPixelSize4;
                                    layoutParams2.width = -1;
                                    layoutSubSync.setLayoutParams(layoutParams2);
                                    D d11 = abstractC0165c.f3853N.j;
                                    if (d11 != null) {
                                        d11.e();
                                    }
                                    ConstraintLayout layoutSubSync2 = abstractC0165c.f3852M;
                                    kotlin.jvm.internal.h.d(layoutSubSync2, "layoutSubSync");
                                    layoutSubSync2.setVisibility(0);
                                    d10.f6061I0.dismiss();
                                    return;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            }
                            return;
                    }
                }
            });
        }
        if (l4.y.f20553a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(viewOnClickListenerC0374q);
        this.f6062J0 = true;
        this.f6066N0 = new C0701c(getResources());
        resources.getDrawable(R.drawable.exo_styled_controls_subtitle_on);
        resources.getDrawable(R.drawable.exo_styled_controls_subtitle_off);
        resources.getString(R.string.exo_controls_cc_enabled_description);
        resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f6064L0 = new C0381y(this);
        this.f6065M0 = new C0372o(this);
        this.f6063K0 = new C0373p(this);
        this.f6060H0 = new C0376t(this, resources.getStringArray(R.array.exo_controls_playback_speeds), f6048V0);
        this.f6086i0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit);
        this.f6087j0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter);
        this.f6109v = resources.getDrawable(R.drawable.exo_styled_controls_repeat_off);
        this.f6111w = resources.getDrawable(R.drawable.exo_styled_controls_repeat_one);
        this.f6113x = resources.getDrawable(R.drawable.exo_styled_controls_repeat_all);
        this.f6051B = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_on);
        this.f6053C = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_off);
        this.f6089k0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f6091l0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f6115y = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f6117z = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f6049A = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f6082g0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f6084h0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        i12.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        i12.h(findViewById11, z23);
        i12.h(findViewById10, z18);
        i12.h(findViewById8, z22);
        i12.h(view, z20);
        i12.h(imageView, z32);
        i12.h(view2, z19);
        i12.h(findViewById12, z21);
        if (this.f6110v0 != 0) {
            z25 = true;
        } else {
            z25 = false;
        }
        i12.h(imageView4, z25);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0371n(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f9) {
        r0 r0Var = this.f6093m0;
        if (r0Var == null) {
            return;
        }
        r0Var.a(new m0(f9, r0Var.c().f19695b));
    }

    public final boolean b(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        r0 r0Var = this.f6093m0;
        if (r0Var == null || (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (r0Var.e() != 4) {
                    D.n nVar = (D.n) r0Var;
                    long T8 = nVar.T() + nVar.i();
                    long H8 = nVar.H();
                    if (H8 != -9223372036854775807L) {
                        T8 = Math.min(T8, H8);
                    }
                    nVar.Q(Math.max(T8, 0L), nVar.z());
                }
            } else if (keyCode == 89) {
                D.n nVar2 = (D.n) r0Var;
                long T9 = nVar2.T() + (-nVar2.U());
                long H9 = nVar2.H();
                if (H9 != -9223372036854775807L) {
                    T9 = Math.min(T9, H9);
                }
                nVar2.Q(Math.max(T9, 0L), nVar2.z());
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode != 79 && keyCode != 85) {
                    if (keyCode != 87) {
                        if (keyCode != 88) {
                            if (keyCode != 126) {
                                if (keyCode == 127) {
                                    ((D.n) r0Var).f(false);
                                }
                            } else {
                                int e8 = r0Var.e();
                                if (e8 == 1) {
                                    r0Var.b();
                                } else if (e8 == 4) {
                                    r0Var.Q(-9223372036854775807L, r0Var.z());
                                }
                                ((D.n) r0Var).f(true);
                            }
                        } else {
                            ((D.n) r0Var).j0();
                        }
                    } else {
                        ((D.n) r0Var).i0();
                    }
                } else {
                    int e9 = r0Var.e();
                    if (e9 != 1 && e9 != 4 && r0Var.m()) {
                        ((D.n) r0Var).f(false);
                    } else {
                        int e10 = r0Var.e();
                        if (e10 == 1) {
                            r0Var.b();
                        } else if (e10 == 4) {
                            r0Var.Q(-9223372036854775807L, r0Var.z());
                        }
                        ((D.n) r0Var).f(true);
                    }
                }
            }
        }
        return true;
    }

    public final void c(F0.S s9) {
        RecyclerView recyclerView = this.f6056D0;
        if (recyclerView != null) {
            recyclerView.setAdapter(s9);
        }
        TextView textView = this.f6057E0;
        if (textView != null) {
            if (s9 instanceof C0379w) {
                textView.setText(R.string.exo_settings_label_settings);
            } else if (!(s9 instanceof C0381y) && !(s9 instanceof C0373p)) {
                if (s9 instanceof C0376t) {
                    textView.setText(R.string.exo_settings_label_speed);
                }
            } else {
                textView.setText(R.string.exo_settings_label_subtitle);
            }
        }
        ImageView imageView = this.f6058F0;
        if (imageView != null) {
            if (!(s9 instanceof C0381y) && !(s9 instanceof C0373p)) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
            }
        }
        Resources resources = this.f6054C0;
        int i9 = resources.getConfiguration().orientation;
        PopupWindow popupWindow = this.f6061I0;
        if (i9 != 1) {
            popupWindow.setHeight(-1);
        } else {
            popupWindow.setHeight(resources.getDimensionPixelSize(R.dimen.mini_player_height));
        }
        int i10 = this.f6054C0.getConfiguration().orientation;
        PopupWindow popupWindow2 = this.f6061I0;
        if (i10 == 1) {
            int[] iArr = new int[2];
            getLocationInWindow(iArr);
            popupWindow2.showAtLocation(this, 48, 0, iArr[1]);
            return;
        }
        popupWindow2.showAtLocation(this, 48, 0, 0);
    }

    public final P5.S d(G0 g02, int i9) {
        AbstractC0349q.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        P5.F f9 = g02.f19338a;
        int i10 = 0;
        for (int i11 = 0; i11 < f9.size(); i11++) {
            F0 f02 = (F0) f9.get(i11);
            if (f02.f19326b.f5166c == i9) {
                for (int i12 = 0; i12 < f02.f19325a; i12++) {
                    if (f02.a(i12)) {
                        j3.M m9 = f02.f19326b.f5167d[i12];
                        if ((m9.f19428d & 2) == 0) {
                            String G8 = this.f6066N0.G(m9);
                            if (i9 != 3 || !G8.equals(this.f6054C0.getString(R.string.exo_track_unknown))) {
                                z zVar = new z(g02, i11, i12, G8);
                                int i13 = i10 + 1;
                                if (objArr.length < i13) {
                                    objArr = Arrays.copyOf(objArr, P5.C.e(objArr.length, i13));
                                }
                                objArr[i10] = zVar;
                                i10 = i13;
                            }
                        }
                    }
                }
            }
        }
        return P5.F.k(i10, objArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!b(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public final void e() {
        I i9 = this.f6052B0;
        int i10 = i9.f6155z;
        if (i10 != 3 && i10 != 2) {
            i9.f();
            if (!i9.f6130C) {
                i9.i(2);
            } else if (i9.f6155z == 1) {
                i9.f6142m.start();
            } else {
                i9.f6143n.start();
            }
        }
    }

    public final boolean f() {
        I i9 = this.f6052B0;
        if (i9.f6155z == 0 && i9.f6131a.g()) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public InterfaceC0362e getControlAction() {
        return this.f6075b;
    }

    public r0 getPlayer() {
        return this.f6093m0;
    }

    public int getRepeatToggleModes() {
        return this.f6110v0;
    }

    public boolean getShowShuffleButton() {
        return this.f6052B0.b(this.f6090l);
    }

    public boolean getShowSubtitleButton() {
        return this.f6052B0.b(this.f6067O0);
    }

    public int getShowTimeoutMs() {
        return this.f6106t0;
    }

    public boolean getShowVrButton() {
        return this.f6052B0.b(this.f6092m);
    }

    public final void h() {
        int i9 = 1;
        if (this.f6095n0 != null) {
            boolean z9 = this.f6097o0;
            this.f6097o0 = !z9;
            ImageView imageView = this.f6069Q0;
            String str = this.f6091l0;
            Drawable drawable = this.f6087j0;
            String str2 = this.f6089k0;
            Drawable drawable2 = this.f6086i0;
            if (imageView != null) {
                if (!z9) {
                    imageView.setImageDrawable(drawable2);
                    imageView.setContentDescription(str2);
                } else {
                    imageView.setImageDrawable(drawable);
                    imageView.setContentDescription(str);
                }
            }
            ImageView imageView2 = this.f6070R0;
            boolean z10 = this.f6097o0;
            if (imageView2 != null) {
                if (z10) {
                    imageView2.setImageDrawable(drawable2);
                    imageView2.setContentDescription(str2);
                } else {
                    imageView2.setImageDrawable(drawable);
                    imageView2.setContentDescription(str);
                }
            }
            r rVar = this.f6095n0;
            if (rVar != null) {
                boolean z11 = this.f6097o0;
                M m9 = ((K) rVar).f6159c.f14467r;
                if (m9 != null) {
                    int i10 = PlayerActivity.f13798w0;
                    PlayerActivity playerActivity = ((C1228e) m9).f17663a;
                    if (z11) {
                        Y1.p(playerActivity);
                    }
                    if (z11) {
                        i9 = 6;
                    }
                    playerActivity.setRequestedOrientation(i9);
                }
            }
        }
    }

    public final void i() {
        l();
        k();
        o();
        p();
        r();
        m();
        q();
    }

    public final void j(View view, boolean z9) {
        float f9;
        if (view == null) {
            return;
        }
        view.setEnabled(z9);
        if (z9) {
            f9 = this.f6055D;
        } else {
            f9 = this.f6080f0;
        }
        view.setAlpha(f9);
    }

    public final void k() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j;
        long j4;
        int i9 = 0;
        if (g() && this.f6099p0) {
            r0 r0Var = this.f6093m0;
            if (r0Var != null) {
                D.n nVar = (D.n) r0Var;
                z10 = nVar.b0(5);
                z11 = nVar.b0(7);
                z12 = nVar.b0(11);
                z13 = nVar.b0(12);
                z9 = nVar.b0(9);
            } else {
                z9 = false;
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            Resources resources = this.f6054C0;
            View view = this.f6083h;
            if (z12) {
                r0 r0Var2 = this.f6093m0;
                if (r0Var2 != null) {
                    j4 = r0Var2.U();
                } else {
                    j4 = 5000;
                }
                int i10 = (int) (j4 / 1000);
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i10, Integer.valueOf(i10)));
                }
            }
            View view2 = this.f6081g;
            if (z13) {
                r0 r0Var3 = this.f6093m0;
                if (r0Var3 != null) {
                    j = r0Var3.i();
                } else {
                    j = 15000;
                }
                int i11 = (int) (j / 1000);
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i11, Integer.valueOf(i11)));
                }
            }
            j(this.f6077d, z11);
            j(view, z12);
            j(view2, z13);
            View view3 = this.f6078e;
            if (view3 != null) {
                if (!z9) {
                    i9 = 8;
                }
                view3.setVisibility(i9);
            }
            S s9 = this.f6098p;
            if (s9 != null) {
                ((AbstractC0364g) s9).setEnabled(z10);
            }
        }
    }

    public final void l() {
        View view;
        if (g() && this.f6099p0 && (view = this.f6079f) != null) {
            r0 r0Var = this.f6093m0;
            Resources resources = this.f6054C0;
            if (r0Var != null && r0Var.e() != 4 && this.f6093m0.e() != 1 && this.f6093m0.m()) {
                ((ImageView) view).setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_pause));
                view.setContentDescription(resources.getString(R.string.exo_controls_pause_description));
            } else {
                ((ImageView) view).setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_play));
                view.setContentDescription(resources.getString(R.string.exo_controls_play_description));
            }
        }
    }

    public final void m() {
        r0 r0Var = this.f6093m0;
        if (r0Var == null) {
            return;
        }
        float f9 = r0Var.c().f19694a;
        float f10 = Float.MAX_VALUE;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            C0376t c0376t = this.f6060H0;
            float[] fArr = c0376t.f6297e;
            if (i9 < fArr.length) {
                float abs = Math.abs(f9 - fArr[i9]);
                if (abs < f10) {
                    i10 = i9;
                    f10 = abs;
                }
                i9++;
            } else {
                c0376t.f6298f = i10;
                this.f6059G0.f6305e[0] = c0376t.f6296d[c0376t.f6298f];
                return;
            }
        }
    }

    public final void n() {
        long j;
        long j4;
        int e8;
        long j9;
        if (g() && this.f6099p0) {
            r0 r0Var = this.f6093m0;
            if (r0Var != null) {
                j = r0Var.k() + this.f6050A0;
                j4 = r0Var.N() + this.f6050A0;
            } else {
                j = 0;
                j4 = 0;
            }
            TextView textView = this.f6096o;
            if (textView != null && !this.f6104s0) {
                textView.setText(l4.y.A(this.f6100q, this.f6102r, j));
            }
            S s9 = this.f6098p;
            if (s9 != null) {
                ((T2.d) s9).setPosition(j);
                ((AbstractC0364g) s9).setBufferedPosition(j4);
            }
            A6.s sVar = this.f6107u;
            removeCallbacks(sVar);
            if (r0Var == null) {
                e8 = 1;
            } else {
                e8 = r0Var.e();
            }
            long j10 = 1000;
            if (r0Var != null && ((D.n) r0Var).d0()) {
                if (s9 != null) {
                    j9 = ((AbstractC0364g) s9).getPreferredUpdateDelay();
                } else {
                    j9 = 1000;
                }
                long min = Math.min(j9, 1000 - (j % 1000));
                float f9 = r0Var.c().f19694a;
                if (f9 > 0.0f) {
                    j10 = ((float) min) / f9;
                }
                postDelayed(sVar, l4.y.j(j10, this.f6108u0, 1000L));
                return;
            }
            if (e8 != 4 && e8 != 1) {
                postDelayed(sVar, 1000L);
            }
        }
    }

    public final void o() {
        ImageView imageView;
        if (g() && this.f6099p0 && (imageView = this.f6088k) != null) {
            if (this.f6110v0 == 0) {
                j(imageView, false);
                return;
            }
            r0 r0Var = this.f6093m0;
            String str = this.f6115y;
            Drawable drawable = this.f6109v;
            if (r0Var == null) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            int j = r0Var.j();
            if (j != 0) {
                if (j != 1) {
                    if (j == 2) {
                        imageView.setImageDrawable(this.f6113x);
                        imageView.setContentDescription(this.f6049A);
                        return;
                    }
                    return;
                }
                imageView.setImageDrawable(this.f6111w);
                imageView.setContentDescription(this.f6117z);
                return;
            }
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        I i9 = this.f6052B0;
        i9.f6131a.addOnLayoutChangeListener(i9.f6153x);
        this.f6099p0 = true;
        if (f()) {
            i9.g();
        }
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        I i9 = this.f6052B0;
        i9.f6131a.removeOnLayoutChangeListener(i9.f6153x);
        this.f6099p0 = false;
        removeCallbacks(this.f6107u);
        i9.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        View view = this.f6052B0.f6132b;
        if (view != null) {
            view.layout(0, 0, i11 - i9, i12 - i10);
        }
    }

    public final void p() {
        ImageView imageView;
        if (g() && this.f6099p0 && (imageView = this.f6090l) != null) {
            r0 r0Var = this.f6093m0;
            if (!this.f6052B0.b(imageView)) {
                j(imageView, false);
                return;
            }
            String str = this.f6084h0;
            Drawable drawable = this.f6053C;
            if (r0Var == null) {
                j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            j(imageView, true);
            if (r0Var.L()) {
                drawable = this.f6051B;
            }
            imageView.setImageDrawable(drawable);
            if (r0Var.L()) {
                str = this.f6082g0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.D.q():void");
    }

    public final void r() {
        C0381y c0381y = this.f6064L0;
        c0381y.getClass();
        List list = Collections.EMPTY_LIST;
        c0381y.f6046d = list;
        C0372o c0372o = this.f6065M0;
        c0372o.getClass();
        c0372o.f6046d = list;
        r0 r0Var = this.f6093m0;
        View view = this.f6067O0;
        boolean z9 = false;
        if (r0Var != null && ((D.n) r0Var).b0(30) && ((D.n) this.f6093m0).b0(29)) {
            G0 q9 = this.f6093m0.q();
            P5.S d9 = d(q9, 1);
            c0372o.f6046d = d9;
            D d10 = c0372o.f6287f;
            r0 r0Var2 = d10.f6093m0;
            r0Var2.getClass();
            i4.v M7 = r0Var2.M();
            boolean isEmpty = d9.isEmpty();
            C0379w c0379w = d10.f6059G0;
            if (isEmpty) {
                c0379w.f6305e[1] = d10.getResources().getString(R.string.exo_track_selection_none);
            } else if (!c0372o.q(M7)) {
                c0379w.f6305e[1] = d10.getResources().getString(R.string.exo_track_selection_auto);
            } else {
                int i9 = 0;
                while (true) {
                    if (i9 >= d9.f5928d) {
                        break;
                    }
                    z zVar = (z) d9.get(i9);
                    if (zVar.a()) {
                        c0379w.f6305e[1] = zVar.f6313c;
                        break;
                    }
                    i9++;
                }
            }
            if (this.f6052B0.b(view)) {
                P5.S d11 = d(q9, 3);
                for (int i10 = 0; i10 < d11.size() && !((z) d11.get(i10)).a(); i10++) {
                }
                c0381y.f6046d = d11;
            } else {
                P5.S s9 = P5.S.f5926e;
                for (int i11 = 0; i11 < s9.size() && !((z) s9.get(i11)).a(); i11++) {
                }
                c0381y.f6046d = s9;
            }
        }
        if (!(this.f6093m0 instanceof o3.e)) {
            if (c0381y.a() > 0) {
                z9 = true;
            }
            j(view, z9);
        }
    }

    public void setAnimationEnabled(boolean z9) {
        this.f6052B0.f6130C = z9;
    }

    public void setCastMediaTrack(List<MediaTrack> list) {
        j(this.f6067O0, !list.isEmpty());
        C0373p c0373p = this.f6063K0;
        ArrayList arrayList = c0373p.f6288d;
        arrayList.clear();
        arrayList.add(c0373p.f6290f);
        arrayList.addAll(list);
    }

    public void setOnBackListener(InterfaceC0362e interfaceC0362e) {
        this.f6075b = interfaceC0362e;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(r rVar) {
        boolean z9;
        this.f6095n0 = rVar;
        boolean z10 = true;
        if (rVar != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ImageView imageView = this.f6069Q0;
        if (imageView != null) {
            if (z9) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        if (rVar == null) {
            z10 = false;
        }
        ImageView imageView2 = this.f6070R0;
        if (imageView2 == null) {
            return;
        }
        if (z10) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setOnSubtitleClickListener(O.a aVar) {
        this.f6063K0.f6289e = aVar;
    }

    public void setPlayer(r0 r0Var) {
        boolean z9;
        boolean z10 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        if (r0Var == null || r0Var.J() == Looper.getMainLooper()) {
            z10 = true;
        }
        AbstractC1566a.h(z10);
        r0 r0Var2 = this.f6093m0;
        if (r0Var2 == r0Var) {
            return;
        }
        ViewOnClickListenerC0374q viewOnClickListenerC0374q = this.f6074a;
        if (r0Var2 != null) {
            r0Var2.x(viewOnClickListenerC0374q);
        }
        this.f6093m0 = r0Var;
        if (r0Var != null) {
            r0Var.y(viewOnClickListenerC0374q);
        }
        i();
    }

    public void setRepeatToggleModes(int i9) {
        this.f6110v0 = i9;
        r0 r0Var = this.f6093m0;
        boolean z9 = false;
        if (r0Var != null) {
            int j = r0Var.j();
            if (i9 == 0 && j != 0) {
                this.f6093m0.h(0);
            } else if (i9 == 1 && j == 2) {
                this.f6093m0.h(1);
            } else if (i9 == 2 && j == 1) {
                this.f6093m0.h(2);
            }
        }
        if (i9 != 0) {
            z9 = true;
        }
        this.f6052B0.h(this.f6088k, z9);
        o();
    }

    public void setShowFastForwardButton(boolean z9) {
        this.f6052B0.h(this.f6081g, z9);
        k();
    }

    public void setShowMultiWindowTimeBar(boolean z9) {
        this.f6101q0 = z9;
        q();
    }

    public void setShowNextButton(boolean z9) {
        this.f6052B0.h(this.f6078e, z9);
        k();
    }

    public void setShowPreviousButton(boolean z9) {
        this.f6052B0.h(this.f6077d, z9);
        k();
    }

    public void setShowRewindButton(boolean z9) {
        this.f6052B0.h(this.f6083h, z9);
        k();
    }

    public void setShowShuffleButton(boolean z9) {
        this.f6052B0.h(this.f6090l, z9);
        p();
    }

    public void setShowSubtitleButton(boolean z9) {
        this.f6052B0.h(this.f6067O0, z9);
    }

    public void setShowTimeoutMs(int i9) {
        this.f6106t0 = i9;
        if (f()) {
            this.f6052B0.g();
        }
    }

    public void setShowVrButton(boolean z9) {
        this.f6052B0.h(this.f6092m, z9);
    }

    public void setTimeBarMinUpdateInterval(int i9) {
        this.f6108u0 = l4.y.i(i9, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z9;
        View view = this.f6092m;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            if (onClickListener != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            j(view, z9);
        }
    }

    public void setProgressUpdateListener(InterfaceC0377u interfaceC0377u) {
    }
}
