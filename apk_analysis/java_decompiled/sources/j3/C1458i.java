package j3;

import k4.C1517q;
import l4.AbstractC1566a;

/* renamed from: j3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1458i {

    /* renamed from: a, reason: collision with root package name */
    public final C1517q f19638a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19639b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19640c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19641d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19642e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19643f;

    /* renamed from: g, reason: collision with root package name */
    public final long f19644g;

    /* renamed from: h, reason: collision with root package name */
    public int f19645h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f19646i;

    public C1458i() {
        C1517q c1517q = new C1517q();
        a("bufferForPlaybackMs", 2500, 0, "0");
        a("bufferForPlaybackAfterRebufferMs", 5000, 0, "0");
        a("minBufferMs", 50000, 2500, "bufferForPlaybackMs");
        a("minBufferMs", 50000, 5000, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", 50000, 50000, "minBufferMs");
        a("backBufferDurationMs", 0, 0, "0");
        this.f19638a = c1517q;
        long j = 50000;
        this.f19639b = l4.y.H(j);
        this.f19640c = l4.y.H(j);
        this.f19641d = l4.y.H(2500);
        this.f19642e = l4.y.H(5000);
        this.f19643f = -1;
        this.f19645h = 13107200;
        this.f19644g = l4.y.H(0);
    }

    public static void a(String str, int i9, int i10, String str2) {
        boolean z9;
        if (i9 >= i10) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.g(str + " cannot be less than " + str2, z9);
    }

    public final void b(boolean z9) {
        int i9 = this.f19643f;
        if (i9 == -1) {
            i9 = 13107200;
        }
        this.f19645h = i9;
        this.f19646i = false;
        if (z9) {
            C1517q c1517q = this.f19638a;
            synchronized (c1517q) {
                if (c1517q.f20085a) {
                    c1517q.a(0);
                }
            }
        }
    }

    public final boolean c(long j, float f9) {
        int i9;
        boolean z9;
        C1517q c1517q = this.f19638a;
        synchronized (c1517q) {
            i9 = c1517q.f20088d * c1517q.f20086b;
        }
        if (i9 >= this.f19645h) {
            z9 = true;
        } else {
            z9 = false;
        }
        long j4 = this.f19640c;
        long j9 = this.f19639b;
        if (f9 > 1.0f) {
            j9 = Math.min(l4.y.u(j9, f9), j4);
        }
        if (j < Math.max(j9, 500000L)) {
            this.f19646i = !z9;
            if (z9 && j < 500000) {
                AbstractC1566a.P("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= j4 || z9) {
            this.f19646i = false;
        }
        return this.f19646i;
    }
}
