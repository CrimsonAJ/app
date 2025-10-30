package s8;

import A3.E;
import F4.y;
import a.AbstractC0485a;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
import co.notix.R;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.L;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.u;
import f4.C1168f;
import f5.C1185q;
import i0.AbstractActivityC1369y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import l6.C1574f;
import org.xmlpull.v1.XmlPullParserException;
import q4.AbstractC1912a;
import r4.C1927b;
import u0.T;

/* loaded from: classes.dex */
public abstract class e implements S.g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22791a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f22792b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f22793c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f22794d = 0;

    public static int A(Context context) {
        if (H.a.c(-1, G(context, R.attr.colorPrimary)) >= 3.0d) {
            return -1;
        }
        return -570425344;
    }

    public static float B(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable C(Context context, int i9) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i9});
        Drawable q9 = AbstractC0485a.q(context, obtainStyledAttributes.getResourceId(0, 0));
        if (K(context)) {
            q9.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        obtainStyledAttributes.recycle();
        return q9;
    }

    public static final FirebaseMessaging D() {
        FirebaseMessaging firebaseMessaging;
        u uVar = FirebaseMessaging.f16440l;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(C1574f.c());
        }
        kotlin.jvm.internal.h.d(firebaseMessaging, "getInstance()");
        return firebaseMessaging;
    }

    public static int E(Context context) {
        if (K(context)) {
            if (A(context) == -570425344) {
                return R.style.Theme_MediaRouter_Light;
            }
            return R.style.Theme_MediaRouter_Light_DarkControlPanel;
        }
        if (A(context) == -570425344) {
            return R.style.Theme_MediaRouter_LightControlPanel;
        }
        return R.style.Theme_MediaRouter;
    }

    public static C1185q F(Intent intent) {
        C1927b c1927b;
        GoogleSignInAccount googleSignInAccount;
        E e8 = s4.h.f22732a;
        Status status = Status.f14657g;
        if (intent == null) {
            c1927b = new C1927b(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount googleSignInAccount2 = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
            if (googleSignInAccount2 == null) {
                if (status2 != null) {
                    status = status2;
                }
                c1927b = new C1927b(null, status);
            } else {
                c1927b = new C1927b(googleSignInAccount2, Status.f14655e);
            }
        }
        Status status3 = c1927b.f22629a;
        if (status3.f() && (googleSignInAccount = c1927b.f22630b) != null) {
            return n.p(googleSignInAccount);
        }
        return n.o(y.l(status3));
    }

    public static int G(Context context, int i9) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i9, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    public static int H(Context context, int i9) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i9, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static boolean K(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i8.C1418h M(i8.w r26) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.e.M(i8.w):i8.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x003e, code lost:
    
        if (r3 != 1918990112) goto L4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [n4.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList N(A4.r r30) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.e.N(A4.r):java.util.ArrayList");
    }

    public static boolean P(Parcel parcel, int i9) {
        k0(parcel, i9, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static Boolean Q(Parcel parcel, int i9) {
        boolean z9;
        int V8 = V(parcel, i9);
        if (V8 == 0) {
            return null;
        }
        i0(parcel, V8, 4);
        if (parcel.readInt() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    public static double R(Parcel parcel, int i9) {
        k0(parcel, i9, 8);
        return parcel.readDouble();
    }

    public static IBinder S(Parcel parcel, int i9) {
        int V8 = V(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (V8 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + V8);
        return readStrongBinder;
    }

    public static int T(Parcel parcel, int i9) {
        k0(parcel, i9, 4);
        return parcel.readInt();
    }

    public static long U(Parcel parcel, int i9) {
        k0(parcel, i9, 8);
        return parcel.readLong();
    }

    public static int V(Parcel parcel, int i9) {
        if ((i9 & (-65536)) != -65536) {
            return (char) (i9 >> 16);
        }
        return parcel.readInt();
    }

    public static final void W(Object[] objArr, int i9, int i10) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        while (i9 < i10) {
            objArr[i9] = null;
            i9++;
        }
    }

    public static C1168f X(C1168f c1168f, String[] strArr, Map map) {
        int i9 = 0;
        if (c1168f == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C1168f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C1168f c1168f2 = new C1168f();
                int length = strArr.length;
                while (i9 < length) {
                    c1168f2.a((C1168f) map.get(strArr[i9]));
                    i9++;
                }
                return c1168f2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c1168f.a((C1168f) map.get(strArr[0]));
                return c1168f;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i9 < length2) {
                    c1168f.a((C1168f) map.get(strArr[i9]));
                    i9++;
                }
            }
        }
        return c1168f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.util.List r6, X.C0411k r7, G7.c r8) {
        /*
            boolean r0 = r8 instanceof X.C0405e
            if (r0 == 0) goto L13
            r0 = r8
            X.e r0 = (X.C0405e) r0
            int r1 = r0.f8062u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8062u = r1
            goto L18
        L13:
            X.e r0 = new X.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f8061t
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f8062u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f8060s
            java.io.Serializable r7 = r0.f8059r
            kotlin.jvm.internal.o r7 = (kotlin.jvm.internal.o) r7
            a.AbstractC0485a.A(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f8059r
            java.util.List r6 = (java.util.List) r6
            a.AbstractC0485a.A(r8)
            goto L5c
        L42:
            a.AbstractC0485a.A(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            X.g r2 = new X.g
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f8059r = r8
            r0.f8062u = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            kotlin.jvm.internal.o r7 = new kotlin.jvm.internal.o
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            O7.l r8 = (O7.l) r8
            r0.f8059r = r7     // Catch: java.lang.Throwable -> L30
            r0.f8060s = r6     // Catch: java.lang.Throwable -> L30
            r0.f8062u = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L65
            goto L93
        L7e:
            java.lang.Object r2 = r7.f20159a
            if (r2 != 0) goto L85
            r7.f20159a = r8
            goto L65
        L85:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            O4.h.a(r2, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.f20159a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            A7.n r1 = A7.n.f558a
        L93:
            return r1
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.e.a(java.util.List, X.k, G7.c):java.lang.Object");
    }

    public static void a0(Context context, ProgressBar progressBar) {
        int i9;
        if (!progressBar.isIndeterminate()) {
            return;
        }
        if (K(context)) {
            i9 = R.color.mr_cast_progressbar_progress_and_thumb_light;
        } else {
            i9 = R.color.mr_cast_progressbar_progress_and_thumb_dark;
        }
        progressBar.getIndeterminateDrawable().setColorFilter(context.getColor(i9), PorterDuff.Mode.SRC_IN);
    }

    public static final boolean b(Object[] objArr, int i9, int i10, List list) {
        if (i10 == list.size()) {
            for (int i11 = 0; i11 < i10; i11++) {
                if (kotlin.jvm.internal.h.a(objArr[i9 + i11], list.get(i11))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String c(Object[] objArr, int i9, int i10, B7.f fVar) {
        StringBuilder sb = new StringBuilder((i10 * 3) + 2);
        sb.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i9 + i11];
            if (obj == fVar) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }

    public static void c0(Drawable drawable, int i9) {
        drawable.setTint(i9);
    }

    public static void d(String str, boolean z9) {
        if (z9) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void e(int i9) {
        if (i9 >= 0) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void e0(Parcel parcel, int i9) {
        parcel.setDataPosition(parcel.dataPosition() + V(parcel, i9));
    }

    public static T f(TypedValue typedValue, T t7, T t9, String str, String str2) {
        if (t7 != null && t7 != t9) {
            throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
        }
        if (t7 == null) {
            return t9;
        }
        return t7;
    }

    public static int f0(Parcel parcel) {
        int readInt = parcel.readInt();
        int V8 = V(parcel, readInt);
        char c3 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c3 == 20293) {
            int i9 = V8 + dataPosition;
            if (i9 >= dataPosition && i9 <= parcel.dataSize()) {
                return i9;
            }
            throw new G4.b(A0.a.l("Size read is invalid start=", dataPosition, i9, " end="), parcel);
        }
        throw new G4.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static int g0(int i9) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 != 0) {
                if (i12 == i9) {
                    return i11;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }

    public static void h(boolean z9, String str, Object... objArr) {
        if (z9) {
        } else {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static String h0(Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                str = "null";
            } else {
                try {
                    str = obj.toString();
                } catch (Exception e8) {
                    String o9 = AbstractC0953k1.o(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(o9), (Throwable) e8);
                    str = "<" + o9 + " threw " + e8.getClass().getName() + ">";
                }
            }
            objArr[i10] = str;
            i10++;
        }
        StringBuilder sb = new StringBuilder((length * 16) + 29);
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i9 >= length2 || (indexOf = "expected a non-null reference".indexOf("%s", i11)) == -1) {
                break;
            }
            sb.append((CharSequence) "expected a non-null reference", i11, indexOf);
            sb.append(objArr[i9]);
            i9++;
            i11 = indexOf + 2;
        }
        sb.append((CharSequence) "expected a non-null reference", i11, 29);
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

    public static Bundle i(Parcel parcel, int i9) {
        int V8 = V(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (V8 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + V8);
        return readBundle;
    }

    public static void i0(Parcel parcel, int i9, int i10) {
        if (i9 == i10) {
            return;
        }
        String hexString = Integer.toHexString(i9);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i10);
        sb.append(" got ");
        sb.append(i9);
        sb.append(" (0x");
        throw new G4.b(AbstractC0953k1.q(sb, hexString, ")"), parcel);
    }

    public static byte[] j(Parcel parcel, int i9) {
        int V8 = V(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (V8 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + V8);
        return createByteArray;
    }

    public static int j0(int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == 1) {
            return 2;
        }
        if (i9 == 2) {
            return 3;
        }
        if (i9 == 3) {
            return 4;
        }
        if (i9 != 4) {
            return 0;
        }
        return 5;
    }

    public static int[] k(Parcel parcel, int i9) {
        int V8 = V(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (V8 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + V8);
        return createIntArray;
    }

    public static void k0(Parcel parcel, int i9, int i10) {
        int V8 = V(parcel, i9);
        if (V8 == i10) {
            return;
        }
        String hexString = Integer.toHexString(V8);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i10);
        sb.append(" got ");
        sb.append(V8);
        sb.append(" (0x");
        throw new G4.b(AbstractC0953k1.q(sb, hexString, ")"), parcel);
    }

    public static ArrayList l(Parcel parcel, int i9) {
        int V8 = V(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (V8 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + V8);
        return arrayList;
    }

    public static long[] m(Parcel parcel, int i9) {
        int V8 = V(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (V8 == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + V8);
        return createLongArray;
    }

    public static Parcelable n(Parcel parcel, int i9, Parcelable.Creator creator) {
        int V8 = V(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (V8 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + V8);
        return parcelable;
    }

    public static String o(Parcel parcel, int i9) {
        int V8 = V(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (V8 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + V8);
        return readString;
    }

    public static ArrayList p(Parcel parcel, int i9) {
        int V8 = V(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (V8 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + V8);
        return createStringArrayList;
    }

    public static ContextThemeWrapper q(Context context, boolean z9) {
        int i9;
        if (!z9) {
            i9 = R.attr.dialogTheme;
        } else {
            i9 = R.attr.alertDialogTheme;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, H(context, i9));
        if (H(contextThemeWrapper, R.attr.mediaRouteTheme) != 0) {
            return new ContextThemeWrapper(contextThemeWrapper, E(contextThemeWrapper));
        }
        return contextThemeWrapper;
    }

    public static Object[] r(Parcel parcel, int i9, Parcelable.Creator creator) {
        int V8 = V(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (V8 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + V8);
        return createTypedArray;
    }

    public static ArrayList s(Parcel parcel, int i9, Parcelable.Creator creator) {
        int V8 = V(parcel, i9);
        int dataPosition = parcel.dataPosition();
        if (V8 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + V8);
        return createTypedArrayList;
    }

    public static String u(Context context) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        kotlin.jvm.internal.h.e(context, "context");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        kotlin.jvm.internal.h.d(string, "getString(...)");
        String str = string + 2;
        int i17 = 0;
        try {
            String BOARD = Build.BOARD;
            kotlin.jvm.internal.h.d(BOARD, "BOARD");
            i9 = Build.BOARD.length() % 10;
        } catch (Exception unused) {
            i9 = 0;
        }
        String str2 = str + i9;
        try {
            String BRAND = Build.BRAND;
            kotlin.jvm.internal.h.d(BRAND, "BRAND");
            i10 = Build.BRAND.length() % 10;
        } catch (Exception unused2) {
            i10 = 0;
        }
        String str3 = str2 + i10;
        try {
            String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
            kotlin.jvm.internal.h.d(SUPPORTED_ABIS, "SUPPORTED_ABIS");
            i11 = B7.j.m0(SUPPORTED_ABIS).length() % 10;
        } catch (Exception unused3) {
            i11 = 0;
        }
        String str4 = str3 + i11;
        try {
            String DEVICE = Build.DEVICE;
            kotlin.jvm.internal.h.d(DEVICE, "DEVICE");
            i12 = Build.DEVICE.length() % 10;
        } catch (Exception unused4) {
            i12 = 0;
        }
        String str5 = str4 + i12;
        try {
            String ID = Build.ID;
            kotlin.jvm.internal.h.d(ID, "ID");
            i13 = Build.ID.length() % 10;
        } catch (Exception unused5) {
            i13 = 0;
        }
        String str6 = str5 + i13;
        try {
            String MANUFACTURER = Build.MANUFACTURER;
            kotlin.jvm.internal.h.d(MANUFACTURER, "MANUFACTURER");
            i14 = Build.MANUFACTURER.length() % 10;
        } catch (Exception unused6) {
            i14 = 0;
        }
        String str7 = str6 + i14;
        try {
            String MODEL = Build.MODEL;
            kotlin.jvm.internal.h.d(MODEL, "MODEL");
            i15 = Build.MODEL.length() % 10;
        } catch (Exception unused7) {
            i15 = 0;
        }
        String str8 = str7 + i15;
        try {
            String PRODUCT = Build.PRODUCT;
            kotlin.jvm.internal.h.d(PRODUCT, "PRODUCT");
            i16 = Build.PRODUCT.length() % 10;
        } catch (Exception unused8) {
            i16 = 0;
        }
        String str9 = str8 + i16;
        try {
            String SERIAL = Build.SERIAL;
            kotlin.jvm.internal.h.d(SERIAL, "SERIAL");
            i17 = Build.SERIAL.length() % 10;
        } catch (Exception unused9) {
        }
        return str9 + i17;
    }

    public static void w(Parcel parcel, int i9) {
        if (parcel.dataPosition() == i9) {
        } else {
            throw new G4.b(AbstractC0953k1.j(i9, "Overread allowed size end="), parcel);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [C4.j, com.google.android.gms.internal.cast.L] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, D4.a] */
    public static L x(AbstractActivityC1369y abstractActivityC1369y, GoogleSignInOptions googleSignInOptions) {
        ?? obj = new Object();
        Looper mainLooper = abstractActivityC1369y.getMainLooper();
        y.i(mainLooper, "Looper must not be null.");
        return new C4.j(abstractActivityC1369y, abstractActivityC1369y, AbstractC1912a.f22359a, googleSignInOptions, new C4.i(obj, mainLooper));
    }

    public static final int y(Cursor c3, String str) {
        kotlin.jvm.internal.h.e(c3, "c");
        int columnIndex = c3.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c3.getColumnIndex("`" + str + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            String[] columnNames = c3.getColumnNames();
            kotlin.jvm.internal.h.b(columnNames);
            String concat = ".".concat(str);
            String str2 = "." + str + '`';
            int length = columnNames.length;
            int i9 = 0;
            int i10 = 0;
            while (i9 < length) {
                String str3 = columnNames[i9];
                int i11 = i10 + 1;
                if (str3.length() >= str.length() + 2 && (W7.l.G(str3, concat, false) || (str3.charAt(0) == '`' && W7.l.G(str3, str2, false)))) {
                    return i10;
                }
                i9++;
                i10 = i11;
            }
            return -1;
        }
        return -1;
    }

    public static final int z(Cursor c3, String str) {
        String str2;
        kotlin.jvm.internal.h.e(c3, "c");
        int y9 = y(c3, str);
        if (y9 >= 0) {
            return y9;
        }
        try {
            String[] columnNames = c3.getColumnNames();
            kotlin.jvm.internal.h.d(columnNames, "getColumnNames(...)");
            str2 = B7.j.m0(columnNames);
        } catch (Exception e8) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e8);
            str2 = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }

    public abstract void I(int i9);

    public abstract boolean J();

    public boolean L(byte[] bArr, int i9, int i10) {
        if (O(bArr, i9, i10) == 0) {
            return true;
        }
        return false;
    }

    public abstract int O(byte[] bArr, int i9, int i10);

    public abstract void Z(boolean z9);

    public abstract void b0();

    public abstract void d0(int i9);

    public abstract String t(byte[] bArr, int i9, int i10);

    public abstract int v(int i9, int i10, String str, byte[] bArr);

    public void Y(boolean z9) {
    }
}
