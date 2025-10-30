package l3;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* renamed from: l3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1551A {

    /* renamed from: a, reason: collision with root package name */
    public final j3.M f20225a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20226b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20227c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20228d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20229e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20230f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20231g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20232h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1561j[] f20233i;

    public C1551A(j3.M m9, int i9, int i10, int i11, int i12, int i13, int i14, int i15, InterfaceC1561j[] interfaceC1561jArr) {
        this.f20225a = m9;
        this.f20226b = i9;
        this.f20227c = i10;
        this.f20228d = i11;
        this.f20229e = i12;
        this.f20230f = i13;
        this.f20231g = i14;
        this.f20232h = i15;
        this.f20233i = interfaceC1561jArr;
    }

    public static AudioAttributes c(C1556e c1556e, boolean z9) {
        if (z9) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return (AudioAttributes) c1556e.a().f17433b;
    }

    public final AudioTrack a(boolean z9, C1556e c1556e, int i9) {
        boolean z10;
        boolean z11;
        int i10 = this.f20227c;
        try {
            AudioTrack b9 = b(z9, c1556e, i9);
            int state = b9.getState();
            if (state == 1) {
                return b9;
            }
            try {
                b9.release();
            } catch (Exception unused) {
            }
            if (i10 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            throw new o(state, this.f20229e, this.f20230f, this.f20232h, this.f20225a, z11, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e8) {
            if (i10 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            throw new o(0, this.f20229e, this.f20230f, this.f20232h, this.f20225a, z10, e8);
        }
    }

    public final AudioTrack b(boolean z9, C1556e c1556e, int i9) {
        AudioTrack.Builder offloadedPlayback;
        int i10 = l4.y.f20553a;
        int i11 = this.f20231g;
        int i12 = this.f20230f;
        int i13 = this.f20229e;
        if (i10 >= 29) {
            boolean z10 = true;
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(c(c1556e, z9)).setAudioFormat(D.e(i13, i12, i11)).setTransferMode(1).setBufferSizeInBytes(this.f20232h).setSessionId(i9);
            if (this.f20227c != 1) {
                z10 = false;
            }
            offloadedPlayback = sessionId.setOffloadedPlayback(z10);
            return offloadedPlayback.build();
        }
        if (i10 >= 21) {
            return new AudioTrack(c(c1556e, z9), D.e(i13, i12, i11), this.f20232h, 1, i9);
        }
        int z11 = l4.y.z(c1556e.f20392c);
        if (i9 == 0) {
            return new AudioTrack(z11, this.f20229e, this.f20230f, this.f20231g, this.f20232h, 1);
        }
        return new AudioTrack(z11, this.f20229e, this.f20230f, this.f20231g, this.f20232h, 1, i9);
    }
}
