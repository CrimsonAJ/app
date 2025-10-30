package Z0;

import A1.g;
import A7.f;
import A7.l;
import A7.m;
import A7.n;
import B6.u0;
import C4.k;
import D4.t;
import G2.q;
import a.AbstractC0485a;
import android.animation.TimeInterpolator;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.lifecycle.h0;
import b6.C0693o;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.gms.internal.measurement.T1;
import com.google.firebase.messaging.s;
import i0.AbstractComponentCallbacksC1366v;
import i8.P;
import java.io.Serializable;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import k4.C1499E;
import k4.C1516p;
import k4.C1521v;
import kotlin.jvm.internal.h;
import l4.y;
import u7.C2089e;
import u7.InterfaceC2086b;
import v2.AbstractC2103c;
import v2.C2101a;
import v2.C2102b;
import v4.e;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8906a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8907b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8908c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f8909d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f8910e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f8911f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f8912g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f8913h = 0;

    public static final long A(int i9, X7.c unit) {
        h.e(unit, "unit");
        if (unit.compareTo(X7.c.SECONDS) <= 0) {
            long g9 = AbstractC0485a.g(i9, unit, X7.c.NANOSECONDS) << 1;
            int i10 = X7.a.f8474d;
            int i11 = X7.b.f8476a;
            return g9;
        }
        return B(i9, unit);
    }

    public static final long B(long j, X7.c unit) {
        h.e(unit, "unit");
        X7.c cVar = X7.c.NANOSECONDS;
        long g9 = AbstractC0485a.g(4611686018426999999L, cVar, unit);
        if ((-g9) <= j && j <= g9) {
            long g10 = AbstractC0485a.g(j, unit, cVar) << 1;
            int i9 = X7.a.f8474d;
            int i10 = X7.b.f8476a;
            return g10;
        }
        X7.c targetUnit = X7.c.MILLISECONDS;
        h.e(targetUnit, "targetUnit");
        return f(u0.l(targetUnit.f8484a.convert(j, unit.f8484a), -4611686018427387903L, 4611686018427387903L));
    }

    public static String D(T1 t12) {
        StringBuilder sb = new StringBuilder(t12.d());
        for (int i9 = 0; i9 < t12.d(); i9++) {
            byte b9 = t12.b(i9);
            if (b9 != 34) {
                if (b9 != 39) {
                    if (b9 != 92) {
                        switch (b9) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case R.styleable.GradientColor_android_endX /* 10 */:
                                sb.append("\\n");
                                break;
                            case R.styleable.GradientColor_android_endY /* 11 */:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (b9 >= 32 && b9 <= 126) {
                                    sb.append((char) b9);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((b9 >>> 6) & 3) + 48));
                                    sb.append((char) (((b9 >>> 3) & 7) + 48));
                                    sb.append((char) ((b9 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static final Bundle c(A7.h... hVarArr) {
        Bundle bundle = new Bundle(hVarArr.length);
        for (A7.h hVar : hVarArr) {
            String str = (String) hVar.f547a;
            Object obj = hVar.f548b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                h.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else if (obj instanceof SizeF) {
                bundle.putSizeF(str, (SizeF) obj);
            } else {
                throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static final long e() {
        return Thread.currentThread().getId();
    }

    public static final long f(long j) {
        long j4 = (j << 1) + 1;
        int i9 = X7.a.f8474d;
        int i10 = X7.b.f8476a;
        return j4;
    }

    public static P g(String javaName) {
        h.e(javaName, "javaName");
        int hashCode = javaName.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return P.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return P.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return P.TLS_1_3;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return P.TLS_1_0;
            }
        } else if (javaName.equals("SSLv3")) {
            return P.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }

    public static Application h(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }

    public static C2089e i(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v, h0 h0Var) {
        C1499E a5 = ((I1.h) ((InterfaceC2086b) e.p(InterfaceC2086b.class, abstractComponentCallbacksC1366v))).f3288a.a();
        h0Var.getClass();
        return new C2089e((C1521v) a5.f19985b, h0Var, (g) a5.f19986c);
    }

    public static C1516p j(int i9) {
        int i10 = y.f20553a;
        Locale locale = Locale.US;
        return new C1516p(Uri.parse("rtp://0.0.0.0:" + i9));
    }

    public static float k(int i9, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i9]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final Object l(AbstractC2103c abstractC2103c) {
        h.e(abstractC2103c, "<this>");
        if (abstractC2103c instanceof C2102b) {
            return n.f558a;
        }
        if (abstractC2103c instanceof C2101a) {
            return AbstractC0485a.h(((C2101a) abstractC2103c).f23761a);
        }
        throw new RuntimeException();
    }

    public static final Serializable m(AbstractC2103c abstractC2103c) {
        h.e(abstractC2103c, "<this>");
        if (abstractC2103c instanceof C2102b) {
            return Boolean.TRUE;
        }
        if (abstractC2103c instanceof C2101a) {
            return AbstractC0485a.h(((C2101a) abstractC2103c).f23761a);
        }
        throw new RuntimeException();
    }

    public static final Object n(AbstractC2103c abstractC2103c, q mapper) {
        h.e(abstractC2103c, "<this>");
        h.e(mapper, "mapper");
        if (abstractC2103c instanceof C2102b) {
            return mapper.n(((C2102b) abstractC2103c).f23762a);
        }
        if (abstractC2103c instanceof C2101a) {
            return AbstractC0485a.h(((C2101a) abstractC2103c).f23761a);
        }
        throw new RuntimeException();
    }

    public static boolean o(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [A7.e, java.lang.Object, A7.k] */
    /* JADX WARN: Type inference failed for: r2v5, types: [A7.e, A7.o, java.lang.Object] */
    public static A7.e p(f fVar, O7.a aVar) {
        int ordinal = fVar.ordinal();
        if (ordinal != 0) {
            m mVar = m.f557a;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    ?? obj = new Object();
                    obj.f559a = aVar;
                    obj.f560b = mVar;
                    return obj;
                }
                throw new RuntimeException();
            }
            ?? obj2 = new Object();
            obj2.f552a = aVar;
            obj2.f553b = mVar;
            return obj2;
        }
        return new l(aVar);
    }

    public static l q(O7.a initializer) {
        h.e(initializer, "initializer");
        return new l(initializer);
    }

    public static String r(String str, Object... objArr) {
        int indexOf;
        String str2;
        String sb;
        int i9 = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e8) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb3);
                    if (valueOf.length() != 0) {
                        str2 = "Exception during lenientFormat for ".concat(valueOf);
                    } else {
                        str2 = new String("Exception during lenientFormat for ");
                    }
                    logger.log(level, str2, (Throwable) e8);
                    String name2 = e8.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(name2.length() + String.valueOf(sb3).length() + 9);
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i10] = sb;
        }
        StringBuilder sb5 = new StringBuilder((objArr.length * 16) + str.length());
        int i11 = 0;
        while (i9 < objArr.length && (indexOf = str.indexOf("%s", i11)) != -1) {
            sb5.append((CharSequence) str, i11, indexOf);
            sb5.append(objArr[i9]);
            i11 = indexOf + 2;
            i9++;
        }
        sb5.append((CharSequence) str, i11, str.length());
        if (i9 < objArr.length) {
            sb5.append(" [");
            sb5.append(objArr[i9]);
            for (int i12 = i9 + 1; i12 < objArr.length; i12++) {
                sb5.append(", ");
                sb5.append(objArr[i12]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    public static final boolean u(String method) {
        h.e(method, "method");
        if (!method.equals("GET") && !method.equals("HEAD")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01f1, code lost:
    
        r0 = O4.h.e(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01f5, code lost:
    
        com.google.android.gms.internal.measurement.AbstractC1002u1.k(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static M0.e v(P0.a r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.a.v(P0.a, java.lang.String):M0.e");
    }

    public static void w(Y3.a aVar) {
        aVar.f8670k = -3.4028235E38f;
        aVar.j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.f8661a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.f8661a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = aVar.f8661a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float x(float f9, int i9, int i10, int i11) {
        float f10;
        if (f9 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    return -3.4028235E38f;
                }
                return f9;
            }
            f10 = i10;
        } else {
            f10 = i11;
        }
        return f9 * f10;
    }

    public static int y(Context context, int i9, int i10) {
        TypedValue X8 = AbstractC1002u1.X(context, i9);
        if (X8 != null && X8.type == 16) {
            return X8.data;
        }
        return i10;
    }

    public static TimeInterpolator z(Context context, int i9, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i9, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!o(valueOf, "cubic-bezier") && !o(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (o(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return new PathInterpolator(k(0, split), k(1, split), k(2, split), k(3, split));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            }
            if (o(valueOf, "path")) {
                return new PathInterpolator(u0.t(valueOf.substring(5, valueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    public abstract void C(byte[] bArr, int i9, int i10);

    public C4.c a(Context context, Looper looper, C0693o c0693o, Object obj, k kVar, C4.l lVar) {
        return b(context, looper, c0693o, obj, (t) kVar, (t) lVar);
    }

    public C4.c b(Context context, Looper looper, C0693o c0693o, Object obj, t tVar, t tVar2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract void s(Throwable th);

    public abstract void t(s sVar);
}
