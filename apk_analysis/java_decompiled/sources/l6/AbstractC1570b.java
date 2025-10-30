package l6;

import A4.r;
import B6.u0;
import B7.k;
import B7.m;
import B7.t;
import B7.v;
import G2.q;
import G7.j;
import O7.l;
import Y7.B;
import Y7.K;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Build;
import android.provider.Settings;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import b7.C0701c;
import co.notix.R;
import com.anilab.android.ui.player.PlayerActivity;
import com.google.android.gms.internal.measurement.AbstractC0936h;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.C0916d;
import com.google.android.gms.internal.measurement.C0926f;
import com.google.android.gms.internal.measurement.C0931g;
import com.google.android.gms.internal.measurement.C0961m;
import com.google.android.gms.internal.measurement.C0995t;
import com.google.android.gms.internal.measurement.InterfaceC0966n;
import com.google.firebase.messaging.s;
import i8.y;
import j3.j0;
import java.io.BufferedReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import l4.AbstractC1566a;
import q3.w;
import s8.n;
import u0.C;
import u0.C2032c;
import u0.F;
import x8.C2190j;

/* renamed from: l6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1570b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20575a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20576b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f20577c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f20578d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f20579e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f20580f = 0;

    public static C0916d A(C0916d c0916d, s sVar, C0961m c0961m, Boolean bool, Boolean bool2) {
        C0916d c0916d2 = new C0916d();
        Iterator s9 = c0916d.s();
        while (s9.hasNext()) {
            int intValue = ((Integer) s9.next()).intValue();
            if (c0916d.w(intValue)) {
                InterfaceC0966n a5 = c0961m.a(sVar, Arrays.asList(c0916d.q(intValue), new C0931g(Double.valueOf(intValue)), c0916d));
                if (a5.o().equals(bool)) {
                    break;
                }
                if (bool2 == null || a5.o().equals(bool2)) {
                    c0916d2.v(intValue, a5);
                }
            }
        }
        return c0916d2;
    }

    public static InterfaceC0966n B(C0916d c0916d, s sVar, ArrayList arrayList, boolean z9) {
        InterfaceC0966n interfaceC0966n;
        int i9;
        int i10;
        int i11 = -1;
        n.b0(1, "reduce", arrayList);
        n.c0("reduce", 2, arrayList);
        InterfaceC0966n a5 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(0));
        if (a5 instanceof AbstractC0936h) {
            if (arrayList.size() == 2) {
                interfaceC0966n = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(1));
                if (interfaceC0966n instanceof C0926f) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (c0916d.p() != 0) {
                interfaceC0966n = null;
            } else {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            AbstractC0936h abstractC0936h = (AbstractC0936h) a5;
            int p9 = c0916d.p();
            if (z9) {
                i9 = 0;
            } else {
                i9 = p9 - 1;
            }
            if (z9) {
                i10 = p9 - 1;
            } else {
                i10 = 0;
            }
            if (true == z9) {
                i11 = 1;
            }
            if (interfaceC0966n == null) {
                interfaceC0966n = c0916d.q(i9);
                i9 += i11;
            }
            while ((i10 - i9) * i11 >= 0) {
                if (!c0916d.w(i9)) {
                    i9 += i11;
                } else {
                    interfaceC0966n = abstractC0936h.a(sVar, Arrays.asList(interfaceC0966n, c0916d.q(i9), new C0931g(Double.valueOf(i9)), c0916d));
                    if (!(interfaceC0966n instanceof C0926f)) {
                        i9 += i11;
                    } else {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                }
            }
            return interfaceC0966n;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }

    public static void a(StringBuilder sb, Object obj, l lVar) {
        boolean z9;
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z9 = true;
        } else {
            z9 = obj instanceof CharSequence;
        }
        if (z9) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (M4.a.b(r9, r1, r3, r2, r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap b(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, D1.h r7, D1.g r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.AbstractC1570b.b(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, D1.h, D1.g, boolean):android.graphics.Bitmap");
    }

    public static byte[] c(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i9 = 0; i9 < 16; i9++) {
                byte b9 = (byte) ((bArr[i9] << 1) & 254);
                bArr2[i9] = b9;
                if (i9 < 15) {
                    bArr2[i9] = (byte) (((byte) ((bArr[i9 + 1] >> 7) & 1)) | b9);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    public static C d(F f9) {
        Iterator it = V7.l.g0(f9, C2032c.f23475k).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return (C) next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static int e(Context context) {
        boolean z9;
        int i9;
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z9 = true;
        } else {
            z9 = false;
        }
        TypedValue typedValue = new TypedValue();
        Resources resources = context.getResources();
        if (z9) {
            i9 = R.dimen.mr_dialog_fixed_width_minor;
        } else {
            i9 = R.dimen.mr_dialog_fixed_width_major;
        }
        resources.getValue(i9, typedValue, true);
        int i10 = typedValue.type;
        if (i10 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else if (i10 == 6) {
            int i11 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i11, i11);
        } else {
            return -2;
        }
        return (int) fraction;
    }

    public static final Class f(U7.c cVar) {
        kotlin.jvm.internal.h.e(cVar, "<this>");
        Class a5 = ((kotlin.jvm.internal.c) cVar).a();
        kotlin.jvm.internal.h.c(a5, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    public static final Class g(U7.c cVar) {
        kotlin.jvm.internal.h.e(cVar, "<this>");
        Class a5 = ((kotlin.jvm.internal.c) cVar).a();
        if (a5.isPrimitive()) {
            String name = a5.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a5;
    }

    public static R0.c h(C0701c refHolder, SQLiteDatabase sQLiteDatabase) {
        kotlin.jvm.internal.h.e(refHolder, "refHolder");
        R0.c cVar = (R0.c) refHolder.f11404b;
        if (cVar != null && cVar.f6469a.equals(sQLiteDatabase)) {
            return cVar;
        }
        R0.c cVar2 = new R0.c(sQLiteDatabase);
        refHolder.f11404b = cVar2;
        return cVar2;
    }

    public static int i(int i9) {
        int i10 = 0;
        while (i9 > 0) {
            i10++;
            i9 >>>= 1;
        }
        return i10;
    }

    public static int j(int i9) {
        if (i9 != 1) {
            if (i9 == 2) {
                return 1;
            }
            if (i9 == 4) {
                return 2;
            }
            if (i9 != 8) {
                if (i9 == 16) {
                    return 4;
                }
                if (i9 != 32) {
                    if (i9 != 64) {
                        if (i9 != 128) {
                            if (i9 == 256) {
                                return 8;
                            }
                            if (i9 == 512) {
                                return 9;
                            }
                            throw new IllegalArgumentException(AbstractC0953k1.j(i9, "type needs to be >= FIRST and <= LAST, type="));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004a, code lost:
    
        if (r14 == r4) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[LOOP:0: B:17:0x005b->B:18:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084 A[LOOP:1: B:21:0x0082->B:22:0x0084, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r5v1, types: [G7.j, O7.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(G7.c r14) {
        /*
            r0 = 9
            r1 = 7
            r2 = 1
            boolean r3 = r14 instanceof t2.C2005a
            if (r3 == 0) goto L17
            r3 = r14
            t2.a r3 = (t2.C2005a) r3
            int r4 = r3.f23106s
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f23106s = r4
            goto L1c
        L17:
            t2.a r3 = new t2.a
            r3.<init>(r14)
        L1c:
            java.lang.Object r14 = r3.f23105r
            F7.a r4 = F7.a.f2587a
            int r5 = r3.f23106s
            r6 = 2
            if (r5 == 0) goto L39
            if (r5 == r2) goto L35
            if (r5 != r6) goto L2d
            a.AbstractC0485a.A(r14)
            return r14
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L35:
            a.AbstractC0485a.A(r14)
            goto L4d
        L39:
            a.AbstractC0485a.A(r14)
            f8.d r14 = Y7.K.f8774b
            t2.b r5 = new t2.b
            r7 = 0
            r5.<init>(r6, r7)
            r3.f23106s = r2
            java.lang.Object r14 = Y7.B.C(r14, r5, r3)
            if (r14 != r4) goto L4d
            goto Lb9
        L4d:
            java.lang.String r14 = (java.lang.String) r14
            byte[] r5 = new byte[r1]
            r5 = {x00bc: FILL_ARRAY_DATA , data: [123, 101, 123, 101, 123, 101, 123} // fill-array
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r1)
            r13 = 0
            r8 = r13
        L5b:
            if (r8 >= r1) goto L6d
            r9 = r5[r8]
            byte r9 = (byte) r9
            r9 = r9 ^ 75
            char r9 = (char) r9
            java.lang.Character r10 = new java.lang.Character
            r10.<init>(r9)
            r7.add(r10)
            int r8 = r8 + r2
            goto L5b
        L6d:
            r10 = 0
            r11 = 0
            java.lang.String r8 = ""
            r9 = 0
            r12 = 62
            java.lang.String r1 = B7.k.u0(r7, r8, r9, r10, r11, r12)
            byte[] r5 = new byte[r0]
            r5 = {x00c4: FILL_ARRAY_DATA , data: [103, 100, 97, 120, 102, 120, 102, 120, 103} // fill-array
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
        L82:
            if (r13 >= r0) goto L94
            r8 = r5[r13]
            byte r8 = (byte) r8
            r8 = r8 ^ 86
            char r8 = (char) r8
            java.lang.Character r9 = new java.lang.Character
            r9.<init>(r8)
            r7.add(r9)
            int r13 = r13 + r2
            goto L82
        L94:
            r10 = 0
            r11 = 0
            java.lang.String r8 = ""
            r9 = 0
            r12 = 62
            java.lang.String r0 = B7.k.u0(r7, r8, r9, r10, r11, r12)
            boolean r1 = kotlin.jvm.internal.h.a(r14, r1)
            if (r1 != 0) goto Lb1
            boolean r0 = kotlin.jvm.internal.h.a(r14, r0)
            if (r0 != 0) goto Lb1
            if (r14 != 0) goto Lae
            goto Lb1
        Lae:
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            return r14
        Lb1:
            r3.f23106s = r6
            java.lang.Object r14 = m(r3)
            if (r14 != r4) goto Lba
        Lb9:
            return r4
        Lba:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.AbstractC1570b.k(G7.c):java.lang.Object");
    }

    public static boolean l(byte b9) {
        if (b9 > -65) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [G7.j, O7.p] */
    public static final Object m(G7.c cVar) {
        return B.C(K.f8774b, new j(2, null), cVar);
    }

    public static final boolean n(PlayerActivity playerActivity) {
        String str;
        String str2 = null;
        try {
            byte[] bArr = {38, 36, 63, 32, 55, 34, 51, 9, 50, 56, 37, 9, 37, 38, 51, 53, 63, 48, 63, 51, 36};
            ArrayList arrayList = new ArrayList(21);
            for (int i9 = 0; i9 < 21; i9++) {
                arrayList.add(Character.valueOf((char) (bArr[i9] ^ 86)));
            }
            str = Settings.Global.getString(playerActivity.getContentResolver(), k.u0(arrayList, "", null, null, null, 62));
        } catch (Exception unused) {
            str = null;
        }
        try {
            byte[] bArr2 = {59, 57, 34, 61, 42, 63, 46, 20, 47, 37, 56, 20, 38, 36, 47, 46};
            ArrayList arrayList2 = new ArrayList(16);
            for (int i10 = 0; i10 < 16; i10++) {
                arrayList2.add(Character.valueOf((char) (bArr2[i10] ^ 75)));
            }
            str2 = Settings.Global.getString(playerActivity.getContentResolver(), k.u0(arrayList2, "", null, null, null, 62));
        } catch (Exception unused2) {
        }
        if (str != null && !W7.d.U(str) && str2 != null && !W7.d.U(str2)) {
            byte[] bArr3 = {63, 56, 36, 35, 57, 54, 58, 50};
            ArrayList arrayList3 = new ArrayList(8);
            for (int i11 = 0; i11 < 8; i11++) {
                arrayList3.add(Character.valueOf((char) (bArr3[i11] ^ 87)));
            }
            if (str2.equalsIgnoreCase(k.u0(arrayList3, "", null, null, null, 62))) {
                byte[] bArr4 = {60, 54, 43, 118, 57, 60, 63, 45, 57, 42, 60, 118, 59, 55, 53, 36, 62, 57, 53, 49, 52, 33, 118, 57, 60, 63, 45, 57, 42, 60, 118, 59, 55, 53};
                ArrayList arrayList4 = new ArrayList(34);
                for (int i12 = 0; i12 < 34; i12++) {
                    arrayList4.add(Character.valueOf((char) (bArr4[i12] ^ 88)));
                }
                List b02 = W7.d.b0(k.u0(arrayList4, "", null, null, null, 62), new String[]{"|"});
                if (!b02.isEmpty()) {
                    Iterator it = b02.iterator();
                    while (it.hasNext()) {
                        if (str.equalsIgnoreCase((String) it.next())) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static String o(y url) {
        kotlin.jvm.internal.h.e(url, "url");
        C2190j c2190j = C2190j.f24645d;
        return e0.c.D(url.f19177i).c("MD5").e();
    }

    public static float p(float f9, float f10, float f11) {
        return (f11 * f10) + ((1.0f - f11) * f9);
    }

    public static List q(q qVar, List list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(m.f0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(qVar.n(it.next()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return t.f1135a;
        }
        return arrayList;
    }

    public static Typeface r(Configuration configuration, Typeface typeface) {
        int i9;
        int i10;
        int weight;
        int i11;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i9 = configuration.fontWeightAdjustment;
            if (i9 != Integer.MAX_VALUE) {
                i10 = configuration.fontWeightAdjustment;
                if (i10 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i11 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, u0.k(i11 + weight, 1, 1000), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static D3.c s(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            String str = (String) list.get(i9);
            int i10 = l4.y.f20553a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                AbstractC1566a.P("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(G3.a.a(new r(Base64.decode(split[1], 0))));
                } catch (RuntimeException e8) {
                    AbstractC1566a.Q("VorbisUtil", "Failed to parse vorbis picture", e8);
                }
            } else {
                arrayList.add(new G3.b(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new D3.c(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r5 == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        com.google.android.gms.internal.measurement.Y1.i(16);
        r0 = java.lang.Integer.toString(r9, 16);
        kotlin.jvm.internal.h.d(r0, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0047, code lost:
    
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int t(x8.C r12) {
        /*
            java.lang.String r0 = "expected an int but was \""
            r1 = 1
            r12.g0(r1)     // Catch: java.lang.NumberFormatException -> L82
            r3 = 0
            r5 = r3
        La:
            long r7 = r5 + r1
            boolean r9 = r12.o(r7)     // Catch: java.lang.NumberFormatException -> L82
            x8.g r10 = r12.f24603b     // Catch: java.lang.NumberFormatException -> L82
            if (r9 == 0) goto L48
            byte r9 = r10.O(r5)     // Catch: java.lang.NumberFormatException -> L82
            r11 = 48
            if (r9 < r11) goto L20
            r11 = 57
            if (r9 <= r11) goto L29
        L20:
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L2b
            r6 = 45
            if (r9 == r6) goto L29
            goto L2b
        L29:
            r5 = r7
            goto La
        L2b:
            if (r5 == 0) goto L2e
            goto L48
        L2e:
            java.lang.NumberFormatException r12 = new java.lang.NumberFormatException     // Catch: java.lang.NumberFormatException -> L82
            r0 = 16
            com.google.android.gms.internal.measurement.Y1.i(r0)     // Catch: java.lang.NumberFormatException -> L82
            java.lang.String r0 = java.lang.Integer.toString(r9, r0)     // Catch: java.lang.NumberFormatException -> L82
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.h.d(r0, r1)     // Catch: java.lang.NumberFormatException -> L82
            java.lang.String r1 = "Expected a digit or '-' but was 0x"
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.NumberFormatException -> L82
            r12.<init>(r0)     // Catch: java.lang.NumberFormatException -> L82
            throw r12     // Catch: java.lang.NumberFormatException -> L82
        L48:
            long r1 = r10.k0()     // Catch: java.lang.NumberFormatException -> L82
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r12 = r12.a0(r5)     // Catch: java.lang.NumberFormatException -> L82
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L68
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L68
            int r3 = r12.length()     // Catch: java.lang.NumberFormatException -> L82
            if (r3 > 0) goto L68
            int r12 = (int) r1     // Catch: java.lang.NumberFormatException -> L82
            return r12
        L68:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.NumberFormatException -> L82
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L82
            r4.<init>(r0)     // Catch: java.lang.NumberFormatException -> L82
            r4.append(r1)     // Catch: java.lang.NumberFormatException -> L82
            r4.append(r12)     // Catch: java.lang.NumberFormatException -> L82
            r12 = 34
            r4.append(r12)     // Catch: java.lang.NumberFormatException -> L82
            java.lang.String r12 = r4.toString()     // Catch: java.lang.NumberFormatException -> L82
            r3.<init>(r12)     // Catch: java.lang.NumberFormatException -> L82
            throw r3     // Catch: java.lang.NumberFormatException -> L82
        L82:
            r12 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r12 = r12.getMessage()
            r0.<init>(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.AbstractC1570b.t(x8.C):int");
    }

    public static final String u(BufferedReader bufferedReader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = bufferedReader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = bufferedReader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        kotlin.jvm.internal.h.d(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    public static w v(r rVar, boolean z9, boolean z10) {
        if (z9) {
            y(3, rVar, false);
        }
        rVar.v((int) rVar.n(), O5.e.f5491c);
        long n7 = rVar.n();
        String[] strArr = new String[(int) n7];
        for (int i9 = 0; i9 < n7; i9++) {
            strArr[i9] = rVar.v((int) rVar.n(), O5.e.f5491c);
        }
        if (z10 && (rVar.x() & 1) == 0) {
            throw j0.a("framing bit expected to be set", null);
        }
        return new w(strArr);
    }

    public static long w(long j, long j4, long j9, int i9) {
        return j + l4.y.O(j4 - j9, 1000000L, i9);
    }

    public static Set x(i8.w wVar) {
        int size = wVar.size();
        TreeSet treeSet = null;
        for (int i9 = 0; i9 < size; i9++) {
            if ("Vary".equalsIgnoreCase(wVar.c(i9))) {
                String f9 = wVar.f(i9);
                if (treeSet == null) {
                    Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
                    kotlin.jvm.internal.h.d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
                    treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
                }
                Iterator it = W7.d.a0(f9, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(W7.d.j0((String) it.next()).toString());
                }
            }
        }
        if (treeSet == null) {
            return v.f1137a;
        }
        return treeSet;
    }

    public static boolean y(int i9, r rVar, boolean z9) {
        if (rVar.e() < 7) {
            if (!z9) {
                throw j0.a("too short header: " + rVar.e(), null);
            }
            return false;
        }
        if (rVar.x() != i9) {
            if (!z9) {
                throw j0.a("expected header type " + Integer.toHexString(i9), null);
            }
            return false;
        }
        if (rVar.x() == 118 && rVar.x() == 111 && rVar.x() == 114 && rVar.x() == 98 && rVar.x() == 105 && rVar.x() == 115) {
            return true;
        }
        if (z9) {
            return false;
        }
        throw j0.a("expected characters 'vorbis'", null);
    }

    public static int z(int i9) {
        int[] iArr = {1, 2, 3};
        for (int i10 = 0; i10 < 3; i10++) {
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
}
