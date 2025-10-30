package C3;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.M;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f1479a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1480b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1481c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f1482d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1483e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1484f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1485g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1486h;

    public p(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z9, boolean z10, boolean z11) {
        str.getClass();
        this.f1479a = str;
        this.f1480b = str2;
        this.f1481c = str3;
        this.f1482d = codecCapabilities;
        this.f1485g = z9;
        this.f1483e = z10;
        this.f1484f = z11;
        this.f1486h = l4.n.l(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i9, int i10, double d9) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(l4.y.f(i9, widthAlignment) * widthAlignment, l4.y.f(i10, heightAlignment) * heightAlignment);
        int i11 = point.x;
        int i12 = point.y;
        if (d9 != -1.0d && d9 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i11, i12, Math.floor(d9));
        }
        return videoCapabilities.isSizeSupported(i11, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if ("Nexus 10".equals(r3) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r8) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static C3.p g(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13) {
        /*
            C3.p r0 = new C3.p
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L3d
            int r3 = l4.y.f20553a
            r4 = 19
            if (r3 < r4) goto L3d
            java.lang.String r4 = "adaptive-playback"
            boolean r4 = r11.isFeatureSupported(r4)
            if (r4 == 0) goto L3d
            r4 = 22
            if (r3 > r4) goto L3b
            java.lang.String r3 = l4.y.f20556d
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L2a
            java.lang.String r4 = "Nexus 10"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L3b
        L2a:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L3d
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L3b
            goto L3d
        L3b:
            r6 = r2
            goto L3e
        L3d:
            r6 = r1
        L3e:
            r3 = 21
            if (r11 == 0) goto L4c
            int r4 = l4.y.f20553a
            if (r4 < r3) goto L4c
            java.lang.String r4 = "tunneled-playback"
            boolean r4 = r11.isFeatureSupported(r4)
        L4c:
            if (r13 != 0) goto L64
            if (r11 == 0) goto L5d
            int r13 = l4.y.f20553a
            if (r13 < r3) goto L5d
            java.lang.String r13 = "secure-playback"
            boolean r13 = r11.isFeatureSupported(r13)
            if (r13 == 0) goto L5d
            goto L64
        L5d:
            r7 = r1
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1 = r8
            goto L6a
        L64:
            r7 = r2
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r2 = r9
        L6a:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.p.g(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):C3.p");
    }

    public final m3.h b(M m9, M m10) {
        int i9;
        M m11;
        M m12;
        int i10;
        if (!l4.y.a(m9.f19435l, m10.f19435l)) {
            i9 = 8;
        } else {
            i9 = 0;
        }
        if (this.f1486h) {
            if (m9.f19443t != m10.f19443t) {
                i9 |= 1024;
            }
            if (!this.f1483e && (m9.f19440q != m10.f19440q || m9.f19441r != m10.f19441r)) {
                i9 |= 512;
            }
            if (!l4.y.a(m9.f19447x, m10.f19447x)) {
                i9 |= 2048;
            }
            if (l4.y.f20556d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f1479a) && !m9.b(m10)) {
                i9 |= 2;
            }
            if (i9 == 0) {
                if (m9.b(m10)) {
                    i10 = 3;
                } else {
                    i10 = 2;
                }
                return new m3.h(this.f1479a, m9, m10, i10, 0);
            }
            m11 = m9;
            m12 = m10;
        } else {
            m11 = m9;
            m12 = m10;
            if (m11.f19448y != m12.f19448y) {
                i9 |= 4096;
            }
            if (m11.f19449z != m12.f19449z) {
                i9 |= 8192;
            }
            if (m11.f19420A != m12.f19420A) {
                i9 |= 16384;
            }
            String str = this.f1480b;
            if (i9 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair d9 = B.d(m11);
                Pair d10 = B.d(m12);
                if (d9 != null && d10 != null) {
                    int intValue = ((Integer) d9.first).intValue();
                    int intValue2 = ((Integer) d10.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new m3.h(this.f1479a, m11, m12, 3, 0);
                    }
                }
            }
            if (!m11.b(m12)) {
                i9 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i9 |= 2;
            }
            if (i9 == 0) {
                return new m3.h(this.f1479a, m11, m12, 1, 0);
            }
        }
        return new m3.h(this.f1479a, m11, m12, 0, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(j3.M r18) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.p.c(j3.M):boolean");
    }

    public final boolean d(M m9) {
        if (this.f1486h) {
            return this.f1483e;
        }
        Pair d9 = B.d(m9);
        if (d9 != null && ((Integer) d9.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean e(int i9, int i10, double d9) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f1482d;
        if (codecCapabilities == null) {
            f("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            f("sizeAndRate.vCaps");
            return false;
        }
        if (l4.y.f20553a >= 29) {
            int a5 = o.a(videoCapabilities, i9, i10, d9);
            if (a5 == 2) {
                return true;
            }
            if (a5 == 1) {
                f("sizeAndRate.cover, " + i9 + "x" + i10 + "@" + d9);
                return false;
            }
        }
        if (!a(videoCapabilities, i9, i10, d9)) {
            if (i9 < i10) {
                String str = this.f1479a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(l4.y.f20554b)) && a(videoCapabilities, i10, i9, d9)) {
                    AbstractC1566a.s("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i9 + "x" + i10 + "@" + d9) + "] [" + str + ", " + this.f1480b + "] [" + l4.y.f20557e + "]");
                }
            }
            f("sizeAndRate.support, " + i9 + "x" + i10 + "@" + d9);
            return false;
        }
        return true;
    }

    public final void f(String str) {
        StringBuilder r5 = AbstractC0953k1.r("NoSupport [", str, "] [");
        r5.append(this.f1479a);
        r5.append(", ");
        r5.append(this.f1480b);
        r5.append("] [");
        r5.append(l4.y.f20557e);
        r5.append("]");
        AbstractC1566a.s("MediaCodecInfo", r5.toString());
    }

    public final String toString() {
        return this.f1479a;
    }
}
