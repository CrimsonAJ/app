package b5;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public final class V extends AbstractC0674x0 {

    /* renamed from: c, reason: collision with root package name */
    public char f10968c;

    /* renamed from: d, reason: collision with root package name */
    public long f10969d;

    /* renamed from: e, reason: collision with root package name */
    public String f10970e;

    /* renamed from: f, reason: collision with root package name */
    public final T f10971f;

    /* renamed from: g, reason: collision with root package name */
    public final T f10972g;

    /* renamed from: h, reason: collision with root package name */
    public final T f10973h;

    /* renamed from: i, reason: collision with root package name */
    public final T f10974i;
    public final T j;

    /* renamed from: k, reason: collision with root package name */
    public final T f10975k;

    /* renamed from: l, reason: collision with root package name */
    public final T f10976l;

    /* renamed from: m, reason: collision with root package name */
    public final T f10977m;

    /* renamed from: n, reason: collision with root package name */
    public final T f10978n;

    public V(C0650n0 c0650n0) {
        super(c0650n0);
        this.f10968c = (char) 0;
        this.f10969d = -1L;
        this.f10971f = new T(this, 6, false, false);
        this.f10972g = new T(this, 6, true, false);
        this.f10973h = new T(this, 6, false, true);
        this.f10974i = new T(this, 5, false, false);
        this.j = new T(this, 5, true, false);
        this.f10975k = new T(this, 5, false, true);
        this.f10976l = new T(this, 4, false, false);
        this.f10977m = new T(this, 3, false, false);
        this.f10978n = new T(this, 2, false, false);
    }

    public static U t0(String str) {
        if (str == null) {
            return null;
        }
        return new U(str);
    }

    public static String u0(boolean z9, String str, Object obj, Object obj2, Object obj3) {
        String v02 = v0(obj, z9);
        String v03 = v0(obj2, z9);
        String v04 = v0(obj3, z9);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(v02)) {
            sb.append(str2);
            sb.append(v02);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(v03)) {
            sb.append(str2);
            sb.append(v03);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(v04)) {
            sb.append(str3);
            sb.append(v04);
        }
        return sb.toString();
    }

    public static String v0(Object obj, boolean z9) {
        String th;
        int lastIndexOf;
        String substring;
        String className;
        int lastIndexOf2;
        String substring2;
        String str = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z9) {
                return obj.toString();
            }
            Long l9 = (Long) obj;
            if (Math.abs(l9.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l9.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder();
            if (charAt == '-') {
                str = "-";
            }
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            if (z9) {
                th = th2.getClass().getName();
            } else {
                th = th2.toString();
            }
            StringBuilder sb2 = new StringBuilder(th);
            String canonicalName = C0650n0.class.getCanonicalName();
            if (TextUtils.isEmpty(canonicalName) || (lastIndexOf = canonicalName.lastIndexOf(46)) == -1) {
                substring = "";
            } else {
                substring = canonicalName.substring(0, lastIndexOf);
            }
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i9];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                    if (TextUtils.isEmpty(className) || (lastIndexOf2 = className.lastIndexOf(46)) == -1) {
                        substring2 = "";
                    } else {
                        substring2 = className.substring(0, lastIndexOf2);
                    }
                    if (substring2.equals(substring)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                }
                i9++;
            }
            return sb2.toString();
        }
        if (obj instanceof U) {
            return ((U) obj).f10967a;
        }
        if (z9) {
            return "-";
        }
        return obj.toString();
    }

    @Override // b5.AbstractC0674x0
    public final boolean m0() {
        return false;
    }

    public final T p0() {
        return this.f10977m;
    }

    public final T q0() {
        return this.f10971f;
    }

    public final T r0() {
        return this.f10978n;
    }

    public final T s0() {
        return this.f10974i;
    }

    public final String w0() {
        String str;
        synchronized (this) {
            try {
                if (this.f10970e == null) {
                    C0650n0 c0650n0 = (C0650n0) this.f1707a;
                    String str2 = c0650n0.f11224d;
                    if (str2 != null) {
                        this.f10970e = str2;
                    } else {
                        ((C0650n0) c0650n0.f11227g.f1707a).getClass();
                        this.f10970e = "FA";
                    }
                }
                F4.y.h(this.f10970e);
                str = this.f10970e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final void x0(int i9, boolean z9, boolean z10, String str, Object obj, Object obj2, Object obj3) {
        if (!z9 && Log.isLoggable(w0(), i9)) {
            Log.println(i9, w0(), u0(false, str, obj, obj2, obj3));
        }
        if (!z10 && i9 >= 5) {
            F4.y.h(str);
            C0647m0 c0647m0 = ((C0650n0) this.f1707a).j;
            if (c0647m0 == null) {
                Log.println(6, w0(), "Scheduler not set. Not logging error/warn");
            } else {
                if (!c0647m0.f11344b) {
                    Log.println(6, w0(), "Scheduler not initialized. Not logging error/warn");
                    return;
                }
                if (i9 >= 9) {
                    i9 = 8;
                }
                c0647m0.v0(new S(this, i9, str, obj, obj2, obj3));
            }
        }
    }
}
