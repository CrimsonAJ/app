package J1;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes.dex */
public final class y1 extends W.g {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f4142x = 0;

    /* renamed from: v, reason: collision with root package name */
    public final AppCompatImageView f4143v;

    /* renamed from: w, reason: collision with root package name */
    public long f4144w;

    public y1(W.b bVar, View view, AppCompatImageView appCompatImageView) {
        super(bVar, view, 0);
        this.f4143v = appCompatImageView;
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f4144w = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f4144w != 0) {
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
            this.f4144w = 1L;
        }
        h0();
    }
}
