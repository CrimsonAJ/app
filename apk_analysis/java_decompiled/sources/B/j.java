package B;

import B6.u0;
import F0.C0112p;
import F0.C0121z;
import P.H;
import P.Q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import co.notix.R;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;
import y0.C2193a;

/* loaded from: classes.dex */
public final class j implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f585a;

    public /* synthetic */ j(int i9) {
        this.f585a = i9;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z9;
        boolean z10;
        switch (this.f585a) {
            case 0:
                WeakHashMap weakHashMap = Q.f5546a;
                float g9 = H.g((View) obj);
                float g10 = H.g((View) obj2);
                if (g9 > g10) {
                    return -1;
                }
                if (g9 < g10) {
                    return 1;
                }
                return 0;
            case 1:
                return u0.o(Boolean.valueOf(Inet6Address.class.isInstance((InetAddress) obj)), Boolean.valueOf(Inet6Address.class.isInstance((InetAddress) obj2)));
            case 2:
                return ((C0112p) obj).f2189a - ((C0112p) obj2).f2189a;
            case 3:
                C0121z c0121z = (C0121z) obj;
                C0121z c0121z2 = (C0121z) obj2;
                RecyclerView recyclerView = c0121z.f2306d;
                if (recyclerView == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (c0121z2.f2306d == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z9 != z10) {
                    if (recyclerView != null) {
                        return -1;
                    }
                } else {
                    boolean z11 = c0121z.f2303a;
                    if (z11 != c0121z2.f2303a) {
                        if (z11) {
                            return -1;
                        }
                    } else {
                        int i9 = c0121z2.f2304b - c0121z.f2304b;
                        if (i9 == 0) {
                            int i10 = c0121z.f2305c - c0121z2.f2305c;
                            if (i10 == 0) {
                                return 0;
                            }
                            return i10;
                        }
                        return i9;
                    }
                }
                return 1;
            case 4:
                return u0.o(((I2.c) obj).f3463c, ((I2.c) obj2).f3463c);
            case 5:
                return u0.o(Boolean.valueOf(Inet6Address.class.isInstance((InetAddress) obj)), Boolean.valueOf(Inet6Address.class.isInstance((InetAddress) obj2)));
            case 6:
                return u0.o((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 7:
                return u0.o((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 8:
                return u0.o(((M0.b) obj).f4679a, ((M0.b) obj2).f4679a);
            case 9:
                return u0.o(((M0.d) obj).f4691a, ((M0.d) obj2).f4691a);
            case R.styleable.GradientColor_android_endX /* 10 */:
                return u0.o(Integer.valueOf(((I2.a) obj).f3445b), Integer.valueOf(((I2.a) obj2).f3445b));
            case R.styleable.GradientColor_android_endY /* 11 */:
                return u0.o(Integer.valueOf(((H2.i) obj).f3028c), Integer.valueOf(((H2.i) obj2).f3028c));
            case 12:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 13:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 14:
                return u0.o(Boolean.valueOf(Inet6Address.class.isInstance((InetAddress) obj)), Boolean.valueOf(Inet6Address.class.isInstance((InetAddress) obj2)));
            case 15:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 16:
                return ((w.i) obj).f23952b - ((w.i) obj2).f23952b;
            case 17:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 18:
                return ((C2193a) obj2).b() - ((C2193a) obj).b();
            default:
                return u0.o(((y8.h) obj).f25150a, ((y8.h) obj2).f25150a);
        }
    }
}
