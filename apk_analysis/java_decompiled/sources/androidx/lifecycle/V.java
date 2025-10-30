package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import b8.C0718Q;
import b8.InterfaceC0707F;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f9842f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9843a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f9844b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f9845c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f9846d;

    /* renamed from: e, reason: collision with root package name */
    public final N0.e f9847e;

    public V(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f9843a = linkedHashMap;
        this.f9844b = new LinkedHashMap();
        this.f9845c = new LinkedHashMap();
        this.f9846d = new LinkedHashMap();
        this.f9847e = new T(0, this);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(V this$0) {
        kotlin.jvm.internal.h.e(this$0, "this$0");
        for (Map.Entry entry : B7.y.H(this$0.f9844b).entrySet()) {
            this$0.b(((N0.e) entry.getValue()).a(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = this$0.f9843a;
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return Z0.a.c(new A7.h("keys", arrayList), new A7.h("values", arrayList2));
    }

    public final void b(Object obj, String key) {
        E e8;
        kotlin.jvm.internal.h.e(key, "key");
        if (obj != null) {
            Class[] clsArr = f9842f;
            for (int i9 = 0; i9 < 29; i9++) {
                Class cls = clsArr[i9];
                kotlin.jvm.internal.h.b(cls);
                if (!cls.isInstance(obj)) {
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.f9845c.get(key);
        if (obj2 instanceof E) {
            e8 = (E) obj2;
        } else {
            e8 = null;
        }
        if (e8 != null) {
            e8.i(obj);
        } else {
            this.f9843a.put(key, obj);
        }
        InterfaceC0707F interfaceC0707F = (InterfaceC0707F) this.f9846d.get(key);
        if (interfaceC0707F == null) {
            return;
        }
        ((C0718Q) interfaceC0707F).i(obj);
    }

    public V() {
        this.f9843a = new LinkedHashMap();
        this.f9844b = new LinkedHashMap();
        this.f9845c = new LinkedHashMap();
        this.f9846d = new LinkedHashMap();
        this.f9847e = new T(0, this);
    }
}
