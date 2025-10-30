package m5;

import android.view.View;

/* loaded from: classes.dex */
public final class d extends AbstractC1593a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f20841a;

    public d(f fVar) {
        this.f20841a = fVar;
    }

    @Override // m5.AbstractC1593a
    public final void c(View view, int i9) {
        if (i9 == 5) {
            this.f20841a.cancel();
        }
    }

    @Override // m5.AbstractC1593a
    public final void b(View view) {
    }
}
