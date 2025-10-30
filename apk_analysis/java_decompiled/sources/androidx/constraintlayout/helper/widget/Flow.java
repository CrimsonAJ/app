package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import x.AbstractC2154i;
import x.C2149d;
import x.C2152g;
import z.p;
import z.q;

/* loaded from: classes.dex */
public class Flow extends q {

    /* renamed from: i, reason: collision with root package name */
    public C2152g f9527i;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [x.g, x.i] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, y.b] */
    @Override // z.q, z.AbstractC2223c
    public final void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        ?? abstractC2154i = new AbstractC2154i();
        abstractC2154i.f24443f0 = 0;
        abstractC2154i.f24444g0 = 0;
        abstractC2154i.f24445h0 = 0;
        abstractC2154i.f24446i0 = 0;
        abstractC2154i.f24447j0 = 0;
        abstractC2154i.f24448k0 = 0;
        abstractC2154i.f24449l0 = false;
        abstractC2154i.f24450m0 = 0;
        abstractC2154i.f24451n0 = 0;
        abstractC2154i.f24452o0 = new Object();
        abstractC2154i.f24453p0 = null;
        abstractC2154i.f24454q0 = -1;
        abstractC2154i.r0 = -1;
        abstractC2154i.f24455s0 = -1;
        abstractC2154i.f24456t0 = -1;
        abstractC2154i.f24457u0 = -1;
        abstractC2154i.f24458v0 = -1;
        abstractC2154i.f24459w0 = 0.5f;
        abstractC2154i.f24460x0 = 0.5f;
        abstractC2154i.f24461y0 = 0.5f;
        abstractC2154i.f24462z0 = 0.5f;
        abstractC2154i.f24428A0 = 0.5f;
        abstractC2154i.f24429B0 = 0.5f;
        abstractC2154i.f24430C0 = 0;
        abstractC2154i.f24431D0 = 0;
        abstractC2154i.f24432E0 = 2;
        abstractC2154i.f24433F0 = 2;
        abstractC2154i.f24434G0 = 0;
        abstractC2154i.f24435H0 = -1;
        abstractC2154i.f24436I0 = 0;
        abstractC2154i.f24437J0 = new ArrayList();
        abstractC2154i.f24438K0 = null;
        abstractC2154i.f24439L0 = null;
        abstractC2154i.f24440M0 = null;
        abstractC2154i.f24442O0 = 0;
        this.f9527i = abstractC2154i;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f25352b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = obtainStyledAttributes.getIndex(i9);
                if (index == 0) {
                    this.f9527i.f24436I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C2152g c2152g = this.f9527i;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c2152g.f24443f0 = dimensionPixelSize;
                    c2152g.f24444g0 = dimensionPixelSize;
                    c2152g.f24445h0 = dimensionPixelSize;
                    c2152g.f24446i0 = dimensionPixelSize;
                } else if (index == 11) {
                    C2152g c2152g2 = this.f9527i;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c2152g2.f24445h0 = dimensionPixelSize2;
                    c2152g2.f24447j0 = dimensionPixelSize2;
                    c2152g2.f24448k0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f9527i.f24446i0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f9527i.f24447j0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f9527i.f24443f0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f9527i.f24448k0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f9527i.f24444g0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f9527i.f24434G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f9527i.f24454q0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f9527i.r0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f9527i.f24455s0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f9527i.f24457u0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f9527i.f24456t0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f9527i.f24458v0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f9527i.f24459w0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f9527i.f24461y0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f9527i.f24428A0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f9527i.f24462z0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f9527i.f24429B0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f9527i.f24460x0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f9527i.f24432E0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f9527i.f24433F0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f9527i.f24430C0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f9527i.f24431D0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f9527i.f24435H0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f25191d = this.f9527i;
        h();
    }

    @Override // z.AbstractC2223c
    public final void f(C2149d c2149d, boolean z9) {
        C2152g c2152g = this.f9527i;
        int i9 = c2152g.f24445h0;
        if (i9 <= 0 && c2152g.f24446i0 <= 0) {
            return;
        }
        if (z9) {
            c2152g.f24447j0 = c2152g.f24446i0;
            c2152g.f24448k0 = i9;
        } else {
            c2152g.f24447j0 = i9;
            c2152g.f24448k0 = c2152g.f24446i0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x055a  */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    @Override // z.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(x.C2152g r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 1419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.i(x.g, int, int):void");
    }

    @Override // z.AbstractC2223c, android.view.View
    public final void onMeasure(int i9, int i10) {
        i(this.f9527i, i9, i10);
    }

    public void setFirstHorizontalBias(float f9) {
        this.f9527i.f24461y0 = f9;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i9) {
        this.f9527i.f24455s0 = i9;
        requestLayout();
    }

    public void setFirstVerticalBias(float f9) {
        this.f9527i.f24462z0 = f9;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i9) {
        this.f9527i.f24456t0 = i9;
        requestLayout();
    }

    public void setHorizontalAlign(int i9) {
        this.f9527i.f24432E0 = i9;
        requestLayout();
    }

    public void setHorizontalBias(float f9) {
        this.f9527i.f24459w0 = f9;
        requestLayout();
    }

    public void setHorizontalGap(int i9) {
        this.f9527i.f24430C0 = i9;
        requestLayout();
    }

    public void setHorizontalStyle(int i9) {
        this.f9527i.f24454q0 = i9;
        requestLayout();
    }

    public void setMaxElementsWrap(int i9) {
        this.f9527i.f24435H0 = i9;
        requestLayout();
    }

    public void setOrientation(int i9) {
        this.f9527i.f24436I0 = i9;
        requestLayout();
    }

    public void setPadding(int i9) {
        C2152g c2152g = this.f9527i;
        c2152g.f24443f0 = i9;
        c2152g.f24444g0 = i9;
        c2152g.f24445h0 = i9;
        c2152g.f24446i0 = i9;
        requestLayout();
    }

    public void setPaddingBottom(int i9) {
        this.f9527i.f24444g0 = i9;
        requestLayout();
    }

    public void setPaddingLeft(int i9) {
        this.f9527i.f24447j0 = i9;
        requestLayout();
    }

    public void setPaddingRight(int i9) {
        this.f9527i.f24448k0 = i9;
        requestLayout();
    }

    public void setPaddingTop(int i9) {
        this.f9527i.f24443f0 = i9;
        requestLayout();
    }

    public void setVerticalAlign(int i9) {
        this.f9527i.f24433F0 = i9;
        requestLayout();
    }

    public void setVerticalBias(float f9) {
        this.f9527i.f24460x0 = f9;
        requestLayout();
    }

    public void setVerticalGap(int i9) {
        this.f9527i.f24431D0 = i9;
        requestLayout();
    }

    public void setVerticalStyle(int i9) {
        this.f9527i.r0 = i9;
        requestLayout();
    }

    public void setWrapMode(int i9) {
        this.f9527i.f24434G0 = i9;
        requestLayout();
    }
}
