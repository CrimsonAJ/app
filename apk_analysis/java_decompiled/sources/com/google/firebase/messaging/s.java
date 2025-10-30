package com.google.firebase.messaging;

import G0.ServiceConnectionC0148n;
import N3.AbstractC0259j;
import N3.C0266q;
import N3.C0270v;
import N3.G;
import N3.H;
import P5.AbstractC0349q;
import X.O;
import Y7.C0473n;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.work.impl.WorkDatabase_Impl;
import b5.C0623e0;
import b5.C0650n0;
import b5.V;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.C0916d;
import com.google.android.gms.internal.measurement.C0926f;
import com.google.android.gms.internal.measurement.C0995t;
import com.google.android.gms.internal.measurement.InterfaceC0966n;
import com.google.android.gms.internal.measurement.K3;
import e0.C1133a;
import i7.a0;
import j3.M;
import j3.i0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;
import n1.C1605b;
import n1.C1608e;
import n3.C1635l;
import n3.InterfaceC1636m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s.C1937g;
import s.C1939i;

/* loaded from: classes.dex */
public final class s implements H, InterfaceC1636m {

    /* renamed from: f, reason: collision with root package name */
    public static s f16502f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16503a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16504b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16505c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16506d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16507e;

    public /* synthetic */ s(int i9, boolean z9) {
        this.f16503a = i9;
    }

