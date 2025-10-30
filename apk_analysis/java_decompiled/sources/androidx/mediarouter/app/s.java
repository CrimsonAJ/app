package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import co.notix.R;
import i.DialogInterfaceC1321g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import l6.AbstractC1570b;
import s.C1935e;
import t0.C1988w;

/* loaded from: classes.dex */
public final class s extends DialogInterfaceC1321g {

    /* renamed from: N0, reason: collision with root package name */
    public static final int f10123N0;

    /* renamed from: A, reason: collision with root package name */
    public LinearLayout f10124A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f10125A0;

    /* renamed from: B, reason: collision with root package name */
    public RelativeLayout f10126B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f10127B0;

    /* renamed from: C, reason: collision with root package name */
    public LinearLayout f10128C;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f10129C0;

    /* renamed from: D, reason: collision with root package name */
    public View f10130D;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f10131D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f10132E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f10133F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f10134G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f10135H0;

    /* renamed from: I0, reason: collision with root package name */
    public Interpolator f10136I0;

    /* renamed from: J0, reason: collision with root package name */
    public final Interpolator f10137J0;

    /* renamed from: K0, reason: collision with root package name */
    public final Interpolator f10138K0;

    /* renamed from: L0, reason: collision with root package name */
    public final AccessibilityManager f10139L0;

    /* renamed from: M0, reason: collision with root package name */
    public final RunnableC0572h f10140M0;

    /* renamed from: X, reason: collision with root package name */
    public OverlayListView f10141X;
    public r Y;

    /* renamed from: Z, reason: collision with root package name */
    public ArrayList f10142Z;

    /* renamed from: f0, reason: collision with root package name */
    public HashSet f10143f0;

    /* renamed from: g, reason: collision with root package name */
    public final t0.D f10144g;

    /* renamed from: g0, reason: collision with root package name */
    public HashSet f10145g0;

    /* renamed from: h, reason: collision with root package name */
    public final F f10146h;

    /* renamed from: h0, reason: collision with root package name */
    public HashSet f10147h0;

    /* renamed from: i, reason: collision with root package name */
    public final t0.C f10148i;

    /* renamed from: i0, reason: collision with root package name */
    public SeekBar f10149i0;
    public final Context j;

    /* renamed from: j0, reason: collision with root package name */
    public q f10150j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10151k;

    /* renamed from: k0, reason: collision with root package name */
    public t0.C f10152k0;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10153l;

    /* renamed from: l0, reason: collision with root package name */
    public int f10154l0;

    /* renamed from: m, reason: collision with root package name */
    public int f10155m;

    /* renamed from: m0, reason: collision with root package name */
    public int f10156m0;

    /* renamed from: n, reason: collision with root package name */
    public Button f10157n;

    /* renamed from: n0, reason: collision with root package name */
    public int f10158n0;

    /* renamed from: o, reason: collision with root package name */
    public Button f10159o;

    /* renamed from: o0, reason: collision with root package name */
    public final int f10160o0;

    /* renamed from: p, reason: collision with root package name */
    public ImageButton f10161p;

    /* renamed from: p0, reason: collision with root package name */
    public HashMap f10162p0;

    /* renamed from: q, reason: collision with root package name */
    public MediaRouteExpandCollapseButton f10163q;

    /* renamed from: q0, reason: collision with root package name */
    public O0.c f10164q0;

    /* renamed from: r, reason: collision with root package name */
    public FrameLayout f10165r;
    public final p r0;

    /* renamed from: s, reason: collision with root package name */
    public LinearLayout f10166s;

    /* renamed from: s0, reason: collision with root package name */
    public PlaybackStateCompat f10167s0;

    /* renamed from: t, reason: collision with root package name */
    public FrameLayout f10168t;

    /* renamed from: t0, reason: collision with root package name */
    public MediaDescriptionCompat f10169t0;

    /* renamed from: u, reason: collision with root package name */
    public ImageView f10170u;

    /* renamed from: u0, reason: collision with root package name */
    public AsyncTaskC0579o f10171u0;

    /* renamed from: v, reason: collision with root package name */
    public TextView f10172v;

    /* renamed from: v0, reason: collision with root package name */
    public Bitmap f10173v0;

    /* renamed from: w, reason: collision with root package name */
    public TextView f10174w;

    /* renamed from: w0, reason: collision with root package name */
    public Uri f10175w0;

    /* renamed from: x, reason: collision with root package name */
    public TextView f10176x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f10177x0;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f10178y;

