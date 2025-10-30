package androidx.mediarouter.app;

import android.widget.SeekBar;

/* loaded from: classes.dex */
public final class q implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableC0572h f10119a = new RunnableC0572h(1, this);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f10120b;

    public q(s sVar) {
        this.f10120b = sVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
        if (z9) {
            t0.C c3 = (t0.C) seekBar.getTag();
            int i10 = s.f10123N0;
            c3.j(i9);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        s sVar = this.f10120b;
        if (sVar.f10152k0 != null) {
            sVar.f10149i0.removeCallbacks(this.f10119a);
        }
        sVar.f10152k0 = (t0.C) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f10120b.f10149i0.postDelayed(this.f10119a, 500L);
    }
}
