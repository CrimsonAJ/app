package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import w.AbstractC2128h;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2222b {

    /* renamed from: a, reason: collision with root package name */
    public int f25182a;

    /* renamed from: b, reason: collision with root package name */
    public int f25183b;

    /* renamed from: c, reason: collision with root package name */
    public float f25184c;

    /* renamed from: d, reason: collision with root package name */
    public String f25185d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f25186e;

    /* renamed from: f, reason: collision with root package name */
    public int f25187f;

    public C2222b(C2222b c2222b, Object obj) {
        c2222b.getClass();
        this.f25182a = c2222b.f25182a;
        b(obj);
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, z.b] */
    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.f25353c);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i9 = 0;
        Object obj = null;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i9 = 6;
            } else {
                int i11 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i11 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i11 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i9 = 2;
                            } else if (index == 6) {
                                obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                i9 = 1;
                            } else if (index == 8) {
                                obj = obtainStyledAttributes.getString(index);
                            }
                        }
                        i9 = 7;
                    }
                }
                i9 = i11;
            }
        }
        if (str != null && obj != null) {
            ?? obj2 = new Object();
            obj2.f25182a = i9;
            obj2.b(obj);
            hashMap.put(str, obj2);
        }
        obtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (AbstractC2128h.b(this.f25182a)) {
            case 0:
                this.f25183b = ((Integer) obj).intValue();
                return;
            case 1:
                this.f25184c = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f25187f = ((Integer) obj).intValue();
                return;
            case 4:
                this.f25185d = (String) obj;
                return;
            case 5:
                this.f25186e = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.f25184c = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
