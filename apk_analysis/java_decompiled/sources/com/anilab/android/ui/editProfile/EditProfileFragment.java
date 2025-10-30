package com.anilab.android.ui.editProfile;

import A7.e;
import A7.f;
import B7.j;
import G0.C0142h;
import H2.y;
import J1.H;
import N1.s;
import N1.t;
import S1.c;
import S1.k;
import S1.l;
import S1.m;
import W.g;
import W7.d;
import Y2.r;
import Y7.B;
import Z0.a;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.Y;
import co.notix.R;
import com.anilab.android.ui.editProfile.EditProfileFragment;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import d.C1082w;
import i0.AbstractActivityC1369y;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import t1.C1992a;
import t1.C2004m;

/* loaded from: classes.dex */
public final class EditProfileFragment extends m<l, H> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13751D0;

    /* renamed from: E0, reason: collision with root package name */
    public final A7.l f13752E0;

    /* renamed from: F0, reason: collision with root package name */
    public final A7.l f13753F0;

    public EditProfileFragment() {
        e p9 = a.p(f.f545a, new N1.r(7, new N1.r(6, this)));
        this.f13751D0 = M4.a.i(this, p.a(l.class), new s(p9, 8), new s(p9, 9), new t(this, p9, 4));
        final int i9 = 0;
        this.f13752E0 = a.q(new O7.a(this) { // from class: S1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditProfileFragment f6709b;

            {
                this.f6709b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return new a(new C0142h(1, this.f6709b, EditProfileFragment.class, "onAvatarClick", "onAvatarClick(Lcom/anilab/domain/model/Avatar;)V", 0, 2));
                    default:
                        return new c(this.f6709b);
                }
            }
        });
        final int i10 = 1;
        this.f13753F0 = a.q(new O7.a(this) { // from class: S1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditProfileFragment f6709b;

            {
                this.f6709b = this;
            }

            @Override // O7.a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new a(new C0142h(1, this.f6709b, EditProfileFragment.class, "onAvatarClick", "onAvatarClick(Lcom/anilab/domain/model/Avatar;)V", 0, 2));
                    default:
                        return new c(this.f6709b);
                }
            }
        });
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_edit_profile;
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [kotlin.jvm.internal.g, O7.a] */
    @Override // M1.n
    public final void k0(int i9) {
        A7.l lVar = this.f13753F0;
        switch (i9) {
            case R.id.buttonBack /* 2131361905 */:
                ((c) lVar.getValue()).a();
                return;
            case R.id.buttonBackSelectAvatar /* 2131361906 */:
                ((c) lVar.getValue()).a();
                return;
            case R.id.buttonUpdate /* 2131361969 */:
                l h02 = h0();
                String name = d.j0(String.valueOf(((H) e0()).f3685x.getText())).toString();
                h02.getClass();
                h.e(name, "name");
                h02.d(true, new k(h02, name, null));
                return;
            case R.id.imageAvatar /* 2131362232 */:
                c cVar = (c) lVar.getValue();
                cVar.f16606a = true;
                ?? r5 = cVar.f16608c;
                if (r5 != 0) {
                    r5.invoke();
                }
                Group groupSelectAvatar = ((H) e0()).f3686y;
                h.d(groupSelectAvatar, "groupSelectAvatar");
                groupSelectAvatar.setVisibility(0);
                return;
            default:
                return;
        }
    }

    @Override // M1.n
    public final void l0() {
        B.r(Y.f(this), null, new S1.h(this, null), 3);
    }

    @Override // M1.n
    public final List m0(g gVar) {
        H h7 = (H) gVar;
        return B7.l.b0(h7.f3683v, h7.f3684w, h7.f3687z);
    }

    @Override // M1.n
    public final void n0(boolean z9) {
        int i9;
        View view = ((H) e0()).f3679A.f7853k;
        h.d(view, "getRoot(...)");
        if (z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        view.setVisibility(i9);
    }

    @Override // M1.n
    public final void p0() {
        C1082w L8;
        String str;
        y a5 = h0().f6727f.a();
        if (a5 != null) {
            AppCompatImageView imageAvatar = ((H) e0()).f3687z;
            h.d(imageAvatar, "imageAvatar");
            String str2 = a5.f3090d;
            if (str2 != null) {
                str = W7.l.J(str2, "150x150", "250x250");
            } else {
                str = null;
            }
            C2004m a9 = C1992a.a(imageAvatar.getContext());
            C1.h hVar = new C1.h(imageAvatar.getContext());
            hVar.f1179c = str;
            hVar.b(imageAvatar);
            hVar.f1181e = AbstractC1002u1.e0(j.o0(new F1.c[]{new F1.a()}));
            a9.b(hVar.a());
            ((H) e0()).f3685x.setText(a5.f3088b);
            ((H) e0()).f3681C.setText(a5.f3089c);
        }
        ((H) e0()).f3680B.setHasFixedSize(true);
        ((H) e0()).f3680B.setAdapter((S1.a) this.f13752E0.getValue());
        AbstractActivityC1369y k5 = k();
        if (k5 != null && (L8 = k5.L()) != null) {
            c onBackPressedCallback = (c) this.f13753F0.getValue();
            h.e(onBackPressedCallback, "onBackPressedCallback");
            L8.b(onBackPressedCallback);
        }
    }

    @Override // M1.n
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final l h0() {
        return (l) this.f13751D0.getValue();
    }
}
