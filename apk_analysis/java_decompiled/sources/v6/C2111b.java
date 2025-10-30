package v6;

import A6.o;
import A6.p;
import A6.r;
import B7.m;
import E6.e;
import android.util.Log;
import g7.AbstractC1259e;
import g7.C1257c;
import g7.C1258d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o1.C1671f;
import z6.d;

/* renamed from: v6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2111b {

    /* renamed from: a, reason: collision with root package name */
    public final e f23899a;

    public C2111b(e eVar) {
        this.f23899a = eVar;
    }

    public final void a(C1258d c1258d) {
        int i9 = 0;
        e eVar = this.f23899a;
        HashSet hashSet = c1258d.f17779a;
        ArrayList arrayList = new ArrayList(m.f0(hashSet, 10));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C1257c c1257c = (C1257c) ((AbstractC1259e) it.next());
            String str = c1257c.f17774b;
            String str2 = c1257c.f17776d;
            String str3 = c1257c.f17777e;
            String str4 = c1257c.f17775c;
            long j = c1257c.f17778f;
            C1671f c1671f = o.f526a;
            if (str3.length() > 256) {
                str3 = str3.substring(0, 256);
            }
            arrayList.add(new A6.b(str, str2, str3, str4, j));
        }
        synchronized (((p) eVar.f1972f)) {
            try {
                if (((p) eVar.f1972f).c(arrayList)) {
                    ((d) eVar.f1969c).f25506b.a(new r(eVar, i9, ((p) eVar.f1972f).a()));
                }
            } finally {
            }
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Updated Crashlytics Rollout State", null);
        }
    }
}
