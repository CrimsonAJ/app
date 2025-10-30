package com.google.android.gms.internal.cast;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class Z2 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f14801a;

    static {
        char[] cArr = new char[80];
        f14801a = cArr;
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
            I2 i22 = I2.f14726c;
            sb.append(J.e(new I2(((String) obj).getBytes(S2.f14762a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof I2) {
            sb.append(": \"");
            sb.append(J.e((I2) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof N2) {
            sb.append(" {");
            c((N2) obj, sb, i9 + 2);
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
            sb.append(f14801a, 0, i10);
            i9 -= i10;
        }
    }

    public static void c(N2 n22, StringBuilder sb, int i9) {
        int i10;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = n22.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i11 = 0;
        while (true) {
            i10 = 3;
            if (i11 >= length) {
                break;
            }
            Method method3 = declaredMethods[i11];
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
            i11++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i10);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb, i9, substring.substring(0, substring.length() - 4), N2.c(method2, n22, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i9, substring.substring(0, substring.length() - 3), N2.c(method, n22, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object c3 = N2.c(method4, n22, new Object[0]);
                    if (method5 == null) {
                        if (c3 instanceof Boolean) {
                            if (!((Boolean) c3).booleanValue()) {
                            }
                            a(sb, i9, substring, c3);
                        } else if (c3 instanceof Integer) {
                            if (((Integer) c3).intValue() == 0) {
                            }
                            a(sb, i9, substring, c3);
                        } else if (c3 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) c3).floatValue()) == 0) {
                            }
                            a(sb, i9, substring, c3);
                        } else if (c3 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) c3).doubleValue()) == 0) {
                            }
                            a(sb, i9, substring, c3);
                        } else {
                            if (c3 instanceof String) {
                                equals = c3.equals("");
                            } else if (c3 instanceof I2) {
                                equals = c3.equals(I2.f14726c);
                            } else if (c3 instanceof E2) {
                                if (c3 == ((N2) ((N2) ((E2) c3)).h(6, null))) {
                                }
                                a(sb, i9, substring, c3);
                            } else {
                                if ((c3 instanceof Enum) && ((Enum) c3).ordinal() == 0) {
                                }
                                a(sb, i9, substring, c3);
                            }
                            if (equals) {
                            }
                            a(sb, i9, substring, c3);
                        }
                    } else {
                        if (!((Boolean) N2.c(method5, n22, new Object[0])).booleanValue()) {
                        }
                        a(sb, i9, substring, c3);
                    }
                }
            }
            i10 = 3;
        }
    }
}
