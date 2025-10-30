package p0;

import android.media.VolumeProvider;
import b5.G1;
import d0.n;
import t0.C1971e;
import t0.RunnableC1969c;

/* loaded from: classes.dex */
public final class f extends VolumeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f22106a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n nVar, int i9, int i10, int i11) {
        super(i9, i10, i11);
        this.f22106a = nVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i9) {
        n nVar = this.f22106a;
        C1971e c1971e = (C1971e) ((G1) nVar.f16660f).f10719d;
        c1971e.f22963a.post(new RunnableC1969c(nVar, i9, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i9) {
        n nVar = this.f22106a;
        C1971e c1971e = (C1971e) ((G1) nVar.f16660f).f10719d;
        c1971e.f22963a.post(new RunnableC1969c(nVar, i9, 0));
    }
}
