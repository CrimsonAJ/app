package l4;

import P5.AbstractC0349q;
import P5.C;
import P5.D;
import P5.F;
import P5.S;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.InterfaceC1451e;
import j3.InterfaceC1453f;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1566a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f20473a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f20474b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f20475c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f20476d = {0, 0, 0, 1};

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f20477e = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: f, reason: collision with root package name */
    public static final Object f20478f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static int[] f20479g = new int[10];

    /* renamed from: h, reason: collision with root package name */
    public static final Object f20480h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final Object f20481i = new Object();
    public static boolean j;

    /* renamed from: k, reason: collision with root package name */
    public static long f20482k;

    public static void A(String str, String str2) {
        synchronized (f20475c) {
            Log.i(str, str2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a8, code lost:
    
        if (r0.equals("video/mp2t") == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int B(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.AbstractC1566a.B(java.lang.String):int");
    }

    public static int C(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                        if (lastPathSegment.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                    if (!lastPathSegment.endsWith(".avi")) {
                                                        return -1;
                                                    }
                                                    return 16;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }

    public static boolean D(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean E(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static void F(MediaFormat mediaFormat, String str, int i9) {
        if (i9 != -1) {
            mediaFormat.setInteger(str, i9);
        }
    }

    public static o G(byte[] bArr, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 2;
        Z3.f fVar = new Z3.f(bArr, i9 + 2, i10);
        int i19 = 4;
        fVar.r(4);
        int i20 = fVar.i(3);
        fVar.q();
        int i21 = fVar.i(2);
        boolean h7 = fVar.h();
        int i22 = fVar.i(5);
        int i23 = 0;
        for (int i24 = 0; i24 < 32; i24++) {
            if (fVar.h()) {
                i23 |= 1 << i24;
            }
        }
        int i25 = 6;
        int[] iArr = new int[6];
        for (int i26 = 0; i26 < 6; i26++) {
            iArr[i26] = fVar.i(8);
        }
        int i27 = i23;
        int i28 = fVar.i(8);
        int i29 = 0;
        for (int i30 = 0; i30 < i20; i30++) {
            if (fVar.h()) {
                i29 += 89;
            }
            if (fVar.h()) {
                i29 += 8;
            }
        }
        fVar.r(i29);
        if (i20 > 0) {
            fVar.r((8 - i20) * 2);
        }
        fVar.l();
        int l9 = fVar.l();
        if (l9 == 3) {
            fVar.q();
        }
        int l10 = fVar.l();
        int l11 = fVar.l();
        if (fVar.h()) {
            int l12 = fVar.l();
            int l13 = fVar.l();
            int l14 = fVar.l();
            int l15 = fVar.l();
            if (l9 != 1 && l9 != 2) {
                i16 = 1;
            } else {
                i16 = 2;
            }
            if (l9 == 1) {
                i17 = 2;
            } else {
                i17 = 1;
            }
            l10 -= (l12 + l13) * i16;
            l11 -= (l14 + l15) * i17;
        }
        fVar.l();
        fVar.l();
        int l16 = fVar.l();
        if (fVar.h()) {
            i11 = 0;
        } else {
            i11 = i20;
        }
        for (int i31 = i11; i31 <= i20; i31++) {
            fVar.l();
            fVar.l();
            fVar.l();
        }
        fVar.l();
        fVar.l();
        fVar.l();
        fVar.l();
        fVar.l();
        fVar.l();
        if (fVar.h() && fVar.h()) {
            int i32 = 0;
            while (i32 < i19) {
                int i33 = 0;
                while (i33 < i25) {
                    if (!fVar.h()) {
                        fVar.l();
                    } else {
                        int min = Math.min(64, 1 << ((i32 << 1) + 4));
                        if (i32 > 1) {
                            fVar.m();
                        }
                        for (int i34 = 0; i34 < min; i34++) {
                            fVar.m();
                        }
                    }
                    if (i32 == 3) {
                        i15 = 3;
                    } else {
                        i15 = 1;
                    }
                    i33 += i15;
                    i25 = 6;
                }
                i32++;
                i19 = 4;
                i25 = 6;
            }
        }
        fVar.r(2);
        if (fVar.h()) {
            fVar.r(8);
            fVar.l();
            fVar.l();
            fVar.q();
        }
        int l17 = fVar.l();
        int[] iArr2 = new int[0];
        int[] iArr3 = new int[0];
        int i35 = -1;
        int i36 = 0;
        int i37 = -1;
        while (i36 < l17) {
            if (i36 != 0 && fVar.h()) {
                i12 = i18;
                int i38 = i35 + i37;
                int l18 = (1 - ((fVar.h() ? 1 : 0) * 2)) * (fVar.l() + 1);
                i13 = l17;
                int i39 = i38 + 1;
                int[] iArr4 = iArr2;
                boolean[] zArr = new boolean[i39];
                for (int i40 = 0; i40 <= i38; i40++) {
                    if (!fVar.h()) {
                        zArr[i40] = fVar.h();
                    } else {
                        zArr[i40] = true;
                    }
                }
                int[] iArr5 = new int[i39];
                int[] iArr6 = new int[i39];
                int i41 = 0;
                for (int i42 = i37 - 1; i42 >= 0; i42--) {
                    int i43 = iArr3[i42] + l18;
                    if (i43 < 0 && zArr[i35 + i42]) {
                        iArr5[i41] = i43;
                        i41++;
                    }
                }
                if (l18 < 0 && zArr[i38]) {
                    iArr5[i41] = l18;
                    i41++;
                }
                int i44 = i41;
                i14 = l16;
                for (int i45 = 0; i45 < i35; i45++) {
                    int i46 = iArr4[i45] + l18;
                    if (i46 < 0 && zArr[i45]) {
                        iArr5[i44] = i46;
                        i44++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr5, i44);
                int i47 = 0;
                for (int i48 = i35 - 1; i48 >= 0; i48--) {
                    int i49 = iArr4[i48] + l18;
                    if (i49 > 0 && zArr[i48]) {
                        iArr6[i47] = i49;
                        i47++;
                    }
                }
                if (l18 > 0 && zArr[i38]) {
                    iArr6[i47] = l18;
                    i47++;
                }
                int i50 = i44;
                int i51 = i47;
                for (int i52 = 0; i52 < i37; i52++) {
                    int i53 = iArr3[i52] + l18;
                    if (i53 > 0 && zArr[i35 + i52]) {
                        iArr6[i51] = i53;
                        i51++;
                    }
                }
                iArr3 = Arrays.copyOf(iArr6, i51);
                i37 = i51;
                i35 = i50;
            } else {
                i12 = i18;
                i13 = l17;
                i14 = l16;
                int l19 = fVar.l();
                int l20 = fVar.l();
                int[] iArr7 = new int[l19];
                for (int i54 = 0; i54 < l19; i54++) {
                    iArr7[i54] = fVar.l() + 1;
                    fVar.q();
                }
                int[] iArr8 = new int[l20];
                for (int i55 = 0; i55 < l20; i55++) {
                    iArr8[i55] = fVar.l() + 1;
                    fVar.q();
                }
                i35 = l19;
                iArr3 = iArr8;
                iArr2 = iArr7;
                i37 = l20;
            }
            i36++;
            i18 = i12;
            l17 = i13;
            l16 = i14;
        }
        int i56 = i18;
        int i57 = l16;
        if (fVar.h()) {
            for (int i58 = 0; i58 < fVar.l(); i58++) {
                fVar.r(i57 + 5);
            }
        }
        fVar.r(i56);
        float f9 = 1.0f;
        if (fVar.h()) {
            if (fVar.h()) {
                int i59 = fVar.i(8);
                if (i59 == 255) {
                    int i60 = fVar.i(16);
                    int i61 = fVar.i(16);
                    if (i60 != 0 && i61 != 0) {
                        f9 = i60 / i61;
                    }
                } else if (i59 < 17) {
                    f9 = f20477e[i59];
                } else {
                    AbstractC0953k1.v("Unexpected aspect_ratio_idc value: ", i59, "NalUnitUtil");
                }
            }
            if (fVar.h()) {
                fVar.q();
            }
            if (fVar.h()) {
                fVar.r(4);
                if (fVar.h()) {
                    fVar.r(24);
                }
            }
            if (fVar.h()) {
                fVar.l();
                fVar.l();
            }
            fVar.q();
            if (fVar.h()) {
                l11 *= 2;
            }
        }
        return new o(i21, h7, i22, i27, iArr, i28, l10, l11, f9);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l4.q H(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.AbstractC1566a.H(byte[], int, int):l4.q");
    }

    public static long I(int i9, byte[] bArr) {
        int i10 = bArr[i9];
        int i11 = bArr[i9 + 1];
        int i12 = bArr[i9 + 2];
        int i13 = bArr[i9 + 3];
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
    }

    public static long J(int i9, byte[] bArr) {
        long I4 = I(i9, bArr);
        long I8 = I(i9 + 4, bArr);
        if (I4 == 0 && I8 == 0) {
            return 0L;
        }
        return ((I8 * 1000) / 4294967296L) + ((I4 - 2208988800L) * 1000);
    }

    public static String K(StringBuilder sb, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        if (i9 >= i10) {
            return sb.toString();
        }
        if (sb.charAt(i9) == '/') {
            i9++;
        }
        int i14 = i9;
        int i15 = i14;
        while (i14 <= i10) {
            if (i14 == i10) {
                i11 = i14;
            } else if (sb.charAt(i14) == '/') {
                i11 = i14 + 1;
            } else {
                i14++;
            }
            int i16 = i15 + 1;
            if (i14 == i16 && sb.charAt(i15) == '.') {
                sb.delete(i15, i11);
                i10 -= i11 - i15;
            } else {
                if (i14 == i15 + 2 && sb.charAt(i15) == '.' && sb.charAt(i16) == '.') {
                    i12 = sb.lastIndexOf("/", i15 - 2) + 1;
                    if (i12 > i9) {
                        i13 = i12;
                    } else {
                        i13 = i9;
                    }
                    sb.delete(i13, i11);
                    i10 -= i11 - i13;
                } else {
                    i12 = i14 + 1;
                }
                i15 = i12;
            }
            i14 = i15;
        }
        return sb.toString();
    }

    public static String L(String str, String str2) {
        int i9;
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] z9 = z(str2);
        if (z9[0] != -1) {
            sb.append(str2);
            K(sb, z9[1], z9[2]);
            return sb.toString();
        }
        int[] z10 = z(str);
        if (z9[3] == 0) {
            sb.append((CharSequence) str, 0, z10[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (z9[2] == 0) {
            sb.append((CharSequence) str, 0, z10[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i10 = z9[1];
        if (i10 != 0) {
            int i11 = z10[0] + 1;
            sb.append((CharSequence) str, 0, i11);
            sb.append(str2);
            return K(sb, z9[1] + i11, i11 + z9[2]);
        }
        if (str2.charAt(i10) == '/') {
            sb.append((CharSequence) str, 0, z10[1]);
            sb.append(str2);
            int i12 = z10[1];
            return K(sb, i12, z9[2] + i12);
        }
        int i13 = z10[0] + 2;
        int i14 = z10[1];
        if (i13 < i14 && i14 == z10[2]) {
            sb.append((CharSequence) str, 0, i14);
            sb.append('/');
            sb.append(str2);
            int i15 = z10[1];
            return K(sb, i15, z9[2] + i15 + 1);
        }
        int lastIndexOf = str.lastIndexOf(47, z10[2] - 1);
        if (lastIndexOf == -1) {
            i9 = z10[1];
        } else {
            i9 = lastIndexOf + 1;
        }
        sb.append((CharSequence) str, 0, i9);
        sb.append(str2);
        return K(sb, z10[1], i9 + z9[2]);
    }

    public static Uri M(String str, String str2) {
        return Uri.parse(L(str, str2));
    }

    public static void N(MediaFormat mediaFormat, List list) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            mediaFormat.setByteBuffer(AbstractC0953k1.j(i9, "csd-"), ByteBuffer.wrap((byte[]) list.get(i9)));
        }
    }

    public static int O(int i9, byte[] bArr) {
        int i10;
        synchronized (f20478f) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i9) {
                while (true) {
                    if (i11 < i9 - 2) {
                        try {
                            if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                                break;
                            }
                            i11++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        i11 = i9;
                        break;
                    }
                }
                if (i11 < i9) {
                    int[] iArr = f20479g;
                    if (iArr.length <= i12) {
                        f20479g = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f20479g[i12] = i11;
                    i11 += 3;
                    i12++;
                }
            }
            i10 = i9 - i12;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = f20479g[i15] - i14;
                System.arraycopy(bArr, i14, bArr, i13, i16);
                int i17 = i13 + i16;
                int i18 = i17 + 1;
                bArr[i17] = 0;
                i13 = i17 + 2;
                bArr[i18] = 0;
                i14 += i16 + 3;
            }
            System.arraycopy(bArr, i14, bArr, i13, i10 - i13);
        }
        return i10;
    }

    public static void P(String str, String str2) {
        synchronized (f20475c) {
            Log.w(str, str2);
        }
    }

    public static void Q(String str, String str2, Exception exc) {
        P(str, b(str2, exc));
    }

    public static long a() {
        char c3;
        long j4;
        synchronized (f20481i) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                c3 = 0;
                j4 = currentTimeMillis;
            } else {
                long j9 = currentTimeMillis / 1000;
                Long.signum(j9);
                long j10 = currentTimeMillis - (j9 * 1000);
                long j11 = j9 + 2208988800L;
                c3 = 0;
                j4 = currentTimeMillis;
                bArr[40] = (byte) (j11 >> 24);
                bArr[41] = (byte) (j11 >> 16);
                bArr[42] = (byte) (j11 >> 8);
                bArr[43] = (byte) j11;
                long j12 = (j10 * 4294967296L) / 1000;
                bArr[44] = (byte) (j12 >> 24);
                bArr[45] = (byte) (j12 >> 16);
                bArr[46] = (byte) (j12 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j13 = (elapsedRealtime2 - elapsedRealtime) + j4;
            byte b9 = bArr[c3];
            int i9 = bArr[1] & 255;
            long J8 = J(24, bArr);
            long J9 = J(32, bArr);
            long J10 = J(40, bArr);
            p((byte) ((b9 >> 6) & 3), (byte) (b9 & 7), i9, J10);
            long j14 = (j13 + (((J10 - j13) + (J9 - J8)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j14;
        } finally {
        }
    }

    public static String b(String str, Throwable th) {
        String replace;
        synchronized (f20475c) {
            try {
                if (th == null) {
                    replace = null;
                } else {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 != null) {
                            if (th2 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th2 = th2.getCause();
                            }
                        } else {
                            replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                    }
                }
            } finally {
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            return str + "\n  " + replace.replace("\n", "\n  ") + '\n';
        }
        return str;
    }

    public static void c(String str) {
        if (y.f20553a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void d(int i9, int i10) {
        GLES20.glBindTexture(i9, i10);
        i();
        GLES20.glTexParameteri(i9, 10240, 9729);
        i();
        GLES20.glTexParameteri(i9, 10241, 9729);
        i();
        GLES20.glTexParameteri(i9, 10242, 33071);
        i();
        GLES20.glTexParameteri(i9, 10243, 33071);
        i();
    }

    public static String e(int i9, int i10, int i11) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static String f(int i9, boolean z9, int i10, int i11, int[] iArr, int i12) {
        char c3;
        String str = f20474b[i9];
        Integer valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(i11);
        if (z9) {
            c3 = 'H';
        } else {
            c3 = 'L';
        }
        Object[] objArr = {str, valueOf, valueOf2, Character.valueOf(c3), Integer.valueOf(i12)};
        int i13 = y.f20553a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb.toString();
    }

    public static void g(String str, boolean z9) {
        if (z9) {
        } else {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void h(boolean z9) {
        if (z9) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void i() {
        StringBuilder sb = new StringBuilder();
        boolean z9 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z9) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(glGetError));
            z9 = true;
        }
        if (!z9) {
        } else {
            throw new Exception(sb.toString());
        }
    }

    public static void j(String str, boolean z9) {
        if (z9) {
        } else {
            throw new Exception(str);
        }
    }

    public static void k(int i9, int i10) {
        if (i9 >= 0 && i9 < i10) {
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void l(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void m(boolean z9) {
        if (z9) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void n(Object obj) {
        if (obj != null) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void o(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void p(byte b9, byte b10, int i9, long j4) {
        if (b9 != 3) {
            if (b10 != 4 && b10 != 5) {
                throw new IOException(AbstractC0953k1.j(b10, "SNTP: Untrusted mode: "));
            }
            if (i9 != 0 && i9 <= 15) {
                if (j4 != 0) {
                    return;
                } else {
                    throw new IOException("SNTP: Zero transmitTime");
                }
            }
            throw new IOException(AbstractC0953k1.j(i9, "SNTP: Untrusted stratum: "));
        }
        throw new IOException("SNTP: Unsynchronized server");
    }

    public static void q(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static FloatBuffer r(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void s(String str, String str2) {
        synchronized (f20475c) {
            Log.d(str, str2);
        }
    }

    public static void t(String str, String str2) {
        synchronized (f20475c) {
            Log.e(str, str2);
        }
    }

    public static void u(String str, String str2, Throwable th) {
        t(str, b(str2, th));
    }

    public static void v() {
        if (y.f20553a >= 18) {
            Trace.endSection();
        }
    }

    public static int w(byte[] bArr, int i9, int i10, boolean[] zArr) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i11 = i10 - i9;
        boolean z12 = false;
        if (i11 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        m(z9);
        if (i11 == 0) {
            return i10;
        }
        if (zArr[0]) {
            q(zArr);
            return i9 - 3;
        }
        if (i11 > 1 && zArr[1] && bArr[i9] == 1) {
            q(zArr);
            return i9 - 2;
        }
        if (i11 > 2 && zArr[2] && bArr[i9] == 0 && bArr[i9 + 1] == 1) {
            q(zArr);
            return i9 - 1;
        }
        int i12 = i10 - 1;
        int i13 = i9 + 2;
        while (i13 < i12) {
            byte b9 = bArr[i13];
            if ((b9 & 254) == 0) {
                int i14 = i13 - 2;
                if (bArr[i14] == 0 && bArr[i13 - 1] == 0 && b9 == 1) {
                    q(zArr);
                    return i14;
                }
                i13 -= 2;
            }
            i13 += 3;
        }
        if (i11 <= 2 ? !(i11 != 2 ? !zArr[1] || bArr[i12] != 1 : !zArr[2] || bArr[i10 - 2] != 0 || bArr[i12] != 1) : !(bArr[i10 - 3] != 0 || bArr[i10 - 2] != 0 || bArr[i12] != 1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        if (i11 <= 1 ? !(!zArr[2] || bArr[i12] != 0) : !(bArr[i10 - 2] != 0 || bArr[i12] != 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        zArr[1] = z11;
        if (bArr[i12] == 0) {
            z12 = true;
        }
        zArr[2] = z12;
        return i10;
    }

    public static S x(InterfaceC1451e interfaceC1451e, ArrayList arrayList) {
        D d9 = F.f5901b;
        AbstractC0349q.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i9 = 0;
        int i10 = 0;
        while (i9 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i9);
            bundle.getClass();
            InterfaceC1453f c3 = interfaceC1451e.c(bundle);
            c3.getClass();
            int i11 = i10 + 1;
            if (objArr.length < i11) {
                objArr = Arrays.copyOf(objArr, C.e(objArr.length, i11));
            }
            objArr[i10] = c3;
            i9++;
            i10 = i11;
        }
        return F.k(i10, objArr);
    }

    public static String y(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i9 = 0; i9 < attributeCount; i9++) {
            if (xmlPullParser.getAttributeName(i9).equals(str)) {
                return xmlPullParser.getAttributeValue(i9);
            }
        }
        return null;
    }

    public static int[] z(String str) {
        int i9;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i10 = indexOf4 + 2;
        if (i10 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i10) == '/') {
            i9 = str.indexOf(47, indexOf4 + 3);
            if (i9 == -1 || i9 > indexOf2) {
                i9 = indexOf2;
            }
        } else {
            i9 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i9;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }
}
