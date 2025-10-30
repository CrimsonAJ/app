package e1;

import android.content.Context;
import android.util.Log;
import j3.j0;
import java.io.FileNotFoundException;
import java.io.IOException;
import k4.C1495A;
import k4.C1498D;
import k4.C1514n;
import k4.G;
import k4.L;

/* loaded from: classes.dex */
public final class q implements O4.c {

    /* renamed from: b, reason: collision with root package name */
    public static q f17060b;

    /* renamed from: a, reason: collision with root package name */
    public final int f17061a;

    public /* synthetic */ q(int i9) {
        this.f17061a = i9;
    }

    public static synchronized q d() {
        q qVar;
        synchronized (q.class) {
            try {
                if (f17060b == null) {
                    f17060b = new q(3);
                }
                qVar = f17060b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public static B3.f e(G g9, A1.i iVar) {
        IOException iOException = (IOException) iVar.f25b;
        if (iOException instanceof C1498D) {
            int i9 = ((C1498D) iOException).f19982d;
            if (i9 == 403 || i9 == 404 || i9 == 410 || i9 == 416 || i9 == 500 || i9 == 503) {
                if (g9.a(1)) {
                    return new B3.f(300000L, 1);
                }
                if (g9.a(2)) {
                    return new B3.f(60000L, 2);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static long h(A1.i iVar) {
        Throwable th = (IOException) iVar.f25b;
        if (!(th instanceof j0) && !(th instanceof FileNotFoundException) && !(th instanceof C1495A) && !(th instanceof L)) {
            int i9 = C1514n.f20070b;
            while (th != null) {
                if (!(th instanceof C1514n) || ((C1514n) th).f20071a != 2008) {
                    th = th.getCause();
                } else {
                    return -9223372036854775807L;
                }
            }
            return Math.min((iVar.f24a - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public static String j(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public void a(String str, String str2, Throwable... thArr) {
        if (this.f17061a <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    @Override // O4.c
    public int b(Context context, String str) {
        return this.f17061a;
    }

    public void c(String str, String str2, Throwable... thArr) {
        if (this.f17061a <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public int f(int i9) {
        int i10 = this.f17061a;
        if (i10 == -1) {
            if (i9 == 7) {
                return 6;
            }
            return 3;
        }
        return i10;
    }

    @Override // O4.c
    public int g(Context context, String str, boolean z9) {
        return 0;
    }

    public void i(String str, String str2, Throwable... thArr) {
        if (this.f17061a <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void k(String str, String str2, Throwable... thArr) {
        if (this.f17061a <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }

    public boolean l(int i9) {
        if ((this.f17061a & i9) == i9) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if ((l(32) && !l(64) && !l(128)) || l(64)) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if (!m() && !l(128)) {
            return false;
        }
        return true;
    }

    public q(t4.p pVar) {
        this.f17061a = pVar.f23228e;
    }
}
