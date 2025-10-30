package A5;

import android.animation.ObjectAnimator;
import java.util.ArrayList;
import k0.C1478a;

/* loaded from: classes.dex */
public final class u extends q {

    /* renamed from: i, reason: collision with root package name */
    public static final h f464i = new h(Float.class, "animationFraction", 3);

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f465c;

    /* renamed from: d, reason: collision with root package name */
    public final C1478a f466d;

    /* renamed from: e, reason: collision with root package name */
    public final x f467e;

    /* renamed from: f, reason: collision with root package name */
    public int f468f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f469g;

    /* renamed from: h, reason: collision with root package name */
    public float f470h;

    public u(x xVar) {
        super(3);
        this.f468f = 1;
        this.f467e = xVar;
        this.f466d = new C1478a(1);
    }

    @Override // A5.q
    public final void c() {
        ObjectAnimator objectAnimator = this.f465c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // A5.q
    public final void l() {
        v();
    }

    @Override // A5.q
    public final void t() {
        if (this.f465c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f464i, 0.0f, 1.0f);
            this.f465c = ofFloat;
            ofFloat.setDuration(333L);
            this.f465c.setInterpolator(null);
            this.f465c.setRepeatCount(-1);
            this.f465c.addListener(new t(0, this));
        }
        v();
        this.f465c.start();
    }

    public final void v() {
        this.f469g = true;
        this.f468f = 1;
        ArrayList arrayList = (ArrayList) this.f453b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            o oVar = (o) obj;
            x xVar = this.f467e;
            oVar.f449c = xVar.f402c[0];
            oVar.f450d = xVar.f406g / 2;
        }
    }

    @Override // A5.q
    public final void r() {
    }

    @Override // A5.q
    public final void u() {
    }

    @Override // A5.q
    public final void q(c cVar) {
    }
}
