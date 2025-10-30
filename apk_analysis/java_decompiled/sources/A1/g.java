package A1;

import A3.B;
import A3.C;
import A3.F;
import A3.G;
import A3.I;
import A3.x;
import A4.r;
import C2.O;
import C3.C0081b;
import C3.k;
import C3.l;
import D4.s;
import F0.A0;
import F0.B0;
import F0.C0;
import F0.ExecutorC0101e;
import F0.Y;
import F0.r0;
import F0.x0;
import G0.D;
import S5.o;
import a.AbstractC0485a;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import b7.C0701c;
import co.notix.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import f5.AbstractC1176h;
import f5.C1177i;
import f5.C1185q;
import f5.InterfaceC1169a;
import f5.InterfaceC1171c;
import f5.InterfaceC1175g;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l4.AbstractC1566a;
import l4.y;
import o1.C1671f;
import org.json.JSONObject;
import q3.C1899d;
import q3.C1902g;
import q3.InterfaceC1900e;
import q3.InterfaceC1907l;
import s.AbstractC1938h;
import s.C1937g;
import s.C1939i;
import s8.n;

/* loaded from: classes.dex */
public final class g implements j, InterfaceC1900e, B, InterfaceC1169a, l, InterfaceC1171c, P0.b, InterfaceC1175g, H6.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17a;

    /* renamed from: b, reason: collision with root package name */
    public Object f18b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19c;

    public /* synthetic */ g(Object obj, int i9, Object obj2) {
        this.f17a = i9;
        this.f18b = obj;
        this.f19c = obj2;
    }

    public static int u(int i9, int i10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i9; i13++) {
            i11++;
            if (i11 == i10) {
                i12++;
                i11 = 0;
            } else if (i11 > i10) {
                i12++;
                i11 = 1;
            }
        }
        if (i11 + 1 > i10) {
            return i12 + 1;
        }
        return i12;
    }

    public void A(int i9, int i10) {
        int[] iArr = (int[]) this.f18b;
        if (iArr != null && i9 < iArr.length) {
            int i11 = i9 + i10;
            r(i11);
            int[] iArr2 = (int[]) this.f18b;
            System.arraycopy(iArr2, i9, iArr2, i11, (iArr2.length - i9) - i10);
            Arrays.fill((int[]) this.f18b, i9, i11, -1);
            ArrayList arrayList = (ArrayList) this.f19c;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    x0 x0Var = (x0) ((ArrayList) this.f19c).get(size);
                    int i12 = x0Var.f2285a;
                    if (i12 >= i9) {
                        x0Var.f2285a = i12 + i10;
                    }
                }
            }
        }
    }

    public void B(int i9, int i10) {
        int[] iArr = (int[]) this.f18b;
        if (iArr != null && i9 < iArr.length) {
            int i11 = i9 + i10;
            r(i11);
            int[] iArr2 = (int[]) this.f18b;
            System.arraycopy(iArr2, i11, iArr2, i9, (iArr2.length - i9) - i10);
            int[] iArr3 = (int[]) this.f18b;
            Arrays.fill(iArr3, iArr3.length - i10, iArr3.length, -1);
            ArrayList arrayList = (ArrayList) this.f19c;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    x0 x0Var = (x0) ((ArrayList) this.f19c).get(size);
                    int i12 = x0Var.f2285a;
                    if (i12 >= i9) {
                        if (i12 < i11) {
                            ((ArrayList) this.f19c).remove(size);
                        } else {
                            x0Var.f2285a = i12 - i10;
                        }
                    }
                }
            }
        }
    }

    public void C(M.g gVar) {
        int i9 = gVar.f4664b;
        ExecutorC0101e executorC0101e = (ExecutorC0101e) this.f19c;
        C1671f c1671f = (C1671f) this.f18b;
        if (i9 == 0) {
            executorC0101e.execute(new o(c1671f, 11, gVar.f4663a));
        } else {
            executorC0101e.execute(new s(i9, 2, c1671f));
        }
    }

    public Y D(r0 r0Var, int i9) {
        C0 c02;
        Y y9;
        C1939i c1939i = (C1939i) this.f18b;
        int d9 = c1939i.d(r0Var);
        if (d9 >= 0 && (c02 = (C0) c1939i.i(d9)) != null) {
            int i10 = c02.f2002a;
            if ((i10 & i9) != 0) {
                int i11 = i10 & (~i9);
                c02.f2002a = i11;
                if (i9 == 4) {
                    y9 = c02.f2003b;
                } else if (i9 == 8) {
                    y9 = c02.f2004c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i11 & 12) == 0) {
                    c1939i.g(d9);
                    c02.f2002a = 0;
                    c02.f2003b = null;
                    c02.f2004c = null;
                    C0.f2001d.c(c02);
                }
                return y9;
            }
        }
        return null;
    }

    public void E(r0 r0Var) {
        C0 c02 = (C0) ((C1939i) this.f18b).get(r0Var);
        if (c02 == null) {
            return;
        }
        c02.f2002a &= -2;
    }

    public void F(r0 r0Var) {
        C1937g c1937g = (C1937g) this.f19c;
        int m9 = c1937g.m() - 1;
        while (true) {
            if (m9 < 0) {
                break;
            }
            if (r0Var == c1937g.n(m9)) {
                Object[] objArr = c1937g.f22654c;
                Object obj = objArr[m9];
                Object obj2 = AbstractC1938h.f22656a;
                if (obj != obj2) {
                    objArr[m9] = obj2;
                    c1937g.f22652a = true;
                }
            } else {
                m9--;
            }
        }
        C0 c02 = (C0) ((C1939i) this.f18b).remove(r0Var);
        if (c02 != null) {
            c02.f2002a = 0;
            c02.f2003b = null;
            c02.f2004c = null;
            C0.f2001d.c(c02);
        }
    }

    @Override // f5.InterfaceC1171c
    public void G(AbstractC1176h abstractC1176h) {
        ((Map) ((g) this.f19c).f19c).remove((C1177i) this.f18b);
    }

    public void H() {
        synchronized (this) {
            ((AtomicInteger) this.f18b).decrementAndGet();
            if (((AtomicInteger) this.f18b).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public void I(boolean z9, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.f18b)) {
            hashMap = new HashMap((Map) this.f18b);
        }
        synchronized (((Map) this.f19c)) {
            hashMap2 = new HashMap((Map) this.f19c);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z9 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).G(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z9 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C1177i) entry2.getKey()).c(new C4.e(status));
            }
        }
    }

    @Override // q3.InterfaceC1900e
    public void a() {
        byte[] bArr = y.f20558f;
        r rVar = (r) this.f19c;
        rVar.getClass();
        rVar.F(bArr.length, bArr);
    }

    @Override // A3.B
    public void c(r rVar) {
        G g9;
        if (rVar.x() == 0 && (rVar.x() & 128) != 0) {
            rVar.I(6);
            int e8 = rVar.e() / 4;
            int i9 = 0;
            while (true) {
                g9 = (G) this.f19c;
                if (i9 >= e8) {
                    break;
                }
                Z3.f fVar = (Z3.f) this.f18b;
                rVar.h(fVar.f9036b, 0, 4);
                fVar.o(0);
                int i10 = fVar.i(16);
                fVar.r(3);
                if (i10 == 0) {
                    fVar.r(13);
                } else {
                    int i11 = fVar.i(13);
                    if (g9.f60f.get(i11) == null) {
                        g9.f60f.put(i11, new C(new F(g9, i11)));
                        g9.f65l++;
                    }
                }
                i9++;
            }
            if (g9.f55a != 2) {
                g9.f60f.remove(0);
            }
        }
    }

    @Override // A1.j
    public c d(b bVar) {
        e eVar = (e) ((f) this.f19c).h(bVar);
        if (eVar != null) {
            return new c(eVar.f12a, eVar.f13b);
        }
        return null;
    }

    @Override // A1.j
    public void e(int i9) {
        int i10;
        if (i9 >= 40) {
            ((f) this.f19c).q(-1);
            return;
        }
        if (10 <= i9 && i9 < 20) {
            f fVar = (f) this.f19c;
            synchronized (((d0.o) fVar.f2314g)) {
                i10 = fVar.f2310c;
            }
            fVar.q(i10 / 2);
        }
    }

    @Override // A1.j
    public void f(b bVar, Bitmap bitmap, Map map) {
        int i9;
        int o9 = AbstractC0485a.o(bitmap);
        f fVar = (f) this.f19c;
        synchronized (((d0.o) fVar.f2314g)) {
            i9 = fVar.f2309b;
        }
        if (o9 <= i9) {
            ((f) this.f19c).l(bVar, new e(bitmap, map, o9));
        } else {
            ((f) this.f19c).m(bVar);
            ((i) this.f18b).l(bVar, bitmap, map, o9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb A[Catch: all -> 0x00bc, TRY_ENTER, TryCatch #6 {all -> 0x00bc, blocks: (B:61:0x00bb, B:62:0x00be, B:63:0x00d6), top: B:59:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00be A[Catch: all -> 0x00bc, TryCatch #6 {all -> 0x00bc, blocks: (B:61:0x00bb, B:62:0x00be, B:63:0x00d6), top: B:59:0x00b9 }] */
    @Override // P0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public P0.a g(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.g.g(java.lang.String):P0.a");
    }

    @Override // q3.InterfaceC1900e
    public C1899d h(C1902g c1902g, long j) {
        long j4 = c1902g.f22312d;
        int min = (int) Math.min(20000L, c1902g.f22311c - j4);
        r rVar = (r) this.f19c;
        rVar.E(min);
        c1902g.t((byte[]) rVar.f384c, 0, min, false);
        int i9 = -1;
        int i10 = -1;
        long j9 = -9223372036854775807L;
        while (rVar.e() >= 4) {
            if (x.a(rVar.f382a, (byte[]) rVar.f384c) != 442) {
                rVar.I(1);
            } else {
                rVar.I(4);
                long c3 = A3.y.c(rVar);
                if (c3 != -9223372036854775807L) {
                    long b9 = ((l4.x) this.f18b).b(c3);
                    if (b9 > j) {
                        if (j9 == -9223372036854775807L) {
                            return new C1899d(b9, j4, -1);
                        }
                        return new C1899d(-9223372036854775807L, j4 + i10, 0);
                    }
                    if (b9 + 100000 > j) {
                        return new C1899d(-9223372036854775807L, j4 + rVar.f382a, 0);
                    }
                    j9 = b9;
                    i10 = rVar.f382a;
                }
                int i11 = rVar.f383b;
                if (rVar.e() < 10) {
                    rVar.H(i11);
                } else {
                    rVar.I(9);
                    int x5 = rVar.x() & 7;
                    if (rVar.e() < x5) {
                        rVar.H(i11);
                    } else {
                        rVar.I(x5);
                        if (rVar.e() < 4) {
                            rVar.H(i11);
                        } else {
                            if (x.a(rVar.f382a, (byte[]) rVar.f384c) == 443) {
                                rVar.I(4);
                                int C8 = rVar.C();
                                if (rVar.e() < C8) {
                                    rVar.H(i11);
                                } else {
                                    rVar.I(C8);
                                }
                            }
                            while (true) {
                                if (rVar.e() < 4) {
                                    break;
                                }
                                int a5 = x.a(rVar.f382a, (byte[]) rVar.f384c);
                                if (a5 == 442 || a5 == 441 || (a5 >>> 8) != 1) {
                                    break;
                                }
                                rVar.I(4);
                                if (rVar.e() < 2) {
                                    rVar.H(i11);
                                    break;
                                }
                                rVar.H(Math.min(rVar.f383b, rVar.f382a + rVar.C()));
                            }
                        }
                    }
                }
                i9 = rVar.f382a;
            }
        }
        if (j9 != -9223372036854775807L) {
            return new C1899d(j9, j4 + i9, -2);
        }
        return C1899d.f22299d;
    }

    @Override // f5.InterfaceC1169a
    public Object i(AbstractC1176h abstractC1176h) {
        A4.b bVar = (A4.b) this.f18b;
        bVar.getClass();
        if (!abstractC1176h.j()) {
            return abstractC1176h;
        }
        Bundle bundle = (Bundle) abstractC1176h.g();
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return bVar.a((Bundle) this.f19c).m(A4.i.f351c, A4.d.f344d);
        }
        return abstractC1176h;
    }

    public void j(Object obj, String str) {
        ((ArrayList) this.f18b).add(AbstractC0953k1.o(str, "=", String.valueOf(obj)));
    }

    public void k(r0 r0Var, Y y9) {
        C1939i c1939i = (C1939i) this.f18b;
        C0 c02 = (C0) c1939i.get(r0Var);
        if (c02 == null) {
            c02 = C0.a();
            c1939i.put(r0Var, c02);
        }
        c02.f2004c = y9;
        c02.f2002a |= 8;
    }

    public boolean l() {
        synchronized (this) {
            if (((AtomicBoolean) this.f19c).get()) {
                return false;
            }
            ((AtomicInteger) this.f18b).incrementAndGet();
            return true;
        }
    }

    public void m() {
        int[] iArr = (int[]) this.f18b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f19c = null;
    }

    @Override // C3.l
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C3.c p(k kVar) {
        MediaCodec mediaCodec;
        String str = kVar.f1473a.f1479a;
        C3.c cVar = null;
        try {
            AbstractC1566a.c("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                C3.c cVar2 = new C3.c(mediaCodec, (HandlerThread) ((C0081b) this.f18b).get(), (HandlerThread) ((C0081b) this.f19c).get());
                try {
                    AbstractC1566a.v();
                    C3.c.b(cVar2, kVar.f1474b, kVar.f1476d, kVar.f1477e);
                    return cVar2;
                } catch (Exception e8) {
                    e = e8;
                    cVar = cVar2;
                    if (cVar == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        cVar.a();
                    }
                    throw e;
                }
            } catch (Exception e9) {
                e = e9;
            }
        } catch (Exception e10) {
            e = e10;
            mediaCodec = null;
        }
    }

    @Override // H6.a
    public StackTraceElement[] o(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        H6.a[] aVarArr = (H6.a[]) this.f18b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i9 = 0; i9 < 1; i9++) {
            H6.a aVar = aVarArr[i9];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.o(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((Q6.f) this.f19c).o(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    public byte[] q(F3.a aVar) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f18b;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.f19c;
        try {
            dataOutputStream.writeBytes(aVar.f2323a);
            dataOutputStream.writeByte(0);
            String str = aVar.f2324b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f2325c);
            dataOutputStream.writeLong(aVar.f2326d);
            dataOutputStream.write(aVar.f2327e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    public void r(int i9) {
        int[] iArr = (int[]) this.f18b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i9, 10) + 1];
            this.f18b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i9 >= iArr.length) {
            int length = iArr.length;
            while (length <= i9) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f18b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f18b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v1, types: [b7.c] */
    /* JADX WARN: Type inference failed for: r3v0, types: [long] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Closeable] */
    @Override // f5.InterfaceC1175g
    public C1185q s(Object obj) {
        FileWriter fileWriter;
        ?? r10 = (JSONObject) ((z6.d) this.f18b).f25507c.f25501a.submit(new G6.d(0, this)).get();
        Closeable closeable = null;
        if (r10 != 0) {
            G6.e eVar = (G6.e) this.f19c;
            G6.c K = ((C0701c) eVar.f2889c).K(r10);
            ?? r32 = K.f2881c;
            C1671f c1671f = (C1671f) eVar.f2891e;
            c1671f.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                try {
                    try {
                        r10.put("expires_at", r32);
                        try {
                            fileWriter = new FileWriter((File) c1671f.f21473b);
                        } catch (Exception e8) {
                            e = e8;
                            fileWriter = null;
                            Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                            r32 = fileWriter;
                            y6.g.b(r32, "Failed to close settings writer.");
                            G6.e.n(r10, "Loaded settings: ");
                            String str = ((G6.g) eVar.f2888b).f2901f;
                            SharedPreferences.Editor edit = ((Context) eVar.f2887a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                            edit.putString("existing_instance_identifier", str);
                            edit.apply();
                            ((AtomicReference) eVar.f2894h).set(K);
                            ((C1177i) ((AtomicReference) eVar.f2895i).get()).d(K);
                            return n.p(null);
                        }
                    } catch (Throwable th) {
                        th = th;
                        y6.g.b(closeable, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e9) {
                    e = e9;
                }
                try {
                    fileWriter.write(r10.toString());
                    fileWriter.flush();
                    r32 = fileWriter;
                } catch (Exception e10) {
                    e = e10;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    r32 = fileWriter;
                    y6.g.b(r32, "Failed to close settings writer.");
                    G6.e.n(r10, "Loaded settings: ");
                    String str2 = ((G6.g) eVar.f2888b).f2901f;
                    SharedPreferences.Editor edit2 = ((Context) eVar.f2887a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit2.putString("existing_instance_identifier", str2);
                    edit2.apply();
                    ((AtomicReference) eVar.f2894h).set(K);
                    ((C1177i) ((AtomicReference) eVar.f2895i).get()).d(K);
                    return n.p(null);
                }
                y6.g.b(r32, "Failed to close settings writer.");
                G6.e.n(r10, "Loaded settings: ");
                String str22 = ((G6.g) eVar.f2888b).f2901f;
                SharedPreferences.Editor edit22 = ((Context) eVar.f2887a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                edit22.putString("existing_instance_identifier", str22);
                edit22.apply();
                ((AtomicReference) eVar.f2894h).set(K);
                ((C1177i) ((AtomicReference) eVar.f2895i).get()).d(K);
            } catch (Throwable th2) {
                th = th2;
                closeable = r32;
                y6.g.b(closeable, "Failed to close settings writer.");
                throw th;
            }
        }
        return n.p(null);
    }

    public View t(int i9, int i10, int i11, int i12) {
        int i13;
        B0 b02 = (B0) this.f18b;
        int y9 = b02.y();
        int j = b02.j();
        if (i10 > i9) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        while (i9 != i10) {
            View x5 = b02.x(i9);
            int n7 = b02.n(x5);
            int B9 = b02.B(x5);
            A0 a02 = (A0) this.f19c;
            a02.f1986b = y9;
            a02.f1987c = j;
            a02.f1988d = n7;
            a02.f1989e = B9;
            if (i11 != 0) {
                a02.f1985a = i11;
                if (a02.a()) {
                    return x5;
                }
            }
            if (i12 != 0) {
                a02.f1985a = i12;
                if (a02.a()) {
                    view = x5;
                }
            }
            i9 += i13;
        }
        return view;
    }

    public String toString() {
        switch (this.f17a) {
            case 16:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f19c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f18b;
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    sb.append((String) arrayList.get(i9));
                    if (i9 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public String v(String str) {
        String str2 = (String) this.f19c;
        Resources resources = (Resources) this.f18b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void w() {
        ((SparseIntArray) this.f18b).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(G7.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof L2.o
            if (r0 == 0) goto L13
            r0 = r5
            L2.o r0 = (L2.o) r0
            int r1 = r0.f4623u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4623u = r1
            goto L18
        L13:
            L2.o r0 = new L2.o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f4621s
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f4623u
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            A1.g r0 = r0.f4620r
            a.AbstractC0485a.A(r5)
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            a.AbstractC0485a.A(r5)
            r0.f4620r = r4
            r0.f4623u = r3
            java.lang.Object r5 = r4.f18b
            C2.O r5 = (C2.O) r5
            r5.getClass()
            o7.y r2 = E2.d.f1935a
            C2.M r2 = new C2.M
            r3 = 0
            r2.<init>(r5, r3)
            java.lang.Object r5 = E2.d.a(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            v2.c r5 = (v2.AbstractC2103c) r5
            java.lang.Object r0 = r0.f19c
            b7.c r0 = (b7.C0701c) r0
            java.lang.Object r5 = Z0.a.n(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.g.x(G7.c):java.lang.Object");
    }

    public boolean y(View view) {
        B0 b02 = (B0) this.f18b;
        int y9 = b02.y();
        int j = b02.j();
        int n7 = b02.n(view);
        int B9 = b02.B(view);
        A0 a02 = (A0) this.f19c;
        a02.f1986b = y9;
        a02.f1987c = j;
        a02.f1988d = n7;
        a02.f1989e = B9;
        a02.f1985a = 24579;
        return a02.a();
    }

    public void z() {
        String str = (String) this.f18b;
        if (((FileChannel) this.f19c) == null) {
            try {
                File file = new File(str);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                this.f19c = channel;
                if (channel != null) {
                    channel.lock();
                }
            } catch (Throwable th) {
                FileChannel fileChannel = (FileChannel) this.f19c;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                this.f19c = null;
                throw new IllegalStateException(A0.a.n("Unable to lock file: '", str, "'."), th);
            }
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, int i9, boolean z9) {
        this.f17a = i9;
        this.f19c = obj;
        this.f18b = obj2;
    }

    public g(int i9, byte b9) {
        this.f17a = i9;
        switch (i9) {
            case R.styleable.GradientColor_android_endY /* 11 */:
                this.f18b = new SparseIntArray();
                this.f19c = new SparseIntArray();
                return;
            case 12:
                return;
            case 13:
            case 16:
            case 17:
            default:
                this.f18b = Collections.synchronizedMap(new WeakHashMap());
                this.f19c = Collections.synchronizedMap(new WeakHashMap());
                return;
            case 14:
                this.f18b = new C1939i(0);
                this.f19c = new C1937g();
                return;
            case 15:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f18b = byteArrayOutputStream;
                this.f19c = new DataOutputStream(byteArrayOutputStream);
                return;
            case 18:
                B4.f fVar = B4.f.f695d;
                this.f18b = new SparseIntArray();
                this.f19c = fVar;
                return;
        }
    }

    public g(Context context) {
        this.f17a = 17;
        F4.y.h(context);
        Resources resources = context.getResources();
        this.f18b = resources;
        this.f19c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public g(IBinder iBinder) {
        this.f17a = 3;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f18b = new Messenger(iBinder);
            this.f19c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f19c = new A4.h(iBinder);
            this.f18b = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public /* synthetic */ g(Object obj) {
        this.f17a = 16;
        this.f19c = obj;
        this.f18b = new ArrayList();
    }

    public g(String str, Z0.a aVar, C4.d dVar) {
        this.f17a = 6;
        this.f19c = str;
        this.f18b = aVar;
    }

    public g(O settingRepository, C0701c c0701c) {
        this.f17a = 27;
        kotlin.jvm.internal.h.e(settingRepository, "settingRepository");
        this.f18b = settingRepository;
        this.f19c = c0701c;
    }

    public g(H6.a[] aVarArr) {
        this.f17a = 25;
        this.f18b = aVarArr;
        this.f19c = new Q6.f(7);
    }

    public g(String str) {
        this.f17a = 24;
        this.f18b = str.concat(".lck");
    }

    public g(D d9) {
        this.f17a = 23;
        this.f18b = new AtomicInteger(0);
        this.f19c = new AtomicBoolean(false);
    }

    public g(G0.y yVar, P0.b actual) {
        this.f17a = 20;
        kotlin.jvm.internal.h.e(actual, "actual");
        this.f19c = yVar;
        this.f18b = actual;
    }

    public g(int i9, i iVar) {
        this.f17a = 0;
        this.f18b = iVar;
        this.f19c = new f(i9, this);
    }

    public g(l4.x xVar) {
        this.f17a = 1;
        this.f18b = xVar;
        this.f19c = new r(5, false);
    }

    public g(int i9) {
        this.f17a = 5;
        C0081b c0081b = new C0081b(i9, 0);
        C0081b c0081b2 = new C0081b(i9, 1);
        this.f18b = c0081b;
        this.f19c = c0081b2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [F0.A0, java.lang.Object] */
    public g(B0 b02) {
        this.f17a = 13;
        this.f18b = b02;
        ?? obj = new Object();
        obj.f1985a = 0;
        this.f19c = obj;
    }

    public g(ArrayList arrayList, ArrayList arrayList2) {
        this.f17a = 19;
        int size = arrayList.size();
        this.f18b = new int[size];
        this.f19c = new float[size];
        for (int i9 = 0; i9 < size; i9++) {
            ((int[]) this.f18b)[i9] = ((Integer) arrayList.get(i9)).intValue();
            ((float[]) this.f19c)[i9] = ((Float) arrayList2.get(i9)).floatValue();
        }
    }

    public g(int i9, int i10) {
        this.f17a = 19;
        this.f18b = new int[]{i9, i10};
        this.f19c = new float[]{0.0f, 1.0f};
    }

    public g(int i9, int i10, int i11) {
        this.f17a = 19;
        this.f18b = new int[]{i9, i10, i11};
        this.f19c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public g(G g9) {
        this.f17a = 2;
        this.f19c = g9;
        this.f18b = new Z3.f(4, new byte[4]);
    }

    @Override // A3.B
    public void b(l4.x xVar, InterfaceC1907l interfaceC1907l, I i9) {
    }
}
