package A5;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r extends n {

    /* renamed from: l, reason: collision with root package name */
    public final p f454l;

    /* renamed from: m, reason: collision with root package name */
    public q f455m;

    /* renamed from: n, reason: collision with root package name */
    public Y0.r f456n;

    public r(Context context, e eVar, p pVar, q qVar) {
        super(context, eVar);
        this.f454l = pVar;
        this.f455m = qVar;
        qVar.f452a = this;
    }

    @Override // A5.n
    public final boolean d(boolean z9, boolean z10, boolean z11) {
        Y0.r rVar;
        boolean d9 = super.d(z9, z10, z11);
        if (this.f440c != null && Settings.Global.getFloat(this.f438a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (rVar = this.f456n) != null) {
            return rVar.setVisible(z9, z10);
        }
        if (!isRunning()) {
            this.f455m.c();
        }
        if (z9 && z11) {
            this.f455m.t();
        }
        return d9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i9;
        Y0.r rVar;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (this.f440c != null && Settings.Global.getFloat(this.f438a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            e eVar = this.f439b;
            if (z9 && (rVar = this.f456n) != null) {
                rVar.setBounds(getBounds());
                this.f456n.setTint(eVar.f402c[0]);
                this.f456n.draw(canvas);
                return;
            }
            canvas.save();
            p pVar = this.f454l;
            Rect bounds = getBounds();
            float b9 = b();
            ObjectAnimator objectAnimator = this.f441d;
            if (objectAnimator != null && objectAnimator.isRunning()) {
                z10 = true;
            } else {
                z10 = false;
            }
            ObjectAnimator objectAnimator2 = this.f442e;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                z11 = true;
            } else {
                z11 = false;
            }
            pVar.f451a.a();
            pVar.a(canvas, bounds, b9, z10, z11);
            int i10 = eVar.f406g;
            int i11 = this.j;
            Paint paint = this.f446i;
            if (i10 == 0) {
                this.f454l.d(canvas, paint, 0.0f, 1.0f, eVar.f403d, i11, 0);
                i9 = i10;
            } else {
                o oVar = (o) ((ArrayList) this.f455m.f453b).get(0);
                ArrayList arrayList = (ArrayList) this.f455m.f453b;
                o oVar2 = (o) arrayList.get(arrayList.size() - 1);
                p pVar2 = this.f454l;
                if (pVar2 instanceof s) {
                    i9 = i10;
                    pVar2.d(canvas, paint, 0.0f, oVar.f447a, eVar.f403d, i11, i9);
                    this.f454l.d(canvas, paint, oVar2.f448b, 1.0f, eVar.f403d, i11, i9);
                } else {
                    i9 = i10;
                    i11 = 0;
                    pVar2.d(canvas, paint, oVar2.f448b, oVar.f447a + 1.0f, eVar.f403d, 0, i9);
                }
            }
            for (int i12 = 0; i12 < ((ArrayList) this.f455m.f453b).size(); i12++) {
                o oVar3 = (o) ((ArrayList) this.f455m.f453b).get(i12);
                this.f454l.c(canvas, paint, oVar3, this.j);
                if (i12 > 0 && i9 > 0) {
                    this.f454l.d(canvas, paint, ((o) ((ArrayList) this.f455m.f453b).get(i12 - 1)).f448b, oVar3.f447a, eVar.f403d, i11, i9);
                }
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f454l.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f454l.f();
    }
}
