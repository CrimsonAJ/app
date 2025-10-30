package z;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import x.AbstractC2154i;
import x.C2146a;
import x.C2149d;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2221a extends AbstractC2223c {

    /* renamed from: g, reason: collision with root package name */
    public int f25179g;

    /* renamed from: h, reason: collision with root package name */
    public int f25180h;

    /* renamed from: i, reason: collision with root package name */
    public C2146a f25181i;

    /* JADX WARN: Type inference failed for: r0v0, types: [x.i, x.a] */
    @Override // z.AbstractC2223c
    public final void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        ?? abstractC2154i = new AbstractC2154i();
        abstractC2154i.f24319f0 = 0;
        abstractC2154i.f24320g0 = true;
        abstractC2154i.f24321h0 = 0;
        this.f25181i = abstractC2154i;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f25352b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = obtainStyledAttributes.getIndex(i9);
                if (index == 15) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 14) {
                    this.f25181i.f24320g0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 16) {
                    this.f25181i.f24321h0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
        }
        this.f25191d = this.f25181i;
        h();
    }

    @Override // z.AbstractC2223c
    public final void f(C2149d c2149d, boolean z9) {
        int i9 = this.f25179g;
        this.f25180h = i9;
        if (z9) {
            if (i9 == 5) {
                this.f25180h = 1;
            } else if (i9 == 6) {
                this.f25180h = 0;
            }
        } else if (i9 == 5) {
            this.f25180h = 0;
        } else if (i9 == 6) {
            this.f25180h = 1;
        }
        if (c2149d instanceof C2146a) {
            ((C2146a) c2149d).f24319f0 = this.f25180h;
        }
    }

    public int getMargin() {
        return this.f25181i.f24321h0;
    }

    public int getType() {
        return this.f25179g;
    }

    public void setAllowsGoneWidget(boolean z9) {
        this.f25181i.f24320g0 = z9;
    }

    public void setDpMargin(int i9) {
        this.f25181i.f24321h0 = (int) ((i9 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i9) {
        this.f25181i.f24321h0 = i9;
    }

    public void setType(int i9) {
        this.f25179g = i9;
    }
}
