package t0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.mediarouter.app.C0568d;
import j2.C1435b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22932a;

    /* renamed from: b, reason: collision with root package name */
    public final C1971e f22933b;

    /* renamed from: d, reason: collision with root package name */
    public final PackageManager f22935d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22937f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22938g;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f22936e = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final C0568d f22939h = new C0568d(7, this);

    /* renamed from: i, reason: collision with root package name */
    public final m5.c f22940i = new m5.c(6, this);

    /* renamed from: c, reason: collision with root package name */
    public final Handler f22934c = new Handler();

    public X(Context context, C1971e c1971e) {
        this.f22932a = context;
        this.f22933b = c1971e;
        this.f22935d = context.getPackageManager();
    }

    public final void a() {
        ArrayList arrayList;
        C1971e c1971e;
        boolean h7;
        int i9;
        if (this.f22938g) {
            ArrayList arrayList2 = new ArrayList();
            int i10 = Build.VERSION.SDK_INT;
            Context context = this.f22932a;
            PackageManager packageManager = this.f22935d;
            if (i10 >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (!this.f22937f || TextUtils.equals(context.getPackageName(), serviceInfo.packageName)) {
                        arrayList3.add(serviceInfo);
                    }
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i11 = 0;
            while (true) {
                boolean hasNext = it2.hasNext();
                arrayList = this.f22936e;
                boolean z9 = true;
                c1971e = this.f22933b;
                if (!hasNext) {
                    break;
                }
                ServiceInfo serviceInfo2 = it2.next().serviceInfo;
                if (serviceInfo2 != null) {
                    if (D.f22861c == null) {
                        h7 = false;
                    } else {
                        h7 = D.c().h();
                    }
                    if (h7 && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList2.get(i12);
                            i12++;
                            ServiceInfo serviceInfo3 = (ServiceInfo) obj;
                            if (!serviceInfo2.packageName.equals(serviceInfo3.packageName) || !serviceInfo2.name.equals(serviceInfo3.name)) {
                            }
                        }
                    }
                    String str = serviceInfo2.packageName;
                    String str2 = serviceInfo2.name;
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size2) {
                            ComponentName componentName = ((W) arrayList.get(i13)).f22925i;
                            if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                                break;
                            } else {
                                i13++;
                            }
                        } else {
                            i13 = -1;
                            break;
                        }
                    }
                    if (i13 < 0) {
                        W w7 = new W(context, new ComponentName(serviceInfo2.packageName, serviceInfo2.name));
                        w7.f22931p = new C1435b(this, w7);
                        if (!w7.f22927l) {
                            w7.f22927l = true;
                            w7.l();
                        }
                        i9 = i11 + 1;
                        arrayList.add(i11, w7);
                        c1971e.a(w7, false);
                    } else if (i13 >= i11) {
                        W w9 = (W) arrayList.get(i13);
                        if (!w9.f22927l) {
                            w9.f22927l = true;
                            w9.l();
                        }
                        if (w9.f22929n == null) {
                            if (!w9.f22927l || (w9.f23039e == null && w9.f22926k.isEmpty())) {
                                z9 = false;
                            }
                            if (z9) {
                                w9.k();
                                w9.h();
                            }
                        }
                        i9 = i11 + 1;
                        Collections.swap(arrayList, i13, i11);
                    }
                    i11 = i9;
                }
            }
            if (i11 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i11; size3--) {
                    W w10 = (W) arrayList.get(size3);
                    C1966B d9 = c1971e.d(w10);
                    if (d9 != null) {
                        w10.getClass();
                        D.b();
                        w10.f23038d = null;
                        w10.g(null);
                        c1971e.n(d9, null);
                        c1971e.f22963a.b(514, d9);
                        c1971e.f22973l.remove(d9);
                    }
                    arrayList.remove(w10);
                    w10.f22931p = null;
                    if (w10.f22927l) {
                        w10.f22927l = false;
                        w10.l();
                    }
                }
            }
        }
    }
}
