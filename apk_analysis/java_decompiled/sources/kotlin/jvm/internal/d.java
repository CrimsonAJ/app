package kotlin.jvm.internal;

import B7.y;
import O7.s;
import O7.t;
import O7.u;
import O7.v;
import O7.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public final class d implements U7.c, c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f20149b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f20150c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f20151d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f20152a;

    static {
        int i9 = 0;
        List b02 = B7.l.b0(O7.a.class, O7.l.class, O7.p.class, O7.q.class, O7.r.class, s.class, t.class, u.class, v.class, w.class, O7.b.class, O7.c.class, O7.d.class, O7.e.class, O7.f.class, O7.g.class, O7.h.class, O7.i.class, O7.j.class, O7.k.class, O7.m.class, O7.n.class, O7.o.class);
        ArrayList arrayList = new ArrayList(B7.m.f0(b02, 10));
        for (Object obj : b02) {
            int i10 = i9 + 1;
            if (i9 >= 0) {
                arrayList.add(new A7.h((Class) obj, Integer.valueOf(i9)));
                i9 = i10;
            } else {
                B7.l.e0();
                throw null;
            }
        }
        f20149b = y.G(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        h.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            h.b(str);
            sb.append(W7.d.f0(str, '.', str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f20149b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f20150c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(y.D(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            h.b(str2);
            linkedHashMap.put(key, W7.d.f0(str2, '.', str2));
        }
        f20151d = linkedHashMap;
    }

    public d(Class jClass) {
        h.e(jClass, "jClass");
        this.f20152a = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.f20152a;
    }

    public final String b() {
        String str;
        Class jClass = this.f20152a;
        h.e(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        boolean isArray = jClass.isArray();
        HashMap hashMap = f20150c;
        if (isArray) {
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "kotlin.Array";
            }
            return str2;
        }
        String str3 = (String) hashMap.get(jClass.getName());
        if (str3 == null) {
            return jClass.getCanonicalName();
        }
        return str3;
    }

    public final String c() {
        String str;
        Class jClass = this.f20152a;
        h.e(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (jClass.isLocalClass()) {
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return W7.d.e0(simpleName, enclosingMethod.getName() + '$');
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return W7.d.e0(simpleName, enclosingConstructor.getName() + '$');
            }
            return W7.d.d0(simpleName, '$');
        }
        boolean isArray = jClass.isArray();
        LinkedHashMap linkedHashMap = f20151d;
        if (isArray) {
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "Array";
            }
            return str2;
        }
        String str3 = (String) linkedHashMap.get(jClass.getName());
        if (str3 == null) {
            return jClass.getSimpleName();
        }
        return str3;
    }

    public final boolean d(Object obj) {
        Class jClass = this.f20152a;
        h.e(jClass, "jClass");
        Map map = f20149b;
        h.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return r.d(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = AbstractC1570b.g(p.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof d) && AbstractC1570b.g(this).equals(AbstractC1570b.g((U7.c) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1570b.g(this).hashCode();
    }

    public final String toString() {
        return this.f20152a + " (Kotlin reflection is not available)";
    }
}
