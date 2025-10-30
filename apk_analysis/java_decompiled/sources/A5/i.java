package A5;

import android.animation.ObjectAnimator;
import java.util.ArrayList;
import k0.C1478a;

/* loaded from: classes.dex */
public final class i extends q {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f415k = {0, 1350, 2700, 4050};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f416l = {667, 2017, 3367, 4717};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f417m = {1000, 2350, 3700, 5050};

    /* renamed from: n, reason: collision with root package name */
    public static final h f418n = new h(Float.class, "animationFraction", 0);

    /* renamed from: o, reason: collision with root package name */
    public static final h f419o = new h(Float.class, "completeEndFraction", 1);

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f420c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f421d;

    /* renamed from: e, reason: collision with root package name */
    public final C1478a f422e;

    /* renamed from: f, reason: collision with root package name */
    public final j f423f;

    /* renamed from: g, reason: collision with root package name */
    public int f424g;

    /* renamed from: h, reason: collision with root package name */
    public float f425h;

    /* renamed from: i, reason: collision with root package name */
    public float f426i;
    public c j;

    public i(j jVar) {
        super(1);
        this.f424g = 0;
        this.j = null;
        this.f423f = jVar;
        this.f422e = new C1478a(1);
    }

    @Override // A5.q
    public final void c() {
        ObjectAnimator objectAnimator = this.f420c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // A5.q
    public final void l() {
        this.f424g = 0;
        ((o) ((ArrayList) this.f453b).get(0)).f449c = this.f423f.f402c[0];
        this.f426i = 0.0f;
    }

    @Override // A5.q
    public final void q(c cVar) {
        this.j = cVar;
    }

    @Override // A5.q
    public final void r() {
        ObjectAnimator objectAnimator = this.f421d;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (((r) this.f452a).isVisible()) {
                this.f421d.start();
            } else {
                c();
            }
        }
    }

    @Override // A5.q
    public final void t() {
        if (this.f420c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f418n, 0.0f, 1.0f);
            this.f420c = ofFloat;
            ofFloat.setDuration(5400L);
            this.f420c.setInterpolator(null);
            this.f420c.setRepeatCount(-1);
            this.f420c.addListener(new g(this, 0));
        }
        if (this.f421d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f419o, 0.0f, 1.0f);
            this.f421d = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f421d.setInterpolator(this.f422e);
            this.f421d.addListener(new g(this, 1));
        }
        this.f424g = 0;
        ((o) ((ArrayList) this.f453b).get(0)).f449c = this.f423f.f402c[0];
        this.f426i = 0.0f;
        this.f420c.start();
    }

    @Override // A5.q
    public final void u() {
        this.j = null;
    }
}