    /* renamed from: y0, reason: collision with root package name */
    public Bitmap f10179y0;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f10180z;

    /* renamed from: z0, reason: collision with root package name */
    public int f10181z0;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
        f10123N0 = (int) TimeUnit.SECONDS.toMillis(30L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(android.content.Context r4) {
        /*
            r3 = this;
            r0 = 1
            android.view.ContextThemeWrapper r4 = s8.e.q(r4, r0)
            r1 = 2130969431(0x7f040357, float:1.7547544E38)
            int r1 = s8.e.H(r4, r1)
            if (r1 != 0) goto L12
            int r1 = s8.e.E(r4)
        L12:
            r3.<init>(r4, r1)
            r3.f10178y = r0
            androidx.mediarouter.app.h r0 = new androidx.mediarouter.app.h
            r1 = 0
            r0.<init>(r1, r3)
            r3.f10140M0 = r0
            android.content.Context r0 = r3.getContext()
            r3.j = r0
            androidx.mediarouter.app.p r1 = new androidx.mediarouter.app.p
            r2 = 0
            r1.<init>(r3, r2)
            r3.r0 = r1
            t0.D r1 = t0.D.d(r0)
            r3.f10144g = r1
            boolean r1 = t0.D.g()
            r3.f10180z = r1
            androidx.mediarouter.app.F r1 = new androidx.mediarouter.app.F
            r2 = 3
            r1.<init>(r3, r2)
            r3.f10146h = r1
            t0.C r1 = t0.D.f()
            r3.f10148i = r1
            android.support.v4.media.session.MediaSessionCompat$Token r1 = t0.D.e()
            r3.o(r1)
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131166253(0x7f07042d, float:1.7946746E38)
            int r1 = r1.getDimensionPixelSize(r2)
            r3.f10160o0 = r1
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r3.f10139L0 = r0
            r0 = 2131492879(0x7f0c000f, float:1.8609222E38)
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r4, r0)
            r3.f10137J0 = r0
            r0 = 2131492878(0x7f0c000e, float:1.860922E38)
            android.view.animation.Interpolator r4 = android.view.animation.AnimationUtils.loadInterpolator(r4, r0)
            r3.f10138K0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.s.<init>(android.content.Context):void");
    }

    public static void n(View view, int i9) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i9;
        view.setLayoutParams(layoutParams);
    }

    public final void g(View view, int i9) {
        C0575k c0575k = new C0575k(view.getLayoutParams().height, i9, 0, view);
        c0575k.setDuration(this.f10133F0);
        c0575k.setInterpolator(this.f10136I0);
        view.startAnimation(c0575k);
    }

    public final boolean h() {
        if (this.f10169t0 == null && this.f10167s0 == null) {
            return false;
        }
        return true;
    }

    public final void i(boolean z9) {
        HashSet hashSet;
        int firstVisiblePosition = this.f10141X.getFirstVisiblePosition();
        for (int i9 = 0; i9 < this.f10141X.getChildCount(); i9++) {
            View childAt = this.f10141X.getChildAt(i9);
            t0.C c3 = (t0.C) this.Y.getItem(firstVisiblePosition + i9);
            if (!z9 || (hashSet = this.f10143f0) == null || !hashSet.contains(c3)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        ArrayList arrayList = this.f10141X.f10058a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            O o9 = (O) obj;
            o9.j = true;
            o9.f10056k = true;
            O0.c cVar = o9.f10057l;
            if (cVar != null) {
                s sVar = (s) cVar.f5264c;
                sVar.f10147h0.remove((t0.C) cVar.f5263b);
                sVar.Y.notifyDataSetChanged();
            }
        }
        if (!z9) {
            j(false);
        }
    }

    public final void j(boolean z9) {
        this.f10143f0 = null;
        this.f10145g0 = null;
        this.f10131D0 = false;
        if (this.f10132E0) {
            this.f10132E0 = false;
            s(z9);
        }
        this.f10141X.setEnabled(true);
    }

    public final int k(int i9, int i10) {
        if (i9 >= i10) {
            return (int) (((this.f10155m * i10) / i9) + 0.5f);
        }
        return (int) (((this.f10155m * 9.0f) / 16.0f) + 0.5f);
    }

    public final int l(boolean z9) {
        if (!z9 && this.f10128C.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.f10124A.getPaddingBottom() + this.f10124A.getPaddingTop();
        if (z9) {
            paddingBottom += this.f10126B.getMeasuredHeight();
        }
        if (this.f10128C.getVisibility() == 0) {
            paddingBottom += this.f10128C.getMeasuredHeight();
        }
        if (z9 && this.f10128C.getVisibility() == 0) {
            return this.f10130D.getMeasuredHeight() + paddingBottom;
        }
        return paddingBottom;
    }

    public final boolean m() {
        t0.C c3 = this.f10148i;
        if (c3.e() && Collections.unmodifiableList(c3.f22860v).size() > 1) {
            return true;
        }
        return false;
    }

    public final void o(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        MediaDescriptionCompat a5;
        PlaybackStateCompat e8;
        O0.c cVar = this.f10164q0;
        p pVar = this.r0;
        PlaybackStateCompat playbackStateCompat = null;
        if (cVar != null) {
            cVar.R(pVar);
            this.f10164q0 = null;
        }
        if (mediaSessionCompat$Token == null || !this.f10153l) {
            return;
        }
        O0.c cVar2 = new O0.c(this.j, mediaSessionCompat$Token);
        this.f10164q0 = cVar2;
        cVar2.L(pVar);
        MediaMetadata metadata = ((android.support.v4.media.session.h) this.f10164q0.f5263b).f9304a.getMetadata();
        if (metadata != null) {
            C1935e c1935e = MediaMetadataCompat.f9249d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            mediaMetadataCompat.f9254b = metadata;
        } else {
            mediaMetadataCompat = null;
        }
        if (mediaMetadataCompat == null) {
            a5 = null;
        } else {
            a5 = mediaMetadataCompat.a();
        }
        this.f10169t0 = a5;
        android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f10164q0.f5263b;
        MediaSessionCompat$Token mediaSessionCompat$Token2 = hVar.f9308e;
        if (mediaSessionCompat$Token2.a() != null) {
            try {
                e8 = mediaSessionCompat$Token2.a().e();
            } catch (RemoteException e9) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e9);
            }
            this.f10167s0 = e8;
            q();
            p(false);
        }
        PlaybackState playbackState = hVar.f9304a.getPlaybackState();
        if (playbackState != null) {
            playbackStateCompat = PlaybackStateCompat.a(playbackState);
        }
        e8 = playbackStateCompat;
        this.f10167s0 = e8;
        q();
        p(false);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10153l = true;
        this.f10144g.a(C1988w.f23046c, this.f10146h, 2);
        o(t0.D.e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // i.DialogInterfaceC1321g, i.y, d.DialogC1072m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Interpolator interpolator;
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        ViewOnClickListenerC0578n viewOnClickListenerC0578n = new ViewOnClickListenerC0578n(this, 0);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.f10165r = frameLayout;
        frameLayout.setOnClickListener(new ViewOnClickListenerC0578n(this, 2));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.f10166s = linearLayout;
        linearLayout.setOnClickListener(new Object());
        Context context = this.j;
        int G8 = s8.e.G(context, R.attr.colorPrimary);
        if (H.a.c(G8, s8.e.G(context, android.R.attr.colorBackground)) < 3.0d) {
            G8 = s8.e.G(context, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.f10157n = button;
        button.setText(R.string.mr_controller_disconnect);
        this.f10157n.setTextColor(G8);
        this.f10157n.setOnClickListener(viewOnClickListenerC0578n);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.f10159o = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.f10159o.setTextColor(G8);
        this.f10159o.setOnClickListener(viewOnClickListenerC0578n);
        this.f10176x = (TextView) findViewById(R.id.mr_name);
        ((ImageButton) findViewById(R.id.mr_close)).setOnClickListener(viewOnClickListenerC0578n);
        this.f10168t = (FrameLayout) findViewById(R.id.mr_default_control);
        ViewOnClickListenerC0578n viewOnClickListenerC0578n2 = new ViewOnClickListenerC0578n(this, 3);
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.f10170u = imageView;
        imageView.setOnClickListener(viewOnClickListenerC0578n2);
        findViewById(R.id.mr_control_title_container).setOnClickListener(viewOnClickListenerC0578n2);
        this.f10124A = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.f10130D = findViewById(R.id.mr_control_divider);
        this.f10126B = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.f10172v = (TextView) findViewById(R.id.mr_control_title);
        this.f10174w = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.f10161p = imageButton;
        imageButton.setOnClickListener(viewOnClickListenerC0578n);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.f10128C = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.f10149i0 = seekBar;
        t0.C c3 = this.f10148i;
        seekBar.setTag(c3);
        q qVar = new q(this);
        this.f10150j0 = qVar;
        this.f10149i0.setOnSeekBarChangeListener(qVar);
        this.f10141X = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.f10142Z = new ArrayList();
        r rVar = new r(this, this.f10141X.getContext(), this.f10142Z);
        this.Y = rVar;
        this.f10141X.setAdapter((ListAdapter) rVar);
        this.f10147h0 = new HashSet();
        LinearLayout linearLayout3 = this.f10124A;
        OverlayListView overlayListView = this.f10141X;
        boolean m9 = m();
        int G9 = s8.e.G(context, R.attr.colorPrimary);
        int G10 = s8.e.G(context, R.attr.colorPrimaryDark);
        if (m9 && s8.e.A(context) == -570425344) {
            G10 = G9;
            G9 = -1;
        }
        linearLayout3.setBackgroundColor(G9);
        overlayListView.setBackgroundColor(G10);
        linearLayout3.setTag(Integer.valueOf(G9));
        overlayListView.setTag(Integer.valueOf(G10));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.f10149i0;
        LinearLayout linearLayout4 = this.f10124A;
        int A2 = s8.e.A(context);
        if (Color.alpha(A2) != 255) {
            A2 = H.a.f(A2, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(A2, A2);
        HashMap hashMap = new HashMap();
        this.f10162p0 = hashMap;
        hashMap.put(c3, this.f10149i0);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.f10163q = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.f10003i = new ViewOnClickListenerC0578n(this, 1);
        if (this.f10129C0) {
            interpolator = this.f10137J0;
        } else {
            interpolator = this.f10138K0;
        }
        this.f10136I0 = interpolator;
        this.f10133F0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.f10134G0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.f10135H0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.f10151k = true;
        r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f10144g.h(this.f10146h);
        o(null);
        this.f10153l = false;
        super.onDetachedFromWindow();
    }

    @Override // i.DialogInterfaceC1321g, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i9, KeyEvent keyEvent) {
        int i10;
        if (i9 != 25 && i9 != 24) {
            return super.onKeyDown(i9, keyEvent);
        }
        if (this.f10180z || !this.f10129C0) {
            if (i9 == 25) {
                i10 = -1;
            } else {
                i10 = 1;
            }
            this.f10148i.k(i10);
        }
        return true;
    }

    @Override // i.DialogInterfaceC1321g, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 25 && i9 != 24) {
            return super.onKeyUp(i9, keyEvent);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r13) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.s.p(boolean):void");
    }

    public final void q() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.f10169t0;
        Uri uri2 = null;
        if (mediaDescriptionCompat == null) {
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.f9244e;
        }
        if (mediaDescriptionCompat != null) {
            uri2 = mediaDescriptionCompat.f9245f;
        }
        AsyncTaskC0579o asyncTaskC0579o = this.f10171u0;
        if (asyncTaskC0579o == null) {
            bitmap2 = this.f10173v0;
        } else {
            bitmap2 = asyncTaskC0579o.f10109a;
        }
        if (asyncTaskC0579o == null) {
            uri = this.f10175w0;
        } else {
            uri = asyncTaskC0579o.f10110b;
        }
        if (bitmap2 == bitmap) {
            if (bitmap2 == null) {
                if (uri == null || !uri.equals(uri2)) {
                    if (uri == null && uri2 == null) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        if (!m() || this.f10180z) {
            AsyncTaskC0579o asyncTaskC0579o2 = this.f10171u0;
            if (asyncTaskC0579o2 != null) {
                asyncTaskC0579o2.cancel(true);
            }
            AsyncTaskC0579o asyncTaskC0579o3 = new AsyncTaskC0579o(this);
            this.f10171u0 = asyncTaskC0579o3;
            asyncTaskC0579o3.execute(new Void[0]);
        }
    }

    public final void r() {
        Context context = this.j;
        int e8 = AbstractC1570b.e(context);
        getWindow().setLayout(e8, -2);
        View decorView = getWindow().getDecorView();
        this.f10155m = (e8 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.f10154l0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.f10156m0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.f10158n0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.f10173v0 = null;
        this.f10175w0 = null;
        q();
        p(false);
    }

    public final void s(boolean z9) {
        this.f10168t.requestLayout();
        this.f10168t.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0574j(this, z9));
    }

    public final void t(boolean z9) {
        int i9;
        View view = this.f10130D;
        int i10 = 0;
        if (this.f10128C.getVisibility() == 0 && z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        view.setVisibility(i9);
        LinearLayout linearLayout = this.f10124A;
        if (this.f10128C.getVisibility() == 8 && !z9) {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
    }
}
