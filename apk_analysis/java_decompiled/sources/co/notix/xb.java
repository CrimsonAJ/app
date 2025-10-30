package co.notix;

import android.os.CountDownTimer;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class xb extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f13513a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(long j, WeakReference weakReference) {
        super(j, 1000L);
        this.f13513a = weakReference;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        View view = (View) this.f13513a.get();
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
