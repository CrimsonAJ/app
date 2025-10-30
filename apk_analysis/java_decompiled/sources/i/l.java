package i;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import f5.ExecutorC1184p;
import java.lang.ref.WeakReference;
import s.C1931a;
import s.C1936f;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final G0.I f18073a = new G0.I(new ExecutorC1184p(1));

    /* renamed from: b, reason: collision with root package name */
    public static final int f18074b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static L.g f18075c = null;

    /* renamed from: d, reason: collision with root package name */
    public static L.g f18076d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f18077e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f18078f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final C1936f f18079g = new C1936f(0);

    /* renamed from: h, reason: collision with root package name */
    public static final Object f18080h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final Object f18081i = new Object();

    public static boolean b(Context context) {
        int i9;
        if (f18077e == null) {
            try {
                int i10 = AbstractServiceC1314D.f17984a;
                if (Build.VERSION.SDK_INT >= 24) {
                    i9 = AbstractC1313C.a() | 128;
                } else {
                    i9 = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC1314D.class), i9).metaData;
                if (bundle != null) {
                    f18077e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f18077e = Boolean.FALSE;
            }
        }
        return f18077e.booleanValue();
    }

    public static void e(w wVar) {
        synchronized (f18080h) {
            try {
                C1936f c1936f = f18079g;
                c1936f.getClass();
                C1931a c1931a = new C1931a(c1936f);
                while (c1931a.hasNext()) {
                    l lVar = (l) ((WeakReference) c1931a.next()).get();
                    if (lVar == wVar || lVar == null) {
                        c1931a.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i9);

    public abstract void g(int i9);

    public abstract void h(View view);

    public abstract void i(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void j(CharSequence charSequence);
}
