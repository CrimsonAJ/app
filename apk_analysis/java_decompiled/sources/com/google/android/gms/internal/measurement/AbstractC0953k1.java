package com.google.android.gms.internal.measurement;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import co.notix.R;
import com.google.crypto.tink.shaded.protobuf.C1040k;
import i0.AbstractC1336M;
import i0.AbstractComponentCallbacksC1366v;
import l4.AbstractC1566a;
import w.AbstractC2128h;

/* renamed from: com.google.android.gms.internal.measurement.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0953k1 {
    public static /* synthetic */ String A(int i9) {
        switch (i9) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String B(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String C(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static /* synthetic */ String D(int i9) {
        switch (i9) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case R.styleable.GradientColor_android_endX /* 10 */:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static void a(q3.u uVar, A4.r rVar, int i9) {
        uVar.b(i9, rVar);
    }

    public static final void b(View view, int i9) {
        ViewGroup viewGroup;
        kotlin.jvm.internal.h.e(view, "view");
        int b9 = AbstractC2128h.b(i9);
        if (b9 != 0) {
            if (b9 != 1) {
                if (b9 != 2) {
                    if (b9 == 3) {
                        if (AbstractC1336M.H(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (AbstractC1336M.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            }
            if (AbstractC1336M.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            if (AbstractC1336M.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
            }
            viewGroup.removeView(view);
        }
    }

    public static final boolean c(int i9) {
        if (i9 != 3 && i9 != 4 && i9 != 6) {
            return false;
        }
        return true;
    }

    public static int d(int i9) {
        switch (i9) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i9) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case 22:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static int e(int i9, int i10, int i11) {
        return i9 | i10 | i11 | 128;
    }

    public static /* synthetic */ int f(int i9) {
        switch (i9) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case R.styleable.GradientColor_android_endX /* 10 */:
                return 20;
            case R.styleable.GradientColor_android_endY /* 11 */:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static int g(int i9, int i10, int i11) {
        return U1.S(i9) + i10 + i11;
    }

    public static int h(int i9, int i10, int i11, int i12) {
        return U1.S(i9) + i10 + i11 + i12;
    }

    public static ClassCastException i(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String j(int i9, String str) {
        return str + i9;
    }

    public static String k(long j, String str) {
        return str + j;
    }

    public static String l(Class cls, StringBuilder sb) {
        sb.append(cls.getCanonicalName());
        return sb.toString();
    }

    public static String m(String str, AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v, String str2) {
        return str + abstractComponentCallbacksC1366v + str2;
    }

    public static String n(String str, String str2) {
        return str + str2;
    }

    public static String o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String p(StringBuilder sb, String str, char c3) {
        sb.append(str);
        sb.append(c3);
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder r(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ void s(int i9) {
        if (i9 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        kotlin.jvm.internal.h.g(nullPointerException, kotlin.jvm.internal.h.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ void t(int i9, String str) {
        if (i9 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = kotlin.jvm.internal.h.class.getName();
            int i10 = 0;
            while (!stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            while (stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            kotlin.jvm.internal.h.g(nullPointerException, kotlin.jvm.internal.h.class.getName());
            throw nullPointerException;
        }
    }

    public static void u(j3.L l9, q3.u uVar) {
        uVar.e(new j3.M(l9));
    }

    public static void v(String str, int i9, String str2) {
        AbstractC1566a.P(str2, str + i9);
    }

    public static int w(int i9, int i10, int i11) {
        return C1040k.Y(i9) + i10 + i11;
    }

    public static int x(int i9, int i10, int i11, int i12) {
        return C1040k.Z(i9) + i10 + i11 + i12;
    }

    public static /* synthetic */ String y(int i9) {
        switch (i9) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case R.styleable.GradientColor_android_endX /* 10 */:
                return "SERVICE_FLAG_OFF";
            case R.styleable.GradientColor_android_endY /* 11 */:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String z(int i9) {
        switch (i9) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }
}
