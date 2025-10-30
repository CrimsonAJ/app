package com.google.android.gms.internal.measurement;

import Y7.K;
import a.AbstractC0485a;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.view.View;
import b5.G1;
import b7.C0701c;
import c7.C0785e;
import c7.C0790j;
import co.notix.R;
import d0.o;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l6.C1574f;
import p.AbstractC1782Z0;
import q3.C1909n;
import t1.C1993b;
import t1.C2004m;
import u0.C2038i;
import v1.C2100h;
import w.AbstractC2128h;
import x8.n;
import x8.y;

/* loaded from: classes.dex */
public abstract class D1 implements P.Y {

    /* renamed from: a, reason: collision with root package name */
    public static volatile O5.h f15194a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15195b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f15196c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f15197d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f15198e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f15199f = 0;

    public static E7.d A(E7.d dVar) {
        G7.c cVar;
        E7.d<Object> intercepted;
        kotlin.jvm.internal.h.e(dVar, "<this>");
        if (dVar instanceof G7.c) {
            cVar = (G7.c) dVar;
        } else {
            cVar = null;
        }
        if (cVar != null && (intercepted = cVar.intercepted()) != null) {
            return intercepted;
        }
        return dVar;
    }

    public static boolean C(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static long D(int i9, byte[] bArr) {
        return (((bArr[i9 + 3] & 255) << 24) | (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16)) & 4294967295L;
    }

    public static final ArrayList E(Map map, O7.l lVar) {
        Boolean bool;
        kotlin.jvm.internal.h.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C2038i c2038i = (C2038i) entry.getValue();
            if (c2038i != null) {
                bool = Boolean.valueOf(c2038i.f23487b);
            } else {
                bool = null;
            }
            kotlin.jvm.internal.h.b(bool);
            if (!bool.booleanValue() && !c2038i.f23488c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) lVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static int F(int i9) {
        int i10 = i9 % 65536;
        if (i10 >= 0) {
            return i10;
        }
        return i10 + 65536;
    }

    public static int G(int i9, A4.r rVar) {
        switch (i9) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i9 - 2);
            case 6:
                return rVar.x() + 1;
            case 7:
                return rVar.C() + 1;
            case 8:
            case 9:
            case R.styleable.GradientColor_android_endX /* 10 */:
            case R.styleable.GradientColor_android_endY /* 11 */:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i9 - 8);
            default:
                return -1;
        }
    }

    public static void J(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1782Z0.a(view, charSequence);
            return;
        }
        p.b1 b1Var = p.b1.f21960k;
        if (b1Var != null && b1Var.f21962a == view) {
            p.b1.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            p.b1 b1Var2 = p.b1.f21961l;
            if (b1Var2 != null && b1Var2.f21962a == view) {
                b1Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new p.b1(view, charSequence);
    }

    public static int K(int i9) {
        int b9 = AbstractC2128h.b(i9);
        if (b9 != 0) {
            int i10 = 1;
            if (b9 != 1) {
                i10 = 2;
                if (b9 != 2) {
                    i10 = 3;
                    if (b9 != 3) {
                        i10 = 4;
                        if (b9 != 4) {
                            if (b9 == 5) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + AbstractC0953k1.A(i9) + " to int");
                        }
                    }
                }
            }
            return i10;
        }
        return 0;
    }

    public static void L(byte[] bArr, long j, int i9) {
        int i10 = 0;
        while (i10 < 4) {
            bArr[i9 + i10] = (byte) (255 & j);
            i10++;
            j >>= 8;
        }
    }

    public static Object N(O7.p pVar, Object obj, E7.d dVar) {
        Object cVar;
        kotlin.jvm.internal.h.e(pVar, "<this>");
        E7.i context = dVar.getContext();
        if (context == E7.j.f1978a) {
            cVar = new G7.h(dVar);
        } else {
            cVar = new G7.c(dVar, context);
        }
        kotlin.jvm.internal.r.c(2, pVar);
        return pVar.invoke(obj, cVar);
    }

    public static final void O(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i9) {
        if (i9 >= 0 && byteBuffer2.remaining() >= i9 && byteBuffer3.remaining() >= i9 && byteBuffer.remaining() >= i9) {
            for (int i10 = 0; i10 < i9; i10++) {
                byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
            }
            return;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final byte[] P(int i9, int i10, int i11, byte[] bArr, byte[] bArr2) {
        if (i11 >= 0 && bArr.length - i11 >= i9 && bArr2.length - i11 >= i10) {
            byte[] bArr3 = new byte[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                bArr3[i12] = (byte) (bArr[i12 + i9] ^ bArr2[i12 + i10]);
            }
            return bArr3;
        }
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final byte[] Q(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return P(0, 0, bArr.length, bArr, bArr2);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, Object obj, int i9, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i9, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i9 && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i9, i10, 33);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0043 -> B:16:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e1.e e(byte[] r7) {
        /*
            e1.e r0 = new e1.e
            r0.<init>()
            if (r7 != 0) goto L8
            goto L5f
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L17:
            if (r7 <= 0) goto L36
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            e1.d r5 = new e1.d     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.HashSet r3 = r0.f17041a     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.add(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r7 = r7 + (-1)
            goto L17
        L32:
            r7 = move-exception
            goto L60
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r7.printStackTrace()
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L5f
        L42:
            r7 = move-exception
            r7.printStackTrace()
            goto L5f
        L47:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L60
        L4b:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L5c
            r2.close()     // Catch: java.io.IOException -> L58
            goto L5c
        L58:
            r7 = move-exception
            r7.printStackTrace()
        L5c:
            r1.close()     // Catch: java.io.IOException -> L42
        L5f:
            return r0
        L60:
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            r1.close()     // Catch: java.io.IOException -> L6e
            goto L72
        L6e:
            r0 = move-exception
            r0.printStackTrace()
        L72:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D1.e(byte[]):e1.e");
    }

    public static boolean f(A4.r rVar, C1909n c1909n, int i9, C0790j c0790j) {
        boolean z9;
        boolean z10;
        int i10 = rVar.f382a;
        long y9 = rVar.y();
        long j = y9 >>> 16;
        if (j != i9) {
            return false;
        }
        if ((j & 1) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i11 = (int) ((y9 >> 12) & 15);
        int i12 = (int) ((y9 >> 8) & 15);
        int i13 = (int) ((y9 >> 4) & 15);
        int i14 = (int) ((y9 >> 1) & 7);
        if ((y9 & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i13 <= 7) {
            if (i13 != c1909n.f22330g - 1) {
                return false;
            }
        } else if (i13 > 10 || c1909n.f22330g != 2) {
            return false;
        }
        if ((i14 != 0 && i14 != c1909n.f22332i) || z10) {
            return false;
        }
        try {
            long D8 = rVar.D();
            if (!z9) {
                D8 *= c1909n.f22325b;
            }
            c0790j.f11723a = D8;
            int G8 = G(i11, rVar);
            if (G8 == -1 || G8 > c1909n.f22325b) {
                return false;
            }
            if (i12 != 0) {
                if (i12 <= 11) {
                    if (i12 != c1909n.f22329f) {
                        return false;
                    }
                } else {
                    int i15 = c1909n.f22328e;
                    if (i12 == 12) {
                        if (rVar.x() * 1000 != i15) {
                            return false;
                        }
                    } else {
                        if (i12 > 14) {
                            return false;
                        }
                        int C8 = rVar.C();
                        if (i12 == 14) {
                            C8 *= 10;
                        }
                        if (C8 != i15) {
                            return false;
                        }
                    }
                }
            }
            int x5 = rVar.x();
            int i16 = rVar.f382a;
            byte[] bArr = (byte[]) rVar.f384c;
            int i17 = i16 - 1;
            int i18 = l4.y.f20553a;
            int i19 = 0;
            for (int i20 = i10; i20 < i17; i20++) {
                i19 = l4.y.f20565n[i19 ^ (bArr[i20] & 255)];
            }
            if (x5 == i19) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static final void h(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                O4.h.a(th, th2);
            }
        }
    }

    public static byte[] i(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long D8 = D(0, bArr) & 67108863;
            int i9 = 3;
            long D9 = (D(3, bArr) >> 2) & 67108611;
            long D10 = (D(6, bArr) >> 4) & 67092735;
            long D11 = (D(9, bArr) >> 6) & 66076671;
            long D12 = (D(12, bArr) >> 8) & 1048575;
            long j = D9 * 5;
            long j4 = D10 * 5;
            long j9 = D11 * 5;
            long j10 = D12 * 5;
            byte[] bArr3 = new byte[17];
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            int i10 = 0;
            while (i10 < bArr2.length) {
                int min = Math.min(16, bArr2.length - i10);
                System.arraycopy(bArr2, i10, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, 17, (byte) 0);
                }
                long D13 = j15 + (D(0, bArr3) & 67108863);
                long D14 = j11 + ((D(i9, bArr3) >> 2) & 67108863);
                long D15 = j12 + ((D(6, bArr3) >> 4) & 67108863);
                long D16 = j13 + ((D(9, bArr3) >> 6) & 67108863);
                long j16 = D9;
                long D17 = j14 + (((D(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
                long j17 = (D17 * j) + (D16 * j4) + (D15 * j9) + (D14 * j10) + (D13 * D8);
                long j18 = (D17 * j4) + (D16 * j9) + (D15 * j10) + (D14 * D8) + (D13 * j16);
                long j19 = (D17 * j9) + (D16 * j10) + (D15 * D8) + (D14 * j16) + (D13 * D10);
                long j20 = (D17 * j10) + (D16 * D8) + (D15 * j16) + (D14 * D10) + (D13 * D11);
                long j21 = D16 * j16;
                long j22 = D17 * D8;
                long j23 = j18 + (j17 >> 26);
                long j24 = j19 + (j23 >> 26);
                long j25 = j20 + (j24 >> 26);
                long j26 = j22 + j21 + (D15 * D10) + (D14 * D11) + (D13 * D12) + (j25 >> 26);
                long j27 = j26 >> 26;
                j14 = j26 & 67108863;
                long j28 = (j27 * 5) + (j17 & 67108863);
                i10 += 16;
                j12 = j24 & 67108863;
                j13 = j25 & 67108863;
                j15 = j28 & 67108863;
                j11 = (j23 & 67108863) + (j28 >> 26);
                D9 = j16;
                i9 = 3;
            }
            long j29 = j12 + (j11 >> 26);
            long j30 = j29 & 67108863;
            long j31 = j13 + (j29 >> 26);
            long j32 = j31 & 67108863;
            long j33 = j14 + (j31 >> 26);
            long j34 = j33 & 67108863;
            long j35 = ((j33 >> 26) * 5) + j15;
            long j36 = j35 >> 26;
            long j37 = j35 & 67108863;
            long j38 = (j11 & 67108863) + j36;
            long j39 = j37 + 5;
            long j40 = j39 & 67108863;
            long j41 = j38 + (j39 >> 26);
            long j42 = j30 + (j41 >> 26);
            long j43 = j32 + (j42 >> 26);
            long j44 = j43 & 67108863;
            long j45 = (j34 + (j43 >> 26)) - 67108864;
            long j46 = j45 >> 63;
            long j47 = j37 & j46;
            long j48 = j38 & j46;
            long j49 = j30 & j46;
            long j50 = j32 & j46;
            long j51 = j34 & j46;
            long j52 = ~j46;
            long j53 = j48 | (j41 & 67108863 & j52);
            long j54 = j49 | (j42 & 67108863 & j52);
            long j55 = j50 | (j44 & j52);
            long j56 = (j47 | (j40 & j52) | (j53 << 26)) & 4294967295L;
            long j57 = ((j53 >> 6) | (j54 << 20)) & 4294967295L;
            long j58 = ((j54 >> 12) | (j55 << 14)) & 4294967295L;
            long j59 = ((j55 >> 18) | ((j51 | (j45 & j52)) << 8)) & 4294967295L;
            long D18 = D(16, bArr) + j56;
            long j60 = D18 & 4294967295L;
            long D19 = D(20, bArr) + j57 + (D18 >> 32);
            long D20 = D(24, bArr) + j58 + (D19 >> 32);
            long D21 = (D(28, bArr) + j59 + (D20 >> 32)) & 4294967295L;
            byte[] bArr4 = new byte[16];
            L(bArr4, j60, 0);
            L(bArr4, D19 & 4294967295L, 4);
            L(bArr4, D20 & 4294967295L, 8);
            L(bArr4, D21, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    public static byte[] j(byte[]... bArr) {
        int i9 = 0;
        for (byte[] bArr2 : bArr) {
            if (i9 <= Integer.MAX_VALUE - bArr2.length) {
                i9 += bArr2.length;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i9];
        int i10 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i10, bArr4.length);
            i10 += bArr4.length;
        }
        return bArr3;
    }

    public static final C2004m k(Context context) {
        final b5.G1 g12 = new b5.G1(context);
        final int i9 = 0;
        A7.l q9 = Z0.a.q(new O7.a() { // from class: t1.d
            /* JADX WARN: Type inference failed for: r2v6, types: [v1.a, java.lang.Object] */
            @Override // O7.a
            public final Object invoke() {
                A1.j c0701c;
                int i10;
                C2100h c2100h;
                int i11 = 0;
                switch (i9) {
                    case 0:
                        Context context2 = (Context) g12.f10717b;
                        Bitmap.Config[] configArr = H1.f.f2949a;
                        double d9 = 0.2d;
                        try {
                            Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                            kotlin.jvm.internal.h.b(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d9 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        A1.i iVar = new A1.i(0);
                        if (d9 > 0.0d) {
                            Bitmap.Config[] configArr2 = H1.f.f2949a;
                            try {
                                Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                kotlin.jvm.internal.h.b(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                if ((context2.getApplicationInfo().flags & 1048576) != 0) {
                                    i10 = activityManager.getLargeMemoryClass();
                                } else {
                                    i10 = activityManager.getMemoryClass();
                                }
                            } catch (Exception unused2) {
                                i10 = 256;
                            }
                            double d10 = d9 * i10;
                            double d11 = 1024;
                            i11 = (int) (d10 * d11 * d11);
                        }
                        if (i11 > 0) {
                            c0701c = new A1.g(i11, iVar);
                        } else {
                            c0701c = new C0701c(1, iVar);
                        }
                        return new A1.d(c0701c, iVar);
                    default:
                        G1 g13 = g12;
                        H1.l lVar = H1.l.f2965a;
                        Context context3 = (Context) g13.f10717b;
                        synchronized (lVar) {
                            try {
                                c2100h = H1.l.f2966b;
                                if (c2100h == null) {
                                    ?? obj = new Object();
                                    obj.f23723b = n.f24664a;
                                    obj.f23724c = 0.02d;
                                    obj.f23725d = 10485760L;
                                    obj.f23726e = 262144000L;
                                    obj.f23727f = K.f8774b;
                                    Bitmap.Config[] configArr3 = H1.f.f2949a;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir != null) {
                                        cacheDir.mkdirs();
                                        File K = L7.a.K(cacheDir);
                                        String str = y.f24685b;
                                        obj.f23722a = o.h(K);
                                        c2100h = obj.a();
                                        H1.l.f2966b = c2100h;
                                    } else {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                }
                            } finally {
                            }
                        }
                        return c2100h;
                }
            }
        });
        final int i10 = 1;
        A7.l q10 = Z0.a.q(new O7.a() { // from class: t1.d
            /* JADX WARN: Type inference failed for: r2v6, types: [v1.a, java.lang.Object] */
            @Override // O7.a
            public final Object invoke() {
                A1.j c0701c;
                int i102;
                C2100h c2100h;
                int i11 = 0;
                switch (i10) {
                    case 0:
                        Context context2 = (Context) g12.f10717b;
                        Bitmap.Config[] configArr = H1.f.f2949a;
                        double d9 = 0.2d;
                        try {
                            Object systemService = context2.getSystemService((Class<Object>) ActivityManager.class);
                            kotlin.jvm.internal.h.b(systemService);
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d9 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        A1.i iVar = new A1.i(0);
                        if (d9 > 0.0d) {
                            Bitmap.Config[] configArr2 = H1.f.f2949a;
                            try {
                                Object systemService2 = context2.getSystemService((Class<Object>) ActivityManager.class);
                                kotlin.jvm.internal.h.b(systemService2);
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                if ((context2.getApplicationInfo().flags & 1048576) != 0) {
                                    i102 = activityManager.getLargeMemoryClass();
                                } else {
                                    i102 = activityManager.getMemoryClass();
                                }
                            } catch (Exception unused2) {
                                i102 = 256;
                            }
                            double d10 = d9 * i102;
                            double d11 = 1024;
                            i11 = (int) (d10 * d11 * d11);
                        }
                        if (i11 > 0) {
                            c0701c = new A1.g(i11, iVar);
                        } else {
                            c0701c = new C0701c(1, iVar);
                        }
                        return new A1.d(c0701c, iVar);
                    default:
                        G1 g13 = g12;
                        H1.l lVar = H1.l.f2965a;
                        Context context3 = (Context) g13.f10717b;
                        synchronized (lVar) {
                            try {
                                c2100h = H1.l.f2966b;
                                if (c2100h == null) {
                                    ?? obj = new Object();
                                    obj.f23723b = n.f24664a;
                                    obj.f23724c = 0.02d;
                                    obj.f23725d = 10485760L;
                                    obj.f23726e = 262144000L;
                                    obj.f23727f = K.f8774b;
                                    Bitmap.Config[] configArr3 = H1.f.f2949a;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir != null) {
                                        cacheDir.mkdirs();
                                        File K = L7.a.K(cacheDir);
                                        String str = y.f24685b;
                                        obj.f23722a = o.h(K);
                                        c2100h = obj.a();
                                        H1.l.f2966b = c2100h;
                                    } else {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                }
                            } finally {
                            }
                        }
                        return c2100h;
                }
            }
        });
        A7.l q11 = Z0.a.q(new C2.P(16));
        B7.t tVar = B7.t.f1135a;
        return new C2004m((Context) g12.f10717b, (C1.c) g12.f10718c, q9, q10, q11, new C1993b(tVar, tVar, tVar, tVar, tVar), (H1.j) g12.f10719d);
    }

    public static final void m(x8.n nVar, x8.y yVar) {
        try {
            IOException iOException = null;
            for (x8.y yVar2 : nVar.f(yVar)) {
                try {
                    if (nVar.g(yVar2).f24657c) {
                        m(nVar, yVar2);
                    }
                    nVar.c(yVar2);
                } catch (IOException e8) {
                    if (iOException == null) {
                        iOException = e8;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static String o() {
        Object obj = B2.h.f628a.get();
        kotlin.jvm.internal.h.d(obj, "get(...)");
        return (String) obj;
    }

    public static ColorStateList p(Context context, TypedArray typedArray, int i9) {
        int resourceId;
        ColorStateList c3;
        if (typedArray.hasValue(i9) && (resourceId = typedArray.getResourceId(i9, 0)) != 0 && (c3 = E.d.c(context, resourceId)) != null) {
            return c3;
        }
        return typedArray.getColorStateList(i9);
    }

    public static ColorStateList q(Context context, b5.G1 g12, int i9) {
        int resourceId;
        ColorStateList c3;
        TypedArray typedArray = (TypedArray) g12.f10718c;
        if (typedArray.hasValue(i9) && (resourceId = typedArray.getResourceId(i9, 0)) != 0 && (c3 = E.d.c(context, resourceId)) != null) {
            return c3;
        }
        return g12.n(i9);
    }

    public static int r(Context context, TypedArray typedArray, int i9, int i10) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i9, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i10);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i9, i10);
    }

    public static void s(S5.p pVar) {
        boolean z9 = false;
        if (pVar.isDone()) {
            while (true) {
                try {
                    pVar.get();
                    break;
                } catch (InterruptedException unused) {
                    z9 = true;
                } catch (Throwable th) {
                    if (z9) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z9) {
                Thread.currentThread().interrupt();
                return;
            }
            return;
        }
        throw new IllegalStateException(Z0.a.r("Future was expected to be done: %s", pVar));
    }

    public static Drawable t(Context context, TypedArray typedArray, int i9) {
        int resourceId;
        Drawable q9;
        if (typedArray.hasValue(i9) && (resourceId = typedArray.getResourceId(i9, 0)) != 0 && (q9 = AbstractC0485a.q(context, resourceId)) != null) {
            return q9;
        }
        return typedArray.getDrawable(i9);
    }

    public static final C0785e v() {
        C0785e a5 = ((c7.n) C1574f.c().b(c7.n.class)).a();
        kotlin.jvm.internal.h.d(a5, "getInstance()");
        return a5;
    }

    public static int w(int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(A0.a.m("Could not convert ", i9, " to BackoffPolicy"));
    }

    public static int x(int i9) {
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
        if (i9 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i9 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(A0.a.m("Could not convert ", i9, " to NetworkType"));
    }

    public static int y(int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(A0.a.m("Could not convert ", i9, " to OutOfQuotaPolicy"));
    }

    public static int z(int i9) {
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
        if (i9 == 4) {
            return 5;
        }
        if (i9 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(A0.a.m("Could not convert ", i9, " to State"));
    }

    public abstract boolean B();

    public abstract void H(boolean z9);

    public abstract void I(boolean z9);

    public abstract TransformationMethod M(TransformationMethod transformationMethod);

    public abstract List g(String str, List list);

    public abstract String l(byte[] bArr, int i9, int i10);

    public abstract int n(int i9, int i10, String str, byte[] bArr);

    public abstract InputFilter[] u(InputFilter[] inputFilterArr);

    @Override // P.Y
    public void b() {
    }

    @Override // P.Y
    public void c() {
    }
}
