package u0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.Serializable;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f23419c = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final Context f23420a;

    /* renamed from: b, reason: collision with root package name */
    public final W f23421b;

    public I(Context context, W navigatorProvider) {
        kotlin.jvm.internal.h.e(navigatorProvider, "navigatorProvider");
        this.f23420a = context;
        this.f23421b = navigatorProvider;
    }

    public static C2038i c(TypedArray typedArray, Resources resources, int i9) {
        boolean z9;
        T t7;
        T t9;
        T t10;
        Class cls;
        boolean z10;
        T t11;
        Object obj;
        T t12;
        T f9;
        Object valueOf;
        boolean z11;
        int i10;
        String str;
        boolean z12;
        T t13;
        boolean z13 = typedArray.getBoolean(3, false);
        ThreadLocal threadLocal = f23419c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        T t14 = T.f23444c;
        T t15 = T.j;
        T t16 = T.f23456p;
        T t17 = T.f23453m;
        T t18 = T.f23448g;
        T t19 = T.f23445d;
        T t20 = T.f23447f;
        T t21 = T.f23455o;
        T t22 = T.f23452l;
        T t23 = T.f23450i;
        T t24 = T.f23443b;
        T t25 = null;
        if (string != null) {
            t7 = t19;
            String resourcePackageName = resources.getResourcePackageName(i9);
            if ("integer".equals(string)) {
                z9 = z13;
                t9 = t20;
                t10 = t24;
            } else {
                z9 = z13;
                if ("integer[]".equals(string)) {
                    t9 = t20;
                    t10 = t7;
                } else {
                    if ("List<Int>".equals(string)) {
                        t10 = T.f23446e;
                    } else if ("long".equals(string)) {
                        t10 = t20;
                        t9 = t10;
                    } else if ("long[]".equals(string)) {
                        t9 = t20;
                        t10 = t18;
                    } else if ("List<Long>".equals(string)) {
                        t10 = T.f23449h;
                    } else if ("boolean".equals(string)) {
                        t9 = t20;
                        t10 = t22;
                    } else if ("boolean[]".equals(string)) {
                        t9 = t20;
                        t10 = t17;
                    } else if ("List<Boolean>".equals(string)) {
                        t10 = T.f23454n;
                    } else {
                        if (!"string".equals(string)) {
                            if ("string[]".equals(string)) {
                                t9 = t20;
                                t10 = t16;
                            } else if ("List<String>".equals(string)) {
                                t10 = T.f23457q;
                            } else if ("float".equals(string)) {
                                t10 = t23;
                            } else if ("float[]".equals(string)) {
                                t9 = t20;
                                t10 = t15;
                            } else if ("List<Float>".equals(string)) {
                                t10 = T.f23451k;
                            } else if ("reference".equals(string)) {
                                t10 = t14;
                            } else if (string.length() != 0) {
                                try {
                                    t9 = t20;
                                    if (W7.l.L(string, ".", false) && resourcePackageName != null) {
                                        str = resourcePackageName.concat(string);
                                    } else {
                                        str = string;
                                    }
                                    boolean G8 = W7.l.G(string, "[]", false);
                                    if (G8) {
                                        z12 = G8;
                                        str = str.substring(0, str.length() - 2);
                                        kotlin.jvm.internal.h.d(str, "substring(...)");
                                    } else {
                                        z12 = G8;
                                    }
                                    Class<?> cls2 = Class.forName(str);
                                    if (Parcelable.class.isAssignableFrom(cls2)) {
                                        if (z12) {
                                            t13 = new O(cls2);
                                        } else {
                                            t13 = new P(cls2);
                                        }
                                    } else if (Enum.class.isAssignableFrom(cls2) && !z12) {
                                        t13 = new N(cls2);
                                    } else if (Serializable.class.isAssignableFrom(cls2)) {
                                        if (z12) {
                                            t13 = new Q(cls2);
                                        } else {
                                            t13 = new S(cls2);
                                        }
                                    } else {
                                        t13 = null;
                                    }
                                    if (t13 != null) {
                                        t10 = t13;
                                    } else {
                                        throw new IllegalArgumentException((str + " is not Serializable or Parcelable.").toString());
                                    }
                                } catch (ClassNotFoundException e8) {
                                    throw new RuntimeException(e8);
                                }
                            }
                        }
                        t9 = t20;
                        t10 = t21;
                    }
                    t9 = t20;
                }
            }
        } else {
            z9 = z13;
            t7 = t19;
            t9 = t20;
            t10 = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            cls = Serializable.class;
            if (t10 == t14) {
                int i11 = typedValue.resourceId;
                if (i11 != 0) {
                    i10 = i11;
                } else if (typedValue.type == 16 && typedValue.data == 0) {
                    i10 = 0;
                } else {
                    throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + t10.b() + ". Must be a reference to a resource.");
                }
                obj = Integer.valueOf(i10);
            } else {
                int i12 = typedValue.resourceId;
                if (i12 != 0) {
                    if (t10 == null) {
                        obj = Integer.valueOf(i12);
                        t10 = t14;
                    } else {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + t10.b() + ". You must use a \"reference\" type to reference other resources.");
                    }
                } else {
                    if (t10 == t21) {
                        z10 = true;
                        obj = typedArray.getString(1);
                    } else {
                        z10 = true;
                        int i13 = typedValue.type;
                        if (i13 != 3) {
                            if (i13 != 4) {
                                if (i13 != 5) {
                                    if (i13 != 18) {
                                        if (i13 >= 16 && i13 <= 31) {
                                            if (t10 == t23) {
                                                f9 = s8.e.f(typedValue, t10, t23, string, "float");
                                                valueOf = Float.valueOf(typedValue.data);
                                            } else {
                                                f9 = s8.e.f(typedValue, t10, t24, string, "integer");
                                                valueOf = Integer.valueOf(typedValue.data);
                                            }
                                        } else {
                                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                                        }
                                    } else {
                                        f9 = s8.e.f(typedValue, t10, t22, string, "boolean");
                                        if (typedValue.data != 0) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        valueOf = Boolean.valueOf(z11);
                                    }
                                } else {
                                    f9 = s8.e.f(typedValue, t10, t24, string, "dimension");
                                    valueOf = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                                }
                            } else {
                                f9 = s8.e.f(typedValue, t10, t23, string, "float");
                                valueOf = Float.valueOf(typedValue.getFloat());
                            }
                            t10 = f9;
                            obj = valueOf;
                        } else {
                            String value = typedValue.string.toString();
                            if (t10 == null) {
                                kotlin.jvm.internal.h.e(value, "value");
                                try {
                                    t24.d(value);
                                    t10 = t24;
                                } catch (IllegalArgumentException unused) {
                                    t11 = t9;
                                    try {
                                        try {
                                            try {
                                                t11.d(value);
                                                t10 = t11;
                                            } catch (IllegalArgumentException unused2) {
                                                t10 = t21;
                                            }
                                        } catch (IllegalArgumentException unused3) {
                                            t22.d(value);
                                            t10 = t22;
                                        }
                                    } catch (IllegalArgumentException unused4) {
                                        t23.d(value);
                                        t10 = t23;
                                    }
                                }
                            }
                            t11 = t9;
                            obj = t10.d(value);
                        }
                    }
                    t11 = t9;
                }
            }
            t11 = t9;
            z10 = true;
        } else {
            cls = Serializable.class;
            z10 = true;
            t11 = t9;
            obj = null;
        }
        if (obj == null) {
            obj = null;
            z10 = false;
        }
        if (t10 != null) {
            t25 = t10;
        }
        if (t25 == null) {
            if (obj instanceof Integer) {
                t12 = t24;
            } else if (obj instanceof int[]) {
                t12 = t7;
            } else if (obj instanceof Long) {
                t12 = t11;
            } else if (obj instanceof long[]) {
                t12 = t18;
            } else if (obj instanceof Float) {
                t12 = t23;
            } else if (obj instanceof float[]) {
                t12 = t15;
            } else if (obj instanceof Boolean) {
                t12 = t22;
            } else if (obj instanceof boolean[]) {
                t12 = t17;
            } else if (!(obj instanceof String) && obj != null) {
                if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    t12 = t16;
                } else {
                    if (obj.getClass().isArray()) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        kotlin.jvm.internal.h.b(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType2 = obj.getClass().getComponentType();
                            kotlin.jvm.internal.h.c(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                            t12 = new O(componentType2);
                        }
                    }
                    if (obj.getClass().isArray()) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        kotlin.jvm.internal.h.b(componentType3);
                        if (cls.isAssignableFrom(componentType3)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            kotlin.jvm.internal.h.c(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            t12 = new Q(componentType4);
                        }
                    }
                    if (obj instanceof Parcelable) {
                        t12 = new P(obj.getClass());
                    } else if (obj instanceof Enum) {
                        t12 = new N(obj.getClass());
                    } else if (obj instanceof Serializable) {
                        t12 = new S(obj.getClass());
                    } else {
                        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                    }
                }
            } else {
                t12 = t21;
            }
        } else {
            t12 = t25;
        }
        return new C2038i(t12, z9, obj, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x013c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x027c, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u0.C a(android.content.res.Resources r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, int r31) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.I.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):u0.C");
    }

    public final F b(int i9) {
        int next;
        Resources resources = this.f23420a.getResources();
        XmlResourceParser xml = resources.getXml(i9);
        kotlin.jvm.internal.h.d(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e8) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i9) + " line " + xml.getLineNumber(), e8);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            kotlin.jvm.internal.h.d(attrs, "attrs");
            C a5 = a(resources, xml, attrs, i9);
            if (a5 instanceof F) {
                return (F) a5;
            }
            throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
