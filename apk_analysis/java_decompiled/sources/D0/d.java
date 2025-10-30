package D0;

import android.content.pm.PackageInfo;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Q6.f f1745a = new Q6.f(3);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1746b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f1747c = {112, 114, 109, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f1748d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1749e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f1750f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f1751g = {48, 48, 53, 0};

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f1752h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f1753i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(V3.e[] eVarArr, byte[] bArr) {
        int i9 = 0;
        for (V3.e eVar : eVarArr) {
            i9 += ((((eVar.f7709i * 2) + 7) & (-8)) / 8) + (eVar.f7706f * 2) + d((String) eVar.f7702b, (String) eVar.f7703c, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + eVar.f7708h;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i9);
        if (Arrays.equals(bArr, f1750f)) {
            for (V3.e eVar2 : eVarArr) {
                p(byteArrayOutputStream, eVar2, d((String) eVar2.f7702b, (String) eVar2.f7703c, bArr));
                r(byteArrayOutputStream, eVar2);
                int[] iArr = (int[]) eVar2.f7704d;
                int length = iArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = iArr[i10];
                    u(byteArrayOutputStream, i12 - i11);
                    i10++;
                    i11 = i12;
                }
                q(byteArrayOutputStream, eVar2);
            }
        } else {
            for (V3.e eVar3 : eVarArr) {
                p(byteArrayOutputStream, eVar3, d((String) eVar3.f7702b, (String) eVar3.f7703c, bArr));
            }
            for (V3.e eVar4 : eVarArr) {
                r(byteArrayOutputStream, eVar4);
                int[] iArr2 = (int[]) eVar4.f7704d;
                int length2 = iArr2.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length2) {
                    int i15 = iArr2[i13];
                    u(byteArrayOutputStream, i15 - i14);
                    i13++;
                    i14 = i15;
                }
                q(byteArrayOutputStream, eVar4);
            }
        }
        if (byteArrayOutputStream.size() == i9) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i9);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z9 = true;
            for (File file2 : listFiles) {
                if (c(file2) && z9) {
                    z9 = true;
                } else {
                    z9 = false;
                }
            }
            return z9;
        }
        file.delete();
        return true;
    }

    public static String d(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = f1752h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f1751g;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (!str2.contains("!") && !str2.contains(":")) {
                if (!str2.endsWith(".apk")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                        str3 = ":";
                    }
                    return AbstractC0953k1.q(sb, str3, str2);
                }
            } else {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i9) {
        byte[] bArr = new byte[i9];
        int i10 = 0;
        while (i10 < i9) {
            int read = inputStream.read(bArr, i10, i9 - i10);
            if (read >= 0) {
                i10 += read;
            } else {
                throw new IllegalStateException(AbstractC0953k1.j(i9, "Not enough bytes to read: "));
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i9) {
        int[] iArr = new int[i9];
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            i10 += (int) m(byteArrayInputStream, 2);
            iArr[i11] = i10;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.d.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static V3.e[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, V3.e[] eVarArr) {
        byte[] bArr3 = f1753i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(f1748d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m9 = (int) m(fileInputStream, 1);
                    byte[] h7 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h7);
                        try {
                            V3.e[] j4 = j(byteArrayInputStream, m9, eVarArr);
                            byteArrayInputStream.close();
                            return j4;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (Arrays.equals(bArr, j)) {
            int m10 = (int) m(fileInputStream, 2);
            byte[] h9 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h9);
                try {
                    V3.e[] k5 = k(byteArrayInputStream2, bArr2, m10, eVarArr);
                    byteArrayInputStream2.close();
                    return k5;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported meta version");
    }

    public static V3.e[] j(ByteArrayInputStream byteArrayInputStream, int i9, V3.e[] eVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new V3.e[0];
        }
        if (i9 == eVarArr.length) {
            String[] strArr = new String[i9];
            int[] iArr = new int[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                int m9 = (int) m(byteArrayInputStream, 2);
                iArr[i10] = (int) m(byteArrayInputStream, 2);
                strArr[i10] = new String(f(byteArrayInputStream, m9), StandardCharsets.UTF_8);
            }
            for (int i11 = 0; i11 < i9; i11++) {
                V3.e eVar = eVarArr[i11];
                if (((String) eVar.f7703c).equals(strArr[i11])) {
                    int i12 = iArr[i11];
                    eVar.f7706f = i12;
                    eVar.f7704d = g(byteArrayInputStream, i12);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return eVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static V3.e[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i9, V3.e[] eVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new V3.e[0];
        }
        if (i9 == eVarArr.length) {
            for (int i10 = 0; i10 < i9; i10++) {
                m(byteArrayInputStream, 2);
                String str2 = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m9 = m(byteArrayInputStream, 4);
                int m10 = (int) m(byteArrayInputStream, 2);
                V3.e eVar = null;
                if (eVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 >= eVarArr.length) {
                            break;
                        }
                        if (((String) eVarArr[i11].f7703c).equals(str)) {
                            eVar = eVarArr[i11];
                            break;
                        }
                        i11++;
                    }
                }
                if (eVar != null) {
                    eVar.j = m9;
                    int[] g9 = g(byteArrayInputStream, m10);
                    if (Arrays.equals(bArr, f1752h)) {
                        eVar.f7706f = m10;
                        eVar.f7704d = g9;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return eVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static V3.e[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f1749e)) {
            int m9 = (int) m(fileInputStream, 1);
            byte[] h7 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h7);
                try {
                    V3.e[] n7 = n(byteArrayInputStream, str, m9);
                    byteArrayInputStream.close();
                    return n7;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static long m(InputStream inputStream, int i9) {
        byte[] f9 = f(inputStream, i9);
        long j4 = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            j4 += (f9[i10] & 255) << (i10 * 8);
        }
        return j4;
    }

    public static V3.e[] n(ByteArrayInputStream byteArrayInputStream, String str, int i9) {
        TreeMap treeMap;
        int i10;
        if (byteArrayInputStream.available() == 0) {
            return new V3.e[0];
        }
        V3.e[] eVarArr = new V3.e[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            int m9 = (int) m(byteArrayInputStream, 2);
            int m10 = (int) m(byteArrayInputStream, 2);
            eVarArr[i11] = new V3.e(str, new String(f(byteArrayInputStream, m9), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m10, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m10], new TreeMap());
        }
        for (int i12 = 0; i12 < i9; i12++) {
            V3.e eVar = eVarArr[i12];
            int available = byteArrayInputStream.available() - eVar.f7708h;
            int i13 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = (TreeMap) eVar.f7705e;
                if (available2 <= available) {
                    break;
                }
                i13 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i13), 1);
                for (int m11 = (int) m(byteArrayInputStream, 2); m11 > 0; m11--) {
                    m(byteArrayInputStream, 2);
                    int m12 = (int) m(byteArrayInputStream, 1);
                    if (m12 != 6 && m12 != 7) {
                        while (m12 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m13 = (int) m(byteArrayInputStream, 1); m13 > 0; m13--) {
                                m(byteArrayInputStream, 2);
                            }
                            m12--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                eVar.f7704d = g(byteArrayInputStream, eVar.f7706f);
                int i14 = eVar.f7709i;
                BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i14 * 2) + 7) & (-8)) / 8));
                for (int i15 = 0; i15 < i14; i15++) {
                    if (valueOf.get(i15)) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    if (valueOf.get(i15 + i14)) {
                        i10 |= 4;
                    }
                    if (i10 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i15));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i15), Integer.valueOf(i10 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return eVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, V3.e[] eVarArr) {
        long j4;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f1748d;
        int i9 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                u(byteArrayOutputStream2, eVarArr.length);
                int i10 = 2;
                int i11 = 2;
                for (V3.e eVar : eVarArr) {
                    t(byteArrayOutputStream2, eVar.f7707g, 4);
                    t(byteArrayOutputStream2, eVar.j, 4);
                    t(byteArrayOutputStream2, eVar.f7709i, 4);
                    String d9 = d((String) eVar.f7702b, (String) eVar.f7703c, bArr2);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d9.getBytes(charset).length;
                    u(byteArrayOutputStream2, length2);
                    i11 = i11 + 14 + length2;
                    byteArrayOutputStream2.write(d9.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i11 == byteArray.length) {
                    l lVar = new l(1, false, byteArray);
                    byteArrayOutputStream2.close();
                    arrayList2.add(lVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < eVarArr.length) {
                        try {
                            V3.e eVar2 = eVarArr[i12];
                            u(byteArrayOutputStream3, i12);
                            u(byteArrayOutputStream3, eVar2.f7706f);
                            i13 = i13 + 4 + (eVar2.f7706f * i10);
                            int[] iArr = (int[]) eVar2.f7704d;
                            int length3 = iArr.length;
                            int i14 = i9;
                            int i15 = i10;
                            int i16 = i14;
                            while (i16 < length3) {
                                int i17 = iArr[i16];
                                u(byteArrayOutputStream3, i17 - i14);
                                i16++;
                                i14 = i17;
                            }
                            i12++;
                            i10 = i15;
                            i9 = 0;
                        } catch (Throwable th) {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i13 == byteArray2.length) {
                        l lVar2 = new l(3, true, byteArray2);
                        byteArrayOutputStream3.close();
                        arrayList2.add(lVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < eVarArr.length) {
                            try {
                                V3.e eVar3 = eVarArr[i18];
                                Iterator it = ((TreeMap) eVar3.f7705e).entrySet().iterator();
                                int i20 = 0;
                                while (it.hasNext()) {
                                    i20 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    q(byteArrayOutputStream4, eVar3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        r(byteArrayOutputStream4, eVar3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        u(byteArrayOutputStream3, i18);
                                        int length4 = byteArray3.length + 2 + byteArray4.length;
                                        int i21 = i19 + 6;
                                        ArrayList arrayList4 = arrayList3;
                                        t(byteArrayOutputStream3, length4, 4);
                                        u(byteArrayOutputStream3, i20);
                                        byteArrayOutputStream3.write(byteArray3);
                                        byteArrayOutputStream3.write(byteArray4);
                                        i19 = i21 + length4;
                                        i18++;
                                        arrayList3 = arrayList4;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i19 == byteArray5.length) {
                            l lVar3 = new l(4, true, byteArray5);
                            byteArrayOutputStream3.close();
                            arrayList2.add(lVar3);
                            long j9 = 4;
                            long size = j9 + j9 + 4 + (arrayList2.size() * 16);
                            t(byteArrayOutputStream, arrayList2.size(), 4);
                            int i22 = 0;
                            while (i22 < arrayList2.size()) {
                                l lVar4 = (l) arrayList2.get(i22);
                                int i23 = lVar4.f1764a;
                                if (i23 != 1) {
                                    if (i23 != 2) {
                                        if (i23 != 3) {
                                            if (i23 != 4) {
                                                if (i23 == 5) {
                                                    j4 = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                j4 = 3;
                                            }
                                        } else {
                                            j4 = 2;
                                        }
                                    } else {
                                        j4 = 1;
                                    }
                                } else {
                                    j4 = 0;
                                }
                                t(byteArrayOutputStream, j4, 4);
                                t(byteArrayOutputStream, size, 4);
                                byte[] bArr3 = lVar4.f1765b;
                                if (lVar4.f1766c) {
                                    long length5 = bArr3.length;
                                    byte[] a5 = a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a5);
                                    t(byteArrayOutputStream, a5.length, 4);
                                    t(byteArrayOutputStream, length5, 4);
                                    length = a5.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    t(byteArrayOutputStream, bArr3.length, 4);
                                    t(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i22++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i24 = 0; i24 < arrayList6.size(); i24++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i24));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i19 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        byte[] bArr4 = f1749e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] b9 = b(eVarArr, bArr4);
            t(byteArrayOutputStream, eVarArr.length, 1);
            t(byteArrayOutputStream, b9.length, 4);
            byte[] a9 = a(b9);
            t(byteArrayOutputStream, a9.length, 4);
            byteArrayOutputStream.write(a9);
            return true;
        }
        byte[] bArr5 = f1751g;
        if (Arrays.equals(bArr, bArr5)) {
            t(byteArrayOutputStream, eVarArr.length, 1);
            for (V3.e eVar4 : eVarArr) {
                int size2 = ((TreeMap) eVar4.f7705e).size() * 4;
                String d10 = d((String) eVar4.f7702b, (String) eVar4.f7703c, bArr5);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d10.getBytes(charset2).length);
                u(byteArrayOutputStream, ((int[]) eVar4.f7704d).length);
                t(byteArrayOutputStream, size2, 4);
                t(byteArrayOutputStream, eVar4.f7707g, 4);
                byteArrayOutputStream.write(d10.getBytes(charset2));
                Iterator it2 = ((TreeMap) eVar4.f7705e).keySet().iterator();
                while (it2.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    u(byteArrayOutputStream, 0);
                }
                for (int i25 : (int[]) eVar4.f7704d) {
                    u(byteArrayOutputStream, i25);
                }
            }
            return true;
        }
        byte[] bArr6 = f1750f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] b10 = b(eVarArr, bArr6);
            t(byteArrayOutputStream, eVarArr.length, 1);
            t(byteArrayOutputStream, b10.length, 4);
            byte[] a10 = a(b10);
            t(byteArrayOutputStream, a10.length, 4);
            byteArrayOutputStream.write(a10);
            return true;
        }
        byte[] bArr7 = f1752h;
        if (Arrays.equals(bArr, bArr7)) {
            u(byteArrayOutputStream, eVarArr.length);
            for (V3.e eVar5 : eVarArr) {
                String d11 = d((String) eVar5.f7702b, (String) eVar5.f7703c, bArr7);
                Charset charset3 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d11.getBytes(charset3).length);
                TreeMap treeMap = (TreeMap) eVar5.f7705e;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, ((int[]) eVar5.f7704d).length);
                t(byteArrayOutputStream, eVar5.f7707g, 4);
                byteArrayOutputStream.write(d11.getBytes(charset3));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    u(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i26 : (int[]) eVar5.f7704d) {
                    u(byteArrayOutputStream, i26);
                }
            }
            return true;
        }
        return false;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, V3.e eVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, eVar.f7706f);
        t(byteArrayOutputStream, eVar.f7708h, 4);
        t(byteArrayOutputStream, eVar.f7707g, 4);
        t(byteArrayOutputStream, eVar.f7709i, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, V3.e eVar) {
        byte[] bArr = new byte[(((eVar.f7709i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) eVar.f7705e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i9 = intValue / 8;
                bArr[i9] = (byte) (bArr[i9] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i10 = intValue + eVar.f7709i;
                int i11 = i10 / 8;
                bArr[i11] = (byte) ((1 << (i10 % 8)) | bArr[i11]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, V3.e eVar) {
        int i9 = 0;
        for (Map.Entry entry : ((TreeMap) eVar.f7705e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i9);
                u(byteArrayOutputStream, 0);
                i9 = intValue;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:53|54|55)|57|(3:203|204|(4:206|207|208|209)(2:213|214))|59|(4:(1:68)|69|70|(3:77|78|(4:80|81|82|(1:76))(2:83|84))(3:(1:73)|74|(0)))|101|(2:105|(5:109|110|111|112|(2:114|115)(3:116|117|118))(2:107|108))|133|(1:135)(3:139|140|(9:144|145|146|147|148|149|150|151|(2:152|(1:154)(7:155|156|157|158|159|160|161)))(2:142|143))|(1:137)|138|(1:45)(1:42)|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0131, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0132, code lost:
    
        r20.h(7, r0);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:68:0x0161. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v60, types: [V3.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(android.content.Context r18, java.util.concurrent.Executor r19, D0.c r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.d.s(android.content.Context, java.util.concurrent.Executor, D0.c, boolean):void");
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j4, int i9) {
        byte[] bArr = new byte[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            bArr[i10] = (byte) ((j4 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i9) {
        t(byteArrayOutputStream, i9, 2);
    }
}
