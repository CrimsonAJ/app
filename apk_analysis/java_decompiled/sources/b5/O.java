package b5;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import o1.C1671f;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f10821b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f10822c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReference f10823d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final C1671f f10824a;

    public O(C1671f c1671f) {
        this.f10824a = c1671f;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z9;
        String str2;
        F4.y.h(atomicReference);
        if (strArr.length == strArr2.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        F4.y.b(z9);
        for (int i9 = 0; i9 < strArr.length; i9++) {
            if (Objects.equals(str, strArr[i9])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i9];
                        if (str2 == null) {
                            str2 = strArr2[i9] + "(" + strArr[i9] + ")";
                            strArr3[i9] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = b((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(valueOf);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final String b(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f10824a.M()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(e(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = a(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb.append(valueOf);
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String c(C0665t c0665t) {
        String b9;
        C1671f c1671f = this.f10824a;
        if (!c1671f.M()) {
            return c0665t.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(c0665t.f11311c);
        sb.append(",name=");
        sb.append(d(c0665t.f11309a));
        sb.append(",params=");
        C0663s c0663s = c0665t.f11310b;
        if (c0663s == null) {
            b9 = null;
        } else if (!c1671f.M()) {
            b9 = c0663s.f11300a.toString();
        } else {
            b9 = b(c0663s.f());
        }
        sb.append(b9);
        return sb.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f10824a.M()) {
            return str;
        }
        return g(str, D0.f10576c, D0.f10574a, f10821b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f10824a.M()) {
            return str;
        }
        return g(str, D0.f10579f, D0.f10578e, f10822c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f10824a.M()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return A0.a.n("experiment_id(", str, ")");
        }
        return g(str, D0.j, D0.f10582i, f10823d);
    }
}
