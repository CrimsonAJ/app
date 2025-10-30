package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.InterfaceC0559u;
import androidx.lifecycle.InterfaceC0561w;
import com.google.android.gms.internal.cast.RunnableC0869s;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import f.C1148a;
import i0.AbstractActivityC1369y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: d.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1065f {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16565a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f16566b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f16567c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f16568d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient HashMap f16569e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f16570f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f16571g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1369y f16572h;

    public C1065f(AbstractActivityC1369y abstractActivityC1369y) {
        this.f16572h = abstractActivityC1369y;
    }

    public final boolean a(int i9, int i10, Intent intent) {
        String str = (String) this.f16565a.get(Integer.valueOf(i9));
        if (str == null) {
            return false;
        }
        f.f fVar = (f.f) this.f16569e.get(str);
        if (fVar != null) {
            f.b bVar = fVar.f17234a;
            if (this.f16568d.contains(str)) {
                bVar.d(fVar.f17235b.K(intent, i10));
                this.f16568d.remove(str);
                return true;
            }
        }
        this.f16570f.remove(str);
        this.f16571g.putParcelable(str, new C1148a(intent, i10));
        return true;
    }

    public final void b(int i9, v4.e eVar, Object obj) {
        Bundle bundle;
        int i10;
        String[] strArr;
        AbstractActivityC1369y abstractActivityC1369y = this.f16572h;
        com.google.firebase.messaging.u B9 = eVar.B(abstractActivityC1369y, obj);
        if (B9 != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0869s(this, i9, B9, 2));
            return;
        }
        Intent h7 = eVar.h(abstractActivityC1369y, obj);
        if (h7.getExtras() != null && h7.getExtras().getClassLoader() == null) {
            h7.setExtrasClassLoader(abstractActivityC1369y.getClassLoader());
        }
        if (h7.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = h7.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            h7.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(h7.getAction())) {
            String[] stringArrayExtra = h7.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < stringArrayExtra.length; i11++) {
                if (!TextUtils.isEmpty(stringArrayExtra[i11])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i11], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i11));
                    }
                } else {
                    throw new IllegalArgumentException(AbstractC0953k1.q(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
            }
            int size = hashSet.size();
            if (size > 0) {
                strArr = new String[stringArrayExtra.length - size];
            } else {
                strArr = stringArrayExtra;
            }
            if (size > 0) {
                if (size != stringArrayExtra.length) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < stringArrayExtra.length; i13++) {
                        if (!hashSet.contains(Integer.valueOf(i13))) {
                            strArr[i12] = stringArrayExtra[i13];
                            i12++;
                        }
                    }
                } else {
                    return;
                }
            }
            abstractActivityC1369y.requestPermissions(stringArrayExtra, i9);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(h7.getAction())) {
            f.h hVar = (f.h) h7.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                i10 = i9;
                try {
                    abstractActivityC1369y.startIntentSenderForResult(hVar.f17238a, i10, hVar.f17239b, hVar.f17240c, hVar.f17241d, 0, bundle2);
                } catch (IntentSender.SendIntentException e8) {
                    e = e8;
                    new Handler(Looper.getMainLooper()).post(new RunnableC0869s(this, i10, e, 3));
                }
            } catch (IntentSender.SendIntentException e9) {
                e = e9;
                i10 = i9;
            }
        } else {
            abstractActivityC1369y.startActivityForResult(h7, i9, bundle2);
        }
    }

    public final f.e c(String str, InterfaceC0561w interfaceC0561w, v4.e eVar, f.b bVar) {
        D.n x5 = interfaceC0561w.x();
        if (x5.a0().compareTo(EnumC0555p.f9896d) < 0) {
            e(str);
            HashMap hashMap = this.f16567c;
            f.g gVar = (f.g) hashMap.get(str);
            if (gVar == null) {
                gVar = new f.g(x5);
            }
            f.d dVar = new f.d(this, str, bVar, eVar);
            gVar.f17236a.V(dVar);
            gVar.f17237b.add(dVar);
            hashMap.put(str, gVar);
            return new f.e(this, str, eVar, 0);
        }
        throw new IllegalStateException("LifecycleOwner " + interfaceC0561w + " is attempting to register while current state is " + x5.a0() + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final f.e d(String str, v4.e eVar, f.b bVar) {
        e(str);
        this.f16569e.put(str, new f.f(bVar, eVar));
        HashMap hashMap = this.f16570f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            bVar.d(obj);
        }
        Bundle bundle = this.f16571g;
        C1148a c1148a = (C1148a) bundle.getParcelable(str);
        if (c1148a != null) {
            bundle.remove(str);
            bVar.d(eVar.K(c1148a.f17225b, c1148a.f17224a));
        }
        return new f.e(this, str, eVar, 1);
    }

    public final void e(String str) {
        HashMap hashMap = this.f16566b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        int f9 = R7.d.f6666a.f(2147418112);
        while (true) {
            int i9 = f9 + 65536;
            HashMap hashMap2 = this.f16565a;
            if (hashMap2.containsKey(Integer.valueOf(i9))) {
                f9 = R7.d.f6666a.f(2147418112);
            } else {
                hashMap2.put(Integer.valueOf(i9), str);
                hashMap.put(str, Integer.valueOf(i9));
                return;
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f16568d.contains(str) && (num = (Integer) this.f16566b.remove(str)) != null) {
            this.f16565a.remove(num);
        }
        this.f16569e.remove(str);
        HashMap hashMap = this.f16570f;
        if (hashMap.containsKey(str)) {
            StringBuilder r5 = AbstractC0953k1.r("Dropping pending result for request ", str, ": ");
            r5.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", r5.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.f16571g;
        if (bundle.containsKey(str)) {
            StringBuilder r7 = AbstractC0953k1.r("Dropping pending result for request ", str, ": ");
            r7.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", r7.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f16567c;
        f.g gVar = (f.g) hashMap2.get(str);
        if (gVar != null) {
            ArrayList arrayList = gVar.f17237b;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                gVar.f17236a.g0((InterfaceC0559u) obj);
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
