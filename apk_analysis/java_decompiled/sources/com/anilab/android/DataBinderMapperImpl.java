package com.anilab.android;

import J1.A0;
import J1.A1;
import J1.AbstractC0164b1;
import J1.AbstractC0170d1;
import J1.AbstractC0212y0;
import J1.B;
import J1.B0;
import J1.B1;
import J1.C0;
import J1.C0161a1;
import J1.C0162b;
import J1.C0163b0;
import J1.C0167c1;
import J1.C0168d;
import J1.C0169d0;
import J1.C0173e1;
import J1.C0174f;
import J1.C0175f0;
import J1.C0178h;
import J1.C0179h0;
import J1.C0182j;
import J1.C0183j0;
import J1.C0186l;
import J1.C0187l0;
import J1.C0190n;
import J1.C0191n0;
import J1.C0194p;
import J1.C0195p0;
import J1.C0198r0;
import J1.C0201t;
import J1.C0202t0;
import J1.C0205v;
import J1.C0206v0;
import J1.C0209x;
import J1.C0210x0;
import J1.C0213z;
import J1.C0214z0;
import J1.C1;
import J1.D;
import J1.D0;
import J1.D1;
import J1.E0;
import J1.F;
import J1.F0;
import J1.G;
import J1.G0;
import J1.H0;
import J1.I;
import J1.I0;
import J1.J0;
import J1.K;
import J1.K0;
import J1.L0;
import J1.M;
import J1.M0;
import J1.N0;
import J1.O;
import J1.O0;
import J1.P0;
import J1.Q;
import J1.Q0;
import J1.R0;
import J1.S0;
import J1.T;
import J1.T0;
import J1.U0;
import J1.V;
import J1.V0;
import J1.W0;
import J1.X;
import J1.X0;
import J1.Y0;
import J1.Z;
import J1.Z0;
import J1.f1;
import J1.g1;
import J1.h1;
import J1.i1;
import J1.j1;
import J1.k1;
import J1.l1;
import J1.m1;
import J1.n1;
import J1.o1;
import J1.p1;
import J1.q1;
import J1.r;
import J1.r1;
import J1.s1;
import J1.t1;
import J1.u1;
import J1.v1;
import J1.w1;
import J1.x1;
import J1.y1;
import J1.z1;
import W.a;
import W.g;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import co.notix.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.slider.Slider;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f13722a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(71);
        f13722a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_main, 1);
        sparseIntArray.put(R.layout.activity_player, 2);
        sparseIntArray.put(R.layout.bottom_sheet_action_comment, 3);
        sparseIntArray.put(R.layout.bottom_sheet_download, 4);
        sparseIntArray.put(R.layout.bottom_sheet_log_out, 5);
        sparseIntArray.put(R.layout.bottom_sheet_my_list_action, 6);
        sparseIntArray.put(R.layout.bottom_sheet_rating, 7);
        sparseIntArray.put(R.layout.bottom_sheet_select_player, 8);
        sparseIntArray.put(R.layout.bottom_sheet_select_subtitle, 9);
        sparseIntArray.put(R.layout.confirm_dialog, 10);
        sparseIntArray.put(R.layout.dialog_common_error, 11);
        sparseIntArray.put(R.layout.dialog_full_detail, 12);
        sparseIntArray.put(R.layout.dialog_register_congraturation, 13);
        sparseIntArray.put(R.layout.fragment_category_detail, 14);
        sparseIntArray.put(R.layout.fragment_change_password, 15);
        sparseIntArray.put(R.layout.fragment_comment, 16);
        sparseIntArray.put(R.layout.fragment_contact_us, 17);
        sparseIntArray.put(R.layout.fragment_edit_profile, 18);
        sparseIntArray.put(R.layout.fragment_filter, 19);
        sparseIntArray.put(R.layout.fragment_filter_result, 20);
        sparseIntArray.put(R.layout.fragment_help_center, 21);
        sparseIntArray.put(R.layout.fragment_home, 22);
        sparseIntArray.put(R.layout.fragment_host, 23);
        sparseIntArray.put(R.layout.fragment_login, 24);
        sparseIntArray.put(R.layout.fragment_login_with_email, 25);
        sparseIntArray.put(R.layout.fragment_mal_export, 26);
        sparseIntArray.put(R.layout.fragment_mal_import, 27);
        sparseIntArray.put(R.layout.fragment_mal_sync, 28);
        sparseIntArray.put(R.layout.fragment_movie_detail, 29);
        sparseIntArray.put(R.layout.fragment_my_list, 30);
        sparseIntArray.put(R.layout.fragment_notification, 31);
        sparseIntArray.put(R.layout.fragment_player_settings, 32);
        sparseIntArray.put(R.layout.fragment_profile, 33);
        sparseIntArray.put(R.layout.fragment_profile_settings, 34);
        sparseIntArray.put(R.layout.fragment_register, 35);
        sparseIntArray.put(R.layout.fragment_release_calendar, 36);
        sparseIntArray.put(R.layout.fragment_search, 37);
        sparseIntArray.put(R.layout.fragment_security, 38);
        sparseIntArray.put(R.layout.fragment_select_subtitle_for_player, 39);
        sparseIntArray.put(R.layout.fragment_splash, 40);
        sparseIntArray.put(R.layout.fragment_subtitle_setting, 41);
        sparseIntArray.put(R.layout.fragment_update, 42);
        sparseIntArray.put(R.layout.fragment_welcome, 43);
        sparseIntArray.put(R.layout.item_avatar, 44);
        sparseIntArray.put(R.layout.item_calendar, 45);
        sparseIntArray.put(R.layout.item_category, 46);
        sparseIntArray.put(R.layout.item_comment, 47);
        sparseIntArray.put(R.layout.item_continue_watch_home, 48);
        sparseIntArray.put(R.layout.item_download, 49);
        sparseIntArray.put(R.layout.item_episode, 50);
        sparseIntArray.put(R.layout.item_episode_number, 51);
        sparseIntArray.put(R.layout.item_filter, 52);
        sparseIntArray.put(R.layout.item_hls_server, 53);
        sparseIntArray.put(R.layout.item_home, 54);
        sparseIntArray.put(R.layout.item_more_like, 55);
        sparseIntArray.put(R.layout.item_movie_home, 56);
        sparseIntArray.put(R.layout.item_movie_large, 57);
        sparseIntArray.put(R.layout.item_my_list, 58);
        sparseIntArray.put(R.layout.item_notification, 59);
        sparseIntArray.put(R.layout.item_player, 60);
        sparseIntArray.put(R.layout.item_rating, 61);
        sparseIntArray.put(R.layout.item_release_calendar, 62);
        sparseIntArray.put(R.layout.item_release_calendar_current, 63);
        sparseIntArray.put(R.layout.item_reply_comment, 64);
        sparseIntArray.put(R.layout.item_search, 65);
        sparseIntArray.put(R.layout.item_select_episode, 66);
        sparseIntArray.put(R.layout.item_slider, 67);
        sparseIntArray.put(R.layout.item_subtitle, 68);
        sparseIntArray.put(R.layout.item_tabs_row, 69);
        sparseIntArray.put(R.layout.item_top_search, 70);
        sparseIntArray.put(R.layout.layout_loading, 71);
    }

    @Override // W.a
    public final List a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v158, types: [W.g, J1.z0, J1.y0] */
    /* JADX WARN: Type inference failed for: r0v162, types: [W.g, J1.B0, J1.A0] */
    /* JADX WARN: Type inference failed for: r0v166, types: [W.g, J1.D0, J1.C0] */
    /* JADX WARN: Type inference failed for: r0v170, types: [W.g, J1.F0, J1.E0] */
    /* JADX WARN: Type inference failed for: r0v174, types: [W.g, J1.H0, J1.G0] */
    /* JADX WARN: Type inference failed for: r0v178, types: [W.g, J1.J0, J1.I0] */
    /* JADX WARN: Type inference failed for: r0v182, types: [W.g, J1.L0, J1.K0] */
    /* JADX WARN: Type inference failed for: r0v186, types: [J1.N0, W.g, J1.M0] */
    /* JADX WARN: Type inference failed for: r0v190, types: [J1.O0, W.g, J1.P0] */
    /* JADX WARN: Type inference failed for: r0v194, types: [W.g, J1.R0, J1.Q0] */
    /* JADX WARN: Type inference failed for: r0v198, types: [W.g, J1.S0] */
    /* JADX WARN: Type inference failed for: r0v202, types: [W.g, J1.T0, J1.U0] */
    /* JADX WARN: Type inference failed for: r0v210, types: [W.g, J1.X0, J1.W0] */
    /* JADX WARN: Type inference failed for: r0v218, types: [W.g, J1.Z0, J1.a1] */
    /* JADX WARN: Type inference failed for: r0v222, types: [W.g, J1.c1, J1.b1] */
    /* JADX WARN: Type inference failed for: r0v226, types: [W.g, J1.e1, J1.d1] */
    /* JADX WARN: Type inference failed for: r0v230, types: [W.g, J1.g1, J1.f1] */
    /* JADX WARN: Type inference failed for: r0v234, types: [W.g, J1.i1, J1.h1] */
    /* JADX WARN: Type inference failed for: r0v238, types: [W.g, J1.j1] */
    /* JADX WARN: Type inference failed for: r0v242, types: [W.g, J1.k1, J1.l1] */
    /* JADX WARN: Type inference failed for: r0v246, types: [W.g, J1.m1, J1.n1] */
    /* JADX WARN: Type inference failed for: r0v250, types: [J1.o1, J1.p1, W.g] */
    /* JADX WARN: Type inference failed for: r0v254, types: [W.g, J1.q1, J1.r1] */
    /* JADX WARN: Type inference failed for: r0v258, types: [W.g, J1.s1, J1.t1] */
    /* JADX WARN: Type inference failed for: r0v262, types: [W.g, J1.u1, J1.v1] */
    /* JADX WARN: Type inference failed for: r0v266, types: [W.g, J1.w1, J1.x1] */
    /* JADX WARN: Type inference failed for: r0v274, types: [W.g, J1.z1, J1.A1] */
    /* JADX WARN: Type inference failed for: r0v278, types: [W.g, J1.B1] */
    /* JADX WARN: Type inference failed for: r0v282, types: [W.g, J1.C1, J1.D1] */
    /* JADX WARN: Type inference failed for: r0v286, types: [W.g, J1.E1] */
    /* JADX WARN: Type inference failed for: r0v70, types: [W.g, J1.G] */
    @Override // W.a
    public final g b(View view, int i9) {
        int i10 = f13722a.get(i9);
        if (i10 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                int i11 = (i10 - 1) / 50;
                if (i11 != 0) {
                    if (i11 == 1) {
                        switch (i10) {
                            case 51:
                                if ("layout/item_episode_number_0".equals(tag)) {
                                    V0 v02 = new V0(null, view, (MaterialButton) g.g0(view, 1, null, null)[0]);
                                    v02.f3794w = -1L;
                                    v02.f3793v.setTag(null);
                                    view.setTag(R.id.dataBinding, v02);
                                    v02.e0();
                                    return v02;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_episode_number is invalid. Received: "));
                            case 52:
                                if ("layout/item_filter_0".equals(tag)) {
                                    Object[] g02 = g.g0(view, 2, null, X0.f3808y);
                                    ?? w02 = new W0(null, view, (AppCompatTextView) g02[1]);
                                    w02.f3809x = -1L;
                                    ((FrameLayout) g02[0]).setTag(null);
                                    w02.j0(view);
                                    w02.e0();
                                    return w02;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_filter is invalid. Received: "));
                            case 53:
                                if ("layout/item_hls_server_0".equals(tag)) {
                                    Y0 y02 = new Y0(null, view, (TextView) g.g0(view, 1, null, null)[0]);
                                    y02.f3816w = -1L;
                                    y02.f3815v.setTag(null);
                                    view.setTag(R.id.dataBinding, y02);
                                    y02.e0();
                                    return y02;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_hls_server is invalid. Received: "));
                            case 54:
                                if ("layout/item_home_0".equals(tag)) {
                                    Object[] g03 = g.g0(view, 4, null, C0161a1.f3831A);
                                    ?? z02 = new Z0(null, view, (AppCompatTextView) g03[2], (AppCompatTextView) g03[1], (RecyclerView) g03[3]);
                                    z02.f3832z = -1L;
                                    ((ConstraintLayout) g03[0]).setTag(null);
                                    z02.j0(view);
                                    z02.e0();
                                    return z02;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_home is invalid. Received: "));
                            case 55:
                                if ("layout/item_more_like_0".equals(tag)) {
                                    Object[] g04 = g.g0(view, 4, null, C0167c1.f3879A);
                                    ?? abstractC0164b1 = new AbstractC0164b1(null, view, (AppCompatImageView) g04[1], (AppCompatTextView) g04[3], (AppCompatTextView) g04[2]);
                                    abstractC0164b1.f3880z = -1L;
                                    ((ConstraintLayout) g04[0]).setTag(null);
                                    abstractC0164b1.j0(view);
                                    abstractC0164b1.e0();
                                    return abstractC0164b1;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_more_like is invalid. Received: "));
                            case 56:
                                if ("layout/item_movie_home_0".equals(tag)) {
                                    Object[] g05 = g.g0(view, 4, null, C0173e1.f3915A);
                                    ?? abstractC0170d1 = new AbstractC0170d1(null, view, (AppCompatImageView) g05[1], (AppCompatTextView) g05[3], (AppCompatTextView) g05[2]);
                                    abstractC0170d1.f3916z = -1L;
                                    ((FrameLayout) g05[0]).setTag(null);
                                    abstractC0170d1.j0(view);
                                    abstractC0170d1.e0();
                                    return abstractC0170d1;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_movie_home is invalid. Received: "));
                            case 57:
                                if ("layout/item_movie_large_0".equals(tag)) {
                                    Object[] g06 = g.g0(view, 6, null, g1.f3945C);
                                    ?? f1Var = new f1(null, view, (AppCompatImageView) g06[1], (AppCompatTextView) g06[5], (AppCompatTextView) g06[3], (AppCompatTextView) g06[2], (View) g06[4]);
                                    f1Var.f3946B = -1L;
                                    ((ConstraintLayout) g06[0]).setTag(null);
                                    f1Var.j0(view);
                                    f1Var.e0();
                                    return f1Var;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_movie_large is invalid. Received: "));
                            case 58:
                                if ("layout/item_my_list_0".equals(tag)) {
                                    Object[] g07 = g.g0(view, 7, null, i1.f3963D);
                                    ?? h1Var = new h1(null, view, (AppCompatImageView) g07[1], (AppCompatImageView) g07[3], (AppCompatImageView) g07[4], (AppCompatTextView) g07[5], (AppCompatTextView) g07[2], (AppCompatTextView) g07[6]);
                                    h1Var.f3964C = -1L;
                                    ((ConstraintLayout) g07[0]).setTag(null);
                                    h1Var.j0(view);
                                    h1Var.e0();
                                    return h1Var;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_my_list is invalid. Received: "));
                            case 59:
                                if ("layout/item_notification_0".equals(tag)) {
                                    Object[] g08 = g.g0(view, 7, null, j1.f3969w);
                                    ?? gVar = new g(null, view, 0);
                                    gVar.f3970v = -1L;
                                    ((ConstraintLayout) g08[0]).setTag(null);
                                    gVar.j0(view);
                                    gVar.e0();
                                    return gVar;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_notification is invalid. Received: "));
                            case 60:
                                if ("layout/item_player_0".equals(tag)) {
                                    Object[] g09 = g.g0(view, 8, null, l1.f3988D);
                                    ?? k1Var = new k1(null, view, (AppCompatImageView) g09[2], (AppCompatRatingBar) g09[6], (AppCompatTextView) g09[3], (AppCompatTextView) g09[4], (View) g09[1], (AppCompatImageView) g09[7]);
                                    k1Var.f3989C = -1L;
                                    ((ConstraintLayout) g09[0]).setTag(null);
                                    k1Var.j0(view);
                                    k1Var.e0();
                                    return k1Var;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_player is invalid. Received: "));
                            case 61:
                                if ("layout/item_rating_0".equals(tag)) {
                                    Object[] g010 = g.g0(view, 3, null, n1.f4020z);
                                    ?? m1Var = new m1(null, view, (LinearProgressIndicator) g010[2], (AppCompatTextView) g010[1]);
                                    m1Var.f4021y = -1L;
                                    ((LinearLayoutCompat) g010[0]).setTag(null);
                                    m1Var.j0(view);
                                    m1Var.e0();
                                    return m1Var;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_rating is invalid. Received: "));
                            case 62:
                                if ("layout/item_release_calendar_0".equals(tag)) {
                                    Object[] g011 = g.g0(view, 9, null, p1.f4042E);
                                    MaterialButton materialButton = (MaterialButton) g011[8];
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) g011[3];
                                    ?? o1Var = new o1(null, view, materialButton, appCompatImageView, (AppCompatTextView) g011[7], (AppCompatTextView) g011[6], (AppCompatTextView) g011[2], (View) g011[1], (View) g011[4]);
                                    o1Var.f4043D = -1L;
                                    ((ConstraintLayout) g011[0]).setTag(null);
                                    o1Var.j0(view);
                                    o1Var.e0();
                                    return o1Var;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_release_calendar is invalid. Received: "));
                            case 63:
                                if ("layout/item_release_calendar_current_0".equals(tag)) {
                                    Object[] g012 = g.g0(view, 3, null, r1.f4067z);
                                    ?? q1Var = new q1(null, view, (AppCompatTextView) g012[2], (View) g012[1]);
                                    q1Var.f4068y = -1L;
                                    ((ConstraintLayout) g012[0]).setTag(null);
                                    q1Var.j0(view);
                                    q1Var.e0();
                                    return q1Var;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_release_calendar_current is invalid. Received: "));
                            case 64:
                                if ("layout/item_reply_comment_0".equals(tag)) {
                                    Object[] g013 = g.g0(view, 10, null, t1.f4091F);
                                    MaterialButton materialButton2 = (MaterialButton) g013[7];
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) g013[5];
                                    ?? s1Var = new s1(null, view, materialButton2, appCompatImageView2, (ShapeableImageView) g013[3], (AppCompatTextView) g013[6], (AppCompatTextView) g013[8], (AppCompatTextView) g013[9], (AppCompatTextView) g013[4], (View) g013[2]);
                                    s1Var.f4092E = -1L;
                                    ((ConstraintLayout) g013[0]).setTag(null);
                                    s1Var.j0(view);
                                    s1Var.e0();
                                    return s1Var;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_reply_comment is invalid. Received: "));
                            case 65:
                                if ("layout/item_search_0".equals(tag)) {
                                    Object[] g014 = g.g0(view, 6, null, v1.f4117C);
                                    ?? u1Var = new u1(null, view, (AppCompatImageView) g014[1], (AppCompatTextView) g014[4], (AppCompatTextView) g014[3], (AppCompatTextView) g014[2], (AppCompatTextView) g014[5]);
                                    u1Var.f4118B = -1L;
                                    ((ConstraintLayout) g014[0]).setTag(null);
                                    u1Var.j0(view);
                                    u1Var.e0();
                                    return u1Var;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_search is invalid. Received: "));
                            case 66:
                                if ("layout/item_select_episode_0".equals(tag)) {
                                    Object[] g015 = g.g0(view, 4, null, x1.f4131A);
                                    ?? w1Var = new w1(null, view, (AppCompatImageView) g015[1], (AppCompatTextView) g015[2], (FrameLayout) g015[3]);
                                    w1Var.f4132z = -1L;
                                    ((FrameLayout) g015[0]).setTag(null);
                                    w1Var.j0(view);
                                    w1Var.e0();
                                    return w1Var;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_select_episode is invalid. Received: "));
                            case 67:
                                if ("layout/item_slider_0".equals(tag)) {
                                    y1 y1Var = new y1(null, view, (AppCompatImageView) g.g0(view, 1, null, null)[0]);
                                    y1Var.f4144w = -1L;
                                    y1Var.f4143v.setTag(null);
                                    view.setTag(R.id.dataBinding, y1Var);
                                    y1Var.e0();
                                    return y1Var;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_slider is invalid. Received: "));
                            case 68:
                                if ("layout/item_subtitle_0".equals(tag)) {
                                    Object[] g016 = g.g0(view, 4, null, A1.f3610A);
                                    ?? z1Var = new z1(null, view, (AppCompatTextView) g016[2], (View) g016[1], (AppCompatImageView) g016[3]);
                                    z1Var.f3611z = -1L;
                                    ((ConstraintLayout) g016[0]).setTag(null);
                                    z1Var.j0(view);
                                    z1Var.e0();
                                    return z1Var;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_subtitle is invalid. Received: "));
                            case 69:
                                if ("layout/item_tabs_row_0".equals(tag)) {
                                    Object[] g017 = g.g0(view, 5, null, B1.f3617w);
                                    ?? gVar2 = new g(null, view, 0);
                                    gVar2.f3618v = -1L;
                                    ((ConstraintLayout) g017[0]).setTag(null);
                                    gVar2.j0(view);
                                    gVar2.e0();
                                    return gVar2;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_tabs_row is invalid. Received: "));
                            case 70:
                                if ("layout/item_top_search_0".equals(tag)) {
                                    Object[] g018 = g.g0(view, 4, null, D1.f3643z);
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) g018[1];
                                    ?? c12 = new C1(null, view, appCompatImageView3, (AppCompatTextView) g018[3]);
                                    c12.f3644y = -1L;
                                    ((ConstraintLayout) g018[0]).setTag(null);
                                    c12.j0(view);
                                    c12.e0();
                                    return c12;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_top_search is invalid. Received: "));
                            case 71:
                                if ("layout/layout_loading_0".equals(tag)) {
                                    Object[] g019 = g.g0(view, 1, null, null);
                                    ?? gVar3 = new g(null, view, 0);
                                    gVar3.f3669v = -1L;
                                    ((FrameLayout) g019[0]).setTag(null);
                                    gVar3.j0(view);
                                    gVar3.e0();
                                    return gVar3;
                                }
                                throw new IllegalArgumentException(A0.a.k(tag, "The tag for layout_loading is invalid. Received: "));
                        }
                    }
                } else {
                    switch (i10) {
                        case 1:
                            if ("layout/activity_main_0".equals(tag)) {
                                return new C0162b(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for activity_main is invalid. Received: "));
                        case 2:
                            if ("layout/activity_player_0".equals(tag)) {
                                return new C0168d(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for activity_player is invalid. Received: "));
                        case 3:
                            if ("layout/bottom_sheet_action_comment_0".equals(tag)) {
                                return new C0174f(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for bottom_sheet_action_comment is invalid. Received: "));
                        case 4:
                            if ("layout/bottom_sheet_download_0".equals(tag)) {
                                return new C0178h(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for bottom_sheet_download is invalid. Received: "));
                        case 5:
                            if ("layout/bottom_sheet_log_out_0".equals(tag)) {
                                return new C0182j(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for bottom_sheet_log_out is invalid. Received: "));
                        case 6:
                            if ("layout/bottom_sheet_my_list_action_0".equals(tag)) {
                                return new C0186l(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for bottom_sheet_my_list_action is invalid. Received: "));
                        case 7:
                            if ("layout/bottom_sheet_rating_0".equals(tag)) {
                                return new C0190n(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for bottom_sheet_rating is invalid. Received: "));
                        case 8:
                            if ("layout/bottom_sheet_select_player_0".equals(tag)) {
                                return new C0194p(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for bottom_sheet_select_player is invalid. Received: "));
                        case 9:
                            if ("layout/bottom_sheet_select_subtitle_0".equals(tag)) {
                                return new r(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for bottom_sheet_select_subtitle is invalid. Received: "));
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            if ("layout/confirm_dialog_0".equals(tag)) {
                                return new C0201t(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for confirm_dialog is invalid. Received: "));
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            if ("layout/dialog_common_error_0".equals(tag)) {
                                return new C0205v(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for dialog_common_error is invalid. Received: "));
                        case 12:
                            if ("layout/dialog_full_detail_0".equals(tag)) {
                                return new C0209x(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for dialog_full_detail is invalid. Received: "));
                        case 13:
                            if ("layout/dialog_register_congraturation_0".equals(tag)) {
                                return new C0213z(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for dialog_register_congraturation is invalid. Received: "));
                        case 14:
                            if ("layout/fragment_category_detail_0".equals(tag)) {
                                return new B(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_category_detail is invalid. Received: "));
                        case 15:
                            if ("layout/fragment_change_password_0".equals(tag)) {
                                return new D(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_change_password is invalid. Received: "));
                        case 16:
                            if ("layout/fragment_comment_0".equals(tag)) {
                                return new F(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_comment is invalid. Received: "));
                        case 17:
                            if ("layout/fragment_contact_us_0".equals(tag)) {
                                Object[] g020 = g.g0(view, 4, null, G.f3674w);
                                ?? gVar4 = new g(null, view, 0);
                                gVar4.f3675v = -1L;
                                ((LinearLayoutCompat) g020[0]).setTag(null);
                                gVar4.j0(view);
                                gVar4.e0();
                                return gVar4;
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_contact_us is invalid. Received: "));
                        case 18:
                            if ("layout/fragment_edit_profile_0".equals(tag)) {
                                return new I(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_edit_profile is invalid. Received: "));
                        case 19:
                            if ("layout/fragment_filter_0".equals(tag)) {
                                return new K(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_filter is invalid. Received: "));
                        case 20:
                            if ("layout/fragment_filter_result_0".equals(tag)) {
                                return new M(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_filter_result is invalid. Received: "));
                        case 21:
                            if ("layout/fragment_help_center_0".equals(tag)) {
                                return new O(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_help_center is invalid. Received: "));
                        case 22:
                            if ("layout/fragment_home_0".equals(tag)) {
                                return new Q(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_home is invalid. Received: "));
                        case 23:
                            if ("layout/fragment_host_0".equals(tag)) {
                                return new T(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_host is invalid. Received: "));
                        case 24:
                            if ("layout/fragment_login_0".equals(tag)) {
                                return new V(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_login is invalid. Received: "));
                        case 25:
                            if ("layout/fragment_login_with_email_0".equals(tag)) {
                                return new X(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_login_with_email is invalid. Received: "));
                        case 26:
                            if ("layout/fragment_mal_export_0".equals(tag)) {
                                return new Z(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_mal_export is invalid. Received: "));
                        case 27:
                            if ("layout/fragment_mal_import_0".equals(tag)) {
                                return new C0163b0(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_mal_import is invalid. Received: "));
                        case 28:
                            if ("layout/fragment_mal_sync_0".equals(tag)) {
                                return new C0169d0(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_mal_sync is invalid. Received: "));
                        case 29:
                            if ("layout/fragment_movie_detail_0".equals(tag)) {
                                return new C0175f0(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_movie_detail is invalid. Received: "));
                        case 30:
                            if ("layout/fragment_my_list_0".equals(tag)) {
                                return new C0179h0(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_my_list is invalid. Received: "));
                        case 31:
                            if ("layout/fragment_notification_0".equals(tag)) {
                                return new C0183j0(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_notification is invalid. Received: "));
                        case 32:
                            if ("layout/fragment_player_settings_0".equals(tag)) {
                                return new C0187l0(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_player_settings is invalid. Received: "));
                        case 33:
                            if ("layout/fragment_profile_0".equals(tag)) {
                                return new C0191n0(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_profile is invalid. Received: "));
                        case 34:
                            if ("layout/fragment_profile_settings_0".equals(tag)) {
                                return new C0195p0(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_profile_settings is invalid. Received: "));
                        case 35:
                            if ("layout/fragment_register_0".equals(tag)) {
                                return new C0198r0(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_register is invalid. Received: "));
                        case 36:
                            if ("layout/fragment_release_calendar_0".equals(tag)) {
                                return new C0202t0(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_release_calendar is invalid. Received: "));
                        case 37:
                            if ("layout/fragment_search_0".equals(tag)) {
                                return new C0206v0(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_search is invalid. Received: "));
                        case 38:
                            if ("layout/fragment_security_0".equals(tag)) {
                                return new C0210x0(view);
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_security is invalid. Received: "));
                        case 39:
                            if ("layout/fragment_select_subtitle_for_player_0".equals(tag)) {
                                Object[] g021 = g.g0(view, 12, null, C0214z0.f4147E);
                                MaterialButton materialButton3 = (MaterialButton) g021[10];
                                MaterialButton materialButton4 = (MaterialButton) g021[11];
                                ChipGroup chipGroup = (ChipGroup) g021[7];
                                View view2 = (View) g021[5];
                                FrameLayout frameLayout = (FrameLayout) g021[8];
                                RecyclerView recyclerView = (RecyclerView) g021[9];
                                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) g021[6];
                                TabLayout tabLayout = (TabLayout) g021[2];
                                ?? abstractC0212y0 = new AbstractC0212y0(null, view, materialButton3, materialButton4, chipGroup, view2, frameLayout, recyclerView, horizontalScrollView, tabLayout);
                                abstractC0212y0.f4148D = -1L;
                                ((ConstraintLayout) g021[0]).setTag(null);
                                abstractC0212y0.j0(view);
                                abstractC0212y0.e0();
                                return abstractC0212y0;
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_select_subtitle_for_player is invalid. Received: "));
                        case 40:
                            if ("layout/fragment_splash_0".equals(tag)) {
                                Object[] g022 = g.g0(view, 4, null, B0.f3615y);
                                ?? a02 = new A0(null, view, (AppCompatImageView) g022[2], (MaterialButton) g022[3]);
                                a02.f3616x = -1L;
                                ((ConstraintLayout) g022[0]).setTag(null);
                                a02.j0(view);
                                a02.e0();
                                return a02;
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_splash is invalid. Received: "));
                        case 41:
                            if ("layout/fragment_subtitle_setting_0".equals(tag)) {
                                Object[] g023 = g.g0(view, 19, null, D0.f3641F);
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) g023[2];
                                MaterialButton materialButton5 = (MaterialButton) g023[18];
                                Slider slider = (Slider) g023[11];
                                Slider slider2 = (Slider) g023[17];
                                Slider slider3 = (Slider) g023[13];
                                Slider slider4 = (Slider) g023[15];
                                Slider slider5 = (Slider) g023[7];
                                Slider slider6 = (Slider) g023[9];
                                TextView textView = (TextView) g023[5];
                                ?? c02 = new C0(null, view, appCompatImageView4, materialButton5, slider, slider2, slider3, slider4, slider5, slider6, textView);
                                c02.f3642E = -1L;
                                ((NestedScrollView) g023[0]).setTag(null);
                                c02.j0(view);
                                c02.e0();
                                return c02;
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_subtitle_setting is invalid. Received: "));
                        case 42:
                            if ("layout/fragment_update_0".equals(tag)) {
                                Object[] g024 = g.g0(view, 18, null, F0.f3672H);
                                MaterialButton materialButton6 = (MaterialButton) g024[17];
                                MaterialButton materialButton7 = (MaterialButton) g024[9];
                                MaterialButton materialButton8 = (MaterialButton) g024[8];
                                View view3 = (View) g024[14];
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) g024[10];
                                ConstraintLayout constraintLayout = (ConstraintLayout) g024[11];
                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) g024[15];
                                TextView textView2 = (TextView) g024[4];
                                TextView textView3 = (TextView) g024[6];
                                TextView textView4 = (TextView) g024[16];
                                ?? e02 = new E0(null, view, materialButton6, materialButton7, materialButton8, view3, appCompatImageView5, constraintLayout, linearProgressIndicator, textView2, textView3, textView4, (TextView) g024[7]);
                                e02.f3673G = -1L;
                                ((FrameLayout) g024[0]).setTag(null);
                                e02.j0(view);
                                e02.e0();
                                return e02;
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_update is invalid. Received: "));
                        case 43:
                            if ("layout/fragment_welcome_0".equals(tag)) {
                                Object[] g025 = g.g0(view, 5, null, H0.f3688z);
                                MaterialButton materialButton9 = (MaterialButton) g025[3];
                                MaterialButton materialButton10 = (MaterialButton) g025[4];
                                ?? g026 = new G0(null, view, materialButton9, materialButton10, (AppCompatTextView) g025[1]);
                                g026.f3689y = -1L;
                                ((ConstraintLayout) g025[0]).setTag(null);
                                g026.j0(view);
                                g026.e0();
                                return g026;
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for fragment_welcome is invalid. Received: "));
                        case 44:
                            if ("layout/item_avatar_0".equals(tag)) {
                                Object[] g027 = g.g0(view, 2, null, J0.f3702y);
                                ?? i02 = new I0(null, view, (AppCompatImageView) g027[1]);
                                i02.f3703x = -1L;
                                ((ConstraintLayout) g027[0]).setTag(null);
                                i02.j0(view);
                                i02.e0();
                                return i02;
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_avatar is invalid. Received: "));
                        case 45:
                            if ("layout/item_calendar_0".equals(tag)) {
                                Object[] g028 = g.g0(view, 3, null, L0.f3715z);
                                ?? k02 = new K0(null, view, (AppCompatTextView) g028[2], (AppCompatTextView) g028[1]);
                                k02.f3716y = -1L;
                                ((ConstraintLayout) g028[0]).setTag(null);
                                k02.j0(view);
                                k02.e0();
                                return k02;
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_calendar is invalid. Received: "));
                        case 46:
                            if ("layout/item_category_0".equals(tag)) {
                                Object[] g029 = g.g0(view, 8, null, N0.f3731E);
                                ?? m02 = new M0(null, view, (MaterialButton) g029[5], (AppCompatImageView) g029[1], (AppCompatTextView) g029[4], (AppCompatTextView) g029[2], (AppCompatTextView) g029[7], (AppCompatTextView) g029[6], (AppCompatTextView) g029[3]);
                                m02.f3732D = -1L;
                                ((ConstraintLayout) g029[0]).setTag(null);
                                m02.j0(view);
                                m02.e0();
                                return m02;
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_category is invalid. Received: "));
                        case 47:
                            if ("layout/item_comment_0".equals(tag)) {
                                Object[] g030 = g.g0(view, 11, null, P0.f3755H);
                                ?? o02 = new O0(null, view, (MaterialButton) g030[8], (AppCompatImageView) g030[6], (AppCompatTextView) g030[3], (MaterialButton) g030[1], (ShapeableImageView) g030[4], (AppCompatTextView) g030[7], (AppCompatTextView) g030[9], (AppCompatTextView) g030[2], (AppCompatTextView) g030[10], (AppCompatTextView) g030[5]);
                                o02.f3756G = -1L;
                                ((ConstraintLayout) g030[0]).setTag(null);
                                o02.j0(view);
                                o02.e0();
                                return o02;
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_comment is invalid. Received: "));
                        case 48:
                            if ("layout/item_continue_watch_home_0".equals(tag)) {
                                Object[] g031 = g.g0(view, 6, null, R0.f3765C);
                                ?? q02 = new Q0(null, view, (AppCompatImageView) g031[4], (AppCompatImageView) g031[2], (AppCompatImageView) g031[1], (LinearProgressIndicator) g031[5], (AppCompatTextView) g031[3]);
                                q02.f3766B = -1L;
                                ((FrameLayout) g031[0]).setTag(null);
                                q02.j0(view);
                                q02.e0();
                                return q02;
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_continue_watch_home is invalid. Received: "));
                        case 49:
                            if ("layout/item_download_0".equals(tag)) {
                                Object[] g032 = g.g0(view, 7, null, S0.f3773w);
                                ?? gVar5 = new g(null, view, 0);
                                gVar5.f3774v = -1L;
                                ((ConstraintLayout) g032[0]).setTag(null);
                                gVar5.j0(view);
                                gVar5.e0();
                                return gVar5;
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_download is invalid. Received: "));
                        case 50:
                            if ("layout/item_episode_0".equals(tag)) {
                                Object[] g033 = g.g0(view, 5, null, U0.f3787A);
                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) g033[1];
                                ?? t02 = new T0(null, view, appCompatImageView6, (AppCompatTextView) g033[3], (AppCompatTextView) g033[4]);
                                t02.f3788z = -1L;
                                ((FrameLayout) g033[0]).setTag(null);
                                t02.j0(view);
                                t02.e0();
                                return t02;
                            }
                            throw new IllegalArgumentException(A0.a.k(tag, "The tag for item_episode is invalid. Received: "));
                    }
                }
            } else {
                throw new RuntimeException("view must have a tag");
            }
        }
        return null;
    }

    @Override // W.a
    public final g c(View[] viewArr, int i9) {
        if (viewArr.length != 0 && f13722a.get(i9) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }
}
