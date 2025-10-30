package B4;

import F4.v;
import F4.w;
import F4.x;
import F4.y;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final m f720a;

    /* renamed from: b, reason: collision with root package name */
    public static final m f721b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile x f722c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f723d;

    /* renamed from: e, reason: collision with root package name */
    public static Context f724e;

    static {
        new m(0, n.h1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new m(1, n.h1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f720a = new m(2, n.h1("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f721b = new m(3, n.h1("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f723d = new Object();
    }

    public static synchronized void a(Context context) {
        synchronized (q.class) {
            if (f724e == null) {
                if (context != null) {
                    f724e = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    public static t b(String str, o oVar, boolean z9, boolean z10) {
        try {
            c();
            y.h(f724e);
            try {
                x xVar = f722c;
                N4.b bVar = new N4.b(f724e.getPackageManager());
                v vVar = (v) xVar;
                Parcel Q7 = vVar.Q();
                int i9 = V4.a.f7734a;
                boolean z11 = true;
                Q7.writeInt(1);
                int R2 = s8.n.R(Q7, 20293);
                s8.n.M(Q7, 1, str);
                s8.n.H(Q7, 2, oVar);
                s8.n.V(Q7, 3, 4);
                Q7.writeInt(z9 ? 1 : 0);
                s8.n.V(Q7, 4, 4);
                Q7.writeInt(z10 ? 1 : 0);
                s8.n.U(Q7, R2);
                V4.a.c(Q7, bVar);
                Parcel g9 = vVar.g(Q7, 5);
                if (g9.readInt() == 0) {
                    z11 = false;
                }
                g9.recycle();
                if (z11) {
                    return t.f730d;
                }
                return new s(new l(z9, str, oVar));
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                return new t(false, "module call", e8);
            }
        } catch (O4.b e9) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
            return new t(false, "module init: ".concat(String.valueOf(e9.getMessage())), e9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [F4.x] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static void c() {
        ?? aVar;
        if (f722c != null) {
            return;
        }
        y.h(f724e);
        synchronized (f723d) {
            try {
                if (f722c == null) {
                    IBinder b9 = O4.f.c(f724e, O4.f.f5464d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i9 = w.f2455f;
                    if (b9 == null) {
                        aVar = 0;
                    } else {
                        IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        if (queryLocalInterface instanceof x) {
                            aVar = (x) queryLocalInterface;
                        } else {
                            aVar = new S4.a(b9, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 2);
                        }
                    }
                    f722c = aVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
