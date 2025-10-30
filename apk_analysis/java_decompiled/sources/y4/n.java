package y4;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import i.G;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n extends X3.d {

    /* renamed from: y, reason: collision with root package name */
    public static final String f24941y;

    /* renamed from: e, reason: collision with root package name */
    public long f24942e;

    /* renamed from: f, reason: collision with root package name */
    public t4.p f24943f;

    /* renamed from: g, reason: collision with root package name */
    public Long f24944g;

    /* renamed from: h, reason: collision with root package name */
    public G f24945h;

    /* renamed from: i, reason: collision with root package name */
    public int f24946i;
    public final p j;

    /* renamed from: k, reason: collision with root package name */
    public final p f24947k;

    /* renamed from: l, reason: collision with root package name */
    public final p f24948l;

    /* renamed from: m, reason: collision with root package name */
    public final p f24949m;

    /* renamed from: n, reason: collision with root package name */
    public final p f24950n;

    /* renamed from: o, reason: collision with root package name */
    public final p f24951o;

    /* renamed from: p, reason: collision with root package name */
    public final p f24952p;

    /* renamed from: q, reason: collision with root package name */
    public final p f24953q;

    /* renamed from: r, reason: collision with root package name */
    public final p f24954r;

    /* renamed from: s, reason: collision with root package name */
    public final p f24955s;

    /* renamed from: t, reason: collision with root package name */
    public final p f24956t;

    /* renamed from: u, reason: collision with root package name */
    public final p f24957u;

    /* renamed from: v, reason: collision with root package name */
    public final p f24958v;

    /* renamed from: w, reason: collision with root package name */
    public final p f24959w;

    /* renamed from: x, reason: collision with root package name */
    public final p f24960x;

    static {
        Pattern pattern = a.f24915a;
        f24941y = "urn:x-cast:com.google.cast.media";
    }

    public n() {
        super(f24941y);
        this.f24946i = -1;
        p pVar = new p(86400000L, "load");
        this.j = pVar;
        p pVar2 = new p(86400000L, "pause");
        this.f24947k = pVar2;
        p pVar3 = new p(86400000L, "play");
        this.f24948l = pVar3;
        p pVar4 = new p(86400000L, "stop");
        this.f24949m = pVar4;
        p pVar5 = new p(10000L, "seek");
        this.f24950n = pVar5;
        p pVar6 = new p(86400000L, "volume");
        this.f24951o = pVar6;
        p pVar7 = new p(86400000L, "mute");
        this.f24952p = pVar7;
        p pVar8 = new p(86400000L, "status");
        this.f24953q = pVar8;
        p pVar9 = new p(86400000L, "activeTracks");
        this.f24954r = pVar9;
        p pVar10 = new p(86400000L, "trackStyle");
        p pVar11 = new p(86400000L, "queueInsert");
        p pVar12 = new p(86400000L, "queueUpdate");
        this.f24955s = pVar12;
        p pVar13 = new p(86400000L, "queueRemove");
        this.f24956t = pVar13;
        p pVar14 = new p(86400000L, "queueReorder");
        p pVar15 = new p(86400000L, "queueFetchItemIds");
        this.f24957u = pVar15;
        p pVar16 = new p(86400000L, "queueFetchItemRange");
        this.f24959w = pVar16;
        this.f24958v = new p(86400000L, "queueFetchItems");
        p pVar17 = new p(86400000L, "setPlaybackRate");
        this.f24960x = pVar17;
        p pVar18 = new p(86400000L, "skipAd");
        m(pVar);
        m(pVar2);
        m(pVar3);
        m(pVar4);
        m(pVar5);
        m(pVar6);
        m(pVar7);
        m(pVar8);
        m(pVar9);
        m(pVar10);
        m(pVar11);
        m(pVar12);
        m(pVar13);
        m(pVar14);
        m(pVar15);
        m(pVar16);
        m(pVar16);
        m(pVar17);
        m(pVar18);
        s();
    }

    public static d0.w r(JSONObject jSONObject) {
        MediaError.f(jSONObject);
        d0.w wVar = new d0.w(16);
        Pattern pattern = a.f24915a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return wVar;
    }

    public static int[] y(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            iArr[i9] = jSONArray.getInt(i9);
        }
        return iArr;
    }

    public final long A() {
        MediaInfo mediaInfo;
        MediaInfo mediaInfo2;
        long j;
        t4.j jVar;
        t4.p pVar = this.f24943f;
        MediaInfo mediaInfo3 = null;
        if (pVar == null) {
            mediaInfo = null;
        } else {
            mediaInfo = pVar.f23224a;
        }
        long j4 = 0;
        if (mediaInfo != null && pVar != null) {
            Long l9 = this.f24944g;
            if (l9 != null) {
                if (l9.equals(4294967296000L)) {
                    t4.p pVar2 = this.f24943f;
                    if (pVar2.f23243u != null) {
                        long longValue = l9.longValue();
                        t4.p pVar3 = this.f24943f;
                        if (pVar3 != null && (jVar = pVar3.f23243u) != null) {
                            boolean z9 = jVar.f23194d;
                            long j9 = jVar.f23192b;
                            if (!z9) {
                                j4 = q(1.0d, j9, -1L);
                            } else {
                                j4 = j9;
                            }
                        }
                        return Math.min(longValue, j4);
                    }
                    if (pVar2 == null) {
                        mediaInfo2 = null;
                    } else {
                        mediaInfo2 = pVar2.f23224a;
                    }
                    if (mediaInfo2 != null) {
                        j = mediaInfo2.f14612e;
                    } else {
                        j = 0;
                    }
                    if (j >= 0) {
                        long longValue2 = l9.longValue();
                        t4.p pVar4 = this.f24943f;
                        if (pVar4 != null) {
                            mediaInfo3 = pVar4.f23224a;
                        }
                        if (mediaInfo3 != null) {
                            j4 = mediaInfo3.f14612e;
                        }
                        return Math.min(longValue2, j4);
                    }
                }
                return l9.longValue();
            }
            if (this.f24942e != 0) {
                double d9 = pVar.f23227d;
                long j10 = pVar.f23230g;
                int i9 = pVar.f23228e;
                if (d9 != 0.0d && i9 == 2) {
                    return q(d9, j10, mediaInfo.f14612e);
                }
                return j10;
            }
        }
        return 0L;
    }

    public final long B() {
        t4.p pVar = this.f24943f;
        if (pVar != null) {
            return pVar.f23225b;
        }
        throw new Exception();
    }

    public final void p(o oVar, int i9, long j, int i10, Integer num) {
        boolean z9;
        int i11 = 1;
        if (j != -1 && j < 0) {
            throw new IllegalArgumentException(AbstractC0953k1.k(j, "playPosition cannot be negative: "));
        }
        JSONObject jSONObject = new JSONObject();
        long n7 = n();
        try {
            jSONObject.put("requestId", n7);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", B());
            if (i9 != 0) {
                jSONObject.put("currentItemId", i9);
            }
            if (i10 != 0) {
                jSONObject.put("jump", i10);
            }
            String k02 = AbstractC1002u1.k0(num);
            if (k02 != null) {
                jSONObject.put("repeatMode", k02);
            }
            if (j != -1) {
                Pattern pattern = a.f24915a;
                jSONObject.put("currentTime", j / 1000.0d);
            }
            int i12 = this.f24946i;
            if (i12 != -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                jSONObject.put("sequenceNumber", i12);
            }
        } catch (JSONException unused) {
        }
        o(n7, jSONObject.toString());
        this.f24955s.a(n7, new l(this, oVar, i11));
    }

    public final long q(double d9, long j, long j4) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f24942e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j;
        }
        long j9 = j + ((long) (elapsedRealtime * d9));
        if (j4 > 0 && j9 > j4) {
            return j4;
        }
        if (j9 < 0) {
            return 0L;
        }
        return j9;
    }

    public final void s() {
        this.f24942e = 0L;
        this.f24943f = null;
        Iterator it = this.f8442d.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f(2002);
        }
    }

    public final void t(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.f24946i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            b bVar = (b) this.f8440b;
            Log.w(bVar.f24917a, bVar.d(str.concat(" message is missing a sequence number."), new Object[0]));
        }
    }

    public final void u() {
        G g9 = this.f24945h;
        if (g9 != null) {
            v4.h hVar = (v4.h) g9.f17990b;
            hVar.getClass();
            Iterator it = hVar.f23853g.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f23854h.iterator();
                while (it2.hasNext()) {
                    ((v4.g) it2.next()).c();
                }
                return;
            }
            throw A0.a.h(it);
        }
    }

    public final void v() {
        G g9 = this.f24945h;
        if (g9 != null) {
            v4.h hVar = (v4.h) g9.f17990b;
            Iterator it = hVar.f23853g.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f23854h.iterator();
                while (it2.hasNext()) {
                    ((v4.g) it2.next()).l();
                }
                return;
            }
            throw A0.a.h(it);
        }
    }

    public final void w() {
        G g9 = this.f24945h;
        if (g9 != null) {
            v4.h hVar = (v4.h) g9.f17990b;
            Iterator it = hVar.f23853g.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f23854h.iterator();
                while (it2.hasNext()) {
                    ((v4.g) it2.next()).m();
                }
                return;
            }
            throw A0.a.h(it);
        }
    }

    public final void x() {
        G g9 = this.f24945h;
        if (g9 != null) {
            v4.h hVar = (v4.h) g9.f17990b;
            hVar.getClass();
            for (v4.u uVar : hVar.j.values()) {
                if (hVar.g() && !uVar.f23889d) {
                    v4.h hVar2 = uVar.f23890e;
                    T4.d dVar = hVar2.f23848b;
                    v4.t tVar = uVar.f23888c;
                    dVar.removeCallbacks(tVar);
                    uVar.f23889d = true;
                    hVar2.f23848b.postDelayed(tVar, uVar.f23887b);
                } else if (!hVar.g() && uVar.f23889d) {
                    uVar.f23890e.f23848b.removeCallbacks(uVar.f23888c);
                    uVar.f23889d = false;
                }
                if (uVar.f23889d && (hVar.h() || hVar.u() || hVar.k() || hVar.j())) {
                    hVar.v(uVar.f23886a);
                }
            }
            Iterator it = hVar.f23853g.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f23854h.iterator();
                while (it2.hasNext()) {
                    ((v4.g) it2.next()).n();
                }
                return;
            }
            throw A0.a.h(it);
        }
    }

    public final void z() {
        List list = this.f8442d;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).f(2002);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        s();
    }
}
