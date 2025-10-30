package com.anilab.exoplayer;

import Q2.C0360c;
import Q2.C0361d;
import Q2.P;
import Q2.Y;
import Y3.a;
import Y3.b;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import c4.InterfaceC0774b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l4.y;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public List f14476a;

    /* renamed from: b, reason: collision with root package name */
    public C0361d f14477b;

    /* renamed from: c, reason: collision with root package name */
    public int f14478c;

    /* renamed from: d, reason: collision with root package name */
    public float f14479d;

    /* renamed from: e, reason: collision with root package name */
    public float f14480e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14481f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14482g;

    /* renamed from: h, reason: collision with root package name */
    public int f14483h;

    /* renamed from: i, reason: collision with root package name */
    public P f14484i;
    public View j;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14476a = Collections.EMPTY_LIST;
        this.f14477b = C0361d.f6217g;
        this.f14478c = 0;
        this.f14479d = 0.0533f;
        this.f14480e = 0.08f;
        this.f14481f = true;
        this.f14482g = true;
        C0360c c0360c = new C0360c(context);
        this.f14484i = c0360c;
        this.j = c0360c;
        addView(c0360c);
        this.f14483h = 1;
    }

    private List<b> getCuesWithStylingPreferencesApplied() {
        if (this.f14481f && this.f14482g) {
            return this.f14476a;
        }
        ArrayList arrayList = new ArrayList(this.f14476a.size());
        for (int i9 = 0; i9 < this.f14476a.size(); i9++) {
            a a5 = ((b) this.f14476a.get(i9)).a();
            if (!this.f14481f) {
                a5.f8673n = false;
                CharSequence charSequence = a5.f8661a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        a5.f8661a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = a5.f8661a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof InterfaceC0774b)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                Z0.a.w(a5);
            } else if (!this.f14482g) {
                Z0.a.w(a5);
            }
            arrayList.add(a5.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (y.f20553a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C0361d getUserCaptionStyle() {
        CaptioningManager captioningManager;
        int i9;
        int i10;
        int i11;
        int i12 = y.f20553a;
        C0361d c0361d = C0361d.f6217g;
        if (i12 >= 19 && !isInEditMode() && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            if (i12 >= 21) {
                int i13 = -1;
                if (userStyle.hasForegroundColor()) {
                    i9 = userStyle.foregroundColor;
                } else {
                    i9 = -1;
                }
                if (userStyle.hasBackgroundColor()) {
                    i10 = userStyle.backgroundColor;
                } else {
                    i10 = -16777216;
                }
                int i14 = i10;
                int i15 = 0;
                if (userStyle.hasWindowColor()) {
                    i11 = userStyle.windowColor;
                } else {
                    i11 = 0;
                }
                if (userStyle.hasEdgeType()) {
                    i15 = userStyle.edgeType;
                }
                int i16 = i15;
                if (userStyle.hasEdgeColor()) {
                    i13 = userStyle.edgeColor;
                }
                return new C0361d(i9, i14, i11, i16, i13, userStyle.getTypeface());
            }
            return new C0361d(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
        }
        return c0361d;
    }

    private <T extends View & P> void setView(T t7) {
        removeView(this.j);
        View view = this.j;
        if (view instanceof Y) {
            ((Y) view).f6202b.destroy();
        }
        this.j = t7;
        this.f14484i = t7;
        addView(t7);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.f14484i.a(getCuesWithStylingPreferencesApplied(), this.f14477b, this.f14479d, this.f14478c, this.f14480e);
    }

    public void setApplyEmbeddedFontSizes(boolean z9) {
        this.f14482g = z9;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z9) {
        this.f14481f = z9;
        c();
    }

    public void setBottomPaddingFraction(float f9) {
        this.f14480e = f9;
        c();
    }

    public void setCues(List<b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f14476a = list;
        c();
    }

    public void setFractionalTextSize(float f9) {
        this.f14478c = 0;
        this.f14479d = f9;
        c();
    }

    public void setStyle(C0361d c0361d) {
        this.f14477b = c0361d;
        c();
    }

    public void setViewType(int i9) {
        if (this.f14483h == i9) {
            return;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                setView(new Y(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            setView(new C0360c(getContext()));
        }
        this.f14483h = i9;
    }
}
