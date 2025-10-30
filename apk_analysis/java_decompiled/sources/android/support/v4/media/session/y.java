package android.support.v4.media.session;

import A3.F;
import A3.I;
import C3.C0080a;
import D4.C0091j;
import F0.C0104h;
import F4.C0131j;
import F4.C0134m;
import a.AbstractC0485a;
import a6.C0502b;
import android.app.PendingIntent;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMetadata;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.Surface;
import android.widget.ImageView;
import androidx.lifecycle.AbstractServiceC0564z;
import androidx.lifecycle.C0563y;
import androidx.lifecycle.EnumC0554o;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import b5.C0650n0;
import b5.J1;
import b5.U0;
import b5.X;
import b6.C0687i;
import b6.C0693o;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import e6.C1145a;
import f5.AbstractC1176h;
import f5.AbstractC1178j;
import f5.C1185q;
import f5.InterfaceC1171c;
import h6.N;
import h6.f0;
import h6.g0;
import h6.r0;
import i.G;
import j3.L;
import j3.M;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import l4.AbstractC1566a;
import m0.AbstractC1579b;
import m0.C1578a;
import m0.C1581d;
import m3.C1589b;
import q3.C1903h;
import q3.InterfaceC1907l;
import t1.C2004m;

/* loaded from: classes.dex */
public final class y implements A3.B, InterfaceC1171c, B1.e, C3.m, R.g, U0, X {

    /* renamed from: e, reason: collision with root package name */
    public static int f9328e;

    /* renamed from: f, reason: collision with root package name */
    public static y f9329f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9330a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9331b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9332c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9333d;

    public /* synthetic */ y(int i9, byte b9) {
        this.f9330a = i9;
    }

