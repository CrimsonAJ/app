package androidx.mediarouter.app;

import android.widget.SeekBar;

/* loaded from: classes.dex */
public final class M implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f9980a;

    public M(N n7) {
        this.f9980a = n7;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
        boolean z10;
        if (z9) {
            t0.C c3 = (t0.C) seekBar.getTag();
            E e8 = (E) this.f9980a.f10042v.get(c3.f22842c);
            if (e8 != null) {
                if (i9 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e8.s(z10);
            }
            c3.j(i9);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        N n7 = this.f9980a;
        if (n7.f10043w != null) {
            n7.f10038r.removeMessages(2);
        }
        n7.f10043w = (t0.C) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f9980a.f10038r.sendEmptyMessageDelayed(2, 500L);
    }
}
