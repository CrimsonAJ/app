package com.google.android.gms.internal.measurement;

import Y7.C0476q;
import a.AbstractC0485a;
import android.app.Dialog;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.drawable.Drawable;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.media.MediaRoute2Info;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.navigation.fragment.NavHostFragment;
import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1051w;
import com.google.crypto.tink.shaded.protobuf.AbstractC1054z;
import com.google.crypto.tink.shaded.protobuf.InterfaceC1053y;
import f5.C1183o;
import i0.AbstractComponentCallbacksC1366v;
import i0.DialogInterfaceOnCancelListenerC1358n;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import t0.AbstractC1972f;
import u5.C2081a;

/* renamed from: com.google.android.gms.internal.measurement.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1002u1 {

    /* renamed from: a, reason: collision with root package name */
    public static E6.e f15601a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15602b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static SharedPreferences f15603c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f15604d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f15605e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f15606f = 0;

    public static final u0.H A(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        DialogInterfaceOnCancelListenerC1358n dialogInterfaceOnCancelListenerC1358n;
        Dialog dialog;
        Window window;
        kotlin.jvm.internal.h.e(abstractComponentCallbacksC1366v, "<this>");
        for (AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v2 = abstractComponentCallbacksC1366v; abstractComponentCallbacksC1366v2 != null; abstractComponentCallbacksC1366v2 = abstractComponentCallbacksC1366v2.f18419v) {
            if (abstractComponentCallbacksC1366v2 instanceof NavHostFragment) {
                return ((NavHostFragment) abstractComponentCallbacksC1366v2).e0();
            }
            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v3 = abstractComponentCallbacksC1366v2.o().f18218x;
            if (abstractComponentCallbacksC1366v3 instanceof NavHostFragment) {
                return ((NavHostFragment) abstractComponentCallbacksC1366v3).e0();
            }
        }
        View view = abstractComponentCallbacksC1366v.Y;
        if (view != null) {
            return v4.e.n(view);
        }
        View view2 = null;
        if (abstractComponentCallbacksC1366v instanceof DialogInterfaceOnCancelListenerC1358n) {
            dialogInterfaceOnCancelListenerC1358n = (DialogInterfaceOnCancelListenerC1358n) abstractComponentCallbacksC1366v;
        } else {
            dialogInterfaceOnCancelListenerC1358n = null;
        }
        if (dialogInterfaceOnCancelListenerC1358n != null && (dialog = dialogInterfaceOnCancelListenerC1358n.f18349G0) != null && (window = dialog.getWindow()) != null) {
            view2 = window.getDecorView();
        }
        if (view2 != null) {
            return v4.e.n(view2);
        }
        throw new IllegalStateException(AbstractC0953k1.m("Fragment ", abstractComponentCallbacksC1366v, " does not have a NavController set"));
    }

    public static final String B(long j) {
        String o9;
        if (j <= -999500000) {
            o9 = A0.a.o(new StringBuilder(), (j - 500000000) / 1000000000, " s ");
        } else if (j <= -999500) {
            o9 = A0.a.o(new StringBuilder(), (j - 500000) / 1000000, " ms");
        } else if (j <= 0) {
            o9 = A0.a.o(new StringBuilder(), (j - 500) / 1000, " µs");
        } else if (j < 999500) {
            o9 = A0.a.o(new StringBuilder(), (j + 500) / 1000, " µs");
        } else if (j < 999500000) {
            o9 = A0.a.o(new StringBuilder(), (j + 500000) / 1000000, " ms");
        } else {
            o9 = A0.a.o(new StringBuilder(), (j + 500000000) / 1000000000, " s ");
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{o9}, 1));
    }

    public static ArrayList E(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info h7 = P.x0.h(it.next());
            if (h7 != null) {
                arrayList.add(AbstractC1972f.l(h7));
            }
        }
        return arrayList;
    }

    public static String F(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            String concat = "TRuntime.".concat(str);
            if (concat.length() > 23) {
                return concat.substring(0, 23);
            }
            return concat;
        }
        return "TRuntime.".concat(str);
    }

    public static boolean I(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static boolean J(MotionEvent motionEvent, int i9) {
        if ((motionEvent.getSource() & i9) == i9) {
            return true;
        }
        return false;
    }

    public static boolean K(byte b9) {
        if (b9 > -65) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Integer L(String str) {
        char c3;
        if (str != null) {
            switch (str.hashCode()) {
                case -1118317585:
                    if (str.equals("REPEAT_ALL_AND_SHUFFLE")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -962896020:
                    if (str.equals("REPEAT_SINGLE")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1645938909:
                    if (str.equals("REPEAT_ALL")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1645952171:
                    if (str.equals("REPEAT_OFF")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            if (c3 != 0) {
                if (c3 != 1) {
                    if (c3 != 2) {
                        if (c3 != 3) {
                            return null;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }
        return null;
    }

    public static int M(Object obj, com.google.crypto.tink.shaded.protobuf.b0 b0Var, byte[] bArr, int i9, int i10, N3.Z z9) {
        int i11 = i9 + 1;
        int i12 = bArr[i9];
        if (i12 < 0) {
            i11 = v(i12, bArr, i11, z9);
            i12 = z9.f5032a;
        }
        int i13 = i11;
        if (i12 >= 0 && i12 <= i10 - i13) {
            int i14 = i13 + i12;
            b0Var.h(obj, bArr, i13, i14, z9);
            z9.f5034c = obj;
            return i14;
        }
        throw com.google.crypto.tink.shaded.protobuf.B.g();
    }

    public static void N(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [e0.b, C7.f] */
    public static e0.b W(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i9 = duplicate.getShort() & 65535;
        if (i9 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    int i11 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i11) {
                        break;
                    }
                    i10++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j4 = duplicate.getInt() & 4294967295L;
                for (int i12 = 0; i12 < j4; i12++) {
                    int i13 = duplicate.getInt();
                    long j9 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i13 || 1701669481 == i13) {
                        duplicate.position((int) (j9 + j));
                        ?? fVar = new C7.f();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        fVar.f1637d = duplicate;
                        fVar.f1634a = position;
                        int i14 = position - duplicate.getInt(position);
                        fVar.f1635b = i14;
                        fVar.f1636c = ((ByteBuffer) fVar.f1637d).getShort(i14);
                        return fVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static TypedValue X(Context context, int i9) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i9, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean Y(Context context, int i9, boolean z9) {
        TypedValue X8 = X(context, i9);
        if (X8 != null && X8.type == 18) {
            if (X8.data != 0) {
                return true;
            }
            return false;
        }
        return z9;
    }

    public static TypedValue Z(int i9, Context context, String str) {
        TypedValue X8 = X(context, i9);
        if (X8 != null) {
            return X8;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i9)));
    }

    public static final void a(m8.a aVar, m8.b bVar, String str) {
        m8.c.f20929i.fine(bVar.f20923b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f20918a);
    }

    public static void a0(ViewGroup viewGroup, float f9) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof F5.h) {
            ((F5.h) background).j(f9);
        }
    }

    public static void b0(View view, F5.h hVar) {
        C2081a c2081a = hVar.f2483a.f2467b;
        if (c2081a != null && c2081a.f23702a) {
            float f9 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = P.Q.f5546a;
                f9 += P.H.e((View) parent);
            }
            F5.g gVar = hVar.f2483a;
            if (gVar.f2476l != f9) {
                gVar.f2476l = f9;
                hVar.p();
            }
        }
    }

    public static void c0(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof F5.h) {
            b0(viewGroup, (F5.h) background);
        }
    }

    public static final Object d0(d8.t tVar, d8.t tVar2, O7.p pVar) {
        Object c0476q;
        Object M7;
        try {
            kotlin.jvm.internal.r.c(2, pVar);
            c0476q = pVar.invoke(tVar2, tVar);
        } catch (Throwable th) {
            c0476q = new C0476q(th, false);
        }
        F7.a aVar = F7.a.f2587a;
        if (c0476q != aVar && (M7 = tVar.M(c0476q)) != Y7.B.f8750e) {
            if (!(M7 instanceof C0476q)) {
                return Y7.B.A(M7);
            }
            throw ((C0476q) M7).f8842a;
        }
        return aVar;
    }

    public static final List e0(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableList(new ArrayList(list));
            }
            return Collections.singletonList(B7.k.p0(list));
        }
        return B7.t.f1135a;
    }

    public static final Map f0(Map map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableMap(new LinkedHashMap(map));
            }
            Map.Entry entry = (Map.Entry) B7.k.o0(map.entrySet());
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        return B7.u.f1136a;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static t0.C1980n g0(android.media.MediaRoute2Info r13) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC1002u1.g0(android.media.MediaRoute2Info):t0.n");
    }

    public static void h(String str, boolean z9) {
        if (z9) {
        } else {
            throw j3.j0.a(str, null);
        }
    }

    public static SharedPreferences i0(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f15603c == null) {
                    f15603c = (SharedPreferences) j0(new Q4.b(0, context));
                }
                sharedPreferences = f15603c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }

    public static Object j0(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(P0.c cVar, Throwable th) {
        if (cVar != 0) {
            if (th == null) {
                if (cVar instanceof AutoCloseable) {
                    cVar.close();
                    return;
                }
                if (cVar instanceof ExecutorService) {
                    C3.d.w((ExecutorService) cVar);
                    return;
                }
                if (cVar instanceof TypedArray) {
                    ((TypedArray) cVar).recycle();
                    return;
                }
                if (cVar instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) cVar).release();
                    return;
                }
                if (cVar instanceof MediaDrm) {
                    ((MediaDrm) cVar).release();
                    return;
                } else if (cVar instanceof DrmManagerClient) {
                    ((DrmManagerClient) cVar).release();
                    return;
                } else {
                    if (cVar instanceof ContentProviderClient) {
                        ((ContentProviderClient) cVar).release();
                        return;
                    }
                    throw new IllegalArgumentException();
                }
            }
            try {
                A0.a.w(cVar);
            } catch (Throwable th2) {
                O4.h.a(th, th2);
            }
        }
    }

    public static String k0(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            return null;
                        }
                        return "REPEAT_ALL_AND_SHUFFLE";
                    }
                    return "REPEAT_SINGLE";
                }
                return "REPEAT_ALL";
            }
            return "REPEAT_OFF";
        }
        return null;
    }

    public static i8.w l(i8.w wVar, i8.w wVar2) {
        C1183o c1183o = new C1183o(5);
        int size = wVar.size();
        for (int i9 = 0; i9 < size; i9++) {
            String c3 = wVar.c(i9);
            String f9 = wVar.f(i9);
            if ((!"Warning".equalsIgnoreCase(c3) || !W7.l.L(f9, "1", false)) && ("Content-Length".equalsIgnoreCase(c3) || "Content-Encoding".equalsIgnoreCase(c3) || "Content-Type".equalsIgnoreCase(c3) || !I(c3) || wVar2.b(c3) == null)) {
                c1183o.y(c3, f9);
            }
        }
        int size2 = wVar2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            String c9 = wVar2.c(i10);
            if (!"Content-Length".equalsIgnoreCase(c9) && !"Content-Encoding".equalsIgnoreCase(c9) && !"Content-Type".equalsIgnoreCase(c9) && I(c9)) {
                c1183o.y(c9, wVar2.f(i10));
            }
        }
        return c1183o.z();
    }

    public static synchronized void l0(E6.e eVar) {
        synchronized (AbstractC1002u1.class) {
            if (f15601a == null) {
                f15601a = eVar;
            } else {
                throw new IllegalStateException("init() already called");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.a, java.lang.Object] */
    public static AbstractC0485a m(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    public static void n(String str, String str2, Object obj) {
        String F2 = F(str);
        if (Log.isLoggable(F2, 3)) {
            Log.d(F2, String.format(str2, obj));
        }
    }

    public static int o(byte[] bArr, int i9, N3.Z z9) {
        int w7 = w(bArr, i9, z9);
        int i10 = z9.f5032a;
        if (i10 >= 0) {
            if (i10 <= bArr.length - w7) {
                if (i10 == 0) {
                    z9.f5034c = AbstractC1037h.f16356b;
                    return w7;
                }
                z9.f5034c = AbstractC1037h.d(bArr, w7, i10);
                return w7 + i10;
            }
            throw com.google.crypto.tink.shaded.protobuf.B.g();
        }
        throw com.google.crypto.tink.shaded.protobuf.B.e();
    }

    public static int p(int i9, byte[] bArr) {
        return ((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16);
    }

    public static long q(int i9, byte[] bArr) {
        return ((bArr[i9 + 7] & 255) << 56) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48);
    }

    public static int r(com.google.crypto.tink.shaded.protobuf.b0 b0Var, int i9, byte[] bArr, int i10, int i11, InterfaceC1053y interfaceC1053y, N3.Z z9) {
        Object d9 = b0Var.d();
        com.google.crypto.tink.shaded.protobuf.b0 b0Var2 = b0Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        N3.Z z10 = z9;
        int M7 = M(d9, b0Var2, bArr2, i10, i12, z10);
        b0Var2.b(d9);
        z10.f5034c = d9;
        interfaceC1053y.add(d9);
        while (M7 < i12) {
            N3.Z z11 = z10;
            int i13 = i12;
            int w7 = w(bArr2, M7, z11);
            if (i9 != z11.f5032a) {
                break;
            }
            byte[] bArr3 = bArr2;
            com.google.crypto.tink.shaded.protobuf.b0 b0Var3 = b0Var2;
            Object d10 = b0Var3.d();
            M7 = M(d10, b0Var3, bArr3, w7, i13, z11);
            b0Var2 = b0Var3;
            bArr2 = bArr3;
            i12 = i13;
            z10 = z11;
            b0Var2.b(d10);
            z10.f5034c = d10;
            interfaceC1053y.add(d10);
        }
        return M7;
    }

    public static int s(byte[] bArr, int i9, N3.Z z9) {
        int w7 = w(bArr, i9, z9);
        int i10 = z9.f5032a;
        if (i10 >= 0) {
            if (i10 == 0) {
                z9.f5034c = "";
                return w7;
            }
            z9.f5034c = new String(bArr, w7, i10, AbstractC1054z.f16405a);
            return w7 + i10;
        }
        throw com.google.crypto.tink.shaded.protobuf.B.e();
    }

    public static int t(byte[] bArr, int i9, N3.Z z9) {
        int w7 = w(bArr, i9, z9);
        int i10 = z9.f5032a;
        if (i10 >= 0) {
            if (i10 == 0) {
                z9.f5034c = "";
                return w7;
            }
            z9.f5034c = com.google.crypto.tink.shaded.protobuf.q0.f16400a.t(bArr, w7, i10);
            return w7 + i10;
        }
        throw com.google.crypto.tink.shaded.protobuf.B.e();
    }

    public static int u(int i9, byte[] bArr, int i10, int i11, com.google.crypto.tink.shaded.protobuf.e0 e0Var, N3.Z z9) {
        if ((i9 >>> 3) != 0) {
            int i12 = i9 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                e0Var.d(i9, Integer.valueOf(p(i10, bArr)));
                                return i10 + 4;
                            }
                            throw com.google.crypto.tink.shaded.protobuf.B.a();
                        }
                        com.google.crypto.tink.shaded.protobuf.e0 c3 = com.google.crypto.tink.shaded.protobuf.e0.c();
                        int i13 = (i9 & (-8)) | 4;
                        int i14 = 0;
                        while (true) {
                            if (i10 >= i11) {
                                break;
                            }
                            int w7 = w(bArr, i10, z9);
                            i14 = z9.f5032a;
                            if (i14 == i13) {
                                i10 = w7;
                                break;
                            }
                            i10 = u(i14, bArr, w7, i11, c3, z9);
                        }
                        if (i10 <= i11 && i14 == i13) {
                            e0Var.d(i9, c3);
                            return i10;
                        }
                        throw com.google.crypto.tink.shaded.protobuf.B.f();
                    }
                    int w9 = w(bArr, i10, z9);
                    int i15 = z9.f5032a;
                    if (i15 >= 0) {
                        if (i15 <= bArr.length - w9) {
                            if (i15 == 0) {
                                e0Var.d(i9, AbstractC1037h.f16356b);
                            } else {
                                e0Var.d(i9, AbstractC1037h.d(bArr, w9, i15));
                            }
                            return w9 + i15;
                        }
                        throw com.google.crypto.tink.shaded.protobuf.B.g();
                    }
                    throw com.google.crypto.tink.shaded.protobuf.B.e();
                }
                e0Var.d(i9, Long.valueOf(q(i10, bArr)));
                return i10 + 8;
            }
            int y9 = y(bArr, i10, z9);
            e0Var.d(i9, Long.valueOf(z9.f5033b));
            return y9;
        }
        throw com.google.crypto.tink.shaded.protobuf.B.a();
    }

    public static int v(int i9, byte[] bArr, int i10, N3.Z z9) {
        int i11 = i9 & 127;
        int i12 = i10 + 1;
        byte b9 = bArr[i10];
        if (b9 >= 0) {
            z9.f5032a = i11 | (b9 << 7);
            return i12;
        }
        int i13 = i11 | ((b9 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            z9.f5032a = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            z9.f5032a = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            z9.f5032a = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] < 0) {
                i18 = i20;
            } else {
                z9.f5032a = i19;
                return i20;
            }
        }
    }

    public static int w(byte[] bArr, int i9, N3.Z z9) {
        int i10 = i9 + 1;
        byte b9 = bArr[i9];
        if (b9 >= 0) {
            z9.f5032a = b9;
            return i10;
        }
        return v(b9, bArr, i10, z9);
    }

    public static int x(int i9, byte[] bArr, int i10, int i11, InterfaceC1053y interfaceC1053y, N3.Z z9) {
        AbstractC1051w abstractC1051w = (AbstractC1051w) interfaceC1053y;
        int w7 = w(bArr, i10, z9);
        abstractC1051w.c(z9.f5032a);
        while (w7 < i11) {
            int w9 = w(bArr, w7, z9);
            if (i9 != z9.f5032a) {
                break;
            }
            w7 = w(bArr, w9, z9);
            abstractC1051w.c(z9.f5032a);
        }
        return w7;
    }

    public static int y(byte[] bArr, int i9, N3.Z z9) {
        int i10 = i9 + 1;
        long j = bArr[i9];
        if (j >= 0) {
            z9.f5033b = j;
            return i10;
        }
        int i11 = i9 + 2;
        byte b9 = bArr[i10];
        long j4 = (j & 127) | ((b9 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b9 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j4 |= (r10 & Byte.MAX_VALUE) << i12;
            b9 = bArr[i11];
            i11 = i13;
        }
        z9.f5033b = j4;
        return i11;
    }

    public static void z(String str, String str2, Exception exc) {
        String F2 = F(str);
        if (Log.isLoggable(F2, 6)) {
            Log.e(F2, str2, exc);
        }
    }

    public abstract S5.d C(S5.n nVar);

    public abstract S5.m D(S5.n nVar);

    public int G(View view) {
        return 0;
    }

    public int H() {
        return 0;
    }

    public abstract void P(int i9);

    public abstract void Q(View view, int i9, int i10);

    public abstract void R(View view, float f9, float f10);

    public abstract void S(S5.m mVar, S5.m mVar2);

    public abstract void T(u.f fVar, u.f fVar2);

    public abstract void U(S5.m mVar, Thread thread);

    public abstract void V(u.f fVar, Thread thread);

    public abstract boolean b(S5.n nVar, S5.d dVar, S5.d dVar2);

    public abstract boolean c(u.g gVar, u.c cVar, u.c cVar2);

    public abstract boolean d(S5.n nVar, Object obj, Object obj2);

    public abstract boolean e(u.g gVar, Object obj, Object obj2);

    public abstract boolean f(S5.n nVar, S5.m mVar, S5.m mVar2);

    public abstract boolean g(u.g gVar, u.f fVar, u.f fVar2);

    public abstract boolean h0(View view, int i9);

    public abstract int i(View view, int i9);

    public abstract int j(View view, int i9);

    public void O(View view, int i9) {
    }
}
