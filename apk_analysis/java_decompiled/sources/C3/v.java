package C3;

import J1.P;
import L2.C0237a;
import N3.Z;
import P.C0303d;
import P.InterfaceC0302c;
import P.InterfaceC0314o;
import P.Q;
import P.u0;
import a.AbstractC0485a;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import b3.C0600a;
import b3.EnumC0602c;
import b6.C0693o;
import c2.C0763i;
import c7.C0784d;
import co.notix.R;
import co.notix.appopen.AppOpenActivity;
import co.notix.interstitial.WebViewInterstitialActivity;
import co.notix.j6;
import com.anilab.android.App;
import com.anilab.android.ui.home.HomeFragment;
import com.anilab.android.ui.login.LoginFragment;
import com.anilab.android.ui.loginWithEmail.LoginWithEmailFragment;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.gms.internal.measurement.D1;
import com.google.firebase.messaging.D;
import com.google.firebase.messaging.FirebaseMessaging;
import f.C1148a;
import f5.AbstractC1176h;
import f5.C1177i;
import f5.C1185q;
import f5.InterfaceC1169a;
import f5.InterfaceC1171c;
import f5.InterfaceC1175g;
import g3.InterfaceC1251b;
import i7.C1397l;
import i7.N;
import i7.O;
import j3.M;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import o1.C1671f;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements A, InterfaceC1171c, InterfaceC0314o, f.b, V0.i, InterfaceC1175g, InterfaceC1169a, InterfaceC1251b, L.b, V2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1562b;

    public /* synthetic */ v(int i9, Object obj) {
        this.f1561a = i9;
        this.f1562b = obj;
    }

    @Override // f5.InterfaceC1171c
    public void G(AbstractC1176h it) {
        Object h7;
        switch (this.f1561a) {
            case 1:
                kotlin.jvm.internal.h.e(it, "it");
                if (it.j()) {
                    HashMap a5 = D1.v().a();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(B7.y.D(a5.size()));
                    for (Map.Entry entry : a5.entrySet()) {
                        Object key = entry.getKey();
                        try {
                            d7.o oVar = (d7.o) entry.getValue();
                            if (oVar.f16959b == 0) {
                                h7 = "";
                            } else {
                                h7 = oVar.f16958a;
                            }
                        } catch (Throwable th) {
                            h7 = AbstractC0485a.h(th);
                        }
                        if (h7 instanceof A7.i) {
                            h7 = "";
                        }
                        linkedHashMap.put(key, (String) h7);
                    }
                    C0237a c0237a = ((App) this.f1562b).f13718d;
                    if (c0237a != null) {
                        c0237a.a(linkedHashMap);
                        return;
                    } else {
                        kotlin.jvm.internal.h.h("e");
                        throw null;
                    }
                }
                return;
            case 20:
                com.google.firebase.messaging.B.b((Intent) this.f1562b);
                return;
            case 21:
                ((D) this.f1562b).f16432b.d(null);
                return;
            default:
                ((ScheduledFuture) this.f1562b).cancel(false);
                return;
        }
    }

    @Override // C3.A
    public int a(Object obj) {
        try {
            return ((p) obj).c((M) this.f1562b) ? 1 : 0;
        } catch (y unused) {
            return -1;
        }
    }

    @Override // V2.e
    public Object apply(Object obj) {
        ((C1397l) this.f1562b).getClass();
        String u9 = O.f18776b.u((N) obj);
        kotlin.jvm.internal.h.d(u9, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event Type: SESSION_START");
        byte[] bytes = u9.getBytes(W7.a.f7934a);
        kotlin.jvm.internal.h.d(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // V0.i
    public void b() {
        HomeFragment homeFragment = (HomeFragment) this.f1562b;
        ((P) homeFragment.e0()).f3746A.setRefreshing(false);
        X1.y h02 = homeFragment.h0();
        h02.getClass();
        h02.d(false, new X1.v(h02, true, null));
    }

    public Z c(android.support.v4.media.session.y yVar) {
        InputStream inputStream;
        W2.b bVar = (W2.b) this.f1562b;
        String F2 = AbstractC1002u1.F("CctTransportBackend");
        boolean isLoggable = Log.isLoggable(F2, 4);
        URL url = (URL) yVar.f9331b;
        if (isLoggable) {
            Log.i(F2, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.f7885g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.3.0 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) yVar.f9333d;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C1671f c1671f = bVar.f7879a;
                    X2.m mVar = (X2.m) yVar.f9332c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    N6.d dVar = (N6.d) c1671f.f21473b;
                    N6.e eVar = new N6.e(bufferedWriter, dVar.f5238a, dVar.f5239b, dVar.f5240c, dVar.f5241d);
                    eVar.h(mVar);
                    eVar.j();
                    eVar.f5243b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String F8 = AbstractC1002u1.F("CctTransportBackend");
                    if (Log.isLoggable(F8, 4)) {
                        Log.i(F8, String.format("Status Code: %d", valueOf));
                    }
                    AbstractC1002u1.n("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC1002u1.n("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            return new Z(responseCode, null, 0L);
                        }
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        try {
                            if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                                inputStream = new GZIPInputStream(inputStream2);
                            } else {
                                inputStream = inputStream2;
                            }
                            try {
                                Z z9 = new Z(responseCode, null, X2.u.a(new BufferedReader(new InputStreamReader(inputStream))).f8406a);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                return z9;
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        return new Z(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                } finally {
                }
            } finally {
            }
        } catch (L6.b e8) {
            e = e8;
            AbstractC1002u1.z("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new Z(400, null, 0L);
        } catch (ConnectException e9) {
            e = e9;
            AbstractC1002u1.z("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new Z(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            AbstractC1002u1.z("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new Z(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            AbstractC1002u1.z("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new Z(400, null, 0L);
        }
    }

    @Override // f.b
    public void d(Object obj) {
        String str;
        String str2;
        switch (this.f1561a) {
            case 4:
                C1148a c1148a = (C1148a) obj;
                Intent intent = c1148a.f17225b;
                if (c1148a.f17224a == -1 && intent != null) {
                    long longExtra = intent.getLongExtra("extra_id", -1L);
                    long longExtra2 = intent.getLongExtra("extra_episode_id", -1L);
                    long longExtra3 = intent.getLongExtra("extra_position_ms", 0L);
                    String stringExtra = intent.getStringExtra("extra_name");
                    if (stringExtra == null) {
                        str = "";
                    } else {
                        str = stringExtra;
                    }
                    String stringExtra2 = intent.getStringExtra("extra_poster");
                    if (stringExtra2 == null) {
                        str2 = "";
                    } else {
                        str2 = stringExtra2;
                    }
                    int intExtra = intent.getIntExtra("extra_percent", 0);
                    int intExtra2 = intent.getIntExtra("extra_year", 0);
                    List stringArrayListExtra = intent.getStringArrayListExtra("extra_al_names");
                    if (stringArrayListExtra == null) {
                        stringArrayListExtra = B7.t.f1135a;
                    }
                    ((M1.B) this.f1562b).r0().g(new H2.u(longExtra, longExtra2, longExtra3, str, str2, intExtra, intExtra2, stringArrayListExtra));
                    return;
                }
                return;
            case R.styleable.GradientColor_android_endX /* 10 */:
                LoginFragment loginFragment = (LoginFragment) this.f1562b;
                C1148a c1148a2 = (C1148a) obj;
                if (c1148a2.f17224a == -1) {
                    try {
                        String str3 = ((GoogleSignInAccount) s8.e.F(c1148a2.f17225b).h(C4.e.class)).f14546c;
                        if (str3 != null) {
                            Y1.h hVar = (Y1.h) loginFragment.f13776D0.getValue();
                            hVar.getClass();
                            hVar.d(true, new Y1.g(hVar, str3, null));
                        } else {
                            loginFragment.o0(new M1.D(R.string.message_login_failed));
                        }
                        return;
                    } catch (C4.e e8) {
                        if (e8.f1568a.f14660a == 7) {
                            loginFragment.o0(new M1.D(R.string.message_no_internet));
                            return;
                        } else {
                            loginFragment.o0(new M1.D(R.string.msg_unknown_error));
                            return;
                        }
                    }
                }
                return;
            case R.styleable.GradientColor_android_endY /* 11 */:
                LoginWithEmailFragment loginWithEmailFragment = (LoginWithEmailFragment) this.f1562b;
                C1148a c1148a3 = (C1148a) obj;
                if (c1148a3.f17224a == -1) {
                    try {
                        String str4 = ((GoogleSignInAccount) s8.e.F(c1148a3.f17225b).h(C4.e.class)).f14546c;
                        if (str4 != null) {
                            Z1.h hVar2 = (Z1.h) loginWithEmailFragment.f13779D0.getValue();
                            hVar2.getClass();
                            hVar2.d(true, new Z1.g(hVar2, str4, null));
                        } else {
                            loginWithEmailFragment.o0(new M1.D(R.string.message_login_failed));
                        }
                        return;
                    } catch (C4.e e9) {
                        if (e9.f1568a.f14660a == 7) {
                            loginWithEmailFragment.o0(new M1.D(R.string.message_no_internet));
                            return;
                        } else {
                            loginWithEmailFragment.o0(new M1.D(R.string.msg_unknown_error));
                            return;
                        }
                    }
                }
                return;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C0763i c0763i = (C0763i) this.f1562b;
                if (booleanValue) {
                    c0763i.s0();
                    return;
                } else {
                    c0763i.o0(new M1.D(R.string.msg_permission_denied));
                    return;
                }
        }
    }

    public boolean e(s4.i iVar, int i9, Bundle bundle) {
        InterfaceC0302c interfaceC0302c;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i9 & 1) != 0) {
            try {
                ((R.g) iVar.f22734a).p();
                Parcelable parcelable = (Parcelable) ((R.g) iVar.f22734a).j();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e8) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e8);
                return false;
            }
        }
        ClipDescription description = ((R.g) iVar.f22734a).getDescription();
        R.g gVar = (R.g) iVar.f22734a;
        ClipData clipData = new ClipData(description, new ClipData.Item(gVar.k()));
        if (i10 >= 31) {
            interfaceC0302c = new s4.i(clipData, 2);
        } else {
            C0303d c0303d = new C0303d();
            c0303d.f5584b = clipData;
            c0303d.f5585c = 2;
            interfaceC0302c = c0303d;
        }
        interfaceC0302c.z(gVar.t());
        interfaceC0302c.c(bundle);
        if (Q.i((AppCompatEditText) this.f1562b, interfaceC0302c.b()) == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l1.g] */
    @Override // g3.InterfaceC1251b
    public Object f() {
        SQLiteDatabase a5;
        Object obj = this.f1562b;
        switch (this.f1561a) {
            case 24:
                f3.h hVar = (f3.h) ((f3.c) obj);
                hVar.getClass();
                int i9 = C0600a.f10508e;
                ?? obj2 = new Object();
                obj2.f20182a = null;
                obj2.f20183b = new ArrayList();
                obj2.f20184c = null;
                obj2.f20185d = "";
                HashMap hashMap = new HashMap();
                a5 = hVar.a();
                a5.beginTransaction();
                try {
                    C0600a c0600a = (C0600a) f3.h.N(a5.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C0784d(hVar, hashMap, obj2, 7));
                    a5.setTransactionSuccessful();
                    return c0600a;
                } finally {
                }
            case 25:
                f3.h hVar2 = (f3.h) ((f3.d) obj);
                long l9 = hVar2.f17346b.l() - hVar2.f17348d.f17335d;
                a5 = hVar2.a();
                a5.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(l9)};
                    Cursor rawQuery = a5.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            hVar2.x(rawQuery.getInt(0), EnumC0602c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = a5.delete("events", "timestamp_ms < ?", strArr);
                    a5.setTransactionSuccessful();
                    a5.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 26:
                f3.h hVar3 = (f3.h) ((e3.j) obj).f17179i;
                a5 = hVar3.a();
                a5.beginTransaction();
                try {
                    a5.compileStatement("DELETE FROM log_event_dropped").execute();
                    a5.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + hVar3.f17346b.l()).execute();
                    a5.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                e3.l lVar = (e3.l) obj;
                Iterator it = ((Iterable) ((f3.h) lVar.f17188b).g(new X0.k(15))).iterator();
                while (it.hasNext()) {
                    lVar.f17189c.a((Y2.j) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // L.b
    public void g() {
        i0.Z this$0 = (i0.Z) this.f1562b;
        kotlin.jvm.internal.h.e(this$0, "this$0");
        this$0.a();
    }

    @Override // f5.InterfaceC1169a
    public Object i(AbstractC1176h abstractC1176h) {
        ((C0693o) this.f1562b).getClass();
        Bundle bundle = (Bundle) abstractC1176h.h(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if (!"RST".equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override // f5.InterfaceC1175g
    public C1185q s(Object obj) {
        switch (this.f1561a) {
            case 18:
                String str = (String) this.f1562b;
                com.google.firebase.messaging.y yVar = (com.google.firebase.messaging.y) obj;
                com.google.firebase.messaging.u uVar = FirebaseMessaging.f16440l;
                yVar.getClass();
                com.google.firebase.messaging.v vVar = new com.google.firebase.messaging.v("S", str);
                com.google.firebase.messaging.w wVar = yVar.f16534h;
                synchronized (wVar) {
                    wVar.f16519b.l(vVar.f16516c);
                }
                C1177i c1177i = new C1177i();
                yVar.a(vVar, c1177i);
                C1185q c1185q = c1177i.f17413a;
                yVar.h();
                return c1185q;
            default:
                return s8.n.p((d7.h) this.f1562b);
        }
    }

    @Override // P.InterfaceC0314o
    public u0 t(View view, u0 u0Var) {
        switch (this.f1561a) {
            case 3:
                H.c f9 = u0Var.f5645a.f(519);
                kotlin.jvm.internal.h.b(f9);
                M1.n nVar = (M1.n) this.f1562b;
                nVar.getClass();
                View view2 = nVar.e0().f7853k;
                kotlin.jvm.internal.h.d(view2, "getRoot(...)");
                view2.setPadding(0, 0, 0, f9.f2917d);
                return u0.f5644b;
            case 15:
                return AppOpenActivity.a((AppOpenActivity) this.f1562b, view, u0Var);
            case 16:
                return WebViewInterstitialActivity.a((WebViewInterstitialActivity) this.f1562b, view, u0Var);
            default:
                return j6.a((j6) this.f1562b, view, u0Var);
        }
    }
}
