package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import u0.z;
import v.AbstractC2091a;
import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f25346d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f25347e;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f25348a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25349b = true;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f25350c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f25347e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] c(C2221a c2221a, String str) {
        int i9;
        String[] split = str.split(",");
        Context context = c2221a.getContext();
        int[] iArr = new int[split.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < split.length) {
            String trim = split[i10].trim();
            Object obj = null;
            try {
                i9 = o.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i9 = 0;
            }
            if (i9 == 0) {
                i9 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i9 == 0 && c2221a.isInEditMode() && (c2221a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c2221a.getParent();
                if (z.i(trim)) {
                    HashMap hashMap = constraintLayout.f9539m;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f9539m.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i9 = ((Integer) obj).intValue();
                }
            }
            iArr[i11] = i9;
            i10++;
            i11++;
        }
        if (i11 != split.length) {
            return Arrays.copyOf(iArr, i11);
        }
        return iArr;
    }

    public static C2227g d(Context context, AttributeSet attributeSet) {
        C2227g c2227g = new C2227g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f25351a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = obtainStyledAttributes.getIndex(i9);
            C2230j c2230j = c2227g.f25261b;
            C2229i c2229i = c2227g.f25262c;
            C2231k c2231k = c2227g.f25264e;
            C2228h c2228h = c2227g.f25263d;
            if (index != 1 && 23 != index && 24 != index) {
                c2229i.getClass();
                c2228h.getClass();
                c2231k.getClass();
            }
            SparseIntArray sparseIntArray = f25347e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c2228h.f25313o = f(obtainStyledAttributes, index, c2228h.f25313o);
                    break;
                case 2:
                    c2228h.f25272F = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25272F);
                    break;
                case 3:
                    c2228h.f25312n = f(obtainStyledAttributes, index, c2228h.f25312n);
                    break;
                case 4:
                    c2228h.f25311m = f(obtainStyledAttributes, index, c2228h.f25311m);
                    break;
                case 5:
                    c2228h.f25320v = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c2228h.f25324z = obtainStyledAttributes.getDimensionPixelOffset(index, c2228h.f25324z);
                    break;
                case 7:
                    c2228h.f25267A = obtainStyledAttributes.getDimensionPixelOffset(index, c2228h.f25267A);
                    break;
                case 8:
                    c2228h.f25273G = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25273G);
                    break;
                case 9:
                    c2228h.f25317s = f(obtainStyledAttributes, index, c2228h.f25317s);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    c2228h.f25316r = f(obtainStyledAttributes, index, c2228h.f25316r);
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    c2228h.f25277L = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25277L);
                    break;
                case 12:
                    c2228h.f25278M = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25278M);
                    break;
                case 13:
                    c2228h.f25275I = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25275I);
                    break;
                case 14:
                    c2228h.K = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.K);
                    break;
                case 15:
                    c2228h.f25279N = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25279N);
                    break;
                case 16:
                    c2228h.f25276J = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25276J);
                    break;
                case 17:
                    c2228h.f25297d = obtainStyledAttributes.getDimensionPixelOffset(index, c2228h.f25297d);
                    break;
                case 18:
                    c2228h.f25299e = obtainStyledAttributes.getDimensionPixelOffset(index, c2228h.f25299e);
                    break;
                case 19:
                    c2228h.f25301f = obtainStyledAttributes.getFloat(index, c2228h.f25301f);
                    break;
                case 20:
                    c2228h.f25318t = obtainStyledAttributes.getFloat(index, c2228h.f25318t);
                    break;
                case 21:
                    c2228h.f25295c = obtainStyledAttributes.getLayoutDimension(index, c2228h.f25295c);
                    break;
                case 22:
                    int i10 = obtainStyledAttributes.getInt(index, c2230j.f25330a);
                    c2230j.f25330a = i10;
                    c2230j.f25330a = f25346d[i10];
                    break;
                case 23:
                    c2228h.f25293b = obtainStyledAttributes.getLayoutDimension(index, c2228h.f25293b);
                    break;
                case 24:
                    c2228h.f25269C = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25269C);
                    break;
                case 25:
                    c2228h.f25303g = f(obtainStyledAttributes, index, c2228h.f25303g);
                    break;
                case 26:
                    c2228h.f25305h = f(obtainStyledAttributes, index, c2228h.f25305h);
                    break;
                case 27:
                    c2228h.f25268B = obtainStyledAttributes.getInt(index, c2228h.f25268B);
                    break;
                case 28:
                    c2228h.f25270D = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25270D);
                    break;
                case 29:
                    c2228h.f25307i = f(obtainStyledAttributes, index, c2228h.f25307i);
                    break;
                case 30:
                    c2228h.j = f(obtainStyledAttributes, index, c2228h.j);
                    break;
                case 31:
                    c2228h.f25274H = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25274H);
                    break;
                case 32:
                    c2228h.f25314p = f(obtainStyledAttributes, index, c2228h.f25314p);
                    break;
                case 33:
                    c2228h.f25315q = f(obtainStyledAttributes, index, c2228h.f25315q);
                    break;
                case 34:
                    c2228h.f25271E = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25271E);
                    break;
                case 35:
                    c2228h.f25310l = f(obtainStyledAttributes, index, c2228h.f25310l);
                    break;
                case 36:
                    c2228h.f25309k = f(obtainStyledAttributes, index, c2228h.f25309k);
                    break;
                case 37:
                    c2228h.f25319u = obtainStyledAttributes.getFloat(index, c2228h.f25319u);
                    break;
                case 38:
                    c2227g.f25260a = obtainStyledAttributes.getResourceId(index, c2227g.f25260a);
                    break;
                case 39:
                    c2228h.f25281P = obtainStyledAttributes.getFloat(index, c2228h.f25281P);
                    break;
                case 40:
                    c2228h.f25280O = obtainStyledAttributes.getFloat(index, c2228h.f25280O);
                    break;
                case 41:
                    c2228h.f25282Q = obtainStyledAttributes.getInt(index, c2228h.f25282Q);
                    break;
                case 42:
                    c2228h.f25283R = obtainStyledAttributes.getInt(index, c2228h.f25283R);
                    break;
                case 43:
                    c2230j.f25332c = obtainStyledAttributes.getFloat(index, c2230j.f25332c);
                    break;
                case 44:
                    c2231k.f25344k = true;
                    c2231k.f25345l = obtainStyledAttributes.getDimension(index, c2231k.f25345l);
                    break;
                case 45:
                    c2231k.f25336b = obtainStyledAttributes.getFloat(index, c2231k.f25336b);
                    break;
                case 46:
                    c2231k.f25337c = obtainStyledAttributes.getFloat(index, c2231k.f25337c);
                    break;
                case 47:
                    c2231k.f25338d = obtainStyledAttributes.getFloat(index, c2231k.f25338d);
                    break;
                case 48:
                    c2231k.f25339e = obtainStyledAttributes.getFloat(index, c2231k.f25339e);
                    break;
                case 49:
                    c2231k.f25340f = obtainStyledAttributes.getDimension(index, c2231k.f25340f);
                    break;
                case 50:
                    c2231k.f25341g = obtainStyledAttributes.getDimension(index, c2231k.f25341g);
                    break;
                case 51:
                    c2231k.f25342h = obtainStyledAttributes.getDimension(index, c2231k.f25342h);
                    break;
                case 52:
                    c2231k.f25343i = obtainStyledAttributes.getDimension(index, c2231k.f25343i);
                    break;
                case 53:
                    c2231k.j = obtainStyledAttributes.getDimension(index, c2231k.j);
                    break;
                case 54:
                    c2228h.f25284S = obtainStyledAttributes.getInt(index, c2228h.f25284S);
                    break;
                case 55:
                    c2228h.f25285T = obtainStyledAttributes.getInt(index, c2228h.f25285T);
                    break;
                case 56:
                    c2228h.f25286U = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25286U);
                    break;
                case 57:
                    c2228h.f25287V = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25287V);
                    break;
                case 58:
                    c2228h.f25288W = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25288W);
                    break;
                case 59:
                    c2228h.f25289X = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25289X);
                    break;
                case 60:
                    c2231k.f25335a = obtainStyledAttributes.getFloat(index, c2231k.f25335a);
                    break;
                case 61:
                    c2228h.f25321w = f(obtainStyledAttributes, index, c2228h.f25321w);
                    break;
                case 62:
                    c2228h.f25322x = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25322x);
                    break;
                case 63:
                    c2228h.f25323y = obtainStyledAttributes.getFloat(index, c2228h.f25323y);
                    break;
                case 64:
                    c2229i.f25326a = f(obtainStyledAttributes, index, c2229i.f25326a);
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        c2229i.getClass();
                        break;
                    } else {
                        String str = AbstractC2091a.f23716a[obtainStyledAttributes.getInteger(index, 0)];
                        c2229i.getClass();
                        break;
                    }
                case 66:
                    obtainStyledAttributes.getInt(index, 0);
                    c2229i.getClass();
                    break;
                case 67:
                    c2229i.f25329d = obtainStyledAttributes.getFloat(index, c2229i.f25329d);
                    break;
                case 68:
                    c2230j.f25333d = obtainStyledAttributes.getFloat(index, c2230j.f25333d);
                    break;
                case 69:
                    c2228h.Y = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c2228h.f25290Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c2228h.f25292a0 = obtainStyledAttributes.getInt(index, c2228h.f25292a0);
                    break;
                case 73:
                    c2228h.f25294b0 = obtainStyledAttributes.getDimensionPixelSize(index, c2228h.f25294b0);
                    break;
                case 74:
                    c2228h.f25300e0 = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    c2228h.f25308i0 = obtainStyledAttributes.getBoolean(index, c2228h.f25308i0);
                    break;
                case 76:
                    c2229i.f25327b = obtainStyledAttributes.getInt(index, c2229i.f25327b);
                    break;
                case 77:
                    c2228h.f25302f0 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    c2230j.f25331b = obtainStyledAttributes.getInt(index, c2230j.f25331b);
                    break;
                case 79:
                    c2229i.f25328c = obtainStyledAttributes.getFloat(index, c2229i.f25328c);
                    break;
                case 80:
                    c2228h.f25304g0 = obtainStyledAttributes.getBoolean(index, c2228h.f25304g0);
                    break;
                case 81:
                    c2228h.f25306h0 = obtainStyledAttributes.getBoolean(index, c2228h.f25306h0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return c2227g;
    }

    public static int f(TypedArray typedArray, int i9, int i10) {
        int resourceId = typedArray.getResourceId(i9, i10);
        if (resourceId == -1) {
            return typedArray.getInt(i9, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x010c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View, z.a, z.c] */
    public final void a(ConstraintLayout constraintLayout) {
        int i9;
        HashSet hashSet;
        HashSet hashSet2;
        String str;
        l lVar = this;
        int i10 = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = lVar.f25350c;
        HashSet hashSet3 = new HashSet(hashMap.keySet());
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb.append(str);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (lVar.f25349b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap.containsKey(Integer.valueOf(id))) {
                        hashSet3.remove(Integer.valueOf(id));
                        C2227g c2227g = (C2227g) hashMap.get(Integer.valueOf(id));
                        if (childAt instanceof C2221a) {
                            c2227g.f25263d.f25296c0 = i10;
                        }
                        int i12 = c2227g.f25263d.f25296c0;
                        if (i12 != -1 && i12 == i10) {
                            C2221a c2221a = (C2221a) childAt;
                            c2221a.setId(id);
                            C2228h c2228h = c2227g.f25263d;
                            c2221a.setType(c2228h.f25292a0);
                            c2221a.setMargin(c2228h.f25294b0);
                            c2221a.setAllowsGoneWidget(c2228h.f25308i0);
                            int[] iArr = c2228h.f25298d0;
                            if (iArr != null) {
                                c2221a.setReferencedIds(iArr);
                            } else {
                                String str2 = c2228h.f25300e0;
                                if (str2 != null) {
                                    int[] c3 = c(c2221a, str2);
                                    c2228h.f25298d0 = c3;
                                    c2221a.setReferencedIds(c3);
                                }
                            }
                        }
                        C2225e c2225e = (C2225e) childAt.getLayoutParams();
                        c2225e.a();
                        c2227g.a(c2225e);
                        HashMap hashMap2 = c2227g.f25265f;
                        Class<?> cls = childAt.getClass();
                        for (String str3 : hashMap2.keySet()) {
                            C2222b c2222b = (C2222b) hashMap2.get(str3);
                            String e8 = z.e("set", str3);
                            int i13 = childCount;
                            try {
                                int b9 = AbstractC2128h.b(c2222b.f25182a);
                                Class<?> cls2 = Integer.TYPE;
                                Class<?> cls3 = Float.TYPE;
                                switch (b9) {
                                    case 0:
                                        hashSet2 = hashSet3;
                                        cls.getMethod(e8, cls2).invoke(childAt, Integer.valueOf(c2222b.f25183b));
                                        break;
                                    case 1:
                                        hashSet2 = hashSet3;
                                        cls.getMethod(e8, cls3).invoke(childAt, Float.valueOf(c2222b.f25184c));
                                        break;
                                    case 2:
                                        hashSet2 = hashSet3;
                                        cls.getMethod(e8, cls2).invoke(childAt, Integer.valueOf(c2222b.f25187f));
                                        break;
                                    case 3:
                                        hashSet2 = hashSet3;
                                        Method method = cls.getMethod(e8, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(c2222b.f25187f);
                                        method.invoke(childAt, colorDrawable);
                                        break;
                                    case 4:
                                        hashSet2 = hashSet3;
                                        cls.getMethod(e8, CharSequence.class).invoke(childAt, c2222b.f25185d);
                                        break;
                                    case 5:
                                        hashSet2 = hashSet3;
                                        cls.getMethod(e8, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c2222b.f25186e));
                                        break;
                                    case 6:
                                        hashSet2 = hashSet3;
                                        try {
                                            cls.getMethod(e8, cls3).invoke(childAt, Float.valueOf(c2222b.f25184c));
                                        } catch (IllegalAccessException e9) {
                                            e = e9;
                                            StringBuilder r5 = AbstractC0953k1.r(" Custom Attribute \"", str3, "\" not found on ");
                                            r5.append(cls.getName());
                                            Log.e("TransitionLayout", r5.toString());
                                            e.printStackTrace();
                                            childCount = i13;
                                            hashSet3 = hashSet2;
                                        } catch (NoSuchMethodException e10) {
                                            e = e10;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + e8);
                                            childCount = i13;
                                            hashSet3 = hashSet2;
                                        } catch (InvocationTargetException e11) {
                                            e = e11;
                                            StringBuilder r7 = AbstractC0953k1.r(" Custom Attribute \"", str3, "\" not found on ");
                                            r7.append(cls.getName());
                                            Log.e("TransitionLayout", r7.toString());
                                            e.printStackTrace();
                                            childCount = i13;
                                            hashSet3 = hashSet2;
                                        }
                                    default:
                                        hashSet2 = hashSet3;
                                        break;
                                }
                            } catch (IllegalAccessException e12) {
                                e = e12;
                                hashSet2 = hashSet3;
                            } catch (NoSuchMethodException e13) {
                                e = e13;
                                hashSet2 = hashSet3;
                            } catch (InvocationTargetException e14) {
                                e = e14;
                                hashSet2 = hashSet3;
                            }
                            childCount = i13;
                            hashSet3 = hashSet2;
                        }
                        i9 = childCount;
                        hashSet = hashSet3;
                        childAt.setLayoutParams(c2225e);
                        C2230j c2230j = c2227g.f25261b;
                        if (c2230j.f25331b == 0) {
                            childAt.setVisibility(c2230j.f25330a);
                        }
                        childAt.setAlpha(c2230j.f25332c);
                        C2231k c2231k = c2227g.f25264e;
                        childAt.setRotation(c2231k.f25335a);
                        childAt.setRotationX(c2231k.f25336b);
                        childAt.setRotationY(c2231k.f25337c);
                        childAt.setScaleX(c2231k.f25338d);
                        childAt.setScaleY(c2231k.f25339e);
                        if (!Float.isNaN(c2231k.f25340f)) {
                            childAt.setPivotX(c2231k.f25340f);
                        }
                        if (!Float.isNaN(c2231k.f25341g)) {
                            childAt.setPivotY(c2231k.f25341g);
                        }
                        childAt.setTranslationX(c2231k.f25342h);
                        childAt.setTranslationY(c2231k.f25343i);
                        childAt.setTranslationZ(c2231k.j);
                        if (c2231k.f25344k) {
                            childAt.setElevation(c2231k.f25345l);
                        }
                    } else {
                        i9 = childCount;
                        hashSet = hashSet3;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i11++;
                    lVar = this;
                    childCount = i9;
                    hashSet3 = hashSet;
                    i10 = 1;
                }
            }
            i9 = childCount;
            hashSet = hashSet3;
            i11++;
            lVar = this;
            childCount = i9;
            hashSet3 = hashSet;
            i10 = 1;
        }
        Iterator it = hashSet3.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C2227g c2227g2 = (C2227g) hashMap.get(num);
            C2228h c2228h2 = c2227g2.f25263d;
            int i14 = c2228h2.f25296c0;
            if (i14 != -1 && i14 == 1) {
                Context context = constraintLayout.getContext();
                ?? view = new View(context);
                view.f25188a = new int[32];
                view.f25193f = new HashMap();
                view.f25190c = context;
                view.e(null);
                view.setVisibility(8);
                view.setId(num.intValue());
                int[] iArr2 = c2228h2.f25298d0;
                if (iArr2 != null) {
                    view.setReferencedIds(iArr2);
                } else {
                    String str4 = c2228h2.f25300e0;
                    if (str4 != null) {
                        int[] c9 = c(view, str4);
                        c2228h2.f25298d0 = c9;
                        view.setReferencedIds(c9);
                    }
                }
                view.setType(c2228h2.f25292a0);
                view.setMargin(c2228h2.f25294b0);
                C2225e a5 = ConstraintLayout.a();
                view.h();
                c2227g2.a(a5);
                constraintLayout.addView((View) view, a5);
            }
            if (c2228h2.f25291a) {
                n nVar = new n(constraintLayout.getContext());
                nVar.setId(num.intValue());
                C2225e a9 = ConstraintLayout.a();
                c2227g2.a(a9);
                constraintLayout.addView(nVar, a9);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        l lVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap = lVar.f25350c;
        hashMap.clear();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = constraintLayout.getChildAt(i9);
            C2225e c2225e = (C2225e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (lVar.f25349b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C2227g());
            }
            C2227g c2227g = (C2227g) hashMap.get(Integer.valueOf(id));
            HashMap hashMap2 = lVar.f25348a;
            HashMap hashMap3 = new HashMap();
            Class<?> cls = childAt.getClass();
            for (String str : hashMap2.keySet()) {
                C2222b c2222b = (C2222b) hashMap2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        hashMap3.put(str, new C2222b(c2222b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        hashMap3.put(str, new C2222b(c2222b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e8) {
                    e8.printStackTrace();
                } catch (NoSuchMethodException e9) {
                    e9.printStackTrace();
                } catch (InvocationTargetException e10) {
                    e10.printStackTrace();
                }
            }
            c2227g.f25265f = hashMap3;
            c2227g.f25260a = id;
            int i10 = c2225e.f25225d;
            C2228h c2228h = c2227g.f25263d;
            c2228h.f25303g = i10;
            c2228h.f25305h = c2225e.f25227e;
            c2228h.f25307i = c2225e.f25229f;
            c2228h.j = c2225e.f25231g;
            c2228h.f25309k = c2225e.f25233h;
            c2228h.f25310l = c2225e.f25235i;
            c2228h.f25311m = c2225e.j;
            c2228h.f25312n = c2225e.f25238k;
            c2228h.f25313o = c2225e.f25240l;
            c2228h.f25314p = c2225e.f25244p;
            c2228h.f25315q = c2225e.f25245q;
            c2228h.f25316r = c2225e.f25246r;
            c2228h.f25317s = c2225e.f25247s;
            c2228h.f25318t = c2225e.f25254z;
            c2228h.f25319u = c2225e.f25195A;
            c2228h.f25320v = c2225e.f25196B;
            c2228h.f25321w = c2225e.f25241m;
            c2228h.f25322x = c2225e.f25242n;
            c2228h.f25323y = c2225e.f25243o;
            c2228h.f25324z = c2225e.f25209P;
            c2228h.f25267A = c2225e.f25210Q;
            c2228h.f25268B = c2225e.f25211R;
            c2228h.f25301f = c2225e.f25223c;
            c2228h.f25297d = c2225e.f25219a;
            c2228h.f25299e = c2225e.f25221b;
            c2228h.f25293b = ((ViewGroup.MarginLayoutParams) c2225e).width;
            c2228h.f25295c = ((ViewGroup.MarginLayoutParams) c2225e).height;
            c2228h.f25269C = ((ViewGroup.MarginLayoutParams) c2225e).leftMargin;
            c2228h.f25270D = ((ViewGroup.MarginLayoutParams) c2225e).rightMargin;
            c2228h.f25271E = ((ViewGroup.MarginLayoutParams) c2225e).topMargin;
            c2228h.f25272F = ((ViewGroup.MarginLayoutParams) c2225e).bottomMargin;
            c2228h.f25280O = c2225e.f25199E;
            c2228h.f25281P = c2225e.f25198D;
            c2228h.f25283R = c2225e.f25201G;
            c2228h.f25282Q = c2225e.f25200F;
            c2228h.f25304g0 = c2225e.f25212S;
            c2228h.f25306h0 = c2225e.f25213T;
            c2228h.f25284S = c2225e.f25202H;
            c2228h.f25285T = c2225e.f25203I;
            c2228h.f25286U = c2225e.f25205L;
            c2228h.f25287V = c2225e.f25206M;
            c2228h.f25288W = c2225e.f25204J;
            c2228h.f25289X = c2225e.K;
            c2228h.Y = c2225e.f25207N;
            c2228h.f25290Z = c2225e.f25208O;
            c2228h.f25302f0 = c2225e.f25214U;
            c2228h.f25276J = c2225e.f25249u;
            c2228h.f25277L = c2225e.f25251w;
            c2228h.f25275I = c2225e.f25248t;
            c2228h.K = c2225e.f25250v;
            c2228h.f25279N = c2225e.f25252x;
            c2228h.f25278M = c2225e.f25253y;
            c2228h.f25273G = c2225e.getMarginEnd();
            c2228h.f25274H = c2225e.getMarginStart();
            int visibility = childAt.getVisibility();
            C2230j c2230j = c2227g.f25261b;
            c2230j.f25330a = visibility;
            c2230j.f25332c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            C2231k c2231k = c2227g.f25264e;
            c2231k.f25335a = rotation;
            c2231k.f25336b = childAt.getRotationX();
            c2231k.f25337c = childAt.getRotationY();
            c2231k.f25338d = childAt.getScaleX();
            c2231k.f25339e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                c2231k.f25340f = pivotX;
                c2231k.f25341g = pivotY;
            }
            c2231k.f25342h = childAt.getTranslationX();
            c2231k.f25343i = childAt.getTranslationY();
            c2231k.j = childAt.getTranslationZ();
            if (c2231k.f25344k) {
                c2231k.f25345l = childAt.getElevation();
            }
            if (childAt instanceof C2221a) {
                C2221a c2221a = (C2221a) childAt;
                c2228h.f25308i0 = c2221a.f25181i.f24320g0;
                c2228h.f25298d0 = c2221a.getReferencedIds();
                c2228h.f25292a0 = c2221a.getType();
                c2228h.f25294b0 = c2221a.getMargin();
            }
            i9++;
            lVar = this;
        }
    }

    public final void e(Context context, int i9) {
        XmlResourceParser xml = context.getResources().getXml(i9);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        C2227g d9 = d(context, Xml.asAttributeSet(xml));
                        if (name.equalsIgnoreCase("Guideline")) {
                            d9.f25263d.f25291a = true;
                        }
                        this.f25350c.put(Integer.valueOf(d9.f25260a), d9);
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e8) {
            e8.printStackTrace();
        } catch (XmlPullParserException e9) {
            e9.printStackTrace();
        }
    }
}
