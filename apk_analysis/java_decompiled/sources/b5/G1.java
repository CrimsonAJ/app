package b5;

import D4.InterfaceC0093l;
import a.AbstractC0485a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.KeyEvent;
import androidx.work.impl.WorkDatabase_Impl;
import b7.C0701c;
import c6.C0779a;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.measurement.C0906b;
import d0.C1086d;
import e0.C1133a;
import f5.C1177i;
import f6.InterfaceC1186a;
import j3.AbstractC1455g;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k4.C1498D;
import k4.C1515o;
import k4.C1516p;
import l3.C1559h;
import l3.InterfaceC1561j;
import l4.AbstractC1566a;
import l6.AbstractC1570b;
import n1.C1605b;
import n1.C1607d;
import n1.C1608e;
import n3.C1622B;
import n3.C1628e;
import n3.C1643t;
import n3.C1644u;
import n3.InterfaceC1638o;
import p.C1758N;
import p.C1821t;
import q1.InterfaceC1871a;
import s.C1935e;
import t0.C1971e;
import t4.C2009A;
import u0.AbstractC2037h;
import u0.InterfaceC2036g;
import x8.C2190j;

/* loaded from: classes.dex */
public final class G1 implements X, InterfaceC1186a, InterfaceC1871a, InterfaceC0093l, A7.e {

    /* renamed from: e, reason: collision with root package name */
    public static G1 f10715e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10716a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10717b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10718c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10719d;

    public /* synthetic */ G1(int i9, boolean z9) {
        this.f10716a = i9;
    }

