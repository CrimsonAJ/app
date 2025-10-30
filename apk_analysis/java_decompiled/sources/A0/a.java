package A0;

import C3.d;
import D1.f;
import D1.h;
import I1.i;
import I1.j;
import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import b5.J1;
import co.notix.p2;
import com.google.android.gms.internal.cast.J2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import l4.AbstractC1566a;
import s8.n;
import y7.C2219a;
import y7.InterfaceC2220b;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static n a(int i9, int i10, int i11) {
        if (i9 == -2) {
            return D1.b.f1768m;
        }
        int i12 = i9 - i11;
        if (i12 > 0) {
            return new D1.a(i12);
        }
        int i13 = i10 - i11;
        if (i13 > 0) {
            return new D1.a(i13);
        }
        return null;
    }

    public static h b(f fVar) {
        int i9;
        ViewGroup.LayoutParams layoutParams = fVar.f1772a.getLayoutParams();
        int i10 = -1;
        if (layoutParams != null) {
            i9 = layoutParams.width;
        } else {
            i9 = -1;
        }
        ImageView imageView = fVar.f1772a;
        n a5 = a(i9, imageView.getWidth(), imageView.getPaddingRight() + imageView.getPaddingLeft());
        if (a5 != null) {
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 != null) {
                i10 = layoutParams2.height;
            }
            n a9 = a(i10, imageView.getHeight(), imageView.getPaddingBottom() + imageView.getPaddingTop());
            if (a9 == null) {
                return null;
            }
            return new h(a5, a9);
        }
        return null;
    }

    public static final boolean c(int i9) {
        return !Y5.a.a();
    }

    public static final boolean d(int i9) {
        Boolean bool;
        if (Y5.a.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                Y5.a.f8733a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static int e(int i9, int i10, int i11) {
        return J2.J(i9) + i10 + i11;
    }

    public static int f(int i9, int i10, int i11, int i12) {
        return J2.J(i9) + i10 + i11 + i12;
    }

    public static int g(int i9, int i10, int i11, int i12, int i13) {
        return Math.max(((i9 * i10) / i11) + i12, i13);
    }

    public static ClassCastException h(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String i(int i9, String str) {
        StringBuilder sb = new StringBuilder(i9);
        sb.append(str);
        return sb.toString();
    }

    public static String j(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.C());
        return sb.toString();
    }

    public static String k(Object obj, String str) {
        return str + obj;
    }

    public static String l(String str, int i9, int i10, String str2) {
        return str + i9 + str2 + i10;
    }

    public static String m(String str, int i9, String str2) {
        return str + i9 + str2;
    }

    public static String n(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String o(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder p(String str, int i9, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i9);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder q(String str, Class cls, String str2, Object obj, String str3) {
        return p2.a(cls, new StringBuilder(str), str2, obj, str3);
    }

    public static HashMap r(Class cls, O6.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map s(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static InterfaceC2220b t(j jVar, int i9) {
        return C2219a.a(new i(jVar, i9));
    }

    public static /* synthetic */ void u(int i9) {
        if (i9 != 0) {
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public static void v(J1 j12) {
        j12.K().l0();
        j12.f();
    }

    public static /* synthetic */ void w(AutoCloseable autoCloseable) {
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (autoCloseable instanceof ExecutorService) {
            d.w((ExecutorService) autoCloseable);
            return;
        }
        if (autoCloseable instanceof TypedArray) {
            ((TypedArray) autoCloseable).recycle();
            return;
        }
        if (autoCloseable instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) autoCloseable).release();
            return;
        }
        if (autoCloseable instanceof MediaDrm) {
            ((MediaDrm) autoCloseable).release();
        } else if (autoCloseable instanceof DrmManagerClient) {
            ((DrmManagerClient) autoCloseable).release();
        } else {
            if (!(autoCloseable instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) autoCloseable).release();
        }
    }

    public static /* synthetic */ void x(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void y(String str, String str2, String str3) {
        AbstractC1566a.P(str3, str + str2);
    }
}