    public static final Message a(s sVar, ArrayList arrayList, int i9) {
        Object obj;
        sVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            if (((Message) obj2).what == i9) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        }
        return (Message) obj;
    }

    public static synchronized s i() {
        s sVar;
        synchronized (s.class) {
            try {
                if (f16502f == null) {
                    f16502f = new s(0);
                }
                sVar = f16502f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sVar;
    }

    public static void r(long j, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            hashMap.remove(arrayList.get(i9));
        }
    }

    public void A(Bundle bundle) {
        Bundle bundle2;
        Iterator<String> it;
        JSONObject jSONObject;
        boolean y02;
        V v8;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = new Bundle(bundle);
        }
        C0623e0 c0623e0 = (C0623e0) this.f16507e;
        SharedPreferences q02 = c0623e0.q0();
        C0650n0 c0650n0 = (C0650n0) c0623e0.f1707a;
        SharedPreferences.Editor edit = q02.edit();
        int size = bundle2.size();
        String str = (String) this.f16504b;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = bundle2.keySet().iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                Object obj = bundle2.get(next);
                if (obj != null) {
                    try {
                        jSONObject = new JSONObject();
                        jSONObject.put("n", next);
                        K3.b();
                        y02 = c0650n0.f11227g.y0(null, b5.E.f10631X0);
                        v8 = c0650n0.f11229i;
                    } catch (JSONException e8) {
                        e = e8;
                        it = it2;
                    }
                    if (y02) {
                        it = it2;
                        try {
                        } catch (JSONException e9) {
                            e = e9;
                            V v9 = c0650n0.f11229i;
                            C0650n0.f(v9);
                            v9.f10971f.c(e, "Cannot serialize bundle value to SharedPreferences");
                            it2 = it;
                        }
                        if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            C0650n0.f(v8);
                            v8.f10971f.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            it2 = it;
                        }
                        jSONArray.put(jSONObject);
                        it2 = it;
                    } else {
                        it = it2;
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            C0650n0.f(v8);
                            v8.f10971f.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            it2 = it;
                        }
                        jSONArray.put(jSONObject);
                        it2 = it;
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f16506d = bundle2;
    }

    public InterfaceC0966n B(C0916d c0916d) {
        InterfaceC0966n interfaceC0966n = InterfaceC0966n.f15543N;
        Iterator s9 = c0916d.s();
        while (s9.hasNext()) {
            interfaceC0966n = ((C0995t) this.f16505c).a(this, c0916d.q(((Integer) s9.next()).intValue()));
            if (interfaceC0966n instanceof C0926f) {
                break;
            }
        }
        return interfaceC0966n;
    }

    public InterfaceC0966n C(String str) {
        HashMap hashMap = (HashMap) this.f16506d;
        if (hashMap.containsKey(str)) {
            return (InterfaceC0966n) hashMap.get(str);
        }
        s sVar = (s) this.f16504b;
        if (sVar != null) {
            return sVar.C(str);
        }
        throw new IllegalArgumentException(AbstractC0953k1.n(str, " is not defined"));
    }

    @Override // N3.H
    public void D(int i9, N3.A a5, C0266q c0266q, C0270v c0270v) {
        switch (this.f16503a) {
            case 3:
                if (n(i9, a5)) {
                    ((G) this.f16505c).e(c0266q, o(c0270v));
                    return;
                }
                return;
            default:
                if (m(i9, a5)) {
                    ((G) this.f16505c).e(c0266q, c0270v);
                    return;
                }
                return;
        }
    }

    public void E(String str, InterfaceC0966n interfaceC0966n) {
        if (((HashMap) this.f16507e).containsKey(str)) {
            return;
        }
        HashMap hashMap = (HashMap) this.f16506d;
        if (interfaceC0966n == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, interfaceC0966n);
        }
    }

    public void F(String str, InterfaceC0966n interfaceC0966n) {
        s sVar;
        HashMap hashMap = (HashMap) this.f16506d;
        if (!hashMap.containsKey(str) && (sVar = (s) this.f16504b) != null && sVar.G(str)) {
            sVar.F(str, interfaceC0966n);
        } else {
            if (((HashMap) this.f16507e).containsKey(str)) {
                return;
            }
            if (interfaceC0966n == null) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, interfaceC0966n);
            }
        }
    }

    public boolean G(String str) {
        if (((HashMap) this.f16506d).containsKey(str)) {
            return true;
        }
        s sVar = (s) this.f16504b;
        if (sVar != null) {
            return sVar.G(str);
        }
        return false;
    }

    @Override // N3.H
    public void H(int i9, N3.A a5, C0270v c0270v) {
        switch (this.f16503a) {
            case 3:
                if (n(i9, a5)) {
                    ((G) this.f16505c).c(o(c0270v));
                    return;
                }
                return;
            default:
                if (m(i9, a5)) {
                    ((G) this.f16505c).c(c0270v);
                    return;
                }
                return;
        }
    }

    @Override // N3.H
    public void J(int i9, N3.A a5, C0270v c0270v) {
        switch (this.f16503a) {
            case 3:
                if (n(i9, a5)) {
                    ((G) this.f16505c).n(o(c0270v));
                    return;
                }
                return;
            default:
                if (m(i9, a5)) {
                    ((G) this.f16505c).n(c0270v);
                    return;
                }
                return;
        }
    }

    @Override // n3.InterfaceC1636m
    public void L(int i9, N3.A a5) {
        switch (this.f16503a) {
            case 3:
                if (n(i9, a5)) {
                    ((C1635l) this.f16506d).a();
                    return;
                }
                return;
            default:
                if (m(i9, a5)) {
                    ((C1635l) this.f16506d).a();
                    return;
                }
                return;
        }
    }

    public ArrayList b(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.f16504b;
        r(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.f16505c;
        r(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            R3.b bVar = (R3.b) list.get(i9);
            if (!hashMap.containsKey(bVar.f6582b) && !hashMap2.containsKey(Integer.valueOf(bVar.f6583c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // N3.H
    public void c(int i9, N3.A a5, C0266q c0266q, C0270v c0270v) {
        switch (this.f16503a) {
            case 3:
                if (n(i9, a5)) {
                    ((G) this.f16505c).m(c0266q, o(c0270v));
                    return;
                }
                return;
            default:
                if (m(i9, a5)) {
                    ((G) this.f16505c).m(c0266q, c0270v);
                    return;
                }
                return;
        }
    }

    public c6.k d() {
        Integer num = (Integer) this.f16504b;
        if (num != null) {
            if (((Integer) this.f16505c) != null) {
                if (((c6.d) this.f16506d) != null) {
                    if (((c6.d) this.f16507e) != null) {
                        if (num.intValue() >= 16) {
                            Integer num2 = (Integer) this.f16505c;
                            int intValue = num2.intValue();
                            c6.d dVar = (c6.d) this.f16506d;
                            if (intValue >= 10) {
                                if (dVar == c6.d.f11670g) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
                                    }
                                } else if (dVar == c6.d.f11671h) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
                                    }
                                } else if (dVar == c6.d.f11672i) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
                                    }
                                } else if (dVar == c6.d.j) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
                                    }
                                } else if (dVar == c6.d.f11673k) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
                                    }
                                } else {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                                }
                                return new c6.k(((Integer) this.f16504b).intValue(), ((Integer) this.f16505c).intValue(), (c6.d) this.f16507e, (c6.d) this.f16506d);
                            }
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
                        }
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.f16504b));
                    }
                    throw new GeneralSecurityException("variant is not set");
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }

    @Override // N3.H
    public void e(int i9, N3.A a5, C0266q c0266q, C0270v c0270v) {
        switch (this.f16503a) {
            case 3:
                if (n(i9, a5)) {
                    ((G) this.f16505c).h(c0266q, o(c0270v));
                    return;
                }
                return;
            default:
                if (m(i9, a5)) {
                    ((G) this.f16505c).h(c0266q, c0270v);
                    return;
                }
                return;
        }
    }

    public void f(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((C1939i) this.f16505c).get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i9 = 0; i9 < size; i9++) {
                    f(arrayList2.get(i9), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(G7.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C0409i
            if (r0 == 0) goto L13
            r0 = r7
            X.i r0 = (X.C0409i) r0
            int r1 = r0.f8073u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8073u = r1
            goto L18
        L13:
            X.i r0 = new X.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f8071s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f8073u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.google.firebase.messaging.s r0 = r0.f8070r
            a.AbstractC0485a.A(r7)
            goto L64
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            com.google.firebase.messaging.s r0 = r0.f8070r
            a.AbstractC0485a.A(r7)
            goto L74
        L3a:
            a.AbstractC0485a.A(r7)
            java.lang.Object r7 = r6.f16506d
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r6.f16507e
            X.O r2 = (X.O) r2
            if (r7 == 0) goto L67
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L67
        L4e:
            X.Y r7 = r2.h()
            X.l r4 = new X.l
            r5 = 0
            r4.<init>(r2, r6, r5)
            r0.f8070r = r6
            r0.f8073u = r3
            java.lang.Object r7 = r7.b(r4, r0)
            if (r7 != r1) goto L63
            goto L72
        L63:
            r0 = r6
        L64:
            X.c r7 = (X.C0403c) r7
            goto L76
        L67:
            r0.f8070r = r6
            r0.f8073u = r4
            r7 = 0
            java.lang.Object r7 = X.O.g(r2, r7, r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            r0 = r6
        L74:
            X.c r7 = (X.C0403c) r7
        L76:
            java.lang.Object r0 = r0.f16507e
            X.O r0 = (X.O) r0
            G0.s r0 = r0.f8018h
            r0.c(r7)
            A7.n r7 = A7.n.f558a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.s.g(G7.c):java.lang.Object");
    }

    @Override // N3.H
    public void h(int i9, N3.A a5, C0266q c0266q, C0270v c0270v, IOException iOException, boolean z9) {
        switch (this.f16503a) {
            case 3:
                if (n(i9, a5)) {
                    ((G) this.f16505c).k(c0266q, o(c0270v), iOException, z9);
                    return;
                }
                return;
            default:
                if (m(i9, a5)) {
                    ((G) this.f16505c).k(c0266q, c0270v, iOException, z9);
                    return;
                }
                return;
        }
    }

    @Override // n3.InterfaceC1636m
    public void j(int i9, N3.A a5) {
        switch (this.f16503a) {
            case 3:
                if (n(i9, a5)) {
                    ((C1635l) this.f16506d).e();
                    return;
                }
                return;
            default:
                if (m(i9, a5)) {
                    ((C1635l) this.f16506d).e();
                    return;
                }
                return;
        }
    }

    public boolean k(Context context) {
        boolean z9;
        if (((Boolean) this.f16506d) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f16506d = Boolean.valueOf(z9);
        }
        if (!((Boolean) this.f16505c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f16506d).booleanValue();
    }

    public boolean l(Context context) {
        boolean z9;
        if (((Boolean) this.f16505c) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f16505c = Boolean.valueOf(z9);
        }
        if (!((Boolean) this.f16505c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f16505c).booleanValue();
    }

    public boolean m(int i9, N3.A a5) {
        i0 i0Var = (i0) this.f16504b;
        N3.A a9 = null;
        if (a5 != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= i0Var.f19649c.size()) {
                    break;
                }
                if (((N3.A) i0Var.f19649c.get(i10)).f5210d == a5.f5210d) {
                    a9 = a5.b(Pair.create(i0Var.f19648b, a5.f5207a));
                    break;
                }
                i10++;
            }
            if (a9 == null) {
                return false;
            }
        }
        N3.A a10 = a9;
        int i11 = i9 + i0Var.f19650d;
        G g9 = (G) this.f16505c;
        int i12 = g9.f4921a;
        F5.o oVar = (F5.o) this.f16507e;
        if (i12 != i11 || !l4.y.a(g9.f4922b, a10)) {
            this.f16505c = new G(((G) oVar.f2537g).f4923c, i11, a10, 0L);
        }
        C1635l c1635l = (C1635l) this.f16506d;
        if (c1635l.f21130a != i11 || !l4.y.a(c1635l.f21131b, a10)) {
            this.f16506d = new C1635l(((C1635l) oVar.f2538h).f21132c, i11, a10);
            return true;
        }
        return true;
    }

    public boolean n(int i9, N3.A a5) {
        N3.A a9;
        AbstractC0259j abstractC0259j = (AbstractC0259j) this.f16507e;
        Object obj = this.f16504b;
        if (a5 != null) {
            a9 = abstractC0259j.v(obj, a5);
            if (a9 == null) {
                return false;
            }
        } else {
            a9 = null;
        }
        N3.A a10 = a9;
        int x5 = abstractC0259j.x(i9, obj);
        G g9 = (G) this.f16505c;
        if (g9.f4921a != x5 || !l4.y.a(g9.f4922b, a10)) {
            this.f16505c = new G(abstractC0259j.f5037c.f4923c, x5, a10, 0L);
        }
        C1635l c1635l = (C1635l) this.f16506d;
        if (c1635l.f21130a != x5 || !l4.y.a(c1635l.f21131b, a10)) {
            this.f16506d = new C1635l(abstractC0259j.f5038d.f21132c, x5, a10);
            return true;
        }
        return true;
    }

    public C0270v o(C0270v c0270v) {
        AbstractC0259j abstractC0259j = (AbstractC0259j) this.f16507e;
        Object obj = this.f16504b;
        long j = c0270v.f5201b;
        long w7 = abstractC0259j.w(j, obj);
        long j4 = c0270v.f5203d;
        long w9 = abstractC0259j.w(j4, obj);
        if (w7 == j && w9 == j4) {
            return c0270v;
        }
        return new C0270v(c0270v.f5200a, c0270v.f5202c, (M) c0270v.f5205f, c0270v.f5204e, c0270v.f5206g, w7, w9);
    }

    @Override // n3.InterfaceC1636m
    public void p(int i9, N3.A a5, Exception exc) {
        switch (this.f16503a) {
            case 3:
                if (n(i9, a5)) {
                    ((C1635l) this.f16506d).d(exc);
                    return;
                }
                return;
            default:
                if (m(i9, a5)) {
                    ((C1635l) this.f16506d).d(exc);
                    return;
                }
                return;
        }
    }

    public void q(Message message) {
        LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.f16506d;
        if (linkedBlockingDeque.offer(message)) {
            Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + linkedBlockingDeque.size());
            return;
        }
        Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[Catch: all -> 0x0093, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0093, blocks: (B:25:0x0066, B:29:0x0076), top: B:24:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v6, types: [g8.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(G7.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.T
            if (r0 == 0) goto L13
            r0 = r8
            X.T r0 = (X.T) r0
            int r1 = r0.f8032v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8032v = r1
            goto L18
        L13:
            X.T r0 = new X.T
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f8030t
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f8032v
            A7.n r3 = A7.n.f558a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            g8.a r1 = r0.f8029s
            com.google.firebase.messaging.s r0 = r0.f8028r
            a.AbstractC0485a.A(r8)     // Catch: java.lang.Throwable -> L31
            goto L85
        L31:
            r8 = move-exception
            goto L95
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            g8.a r2 = r0.f8029s
            com.google.firebase.messaging.s r5 = r0.f8028r
            a.AbstractC0485a.A(r8)
            r8 = r2
            goto L66
        L44:
            a.AbstractC0485a.A(r8)
            java.lang.Object r8 = r7.f16505c
            Y7.n r8 = (Y7.C0473n) r8
            java.lang.Object r8 = r8.D()
            boolean r8 = r8 instanceof Y7.InterfaceC0451a0
            if (r8 != 0) goto L54
            return r3
        L54:
            r0.f8028r = r7
            java.lang.Object r8 = r7.f16504b
            g8.d r8 = (g8.d) r8
            r0.f8029s = r8
            r0.f8032v = r5
            java.lang.Object r2 = r8.d(r0)
            if (r2 != r1) goto L65
            goto L82
        L65:
            r5 = r7
        L66:
            java.lang.Object r2 = r5.f16505c     // Catch: java.lang.Throwable -> L93
            Y7.n r2 = (Y7.C0473n) r2     // Catch: java.lang.Throwable -> L93
            java.lang.Object r2 = r2.D()     // Catch: java.lang.Throwable -> L93
            boolean r2 = r2 instanceof Y7.InterfaceC0451a0     // Catch: java.lang.Throwable -> L93
            if (r2 != 0) goto L76
            r8.a(r6)
            return r3
        L76:
            r0.f8028r = r5     // Catch: java.lang.Throwable -> L93
            r0.f8029s = r8     // Catch: java.lang.Throwable -> L93
            r0.f8032v = r4     // Catch: java.lang.Throwable -> L93
            java.lang.Object r0 = r5.g(r0)     // Catch: java.lang.Throwable -> L93
            if (r0 != r1) goto L83
        L82:
            return r1
        L83:
            r1 = r8
            r0 = r5
        L85:
            java.lang.Object r8 = r0.f16505c     // Catch: java.lang.Throwable -> L31
            Y7.n r8 = (Y7.C0473n) r8     // Catch: java.lang.Throwable -> L31
            r8.L(r3)     // Catch: java.lang.Throwable -> L31
            r1.a(r6)
            return r3
        L90:
            r1 = r8
            r8 = r0
            goto L95
        L93:
            r0 = move-exception
            goto L90
        L95:
            r1.a(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.s.s(G7.c):java.lang.Object");
    }

    public R3.b t(List list) {
        R3.b bVar;
        ArrayList b9 = b(list);
        if (b9.size() < 2) {
            return (R3.b) AbstractC0349q.h(b9, null);
        }
        Collections.sort(b9, new E6.a(5));
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        int i10 = ((R3.b) b9.get(0)).f6583c;
        int i11 = 0;
        while (true) {
            if (i11 >= b9.size()) {
                break;
            }
            R3.b bVar2 = (R3.b) b9.get(i11);
            if (i10 != bVar2.f6583c) {
                if (arrayList.size() == 1) {
                    return (R3.b) b9.get(0);
                }
            } else {
                arrayList.add(new Pair(bVar2.f6582b, Integer.valueOf(bVar2.f6584d)));
                i11++;
            }
        }
        HashMap hashMap = (HashMap) this.f16506d;
        R3.b bVar3 = (R3.b) hashMap.get(arrayList);
        if (bVar3 == null) {
            List subList = b9.subList(0, arrayList.size());
            int i12 = 0;
            for (int i13 = 0; i13 < subList.size(); i13++) {
                i12 += ((R3.b) subList.get(i13)).f6584d;
            }
            int nextInt = ((Random) this.f16507e).nextInt(i12);
            int i14 = 0;
            while (true) {
                if (i9 < subList.size()) {
                    bVar = (R3.b) subList.get(i9);
                    i14 += bVar.f6584d;
                    if (nextInt < i14) {
                        break;
                    }
                    i9++;
                } else {
                    bVar = (R3.b) AbstractC0349q.i(subList);
                    break;
                }
            }
            hashMap.put(arrayList, bVar);
            return bVar;
        }
        return bVar3;
    }

    @Override // n3.InterfaceC1636m
    public void u(int i9, N3.A a5) {
        switch (this.f16503a) {
            case 3:
                if (n(i9, a5)) {
                    ((C1635l) this.f16506d).b();
                    return;
                }
                return;
            default:
                if (m(i9, a5)) {
                    ((C1635l) this.f16506d).b();
                    return;
                }
                return;
        }
    }

    public void v(int i9) {
        ArrayList arrayList = new ArrayList();
        ((LinkedBlockingDeque) this.f16506d).drainTo(arrayList);
        Message obtain = Message.obtain(null, i9, 0, 0);
        kotlin.jvm.internal.h.d(obtain, "obtain(null, messageCode, 0, 0)");
        arrayList.add(obtain);
        Y7.B.r(Y7.B.a((E7.i) this.f16504b), null, new a0(this, arrayList, null), 3);
    }

    public Bundle w() {
        char c3;
        if (((Bundle) this.f16506d) == null) {
            C0623e0 c0623e0 = (C0623e0) this.f16507e;
            SharedPreferences q02 = c0623e0.q0();
            C0650n0 c0650n0 = (C0650n0) c0623e0.f1707a;
            String string = q02.getString((String) this.f16504b, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i9);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode != 100) {
                                if (hashCode != 108) {
                                    if (hashCode != 115) {
                                        if (hashCode != 3352) {
                                            if (hashCode == 3445 && string3.equals("la")) {
                                                c3 = 4;
                                            }
                                            c3 = 65535;
                                        } else {
                                            if (string3.equals("ia")) {
                                                c3 = 3;
                                            }
                                            c3 = 65535;
                                        }
                                    } else {
                                        if (string3.equals("s")) {
                                            c3 = 0;
                                        }
                                        c3 = 65535;
                                    }
                                } else {
                                    if (string3.equals("l")) {
                                        c3 = 2;
                                    }
                                    c3 = 65535;
                                }
                            } else {
                                if (string3.equals("d")) {
                                    c3 = 1;
                                }
                                c3 = 65535;
                            }
                            if (c3 != 0) {
                                if (c3 != 1) {
                                    if (c3 != 2) {
                                        if (c3 != 3) {
                                            if (c3 != 4) {
                                                V v8 = c0650n0.f11229i;
                                                C0650n0.f(v8);
                                                v8.f10971f.c(string3, "Unrecognized persisted bundle type. Type");
                                            } else {
                                                K3.b();
                                                if (c0650n0.f11227g.y0(null, b5.E.f10631X0)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i10 = 0; i10 < length; i10++) {
                                                        jArr[i10] = jSONArray2.optLong(i10);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            }
                                        } else {
                                            K3.b();
                                            if (c0650n0.f11227g.y0(null, b5.E.f10631X0)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i11 = 0; i11 < length2; i11++) {
                                                    iArr[i11] = jSONArray3.optInt(i11);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        }
                                    } else {
                                        bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                    }
                                } else {
                                    bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                                }
                            } else {
                                bundle.putString(string2, jSONObject.getString("v"));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            V v9 = c0650n0.f11229i;
                            C0650n0.f(v9);
                            v9.f10971f.b("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f16506d = bundle;
                } catch (JSONException unused2) {
                    V v10 = c0650n0.f11229i;
                    C0650n0.f(v10);
                    v10.f10971f.b("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.f16506d) == null) {
                this.f16506d = (Bundle) this.f16505c;
            }
        }
        Bundle bundle2 = (Bundle) this.f16506d;
        F4.y.h(bundle2);
        return new Bundle(bundle2);
    }

    @Override // n3.InterfaceC1636m
    public void x(int i9, N3.A a5, int i10) {
        switch (this.f16503a) {
            case 3:
                if (n(i9, a5)) {
                    ((C1635l) this.f16506d).c(i10);
                    return;
                }
                return;
            default:
                if (m(i9, a5)) {
                    ((C1635l) this.f16506d).c(i10);
                    return;
                }
                return;
        }
    }

    public s y() {
        return new s(this, (C0995t) this.f16505c);
    }

    public InterfaceC0966n z(InterfaceC0966n interfaceC0966n) {
        return ((C0995t) this.f16505c).a(this, interfaceC0966n);
    }

    public s(C0623e0 c0623e0, String str) {
        this.f16503a = 7;
        this.f16507e = c0623e0;
        F4.y.e(str);
        this.f16504b = str;
        this.f16505c = new Bundle();
    }

    public s(s sVar, C0995t c0995t) {
        this.f16503a = 9;
        this.f16506d = new HashMap();
        this.f16507e = new HashMap();
        this.f16504b = sVar;
        this.f16505c = c0995t;
    }

    public s(WorkDatabase_Impl workDatabase_Impl) {
        this.f16503a = 14;
        this.f16504b = workDatabase_Impl;
        this.f16505c = new C1605b(workDatabase_Impl, 4);
        this.f16506d = new C1608e(workDatabase_Impl, 1);
        this.f16507e = new C1608e(workDatabase_Impl, 2);
    }

    public s(String str, String str2, StackTraceElement[] stackTraceElementArr, s sVar) {
        this.f16503a = 2;
        this.f16504b = str;
        this.f16505c = str2;
        this.f16506d = stackTraceElementArr;
        this.f16507e = sVar;
    }

    public s(E7.i backgroundDispatcher) {
        this.f16503a = 12;
        kotlin.jvm.internal.h.e(backgroundDispatcher, "backgroundDispatcher");
        this.f16504b = backgroundDispatcher;
        this.f16506d = new LinkedBlockingDeque(20);
        this.f16507e = new ServiceConnectionC0148n(1, this);
    }

    public s(Typeface typeface, e0.b bVar) {
        int i9;
        int i10;
        int i11;
        int i12;
        this.f16503a = 10;
        this.f16507e = typeface;
        this.f16504b = bVar;
        this.f16506d = new d0.r(1024);
        int a5 = bVar.a(6);
        if (a5 != 0) {
            int i13 = a5 + bVar.f1634a;
            i9 = ((ByteBuffer) bVar.f1637d).getInt(((ByteBuffer) bVar.f1637d).getInt(i13) + i13);
        } else {
            i9 = 0;
        }
        this.f16505c = new char[i9 * 2];
        int a9 = bVar.a(6);
        if (a9 != 0) {
            int i14 = a9 + bVar.f1634a;
            i10 = ((ByteBuffer) bVar.f1637d).getInt(((ByteBuffer) bVar.f1637d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            d0.u uVar = new d0.u(this, i15);
            C1133a b9 = uVar.b();
            int a10 = b9.a(4);
            Character.toChars(a10 != 0 ? ((ByteBuffer) b9.f1637d).getInt(a10 + b9.f1634a) : 0, (char[]) this.f16505c, i15 * 2);
            C1133a b10 = uVar.b();
            int a11 = b10.a(16);
            if (a11 != 0) {
                int i16 = a11 + b10.f1634a;
                i11 = ((ByteBuffer) b10.f1637d).getInt(((ByteBuffer) b10.f1637d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            s8.e.d("invalid metadata codepoint length", i11 > 0);
            C1133a b11 = uVar.b();
            int a12 = b11.a(16);
            if (a12 != 0) {
                int i17 = a12 + b11.f1634a;
                i12 = ((ByteBuffer) b11.f1637d).getInt(((ByteBuffer) b11.f1637d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            ((d0.r) this.f16506d).a(uVar, 0, i12 - 1);
        }
    }

    public s(int i9) {
        this.f16503a = i9;
        switch (i9) {
            case 1:
                this.f16504b = new O.c(10);
                this.f16505c = new C1939i(0);
                this.f16506d = new ArrayList();
                this.f16507e = new HashSet();
                return;
            case 4:
                Random random = new Random();
                this.f16506d = new HashMap();
                this.f16507e = random;
                this.f16504b = new HashMap();
                this.f16505c = new HashMap();
                return;
            case 6:
                this.f16504b = new C1939i(0);
                this.f16505c = new SparseArray();
                this.f16506d = new C1937g();
                this.f16507e = new C1939i(0);
                return;
            default:
                this.f16504b = null;
                this.f16505c = null;
                this.f16506d = null;
                this.f16507e = new ArrayDeque();
                return;
        }
    }

    public s(AbstractC0259j abstractC0259j, Object obj) {
        this.f16503a = 3;
        this.f16507e = abstractC0259j;
        this.f16505c = abstractC0259j.a(null);
        this.f16506d = new C1635l(abstractC0259j.f5038d.f21132c, 0, null);
        this.f16504b = obj;
    }

    public s(O o9, List list) {
        this.f16503a = 5;
        this.f16507e = o9;
        this.f16504b = g8.e.a();
        this.f16505c = new C0473n();
        this.f16506d = B7.k.H0(list);
    }

    public s(F5.o oVar, i0 i0Var) {
        this.f16503a = 13;
        this.f16507e = oVar;
        this.f16505c = (G) oVar.f2537g;
        this.f16506d = (C1635l) oVar.f2538h;
        this.f16504b = i0Var;
    }
}
