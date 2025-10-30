package l3;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: A, reason: collision with root package name */
    public long f20433A;

    /* renamed from: B, reason: collision with root package name */
    public long f20434B;

    /* renamed from: C, reason: collision with root package name */
    public long f20435C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f20436D;

    /* renamed from: E, reason: collision with root package name */
    public long f20437E;

    /* renamed from: F, reason: collision with root package name */
    public long f20438F;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.messaging.u f20439a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f20440b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f20441c;

    /* renamed from: d, reason: collision with root package name */
    public int f20442d;

    /* renamed from: e, reason: collision with root package name */
    public int f20443e;

    /* renamed from: f, reason: collision with root package name */
    public s f20444f;

    /* renamed from: g, reason: collision with root package name */
    public int f20445g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20446h;

    /* renamed from: i, reason: collision with root package name */
    public long f20447i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20448k;

    /* renamed from: l, reason: collision with root package name */
    public long f20449l;

    /* renamed from: m, reason: collision with root package name */
    public long f20450m;

    /* renamed from: n, reason: collision with root package name */
    public Method f20451n;

    /* renamed from: o, reason: collision with root package name */
    public long f20452o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20453p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20454q;

    /* renamed from: r, reason: collision with root package name */
    public long f20455r;

    /* renamed from: s, reason: collision with root package name */
    public long f20456s;

    /* renamed from: t, reason: collision with root package name */
    public long f20457t;

    /* renamed from: u, reason: collision with root package name */
    public long f20458u;

    /* renamed from: v, reason: collision with root package name */
    public int f20459v;

    /* renamed from: w, reason: collision with root package name */
    public int f20460w;

    /* renamed from: x, reason: collision with root package name */
    public long f20461x;

    /* renamed from: y, reason: collision with root package name */
    public long f20462y;

    /* renamed from: z, reason: collision with root package name */
    public long f20463z;

    public t(com.google.firebase.messaging.u uVar) {
        this.f20439a = uVar;
        if (l4.y.f20553a >= 18) {
            try {
                this.f20451n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f20440b = new long[10];
    }

    public final long a() {
        AudioTrack audioTrack = this.f20441c;
        audioTrack.getClass();
        if (this.f20461x != -9223372036854775807L) {
            return Math.min(this.f20433A, this.f20463z + ((((SystemClock.elapsedRealtime() * 1000) - this.f20461x) * this.f20445g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f20446h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f20458u = this.f20456s;
            }
            playbackHeadPosition += this.f20458u;
        }
        if (l4.y.f20553a <= 29) {
            if (playbackHeadPosition == 0 && this.f20456s > 0 && playState == 3) {
                if (this.f20462y == -9223372036854775807L) {
                    this.f20462y = SystemClock.elapsedRealtime();
                }
                return this.f20456s;
            }
            this.f20462y = -9223372036854775807L;
        }
        if (this.f20456s > playbackHeadPosition) {
            this.f20457t++;
        }
        this.f20456s = playbackHeadPosition;
        return playbackHeadPosition + (this.f20457t << 32);
    }

    public final boolean b(long j) {
        if (j <= a()) {
            if (this.f20446h) {
                AudioTrack audioTrack = this.f20441c;
                audioTrack.getClass();
                if (audioTrack.getPlayState() != 2 || a() != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }
}
