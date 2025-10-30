package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0906b {

    /* renamed from: d, reason: collision with root package name */
    public static final P5.I f15442d = P5.I.o(3, "_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    public String f15443a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15444b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f15445c;

    public C0906b(String str, long j, HashMap hashMap) {
        this.f15443a = str;
        this.f15444b = j;
        HashMap hashMap2 = new HashMap();
        this.f15445c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    public static Object b(Object obj, Object obj2, String str) {
        if (f15442d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (obj instanceof String) {
                return obj2;
            }
            if (obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0906b clone() {
        return new C0906b(this.f15443a, this.f15444b, new HashMap(this.f15445c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0906b) {
            C0906b c0906b = (C0906b) obj;
            if (this.f15444b != c0906b.f15444b || !this.f15443a.equals(c0906b.f15443a)) {
                return false;
            }
            return this.f15445c.equals(c0906b.f15445c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f15443a.hashCode() * 31;
        HashMap hashMap = this.f15445c;
        long j = this.f15444b;
        return hashMap.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f15443a;
        String obj = this.f15445c.toString();
        StringBuilder r5 = AbstractC0953k1.r("Event{name='", str, "', timestamp=");
        r5.append(this.f15444b);
        r5.append(", params=");
        r5.append(obj);
        r5.append("}");
        return r5.toString();
    }
}
