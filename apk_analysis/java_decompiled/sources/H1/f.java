package H1;

import C1.t;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import co.notix.R;
import i8.w;
import java.io.Closeable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f2949a;

    /* renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f2950b;

    /* renamed from: c, reason: collision with root package name */
    public static final w f2951c;

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config2};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        f2949a = configArr;
        if (i9 >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        f2950b = config;
        f2951c = new w((String[]) new ArrayList(20).toArray(new String[0]));
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e8) {
            throw e8;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str != null && !W7.d.U(str)) {
            String g02 = W7.d.g0(W7.d.g0(str, '#'), '?');
            return mimeTypeMap.getMimeTypeFromExtension(W7.d.f0(W7.d.f0(g02, '/', g02), '.', ""));
        }
        return null;
    }

    public static final t c(ImageView imageView) {
        t tVar;
        Object tag = imageView.getTag(R.id.coil_request_manager);
        t tVar2 = null;
        if (tag instanceof t) {
            tVar = (t) tag;
        } else {
            tVar = null;
        }
        if (tVar == null) {
            synchronized (imageView) {
                try {
                    Object tag2 = imageView.getTag(R.id.coil_request_manager);
                    if (tag2 instanceof t) {
                        tVar2 = (t) tag2;
                    }
                    if (tVar2 == null) {
                        tVar2 = new t(imageView);
                        imageView.addOnAttachStateChangeListener(tVar2);
                        imageView.setTag(R.id.coil_request_manager, tVar2);
                    }
                } finally {
                }
            }
            return tVar2;
        }
        return tVar;
    }

    public static final boolean d(Uri uri) {
        if (kotlin.jvm.internal.h.a(uri.getScheme(), "file") && kotlin.jvm.internal.h.a((String) B7.k.q0(uri.getPathSegments()), "android_asset")) {
            return true;
        }
        return false;
    }

    public static final int e(s8.n nVar, D1.g gVar) {
        if (nVar instanceof D1.a) {
            return ((D1.a) nVar).f1767m;
        }
        int ordinal = gVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Integer.MAX_VALUE;
            }
            throw new RuntimeException();
        }
        return Integer.MIN_VALUE;
    }
}
