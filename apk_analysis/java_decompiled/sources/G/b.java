package G;

import A3.E;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float[][] f2595a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b, reason: collision with root package name */
    public static final float[][] f2596b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c, reason: collision with root package name */
    public static final float[] f2597c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d, reason: collision with root package name */
    public static final float[][] f2598d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e, reason: collision with root package name */
    public static final Object f2599e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static Method f2600f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f2601g;

    public static E b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i9) {
        E e8;
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        Object obj = null;
        int i10 = 0;
        if (attributeValue != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i9, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new E(obj, obj, typedValue.data, 2);
            }
            try {
                e8 = E.e(typedArray.getResources(), typedArray.getResourceId(i9, 0), theme);
            } catch (Exception e9) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e9);
                e8 = null;
            }
            if (e8 != null) {
                return e8;
            }
        }
        return new E(obj, obj, i10, 2);
    }

    public static String c(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i9) {
        if (!d(xmlResourceParser, str)) {
            return null;
        }
        return typedArray.getString(i9);
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static int e(float f9) {
        float f10;
        boolean z9;
        float f11;
        if (f9 < 1.0f) {
            return -16777216;
        }
        if (f9 > 99.0f) {
            return -1;
        }
        float f12 = (f9 + 16.0f) / 116.0f;
        if (f9 > 8.0f) {
            f10 = f12 * f12 * f12;
        } else {
            f10 = f9 / 903.2963f;
        }
        float f13 = f12 * f12 * f12;
        if (f13 > 0.008856452f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            f11 = f13;
        } else {
            f11 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z9) {
            f13 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f2597c;
        return H.a.b(f11 * fArr[0], f10 * fArr[1], f13 * fArr[2]);
    }

    public static float f(int i9) {
        float pow;
        float f9 = i9 / 255.0f;
        if (f9 <= 0.04045f) {
            pow = f9 / 12.92f;
        } else {
            pow = (float) Math.pow((f9 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static d j(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i9;
        boolean z9;
        int i10;
        int i11;
        M.d dVar;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C.a.f1143b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(5);
                String string3 = obtainAttributes.getString(6);
                String string4 = obtainAttributes.getString(2);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(3, 1);
                int integer2 = obtainAttributes.getInteger(4, 500);
                String string5 = obtainAttributes.getString(7);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        m(xmlResourceParser);
                    }
                    List k5 = k(resources, resourceId);
                    if (string4 != null) {
                        dVar = new M.d(string, string2, string4, k5);
                    } else {
                        dVar = null;
                    }
                    return new g(new M.d(string, string2, string3, k5), dVar, integer, integer2, string5);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C.a.f1144c);
                            int i12 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                i12 = 1;
                            }
                            int i13 = obtainAttributes2.getInt(i12, 400);
                            if (obtainAttributes2.hasValue(6)) {
                                i9 = 6;
                            } else {
                                i9 = 2;
                            }
                            if (1 == obtainAttributes2.getInt(i9, 0)) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            int i14 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                i14 = 3;
                            }
                            if (obtainAttributes2.hasValue(7)) {
                                i10 = 7;
                            } else {
                                i10 = 4;
                            }
                            String string6 = obtainAttributes2.getString(i10);
                            int i15 = obtainAttributes2.getInt(i14, 0);
                            if (obtainAttributes2.hasValue(5)) {
                                i11 = 5;
                            } else {
                                i11 = 0;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(i11, 0);
                            String string7 = obtainAttributes2.getString(i11);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                m(xmlResourceParser);
                            }
                            arrayList.add(new f(i13, i15, resourceId2, string7, string6, z9));
                        } else {
                            m(xmlResourceParser);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new e((f[]) arrayList.toArray(new f[0]));
            }
            m(xmlResourceParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List k(Resources resources, int i9) {
        if (i9 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i9);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i10 = 0; i10 < obtainTypedArray.length(); i10++) {
                    int resourceId = obtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i9);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void l(Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(theme);
            return;
        }
        synchronized (f2599e) {
            if (!f2601g) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    f2600f = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e8) {
                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e8);
                }
                f2601g = true;
            }
            Method method = f2600f;
            if (method != null) {
                try {
                    method.invoke(theme, null);
                } catch (IllegalAccessException | InvocationTargetException e9) {
                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e9);
                    f2600f = null;
                }
            }
        }
    }

    public static void m(XmlResourceParser xmlResourceParser) {
        int i9 = 1;
        while (i9 > 0) {
            int next = xmlResourceParser.next();
            if (next != 2) {
                if (next == 3) {
                    i9--;
                }
            } else {
                i9++;
            }
        }
    }

    public static float n() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i9) {
        new Handler(Looper.getMainLooper()).post(new j(i9, 0, this));
    }

    public abstract void h(int i9);

    public abstract void i(Typeface typeface);
}
