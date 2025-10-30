package k;

import Y0.f;
import android.graphics.drawable.Animatable;
import com.google.android.gms.internal.measurement.Y1;

/* loaded from: classes.dex */
public final class a extends Y1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f19804n;

    /* renamed from: o, reason: collision with root package name */
    public final Animatable f19805o;

    public /* synthetic */ a(Animatable animatable, int i9) {
        this.f19804n = i9;
        this.f19805o = animatable;
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final void G() {
        switch (this.f19804n) {
            case 0:
                this.f19805o.start();
                return;
            default:
                ((f) this.f19805o).start();
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final void H() {
        switch (this.f19804n) {
            case 0:
                this.f19805o.stop();
                return;
            default:
                ((f) this.f19805o).stop();
                return;
        }
    }
}
