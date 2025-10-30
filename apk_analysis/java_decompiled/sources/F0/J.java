package F0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class J extends K {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2040d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(androidx.recyclerview.widget.a aVar, int i9) {
        super(aVar);
        this.f2040d = i9;
    }

    @Override // F0.K
    public final int d(View view) {
        switch (this.f2040d) {
            case 0:
                C0099c0 c0099c0 = (C0099c0) view.getLayoutParams();
                ((androidx.recyclerview.widget.a) this.f2042b).getClass();
                return androidx.recyclerview.widget.a.E(view) + ((ViewGroup.MarginLayoutParams) c0099c0).rightMargin;
            default:
                C0099c0 c0099c02 = (C0099c0) view.getLayoutParams();
                ((androidx.recyclerview.widget.a) this.f2042b).getClass();
                return androidx.recyclerview.widget.a.z(view) + ((ViewGroup.MarginLayoutParams) c0099c02).bottomMargin;
        }
    }

    @Override // F0.K
    public final int e(View view) {
        switch (this.f2040d) {
            case 0:
                C0099c0 c0099c0 = (C0099c0) view.getLayoutParams();
                ((androidx.recyclerview.widget.a) this.f2042b).getClass();
                return androidx.recyclerview.widget.a.D(view) + ((ViewGroup.MarginLayoutParams) c0099c0).leftMargin + ((ViewGroup.MarginLayoutParams) c0099c0).rightMargin;
            default:
                C0099c0 c0099c02 = (C0099c0) view.getLayoutParams();
                ((androidx.recyclerview.widget.a) this.f2042b).getClass();
                return androidx.recyclerview.widget.a.C(view) + ((ViewGroup.MarginLayoutParams) c0099c02).topMargin + ((ViewGroup.MarginLayoutParams) c0099c02).bottomMargin;
        }
    }

    @Override // F0.K
    public final int f(View view) {
        switch (this.f2040d) {
            case 0:
                C0099c0 c0099c0 = (C0099c0) view.getLayoutParams();
                ((androidx.recyclerview.widget.a) this.f2042b).getClass();
                return androidx.recyclerview.widget.a.C(view) + ((ViewGroup.MarginLayoutParams) c0099c0).topMargin + ((ViewGroup.MarginLayoutParams) c0099c0).bottomMargin;
            default:
                C0099c0 c0099c02 = (C0099c0) view.getLayoutParams();
                ((androidx.recyclerview.widget.a) this.f2042b).getClass();
                return androidx.recyclerview.widget.a.D(view) + ((ViewGroup.MarginLayoutParams) c0099c02).leftMargin + ((ViewGroup.MarginLayoutParams) c0099c02).rightMargin;
        }
    }

    @Override // F0.K
    public final int g(View view) {
        switch (this.f2040d) {
            case 0:
                C0099c0 c0099c0 = (C0099c0) view.getLayoutParams();
                ((androidx.recyclerview.widget.a) this.f2042b).getClass();
                return androidx.recyclerview.widget.a.B(view) - ((ViewGroup.MarginLayoutParams) c0099c0).leftMargin;
            default:
                C0099c0 c0099c02 = (C0099c0) view.getLayoutParams();
                ((androidx.recyclerview.widget.a) this.f2042b).getClass();
                return androidx.recyclerview.widget.a.F(view) - ((ViewGroup.MarginLayoutParams) c0099c02).topMargin;
        }
    }

    @Override // F0.K
    public final int h() {
        switch (this.f2040d) {
            case 0:
                return ((androidx.recyclerview.widget.a) this.f2042b).f10349n;
            default:
                return ((androidx.recyclerview.widget.a) this.f2042b).f10350o;
        }
    }

    @Override // F0.K
    public final int i() {
        switch (this.f2040d) {
            case 0:
                androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) this.f2042b;
                return aVar.f10349n - aVar.J();
            default:
                androidx.recyclerview.widget.a aVar2 = (androidx.recyclerview.widget.a) this.f2042b;
                return aVar2.f10350o - aVar2.H();
        }
    }

    @Override // F0.K
    public final int j() {
        switch (this.f2040d) {
            case 0:
                return ((androidx.recyclerview.widget.a) this.f2042b).J();
            default:
                return ((androidx.recyclerview.widget.a) this.f2042b).H();
        }
    }

    @Override // F0.K
    public final int k() {
        switch (this.f2040d) {
            case 0:
                return ((androidx.recyclerview.widget.a) this.f2042b).f10347l;
            default:
                return ((androidx.recyclerview.widget.a) this.f2042b).f10348m;
        }
    }

    @Override // F0.K
    public final int l() {
        switch (this.f2040d) {
            case 0:
                return ((androidx.recyclerview.widget.a) this.f2042b).f10348m;
            default:
                return ((androidx.recyclerview.widget.a) this.f2042b).f10347l;
        }
    }

    @Override // F0.K
    public final int m() {
        switch (this.f2040d) {
            case 0:
                return ((androidx.recyclerview.widget.a) this.f2042b).I();
            default:
                return ((androidx.recyclerview.widget.a) this.f2042b).K();
        }
    }

    @Override // F0.K
    public final int n() {
        switch (this.f2040d) {
            case 0:
                androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) this.f2042b;
                return (aVar.f10349n - aVar.I()) - aVar.J();
            default:
                androidx.recyclerview.widget.a aVar2 = (androidx.recyclerview.widget.a) this.f2042b;
                return (aVar2.f10350o - aVar2.K()) - aVar2.H();
        }
    }

    @Override // F0.K
    public final int p(View view) {
        switch (this.f2040d) {
            case 0:
                androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) this.f2042b;
                Rect rect = (Rect) this.f2043c;
                aVar.O(view, rect);
                return rect.right;
            default:
                androidx.recyclerview.widget.a aVar2 = (androidx.recyclerview.widget.a) this.f2042b;
                Rect rect2 = (Rect) this.f2043c;
                aVar2.O(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // F0.K
    public final int q(View view) {
        switch (this.f2040d) {
            case 0:
                androidx.recyclerview.widget.a aVar = (androidx.recyclerview.widget.a) this.f2042b;
                Rect rect = (Rect) this.f2043c;
                aVar.O(view, rect);
                return rect.left;
            default:
                androidx.recyclerview.widget.a aVar2 = (androidx.recyclerview.widget.a) this.f2042b;
                Rect rect2 = (Rect) this.f2043c;
                aVar2.O(view, rect2);
                return rect2.top;
        }
    }

    @Override // F0.K
    public final void r(int i9) {
        switch (this.f2040d) {
            case 0:
                ((androidx.recyclerview.widget.a) this.f2042b).T(i9);
                return;
            default:
                ((androidx.recyclerview.widget.a) this.f2042b).U(i9);
                return;
        }
    }
}
