package C3;

import B6.u0;
import P5.F;
import android.media.MediaCodecInfo;
import android.util.Pair;
import j3.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f1428a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f1429b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f1430c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (l4.y.f20553a < 26 && l4.y.f20554b.equals("R9") && arrayList.size() == 1 && ((p) arrayList.get(0)).f1479a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(p.g("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new w(new u(1)));
        }
        int i9 = l4.y.f20553a;
        if (i9 < 21 && arrayList.size() > 1) {
            String str2 = ((p) arrayList.get(0)).f1479a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new w(new u(2)));
            }
        }
        if (i9 < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((p) arrayList.get(0)).f1479a)) {
            arrayList.add((p) arrayList.remove(0));
        }
    }

    public static String b(M m9) {
        Pair d9;
        if ("audio/eac3-joc".equals(m9.f19435l)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(m9.f19435l) && (d9 = d(m9)) != null) {
            int intValue = ((Integer) d9.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                return null;
            }
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0149, code lost:
    
        if (r0.equals("12") == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(j3.M r32) {
        /*
            Method dump skipped, instructions count: 2342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.B.d(j3.M):android.util.Pair");
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [A1.i, java.lang.Object] */
    public static synchronized List e(String str, boolean z9, boolean z10) {
        Q6.f fVar;
        int i9;
        synchronized (B.class) {
            try {
                x xVar = new x(str, z9, z10);
                HashMap hashMap = f1429b;
                List list = (List) hashMap.get(xVar);
                if (list != null) {
                    return list;
                }
                int i10 = l4.y.f20553a;
                if (i10 >= 21) {
                    ?? obj = new Object();
                    if (!z9 && !z10) {
                        i9 = 0;
                        obj.f24a = i9;
                        fVar = obj;
                    }
                    i9 = 1;
                    obj.f24a = i9;
                    fVar = obj;
                } else {
                    fVar = new Q6.f(2);
                }
                ArrayList f9 = f(xVar, fVar);
                if (z9 && f9.isEmpty() && 21 <= i10 && i10 <= 23) {
                    f9 = f(xVar, new Q6.f(2));
                    if (!f9.isEmpty()) {
                        AbstractC1566a.P("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((p) f9.get(0)).f1479a);
                    }
                }
                a(str, f9);
                F o9 = F.o(f9);
                hashMap.put(xVar, o9);
                return o9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ArrayList f(x xVar, z zVar) {
        String c3;
        String str;
        String str2;
        boolean z9;
        boolean isAlias;
        z zVar2 = zVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = xVar.f1564a;
            int i9 = zVar2.i();
            boolean p9 = zVar2.p();
            int i10 = 0;
            while (i10 < i9) {
                MediaCodecInfo c9 = zVar2.c(i10);
                int i11 = l4.y.f20553a;
                if (i11 >= 29) {
                    isAlias = c9.isAlias();
                    if (isAlias) {
                        i10++;
                        zVar2 = zVar;
                    }
                }
                String name = c9.getName();
                if (g(c9, name, p9, str3) && (c3 = c(c9, name, str3)) != null) {
                    try {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = c9.getCapabilitiesForType(c3);
                        boolean n7 = zVar2.n("tunneled-playback", c3, capabilitiesForType);
                        boolean f9 = zVar2.f("tunneled-playback", capabilitiesForType);
                        boolean z10 = xVar.f1566c;
                        if ((z10 || !f9) && (!z10 || n7)) {
                            boolean n9 = zVar2.n("secure-playback", c3, capabilitiesForType);
                            boolean f10 = zVar2.f("secure-playback", capabilitiesForType);
                            boolean z11 = xVar.f1565b;
                            if ((z11 || !f10) && (!z11 || n9)) {
                                if (i11 >= 29) {
                                    z9 = c9.isHardwareAccelerated();
                                } else {
                                    z9 = !h(c9, str3);
                                }
                                h(c9, str3);
                                if (i11 >= 29) {
                                    c9.isVendor();
                                } else {
                                    String L8 = u0.L(c9.getName());
                                    if (!L8.startsWith("omx.google.") && !L8.startsWith("c2.android.")) {
                                        L8.startsWith("c2.google.");
                                    }
                                }
                                if ((p9 && z11 == n9) || (!p9 && !z11)) {
                                    str = c3;
                                    try {
                                        str2 = name;
                                    } catch (Exception e8) {
                                        e = e8;
                                        str2 = name;
                                    }
                                    try {
                                        arrayList.add(p.g(name, str3, str, capabilitiesForType, z9, false));
                                    } catch (Exception e9) {
                                        e = e9;
                                        str = str;
                                        if (l4.y.f20553a > 23) {
                                        }
                                        AbstractC1566a.t("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                        throw e;
                                    }
                                } else {
                                    str2 = name;
                                    boolean z12 = z9;
                                    if (!p9 && n9) {
                                        str = c3;
                                        try {
                                            arrayList.add(p.g(str2 + ".secure", str3, str, capabilitiesForType, z12, true));
                                            break;
                                        } catch (Exception e10) {
                                            e = e10;
                                            if (l4.y.f20553a > 23 && !arrayList.isEmpty()) {
                                                AbstractC1566a.t("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                i10++;
                                                zVar2 = zVar;
                                            } else {
                                                AbstractC1566a.t("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        str = c3;
                        str2 = name;
                    }
                }
                i10++;
                zVar2 = zVar;
            }
            return arrayList;
        } catch (Exception e12) {
            throw new Exception("Failed to query underlying media codecs", e12);
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z9, String str2) {
        if (!mediaCodecInfo.isEncoder()) {
            if (z9 || !str.endsWith(".secure")) {
                int i9 = l4.y.f20553a;
                if (i9 >= 21 || (!"CIPAACDecoder".equals(str) && !"CIPMP3Decoder".equals(str) && !"CIPVorbisDecoder".equals(str) && !"CIPAMRNBDecoder".equals(str) && !"AACDecoder".equals(str) && !"MP3Decoder".equals(str))) {
                    if (i9 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
                        String str3 = l4.y.f20554b;
                        if (!"a70".equals(str3)) {
                            if ("Xiaomi".equals(l4.y.f20555c) && str3.startsWith("HM")) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                    if (i9 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
                        String str4 = l4.y.f20554b;
                        if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                            return false;
                        }
                    }
                    if (i9 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
                        String str5 = l4.y.f20554b;
                        if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                            return false;
                        }
                    }
                    if (i9 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(l4.y.f20555c))) {
                        String str6 = l4.y.f20554b;
                        if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                            return false;
                        }
                    }
                    if (i9 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(l4.y.f20555c)) {
                        String str7 = l4.y.f20554b;
                        if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                            return false;
                        }
                    }
                    if (i9 > 19 || !l4.y.f20554b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str)) {
                        if (i9 > 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (l4.y.f20553a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (!l4.n.j(str)) {
            String L8 = u0.L(mediaCodecInfo.getName());
            if (!L8.startsWith("arc.")) {
                if (!L8.startsWith("omx.google.") && !L8.startsWith("omx.ffmpeg.")) {
                    if ((!L8.startsWith("omx.sec.") || !L8.contains(".sw.")) && !L8.equals("omx.qcom.video.decoder.hevcswvdec") && !L8.startsWith("c2.android.") && !L8.startsWith("c2.google.")) {
                        if (L8.startsWith("omx.") || L8.startsWith("c2.")) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static int i() {
        p pVar;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i9;
        int i10;
        if (f1430c == -1) {
            int i11 = 0;
            List e8 = e("video/avc", false, false);
            if (e8.isEmpty()) {
                pVar = null;
            } else {
                pVar = (p) e8.get(0);
            }
            if (pVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = pVar.f1482d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = codecProfileLevelArr[i11].level;
                    if (i13 != 1 && i13 != 2) {
                        switch (i13) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    i12 = Math.max(i10, i12);
                    i11++;
                }
                if (l4.y.f20553a >= 21) {
                    i9 = 345600;
                } else {
                    i9 = 172800;
                }
                i11 = Math.max(i12, i9);
            }
            f1430c = i11;
        }
        return f1430c;
    }
}
