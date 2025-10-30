package androidx.mediarouter.app;

import android.view.KeyEvent;
import android.widget.SeekBar;
import java.util.Collections;
import t0.AbstractC1989x;
import t0.C1966B;
import t0.C1991z;

/* loaded from: classes.dex */
public final class F extends AbstractC1989x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f9947b;

    public /* synthetic */ F(KeyEvent.Callback callback, int i9) {
        this.f9946a = i9;
        this.f9947b = callback;
    }

    @Override // t0.AbstractC1989x
    public void a() {
        switch (this.f9946a) {
            case 1:
                ((MediaRouteButton) this.f9947b).b();
                return;
            default:
                return;
        }
    }

    @Override // t0.AbstractC1989x
    public void b() {
        switch (this.f9946a) {
            case 1:
                ((MediaRouteButton) this.f9947b).b();
                return;
            default:
                return;
        }
    }

    @Override // t0.AbstractC1989x
    public void c() {
        switch (this.f9946a) {
            case 1:
                ((MediaRouteButton) this.f9947b).b();
                return;
            default:
                return;
        }
    }

    @Override // t0.AbstractC1989x
    public void d(t0.D d9, t0.C c3) {
        switch (this.f9946a) {
            case 0:
                ((N) this.f9947b).m();
                return;
            case 1:
                ((MediaRouteButton) this.f9947b).b();
                return;
            case 2:
                ((DialogC0569e) this.f9947b).g();
                return;
            case 3:
            default:
                return;
            case 4:
                ((A) this.f9947b).f();
                return;
        }
    }

    @Override // t0.AbstractC1989x
    public final void e(t0.D d9, t0.C c3) {
        C1991z a5;
        switch (this.f9946a) {
            case 0:
                N n7 = (N) this.f9947b;
                if (c3 == n7.f10021i && t0.C.b() != null) {
                    C1966B c1966b = c3.f22840a;
                    c1966b.getClass();
                    t0.D.b();
                    for (t0.C c9 : Collections.unmodifiableList(c1966b.f22836b)) {
                        if (!Collections.unmodifiableList(n7.f10021i.f22860v).contains(c9) && (a5 = n7.f10021i.a()) != null && a5.o(c9) && !n7.f10024k.contains(c9)) {
                            n7.n();
                            n7.l();
                            return;
                        }
                    }
                }
                n7.m();
                return;
            case 1:
                ((MediaRouteButton) this.f9947b).b();
                return;
            case 2:
                ((DialogC0569e) this.f9947b).g();
                return;
            case 3:
                ((s) this.f9947b).p(true);
                return;
            default:
                ((A) this.f9947b).f();
                return;
        }
    }

    @Override // t0.AbstractC1989x
    public void h(t0.D d9, t0.C c3) {
        switch (this.f9946a) {
            case 0:
                ((N) this.f9947b).m();
                return;
            case 1:
                ((MediaRouteButton) this.f9947b).b();
                return;
            case 2:
                ((DialogC0569e) this.f9947b).g();
                return;
            case 3:
            default:
                return;
            case 4:
                ((A) this.f9947b).f();
                return;
        }
    }

    @Override // t0.AbstractC1989x
    public void i(t0.C c3) {
        switch (this.f9946a) {
            case 0:
                N n7 = (N) this.f9947b;
                n7.f10021i = c3;
                n7.n();
                n7.l();
                return;
            case 1:
                ((MediaRouteButton) this.f9947b).b();
                return;
            case 2:
                ((DialogC0569e) this.f9947b).dismiss();
                return;
            case 3:
            default:
                return;
            case 4:
                ((A) this.f9947b).dismiss();
                return;
        }
    }

    @Override // t0.AbstractC1989x
    public void k() {
        switch (this.f9946a) {
            case 0:
                ((N) this.f9947b).m();
                return;
            case 1:
                ((MediaRouteButton) this.f9947b).b();
                return;
            case 2:
            default:
                return;
            case 3:
                ((s) this.f9947b).p(false);
                return;
        }
    }

    @Override // t0.AbstractC1989x
    public void m(t0.C c3) {
        E e8;
        boolean z9;
        KeyEvent.Callback callback = this.f9947b;
        switch (this.f9946a) {
            case 0:
                int i9 = N.r0;
                N n7 = (N) callback;
                if (n7.f10043w != c3 && (e8 = (E) n7.f10042v.get(c3.f22842c)) != null) {
                    int i10 = e8.f9942u.f22854p;
                    if (i10 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    e8.s(z9);
                    e8.f9944w.setProgress(i10);
                    return;
                }
                return;
            case 3:
                s sVar = (s) callback;
                SeekBar seekBar = (SeekBar) sVar.f10162p0.get(c3);
                int i11 = c3.f22854p;
                int i12 = s.f10123N0;
                if (seekBar != null && sVar.f10152k0 != c3) {
                    seekBar.setProgress(i11);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // t0.AbstractC1989x
    public void n(t0.F f9) {
        boolean z9;
        switch (this.f9946a) {
            case 1:
                if (f9 != null) {
                    z9 = f9.f22872e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON");
                } else {
                    z9 = false;
                }
                MediaRouteButton mediaRouteButton = (MediaRouteButton) this.f9947b;
                if (mediaRouteButton.f9989f != z9) {
                    mediaRouteButton.f9989f = z9;
                    mediaRouteButton.refreshDrawableState();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
