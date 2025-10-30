package i4;

import P5.Q;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: classes.dex */
public final class j implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f18559a;

    public j(o oVar) {
        this.f18559a = oVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z9) {
        o oVar = this.f18559a;
        Q q9 = o.j;
        oVar.f();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z9) {
        o oVar = this.f18559a;
        Q q9 = o.j;
        oVar.f();
    }
}
