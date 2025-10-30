package A4;

import P.f0;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import b5.B0;
import b5.C0623e0;
import b5.C0648m1;
import b5.C0650n0;
import b5.G;
import b5.Q1;
import b5.S0;
import b5.V;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.measurement.D1;
import f5.C1185q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import m1.C1583a;
import n1.C1612i;
import n1.C1613j;
import o1.AbstractC1672g;
import s.C1939i;
import t4.C2009A;
import t4.z;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f353a;

    /* renamed from: b, reason: collision with root package name */
    public Object f354b;

    /* renamed from: c, reason: collision with root package name */
    public Object f355c;

    /* renamed from: d, reason: collision with root package name */
    public Object f356d;

    public /* synthetic */ j(int i9) {
        this.f353a = i9;
    }

    private final void a() {
        int i9;
        C1185q c3;
        a aVar = (a) this.f355c;
        Intent intent = aVar.f331a;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        Integer num = null;
        if (TextUtils.isEmpty(stringExtra)) {
            c3 = s8.n.p(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = aVar.f331a;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = aVar.f331a;
            if (intent3.hasExtra("google.product_id")) {
                num = Integer.valueOf(intent3.getIntExtra("google.product_id", 0));
            }
            if (num != null) {
                bundle.putInt("google.product_id", num.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            q b9 = q.b((Context) this.f354b);
            synchronized (b9) {
                i9 = b9.f378a;
                b9.f378a = i9 + 1;
            }
            c3 = b9.c(new o(i9, 2, bundle, 0));
        }
        c3.b(i.f350b, new s4.i((CountDownLatch) this.f356d));
    }

    private final void b() {
        AtomicReference atomicReference;
        C0648m1 c0648m1;
        C0650n0 c0650n0;
        C0623e0 c0623e0;
        AtomicReference atomicReference2 = (AtomicReference) this.f354b;
        synchronized (atomicReference2) {
            try {
                try {
                    c0648m1 = (C0648m1) this.f356d;
                    c0650n0 = (C0650n0) c0648m1.f1707a;
                    c0623e0 = c0650n0.f11228h;
                    C0650n0.d(c0623e0);
                } catch (RemoteException e8) {
                    V v8 = ((C0650n0) ((C0648m1) this.f356d).f1707a).f11229i;
                    C0650n0.f(v8);
                    v8.f10971f.c(e8, "Failed to get app instance id");
                    atomicReference = (AtomicReference) this.f354b;
                }
                if (!c0623e0.s0().k(B0.ANALYTICS_STORAGE)) {
                    V v9 = c0650n0.f11229i;
                    C0650n0.f(v9);
                    v9.f10975k.b("Analytics storage consent denied; will not get app instance id");
                    S0 s02 = ((C0650n0) c0648m1.f1707a).f11235p;
                    C0650n0.e(s02);
                    s02.f10947g.set(null);
                    C0623e0 c0623e02 = c0650n0.f11228h;
                    C0650n0.d(c0623e02);
                    c0623e02.f11089h.n(null);
                    atomicReference2.set(null);
                    atomicReference2.notify();
                } else {
                    G g9 = c0648m1.f11196d;
                    if (g9 == null) {
                        V v10 = c0650n0.f11229i;
                        C0650n0.f(v10);
                        v10.f10971f.b("Failed to get app instance id");
                        atomicReference2.notify();
                    } else {
                        atomicReference2.set(g9.D0((Q1) this.f355c));
                        String str = (String) atomicReference2.get();
                        if (str != null) {
                            S0 s03 = ((C0650n0) c0648m1.f1707a).f11235p;
                            C0650n0.e(s03);
                            s03.f10947g.set(str);
                            C0623e0 c0623e03 = c0650n0.f11228h;
                            C0650n0.d(c0623e03);
                            c0623e03.f11089h.n(str);
                        }
                        c0648m1.B0();
                        atomicReference = (AtomicReference) this.f354b;
                        atomicReference.notify();
                    }
                }
            } catch (Throwable th) {
                ((AtomicReference) this.f354b).notify();
                throw th;
            }
        }
    }

    private final void c() {
        BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f356d;
        Context context = (Context) this.f354b;
        Intent intent = (Intent) this.f355c;
        try {
            boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            e1.q.d().a(ConstraintProxyUpdateReceiver.f10432a, "Updating proxies: BatteryNotLowProxy enabled (" + booleanExtra + "), BatteryChargingProxy enabled (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy enabled (" + booleanExtra4 + ")", new Throwable[0]);
            AbstractC1672g.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
            AbstractC1672g.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
            AbstractC1672g.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
            AbstractC1672g.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
        } finally {
            pendingResult.finish();
        }
    }

    private final void d() {
        C1613j l9 = ((WorkDatabase) this.f354b).v().l((String) this.f355c);
        if (l9 != null && l9.b()) {
            synchronized (((C1583a) this.f356d).f20667c) {
                ((C1583a) this.f356d).f20670f.put((String) this.f355c, l9);
                ((C1583a) this.f356d).f20671g.add(l9);
                C1583a c1583a = (C1583a) this.f356d;
                c1583a.f20672h.c(c1583a.f20671g);
            }
        }
    }

    private final void e() {
        t4.f fVar;
        z zVar = (z) this.f354b;
        HashMap hashMap = zVar.f23285f.f23124C;
        String str = (String) this.f355c;
        synchronized (hashMap) {
            fVar = (t4.f) hashMap.get(str);
        }
        if (fVar != null) {
            String str2 = (String) this.f356d;
            CastDevice castDevice = zVar.f23285f.f23122A;
            ((v4.h) fVar).n(str2);
            return;
        }
        C2009A.f23120G.b("Discarded message for unknown namespace '%s'", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [s.e, s.i] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, n1.i] */
    /* JADX WARN: Type inference failed for: r4v2, types: [e1.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [s.e, s.i] */
    public List f() {
        e1.h hVar;
        ArrayList arrayList;
        G6.e v8 = ((f1.k) this.f355c).j.v();
        v8.getClass();
        G0.G a5 = G0.G.a(1, "SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        String str = (String) this.f356d;
        if (str == null) {
            a5.t(1);
        } else {
            a5.m(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) v8.f2887a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            Cursor w7 = s8.n.w(workDatabase_Impl, a5, true);
            try {
                int z9 = s8.e.z(w7, "id");
                int z10 = s8.e.z(w7, "state");
                int z11 = s8.e.z(w7, "output");
                int z12 = s8.e.z(w7, "run_attempt_count");
                ?? c1939i = new C1939i(0);
                ?? c1939i2 = new C1939i(0);
                while (w7.moveToNext()) {
                    if (!w7.isNull(z9)) {
                        String string = w7.getString(z9);
                        if (((ArrayList) c1939i.get(string)) == null) {
                            c1939i.put(string, new ArrayList());
                        }
                    }
                    if (!w7.isNull(z9)) {
                        String string2 = w7.getString(z9);
                        if (((ArrayList) c1939i2.get(string2)) == null) {
                            c1939i2.put(string2, new ArrayList());
                        }
                    }
                }
                w7.moveToPosition(-1);
                v8.b(c1939i);
                v8.a(c1939i2);
                ArrayList arrayList2 = new ArrayList(w7.getCount());
                while (w7.moveToNext()) {
                    ArrayList arrayList3 = null;
                    if (!w7.isNull(z9)) {
                        arrayList = (ArrayList) c1939i.get(w7.getString(z9));
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    if (!w7.isNull(z9)) {
                        arrayList3 = (ArrayList) c1939i2.get(w7.getString(z9));
                    }
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    ?? obj = new Object();
                    obj.f21023a = w7.getString(z9);
                    obj.f21024b = D1.z(w7.getInt(z10));
                    obj.f21025c = e1.h.a(w7.getBlob(z11));
                    obj.f21026d = w7.getInt(z12);
                    obj.f21027e = arrayList;
                    obj.f21028f = arrayList3;
                    arrayList2.add(obj);
                }
                workDatabase_Impl.p();
                w7.close();
                a5.g();
                workDatabase_Impl.m();
                C1613j.f21030t.getClass();
                ArrayList<C1612i> arrayList4 = arrayList2;
                ArrayList arrayList5 = new ArrayList(arrayList4.size());
                for (C1612i c1612i : arrayList4) {
                    ArrayList arrayList6 = c1612i.f21028f;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        hVar = (e1.h) c1612i.f21028f.get(0);
                    } else {
                        hVar = e1.h.f17049c;
                    }
                    UUID fromString = UUID.fromString(c1612i.f21023a);
                    int i9 = c1612i.f21024b;
                    e1.h hVar2 = c1612i.f21025c;
                    ArrayList arrayList7 = c1612i.f21027e;
                    int i10 = c1612i.f21026d;
                    ?? obj2 = new Object();
                    obj2.f17072a = fromString;
                    obj2.f17073b = i9;
                    obj2.f17074c = hVar2;
                    obj2.f17075d = new HashSet(arrayList7);
                    obj2.f17076e = hVar;
                    obj2.f17077f = i10;
                    arrayList5.add(obj2);
                }
                return arrayList5;
            } catch (Throwable th) {
                w7.close();
                a5.g();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase_Impl.m();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x065a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.j.run():void");
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i9) {
        this.f353a = i9;
        this.f354b = obj;
        this.f355c = obj2;
        this.f356d = obj3;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i9, boolean z9) {
        this.f353a = i9;
        this.f356d = obj;
        this.f354b = obj2;
        this.f355c = obj3;
    }

    public j(f1.k kVar, String str) {
        this.f353a = 19;
        this.f355c = kVar;
        this.f356d = str;
        this.f354b = new Object();
    }

    public j(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.f353a = 16;
        this.f355c = intent;
        this.f354b = context;
        this.f356d = pendingResult;
    }

    public j(View view, f0 f0Var, O0.c cVar, ValueAnimator valueAnimator) {
        this.f353a = 3;
        this.f354b = view;
        this.f355c = cVar;
        this.f356d = valueAnimator;
    }
}
