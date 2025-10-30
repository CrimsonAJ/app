package com.anilab.android.ui.comment;

import A7.e;
import A7.f;
import A7.l;
import F0.C0111o;
import F0.Z;
import H2.c;
import H2.y;
import J1.E;
import K5.ViewOnClickListenerC0215a;
import M1.C;
import M1.D;
import M1.ViewOnClickListenerC0245a;
import M1.n;
import N1.s;
import N1.t;
import P.Q;
import P1.A;
import P1.C0329e;
import P1.C0330f;
import P1.C0332h;
import P1.F;
import P1.G;
import P1.H;
import P1.o;
import P1.q;
import W.g;
import W7.d;
import Y2.r;
import Y7.B;
import Z0.a;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.Y;
import androidx.recyclerview.widget.RecyclerView;
import co.notix.R;
import com.anilab.android.ui.activity.MainActivity;
import com.anilab.android.ui.comment.CommentListFragment;
import com.anilab.android.ui.player.PlayerActivity;
import com.google.android.gms.internal.measurement.Y1;
import i0.AbstractActivityC1369y;
import i0.AbstractC1336M;
import i0.C1334K;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class CommentListFragment extends H<G, E> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13741D0;

    /* renamed from: E0, reason: collision with root package name */
    public final l f13742E0;

    /* renamed from: F0, reason: collision with root package name */
    public final l f13743F0;

    public CommentListFragment() {
        e p9 = a.p(f.f545a, new N1.r(4, new N1.r(3, this)));
        this.f13741D0 = M4.a.i(this, p.a(G.class), new s(p9, 4), new s(p9, 5), new t(this, p9, 2));
        this.f13742E0 = a.q(new C0330f(this, 0));
        this.f13743F0 = a.q(new C0330f(this, 1));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_comment;
    }

    @Override // M1.n
    public final boolean g0() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [r2.b, android.app.Dialog] */
    @Override // M1.n
    public final void k0(int i9) {
        PlayerActivity playerActivity;
        switch (i9) {
            case R.id.buttonBack /* 2131361905 */:
                if (h0().f5706x) {
                    AbstractC1336M o9 = o();
                    o9.v(new C1334K(o9, null, -1, 0), false);
                    return;
                } else {
                    n.q0(this);
                    return;
                }
            case R.id.buttonClose /* 2131361912 */:
                if (h0().f5706x) {
                    AbstractC1336M o10 = o();
                    o10.v(new C1334K(o10, null, -1, 0), false);
                    return;
                } else {
                    n.q0(this);
                    return;
                }
            case R.id.buttonComment /* 2131361913 */:
                AbstractActivityC1369y k5 = k();
                if (k5 instanceof PlayerActivity) {
                    playerActivity = (PlayerActivity) k5;
                } else {
                    playerActivity = null;
                }
                if (playerActivity != null) {
                    Y1.p(playerActivity);
                }
                String obj = d.j0(String.valueOf(((E) e0()).f3657z.getText())).toString();
                if (obj.length() > 0) {
                    if (h0().j.a() != null) {
                        G h02 = h0();
                        h02.getClass();
                        h02.d(true, new P1.E(obj, h02, null));
                    } else {
                        t0();
                        return;
                    }
                }
                ((E) e0()).f3657z.setText("");
                return;
            case R.id.buttonDeleteComment /* 2131361917 */:
                AbstractActivityC1369y k9 = k();
                if (k9 != null) {
                    C0330f c0330f = new C0330f(this, 2);
                    String string = k9.getResources().getString(R.string.title_cancel);
                    C0330f c0330f2 = new C0330f(this, 3);
                    String string2 = k9.getResources().getString(R.string.title_delete);
                    String r5 = r(R.string.title_delete_comment);
                    h.d(r5, "getString(...)");
                    String string3 = k9.getResources().getString(R.string.message_confirm_delete_comment);
                    ?? dialog = new Dialog(k9);
                    dialog.f22591a = r5;
                    dialog.f22592b = string3;
                    dialog.f22593c = string2;
                    dialog.f22594d = string;
                    dialog.f22595e = c0330f2;
                    dialog.f22596f = c0330f;
                    dialog.show();
                    return;
                }
                return;
            case R.id.layoutActionComment /* 2131362292 */:
                y0(false);
                return;
            default:
                return;
        }
    }

    @Override // M1.n
    public final void l0() {
        B.r(Y.f(this), null, new o(null, this), 3);
        G h02 = h0();
        h02.getClass();
        h02.d(true, new A(h02, 1, null));
    }

    @Override // M1.n
    public final List m0(g gVar) {
        E e8 = (E) gVar;
        return B7.l.b0(e8.f3654w, e8.f3653v, e8.f3655x, e8.f3656y, e8.f3645A);
    }

    @Override // M1.n
    public final void n0(boolean z9) {
        int i9;
        View view = ((E) e0()).f3647C.f7853k;
        h.d(view, "getRoot(...)");
        if (z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        view.setVisibility(i9);
    }

    @Override // M1.n
    public final void o0(M1.E uiText) {
        String r5;
        I5.g gVar;
        h.e(uiText, "uiText");
        if (uiText instanceof C) {
            r5 = ((C) uiText).f4703a;
        } else if (uiText instanceof D) {
            r5 = r(((D) uiText).f4704a);
            h.d(r5, "getString(...)");
        } else {
            throw new RuntimeException();
        }
        I5.l g9 = I5.l.g(((E) e0()).f7853k, r5);
        E e8 = (E) e0();
        I5.g gVar2 = g9.f3562k;
        if (gVar2 != null) {
            gVar2.a();
        }
        RelativeLayout relativeLayout = e8.f3646B;
        if (relativeLayout == null) {
            gVar = null;
        } else {
            I5.g gVar3 = new I5.g(g9, relativeLayout);
            WeakHashMap weakHashMap = Q.f5546a;
            if (relativeLayout.isAttachedToWindow()) {
                relativeLayout.getViewTreeObserver().addOnGlobalLayoutListener(gVar3);
            }
            relativeLayout.addOnAttachStateChangeListener(gVar3);
            gVar = gVar3;
        }
        g9.f3562k = gVar;
        g9.h(new ViewOnClickListenerC0245a(1));
        g9.i();
    }

    @Override // M1.n
    public final void p0() {
        String str;
        String str2;
        boolean z9;
        C0111o c0111o;
        int i9;
        G h02 = h0();
        Bundle bundle = this.f18390f;
        long j = -1;
        if (bundle != null) {
            j = bundle.getLong("EXTRA_MOVIE_ID", -1L);
        }
        h02.f5705w = j;
        G h03 = h0();
        Bundle bundle2 = this.f18390f;
        if (bundle2 != null) {
            str = bundle2.getString("EXTRA_PARENT_ID", "");
        } else {
            str = null;
        }
        h03.f5707y = str;
        G h04 = h0();
        Bundle bundle3 = this.f18390f;
        if (bundle3 != null) {
            str2 = bundle3.getString("EXTRA_CHILD_ID", "");
        } else {
            str2 = null;
        }
        h04.f5708z = str2;
        G h05 = h0();
        Bundle bundle4 = this.f18390f;
        int i10 = 0;
        if (bundle4 != null) {
            z9 = bundle4.getBoolean("EXTRA_FROM_PLAYER", false);
        } else {
            z9 = false;
        }
        h05.f5706x = z9;
        final E e8 = (E) e0();
        C0329e c0329e = (C0329e) this.f13742E0.getValue();
        RecyclerView recyclerView = e8.f3649E;
        recyclerView.setAdapter(c0329e);
        recyclerView.j((C0332h) this.f13743F0.getValue());
        e8.f3650F.setOnRefreshListener(new N1.h(e8, 1, this));
        Z itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator instanceof C0111o) {
            c0111o = (C0111o) itemAnimator;
        } else {
            c0111o = null;
        }
        if (c0111o != null) {
            c0111o.f2178g = false;
        }
        e8.f3647C.f7853k.setBackground(null);
        AppCompatEditText editComment = e8.f3657z;
        h.d(editComment, "editComment");
        editComment.addTextChangedListener(new P1.p(e8, 0));
        editComment.setOnKeyListener(new View.OnKeyListener() { // from class: P1.g
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                Editable text;
                if (i11 == 67 && (text = J1.E.this.f3657z.getText()) != null && text.length() == 0) {
                    CommentListFragment commentListFragment = this;
                    ((J1.E) commentListFragment.e0()).f3657z.setHint(commentListFragment.r(R.string.hint_add_comment));
                    commentListFragment.h0().f5702t = null;
                    return false;
                }
                return false;
            }
        });
        boolean z10 = k() instanceof PlayerActivity;
        AppCompatImageView buttonBack = e8.f3653v;
        h.d(buttonBack, "buttonBack");
        if (!z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        buttonBack.setVisibility(i9);
        AppCompatImageView buttonClose = e8.f3654w;
        h.d(buttonClose, "buttonClose");
        if (!z10) {
            i10 = 4;
        }
        buttonClose.setVisibility(i10);
        if (z10) {
            e8.f7853k.setOnClickListener(new ViewOnClickListenerC0215a(5, this));
        }
    }

    @Override // M1.n
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final G h0() {
        return (G) this.f13741D0.getValue();
    }

    public final void t0() {
        if (!(k() instanceof MainActivity)) {
            o0(new D(R.string.msg_login_required));
        } else {
            i0(R.id.goToLogin, null);
        }
    }

    public final void u0(c cVar) {
        if (h0().j.a() != null) {
            G h02 = h0();
            h02.getClass();
            h02.d(false, new P1.D(h02, cVar, null));
            return;
        }
        t0();
    }

    public final void v0(c cVar) {
        PlayerActivity playerActivity;
        AbstractActivityC1369y k5 = k();
        if (k5 instanceof PlayerActivity) {
            playerActivity = (PlayerActivity) k5;
        } else {
            playerActivity = null;
        }
        if (playerActivity != null) {
            Y1.p(playerActivity);
        }
        h0().f5704v = cVar;
        y0(true);
    }

    public final void w0(c cVar) {
        String str;
        h0().f5702t = cVar;
        E e8 = (E) e0();
        y yVar = cVar.f2994i;
        InputMethodManager inputMethodManager = null;
        if (yVar != null) {
            str = yVar.f3088b;
        } else {
            str = null;
        }
        e8.f3657z.setHint(s(R.string.format_reply_comment, str));
        AppCompatEditText editComment = ((E) e0()).f3657z;
        h.d(editComment, "editComment");
        editComment.requestFocus();
        Object systemService = editComment.getContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) systemService;
        }
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editComment, 1);
        }
    }

    public final void x0(c cVar) {
        if (h0().j.a() != null) {
            G h02 = h0();
            h02.getClass();
            h02.d(false, new F(h02, cVar, null));
            return;
        }
        t0();
    }

    public final void y0(boolean z9) {
        float f9;
        float f10;
        Animation animation;
        Animation animation2 = ((E) e0()).f3648D.getAnimation();
        if (animation2 != null && animation2.hasStarted() && ((animation = ((E) e0()).f3648D.getAnimation()) == null || !animation.hasEnded())) {
            return;
        }
        int dimensionPixelSize = q().getDimensionPixelSize(R.dimen.dp_116);
        FrameLayout layoutActionComment = ((E) e0()).f3645A;
        h.d(layoutActionComment, "layoutActionComment");
        layoutActionComment.setVisibility(0);
        if (z9) {
            f9 = dimensionPixelSize;
        } else {
            f9 = 0.0f;
        }
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = dimensionPixelSize;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f9, f10);
        translateAnimation.setDuration(200L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setInterpolator(new LinearInterpolator());
        if (!z9) {
            translateAnimation.setAnimationListener(new q(0, this));
        }
        ((E) e0()).f3648D.startAnimation(translateAnimation);
    }
}
