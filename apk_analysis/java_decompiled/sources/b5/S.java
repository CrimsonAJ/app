package b5;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class S implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10936a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f10937b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10938c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10939d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10940e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f10941f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f10942g;

    public S(V v8, int i9, String str, Object obj, Object obj2, Object obj3) {
        this.f10937b = i9;
        this.f10938c = str;
        this.f10939d = obj;
        this.f10940e = obj2;
        this.f10941f = obj3;
        this.f10942g = v8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        switch (this.f10936a) {
            case 0:
                V v8 = (V) this.f10942g;
                C0623e0 c0623e0 = ((C0650n0) v8.f1707a).f11228h;
                C0650n0.d(c0623e0);
                if (c0623e0.f11344b) {
                    if (v8.f10968c == 0) {
                        C0628g c0628g = ((C0650n0) v8.f1707a).f11227g;
                        if (c0628g.f11121e == null) {
                            synchronized (c0628g) {
                                try {
                                    if (c0628g.f11121e == null) {
                                        C0650n0 c0650n0 = (C0650n0) c0628g.f1707a;
                                        ApplicationInfo applicationInfo = c0650n0.f11221a.getApplicationInfo();
                                        String b9 = K4.b.b();
                                        if (applicationInfo != null) {
                                            String str = applicationInfo.processName;
                                            if (str != null && str.equals(b9)) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            c0628g.f11121e = Boolean.valueOf(z9);
                                        }
                                        if (c0628g.f11121e == null) {
                                            c0628g.f11121e = Boolean.TRUE;
                                            V v9 = c0650n0.f11229i;
                                            C0650n0.f(v9);
                                            v9.f10971f.b("My process not in the list of running processes");
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        if (c0628g.f11121e.booleanValue()) {
                            v8.f10968c = 'C';
                        } else {
                            v8.f10968c = 'c';
                        }
                    }
                    if (v8.f10969d < 0) {
                        ((C0650n0) v8.f1707a).f11227g.s0();
                        v8.f10969d = 119002L;
                    }
                    char charAt = "01VDIWEA?".charAt(this.f10937b);
                    char c3 = v8.f10968c;
                    long j = v8.f10969d;
                    String str2 = this.f10938c;
                    String u02 = V.u0(true, str2, this.f10939d, this.f10940e, this.f10941f);
                    StringBuilder sb = new StringBuilder("2");
                    sb.append(charAt);
                    sb.append(c3);
                    sb.append(j);
                    String q9 = AbstractC0953k1.q(sb, ":", u02);
                    if (q9.length() > 1024) {
                        q9 = str2.substring(0, 1024);
                    }
                    C0620d0 c0620d0 = c0623e0.f11087f;
                    if (c0620d0 != null) {
                        C0623e0 c0623e02 = (C0623e0) c0620d0.f11063e;
                        c0623e02.l0();
                        if (((C0623e0) c0620d0.f11063e).q0().getLong((String) c0620d0.f11060b, 0L) == 0) {
                            c0620d0.b();
                        }
                        if (q9 == null) {
                            q9 = "";
                        }
                        SharedPreferences q02 = c0623e02.q0();
                        String str3 = (String) c0620d0.f11061c;
                        long j4 = q02.getLong(str3, 0L);
                        String str4 = (String) c0620d0.f11062d;
                        if (j4 <= 0) {
                            SharedPreferences.Editor edit = c0623e02.q0().edit();
                            edit.putString(str4, q9);
                            edit.putLong(str3, 1L);
                            edit.apply();
                            return;
                        }
                        P1 p12 = ((C0650n0) c0623e02.f1707a).f11231l;
                        C0650n0.d(p12);
                        long nextLong = p12.x0().nextLong() & Long.MAX_VALUE;
                        long j9 = j4 + 1;
                        long j10 = Long.MAX_VALUE / j9;
                        SharedPreferences.Editor edit2 = c0623e02.q0().edit();
                        if (nextLong < j10) {
                            edit2.putString(str4, q9);
                        }
                        edit2.putLong(str3, j9);
                        edit2.apply();
                        return;
                    }
                    return;
                }
                Log.println(6, v8.w0(), "Persisted config not initialized. Not logging error/warn");
                return;
            default:
                ((X) this.f10939d).l(this.f10938c, this.f10937b, (IOException) this.f10940e, (byte[]) this.f10941f, (Map) this.f10942g);
                return;
        }
    }

    public /* synthetic */ S(String str, X x5, int i9, IOException iOException, byte[] bArr, Map map) {
        F4.y.h(x5);
        this.f10939d = x5;
        this.f10937b = i9;
        this.f10940e = iOException;
        this.f10941f = bArr;
        this.f10938c = str;
        this.f10942g = map;
    }
}
