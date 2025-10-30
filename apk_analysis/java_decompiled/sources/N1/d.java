package N1;

import G0.C0142h;
import H2.C0158a;
import H2.z;
import J1.AbstractC0164b1;
import J1.AbstractC0170d1;
import J1.C1;
import J1.I0;
import J1.M0;
import J1.W0;
import J1.f1;
import J1.k1;
import J1.m1;
import J1.u1;
import J1.w1;
import J1.z1;
import M1.AbstractC0249e;
import R1.C;
import T1.C0389c;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import co.notix.R;
import com.anilab.domain.model.FilterConfig;
import com.anilab.domain.model.Genre;
import com.anilab.domain.model.Movie;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import l2.C1550o;
import t1.C1992a;
import t1.C2004m;

/* loaded from: classes.dex */
public final class d extends M1.o {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4835u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f4836v;

    /* renamed from: w, reason: collision with root package name */
    public final W.g f4837w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AbstractC0249e abstractC0249e, W.g gVar, int i9) {
        super(gVar);
        this.f4835u = i9;
        this.f4836v = abstractC0249e;
        this.f4837w = gVar;
    }

    @Override // M1.o
    public final void r(Object obj) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29 = R.string.format_episode;
        int i30 = 2;
        J2.b bVar = J2.b.f4158c;
        View view = this.f2210a;
        int i31 = 8;
        Object obj2 = this.f4836v;
        W.g gVar = this.f4837w;
        final int i32 = 1;
        final int i33 = 0;
        switch (this.f4835u) {
            case 0:
                final Movie movie = (Movie) obj;
                f1 f1Var = (f1) gVar;
                AppCompatImageView imageMovie = f1Var.f3922v;
                kotlin.jvm.internal.h.d(imageMovie, "imageMovie");
                C2004m a5 = C1992a.a(imageMovie.getContext());
                C1.h hVar = new C1.h(imageMovie.getContext());
                hVar.f1179c = movie.f14415b;
                hVar.b(imageMovie);
                hVar.f1181e = AbstractC1002u1.e0(B7.j.o0(new F1.c[]{new F1.b(view.getResources().getDimensionPixelSize(R.dimen.dp_10))}));
                a5.b(hVar.a());
                String str = movie.f14431s;
                AppCompatTextView appCompatTextView = f1Var.f3925y;
                appCompatTextView.setText(str);
                if (!W7.d.U(str)) {
                    i9 = 0;
                } else {
                    i9 = 8;
                }
                appCompatTextView.setVisibility(i9);
                String str2 = movie.f14432t;
                AppCompatTextView appCompatTextView2 = f1Var.f3924x;
                appCompatTextView2.setText(str2);
                if (!W7.d.U(str2)) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                appCompatTextView2.setVisibility(i10);
                final f fVar = (f) obj2;
                boolean z9 = fVar.f4843f;
                View viewShadow = f1Var.f3926z;
                View view2 = f1Var.f7853k;
                AppCompatTextView appCompatTextView3 = f1Var.f3923w;
                if (z9 && (i11 = movie.f14423k) > 0 && movie.f14421h == bVar) {
                    Context context = view2.getContext();
                    if (i11 < 10) {
                        i29 = R.string.format_0episode;
                    }
                    appCompatTextView3.setText(context.getString(i29, Integer.valueOf(i11)));
                    appCompatTextView3.setVisibility(0);
                    kotlin.jvm.internal.h.d(viewShadow, "viewShadow");
                    viewShadow.setVisibility(0);
                } else {
                    appCompatTextView3.setText("");
                    appCompatTextView3.setVisibility(8);
                    kotlin.jvm.internal.h.d(viewShadow, "viewShadow");
                    viewShadow.setVisibility(8);
                }
                view2.setOnClickListener(new View.OnClickListener() { // from class: N1.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        switch (i33) {
                            case 0:
                                fVar.f4844g.invoke(movie);
                                return;
                            default:
                                fVar.f4844g.invoke(movie);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final Movie movie2 = (Movie) obj;
                M0 m02 = (M0) gVar;
                AppCompatImageView imageMovie2 = m02.f3723w;
                kotlin.jvm.internal.h.d(imageMovie2, "imageMovie");
                C2004m a9 = C1992a.a(imageMovie2.getContext());
                C1.h hVar2 = new C1.h(imageMovie2.getContext());
                hVar2.f1179c = movie2.f14415b;
                hVar2.b(imageMovie2);
                hVar2.f1181e = AbstractC1002u1.e0(B7.j.o0(new F1.c[]{new F1.b(view.getResources().getDimensionPixelSize(R.dimen.dp_10))}));
                a9.b(hVar2.a());
                m02.f3724x.setText(movie2.a());
                String str3 = movie2.f14431s;
                AppCompatTextView appCompatTextView4 = m02.f3720A;
                appCompatTextView4.setText(str3);
                if (!W7.d.U(str3)) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                appCompatTextView4.setVisibility(i12);
                String str4 = movie2.f14432t;
                AppCompatTextView appCompatTextView5 = m02.f3726z;
                appCompatTextView5.setText(str4);
                if (!W7.d.U(str4)) {
                    i31 = 0;
                }
                appCompatTextView5.setVisibility(i31);
                m02.f3725y.setText(movie2.f14416c);
                m02.f3721B.setText(String.valueOf(movie2.f14420g));
                boolean z10 = movie2.f14428p;
                int i34 = android.R.color.transparent;
                int i35 = R.color.colorRed;
                if (z10) {
                    i13 = R.color.colorRed;
                } else {
                    i13 = 17170445;
                }
                MaterialButton materialButton = m02.f3722v;
                materialButton.setStrokeColorResource(i13);
                View view3 = m02.f7853k;
                Context context2 = view3.getContext();
                if (!movie2.f14428p) {
                    i34 = R.color.colorRed;
                }
                materialButton.setBackgroundColor(context2.getColor(i34));
                if (movie2.f14428p) {
                    i14 = R.drawable.ic_tick_red;
                } else {
                    i14 = R.drawable.ic_add;
                }
                materialButton.setIconResource(i14);
                if (movie2.f14428p) {
                    i15 = R.color.colorRed;
                } else {
                    i15 = 17170443;
                }
                materialButton.setIconTintResource(i15);
                Context context3 = view3.getContext();
                if (!movie2.f14428p) {
                    i35 = 17170443;
                }
                materialButton.setTextColor(context3.getColor(i35));
                final f fVar2 = (f) obj2;
                view3.setOnClickListener(new View.OnClickListener() { // from class: N1.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view32) {
                        switch (i32) {
                            case 0:
                                fVar2.f4844g.invoke(movie2);
                                return;
                            default:
                                fVar2.f4844g.invoke(movie2);
                                return;
                        }
                    }
                });
                materialButton.setOnClickListener(new e(fVar2, movie2, this, i33));
                return;
            case 2:
                H2.i iVar = (H2.i) obj;
                w1 w1Var = (w1) gVar;
                w1Var.f4125w.setText(view.getResources().getString(R.string.format_episode, Integer.valueOf(iVar.f3028c)));
                AppCompatImageView imageMovie3 = w1Var.f4124v;
                kotlin.jvm.internal.h.d(imageMovie3, "imageMovie");
                C c3 = (C) obj2;
                String str5 = c3.f6507e;
                C2004m a10 = C1992a.a(imageMovie3.getContext());
                C1.h hVar3 = new C1.h(imageMovie3.getContext());
                hVar3.f1179c = str5;
                hVar3.b(imageMovie3);
                hVar3.f1181e = AbstractC1002u1.e0(B7.j.o0(new F1.c[]{new F1.b(view.getResources().getDimensionPixelSize(R.dimen.dp_10))}));
                a10.b(hVar3.a());
                FrameLayout viewSelectEpisode = w1Var.f4126x;
                kotlin.jvm.internal.h.d(viewSelectEpisode, "viewSelectEpisode");
                if (c3.f6510h == b()) {
                    i31 = 0;
                }
                viewSelectEpisode.setVisibility(i31);
                w1Var.f7853k.setOnClickListener(new e(c3, iVar, this, i32));
                return;
            case 3:
                C0158a c0158a = (C0158a) obj;
                I0 i02 = (I0) gVar;
                AppCompatImageView imageAvatar = i02.f3694v;
                kotlin.jvm.internal.h.d(imageAvatar, "imageAvatar");
                C2004m a11 = C1992a.a(imageAvatar.getContext());
                C1.h hVar4 = new C1.h(imageAvatar.getContext());
                hVar4.f1179c = c0158a.f2979b;
                hVar4.b(imageAvatar);
                a11.b(hVar4.a());
                i02.f7853k.setOnClickListener(new I5.k((S1.a) obj2, 3, c0158a));
                return;
            case 4:
                H2.t tVar = (H2.t) obj;
                k1 k1Var = (k1) gVar;
                AppCompatImageView appCompatImageView = k1Var.f3978A;
                C0389c c0389c = (C0389c) obj2;
                if (c0389c.f7010e == c()) {
                    i16 = R.drawable.ic_player_selected;
                } else {
                    i16 = R.drawable.ic_player_unselected;
                }
                appCompatImageView.setImageResource(i16);
                View viewBackgroundSelected = k1Var.f3983z;
                kotlin.jvm.internal.h.d(viewBackgroundSelected, "viewBackgroundSelected");
                if (c0389c.f7010e != c()) {
                    i32 = 0;
                }
                if (i32 != 0) {
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                viewBackgroundSelected.setVisibility(i17);
                k1Var.f3980w.setRating(tVar.f3062f / 2);
                long j = tVar.f3057a;
                View view4 = k1Var.f7853k;
                AppCompatTextView textRecommend = k1Var.f3982y;
                AppCompatTextView appCompatTextView6 = k1Var.f3981x;
                AppCompatImageView imagePlayerLogo = k1Var.f3979v;
                if (j == -1) {
                    kotlin.jvm.internal.h.d(imagePlayerLogo, "imagePlayerLogo");
                    Integer valueOf = Integer.valueOf(R.drawable.ic_app);
                    C2004m a12 = C1992a.a(imagePlayerLogo.getContext());
                    C1.h hVar5 = new C1.h(imagePlayerLogo.getContext());
                    hVar5.f1179c = valueOf;
                    hVar5.b(imagePlayerLogo);
                    a12.b(hVar5.a());
                    appCompatTextView6.setText(view4.getContext().getString(R.string.app_name));
                    kotlin.jvm.internal.h.d(textRecommend, "textRecommend");
                    textRecommend.setVisibility(0);
                } else {
                    kotlin.jvm.internal.h.d(imagePlayerLogo, "imagePlayerLogo");
                    C2004m a13 = C1992a.a(imagePlayerLogo.getContext());
                    C1.h hVar6 = new C1.h(imagePlayerLogo.getContext());
                    hVar6.f1179c = tVar.f3059c;
                    hVar6.b(imagePlayerLogo);
                    a13.b(hVar6.a());
                    appCompatTextView6.setText(tVar.f3058b);
                    kotlin.jvm.internal.h.d(textRecommend, "textRecommend");
                    if (tVar.f3061e) {
                        i31 = 0;
                    }
                    textRecommend.setVisibility(i31);
                }
                view4.setOnClickListener(new I5.k(c0389c, 4, this));
                k1Var.c0();
                return;
            case 5:
                FilterConfig filterConfig = (FilterConfig) obj;
                U1.a aVar = (U1.a) obj2;
                if (aVar.f7249e != c()) {
                    i32 = 0;
                }
                W0 w02 = (W0) gVar;
                AppCompatTextView appCompatTextView7 = w02.f3804v;
                if (i32 != 0) {
                    i18 = R.drawable.background_selected_calendar;
                } else {
                    i18 = R.drawable.background_calendar;
                }
                appCompatTextView7.setBackgroundResource(i18);
                Context context4 = view.getContext();
                if (i32 != 0) {
                    i19 = R.color.white;
                } else {
                    i19 = R.color.colorTextGray;
                }
                int color = context4.getColor(i19);
                AppCompatTextView appCompatTextView8 = w02.f3804v;
                appCompatTextView8.setTextColor(color);
                appCompatTextView8.setText(filterConfig.f14403a);
                appCompatTextView8.setOnClickListener(new I5.k(aVar, 5, this));
                return;
            case 6:
                Genre genre = (Genre) obj;
                U1.m mVar = (U1.m) obj2;
                boolean contains = mVar.f7276e.contains(genre);
                W0 w03 = (W0) gVar;
                AppCompatTextView appCompatTextView9 = w03.f3804v;
                if (contains) {
                    i20 = R.drawable.background_selected_calendar;
                } else {
                    i20 = R.drawable.background_calendar;
                }
                appCompatTextView9.setBackgroundResource(i20);
                AppCompatTextView appCompatTextView10 = w03.f3804v;
                appCompatTextView10.setText(genre.f14406b);
                Context context5 = view.getContext();
                if (contains) {
                    i21 = R.color.white;
                } else {
                    i21 = R.color.colorTextGray;
                }
                appCompatTextView10.setTextColor(context5.getColor(i21));
                appCompatTextView10.setOnClickListener(new e(mVar, genre, this, i30));
                return;
            case 7:
                Movie movie3 = (Movie) obj;
                f1 f1Var2 = (f1) gVar;
                AppCompatImageView imageMovie4 = f1Var2.f3922v;
                kotlin.jvm.internal.h.d(imageMovie4, "imageMovie");
                C2004m a14 = C1992a.a(imageMovie4.getContext());
                C1.h hVar7 = new C1.h(imageMovie4.getContext());
                hVar7.f1179c = movie3.f14415b;
                hVar7.b(imageMovie4);
                hVar7.f1181e = AbstractC1002u1.e0(B7.j.o0(new F1.c[]{new F1.b(view.getContext().getResources().getDimension(R.dimen.dp_10))}));
                a14.b(hVar7.a());
                String str6 = movie3.f14431s;
                AppCompatTextView appCompatTextView11 = f1Var2.f3925y;
                appCompatTextView11.setText(str6);
                if (!W7.d.U(str6)) {
                    i22 = 0;
                } else {
                    i22 = 8;
                }
                appCompatTextView11.setVisibility(i22);
                String str7 = movie3.f14432t;
                AppCompatTextView appCompatTextView12 = f1Var2.f3924x;
                appCompatTextView12.setText(str7);
                if (!W7.d.U(str7)) {
                    i31 = 0;
                }
                appCompatTextView12.setVisibility(i31);
                f1Var2.f7853k.setOnClickListener(new I5.k((V1.p) obj2, 6, movie3));
                return;
            case 8:
                Movie movie4 = (Movie) obj;
                AbstractC0170d1 abstractC0170d1 = (AbstractC0170d1) gVar;
                AppCompatImageView imageMovie5 = abstractC0170d1.f3887v;
                kotlin.jvm.internal.h.d(imageMovie5, "imageMovie");
                C2004m a15 = C1992a.a(imageMovie5.getContext());
                C1.h hVar8 = new C1.h(imageMovie5.getContext());
                hVar8.f1179c = movie4.f14415b;
                hVar8.b(imageMovie5);
                hVar8.f1181e = AbstractC1002u1.e0(B7.j.o0(new F1.c[]{new F1.b(view.getContext().getResources().getDimension(R.dimen.dp_10))}));
                a15.b(hVar8.a());
                String str8 = movie4.f14431s;
                AppCompatTextView appCompatTextView13 = abstractC0170d1.f3889x;
                appCompatTextView13.setText(str8);
                if (!W7.d.U(str8)) {
                    i23 = 0;
                } else {
                    i23 = 8;
                }
                appCompatTextView13.setVisibility(i23);
                String str9 = movie4.f14432t;
                AppCompatTextView appCompatTextView14 = abstractC0170d1.f3888w;
                appCompatTextView14.setText(str9);
                if (W7.d.U(str9)) {
                    i33 = 8;
                }
                appCompatTextView14.setVisibility(i33);
                abstractC0170d1.f7853k.setOnClickListener(new I5.k(this, i31, movie4));
                return;
            case 9:
                Movie movie5 = (Movie) obj;
                AbstractC0164b1 abstractC0164b1 = (AbstractC0164b1) gVar;
                AppCompatTextView appCompatTextView15 = abstractC0164b1.f3840x;
                String str10 = movie5.f14431s;
                appCompatTextView15.setText(str10);
                AppCompatTextView textRating = abstractC0164b1.f3840x;
                kotlin.jvm.internal.h.d(textRating, "textRating");
                if (!W7.d.U(str10)) {
                    i24 = 0;
                } else {
                    i24 = 8;
                }
                textRating.setVisibility(i24);
                String str11 = movie5.f14432t;
                AppCompatTextView appCompatTextView16 = abstractC0164b1.f3839w;
                appCompatTextView16.setText(str11);
                if (!W7.d.U(str11)) {
                    i31 = 0;
                }
                appCompatTextView16.setVisibility(i31);
                AppCompatImageView imageMovie6 = abstractC0164b1.f3838v;
                kotlin.jvm.internal.h.d(imageMovie6, "imageMovie");
                C2004m a16 = C1992a.a(imageMovie6.getContext());
                C1.h hVar9 = new C1.h(imageMovie6.getContext());
                hVar9.f1179c = movie5.f14415b;
                hVar9.b(imageMovie6);
                hVar9.f1181e = AbstractC1002u1.e0(B7.j.o0(new F1.c[]{new F1.b(view.getResources().getDimensionPixelSize(R.dimen.dp_10))}));
                a16.b(hVar9.a());
                abstractC0164b1.f7853k.setOnClickListener(new I5.k(this, 16, movie5));
                return;
            case R.styleable.GradientColor_android_endX /* 10 */:
                z zVar = (z) obj;
                m1 m1Var = (m1) gVar;
                m1Var.f4016w.setText(String.valueOf(zVar.f3094a));
                int i36 = ((i2.j) obj2).f18467e;
                LinearProgressIndicator linearProgressIndicator = m1Var.f4015v;
                linearProgressIndicator.setMax(i36);
                linearProgressIndicator.setProgress(zVar.f3095b);
                return;
            case R.styleable.GradientColor_android_endY /* 11 */:
                Movie movie6 = (Movie) obj;
                u1 u1Var = (u1) gVar;
                AppCompatImageView imageMovie7 = u1Var.f4107v;
                kotlin.jvm.internal.h.d(imageMovie7, "imageMovie");
                C2004m a17 = C1992a.a(imageMovie7.getContext());
                C1.h hVar10 = new C1.h(imageMovie7.getContext());
                hVar10.f1179c = movie6.f14415b;
                hVar10.b(imageMovie7);
                hVar10.f1181e = AbstractC1002u1.e0(B7.j.o0(new F1.c[]{new F1.b(view.getContext().getResources().getDimension(R.dimen.dp_10))}));
                a17.b(hVar10.a());
                String str12 = movie6.f14431s;
                AppCompatTextView appCompatTextView17 = u1Var.f4110y;
                appCompatTextView17.setText(str12);
                if (!W7.d.U(str12)) {
                    i25 = 0;
                } else {
                    i25 = 8;
                }
                appCompatTextView17.setVisibility(i25);
                String str13 = movie6.f14432t;
                AppCompatTextView appCompatTextView18 = u1Var.f4109x;
                appCompatTextView18.setText(str13);
                if (!W7.d.U(str13)) {
                    i26 = 0;
                } else {
                    i26 = 8;
                }
                appCompatTextView18.setVisibility(i26);
                int i37 = movie6.f14423k;
                View view5 = u1Var.f7853k;
                AppCompatTextView textLastEpisode = u1Var.f4108w;
                if (i37 > 0 && movie6.f14421h == bVar) {
                    Context context6 = view5.getContext();
                    if (i37 < 10) {
                        i27 = R.string.format_0ep;
                    } else {
                        i27 = R.string.format_ep;
                    }
                    textLastEpisode.setText(context6.getString(i27, Integer.valueOf(i37)));
                    textLastEpisode.setVisibility(0);
                } else {
                    kotlin.jvm.internal.h.d(textLastEpisode, "textLastEpisode");
                    textLastEpisode.setVisibility(8);
                }
                u1Var.f4111z.setText(movie6.f14416c);
                view5.setOnClickListener(new I5.k(this, 20, movie6));
                return;
            case 12:
                Movie movie7 = (Movie) obj;
                C1 c12 = (C1) gVar;
                AppCompatImageView imageMovie8 = c12.f3636v;
                kotlin.jvm.internal.h.d(imageMovie8, "imageMovie");
                C2004m a18 = C1992a.a(imageMovie8.getContext());
                C1.h hVar11 = new C1.h(imageMovie8.getContext());
                hVar11.f1179c = movie7.f14415b;
                hVar11.b(imageMovie8);
                hVar11.f1181e = AbstractC1002u1.e0(B7.j.o0(new F1.c[]{new F1.b(view.getContext().getResources().getDimension(R.dimen.dp_10))}));
                a18.b(hVar11.a());
                c12.f3637w.setText(movie7.f14416c);
                c12.f7853k.setOnClickListener(new I5.k((C1550o) obj2, 21, movie7));
                return;
            default:
                I2.c cVar = (I2.c) obj;
                n2.h hVar12 = (n2.h) obj2;
                if (hVar12.f21064e != c()) {
                    i32 = 0;
                }
                z1 z1Var = (z1) gVar;
                z1Var.f4150v.setText(cVar.f3463c);
                if (i32 != 0) {
                    i28 = R.drawable.ic_player_selected;
                } else {
                    i28 = R.drawable.ic_player_unselected;
                }
                z1Var.f4152x.setImageResource(i28);
                View viewBackgroundSelected2 = z1Var.f4151w;
                kotlin.jvm.internal.h.d(viewBackgroundSelected2, "viewBackgroundSelected");
                if (i32 != 0) {
                    i31 = 0;
                }
                viewBackgroundSelected2.setVisibility(i31);
                z1Var.f7853k.setOnClickListener(new I5.k(hVar12, 22, this));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AbstractC0170d1 abstractC0170d1, X1.C listener) {
        super(abstractC0170d1);
        this.f4835u = 8;
        kotlin.jvm.internal.h.e(listener, "listener");
        this.f4837w = abstractC0170d1;
        this.f4836v = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(u1 u1Var, C0142h listener) {
        super(u1Var);
        this.f4835u = 11;
        kotlin.jvm.internal.h.e(listener, "listener");
        this.f4837w = u1Var;
        this.f4836v = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AbstractC0164b1 abstractC0164b1, C0142h listener) {
        super(abstractC0164b1);
        this.f4835u = 9;
        kotlin.jvm.internal.h.e(listener, "listener");
        this.f4837w = abstractC0164b1;
        this.f4836v = listener;
    }
}
