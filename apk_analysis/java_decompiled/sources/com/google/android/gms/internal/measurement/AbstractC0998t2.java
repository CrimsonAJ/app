package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0998t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f15598a;

    static {
        char[] cArr = new char[80];
        f15598a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i9, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i9, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i9, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i9, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            T1 t12 = T1.f15297c;
            sb.append(Z0.a.D(new T1(((String) obj).getBytes(AbstractC0944i2.f15502a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof T1) {
            sb.append(": \"");
            sb.append(Z0.a.D((T1) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0909b2) {
            sb.append(" {");
            c((AbstractC0909b2) obj, sb, i9 + 2);
            sb.append("\n");
            b(i9, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            int i11 = i9 + 2;
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            a(sb, i11, "key", entry.getKey());
            a(sb, i11, "value", entry.getValue());
            sb.append("\n");
            b(i9, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    public static void b(int i9, StringBuilder sb) {
        while (i9 > 0) {
            int i10 = 80;
            if (i9 <= 80) {
                i10 = i9;
            }
            sb.append(f15598a, 0, i10);
            i9 -= i10;
        }
    }

    public static void c(AbstractC0909b2 abstractC0909b2, StringBuilder sb, int i9) {
        int i10;
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0909b2.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i10 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i10);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null) {
                i11 = i10;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i9, substring.substring(0, substring.length() - 4), AbstractC0909b2.h(method2, abstractC0909b2, new Object[0]));
                    i10 = i11;
                }
            } else {
                i11 = i10;
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i9, substring.substring(0, substring.length() - 3), AbstractC0909b2.h(method, abstractC0909b2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object h7 = AbstractC0909b2.h(method4, abstractC0909b2, new Object[0]);
                    if (method5 == null) {
                        if (h7 instanceof Boolean) {
                            if (!((Boolean) h7).booleanValue()) {
                            }
                            a(sb, i9, substring, h7);
                        } else if (h7 instanceof Integer) {
                            if (((Integer) h7).intValue() == 0) {
                            }
                            a(sb, i9, substring, h7);
                        } else if (h7 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) h7).floatValue()) == 0) {
                            }
                            a(sb, i9, substring, h7);
                        } else if (h7 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) h7).doubleValue()) == 0) {
                            }
                            a(sb, i9, substring, h7);
                        } else {
                            if (h7 instanceof String) {
                                equals = h7.equals("");
                            } else if (h7 instanceof T1) {
                                equals = h7.equals(T1.f15297c);
                            } else if (h7 instanceof N1) {
                                if (h7 == ((AbstractC0909b2) ((AbstractC0909b2) ((N1) h7)).m(6))) {
                                }
                                a(sb, i9, substring, h7);
                            } else {
                                if ((h7 instanceof Enum) && ((Enum) h7).ordinal() == 0) {
                                }
                                a(sb, i9, substring, h7);
                            }
                            if (equals) {
                            }
                            a(sb, i9, substring, h7);
                        }
                    } else {
                        if (!((Boolean) AbstractC0909b2.h(method5, abstractC0909b2, new Object[0])).booleanValue()) {
                        }
                        a(sb, i9, substring, h7);
                    }
                }
            }
            i10 = i11;
        }
        D2 d22 = abstractC0909b2.zzc;
        if (d22 != null) {
            for (int i13 = 0; i13 < d22.f15201a; i13++) {
                a(sb, i9, String.valueOf(d22.f15202b[i13] >>> 3), d22.f15203c[i13]);
            }
        }
    }
}
