package H;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import s.C1939i;

/* loaded from: classes.dex */
public final class h extends M4.a {
    public static final Class j;

    /* renamed from: k, reason: collision with root package name */
    public static final Constructor f2927k;

    /* renamed from: l, reason: collision with root package name */
    public static final Method f2928l;

    /* renamed from: m, reason: collision with root package name */
    public static final Method f2929m;

    static {
        Method method;
        Class<?> cls;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi24Impl", e8.getClass().getName(), e8);
            method = null;
            cls = null;
            method2 = null;
        }
        f2927k = constructor;
        j = cls;
        f2928l = method2;
        f2929m = method;
    }

    public static boolean C(Object obj, ByteBuffer byteBuffer, int i9, int i10, boolean z9) {
        try {
            return ((Boolean) f2928l.invoke(obj, byteBuffer, Integer.valueOf(i9), null, Integer.valueOf(i10), Boolean.valueOf(z9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface D(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) j, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2929m.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067 A[SYNTHETIC] */
    @Override // M4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface d(android.content.Context r17, G.e r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r1 = 0
            java.lang.reflect.Constructor r0 = H.h.f2927k     // Catch: java.lang.Throwable -> L9
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L9
            r2 = r0
            goto La
        L9:
            r2 = r1
        La:
            if (r2 != 0) goto Ld
            goto L67
        Ld:
            r0 = r18
            G.f[] r3 = r0.f2603a
            int r4 = r3.length
            r0 = 0
            r5 = r0
        L14:
            if (r5 >= r4) goto L70
            r6 = r3[r5]
            int r0 = r6.f2609f
            java.io.File r7 = O4.h.x(r17)
            if (r7 != 0) goto L24
            r8 = r19
        L22:
            r0 = r1
            goto L58
        L24:
            r8 = r19
            boolean r0 = O4.h.n(r7, r8, r0)     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L30
            r7.delete()
            goto L22
        L30:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6b
            r9.<init>(r7)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6b
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch: java.lang.Throwable -> L49
            long r14 = r10.size()     // Catch: java.lang.Throwable -> L49
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L49
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch: java.lang.Throwable -> L49
            r9.close()     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6b
            goto L55
        L49:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r0 = move-exception
            r10.addSuppressed(r0)     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6b
        L53:
            throw r10     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L6b
        L54:
            r0 = r1
        L55:
            r7.delete()
        L58:
            if (r0 != 0) goto L5b
            goto L67
        L5b:
            int r7 = r6.f2605b
            boolean r9 = r6.f2606c
            int r6 = r6.f2608e
            boolean r0 = C(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L68
        L67:
            return r1
        L68:
            int r5 = r5 + 1
            goto L14
        L6b:
            r0 = move-exception
            r7.delete()
            throw r0
        L70:
            android.graphics.Typeface r0 = D(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H.h.d(android.content.Context, G.e, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // M4.a
    public final Typeface e(Context context, M.i[] iVarArr, int i9) {
        Object obj;
        try {
            obj = f2927k.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i10 = 0;
            C1939i c1939i = new C1939i(0);
            int length = iVarArr.length;
            while (true) {
                if (i10 < length) {
                    M.i iVar = iVarArr[i10];
                    Uri uri = iVar.f4669a;
                    ByteBuffer byteBuffer = (ByteBuffer) c1939i.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = O4.h.C(context, uri);
                        c1939i.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null) {
                        break;
                    }
                    if (!C(obj, byteBuffer, iVar.f4670b, iVar.f4671c, iVar.f4672d)) {
                        break;
                    }
                    i10++;
                } else {
                    Typeface D8 = D(obj);
                    if (D8 != null) {
                        return Typeface.create(D8, i9);
                    }
                }
            }
        }
        return null;
    }
}
