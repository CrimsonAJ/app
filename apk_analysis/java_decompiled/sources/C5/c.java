package C5;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.Y1;

/* loaded from: classes.dex */
public final class c extends G.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Y1 f1595h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f1596i;

    public c(e eVar, Y1 y12) {
        this.f1596i = eVar;
        this.f1595h = y12;
    }

    @Override // G.b
    public final void h(int i9) {
        this.f1596i.f1612m = true;
        this.f1595h.w(i9);
    }

    @Override // G.b
    public final void i(Typeface typeface) {
        e eVar = this.f1596i;
        eVar.f1613n = Typeface.create(typeface, eVar.f1603c);
        eVar.f1612m = true;
        this.f1595h.x(eVar.f1613n, false);
    }
}
