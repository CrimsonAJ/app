package com.google.android.gms.internal.cast;

import android.os.Bundle;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: b, reason: collision with root package name */
    public static final B4.d[] f14729b = {new B4.d("usage_and_diagnostics_listener"), new B4.d("usage_and_diagnostics_consents"), new B4.d("usage_and_diagnostics_check_consents"), new B4.d("usage_and_diagnostics_settings_access"), new B4.d("el_capitan")};

    /* renamed from: c, reason: collision with root package name */
    public static final A1.g f14730c = new A1.g("UsageReporting.API", new H4.b(3), (C4.d) new Object());

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14731a;

    public /* synthetic */ J(int i9) {
        this.f14731a = i9;
    }

    public static int b(int i9) {
        return (int) (Integer.rotateLeft((int) (i9 * (-862048943)), 15) * 461845907);
    }

    public static int c(int i9, int i10) {
        if (i10 >= 0) {
            if (i10 <= i9) {
                return i9;
            }
            int i11 = i9 + (i9 >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                return Integer.MAX_VALUE;
            }
            return i11;
        }
        throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
    }

    public static String e(I2 i22) {
        StringBuilder sb = new StringBuilder(i22.d());
        for (int i9 = 0; i9 < i22.d(); i9++) {
            byte b9 = i22.b(i9);
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

    public static String f(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            char charAt = str.charAt(i9);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i9 < length) {
                    char c3 = charArray[i9];
                    if (c3 >= 'a' && c3 <= 'z') {
                        charArray[i9] = (char) (c3 ^ ' ');
                    }
                    i9++;
                }
                return String.valueOf(charArray);
            }
            i9++;
        }
        return str;
    }

    public static String g(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e8) {
                    String o9 = AbstractC0953k1.o(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(o9), (Throwable) e8);
                    str2 = "<" + o9 + " threw " + e8.getClass().getName() + ">";
                }
            }
            objArr[i10] = str2;
            i10++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i9 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i11, indexOf);
            sb.append(objArr[i9]);
            i9++;
            i11 = indexOf + 2;
        }
        sb.append((CharSequence) str, i11, str.length());
        if (i9 < length2) {
            sb.append(" [");
            sb.append(objArr[i9]);
            for (int i12 = i9 + 1; i12 < objArr.length; i12++) {
                sb.append(", ");
                sb.append(objArr[i12]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static Map h(String str, Bundle bundle) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return C0843l0.f14903g;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                hashMap.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public static void i(int i9, int i10) {
        String g9;
        if (i9 >= 0 && i9 < i10) {
            return;
        }
        if (i9 >= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException(AbstractC0953k1.j(i10, "negative size: "));
            }
            g9 = g("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i9), Integer.valueOf(i10));
        } else {
            g9 = g("%s (%s) must not be negative", "index", Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(g9);
    }

    public static /* synthetic */ boolean j(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AbstractC0868r2 abstractC0868r2, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC0868r2, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(abstractC0868r2) != obj && atomicReferenceFieldUpdater.get(abstractC0868r2) != obj) {
                return false;
            }
        }
        return true;
    }

    public static void l(int i9, int i10) {
        if (i9 >= 0 && i9 <= i10) {
        } else {
            throw new IndexOutOfBoundsException(p("index", i9, i10));
        }
    }

    public static void n(int i9, int i10, int i11) {
        String p9;
        if (i9 >= 0 && i10 >= i9 && i10 <= i11) {
            return;
        }
        if (i9 >= 0 && i9 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                p9 = g("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9));
            } else {
                p9 = p("end index", i10, i11);
            }
        } else {
            p9 = p("start index", i9, i11);
        }
        throw new IndexOutOfBoundsException(p9);
    }

    public static String p(String str, int i9, int i10) {
        if (i9 < 0) {
            return g("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return g("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(AbstractC0953k1.j(i10, "negative size: "));
    }

    public abstract C0845l2 d(AbstractC0849m2 abstractC0849m2);

    public abstract C0865q2 k(AbstractC0849m2 abstractC0849m2);

    public abstract void m(C0865q2 c0865q2, C0865q2 c0865q22);

    public abstract void o(C0865q2 c0865q2, Thread thread);

    public abstract boolean q(AbstractC0849m2 abstractC0849m2, C0845l2 c0845l2, C0845l2 c0845l22);

    public abstract boolean r(AbstractC0868r2 abstractC0868r2, Object obj, Object obj2);

    public abstract boolean s(AbstractC0868r2 abstractC0868r2, C0865q2 c0865q2, C0865q2 c0865q22);

    public String toString() {
        switch (this.f14731a) {
            case 6:
                return ((ScheduledFutureC0900z2) this).f15172d.toString();
            default:
                return super.toString();
        }
    }
}
