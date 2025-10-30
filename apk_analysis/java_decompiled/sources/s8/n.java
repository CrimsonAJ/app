package s8;

import A3.F;
import B6.u0;
import D4.q;
import F4.y;
import G0.E;
import G0.G;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.View;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.gms.internal.measurement.C0916d;
import com.google.android.gms.internal.measurement.C0921e;
import com.google.android.gms.internal.measurement.C0931g;
import com.google.android.gms.internal.measurement.C0951k;
import com.google.android.gms.internal.measurement.C0956l;
import com.google.android.gms.internal.measurement.C0981q;
import com.google.android.gms.internal.measurement.EnumC1010w;
import com.google.android.gms.internal.measurement.InterfaceC0966n;
import com.google.android.gms.internal.measurement.r;
import com.google.firebase.messaging.C1058d;
import com.google.firebase.messaging.s;
import d2.v;
import f5.AbstractC1176h;
import f5.AbstractC1178j;
import f5.C1179k;
import f5.C1185q;
import f5.ExecutorC1184p;
import j3.X;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.InterfaceC1513m;
import u0.z;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f22809a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f22810b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f22811c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static Field f22812d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f22813e;

    /* renamed from: f, reason: collision with root package name */
    public static Class f22814f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f22815g;

    /* renamed from: h, reason: collision with root package name */
    public static Field f22816h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f22817i;
    public static Field j;

    /* renamed from: k, reason: collision with root package name */
    public static boolean f22818k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f22819l = 0;

    public static byte[] A(C1058d c1058d) {
        int i9;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i10 = 0;
        while (i10 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i10);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < min2) {
                int read = c1058d.read(bArr, i11, min2 - i11);
                if (read == -1) {
                    return i(arrayDeque, i10);
                }
                i11 += read;
                i10 += read;
            }
            long j4 = min;
            if (min < 4096) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            long j9 = j4 * i9;
            if (j9 > 2147483647L) {
                min = Integer.MAX_VALUE;
            } else if (j9 < -2147483648L) {
                min = Integer.MIN_VALUE;
            } else {
                min = (int) j9;
            }
        }
        if (c1058d.read() == -1) {
            return i(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final String B(int i9) {
        int i10 = 0;
        if (i9 == 0) {
            return "0";
        }
        char[] cArr = y8.b.f25133a;
        char[] cArr2 = {cArr[(i9 >> 28) & 15], cArr[(i9 >> 24) & 15], cArr[(i9 >> 20) & 15], cArr[(i9 >> 16) & 15], cArr[(i9 >> 12) & 15], cArr[(i9 >> 8) & 15], cArr[(i9 >> 4) & 15], cArr[i9 & 15]};
        while (i10 < 8 && cArr2[i10] == '0') {
            i10++;
        }
        if (i10 >= 0) {
            if (i10 <= 8) {
                return new String(cArr2, i10, 8 - i10);
            }
            throw new IllegalArgumentException(A0.a.m("startIndex: ", i10, " > endIndex: 8"));
        }
        throw new IndexOutOfBoundsException(A0.a.m("startIndex: ", i10, ", endIndex: 8, size: 8"));
    }

    public static C1185q C(List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((AbstractC1176h) it.next()) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            C1185q c1185q = new C1185q();
            C1179k c1179k = new C1179k(list.size(), c1185q);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC1176h abstractC1176h = (AbstractC1176h) it2.next();
                ExecutorC1184p executorC1184p = AbstractC1178j.f17415b;
                abstractC1176h.d(executorC1184p, c1179k);
                abstractC1176h.c(executorC1184p, c1179k);
                abstractC1176h.a(executorC1184p, c1179k);
            }
            return c1185q;
        }
        return p(null);
    }

    public static C1185q D(AbstractC1176h... abstractC1176hArr) {
        if (abstractC1176hArr.length == 0) {
            return p(Collections.EMPTY_LIST);
        }
        List asList = Arrays.asList(abstractC1176hArr);
        q qVar = AbstractC1178j.f17414a;
        if (asList != null && !asList.isEmpty()) {
            return C(asList).e(qVar, new Z3.j(asList, 2));
        }
        return p(Collections.EMPTY_LIST);
    }

    public static void E(Parcel parcel, int i9, Boolean bool) {
        if (bool == null) {
            return;
        }
        V(parcel, i9, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void F(Parcel parcel, int i9, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int R2 = R(parcel, i9);
        parcel.writeBundle(bundle);
        U(parcel, R2);
    }

    public static void G(Parcel parcel, int i9, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int R2 = R(parcel, i9);
        parcel.writeByteArray(bArr);
        U(parcel, R2);
    }

    public static void H(Parcel parcel, int i9, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int R2 = R(parcel, i9);
        parcel.writeStrongBinder(iBinder);
        U(parcel, R2);
    }

    public static void I(Parcel parcel, int i9, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int R2 = R(parcel, i9);
        parcel.writeIntArray(iArr);
        U(parcel, R2);
    }

    public static void J(Parcel parcel, int i9, ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int R2 = R(parcel, i9);
        int size = arrayList.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeInt(((Integer) arrayList.get(i10)).intValue());
        }
        U(parcel, R2);
    }

    public static void K(Parcel parcel, int i9, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int R2 = R(parcel, i9);
        parcel.writeLongArray(jArr);
        U(parcel, R2);
    }

    public static void L(Parcel parcel, int i9, Parcelable parcelable, int i10) {
        if (parcelable == null) {
            return;
        }
        int R2 = R(parcel, i9);
        parcelable.writeToParcel(parcel, i10);
        U(parcel, R2);
    }

    public static void M(Parcel parcel, int i9, String str) {
        if (str == null) {
            return;
        }
        int R2 = R(parcel, i9);
        parcel.writeString(str);
        U(parcel, R2);
    }

    public static void N(Parcel parcel, int i9, List list) {
        if (list == null) {
            return;
        }
        int R2 = R(parcel, i9);
        parcel.writeStringList(list);
        U(parcel, R2);
    }

    public static void O(Parcel parcel, int i9, Parcelable[] parcelableArr, int i10) {
        if (parcelableArr == null) {
            return;
        }
        int R2 = R(parcel, i9);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i10);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        U(parcel, R2);
    }

    public static void P(Parcel parcel, int i9, List list) {
        if (list == null) {
            return;
        }
        int R2 = R(parcel, i9);
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            Parcelable parcelable = (Parcelable) list.get(i10);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        U(parcel, R2);
    }

    public static double Q(double d9) {
        int i9;
        if (Double.isNaN(d9)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d9) && d9 != 0.0d && d9 != 0.0d) {
            if (d9 > 0.0d) {
                i9 = 1;
            } else {
                i9 = -1;
            }
            return i9 * Math.floor(Math.abs(d9));
        }
        return d9;
    }

    public static int R(Parcel parcel, int i9) {
        parcel.writeInt(i9 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static Object S(AbstractC1176h abstractC1176h) {
        if (abstractC1176h.j()) {
            return abstractC1176h.g();
        }
        if (((C1185q) abstractC1176h).f17438d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC1176h.f());
    }

    public static int T(double d9) {
        int i9;
        if (!Double.isNaN(d9) && !Double.isInfinite(d9) && d9 != 0.0d) {
            if (d9 > 0.0d) {
                i9 = 1;
            } else {
                i9 = -1;
            }
            return (int) ((i9 * Math.floor(Math.abs(d9))) % 4.294967296E9d);
        }
        return 0;
    }

    public static void U(Parcel parcel, int i9) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i9 - 4);
        parcel.writeInt(dataPosition - i9);
        parcel.setDataPosition(dataPosition);
    }

    public static void V(Parcel parcel, int i9, int i10) {
        parcel.writeInt(i9 | (i10 << 16));
    }

    public static void W(s sVar) {
        int T8 = T(sVar.C("runtime.counter").b().doubleValue() + 1.0d);
        if (T8 <= 1000000) {
            sVar.F("runtime.counter", new C0931g(Double.valueOf(T8)));
            return;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static EnumC1010w X(String str) {
        EnumC1010w enumC1010w = null;
        if (str != null && !str.isEmpty()) {
            enumC1010w = (EnumC1010w) EnumC1010w.f15640J0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (enumC1010w != null) {
            return enumC1010w;
        }
        throw new IllegalArgumentException(z.e("Unsupported commandId ", str));
    }

    public static Object Y(InterfaceC0966n interfaceC0966n) {
        if (InterfaceC0966n.f15544O.equals(interfaceC0966n)) {
            return null;
        }
        if (InterfaceC0966n.f15543N.equals(interfaceC0966n)) {
            return "";
        }
        if (interfaceC0966n instanceof C0951k) {
            return Z((C0951k) interfaceC0966n);
        }
        if (interfaceC0966n instanceof C0916d) {
            ArrayList arrayList = new ArrayList();
            C0916d c0916d = (C0916d) interfaceC0966n;
            c0916d.getClass();
            int i9 = 0;
            while (i9 < c0916d.p()) {
                if (i9 < c0916d.p()) {
                    int i10 = i9 + 1;
                    Object Y = Y(c0916d.q(i9));
                    if (Y != null) {
                        arrayList.add(Y);
                    }
                    i9 = i10;
                } else {
                    throw new NoSuchElementException(AbstractC0953k1.j(i9, "Out of bounds index: "));
                }
            }
            return arrayList;
        }
        if (!interfaceC0966n.b().isNaN()) {
            return interfaceC0966n.b();
        }
        return interfaceC0966n.c();
    }

    public static HashMap Z(C0951k c0951k) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(c0951k.f15511a.keySet());
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            String str = (String) obj;
            Object Y = Y(c0951k.i(str));
            if (Y != null) {
                hashMap.put(str, Y);
            }
        }
        return hashMap;
    }

    public static final boolean a(int i9, int i10, int i11, byte[] a5, byte[] b9) {
        kotlin.jvm.internal.h.e(a5, "a");
        kotlin.jvm.internal.h.e(b9, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (a5[i12 + i9] != b9[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static void a0(int i9, String str, List list) {
        if (list.size() == i9) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i9 + " parameters found " + list.size());
    }

    public static Object b(AbstractC1176h abstractC1176h) {
        y.g("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        y.i(abstractC1176h, "Task must not be null");
        if (abstractC1176h.i()) {
            return S(abstractC1176h);
        }
        d7.c cVar = new d7.c(1);
        Executor executor = AbstractC1178j.f17415b;
        abstractC1176h.d(executor, cVar);
        abstractC1176h.c(executor, cVar);
        abstractC1176h.a(executor, cVar);
        cVar.f16890b.await();
        return S(abstractC1176h);
    }

    public static void b0(int i9, String str, List list) {
        if (list.size() >= i9) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i9 + " parameters found " + list.size());
    }

    public static Object c(C1185q c1185q, long j4, TimeUnit timeUnit) {
        y.g("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        y.i(c1185q, "Task must not be null");
        y.i(timeUnit, "TimeUnit must not be null");
        if (c1185q.i()) {
            return S(c1185q);
        }
        d7.c cVar = new d7.c(1);
        Executor executor = AbstractC1178j.f17415b;
        c1185q.d(executor, cVar);
        c1185q.c(executor, cVar);
        c1185q.a(executor, cVar);
        if (cVar.f16890b.await(j4, timeUnit)) {
            return S(c1185q);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static void c0(String str, int i9, ArrayList arrayList) {
        if (arrayList.size() <= i9) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i9 + " parameters found " + arrayList.size());
    }

    public static Y2.h d(I2.a animeEpisode, String langCode, A7.h langIdByEpId) {
        String str;
        long j4;
        kotlin.jvm.internal.h.e(animeEpisode, "animeEpisode");
        kotlin.jvm.internal.h.e(langCode, "langCode");
        kotlin.jvm.internal.h.e(langIdByEpId, "langIdByEpId");
        Uri parse = Uri.parse(animeEpisode.f3450g.f3457b);
        int D8 = l4.y.D(parse);
        String str2 = "application/x-mpegURL";
        if (D8 != 0) {
            if (D8 != 1) {
                if (D8 == 2) {
                    str = "application/x-mpegURL";
                } else {
                    str = null;
                }
            } else {
                str = "application/vnd.ms-sstr+xml";
            }
        } else {
            str = "application/dash+xml";
        }
        if (str != null) {
            str2 = str;
        }
        Y2.h hVar = new Y2.h();
        hVar.f8613c = parse;
        long j9 = animeEpisode.f3444a;
        String valueOf = String.valueOf(j9);
        valueOf.getClass();
        hVar.f8611a = valueOf;
        hVar.f8612b = str2;
        if (((Number) langIdByEpId.f547a).longValue() == j9) {
            j4 = ((Number) langIdByEpId.f548b).longValue();
        } else {
            j4 = 0;
        }
        if (!animeEpisode.f3447d.isEmpty()) {
            List<I2.c> list = animeEpisode.f3447d;
            ArrayList arrayList = new ArrayList(B7.m.f0(list, 10));
            for (I2.c cVar : list) {
                Uri parse2 = Uri.parse(cVar.f3464d);
                F f9 = new F(3);
                f9.f51c = parse2;
                f9.f54f = cVar.f3464d;
                f9.f52d = "text/vtt";
                f9.f53e = cVar.f3463c;
                if ((j4 != 0 && j4 == cVar.f3461a) || (j4 == 0 && !W7.d.U(langCode) && kotlin.jvm.internal.h.a(cVar.f3462b, langCode))) {
                    f9.f50b = 1;
                }
                arrayList.add(new X(f9));
            }
            hVar.f8617g = P5.F.o(arrayList);
        }
        return hVar;
    }

    public static boolean d0(InterfaceC0966n interfaceC0966n) {
        if (interfaceC0966n == null) {
            return false;
        }
        Double b9 = interfaceC0966n.b();
        if (b9.isNaN() || b9.doubleValue() < 0.0d || !b9.equals(Double.valueOf(Math.floor(b9.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static C1185q e(Executor executor, Callable callable) {
        y.i(executor, "Executor must not be null");
        C1185q c1185q = new C1185q();
        executor.execute(new v(c1185q, callable, 9, false));
        return c1185q;
    }

    public static boolean e0(InterfaceC0966n interfaceC0966n, InterfaceC0966n interfaceC0966n2) {
        if (!interfaceC0966n.getClass().equals(interfaceC0966n2.getClass())) {
            return false;
        }
        if ((interfaceC0966n instanceof r) || (interfaceC0966n instanceof C0956l)) {
            return true;
        }
        if (interfaceC0966n instanceof C0931g) {
            if (Double.isNaN(interfaceC0966n.b().doubleValue()) || Double.isNaN(interfaceC0966n2.b().doubleValue())) {
                return false;
            }
            return interfaceC0966n.b().equals(interfaceC0966n2.b());
        }
        if (interfaceC0966n instanceof C0981q) {
            return interfaceC0966n.c().equals(interfaceC0966n2.c());
        }
        if (interfaceC0966n instanceof C0921e) {
            return interfaceC0966n.o().equals(interfaceC0966n2.o());
        }
        if (interfaceC0966n != interfaceC0966n2) {
            return false;
        }
        return true;
    }

    public static final void f(long j4, long j9, long j10) {
        if ((j9 | j10) >= 0 && j9 <= j4 && j4 - j9 >= j10) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j4 + " offset=" + j9 + " byteCount=" + j10);
    }

    public static void g(int i9, int i10, int i11) {
        if (i9 >= 0 && i10 <= i11) {
            if (i9 <= i10) {
                return;
            } else {
                throw new IllegalArgumentException(A0.a.l("fromIndex: ", i9, i10, " > toIndex: "));
            }
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i9 + ", toIndex: " + i10 + ", size: " + i11);
    }

    public static void h(InterfaceC1513m interfaceC1513m) {
        if (interfaceC1513m != null) {
            try {
                interfaceC1513m.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] i(ArrayDeque arrayDeque, int i9) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i9) {
            return bArr;
        }
        int length = i9 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i9);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i9 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static int j(int i9, int i10) {
        return H.a.h(i9, (Color.alpha(i9) * i10) / 255);
    }

    public static int k(int i9, int i10, String str, boolean z9) {
        boolean z10;
        while (i9 < i10) {
            char charAt = str.charAt(i9);
            if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && (('0' > charAt || charAt >= ':') && (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && charAt != ':')))) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 == (!z9)) {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    public static final void l(P0.a connection) {
        kotlin.jvm.internal.h.e(connection, "connection");
        C7.c cVar = new C7.c(10);
        P0.c d02 = connection.d0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (d02.W()) {
            try {
                cVar.add(d02.i(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1002u1.k(d02, th);
                    throw th2;
                }
            }
        }
        AbstractC1002u1.k(d02, null);
        ListIterator listIterator = u0.e(cVar).listIterator(0);
        while (true) {
            C7.a aVar = (C7.a) listIterator;
            if (aVar.hasNext()) {
                String str = (String) aVar.next();
                if (W7.l.L(str, "room_fts_content_sync_", false)) {
                    m(connection, "DROP TRIGGER IF EXISTS ".concat(str));
                }
            } else {
                return;
            }
        }
    }

    public static final void m(P0.a aVar, String sql) {
        kotlin.jvm.internal.h.e(aVar, "<this>");
        kotlin.jvm.internal.h.e(sql, "sql");
        P0.c d02 = aVar.d0(sql);
        try {
            d02.W();
            AbstractC1002u1.k(d02, null);
        } finally {
        }
    }

    public static void n(Object obj) {
        LongSparseArray longSparseArray;
        if (!f22815g) {
            try {
                f22814f = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e8) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e8);
            }
            f22815g = true;
        }
        Class cls = f22814f;
        if (cls != null) {
            if (!f22817i) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f22816h = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e9) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e9);
                }
                f22817i = true;
            }
            Field field = f22816h;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e10) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e10);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    public static C1185q o(Exception exc) {
        C1185q c1185q = new C1185q();
        c1185q.n(exc);
        return c1185q;
    }

    public static C1185q p(Object obj) {
        C1185q c1185q = new C1185q();
        c1185q.o(obj);
        return c1185q;
    }

    public static int q(Context context, int i9, int i10) {
        Integer num;
        int i11;
        TypedValue X8 = AbstractC1002u1.X(context, i9);
        if (X8 != null) {
            int i12 = X8.resourceId;
            if (i12 != 0) {
                i11 = context.getColor(i12);
            } else {
                i11 = X8.data;
            }
            num = Integer.valueOf(i11);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i10;
    }

    public static int r(View view, int i9) {
        Context context = view.getContext();
        TypedValue Z6 = AbstractC1002u1.Z(i9, view.getContext(), view.getClass().getCanonicalName());
        int i10 = Z6.resourceId;
        if (i10 != 0) {
            return context.getColor(i10);
        }
        return Z6.data;
    }

    public static boolean s(int i9) {
        if (i9 != 0 && H.a.d(i9) > 0.5d) {
            return true;
        }
        return false;
    }

    public static int t(int i9, float f9, int i10) {
        return H.a.f(H.a.h(i10, Math.round(Color.alpha(i10) * f9)), i9);
    }

    public static long u(int i9, String str) {
        int k5 = k(0, i9, str, false);
        Matcher matcher = i8.q.f19138m.matcher(str);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (k5 < i9) {
            int k9 = k(k5 + 1, i9, str, true);
            matcher.region(k5, k9);
            if (i11 == -1 && matcher.usePattern(i8.q.f19138m).matches()) {
                String group = matcher.group(1);
                kotlin.jvm.internal.h.d(group, "matcher.group(1)");
                i11 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                kotlin.jvm.internal.h.d(group2, "matcher.group(2)");
                i14 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                kotlin.jvm.internal.h.d(group3, "matcher.group(3)");
                i15 = Integer.parseInt(group3);
            } else if (i12 == -1 && matcher.usePattern(i8.q.f19137l).matches()) {
                String group4 = matcher.group(1);
                kotlin.jvm.internal.h.d(group4, "matcher.group(1)");
                i12 = Integer.parseInt(group4);
            } else {
                if (i13 == -1) {
                    Pattern pattern = i8.q.f19136k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        kotlin.jvm.internal.h.d(group5, "matcher.group(1)");
                        Locale US = Locale.US;
                        kotlin.jvm.internal.h.d(US, "US");
                        String lowerCase = group5.toLowerCase(US);
                        kotlin.jvm.internal.h.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        kotlin.jvm.internal.h.d(pattern2, "MONTH_PATTERN.pattern()");
                        i13 = W7.d.S(pattern2, lowerCase, 0, 6) / 4;
                    }
                }
                if (i10 == -1 && matcher.usePattern(i8.q.j).matches()) {
                    String group6 = matcher.group(1);
                    kotlin.jvm.internal.h.d(group6, "matcher.group(1)");
                    i10 = Integer.parseInt(group6);
                }
            }
            k5 = k(k9 + 1, i9, str, false);
        }
        if (70 <= i10 && i10 < 100) {
            i10 += 1900;
        }
        if (i10 >= 0 && i10 < 70) {
            i10 += 2000;
        }
        if (i10 >= 1601) {
            if (i13 != -1) {
                if (1 <= i12 && i12 < 32) {
                    if (i11 >= 0 && i11 < 24) {
                        if (i14 >= 0 && i14 < 60) {
                            if (i15 >= 0 && i15 < 60) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(k8.c.f20145e);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i10);
                                gregorianCalendar.set(2, i13 - 1);
                                gregorianCalendar.set(5, i12);
                                gregorianCalendar.set(11, i11);
                                gregorianCalendar.set(12, i14);
                                gregorianCalendar.set(13, i15);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final File v(Context context, String name) {
        kotlin.jvm.internal.h.e(name, "name");
        String fileName = name.concat(".preferences_pb");
        kotlin.jvm.internal.h.e(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
    }

    public static final Cursor w(E db, G g9, boolean z9) {
        int i9;
        kotlin.jvm.internal.h.e(db, "db");
        db.a();
        db.b();
        Cursor c3 = db.i().Z().r(g9);
        if (z9 && (c3 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) c3;
            int count = abstractWindowedCursor.getCount();
            if (abstractWindowedCursor.hasWindow()) {
                i9 = abstractWindowedCursor.getWindow().getNumRows();
            } else {
                i9 = count;
            }
            if (i9 < count) {
                kotlin.jvm.internal.h.e(c3, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(c3.getColumnNames(), c3.getCount());
                    while (c3.moveToNext()) {
                        Object[] objArr = new Object[c3.getColumnCount()];
                        int columnCount = c3.getColumnCount();
                        for (int i10 = 0; i10 < columnCount; i10++) {
                            int type = c3.getType(i10);
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 2) {
                                        if (type != 3) {
                                            if (type == 4) {
                                                objArr[i10] = c3.getBlob(i10);
                                            } else {
                                                throw new IllegalStateException();
                                            }
                                        } else {
                                            objArr[i10] = c3.getString(i10);
                                        }
                                    } else {
                                        objArr[i10] = Double.valueOf(c3.getDouble(i10));
                                    }
                                } else {
                                    objArr[i10] = Long.valueOf(c3.getLong(i10));
                                }
                            } else {
                                objArr[i10] = null;
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    c3.close();
                    return matrixCursor;
                } finally {
                }
            }
        }
        return c3;
    }

    public static boolean x(Context context) {
        ApplicationInfo applicationInfo;
        Intent putExtra = new Intent().addFlags(268435456).setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(putExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                putExtra.setPackage(applicationInfo.packageName);
                context.startActivity(putExtra);
                return true;
            }
        }
        return false;
    }

    public static final void y(int i9, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i9);
        if (str != null) {
            sb.append(", message: ".concat(str));
        }
        throw new SQLException(sb.toString());
    }

    public static Bitmap z(Drawable drawable, int i9, int i10, int i11) {
        if ((i11 & 1) != 0) {
            i9 = drawable.getIntrinsicWidth();
        }
        if ((i11 & 2) != 0) {
            i10 = drawable.getIntrinsicHeight();
        }
        boolean z9 = drawable instanceof BitmapDrawable;
        if (z9 && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        if (z9) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                if (i9 == bitmapDrawable.getBitmap().getWidth() && i10 == bitmapDrawable.getBitmap().getHeight()) {
                    return bitmapDrawable.getBitmap();
                }
                return Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i9, i10, true);
            }
            throw new IllegalArgumentException("bitmap is null");
        }
        Rect bounds = drawable.getBounds();
        int i12 = bounds.left;
        int i13 = bounds.top;
        int i14 = bounds.right;
        int i15 = bounds.bottom;
        Bitmap createBitmap = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, i9, i10);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i12, i13, i14, i15);
        return createBitmap;
    }
}