    public static String C(String str, HashMap hashMap) {
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        Iterator it = hashMap.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        if (entry.getValue() == null) {
            str2 = "";
        } else {
            str2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
        }
        sb.append(str2);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            if (entry2.getValue() == null) {
                str3 = "";
            } else {
                str3 = URLEncoder.encode((String) entry2.getValue(), "UTF-8");
            }
            sb.append(str3);
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                sb2 = "&".concat(sb2);
            }
            return AbstractC0953k1.n(str, sb2);
        }
        return AbstractC0953k1.o(str, "?", sb2);
    }

    public static void E(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(y.class.getClassLoader());
        }
    }

    public static C1.e F(C1.i iVar, Throwable th) {
        if (th instanceof C1.l) {
            iVar.f1215z.getClass();
            C1.c cVar = H1.d.f2947a;
            iVar.f1215z.getClass();
        } else {
            iVar.f1215z.getClass();
            C1.c cVar2 = H1.d.f2947a;
        }
        return new C1.e(null, iVar, th);
    }

    public static final y I(g0 g0Var) {
        Integer valueOf;
        if (g0Var.z() > 0) {
            ArrayList arrayList = new ArrayList(g0Var.z());
            for (f0 f0Var : g0Var.A()) {
                f0Var.getClass();
                int B9 = f0Var.B();
                if (f0Var.C() == r0.RAW) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(B9);
                }
                try {
                    try {
                        U5.b a5 = C0687i.f11372b.a(C0693o.e(f0Var.A().B(), f0Var.A().C(), f0Var.A().A(), f0Var.C(), valueOf));
                        int ordinal = f0Var.D().ordinal();
                        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                            throw new GeneralSecurityException("Unknown key status");
                            break;
                        }
                        arrayList.add(new U5.h(a5));
                    } catch (GeneralSecurityException unused) {
                        arrayList.add(null);
                    }
                } catch (GeneralSecurityException e8) {
                    throw new RuntimeException("Creating a protokey serialization failed", e8);
                }
            }
            return new y(g0Var, Collections.unmodifiableList(arrayList));
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public static boolean Q(C1.i iVar, Bitmap.Config config) {
        if (AbstractC0485a.u(config)) {
            if (iVar.f1200k) {
                E1.a aVar = iVar.f1193c;
                if (u0.z.i(aVar)) {
                    ImageView imageView = aVar.f1926b;
                    if (imageView.isAttachedToWindow() && !imageView.isHardwareAccelerated()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static final y U(U5.f fVar, C0502b c0502b) {
        byte[] bArr = new byte[0];
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) fVar.f7503b;
        try {
            N A2 = N.A(byteArrayInputStream, C1043n.a());
            byteArrayInputStream.close();
            if (A2.y().size() != 0) {
                try {
                    g0 E8 = g0.E(c0502b.b(A2.y().f(), bArr), C1043n.a());
                    if (E8.z() > 0) {
                        return I(E8);
                    }
                    throw new GeneralSecurityException("empty keyset");
                } catch (com.google.crypto.tink.shaded.protobuf.B unused) {
                    throw new GeneralSecurityException("invalid keyset, corrupted key material");
                }
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static Bundle Z(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        E(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static final void x(y yVar, Network network, boolean z9) {
        boolean z10;
        Network[] allNetworks = ((ConnectivityManager) yVar.f9331b).getAllNetworks();
        int length = allNetworks.length;
        boolean z11 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                break;
            }
            Network network2 = allNetworks[i9];
            if (kotlin.jvm.internal.h.a(network2, network)) {
                z10 = z9;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) yVar.f9331b).getNetworkCapabilities(network2);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                z11 = true;
                break;
            }
            i9++;
        }
        H1.m mVar = (H1.m) yVar.f9332c;
        synchronized (mVar) {
            try {
                if (((C2004m) mVar.f2967a.get()) != null) {
                    mVar.f2971e = z11;
                } else {
                    mVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [V5.p, java.lang.Object] */
    public V5.p A() {
        G g9;
        V5.q qVar = (V5.q) this.f9331b;
        if (qVar != null && (g9 = (G) this.f9332c) != null) {
            if (qVar.f7777b == ((k6.a) g9.f17990b).f20137a.length) {
                V5.j jVar = V5.j.f7752k;
                V5.j jVar2 = qVar.f7778c;
                if (jVar2 != jVar && ((Integer) this.f9333d) == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (jVar2 != jVar || ((Integer) this.f9333d) == null) {
                    if (jVar2 == jVar) {
                        k6.a.a(new byte[0]);
                    } else if (jVar2 == V5.j.j) {
                        k6.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9333d).intValue()).array());
                    } else if (jVar2 == V5.j.f7751i) {
                        k6.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9333d).intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + ((V5.q) this.f9331b).f7778c);
                    }
                    return new Object();
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public Y2.j B() {
        String str;
        if (((String) this.f9331b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((V2.d) this.f9333d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new Y2.j((String) this.f9331b, (byte[]) this.f9332c, (V2.d) this.f9333d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void D(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f9332c;
        HashMap hashMap2 = (HashMap) this.f9331b;
        O6.f fVar = new O6.f(byteArrayOutputStream, hashMap2, hashMap, (N6.a) this.f9333d);
        L6.d dVar = (L6.d) hashMap2.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
        } else {
            throw new RuntimeException("No encoder for " + obj.getClass());
        }
    }

    @Override // f5.InterfaceC1171c
    public void G(AbstractC1176h abstractC1176h) {
        A4.b bVar = (A4.b) this.f9331b;
        String str = (String) this.f9332c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f9333d;
        synchronized (bVar.f334a) {
            bVar.f334a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D6.a H() {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "GET Request URL: "
            z6.d.b()
            r2 = 0
            java.lang.Object r3 = r8.f9331b     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r4 = r8.f9332c     // Catch: java.lang.Throwable -> Lb9
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r3 = C(r3, r4)     // Catch: java.lang.Throwable -> Lb4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb4
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lb4
            r4.append(r3)     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Lb4
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L2e
            android.util.Log.v(r0, r1, r2)     // Catch: java.lang.Throwable -> L2b
            goto L2e
        L2b:
            r0 = move-exception
            goto Lb7
        L2e:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lb4
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lb4
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lb4
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> Lb4
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L6e
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r8.f9333d     // Catch: java.lang.Throwable -> L6e
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L6e
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6e
        L52:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L70
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L6e
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6e
            r0.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L6e
            goto L52
        L6e:
            r1 = move-exception
            goto Lbb
        L70:
            r0.connect()     // Catch: java.lang.Throwable -> L6e
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L6e
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto La6
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La3
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> La3
            r2.<init>(r4)     // Catch: java.lang.Throwable -> La3
            r4 = 8192(0x2000, float:1.14794E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r5.<init>()     // Catch: java.lang.Throwable -> La3
        L92:
            int r6 = r2.read(r4)     // Catch: java.lang.Throwable -> La3
            r7 = -1
            if (r6 == r7) goto L9e
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> La3
            goto L92
        L9e:
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> La3
            goto La6
        La3:
            r1 = move-exception
            r2 = r3
            goto Lbb
        La6:
            if (r3 == 0) goto Lab
            r3.close()
        Lab:
            r0.disconnect()
            D6.a r0 = new D6.a
            r0.<init>(r1, r2)
            return r0
        Lb4:
            r1 = move-exception
        Lb5:
            r0 = r2
            goto Lbb
        Lb7:
            r1 = r0
            goto Lb5
        Lb9:
            r0 = move-exception
            goto Lb7
        Lbb:
            if (r2 == 0) goto Lc0
            r2.close()
        Lc0:
            if (r0 == 0) goto Lc5
            r0.disconnect()
        Lc5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.y.H():D6.a");
    }

    public e0 J(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return K(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0 K(Class cls, String key) {
        e0 viewModel;
        i0 i0Var;
        kotlin.jvm.internal.h.e(key, "key");
        j0 j0Var = (j0) this.f9331b;
        j0Var.getClass();
        LinkedHashMap linkedHashMap = j0Var.f9891a;
        e0 e0Var = (e0) linkedHashMap.get(key);
        boolean isInstance = cls.isInstance(e0Var);
        h0 h0Var = (h0) this.f9332c;
        if (isInstance) {
            if (h0Var instanceof i0) {
                i0Var = (i0) h0Var;
            } else {
                i0Var = null;
            }
            if (i0Var != null) {
                kotlin.jvm.internal.h.b(e0Var);
                i0Var.c(e0Var);
            }
            kotlin.jvm.internal.h.c(e0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return e0Var;
        }
        C1581d c1581d = new C1581d((AbstractC1579b) this.f9333d);
        c1581d.f20661a.put(androidx.lifecycle.f0.f9884b, key);
        try {
            viewModel = h0Var.b(cls, c1581d);
        } catch (AbstractMethodError unused) {
            viewModel = h0Var.a(cls);
        }
        kotlin.jvm.internal.h.e(viewModel, "viewModel");
        e0 e0Var2 = (e0) linkedHashMap.put(key, viewModel);
        if (e0Var2 != null) {
            e0Var2.b();
        }
        return viewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0151  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, l1.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object L(java.lang.Class r15) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.y.L(java.lang.Class):java.lang.Object");
    }

    public List M(byte[] bArr) {
        List list = (List) ((ConcurrentHashMap) this.f9331b).get(new U5.l(bArr));
        if (list != null) {
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    public boolean N() {
        String trim;
        if (((String) this.f9333d) == null) {
            ArrayDeque arrayDeque = (ArrayDeque) this.f9332c;
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f9333d = str;
                return true;
            }
            do {
                String readLine = ((BufferedReader) this.f9331b).readLine();
                this.f9333d = readLine;
                if (readLine != null) {
                    trim = readLine.trim();
                    this.f9333d = trim;
                } else {
                    return false;
                }
            } while (trim.isEmpty());
        }
        return true;
    }

    public void O(String str, String str2) {
        ((HashMap) this.f9333d).put(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:8:0x0019, B:10:0x002c, B:13:0x0033, B:14:0x003b, B:16:0x0042, B:17:0x0045, B:20:0x004d, B:23:0x0053, B:26:0x0059, B:28:0x005c, B:32:0x0062), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:8:0x0019, B:10:0x002c, B:13:0x0033, B:14:0x003b, B:16:0x0042, B:17:0x0045, B:20:0x004d, B:23:0x0053, B:26:0x0059, B:28:0x005c, B:32:0x0062), top: B:7:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P(k4.InterfaceC1513m r10, android.net.Uri r11, java.util.Map r12, long r13, long r15, N3.T r17) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.y.P(k4.m, android.net.Uri, java.util.Map, long, long, N3.T):void");
    }

    public String R() {
        if (N()) {
            String str = (String) this.f9333d;
            this.f9333d = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0033, code lost:
    
        if (((H1.i) r17.f9333d).b(r19) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1.m S(C1.i r18, D1.h r19) {
        /*
            r17 = this;
            r0 = r18
            r4 = r19
            java.util.List r1 = r0.f1196f
            boolean r1 = r1.isEmpty()
            android.graphics.Bitmap$Config r2 = r0.f1194d
            if (r1 != 0) goto L1a
            android.graphics.Bitmap$Config[] r1 = H1.f.f2949a
            boolean r1 = B7.j.b0(r1, r2)
            if (r1 == 0) goto L17
            goto L1a
        L17:
            r1 = r17
            goto L36
        L1a:
            boolean r1 = a.AbstractC0485a.u(r2)
            if (r1 != 0) goto L23
            r1 = r17
            goto L38
        L23:
            boolean r1 = Q(r0, r2)
            if (r1 == 0) goto L17
            r1 = r17
            java.lang.Object r3 = r1.f9333d
            H1.i r3 = (H1.i) r3
            boolean r3 = r3.b(r4)
            if (r3 == 0) goto L36
            goto L38
        L36:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L38:
            s8.n r3 = r4.f1777a
            D1.b r5 = D1.b.f1768m
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L4f
            s8.n r3 = r4.f1778b
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L4b
            goto L4f
        L4b:
            D1.g r3 = r0.f1212w
        L4d:
            r5 = r3
            goto L52
        L4f:
            D1.g r3 = D1.g.f1774b
            goto L4d
        L52:
            boolean r3 = r0.f1201l
            if (r3 == 0) goto L65
            java.util.List r3 = r0.f1196f
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L65
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ALPHA_8
            if (r2 == r3) goto L65
            r3 = 1
        L63:
            r7 = r3
            goto L67
        L65:
            r3 = 0
            goto L63
        L67:
            C1.m r3 = new C1.m
            boolean r6 = H1.d.a(r0)
            C1.q r11 = r0.f1199i
            C1.n r12 = r0.f1213x
            C1.b r14 = r0.f1204o
            C1.b r15 = r0.f1205p
            android.content.Context r1 = r0.f1191a
            r8 = r3
            r3 = 0
            r9 = r8
            boolean r8 = r0.f1202m
            r10 = r9
            r9 = 0
            r13 = r10
            i8.w r10 = r0.f1198h
            C1.b r0 = r0.f1203n
            r16 = r13
            r13 = r0
            r0 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r13 = r0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.y.S(C1.i, D1.h):C1.m");
    }

    public void T(EnumC0554o enumC0554o) {
        d0 d0Var = (d0) this.f9333d;
        if (d0Var != null) {
            d0Var.run();
        }
        d0 d0Var2 = new d0((C0563y) this.f9331b, enumC0554o);
        this.f9333d = d0Var2;
        ((Handler) this.f9332c).postAtFrontOfQueue(d0Var2);
    }

    public void V(String str) {
        if (str != null) {
            this.f9331b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public void W(r rVar, Handler handler) {
        t tVar = (t) this.f9331b;
        if (rVar == null) {
            tVar.e(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        tVar.e(rVar, handler);
    }

    public void X(int i9, int[] iArr, int[] iArr2, String[] strArr) {
        ((String[][]) this.f9331b)[i9] = strArr;
        ((int[][]) this.f9332c)[i9] = iArr;
        ((int[][]) this.f9333d)[i9] = iArr2;
    }

    public void Y(MediaMetadataCompat mediaMetadataCompat) {
        t tVar = (t) this.f9331b;
        tVar.f9324g = mediaMetadataCompat;
        if (mediaMetadataCompat.f9254b == null) {
            Parcel obtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat.f9254b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        tVar.f9318a.setMetadata(mediaMetadataCompat.f9254b);
    }

    @Override // C3.m
    public void a() {
        this.f9332c = null;
        this.f9333d = null;
        ((MediaCodec) this.f9331b).release();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1.m a0(C1.m r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            android.graphics.Bitmap$Config r2 = r0.f1219b
            C1.b r3 = r0.f1231o
            boolean r4 = a.AbstractC0485a.u(r2)
            r5 = 1
            if (r4 == 0) goto L1f
            java.lang.Object r4 = r1.f9333d
            H1.i r4 = (H1.i) r4
            boolean r4 = r4.a()
            if (r4 == 0) goto L1a
            goto L1f
        L1a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r4 = r5
        L1d:
            r8 = r2
            goto L21
        L1f:
            r4 = 0
            goto L1d
        L21:
            C1.b r2 = r0.f1231o
            boolean r2 = r2.f1158a
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.f9332c
            H1.m r2 = (H1.m) r2
            monitor-enter(r2)
            r2.a()     // Catch: java.lang.Throwable -> L39
            boolean r6 = r2.f2971e     // Catch: java.lang.Throwable -> L39
            monitor-exit(r2)
            if (r6 != 0) goto L3c
            C1.b r3 = C1.b.DISABLED
        L36:
            r21 = r3
            goto L3e
        L39:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L39
            throw r0
        L3c:
            r5 = r4
            goto L36
        L3e:
            if (r5 == 0) goto L6a
            android.content.Context r7 = r0.f1218a
            android.graphics.ColorSpace r9 = r0.f1220c
            D1.h r10 = r0.f1221d
            D1.g r11 = r0.f1222e
            boolean r12 = r0.f1223f
            boolean r13 = r0.f1224g
            boolean r14 = r0.f1225h
            java.lang.String r15 = r0.f1226i
            i8.w r2 = r0.j
            C1.q r3 = r0.f1227k
            C1.n r4 = r0.f1228l
            C1.b r5 = r0.f1229m
            C1.b r0 = r0.f1230n
            C1.m r6 = new C1.m
            r20 = r0
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r6
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.y.a0(C1.m):C1.m");
    }

    @Override // A3.B
    public void b(l4.x xVar, InterfaceC1907l interfaceC1907l, I i9) {
        this.f9332c = xVar;
        i9.a();
        i9.b();
        q3.u u9 = interfaceC1907l.u(i9.f77d, 5);
        this.f9333d = u9;
        u9.e((M) this.f9331b);
    }

    public synchronized void b0(int i9, int i10, long j, long j4) {
        ((C0650n0) this.f9331b).f11233n.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f9333d;
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        C1185q d9 = ((H4.c) this.f9332c).d(new C0134m(Arrays.asList(new C0131j(36301, i9, 0, j, j4, null, null, 0, i10)), 0));
        C0104h c0104h = new C0104h(2, elapsedRealtime, this);
        d9.getClass();
        d9.c(AbstractC1178j.f17414a, c0104h);
    }

    @Override // A3.B
    public void c(A4.r rVar) {
        long c3;
        long j;
        AbstractC1566a.n((l4.x) this.f9332c);
        int i9 = l4.y.f20553a;
        l4.x xVar = (l4.x) this.f9332c;
        synchronized (xVar) {
            try {
                long j4 = xVar.f20551c;
                if (j4 != -9223372036854775807L) {
                    c3 = j4 + xVar.f20550b;
                } else {
                    c3 = xVar.c();
                }
                j = c3;
            } finally {
            }
        }
        long d9 = ((l4.x) this.f9332c).d();
        if (j != -9223372036854775807L && d9 != -9223372036854775807L) {
            M m9 = (M) this.f9331b;
            if (d9 != m9.f19439p) {
                L a5 = m9.a();
                a5.f19406o = d9;
                M m10 = new M(a5);
                this.f9331b = m10;
                ((q3.u) this.f9333d).e(m10);
            }
            int e8 = rVar.e();
            ((q3.u) this.f9333d).c(e8, rVar);
            ((q3.u) this.f9333d).d(j, 1, e8, 0, null);
        }
    }

    @Override // C3.m
    public int d(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.f9331b;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && l4.y.f20553a < 21) {
                this.f9333d = mediaCodec.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // C3.m
    public void e(long j, int i9) {
        ((MediaCodec) this.f9331b).releaseOutputBuffer(i9, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    @Override // b5.U0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(int r9, java.io.IOException r10, byte[] r11) {
        /*
            r8 = this;
            java.lang.Object r11 = r8.f9331b
            b5.S0 r11 = (b5.S0) r11
            r11.l0()
            java.lang.Object r0 = r8.f9333d
            b5.A1 r0 = (b5.A1) r0
            r1 = 200(0xc8, float:2.8E-43)
            if (r9 == r1) goto L18
            r1 = 204(0xcc, float:2.86E-43)
            if (r9 == r1) goto L18
            r1 = 304(0x130, float:4.26E-43)
            if (r9 != r1) goto L33
            r9 = r1
        L18:
            if (r10 != 0) goto L33
            java.lang.Object r9 = r11.f1707a
            b5.n0 r9 = (b5.C0650n0) r9
            b5.V r9 = r9.f11229i
            b5.C0650n0.f(r9)
            b5.T r9 = r9.f10978n
            long r1 = r0.f10549a
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "[sgtm] Upload succeeded for row_id"
            r9.c(r10, r1)
            b5.Y0 r9 = b5.Y0.SUCCESS
            goto L6f
        L33:
            java.lang.Object r1 = r11.f1707a
            b5.n0 r1 = (b5.C0650n0) r1
            b5.V r1 = r1.f11229i
            b5.C0650n0.f(r1)
            b5.T r1 = r1.f10974i
            long r2 = r0.f10549a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.lang.String r4 = "[sgtm] Upload failed for row_id. response, exception"
            r1.e(r4, r2, r3, r10)
            b5.D r10 = b5.E.f10690u
            r1 = 0
            java.lang.Object r10 = r10.a(r1)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r1 = ","
            java.lang.String[] r10 = r10.split(r1)
            java.util.List r10 = java.util.Arrays.asList(r10)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L6d
            b5.Y0 r9 = b5.Y0.BACKOFF
            goto L6f
        L6d:
            b5.Y0 r9 = b5.Y0.FAILURE
        L6f:
            java.lang.Object r10 = r8.f9332c
            java.util.concurrent.atomic.AtomicReference r10 = (java.util.concurrent.atomic.AtomicReference) r10
            java.lang.Object r1 = r11.f1707a
            b5.n0 r1 = (b5.C0650n0) r1
            b5.m1 r1 = r1.m()
            b5.d r2 = new b5.d
            long r3 = r0.f10549a
            int r7 = r9.f11002a
            long r5 = r0.f10554f
            r2.<init>(r3, r5, r7)
            r1.l0()
            r1.m0()
            r0 = 1
            b5.Q1 r0 = r1.z0(r0)
            A4.j r5 = new A4.j
            r6 = 9
            r5.<init>(r1, r0, r2, r6)
            r1.C0(r5)
            java.lang.Object r11 = r11.f1707a
            b5.n0 r11 = (b5.C0650n0) r11
            b5.V r11 = r11.f11229i
            b5.C0650n0.f(r11)
            b5.T r11 = r11.f10978n
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.String r1 = "[sgtm] Updated status for row_id"
            r11.d(r0, r9, r1)
            monitor-enter(r10)
            r10.set(r9)     // Catch: java.lang.Throwable -> Lb8
            r10.notifyAll()     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb8
            return
        Lb8:
            r0 = move-exception
            r9 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb8
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.y.f(int, java.io.IOException, byte[]):void");
    }

    @Override // C3.m
    public void flush() {
        ((MediaCodec) this.f9331b).flush();
    }

    @Override // C3.m
    public void g(m4.h hVar, Handler handler) {
        ((MediaCodec) this.f9331b).setOnFrameRenderedListener(new C0080a(this, hVar, 1), handler);
    }

    @Override // R.g
    public ClipDescription getDescription() {
        return (ClipDescription) this.f9332c;
    }

    @Override // C3.m
    public void h(int i9, boolean z9) {
        ((MediaCodec) this.f9331b).releaseOutputBuffer(i9, z9);
    }

    @Override // C3.m
    public void i(int i9) {
        ((MediaCodec) this.f9331b).setVideoScalingMode(i9);
    }

    @Override // R.g
    public Object j() {
        return null;
    }

    @Override // R.g
    public Uri k() {
        return (Uri) this.f9331b;
    }

    @Override // b5.X
    public void l(String str, int i9, IOException iOException, byte[] bArr, Map map) {
        ((J1) this.f9332c).q(true, i9, iOException, bArr, (String) this.f9331b, (ArrayList) this.f9333d);
    }

    @Override // B1.e
    public boolean m() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f9331b;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // C3.m
    public MediaFormat n() {
        return ((MediaCodec) this.f9331b).getOutputFormat();
    }

    @Override // C3.m
    public ByteBuffer o(int i9) {
        if (l4.y.f20553a >= 21) {
            return ((MediaCodec) this.f9331b).getInputBuffer(i9);
        }
        return ((ByteBuffer[]) this.f9332c)[i9];
    }

    @Override // C3.m
    public void q(Surface surface) {
        ((MediaCodec) this.f9331b).setOutputSurface(surface);
    }

    @Override // C3.m
    public void r(int i9, C1589b c1589b, long j) {
        ((MediaCodec) this.f9331b).queueSecureInputBuffer(i9, 0, c1589b.f20691i, j, 0);
    }

    @Override // C3.m
    public void s(Bundle bundle) {
        ((MediaCodec) this.f9331b).setParameters(bundle);
    }

    @Override // B1.e
    public void shutdown() {
        ((ConnectivityManager) this.f9331b).unregisterNetworkCallback((B1.f) this.f9333d);
    }

    @Override // R.g
    public Uri t() {
        return (Uri) this.f9333d;
    }

    public String toString() {
        switch (this.f9330a) {
            case R.styleable.GradientColor_android_endY /* 11 */:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f9331b);
                sb.append('{');
                O0.c cVar = (O0.c) ((O0.c) this.f9332c).f5264c;
                String str = "";
                while (cVar != null) {
                    Object obj = cVar.f5263b;
                    sb.append(str);
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb.append(obj);
                    }
                    cVar = (O0.c) cVar.f5264c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            case 16:
                return U5.o.a((g0) this.f9331b).toString();
            default:
                return super.toString();
        }
    }

    @Override // C3.m
    public ByteBuffer u(int i9) {
        if (l4.y.f20553a >= 21) {
            return ((MediaCodec) this.f9331b).getOutputBuffer(i9);
        }
        return ((ByteBuffer[]) this.f9333d)[i9];
    }

    @Override // C3.m
    public int v() {
        return ((MediaCodec) this.f9331b).dequeueInputBuffer(0L);
    }

    @Override // C3.m
    public void w(int i9, int i10, long j, int i11) {
        ((MediaCodec) this.f9331b).queueInputBuffer(i9, 0, i10, j, i11);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, V5.i] */
    public V5.i y() {
        G g9;
        V5.k kVar = (V5.k) this.f9331b;
        if (kVar != null && (g9 = (G) this.f9332c) != null) {
            if (kVar.f7761b == ((k6.a) g9.f17990b).f20137a.length) {
                V5.j jVar = V5.j.f7747e;
                V5.j jVar2 = kVar.f7764e;
                if (jVar2 != jVar && ((Integer) this.f9333d) == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (jVar2 != jVar || ((Integer) this.f9333d) == null) {
                    if (jVar2 == jVar) {
                        k6.a.a(new byte[0]);
                    } else if (jVar2 == V5.j.f7746d) {
                        k6.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9333d).intValue()).array());
                    } else if (jVar2 == V5.j.f7745c) {
                        k6.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9333d).intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + ((V5.k) this.f9331b).f7764e);
                    }
                    return new Object();
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [V5.m, java.lang.Object] */
    public V5.m z() {
        G g9;
        V5.n nVar = (V5.n) this.f9331b;
        if (nVar != null && (g9 = (G) this.f9332c) != null) {
            if (nVar.f7769b == ((k6.a) g9.f17990b).f20137a.length) {
                V5.j jVar = V5.j.f7750h;
                V5.j jVar2 = nVar.f7772e;
                if (jVar2 != jVar && ((Integer) this.f9333d) == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (jVar2 != jVar || ((Integer) this.f9333d) == null) {
                    if (jVar2 == jVar) {
                        k6.a.a(new byte[0]);
                    } else if (jVar2 == V5.j.f7749g) {
                        k6.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f9333d).intValue()).array());
                    } else if (jVar2 == V5.j.f7748f) {
                        k6.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f9333d).intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + ((V5.n) this.f9331b).f7772e);
                    }
                    return new Object();
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public y(F f9, C0091j c0091j, B4.d[] dVarArr, int i9) {
        this.f9330a = 7;
        this.f9333d = f9;
        this.f9331b = c0091j;
        this.f9332c = dVarArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(j0 store, h0 h0Var) {
        this(store, h0Var, 0);
        this.f9330a = 25;
        kotlin.jvm.internal.h.e(store, "store");
    }

    public y(J1 j12, String str, ArrayList arrayList) {
        this.f9330a = 29;
        this.f9331b = str;
        this.f9333d = arrayList;
        this.f9332c = j12;
    }

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, int i9) {
        this.f9330a = i9;
        this.f9331b = obj;
        this.f9332c = obj2;
        this.f9333d = obj3;
    }

    public y(Context context, C0650n0 c0650n0) {
        this.f9330a = 27;
        this.f9333d = new AtomicLong(-1L);
        this.f9332c = new C4.j(context, null, H4.c.f3109k, new F4.n("measurement:api"), C4.i.f1575c);
        this.f9331b = c0650n0;
    }

    public y(C2004m c2004m, H1.m mVar) {
        Object kVar;
        this.f9330a = 5;
        this.f9331b = c2004m;
        this.f9332c = mVar;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 26) {
            boolean z9 = H1.a.f2941a;
        } else if (!H1.a.f2941a) {
            if (i9 != 26 && i9 != 27) {
                kVar = new H1.k(true);
            } else {
                kVar = new Object();
            }
            this.f9333d = kVar;
        }
        kVar = new H1.k(false);
        this.f9333d = kVar;
    }

    public y(AbstractServiceC0564z abstractServiceC0564z) {
        this.f9330a = 24;
        this.f9331b = new C0563y(abstractServiceC0564z);
        this.f9332c = new Handler();
    }

    public y(String str, HashMap hashMap) {
        this.f9330a = 8;
        this.f9331b = str;
        this.f9332c = hashMap;
        this.f9333d = new HashMap();
    }

    public y(j0 store, h0 factory, AbstractC1579b defaultCreationExtras) {
        this.f9330a = 25;
        kotlin.jvm.internal.h.e(store, "store");
        kotlin.jvm.internal.h.e(factory, "factory");
        kotlin.jvm.internal.h.e(defaultCreationExtras, "defaultCreationExtras");
        this.f9331b = store;
        this.f9332c = factory;
        this.f9333d = defaultCreationExtras;
    }

    @Override // R.g
    public void p() {
    }

    public y(String str, int i9) {
        this.f9330a = i9;
        switch (i9) {
            case R.styleable.GradientColor_android_endY /* 11 */:
                O0.c cVar = new O0.c(2, false);
                this.f9332c = cVar;
                this.f9333d = cVar;
                this.f9331b = str;
                return;
            default:
                L l9 = new L();
                l9.f19402k = str;
                this.f9331b = new M(l9);
                return;
        }
    }

    public y(C1903h c1903h) {
        this.f9330a = 10;
        this.f9331b = c1903h;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(j0 j0Var, h0 h0Var, int i9) {
        this(j0Var, h0Var, C1578a.f20660b);
        this.f9330a = 25;
    }

    public y(Runnable runnable) {
        this.f9330a = 13;
        this.f9332c = new CopyOnWriteArrayList();
        this.f9333d = new HashMap();
        this.f9331b = runnable;
    }

    public y(ConnectivityManager connectivityManager, H1.m mVar) {
        this.f9330a = 4;
        this.f9331b = connectivityManager;
        this.f9332c = mVar;
        B1.f fVar = new B1.f(0, this);
        this.f9333d = fVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), fVar);
    }

    public y(int i9, String str, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f9330a = 2;
        this.f9331b = str;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f9332c = unmodifiableList;
        this.f9333d = bArr;
    }

    public y(MediaCodec mediaCodec) {
        this.f9330a = 6;
        this.f9331b = mediaCodec;
        if (l4.y.f20553a < 21) {
            this.f9332c = mediaCodec.getInputBuffers();
            this.f9333d = mediaCodec.getOutputBuffers();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(androidx.lifecycle.k0 r3, androidx.lifecycle.h0 r4) {
        /*
            r2 = this;
            r0 = 25
            r2.f9330a = r0
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.h.e(r3, r0)
            androidx.lifecycle.j0 r0 = r3.u()
            boolean r1 = r3 instanceof androidx.lifecycle.InterfaceC0550k
            if (r1 == 0) goto L18
            androidx.lifecycle.k r3 = (androidx.lifecycle.InterfaceC0550k) r3
            m0.d r3 = r3.p()
            goto L1a
        L18:
            m0.a r3 = m0.C1578a.f20660b
        L1a:
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.y.<init>(androidx.lifecycle.k0, androidx.lifecycle.h0):void");
    }

    public y(ConcurrentHashMap concurrentHashMap, U5.k kVar, C1145a c1145a, Class cls) {
        this.f9330a = 17;
        this.f9331b = concurrentHashMap;
        this.f9332c = kVar;
        this.f9333d = c1145a;
    }

    public y(Context context, ComponentName componentName, PendingIntent pendingIntent) {
        this.f9330a = 0;
        this.f9333d = new ArrayList();
        if (context != null) {
            if (!TextUtils.isEmpty("CastMediaSession")) {
                if (componentName == null) {
                    int i9 = t0.I.f22875a;
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setPackage(context.getPackageName());
                    List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers.size() == 1) {
                        ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                        componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                    } else {
                        if (queryBroadcastReceivers.size() > 1) {
                            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                        }
                        componentName = null;
                    }
                    if (componentName == null) {
                        Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                    }
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    this.f9331b = new t(context);
                } else if (i10 >= 28) {
                    this.f9331b = new t(context);
                } else {
                    this.f9331b = new t(context);
                }
                W(new r(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                ((t) this.f9331b).f9318a.setMediaButtonReceiver(pendingIntent);
                this.f9332c = new O0.c(context, this);
                if (f9328e == 0) {
                    f9328e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public y(g0 g0Var, List list) {
        this.f9330a = 16;
        this.f9331b = g0Var;
        this.f9332c = list;
        this.f9333d = C1145a.f17215b;
    }

    public y(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f9330a = 15;
        this.f9332c = arrayDeque;
        this.f9331b = bufferedReader;
    }

    public y(int i9) {
        this.f9330a = 21;
        this.f9331b = new String[i9];
        this.f9332c = new int[i9];
        this.f9333d = new int[i9];
    }
}
