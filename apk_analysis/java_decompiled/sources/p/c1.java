package p;

import B6.C0011a0;
import B6.C0017d0;
import B6.C0023g0;
import B6.C0025h0;
import a6.C0501a;
import a6.C0502b;
import a6.C0503c;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.android.gms.internal.measurement.Y1;
import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.C1036g;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import f5.C1177i;
import f5.C1185q;
import j2.C1435b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharConversionException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import k4.C1499E;
import p.c1;
import v6.C2112c;
import y6.C2218a;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f21976a = null;

    /* renamed from: b, reason: collision with root package name */
    public Object f21977b = null;

    /* renamed from: c, reason: collision with root package name */
    public Object f21978c = null;

    /* renamed from: d, reason: collision with root package name */
    public Object f21979d = null;

    /* renamed from: e, reason: collision with root package name */
    public Object f21980e = null;

    /* renamed from: f, reason: collision with root package name */
    public Object f21981f = null;

    /* renamed from: g, reason: collision with root package name */
    public Object f21982g;

    public static B6.P a(B6.P p9, A6.f fVar, E6.e eVar, Map map) {
        Map unmodifiableMap;
        B6.O a5 = p9.a();
        String f9 = ((A6.d) fVar.f505b).f();
        if (f9 != null) {
            a5.f838e = new C0017d0(f9);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean isEmpty = map.isEmpty();
        A6.t tVar = (A6.t) eVar.f1970d;
        if (isEmpty) {
            unmodifiableMap = ((A6.e) ((AtomicMarkableReference) tVar.f540b).getReference()).a();
        } else {
            HashMap hashMap = new HashMap(((A6.e) ((AtomicMarkableReference) tVar.f540b).getReference()).a());
            int i9 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String b9 = A6.e.b(1024, (String) entry.getKey());
                if (hashMap.size() >= 64 && !hashMap.containsKey(b9)) {
                    i9++;
                } else {
                    hashMap.put(b9, A6.e.b(1024, (String) entry.getValue()));
                }
            }
            if (i9 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i9 + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            unmodifiableMap = Collections.unmodifiableMap(hashMap);
        }
        List g9 = g(unmodifiableMap);
        List g10 = g(((A6.e) ((AtomicMarkableReference) ((A6.t) eVar.f1971e).f540b).getReference()).a());
        if (!g9.isEmpty() || !g10.isEmpty()) {
            B6.Q q9 = p9.f844c;
            a5.f836c = new B6.Q(q9.f848a, g9, g10, q9.f851d, q9.f852e, q9.f853f, q9.f854g);
        }
        return a5.a();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, B6.e0] */
    public static B6.K0 b(B6.P p9, E6.e eVar) {
        List a5 = ((A6.p) eVar.f1972f).a();
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < a5.size(); i9++) {
            A6.o oVar = (A6.o) a5.get(i9);
            oVar.getClass();
            ?? obj = new Object();
            A6.b bVar = (A6.b) oVar;
            String str = bVar.f495e;
            if (str != null) {
                String str2 = bVar.f492b;
                if (str2 != null) {
                    obj.f940a = new C0023g0(str2, str);
                    String str3 = bVar.f493c;
                    if (str3 != null) {
                        obj.f941b = str3;
                        String str4 = bVar.f494d;
                        if (str4 != null) {
                            obj.f942c = str4;
                            obj.f943d = bVar.f496f;
                            obj.f944e = (byte) (obj.f944e | 1);
                            arrayList.add(obj.a());
                        } else {
                            throw new NullPointerException("Null parameterValue");
                        }
                    } else {
                        throw new NullPointerException("Null parameterKey");
                    }
                } else {
                    throw new NullPointerException("Null rolloutId");
                }
            } else {
                throw new NullPointerException("Null variantId");
            }
        }
        if (arrayList.isEmpty()) {
            return p9;
        }
        B6.O a9 = p9.a();
        a9.f839f = new C0025h0(arrayList);
        return a9.a();
    }

    public static String d(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = bufferedInputStream.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        String byteArrayOutputStream2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArrayOutputStream2;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, p.c1] */
    public static c1 e(Context context, y6.u uVar, E6.e eVar, C2218a c2218a, A6.f fVar, E6.e eVar2, A1.g gVar, G6.e eVar3, C1499E c1499e, y6.i iVar, z6.d dVar) {
        y6.q qVar = new y6.q(context, uVar, c2218a, gVar, eVar3);
        E6.c cVar = new E6.c(eVar, eVar3, iVar);
        C6.b bVar = F6.a.f2568b;
        Y2.s.b(context);
        F6.a aVar = new F6.a(new F6.c(Y2.s.a().c(new W2.a(F6.a.f2569c, F6.a.f2570d)).a("FIREBASE_CRASHLYTICS_REPORT", new V2.c("json"), F6.a.f2571e), eVar3.i(), c1499e));
        ?? obj = new Object();
        obj.f21976a = qVar;
        obj.f21977b = cVar;
        obj.f21978c = aVar;
        obj.f21979d = fVar;
        obj.f21980e = eVar2;
        obj.f21981f = uVar;
        obj.f21982g = dVar;
        return obj;
    }

    public static List g(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new B6.F(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new E6.a(22));
        return Collections.unmodifiableList(arrayList);
    }

    public static byte[] i(Context context, String str, String str2) {
        SharedPreferences sharedPreferences;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
            } else {
                sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
            }
            try {
                String string = sharedPreferences.getString(str, null);
                if (string == null) {
                    return null;
                }
                return Y1.j(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(A0.a.n("can't read keyset; the pref value ", str, " is not a valid hex string"));
            }
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    public static U5.f j(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            h6.g0 D8 = h6.g0.D(byteArrayInputStream, C1043n.a());
            byteArrayInputStream.close();
            return new U5.f(3, (h6.d0) ((h6.g0) android.support.v4.media.session.y.I(D8).f9331b).v());
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public synchronized C0501a c() {
        C0501a c0501a;
        try {
            if (((String) this.f21977b) != null) {
                synchronized (C0501a.f9158b) {
                    try {
                        byte[] i9 = i((Context) this.f21976a, (String) this.f21977b, (String) this.f21978c);
                        if (i9 == null) {
                            if (((String) this.f21979d) != null) {
                                this.f21980e = l();
                            }
                            this.f21982g = f();
                        } else if (((String) this.f21979d) != null) {
                            this.f21982g = k(i9);
                        } else {
                            this.f21982g = j(i9);
                        }
                        c0501a = new C0501a(this);
                    } finally {
                    }
                }
            } else {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0501a;
    }

    public U5.f f() {
        SharedPreferences.Editor edit;
        if (((U5.g) this.f21981f) != null) {
            U5.f fVar = new U5.f(3, h6.g0.C());
            U5.g gVar = (U5.g) this.f21981f;
            synchronized (fVar) {
                fVar.a(gVar.f7504a);
            }
            fVar.h(U5.o.a((h6.g0) fVar.c().f9331b).y().A());
            Context context = (Context) this.f21976a;
            String str = (String) this.f21977b;
            String str2 = (String) this.f21978c;
            if (str != null) {
                Context applicationContext = context.getApplicationContext();
                if (str2 == null) {
                    edit = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                } else {
                    edit = applicationContext.getSharedPreferences(str2, 0).edit();
                }
                if (((C0502b) this.f21980e) != null) {
                    android.support.v4.media.session.y c3 = fVar.c();
                    C0502b c0502b = (C0502b) this.f21980e;
                    byte[] bArr = new byte[0];
                    h6.g0 g0Var = (h6.g0) c3.f9331b;
                    byte[] a5 = c0502b.a(g0Var.e(), bArr);
                    try {
                        if (h6.g0.E(c0502b.b(a5, bArr), C1043n.a()).equals(g0Var)) {
                            h6.M z9 = h6.N.z();
                            C1036g d9 = AbstractC1037h.d(a5, 0, a5.length);
                            z9.h();
                            h6.N.w((h6.N) z9.f16404b, d9);
                            h6.k0 a9 = U5.o.a(g0Var);
                            z9.h();
                            h6.N.x((h6.N) z9.f16404b, a9);
                            if (!edit.putString(str, Y1.k(((h6.N) z9.c()).e())).commit()) {
                                throw new IOException("Failed to write to SharedPreferences");
                            }
                        } else {
                            throw new GeneralSecurityException("cannot encrypt keyset");
                        }
                    } catch (com.google.crypto.tink.shaded.protobuf.B unused) {
                        throw new GeneralSecurityException("invalid keyset, corrupted key material");
                    }
                } else if (!edit.putString(str, Y1.k(((h6.g0) fVar.c().f9331b).e())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
                return fVar;
            }
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        throw new GeneralSecurityException("cannot read or generate keyset");
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, B6.O] */
    public void h(Throwable th, Thread thread, String str, final A6.c cVar, boolean z9) {
        A1.g gVar;
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it;
        A1.g gVar2;
        boolean z10;
        final boolean equals = str.equals("crash");
        y6.q qVar = (y6.q) this.f21976a;
        Context context = qVar.f25102a;
        int i9 = context.getResources().getConfiguration().orientation;
        Stack stack = new Stack();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            stack.push(th2);
        }
        Boolean bool = null;
        com.google.firebase.messaging.s sVar = null;
        while (true) {
            boolean isEmpty = stack.isEmpty();
            gVar = qVar.f25105d;
            if (isEmpty) {
                break;
            }
            Throwable th3 = (Throwable) stack.pop();
            sVar = new com.google.firebase.messaging.s(th3.getLocalizedMessage(), th3.getClass().getName(), gVar.o(th3.getStackTrace()), sVar);
        }
        ?? obj = new Object();
        obj.f835b = str;
        obj.f834a = cVar.f498b;
        obj.f840g = (byte) (obj.f840g | 1);
        B6.D0 e8 = C2112c.f23901b.e(context);
        int i10 = ((C0011a0) e8).f897c;
        if (i10 > 0) {
            if (i10 != 100) {
                z10 = true;
            } else {
                z10 = false;
            }
            bool = Boolean.valueOf(z10);
        }
        ArrayList d9 = C2112c.d(context);
        byte b9 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) sVar.f16506d;
        String name = thread.getName();
        Boolean bool2 = bool;
        if (name != null) {
            byte b10 = (byte) 1;
            List d10 = y6.q.d(stackTraceElementArr, 4);
            if (d10 != null) {
                if (b10 == 1) {
                    arrayList.add(new B6.W(4, name, d10));
                    if (z9) {
                        Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = Thread.getAllStackTraces().entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry<Thread, StackTraceElement[]> next = it2.next();
                            Thread key = next.getKey();
                            if (!key.equals(thread)) {
                                StackTraceElement[] o9 = gVar.o(next.getValue());
                                String name2 = key.getName();
                                if (name2 != null) {
                                    it = it2;
                                    List d11 = y6.q.d(o9, 0);
                                    if (d11 != null) {
                                        if (b10 == 1) {
                                            gVar2 = gVar;
                                            arrayList.add(new B6.W(0, name2, d11));
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            if (b10 == 0) {
                                                sb.append(" importance");
                                            }
                                            throw new IllegalStateException(u0.z.f("Missing required properties:", sb));
                                        }
                                    } else {
                                        throw new NullPointerException("Null frames");
                                    }
                                } else {
                                    throw new NullPointerException("Null name");
                                }
                            } else {
                                it = it2;
                                gVar2 = gVar;
                            }
                            it2 = it;
                            gVar = gVar2;
                        }
                    }
                    List unmodifiableList = Collections.unmodifiableList(arrayList);
                    B6.U c3 = y6.q.c(sVar, 0);
                    B6.V e9 = y6.q.e();
                    List a5 = qVar.a();
                    if (a5 != null) {
                        B6.S s9 = new B6.S(unmodifiableList, c3, null, e9, a5);
                        if (b9 == 1) {
                            obj.f836c = new B6.Q(s9, null, null, bool2, e8, d9, i9);
                            obj.f837d = qVar.b(i9);
                            B6.P a9 = obj.a();
                            A6.f fVar = (A6.f) this.f21979d;
                            E6.e eVar = (E6.e) this.f21980e;
                            final B6.K0 b11 = b(a(a9, fVar, eVar, cVar.f499c), eVar);
                            if (!z9) {
                                ((z6.d) this.f21982g).f25506b.a(new Runnable() { // from class: y6.w
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        c1 c1Var = c1.this;
                                        c1Var.getClass();
                                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                            Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                                        }
                                        ((E6.c) c1Var.f21977b).d(b11, cVar.f497a, equals);
                                    }
                                });
                                return;
                            } else {
                                ((E6.c) this.f21977b).d(b11, cVar.f497a, equals);
                                return;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder();
                        if (b9 == 0) {
                            sb2.append(" uiOrientation");
                        }
                        throw new IllegalStateException(u0.z.f("Missing required properties:", sb2));
                    }
                    throw new NullPointerException("Null binaries");
                }
                StringBuilder sb3 = new StringBuilder();
                if (b10 == 0) {
                    sb3.append(" importance");
                }
                throw new IllegalStateException(u0.z.f("Missing required properties:", sb3));
            }
            throw new NullPointerException("Null frames");
        }
        throw new NullPointerException("Null name");
    }

    public U5.f k(byte[] bArr) {
        try {
            this.f21980e = new C0503c().c((String) this.f21979d);
            try {
                return new U5.f(3, (h6.d0) ((h6.g0) android.support.v4.media.session.y.U(new U5.f(1, new ByteArrayInputStream(bArr)), (C0502b) this.f21980e).f9331b).v());
            } catch (IOException | GeneralSecurityException e8) {
                try {
                    return j(bArr);
                } catch (IOException unused) {
                    throw e8;
                }
            }
        } catch (GeneralSecurityException | ProviderException e9) {
            try {
                U5.f j = j(bArr);
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e9);
                return j;
            } catch (IOException unused2) {
                throw e9;
            }
        }
    }

    public C0502b l() {
        C0503c c0503c = new C0503c();
        try {
            boolean a5 = C0503c.a((String) this.f21979d);
            try {
                return c0503c.c((String) this.f21979d);
            } catch (GeneralSecurityException | ProviderException e8) {
                if (a5) {
                    Log.w("a", "cannot use Android Keystore, it'll be disabled", e8);
                    return null;
                }
                throw new KeyStoreException(A0.a.n("the master key ", (String) this.f21979d, " exists but is unusable"), e8);
            }
        } catch (GeneralSecurityException | ProviderException e9) {
            Log.w("a", "cannot use Android Keystore, it'll be disabled", e9);
            return null;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:? -> B:43:0x0138). Please report as a decompilation issue!!! */
    public C1185q m(Executor executor, String str) {
        y6.b bVar;
        boolean z9;
        ArrayBlockingQueue arrayBlockingQueue;
        C1177i c1177i;
        ArrayList b9 = ((E6.c) this.f21977b).b();
        ArrayList arrayList = new ArrayList();
        int size = b9.size();
        int i9 = 0;
        while (i9 < size) {
            int i10 = i9 + 1;
            File file = (File) b9.get(i9);
            try {
                C6.b bVar2 = E6.c.f1959g;
                String e8 = E6.c.e(file);
                bVar2.getClass();
                arrayList.add(new y6.b(C6.b.i(e8), file.getName(), file));
            } catch (IOException e9) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e9);
                file.delete();
            }
            i9 = i10;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList.get(i11);
            i11++;
            y6.b bVar3 = (y6.b) obj;
            if (str == null || str.equals(bVar3.f25031b)) {
                F6.a aVar = (F6.a) this.f21978c;
                B6.B b10 = bVar3.f25030a;
                boolean z10 = true;
                if (b10.f753f != null && b10.f754g != null) {
                    bVar = bVar3;
                } else {
                    y6.t b11 = ((y6.u) this.f21981f).b(true);
                    B6.A a5 = bVar3.f25030a.a();
                    a5.f741e = b11.f25114a;
                    B6.A a9 = a5.a().a();
                    a9.f742f = b11.f25115b;
                    bVar = new y6.b(a9.a(), bVar3.f25031b, bVar3.f25032c);
                }
                if (str != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                F6.c cVar = aVar.f2572a;
                ArrayBlockingQueue arrayBlockingQueue2 = cVar.f2582f;
                synchronized (arrayBlockingQueue2) {
                    try {
                        C1177i c1177i2 = new C1177i();
                        if (z9) {
                            ((AtomicInteger) cVar.f2585i.f19985b).getAndIncrement();
                            if (cVar.f2582f.size() >= cVar.f2581e) {
                                z10 = false;
                            }
                            if (z10) {
                                C2112c c2112c = C2112c.f23900a;
                                c2112c.c("Enqueueing report: " + bVar.f25031b);
                                c2112c.c("Queue size: " + cVar.f2582f.size());
                                try {
                                    arrayBlockingQueue = arrayBlockingQueue2;
                                    try {
                                        c1177i = c1177i2;
                                        cVar.f2583g.execute(new A4.j(cVar, bVar, c1177i2, 1, false));
                                        c2112c.c("Closing task for report: " + bVar.f25031b);
                                        c1177i.d(bVar);
                                    } catch (Throwable th) {
                                        th = th;
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    arrayBlockingQueue = arrayBlockingQueue2;
                                    throw th;
                                }
                            } else {
                                c1177i = c1177i2;
                                cVar.a();
                                String str2 = "Dropping report due to queue being full: " + bVar.f25031b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str2, null);
                                }
                                ((AtomicInteger) cVar.f2585i.f19986c).getAndIncrement();
                                c1177i.d(bVar);
                            }
                        } else {
                            c1177i = c1177i2;
                            cVar.b(bVar, c1177i);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        arrayBlockingQueue = arrayBlockingQueue2;
                    }
                }
                arrayList2.add(c1177i.f17413a.l(executor, new C1435b(21, this)));
            }
        }
        return s8.n.C(arrayList2);
    }
}
