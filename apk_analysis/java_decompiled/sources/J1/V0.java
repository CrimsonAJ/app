package J1;

import android.view.View;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class V0 extends W.g {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f3792x = 0;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialButton f3793v;

    /* renamed from: w, reason: collision with root package name */
    public long f3794w;

    public V0(W.b bVar, View view, MaterialButton materialButton) {
        super(bVar, view, 0);
        this.f3793v = materialButton;
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3794w = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3794w != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W.g
    public final void e0() {
        synchronized (this) {
            this.f3794w = 1L;
        }
        h0();
    }
}
