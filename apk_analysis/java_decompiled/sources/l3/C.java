package l3;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import b5.G1;
import j3.C1442E;

/* loaded from: classes.dex */
public final class C extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G1 f20238a;

    public C(G1 g12) {
        this.f20238a = g12;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i9) {
        D d9;
        i.G g9;
        C1442E c1442e;
        if (audioTrack.equals(((D) this.f20238a.f10719d).f20288u) && (g9 = (d9 = (D) this.f20238a.f10719d).f20285r) != null && d9.f20261U && (c1442e = ((H) g9.f17990b).f20306m1) != null) {
            c1442e.f19319a.f19363h.c(2);
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        D d9;
        i.G g9;
        C1442E c1442e;
        if (audioTrack.equals(((D) this.f20238a.f10719d).f20288u) && (g9 = (d9 = (D) this.f20238a.f10719d).f20285r) != null && d9.f20261U && (c1442e = ((H) g9.f17990b).f20306m1) != null) {
            c1442e.f19319a.f19363h.c(2);
        }
    }
}
