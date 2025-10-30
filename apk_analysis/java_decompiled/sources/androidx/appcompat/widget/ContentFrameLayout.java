package androidx.appcompat.widget;

import P.X;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import i.w;
import o.l;
import p.C1780Y0;
import p.C1795g;
import p.C1805l;
import p.InterfaceC1790d0;
import p.InterfaceC1792e0;
import s4.i;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f9457a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f9458b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f9459c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f9460d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f9461e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f9462f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f9463g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1790d0 f9464h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f9463g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f9461e == null) {
            this.f9461e = new TypedValue();
        }
        return this.f9461e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f9462f == null) {
            this.f9462f = new TypedValue();
        }
        return this.f9462f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f9459c == null) {
            this.f9459c = new TypedValue();
        }
        return this.f9459c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f9460d == null) {
            this.f9460d = new TypedValue();
        }
        return this.f9460d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f9457a == null) {
            this.f9457a = new TypedValue();
        }
        return this.f9457a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f9458b == null) {
            this.f9458b = new TypedValue();
        }
        return this.f9458b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1790d0 interfaceC1790d0 = this.f9464h;
        if (interfaceC1790d0 != null) {
            interfaceC1790d0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1805l c1805l;
        super.onDetachedFromWindow();
        InterfaceC1790d0 interfaceC1790d0 = this.f9464h;
        if (interfaceC1790d0 != null) {
            w wVar = (w) ((i) interfaceC1790d0).f22734a;
            InterfaceC1792e0 interfaceC1792e0 = wVar.f18144r;
            if (interfaceC1792e0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1792e0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((C1780Y0) actionBarOverlayLayout.f9401e).f21928a.f9486a;
                if (actionMenuView != null && (c1805l = actionMenuView.f9426t) != null) {
                    c1805l.d();
                    C1795g c1795g = c1805l.f22026u;
                    if (c1795g != null && c1795g.b()) {
                        c1795g.f21449i.dismiss();
                    }
                }
            }
            if (wVar.f18153w != null) {
                wVar.f18132l.getDecorView().removeCallbacks(wVar.f18155x);
                if (wVar.f18153w.isShowing()) {
                    try {
                        wVar.f18153w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                wVar.f18153w = null;
            }
            X x5 = wVar.f18157y;
            if (x5 != null) {
                x5.b();
            }
            l lVar = wVar.z(0).f18103h;
            if (lVar != null) {
                lVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC1790d0 interfaceC1790d0) {
        this.f9464h = interfaceC1790d0;
    }
}
