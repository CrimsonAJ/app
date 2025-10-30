package k3;

import A3.E;
import N3.A;
import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import j3.C0;
import j3.C1462m;
import j3.D0;
import j3.E0;
import j3.M;
import j3.U;
import java.util.HashMap;
import l4.y;

/* renamed from: k3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1494j {

    /* renamed from: A, reason: collision with root package name */
    public boolean f19952A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f19953a;

    /* renamed from: b, reason: collision with root package name */
    public final C1491g f19954b;

    /* renamed from: c, reason: collision with root package name */
    public final PlaybackSession f19955c;

    /* renamed from: i, reason: collision with root package name */
    public String f19961i;
    public PlaybackMetrics.Builder j;

    /* renamed from: k, reason: collision with root package name */
    public int f19962k;

    /* renamed from: n, reason: collision with root package name */
    public C1462m f19965n;

    /* renamed from: o, reason: collision with root package name */
    public E f19966o;

    /* renamed from: p, reason: collision with root package name */
    public E f19967p;

    /* renamed from: q, reason: collision with root package name */
    public E f19968q;

    /* renamed from: r, reason: collision with root package name */
    public M f19969r;

    /* renamed from: s, reason: collision with root package name */
    public M f19970s;

    /* renamed from: t, reason: collision with root package name */
    public M f19971t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f19972u;

    /* renamed from: v, reason: collision with root package name */
    public int f19973v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19974w;

    /* renamed from: x, reason: collision with root package name */
    public int f19975x;

    /* renamed from: y, reason: collision with root package name */
    public int f19976y;

    /* renamed from: z, reason: collision with root package name */
    public int f19977z;

    /* renamed from: e, reason: collision with root package name */
    public final D0 f19957e = new D0();

    /* renamed from: f, reason: collision with root package name */
    public final C0 f19958f = new C0();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f19960h = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f19959g = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final long f19956d = SystemClock.elapsedRealtime();

    /* renamed from: l, reason: collision with root package name */
    public int f19963l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f19964m = 0;

    public C1494j(Context context, PlaybackSession playbackSession) {
        this.f19953a = context.getApplicationContext();
        this.f19955c = playbackSession;
        C1491g c1491g = new C1491g();
        this.f19954b = c1491g;
        c1491g.f19949d = this;
    }

    public final boolean a(E e8) {
        String str;
        if (e8 != null) {
            String str2 = (String) e8.f48d;
            C1491g c1491g = this.f19954b;
            synchronized (c1491g) {
                str = c1491g.f19951f;
            }
            if (str2.equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b() {
        long longValue;
        long longValue2;
        int i9;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.f19952A) {
            builder.setAudioUnderrunCount(this.f19977z);
            this.j.setVideoFramesDropped(this.f19975x);
            this.j.setVideoFramesPlayed(this.f19976y);
            Long l9 = (Long) this.f19959g.get(this.f19961i);
            PlaybackMetrics.Builder builder2 = this.j;
            if (l9 == null) {
                longValue = 0;
            } else {
                longValue = l9.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l10 = (Long) this.f19960h.get(this.f19961i);
            PlaybackMetrics.Builder builder3 = this.j;
            if (l10 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l10.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.j;
            if (l10 != null && l10.longValue() > 0) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            builder4.setStreamSource(i9);
            PlaybackSession playbackSession = this.f19955c;
            build = this.j.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.j = null;
        this.f19961i = null;
        this.f19977z = 0;
        this.f19975x = 0;
        this.f19976y = 0;
        this.f19969r = null;
        this.f19970s = null;
        this.f19971t = null;
        this.f19952A = false;
    }

    public final void c(E0 e02, A a5) {
        int b9;
        int i9 = 3;
        int i10 = 2;
        int i11 = 0;
        char c3 = 65535;
        PlaybackMetrics.Builder builder = this.j;
        if (a5 == null || (b9 = e02.b(a5.f5207a)) == -1) {
            return;
        }
        C0 c02 = this.f19958f;
        e02.f(b9, c02, false);
        int i12 = c02.f19237c;
        D0 d02 = this.f19957e;
        e02.n(i12, d02);
        U u9 = d02.f19305c.f19492b;
        if (u9 == null) {
            i9 = 0;
        } else {
            String str = u9.f19476b;
            if (str == null) {
                i11 = y.D(u9.f19475a);
            } else {
                int i13 = y.f20553a;
                switch (str.hashCode()) {
                    case -979127466:
                        if (str.equals("application/x-mpegURL")) {
                            c3 = 0;
                            break;
                        }
                        break;
                    case -156749520:
                        if (str.equals("application/vnd.ms-sstr+xml")) {
                            c3 = 1;
                            break;
                        }
                        break;
                    case 64194685:
                        if (str.equals("application/dash+xml")) {
                            c3 = 2;
                            break;
                        }
                        break;
                    case 1154777587:
                        if (str.equals("application/x-rtsp")) {
                            c3 = 3;
                            break;
                        }
                        break;
                }
                switch (c3) {
                    case 0:
                        i11 = 2;
                        break;
                    case 1:
                        i11 = 1;
                        break;
                    case 2:
                        break;
                    case 3:
                        i11 = 3;
                        break;
                    default:
                        i11 = 4;
                        break;
                }
            }
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        i9 = 1;
                    } else {
                        i9 = 4;
                    }
                } else {
                    i9 = 5;
                }
            }
        }
        builder.setStreamType(i9);
        if (d02.f19315n != -9223372036854775807L && !d02.f19313l && !d02.f19311i && !d02.a()) {
            builder.setMediaDurationMillis(y.T(d02.f19315n));
        }
        if (!d02.a()) {
            i10 = 1;
        }
        builder.setPlaybackType(i10);
        this.f19952A = true;
    }

    public final void d(C1485a c1485a, String str) {
        A a5 = c1485a.f19917d;
        if ((a5 == null || !a5.a()) && str.equals(this.f19961i)) {
            b();
        }
        this.f19959g.remove(str);
        this.f19960h.remove(str);
    }

    public final void e(int i9, long j, M m9, int i10) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i11;
        String str;
        timeSinceCreatedMillis = AbstractC1492h.l(i9).setTimeSinceCreatedMillis(j - this.f19956d);
        if (m9 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i10 != 1) {
                i11 = 3;
                if (i10 != 2) {
                    if (i10 != 3) {
                        i11 = 1;
                    } else {
                        i11 = 4;
                    }
                }
            } else {
                i11 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i11);
            String str2 = m9.f19434k;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = m9.f19435l;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = m9.f19433i;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i12 = m9.f19432h;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = m9.f19440q;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = m9.f19441r;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = m9.f19448y;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = m9.f19449z;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str5 = m9.f19427c;
            if (str5 != null) {
                int i17 = y.f20553a;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f9 = m9.f19442s;
            if (f9 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f9);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f19952A = true;
        PlaybackSession playbackSession = this.f19955c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }
}
