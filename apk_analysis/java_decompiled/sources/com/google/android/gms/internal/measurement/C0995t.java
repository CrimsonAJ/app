package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0995t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15593a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15594b;

    public /* synthetic */ C0995t(C1 c12, String str) {
        this.f15593a = c12;
        this.f15594b = str;
    }

    public InterfaceC0966n a(com.google.firebase.messaging.s sVar, InterfaceC0966n interfaceC0966n) {
        C0990s c0990s;
        s8.n.W(sVar);
        if (interfaceC0966n instanceof C0971o) {
            C0971o c0971o = (C0971o) interfaceC0966n;
            ArrayList arrayList = c0971o.f15557b;
            HashMap hashMap = (HashMap) this.f15593a;
            String str = c0971o.f15556a;
            if (hashMap.containsKey(str)) {
                c0990s = (C0990s) hashMap.get(str);
            } else {
                c0990s = (C0990s) this.f15594b;
            }
            return c0990s.a(str, sVar, arrayList);
        }
        return interfaceC0966n;
    }

    public Object b() {
        Uri uri;
        ContentProviderClient acquireUnstableContentProviderClient;
        String str;
        C1 c12 = (C1) this.f15593a;
        String str2 = (String) this.f15594b;
        Context context = (Context) c12.f15187b;
        context.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        E6.e eVar = AbstractC0992s1.f15590a;
        if (contentResolver != null) {
            synchronized (eVar) {
                try {
                    if (((HashMap) eVar.f1968b) == null) {
                        ((AtomicBoolean) eVar.f1967a).set(false);
                        eVar.f1968b = new HashMap(16, 1.0f);
                        eVar.f1973g = new Object();
                        contentResolver.registerContentObserver(AbstractC0997t1.f15595a, true, new C1007v1(0, eVar));
                    } else if (((AtomicBoolean) eVar.f1967a).getAndSet(false)) {
                        ((HashMap) eVar.f1968b).clear();
                        ((HashMap) eVar.f1969c).clear();
                        ((HashMap) eVar.f1970d).clear();
                        ((HashMap) eVar.f1971e).clear();
                        ((HashMap) eVar.f1972f).clear();
                        eVar.f1973g = new Object();
                    }
                    Object obj = eVar.f1973g;
                    String str3 = null;
                    if (((HashMap) eVar.f1968b).containsKey(str2)) {
                        String str4 = (String) ((HashMap) eVar.f1968b).get(str2);
                        if (str4 != null) {
                            str3 = str4;
                        }
                        return str3;
                    }
                    try {
                        uri = AbstractC0997t1.f15595a;
                        acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                        try {
                        } finally {
                            acquireUnstableContentProviderClient.release();
                        }
                    } catch (C1012w1 unused) {
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str2}, null);
                            try {
                                if (query != null) {
                                    if (query.moveToFirst()) {
                                        str = query.getString(1);
                                        query.close();
                                    } else {
                                        query.close();
                                        str = null;
                                    }
                                    if (str != null && str.equals(null)) {
                                        str = null;
                                    }
                                    synchronized (eVar) {
                                        try {
                                            if (obj == eVar.f1973g) {
                                                ((HashMap) eVar.f1968b).put(str2, str);
                                            }
                                        } finally {
                                        }
                                    }
                                    if (str == null) {
                                        return null;
                                    }
                                    return str;
                                }
                                throw new Exception("ContentProvider query returned null cursor");
                            } finally {
                            }
                        } catch (RemoteException e8) {
                            throw new Exception("ContentProvider query failed", e8);
                        }
                    } else {
                        throw new Exception("Unable to acquire ContentProviderClient");
                    }
                } finally {
                }
            }
        } else {
            eVar.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
    }

    public void c(C0990s c0990s) {
        ArrayList arrayList = c0990s.f15577a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((HashMap) this.f15593a).put(Integer.valueOf(((EnumC1010w) obj).f15688a).toString(), c0990s);
        }
    }

    public void d(com.google.firebase.messaging.s sVar, b5.G1 g12) {
        int i9;
        S1 s1 = new S1(g12);
        TreeMap treeMap = (TreeMap) this.f15593a;
        for (Integer num : treeMap.keySet()) {
            C0906b clone = ((C0906b) g12.f10718c).clone();
            InterfaceC0966n a5 = ((C0961m) treeMap.get(num)).a(sVar, Collections.singletonList(s1));
            if (a5 instanceof C0931g) {
                i9 = s8.n.T(((C0931g) a5).f15487a.doubleValue());
            } else {
                i9 = -1;
            }
            if (i9 == 2 || i9 == -1) {
                g12.f10718c = clone;
            }
        }
        TreeMap treeMap2 = (TreeMap) this.f15594b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            InterfaceC0966n a9 = ((C0961m) treeMap2.get((Integer) it.next())).a(sVar, Collections.singletonList(s1));
            if (a9 instanceof C0931g) {
                s8.n.T(((C0931g) a9).f15487a.doubleValue());
            }
        }
    }

    public C0995t(int i9) {
        switch (i9) {
            case 2:
                this.f15593a = new TreeMap();
                this.f15594b = new TreeMap();
                return;
            default:
                this.f15593a = new HashMap();
                this.f15594b = new C0990s(6);
                C0990s c0990s = new C0990s(0);
                ArrayList arrayList = c0990s.f15577a;
                arrayList.add(EnumC1010w.BITWISE_AND);
                arrayList.add(EnumC1010w.BITWISE_LEFT_SHIFT);
                arrayList.add(EnumC1010w.BITWISE_NOT);
                arrayList.add(EnumC1010w.BITWISE_OR);
                arrayList.add(EnumC1010w.BITWISE_RIGHT_SHIFT);
                arrayList.add(EnumC1010w.BITWISE_UNSIGNED_RIGHT_SHIFT);
                arrayList.add(EnumC1010w.BITWISE_XOR);
                c(c0990s);
                C0990s c0990s2 = new C0990s(1);
                ArrayList arrayList2 = c0990s2.f15577a;
                arrayList2.add(EnumC1010w.EQUALS);
                arrayList2.add(EnumC1010w.GREATER_THAN);
                arrayList2.add(EnumC1010w.GREATER_THAN_EQUALS);
                arrayList2.add(EnumC1010w.IDENTITY_EQUALS);
                arrayList2.add(EnumC1010w.IDENTITY_NOT_EQUALS);
                arrayList2.add(EnumC1010w.LESS_THAN);
                arrayList2.add(EnumC1010w.LESS_THAN_EQUALS);
                arrayList2.add(EnumC1010w.NOT_EQUALS);
                c(c0990s2);
                C0990s c0990s3 = new C0990s(2);
                ArrayList arrayList3 = c0990s3.f15577a;
                arrayList3.add(EnumC1010w.APPLY);
                arrayList3.add(EnumC1010w.BLOCK);
                arrayList3.add(EnumC1010w.BREAK);
                arrayList3.add(EnumC1010w.CASE);
                arrayList3.add(EnumC1010w.DEFAULT);
                arrayList3.add(EnumC1010w.CONTINUE);
                arrayList3.add(EnumC1010w.DEFINE_FUNCTION);
                arrayList3.add(EnumC1010w.FN);
                arrayList3.add(EnumC1010w.IF);
                arrayList3.add(EnumC1010w.QUOTE);
                arrayList3.add(EnumC1010w.RETURN);
                arrayList3.add(EnumC1010w.SWITCH);
                arrayList3.add(EnumC1010w.TERNARY);
                c(c0990s3);
                C0990s c0990s4 = new C0990s(3);
                ArrayList arrayList4 = c0990s4.f15577a;
                arrayList4.add(EnumC1010w.AND);
                arrayList4.add(EnumC1010w.NOT);
                arrayList4.add(EnumC1010w.OR);
                c(c0990s4);
                C0990s c0990s5 = new C0990s(4);
                ArrayList arrayList5 = c0990s5.f15577a;
                arrayList5.add(EnumC1010w.FOR_IN);
                arrayList5.add(EnumC1010w.FOR_IN_CONST);
                arrayList5.add(EnumC1010w.FOR_IN_LET);
                arrayList5.add(EnumC1010w.FOR_LET);
                arrayList5.add(EnumC1010w.FOR_OF);
                arrayList5.add(EnumC1010w.FOR_OF_CONST);
                arrayList5.add(EnumC1010w.FOR_OF_LET);
                arrayList5.add(EnumC1010w.WHILE);
                c(c0990s5);
                C0990s c0990s6 = new C0990s(5);
                ArrayList arrayList6 = c0990s6.f15577a;
                arrayList6.add(EnumC1010w.ADD);
                arrayList6.add(EnumC1010w.DIVIDE);
                arrayList6.add(EnumC1010w.MODULUS);
                arrayList6.add(EnumC1010w.MULTIPLY);
                arrayList6.add(EnumC1010w.NEGATE);
                arrayList6.add(EnumC1010w.POST_DECREMENT);
                arrayList6.add(EnumC1010w.POST_INCREMENT);
                arrayList6.add(EnumC1010w.PRE_DECREMENT);
                arrayList6.add(EnumC1010w.PRE_INCREMENT);
                arrayList6.add(EnumC1010w.SUBTRACT);
                c(c0990s6);
                C0990s c0990s7 = new C0990s(7);
                ArrayList arrayList7 = c0990s7.f15577a;
                arrayList7.add(EnumC1010w.ASSIGN);
                arrayList7.add(EnumC1010w.CONST);
                arrayList7.add(EnumC1010w.CREATE_ARRAY);
                arrayList7.add(EnumC1010w.CREATE_OBJECT);
                arrayList7.add(EnumC1010w.EXPRESSION_LIST);
                arrayList7.add(EnumC1010w.GET);
                arrayList7.add(EnumC1010w.GET_INDEX);
                arrayList7.add(EnumC1010w.GET_PROPERTY);
                arrayList7.add(EnumC1010w.NULL);
                arrayList7.add(EnumC1010w.SET_PROPERTY);
                arrayList7.add(EnumC1010w.TYPEOF);
                arrayList7.add(EnumC1010w.UNDEFINED);
                arrayList7.add(EnumC1010w.VAR);
                c(c0990s7);
                return;
        }
    }
}
