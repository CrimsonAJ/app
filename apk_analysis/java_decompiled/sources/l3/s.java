package l3;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final r f20427a;

    /* renamed from: b, reason: collision with root package name */
    public int f20428b;

    /* renamed from: c, reason: collision with root package name */
    public long f20429c;

    /* renamed from: d, reason: collision with root package name */
    public long f20430d;

    /* renamed from: e, reason: collision with root package name */
    public long f20431e;

    /* renamed from: f, reason: collision with root package name */
    public long f20432f;

    public s(AudioTrack audioTrack) {
        if (l4.y.f20553a >= 19) {
            this.f20427a = new r(audioTrack);
            a();
        } else {
            this.f20427a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.f20427a != null) {
            b(0);
        }
    }

    public final void b(int i9) {
        this.f20428b = i9;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2 && i9 != 3) {
                    if (i9 == 4) {
                        this.f20430d = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f20430d = 10000000L;
                return;
            }
            this.f20430d = 10000L;
            return;
        }
        this.f20431e = 0L;
        this.f20432f = -1L;
        this.f20429c = System.nanoTime() / 1000;
        this.f20430d = 10000L;
    }
}