    public static C1628e f(j3.S s9) {
        String uri;
        boolean z9;
        A4.r rVar = new A4.r(3, false);
        Uri uri2 = s9.f19465b;
        byte[] bArr = null;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        G1 g12 = new G1(uri, rVar);
        P5.f0 it = s9.f19466c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) g12.f10719d)) {
                ((HashMap) g12.f10719d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = AbstractC1455g.f19616a;
        e1.q qVar = new e1.q(-1);
        UUID uuid2 = s9.f19464a;
        uuid2.getClass();
        int[] U8 = v4.e.U(s9.f19467d);
        for (int i9 : U8) {
            if (i9 != 2 && i9 != 1) {
                z9 = false;
            } else {
                z9 = true;
            }
            AbstractC1566a.h(z9);
        }
        C1628e c1628e = new C1628e(uuid2, g12, hashMap, (int[]) U8.clone(), qVar);
        byte[] bArr2 = s9.f19468e;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        AbstractC1566a.m(c1628e.j.isEmpty());
        c1628e.f21112s = bArr;
        return c1628e;
    }

    public static boolean g(Editable editable, KeyEvent keyEvent, boolean z9) {
        d0.v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (d0.v[]) editable.getSpans(selectionStart, selectionEnd, d0.v.class)) != null && vVarArr.length > 0) {
                for (d0.v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z9 && spanStart == selectionStart) || ((!z9 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static byte[] j(A4.r rVar, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        k4.V v8 = new k4.V(rVar.c());
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        AbstractC1566a.o(parse, "The uri must be set.");
        C1516p c1516p = new C1516p(parse, 2, bArr, map, 0L, -1L, null, 1);
        C1516p c1516p2 = c1516p;
        int i9 = 0;
        while (true) {
            try {
                C1515o c1515o = new C1515o(v8, c1516p2);
                try {
                    return l4.y.R(c1515o);
                } catch (C1498D e8) {
                    int i10 = e8.f19982d;
                    String str2 = null;
                    if ((i10 == 307 || i10 == 308) && i9 < 5 && (map2 = e8.f19983e) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                        str2 = (String) list.get(0);
                    }
                    if (str2 != null) {
                        i9++;
                        B3.c a5 = c1516p2.a();
                        Uri parse2 = Uri.parse(str2);
                        a5.f658e = parse2;
                        AbstractC1566a.o(parse2, "The uri must be set.");
                        c1516p2 = new C1516p((Uri) a5.f658e, a5.f654a, (byte[]) a5.f659f, (Map) a5.f660g, a5.f655b, a5.f656c, (String) a5.f661h, a5.f657d);
                    } else {
                        throw e8;
                    }
                } finally {
                    l4.y.g(c1515o);
                }
            } catch (Exception e9) {
                Uri uri = v8.f20034c;
                uri.getClass();
                throw new C1622B(c1516p, uri, v8.f20032a.l(), v8.f20033b, e9);
            }
        }
    }

    public static G1 v(Context context, AttributeSet attributeSet, int[] iArr) {
        return new G1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static G1 w(Context context, AttributeSet attributeSet, int[] iArr, int i9) {
        return new G1(context, context.obtainStyledAttributes(attributeSet, iArr, i9, 0));
    }

    public void A(int i9) {
        if (i9 != 16 && i9 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i9 * 8)));
        }
        this.f10717b = Integer.valueOf(i9);
    }

    public void B(String str, int i9, String str2) {
        ((HashMap) this.f10717b).put(str, str2);
        ((HashMap) this.f10718c).put(str2, str);
        ((HashMap) this.f10719d).put(str, Integer.valueOf(i9));
    }

    @Override // D4.InterfaceC0093l
    public void H(Object obj, Object obj2) {
        boolean z9;
        boolean z10;
        y4.w wVar = (y4.w) obj;
        C1177i c1177i = (C1177i) obj2;
        switch (this.f10716a) {
            case 25:
                y4.b bVar = C2009A.f23120G;
                C2009A c2009a = (C2009A) this.f10718c;
                if (c2009a.f23127F == 3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                F4.y.j("Not connected to device", z9);
                Context context = wVar.f2370c;
                C4.g gVar = new C4.g(-1, -1, 0, true);
                y4.g gVar2 = (y4.g) wVar.u();
                C4.f fVar = new C4.f(gVar);
                Parcel Q7 = gVar2.Q();
                Q7.writeString((String) this.f10717b);
                com.google.android.gms.internal.cast.C.c(Q7, (t4.i) this.f10719d);
                com.google.android.gms.internal.cast.C.c(Q7, fVar);
                gVar2.i1(Q7, 13);
                synchronized (c2009a.f23135r) {
                    try {
                        if (c2009a.f23132o != null) {
                            c2009a.h(2477);
                        }
                        c2009a.f23132o = c1177i;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                if (((C2009A) this.f10718c).f23127F != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                F4.y.j("Not active connection", z10);
                if (((t4.f) this.f10719d) != null) {
                    Context context2 = wVar.f2370c;
                    C4.g gVar3 = new C4.g(-1, -1, 0, true);
                    y4.g gVar4 = (y4.g) wVar.u();
                    C4.f fVar2 = new C4.f(gVar3);
                    Parcel Q8 = gVar4.Q();
                    Q8.writeString((String) this.f10717b);
                    com.google.android.gms.internal.cast.C.c(Q8, fVar2);
                    gVar4.i1(Q8, 12);
                }
                c1177i.b(null);
                return;
        }
    }

    @Override // f6.InterfaceC1186a
    public byte[] a(int i9, byte[] bArr) {
        byte[] Q7;
        if (i9 <= 16) {
            if (A0.a.c(1)) {
                Cipher cipher = (Cipher) i6.i.f18730b.f18732a.k("AES/ECB/NoPadding");
                cipher.init(1, (SecretKeySpec) this.f10717b);
                int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
                if (max * 16 == bArr.length) {
                    Q7 = com.google.android.gms.internal.measurement.D1.P((max - 1) * 16, 0, 16, bArr, (byte[]) this.f10718c);
                } else {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length);
                    if (copyOfRange.length < 16) {
                        byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                        copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                        Q7 = com.google.android.gms.internal.measurement.D1.Q(copyOf, (byte[]) this.f10719d);
                    } else {
                        throw new IllegalArgumentException("x must be smaller than a block.");
                    }
                }
                byte[] bArr2 = new byte[16];
                for (int i10 = 0; i10 < max - 1; i10++) {
                    bArr2 = cipher.doFinal(com.google.android.gms.internal.measurement.D1.P(0, i10 * 16, 16, bArr2, bArr));
                }
                return Arrays.copyOf(cipher.doFinal(com.google.android.gms.internal.measurement.D1.Q(Q7, bArr2)), i9);
            }
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }

    public C0779a b() {
        i.G g9;
        k6.a a5;
        c6.e eVar = (c6.e) this.f10717b;
        if (eVar != null && (g9 = (i.G) this.f10718c) != null) {
            if (eVar.f11680b == ((k6.a) g9.f17990b).f20137a.length) {
                c6.d dVar = c6.d.f11669f;
                c6.d dVar2 = eVar.f11682d;
                if (dVar2 != dVar && ((Integer) this.f10719d) == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (dVar2 != dVar || ((Integer) this.f10719d) == null) {
                    if (dVar2 == dVar) {
                        a5 = k6.a.a(new byte[0]);
                    } else if (dVar2 != c6.d.f11668e && dVar2 != c6.d.f11667d) {
                        if (dVar2 == c6.d.f11666c) {
                            a5 = k6.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f10719d).intValue()).array());
                        } else {
                            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((c6.e) this.f10717b).f11682d);
                        }
                    } else {
                        a5 = k6.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f10719d).intValue()).array());
                    }
                    return new C0779a((c6.e) this.f10717b, a5);
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public c6.e c() {
        Integer num = (Integer) this.f10717b;
        if (num != null) {
            if (((Integer) this.f10718c) != null) {
                if (((c6.d) this.f10719d) != null) {
                    return new c6.e(num.intValue(), ((Integer) this.f10718c).intValue(), (c6.d) this.f10719d);
                }
                throw new GeneralSecurityException("variant not set");
            }
            throw new GeneralSecurityException("tag size not set");
        }
        throw new GeneralSecurityException("key size not set");
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f10716a) {
            case 6:
                G1 g12 = new G1(((C0906b) this.f10717b).clone());
                ArrayList arrayList = (ArrayList) this.f10719d;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((ArrayList) g12.f10719d).add(((C0906b) obj).clone());
                }
                return g12;
            default:
                return super.clone();
        }
    }

    public c6.j d() {
        i.G g9;
        k6.a a5;
        c6.k kVar = (c6.k) this.f10717b;
        if (kVar != null && (g9 = (i.G) this.f10718c) != null) {
            if (kVar.f11690b == ((k6.a) g9.f17990b).f20137a.length) {
                c6.d dVar = c6.d.f11677o;
                c6.d dVar2 = kVar.f11692d;
                if (dVar2 != dVar && ((Integer) this.f10719d) == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (dVar2 != dVar || ((Integer) this.f10719d) == null) {
                    if (dVar2 == dVar) {
                        a5 = k6.a.a(new byte[0]);
                    } else if (dVar2 != c6.d.f11676n && dVar2 != c6.d.f11675m) {
                        if (dVar2 == c6.d.f11674l) {
                            a5 = k6.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.f10719d).intValue()).array());
                        } else {
                            throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((c6.k) this.f10717b).f11692d);
                        }
                    } else {
                        a5 = k6.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.f10719d).intValue()).array());
                    }
                    return new c6.j((c6.k) this.f10717b, a5);
                }
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    public void e() {
        android.support.v4.media.session.y yVar = (android.support.v4.media.session.y) this.f10717b;
        if (yVar != null) {
            int i9 = ((C1971e) this.f10719d).f22975n.f20387d;
            android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) yVar.f9331b;
            tVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i9);
            tVar.f9318a.setPlaybackToLocal(builder.build());
            this.f10718c = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.internal.i, O7.a] */
    @Override // A7.e
    public Object getValue() {
        InterfaceC2036g interfaceC2036g = (InterfaceC2036g) this.f10719d;
        if (interfaceC2036g == null) {
            Bundle bundle = (Bundle) ((kotlin.jvm.internal.i) this.f10718c).invoke();
            C1935e c1935e = AbstractC2037h.f23485b;
            kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) this.f10717b;
            Method method = (Method) c1935e.get(dVar);
            if (method == null) {
                method = AbstractC1570b.f(dVar).getMethod("fromBundle", (Class[]) Arrays.copyOf(AbstractC2037h.f23484a, 1));
                c1935e.put(dVar, method);
                kotlin.jvm.internal.h.d(method, "navArgsClass.java.getMet…                        }");
            }
            Object invoke = method.invoke(null, bundle);
            kotlin.jvm.internal.h.c(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
            InterfaceC2036g interfaceC2036g2 = (InterfaceC2036g) invoke;
            this.f10719d = interfaceC2036g2;
            return interfaceC2036g2;
        }
        return interfaceC2036g;
    }

    public byte[] h(UUID uuid, C1643t c1643t) {
        String str;
        String str2 = c1643t.f21137b;
        if (TextUtils.isEmpty(str2)) {
            str2 = (String) this.f10717b;
        }
        if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            UUID uuid2 = AbstractC1455g.f19620e;
            if (uuid2.equals(uuid)) {
                str = "text/xml";
            } else if (AbstractC1455g.f19618c.equals(uuid)) {
                str = "application/json";
            } else {
                str = "application/octet-stream";
            }
            hashMap.put("Content-Type", str);
            if (uuid2.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (((HashMap) this.f10719d)) {
                hashMap.putAll((HashMap) this.f10719d);
            }
            return j((A4.r) this.f10718c, str2, c1643t.f21136a, hashMap);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = Uri.EMPTY;
        AbstractC1566a.o(uri, "The uri must be set.");
        throw new C1622B(new C1516p(uri, 1, null, map, 0L, -1L, null, 0), uri, P5.X.f5938g, 0L, new IllegalStateException("No license URL"));
    }

    public void i(Runnable runnable) {
        ((o1.i) this.f10717b).execute(runnable);
    }

    public byte[] k(C1644u c1644u) {
        return j((A4.r) this.f10718c, c1644u.f21139b + "&signedRequest=" + l4.y.m(c1644u.f21138a), null, Collections.EMPTY_MAP);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.String] */
    @Override // b5.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(java.lang.String r6, int r7, java.io.IOException r8, byte[] r9, java.util.Map r10) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f10719d
            b5.J1 r6 = (b5.J1) r6
            A0.a.v(r6)
            r10 = 0
            if (r9 != 0) goto L10
            byte[] r9 = new byte[r10]     // Catch: java.lang.Throwable -> Ld
            goto L10
        Ld:
            r7 = move-exception
            goto La7
        L10:
            java.lang.Object r0 = r5.f10718c
            b5.K1 r0 = (b5.K1) r0
            r1 = 200(0xc8, float:2.8E-43)
            long r2 = r0.f10772a
            java.lang.Object r0 = r5.f10717b
            java.lang.String r0 = (java.lang.String) r0
            if (r7 == r1) goto L23
            r1 = 204(0xcc, float:2.86E-43)
            if (r7 != r1) goto L6b
            r7 = r1
        L23:
            if (r8 != 0) goto L6b
            b5.n r8 = r6.f10744c     // Catch: java.lang.Throwable -> Ld
            b5.J1.J(r8)     // Catch: java.lang.Throwable -> Ld
            java.lang.Long r9 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Ld
            r8.z0(r9)     // Catch: java.lang.Throwable -> Ld
            b5.V r8 = r6.A()     // Catch: java.lang.Throwable -> Ld
            b5.T r8 = r8.f10978n     // Catch: java.lang.Throwable -> Ld
            java.lang.String r9 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Ld
            r8.d(r0, r7, r9)     // Catch: java.lang.Throwable -> Ld
            b5.g r7 = r6.h0()     // Catch: java.lang.Throwable -> Ld
            b5.D r8 = b5.E.f10611N0     // Catch: java.lang.Throwable -> Ld
            r9 = 0
            boolean r7 = r7.y0(r9, r8)     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto L67
            b5.Z r7 = r6.f10743b     // Catch: java.lang.Throwable -> Ld
            b5.J1.J(r7)     // Catch: java.lang.Throwable -> Ld
            boolean r7 = r7.K0()     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto L67
            b5.n r7 = r6.f10744c     // Catch: java.lang.Throwable -> Ld
            b5.J1.J(r7)     // Catch: java.lang.Throwable -> Ld
            boolean r7 = r7.K0(r0)     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto L67
            r6.Z(r0)     // Catch: java.lang.Throwable -> Ld
            goto La1
        L67:
            r6.C()     // Catch: java.lang.Throwable -> Ld
            goto La1
        L6b:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Ld
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r9, r4)     // Catch: java.lang.Throwable -> Ld
            int r9 = r1.length()     // Catch: java.lang.Throwable -> Ld
            r4 = 32
            int r9 = java.lang.Math.min(r4, r9)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r9 = r1.substring(r10, r9)     // Catch: java.lang.Throwable -> Ld
            b5.V r1 = r6.A()     // Catch: java.lang.Throwable -> Ld
            b5.T r1 = r1.f10975k     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Ld
            if (r8 != 0) goto L8f
            r8 = r9
        L8f:
            r1.e(r4, r0, r7, r8)     // Catch: java.lang.Throwable -> Ld
            b5.n r7 = r6.f10744c     // Catch: java.lang.Throwable -> Ld
            b5.J1.J(r7)     // Catch: java.lang.Throwable -> Ld
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Ld
            r7.C0(r8)     // Catch: java.lang.Throwable -> Ld
            r6.C()     // Catch: java.lang.Throwable -> Ld
        La1:
            r6.f10764u = r10
            r6.y()
            return
        La7:
            r6.f10764u = r10
            r6.y()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.G1.l(java.lang.String, int, java.io.IOException, byte[], java.util.Map):void");
    }

    public InterfaceC1638o m(j3.Y y9) {
        C1628e c1628e;
        y9.f19492b.getClass();
        j3.S s9 = y9.f19492b.f19477c;
        if (s9 != null && l4.y.f20553a >= 18) {
            synchronized (this.f10717b) {
                try {
                    if (!s9.equals((j3.S) this.f10718c)) {
                        this.f10718c = s9;
                        this.f10719d = f(s9);
                    }
                    c1628e = (C1628e) this.f10719d;
                    c1628e.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c1628e;
        }
        return InterfaceC1638o.f21134d0;
    }

    public ColorStateList n(int i9) {
        int resourceId;
        ColorStateList c3;
        TypedArray typedArray = (TypedArray) this.f10718c;
        if (typedArray.hasValue(i9) && (resourceId = typedArray.getResourceId(i9, 0)) != 0 && (c3 = E.d.c((Context) this.f10717b, resourceId)) != null) {
            return c3;
        }
        return typedArray.getColorStateList(i9);
    }

    public Drawable o(int i9) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f10718c;
        if (typedArray.hasValue(i9) && (resourceId = typedArray.getResourceId(i9, 0)) != 0) {
            return AbstractC0485a.q((Context) this.f10717b, resourceId);
        }
        return typedArray.getDrawable(i9);
    }

    public Drawable p(int i9) {
        int resourceId;
        Drawable g9;
        if (((TypedArray) this.f10718c).hasValue(i9) && (resourceId = ((TypedArray) this.f10718c).getResourceId(i9, 0)) != 0) {
            C1821t a5 = C1821t.a();
            Context context = (Context) this.f10717b;
            synchronized (a5) {
                g9 = a5.f22079a.g(context, resourceId, true);
            }
            return g9;
        }
        return null;
    }

    public Typeface q(int i9, int i10, C1758N c1758n) {
        int resourceId = ((TypedArray) this.f10718c).getResourceId(i9, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f10719d) == null) {
                this.f10719d = new TypedValue();
            }
            TypedValue typedValue = (TypedValue) this.f10719d;
            ThreadLocal threadLocal = G.l.f2623a;
            Context context = (Context) this.f10717b;
            if (context.isRestricted()) {
                return null;
            }
            return G.l.b(context, resourceId, typedValue, i10, c1758n, true, false);
        }
        return null;
    }

    public C1607d r(String str) {
        C1607d c1607d;
        G0.G a5 = G0.G.a(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            a5.t(1);
        } else {
            a5.m(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10717b;
        workDatabase_Impl.b();
        Cursor w7 = s8.n.w(workDatabase_Impl, a5, false);
        try {
            int z9 = s8.e.z(w7, "work_spec_id");
            int z10 = s8.e.z(w7, "system_id");
            if (w7.moveToFirst()) {
                c1607d = new C1607d(w7.getString(z9), w7.getInt(z10));
            } else {
                c1607d = null;
            }
            return c1607d;
        } finally {
            w7.close();
            a5.g();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(80:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(77:244|245|(1:24)|25|26|27|(1:29)|241|31|32|(3:216|217|(72:219|(64:221|(1:223)|35|(1:37)|38|(1:40)(1:215)|41|(2:43|(1:199)(54:47|48|(1:50)|51|(1:53)(2:189|(1:194)(1:193))|54|(1:56)|57|(1:59)(5:177|(1:179)|180|(1:182)(1:188)|(1:184)(2:185|(1:187)))|60|(1:62)(6:159|(4:162|(2:170|171)(1:168)|169|160)|172|173|(1:175)|176)|63|(1:65)(1:158)|(1:67)|68|(37:154|155|(1:74)|75|(1:77)|78|(31:145|(1:149)|(1:82)|83|(27:140|(1:144)|(1:87)|88|(23:137|(1:139)|(1:92)|93|(1:95)|96|(1:98)|99|(3:101|(1:106)(1:104)|105)|107|(1:109)|110|(1:112)|113|(1:115)|116|(1:136)|118|(4:125|126|(1:128)(1:131)|129)|120|(1:122)|123|124)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124)|70|(37:150|151|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124))(1:214)|200|(2:209|210)|(1:208)(1:207)|48|(0)|51|(0)(0)|54|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124)|224|(67:226|(1:228)|35|(0)|38|(0)(0)|41|(0)(0)|200|(1:202)|209|210|(1:205)|208|48|(0)|51|(0)(0)|54|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124)(1:237)|229|(3:231|(1:233)(1:235)|234)|236|35|(0)|38|(0)(0)|41|(0)(0)|200|(0)|209|210|(0)|208|48|(0)|51|(0)(0)|54|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124))|34|35|(0)|38|(0)(0)|41|(0)(0)|200|(0)|209|210|(0)|208|48|(0)|51|(0)(0)|54|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124)|22|(0)|25|26|27|(0)|241|31|32|(0)|34|35|(0)|38|(0)(0)|41|(0)(0)|200|(0)|209|210|(0)|208|48|(0)|51|(0)(0)|54|(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|(0)|68|(0)|70|(0)|72|(0)|75|(0)|78|(0)|80|(0)|83|(0)|85|(0)|88|(0)|90|(0)|93|(0)|96|(0)|99|(0)|107|(0)|110|(0)|113|(0)|116|(0)|118|(0)|120|(0)|123|124) */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0212, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0213, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x00c5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x00c6, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0534 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf A[Catch: NameNotFoundException -> 0x00c5, TRY_LEAVE, TryCatch #1 {NameNotFoundException -> 0x00c5, blocks: (B:27:0x00b9, B:29:0x00bf), top: B:26:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04bb  */
    /* JADX WARN: Type inference failed for: r0v106, types: [int] */
    /* JADX WARN: Type inference failed for: r0v132 */
    /* JADX WARN: Type inference failed for: r0v182 */
    /* JADX WARN: Type inference failed for: r0v183 */
    /* JADX WARN: Type inference failed for: r15v3, types: [D.m] */
    /* JADX WARN: Type inference failed for: r3v36, types: [D.j, D.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v39, types: [D.k, D.n, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean s() {
        /*
            Method dump skipped, instructions count: 1461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.G1.s():boolean");
    }

    public boolean t(CharSequence charSequence, int i9, int i10, d0.u uVar) {
        int i11;
        if ((uVar.f16680c & 3) == 0) {
            C1086d c1086d = (C1086d) this.f10719d;
            C1133a b9 = uVar.b();
            int a5 = b9.a(8);
            if (a5 != 0) {
                ((ByteBuffer) b9.f1637d).getShort(a5 + b9.f1634a);
            }
            c1086d.getClass();
            ThreadLocal threadLocal = C1086d.f16636b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i9 < i10) {
                sb.append(charSequence.charAt(i9));
                i9++;
            }
            TextPaint textPaint = c1086d.f16637a;
            String sb2 = sb.toString();
            int i12 = H.d.f2918a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i13 = uVar.f16680c & 4;
            if (hasGlyph) {
                i11 = i13 | 2;
            } else {
                i11 = i13 | 1;
            }
            uVar.f16680c = i11;
        }
        if ((uVar.f16680c & 3) == 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        switch (this.f10716a) {
            case 29:
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f10718c;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                String str = (String) this.f10717b;
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
                String str2 = (String) this.f10719d;
                if (str2 != null) {
                    sb.append(" mimetype=");
                    sb.append(str2);
                }
                sb.append(" }");
                String sb2 = sb.toString();
                kotlin.jvm.internal.h.d(sb2, "sb.toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public void u(C1607d c1607d) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10717b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((C1605b) this.f10718c).l(c1607d);
            workDatabase_Impl.p();
        } finally {
            workDatabase_Impl.m();
        }
    }

    public Object x(CharSequence charSequence, int i9, int i10, int i11, boolean z9, d0.m mVar) {
        int i12;
        d0.r rVar;
        char c3;
        d0.n nVar = new d0.n((d0.r) ((com.google.firebase.messaging.s) this.f10718c).f16506d);
        int codePointAt = Character.codePointAt(charSequence, i9);
        boolean z10 = true;
        int i13 = 0;
        int i14 = i9;
        loop0: while (true) {
            i12 = i14;
            while (i14 < i10 && i13 < i11 && z10) {
                SparseArray sparseArray = ((d0.r) nVar.f16659e).f16671a;
                if (sparseArray == null) {
                    rVar = null;
                } else {
                    rVar = (d0.r) sparseArray.get(codePointAt);
                }
                if (nVar.f16655a != 2) {
                    if (rVar == null) {
                        nVar.c();
                        c3 = 1;
                    } else {
                        nVar.f16655a = 2;
                        nVar.f16659e = rVar;
                        nVar.f16657c = 1;
                        c3 = 2;
                    }
                } else {
                    if (rVar != null) {
                        nVar.f16659e = rVar;
                        nVar.f16657c++;
                    } else {
                        if (codePointAt == 65038) {
                            nVar.c();
                        } else if (codePointAt != 65039) {
                            d0.r rVar2 = (d0.r) nVar.f16659e;
                            if (rVar2.f16672b != null) {
                                if (nVar.f16657c == 1) {
                                    if (nVar.d()) {
                                        nVar.f16660f = (d0.r) nVar.f16659e;
                                        nVar.c();
                                    } else {
                                        nVar.c();
                                    }
                                } else {
                                    nVar.f16660f = rVar2;
                                    nVar.c();
                                }
                                c3 = 3;
                            } else {
                                nVar.c();
                            }
                        }
                        c3 = 1;
                    }
                    c3 = 2;
                }
                nVar.f16656b = codePointAt;
                if (c3 != 1) {
                    if (c3 != 2) {
                        if (c3 == 3) {
                            if (z9 || !t(charSequence, i12, i14, ((d0.r) nVar.f16660f).f16672b)) {
                                z10 = mVar.d(charSequence, i12, i14, ((d0.r) nVar.f16660f).f16672b);
                                i13++;
                            }
                        }
                    } else {
                        int charCount = Character.charCount(codePointAt) + i14;
                        if (charCount < i10) {
                            codePointAt = Character.codePointAt(charSequence, charCount);
                        }
                        i14 = charCount;
                    }
                } else {
                    i14 = Character.charCount(Character.codePointAt(charSequence, i12)) + i12;
                    if (i14 < i10) {
                        codePointAt = Character.codePointAt(charSequence, i14);
                    }
                }
            }
        }
        if (nVar.f16655a == 2 && ((d0.r) nVar.f16659e).f16672b != null && ((nVar.f16657c > 1 || nVar.d()) && i13 < i11 && z10 && (z9 || !t(charSequence, i12, i14, ((d0.r) nVar.f16659e).f16672b)))) {
            mVar.d(charSequence, i12, i14, ((d0.r) nVar.f16659e).f16672b);
        }
        return mVar.b();
    }

    public void y() {
        ((TypedArray) this.f10718c).recycle();
    }

    public void z(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10717b;
        workDatabase_Impl.b();
        C1608e c1608e = (C1608e) this.f10719d;
        R0.j a5 = c1608e.a();
        if (str == null) {
            a5.t(1);
        } else {
            a5.m(1, str);
        }
        workDatabase_Impl.c();
        try {
            a5.a();
            workDatabase_Impl.p();
        } finally {
            workDatabase_Impl.m();
            c1608e.i(a5);
        }
    }

    public /* synthetic */ G1(Object obj, Object obj2, Object obj3, int i9) {
        this.f10716a = i9;
        this.f10717b = obj2;
        this.f10718c = obj3;
        this.f10719d = obj;
    }

    public /* synthetic */ G1(Object obj, Object obj2, Object obj3, int i9, boolean z9) {
        this.f10716a = i9;
        this.f10717b = obj3;
        this.f10718c = obj;
        this.f10719d = obj2;
    }

    public /* synthetic */ G1(C2009A c2009a, String str, t4.i iVar) {
        this.f10716a = 25;
        this.f10718c = c2009a;
        this.f10717b = str;
        this.f10719d = iVar;
    }

    public G1(int i9) {
        this.f10716a = i9;
        switch (i9) {
            case 9:
                List list = Collections.EMPTY_LIST;
                this.f10717b = list;
                this.f10718c = list;
                return;
            case 12:
                String uuid = UUID.randomUUID().toString();
                kotlin.jvm.internal.h.d(uuid, "randomUUID().toString()");
                C2190j c2190j = C2190j.f24645d;
                this.f10717b = e0.c.D(uuid);
                this.f10718c = i8.C.f18932e;
                this.f10719d = new ArrayList();
                return;
            case 18:
                this.f10717b = new Object();
                return;
            case 27:
                this.f10717b = new HashMap();
                this.f10718c = new HashMap();
                this.f10719d = new HashMap();
                return;
            default:
                this.f10717b = new C0906b("", 0L, null);
                this.f10718c = new C0906b("", 0L, null);
                this.f10719d = new ArrayList();
                return;
        }
    }

    public G1(CastDevice castDevice, u4.D d9) {
        this.f10716a = 24;
        F4.y.i(castDevice, "CastDevice parameter cannot be null");
        this.f10717b = castDevice;
        this.f10718c = d9;
    }

    public G1(C0906b c0906b) {
        this.f10716a = 6;
        this.f10717b = c0906b;
        this.f10718c = c0906b.clone();
        this.f10719d = new ArrayList();
    }

    public G1(WorkDatabase_Impl workDatabase_Impl) {
        this.f10716a = 17;
        this.f10717b = workDatabase_Impl;
        this.f10718c = new C1605b(workDatabase_Impl, 2);
        this.f10719d = new C1608e(workDatabase_Impl, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public G1(kotlin.jvm.internal.d dVar, O7.a aVar) {
        this.f10716a = 28;
        this.f10717b = dVar;
        this.f10718c = (kotlin.jvm.internal.i) aVar;
    }

    public G1(ExecutorService executorService) {
        this.f10716a = 21;
        this.f10718c = new Handler(Looper.getMainLooper());
        this.f10719d = new D4.q(4, this);
        this.f10717b = new o1.i(executorService);
    }

    public G1(Intent intent) {
        this.f10716a = 29;
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.f10718c = data;
        this.f10717b = action;
        this.f10719d = type;
    }

    public G1(byte[] bArr) {
        this.f10716a = 11;
        i6.o.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f10717b = secretKeySpec;
        if (A0.a.c(1)) {
            Cipher cipher = (Cipher) i6.i.f18730b.f18732a.k("AES/ECB/NoPadding");
            cipher.init(1, secretKeySpec);
            byte[] c3 = AbstractC1570b.c(cipher.doFinal(new byte[16]));
            this.f10718c = c3;
            this.f10719d = AbstractC1570b.c(c3);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public G1(Context context, TypedArray typedArray) {
        this.f10716a = 20;
        this.f10717b = context;
        this.f10718c = typedArray;
    }

    public G1(Context context, LocationManager locationManager) {
        this.f10716a = 10;
        this.f10719d = new Object();
        this.f10717b = context;
        this.f10718c = locationManager;
    }

    public G1(String str, A4.r rVar) {
        this.f10716a = 19;
        this.f10718c = rVar;
        this.f10717b = str;
        this.f10719d = new HashMap();
    }

    public G1(Context context) {
        this.f10716a = 23;
        this.f10717b = context.getApplicationContext();
        this.f10718c = H1.d.f2947a;
        this.f10719d = new H1.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l3.M, java.lang.Object] */
    public G1(InterfaceC1561j[] interfaceC1561jArr) {
        this.f10716a = 15;
        l3.K k5 = new l3.K();
        ?? obj = new Object();
        obj.f20347c = 1.0f;
        obj.f20348d = 1.0f;
        C1559h c1559h = C1559h.f20402e;
        obj.f20349e = c1559h;
        obj.f20350f = c1559h;
        obj.f20351g = c1559h;
        obj.f20352h = c1559h;
        ByteBuffer byteBuffer = InterfaceC1561j.f20407a;
        obj.f20354k = byteBuffer;
        obj.f20355l = byteBuffer.asShortBuffer();
        obj.f20356m = byteBuffer;
        obj.f20346b = -1;
        InterfaceC1561j[] interfaceC1561jArr2 = new InterfaceC1561j[interfaceC1561jArr.length + 2];
        this.f10717b = interfaceC1561jArr2;
        System.arraycopy(interfaceC1561jArr, 0, interfaceC1561jArr2, 0, interfaceC1561jArr.length);
        this.f10718c = k5;
        this.f10719d = obj;
        interfaceC1561jArr2[interfaceC1561jArr.length] = k5;
        interfaceC1561jArr2[interfaceC1561jArr.length + 1] = obj;
    }

    public G1(com.google.firebase.messaging.s sVar, C0675y c0675y, C1086d c1086d, Set set) {
        this.f10716a = 8;
        this.f10717b = c0675y;
        this.f10718c = sVar;
        this.f10719d = c1086d;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            x(str, 0, str.length(), 1, true, new O5.g(str, 1));
        }
    }

    public G1(C0701c c0701c) {
        this.f10716a = 1;
        this.f10716a = 1;
        this.f10717b = c0701c;
        this.f10718c = Choreographer.getInstance();
        this.f10719d = new W.e(1, this);
    }

    public G1(C1971e c1971e, android.support.v4.media.session.y yVar) {
        this.f10716a = 22;
        this.f10719d = c1971e;
        this.f10717b = yVar;
    }

    public G1(l3.D d9) {
        this.f10716a = 16;
        this.f10719d = d9;
        this.f10717b = new Handler(Looper.myLooper());
        this.f10718c = new l3.C(this);
    }
}
