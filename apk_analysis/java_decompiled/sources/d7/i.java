package d7;

import C3.v;
import android.text.format.DateUtils;
import c7.C0787g;
import c7.C0789i;
import c7.CallableC0783c;
import com.google.android.gms.internal.measurement.C0952k0;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import f5.AbstractC1176h;
import f5.C1185q;
import f5.InterfaceC1169a;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p6.C1862c;
import p6.InterfaceC1861b;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: i, reason: collision with root package name */
    public static final long f16915i = TimeUnit.HOURS.toSeconds(12);
    public static final int[] j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a, reason: collision with root package name */
    public final T6.e f16916a;

    /* renamed from: b, reason: collision with root package name */
    public final S6.b f16917b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f16918c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f16919d;

    /* renamed from: e, reason: collision with root package name */
    public final d f16920e;

    /* renamed from: f, reason: collision with root package name */
    public final ConfigFetchHttpClient f16921f;

    /* renamed from: g, reason: collision with root package name */
    public final m f16922g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f16923h;

    public i(T6.e eVar, S6.b bVar, Executor executor, Random random, d dVar, ConfigFetchHttpClient configFetchHttpClient, m mVar, HashMap hashMap) {
        this.f16916a = eVar;
        this.f16917b = bVar;
        this.f16918c = executor;
        this.f16919d = random;
        this.f16920e = dVar;
        this.f16921f = configFetchHttpClient;
        this.f16922g = mVar;
        this.f16923h = hashMap;
    }

    public final h a(String str, String str2, Date date, HashMap hashMap) {
        String str3;
        try {
            HttpURLConnection b9 = this.f16921f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f16921f;
            HashMap d9 = d();
            Long l9 = null;
            String string = this.f16922g.f16951a.getString("last_fetch_etag", null);
            InterfaceC1861b interfaceC1861b = (InterfaceC1861b) this.f16917b.get();
            if (interfaceC1861b != null) {
                l9 = (Long) ((C0952k0) ((C1862c) interfaceC1861b).f22197a.f22734a).f(null, null, true).get("_fot");
            }
            h fetch = configFetchHttpClient.fetch(b9, str, str2, d9, string, hashMap, l9, date, this.f16922g.b());
            e eVar = fetch.f16913b;
            if (eVar != null) {
                m mVar = this.f16922g;
                long j4 = eVar.f16902f;
                synchronized (mVar.f16952b) {
                    mVar.f16951a.edit().putLong("last_template_version", j4).apply();
                }
            }
            String str4 = fetch.f16914c;
            if (str4 != null) {
                this.f16922g.e(str4);
            }
            this.f16922g.d(0, m.f16950f);
            return fetch;
        } catch (C0789i e8) {
            int i9 = e8.f11722a;
            m mVar2 = this.f16922g;
            if (i9 == 429 || i9 == 502 || i9 == 503 || i9 == 504) {
                int i10 = mVar2.a().f16947a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = j;
                mVar2.d(i10, new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f16919d.nextInt((int) r3)));
            }
            l a5 = mVar2.a();
            int i11 = e8.f11722a;
            if (a5.f16947a <= 1 && i11 != 429) {
                if (i11 != 401) {
                    if (i11 != 403) {
                        if (i11 != 429) {
                            if (i11 != 500) {
                                switch (i11) {
                                    case 502:
                                    case 503:
                                    case 504:
                                        str3 = "The server is unavailable. Please try again later.";
                                        break;
                                    default:
                                        str3 = "The server returned an unexpected error.";
                                        break;
                                }
                            } else {
                                str3 = "There was an internal server error.";
                            }
                        } else {
                            throw new l6.h("The throttled response from the server was not handled correctly by the FRC SDK.");
                        }
                    } else {
                        str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                    }
                } else {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                }
                throw new C0789i(e8.f11722a, "Fetch failed: ".concat(str3), e8);
            }
            a5.f16948b.getTime();
            throw new l6.h("Fetch was throttled.");
        }
    }

    public final C1185q b(AbstractC1176h abstractC1176h, long j4, final HashMap hashMap) {
        C1185q e8;
        boolean before;
        final Date date = new Date(System.currentTimeMillis());
        boolean j9 = abstractC1176h.j();
        m mVar = this.f16922g;
        Date date2 = null;
        if (j9) {
            Date date3 = new Date(mVar.f16951a.getLong("last_fetch_time_in_millis", -1L));
            if (date3.equals(m.f16949e)) {
                before = false;
            } else {
                before = date.before(new Date(TimeUnit.SECONDS.toMillis(j4) + date3.getTime()));
            }
            if (before) {
                return s8.n.p(new h(2, null, null));
            }
        }
        Date date4 = mVar.a().f16948b;
        if (date.before(date4)) {
            date2 = date4;
        }
        Executor executor = this.f16918c;
        if (date2 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime()));
            date2.getTime();
            e8 = s8.n.o(new l6.h(str));
        } else {
            T6.d dVar = (T6.d) this.f16916a;
            final C1185q d9 = dVar.d();
            final C1185q e9 = dVar.e();
            e8 = s8.n.D(d9, e9).e(executor, new InterfaceC1169a() { // from class: d7.g
                @Override // f5.InterfaceC1169a
                public final Object i(AbstractC1176h abstractC1176h2) {
                    C1185q m9;
                    Date date5 = date;
                    HashMap hashMap2 = hashMap;
                    i iVar = i.this;
                    iVar.getClass();
                    C1185q c1185q = d9;
                    if (!c1185q.j()) {
                        return s8.n.o(new l6.h("Firebase Installations failed to get installation ID for fetch.", c1185q.f()));
                    }
                    C1185q c1185q2 = e9;
                    if (!c1185q2.j()) {
                        return s8.n.o(new l6.h("Firebase Installations failed to get installation auth token for fetch.", c1185q2.f()));
                    }
                    try {
                        h a5 = iVar.a((String) c1185q.g(), ((T6.a) c1185q2.g()).f7209a, date5, hashMap2);
                        if (a5.f16912a != 0) {
                            m9 = s8.n.p(a5);
                        } else {
                            d dVar2 = iVar.f16920e;
                            e eVar = a5.f16913b;
                            dVar2.getClass();
                            CallableC0783c callableC0783c = new CallableC0783c(dVar2, 2, eVar);
                            Executor executor2 = dVar2.f16893a;
                            m9 = s8.n.e(executor2, callableC0783c).m(executor2, new N1.h(dVar2, 7, eVar)).m(iVar.f16918c, new v(23, a5));
                        }
                        return m9;
                    } catch (C0787g e10) {
                        return s8.n.o(e10);
                    }
                }
            });
        }
        return e8.e(executor, new N1.h(this, 9, date));
    }

    public final C1185q c(int i9) {
        HashMap hashMap = new HashMap(this.f16923h);
        hashMap.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i9);
        return this.f16920e.b().e(this.f16918c, new N1.h(this, 8, hashMap));
    }

    public final HashMap d() {
        HashMap hashMap = new HashMap();
        InterfaceC1861b interfaceC1861b = (InterfaceC1861b) this.f16917b.get();
        if (interfaceC1861b != null) {
            for (Map.Entry entry : ((C0952k0) ((C1862c) interfaceC1861b).f22197a.f22734a).f(null, null, false).entrySet()) {
                hashMap.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }
}
