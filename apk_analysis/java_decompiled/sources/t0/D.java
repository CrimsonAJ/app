package t0;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import b5.G1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: c, reason: collision with root package name */
    public static C1971e f22861c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22862a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22863b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public D(Context context) {
        this.f22862a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
        } else {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static C1971e c() {
        C1971e c1971e = f22861c;
        if (c1971e != null) {
            return c1971e;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static D d(Context context) {
        if (context != null) {
            b();
            if (f22861c == null) {
                f22861c = new C1971e(context.getApplicationContext());
            }
            ArrayList arrayList = f22861c.f22970h;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    D d9 = (D) ((WeakReference) arrayList.get(size)).get();
                    if (d9 == null) {
                        arrayList.remove(size);
                    } else if (d9.f22862a == context) {
                        return d9;
                    }
                } else {
                    D d10 = new D(context);
                    arrayList.add(new WeakReference(d10));
                    return d10;
                }
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    public static MediaSessionCompat$Token e() {
        C1971e c1971e = f22861c;
        if (c1971e != null) {
            G1 g12 = c1971e.f22960C;
            if (g12 != null) {
                android.support.v4.media.session.y yVar = (android.support.v4.media.session.y) g12.f10717b;
                if (yVar != null) {
                    return ((android.support.v4.media.session.t) yVar.f9331b).f9319b;
                }
                return null;
            }
            android.support.v4.media.session.y yVar2 = c1971e.f22961D;
            if (yVar2 != null) {
                return ((android.support.v4.media.session.t) yVar2.f9331b).f9319b;
            }
            return null;
        }
        return null;
    }

    public static C f() {
        b();
        return c().g();
    }

    public static boolean g() {
        Bundle bundle;
        if (f22861c == null) {
            return false;
        }
        F f9 = c().f22982u;
        if (f9 != null && (bundle = f9.f22872e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
            return false;
        }
        return true;
    }

    public static void i(int i9) {
        if (i9 >= 0 && i9 <= 3) {
            b();
            C1971e c3 = c();
            C c9 = c3.c();
            if (c3.g() != c9) {
                c3.j(c9, i9, true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Unsupported reason to unselect route");
    }

    public final void a(C1988w c1988w, AbstractC1989x abstractC1989x, int i9) {
        C1990y c1990y;
        boolean z9;
        ArrayList<String> arrayList;
        C1988w c1988w2;
        if (c1988w != null) {
            if (abstractC1989x != null) {
                b();
                ArrayList arrayList2 = this.f22863b;
                int size = arrayList2.size();
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        if (((C1990y) arrayList2.get(i11)).f23050b == abstractC1989x) {
                            break;
                        } else {
                            i11++;
                        }
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 < 0) {
                    c1990y = new C1990y(this, abstractC1989x);
                    arrayList2.add(c1990y);
                } else {
                    c1990y = (C1990y) arrayList2.get(i11);
                }
                boolean z10 = true;
                if (i9 != c1990y.f23052d) {
                    c1990y.f23052d = i9;
                    z9 = true;
                } else {
                    z9 = false;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if ((i9 & 1) != 0) {
                    z9 = true;
                }
                c1990y.f23053e = elapsedRealtime;
                C1988w c1988w3 = c1990y.f23051c;
                c1988w3.a();
                c1988w.a();
                if (!c1988w3.f23048b.containsAll(c1988w.f23048b)) {
                    C1988w c1988w4 = c1990y.f23051c;
                    if (c1988w4 != null) {
                        c1988w4.a();
                        if (!c1988w4.f23048b.isEmpty()) {
                            arrayList = new ArrayList<>(c1988w4.f23048b);
                        } else {
                            arrayList = null;
                        }
                        ArrayList c3 = c1988w.c();
                        if (!c3.isEmpty()) {
                            int size2 = c3.size();
                            while (i10 < size2) {
                                Object obj = c3.get(i10);
                                i10++;
                                String str = (String) obj;
                                if (str != null) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList<>();
                                    }
                                    if (!arrayList.contains(str)) {
                                        arrayList.add(str);
                                    }
                                } else {
                                    throw new IllegalArgumentException("category must not be null");
                                }
                            }
                        }
                        if (arrayList == null) {
                            c1988w2 = C1988w.f23046c;
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList("controlCategories", arrayList);
                            c1988w2 = new C1988w(bundle, arrayList);
                        }
                        c1990y.f23051c = c1988w2;
                    } else {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                } else {
                    z10 = z9;
                }
                if (z10) {
                    c().l();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("callback must not be null");
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void h(AbstractC1989x abstractC1989x) {
        if (abstractC1989x != null) {
            b();
            ArrayList arrayList = this.f22863b;
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    if (((C1990y) arrayList.get(i9)).f23050b == abstractC1989x) {
                        break;
                    } else {
                        i9++;
                    }
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (i9 >= 0) {
                arrayList.remove(i9);
                c().l();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }
}
