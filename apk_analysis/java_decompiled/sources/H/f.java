package H;

import B6.u0;
import F0.z0;
import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final M4.a f2921a;

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f2922b;

    static {
        u0.d("TypefaceCompat static init");
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            f2921a = new M4.a();
        } else if (i9 >= 28) {
            f2921a = new i();
        } else if (i9 >= 26) {
            f2921a = new i();
        } else {
            if (i9 >= 24) {
                Method method = h.f2928l;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    f2921a = new M4.a();
                }
            }
            f2921a = new M4.a();
        }
        f2922b = new z0(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r9.equals(r12) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r16, G.d r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, G.b r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H.f.a(android.content.Context, G.d, android.content.res.Resources, int, java.lang.String, int, int, G.b, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i9, String str, int i10, int i11) {
        return resources.getResourcePackageName(i9) + '-' + str + '-' + i10 + '-' + i9 + '-' + i11;
    }
}
