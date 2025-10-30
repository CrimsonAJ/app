package l4;

import B6.u0;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import co.notix.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import j3.D0;
import j3.E0;
import j3.j0;
import j3.n0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final int f20553a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f20554b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f20555c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f20556d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f20557e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f20558f;

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f20559g;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f20560h;

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f20561i;
    public static HashMap j;

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f20562k;

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f20563l;

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f20564m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f20565n;

    static {
        int i9 = Build.VERSION.SDK_INT;
        f20553a = i9;
        String str = Build.DEVICE;
        f20554b = str;
        String str2 = Build.MANUFACTURER;
        f20555c = str2;
        String str3 = Build.MODEL;
        f20556d = str3;
        f20557e = str + ", " + str3 + ", " + str2 + ", " + i9;
        f20558f = new byte[0];
        f20559g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f20560h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f20561i = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f20562k = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f20563l = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f20564m = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f20565n = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, ModuleDescriptor.MODULE_VERSION, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static String A(StringBuilder sb, Formatter formatter, long j4) {
        long j9;
        String str;
        if (j4 == -9223372036854775807L) {
            j9 = 0;
        } else {
            j9 = j4;
        }
        if (j9 < 0) {
            str = "-";
        } else {
            str = "";
        }
        long abs = (Math.abs(j9) + 500) / 1000;
        long j10 = abs % 60;
        long j11 = (abs / 60) % 60;
        long j12 = abs / 3600;
        sb.setLength(0);
        if (j12 > 0) {
            return formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11), Long.valueOf(j10)).toString();
        }
        return formatter.format("%s%02d:%02d", str, Long.valueOf(j11), Long.valueOf(j10)).toString();
    }

    public static String B(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e8) {
            AbstractC1566a.u("Util", "Failed to read system property ".concat(str), e8);
            return null;
        }
    }

    public static String C(int i9) {
        switch (i9) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i9 >= 10000) {
                    return A0.a.m("custom (", i9, ")");
                }
                return "?";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r4.equals("m3u8") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int D(android.net.Uri r8) {
        /*
            r0 = 1
            r1 = 2
            r2 = 0
            r3 = 3
            java.lang.String r4 = r8.getScheme()
            if (r4 == 0) goto L13
            java.lang.String r5 = "rtsp"
            boolean r4 = B6.u0.w(r5, r4)
            if (r4 == 0) goto L13
            return r3
        L13:
            java.lang.String r4 = r8.getLastPathSegment()
            r5 = 4
            if (r4 != 0) goto L1c
            goto L9c
        L1c:
            r6 = 46
            int r6 = r4.lastIndexOf(r6)
            if (r6 < 0) goto L70
            int r6 = r6 + r0
            java.lang.String r4 = r4.substring(r6)
            java.lang.String r4 = B6.u0.L(r4)
            r4.getClass()
            r6 = -1
            int r7 = r4.hashCode()
            switch(r7) {
                case 104579: goto L59;
                case 108321: goto L4e;
                case 3242057: goto L43;
                case 3299913: goto L3a;
                default: goto L38;
            }
        L38:
            r3 = r6
            goto L63
        L3a:
            java.lang.String r7 = "m3u8"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L63
            goto L38
        L43:
            java.lang.String r3 = "isml"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L4c
            goto L38
        L4c:
            r3 = r1
            goto L63
        L4e:
            java.lang.String r3 = "mpd"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L57
            goto L38
        L57:
            r3 = r0
            goto L63
        L59:
            java.lang.String r3 = "ism"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L62
            goto L38
        L62:
            r3 = r2
        L63:
            switch(r3) {
                case 0: goto L6c;
                case 1: goto L6a;
                case 2: goto L6c;
                case 3: goto L68;
                default: goto L66;
            }
        L66:
            r3 = r5
            goto L6d
        L68:
            r3 = r1
            goto L6d
        L6a:
            r3 = r2
            goto L6d
        L6c:
            r3 = r0
        L6d:
            if (r3 == r5) goto L70
            return r3
        L70:
            java.lang.String r8 = r8.getPath()
            r8.getClass()
            java.util.regex.Pattern r3 = l4.y.f20561i
            java.util.regex.Matcher r8 = r3.matcher(r8)
            boolean r3 = r8.matches()
            if (r3 == 0) goto L9c
            java.lang.String r8 = r8.group(r1)
            if (r8 == 0) goto L9b
            java.lang.String r3 = "format=mpd-time-csf"
            boolean r3 = r8.contains(r3)
            if (r3 == 0) goto L92
            return r2
        L92:
            java.lang.String r2 = "format=m3u8-aapl"
            boolean r8 = r8.contains(r2)
            if (r8 == 0) goto L9b
            return r1
        L9b:
            return r0
        L9c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.y.D(android.net.Uri):int");
    }

    public static boolean E(A4.r rVar, A4.r rVar2, Inflater inflater) {
        if (rVar.e() <= 0) {
            return false;
        }
        if (((byte[]) rVar2.f384c).length < rVar.e()) {
            rVar2.f(rVar.e() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput((byte[]) rVar.f384c, rVar.f382a, rVar.e());
        int i9 = 0;
        while (true) {
            try {
                byte[] bArr = (byte[]) rVar2.f384c;
                i9 += inflater.inflate(bArr, i9, bArr.length - i9);
                if (inflater.finished()) {
                    rVar2.G(i9);
                    inflater.reset();
                    return true;
                }
                if (inflater.needsDictionary() || inflater.needsInput()) {
                    break;
                }
                byte[] bArr2 = (byte[]) rVar2.f384c;
                if (i9 == bArr2.length) {
                    rVar2.f(bArr2.length * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static boolean F(int i9) {
        if (i9 != 3 && i9 != 2 && i9 != 268435456 && i9 != 536870912 && i9 != 805306368 && i9 != 4) {
            return false;
        }
        return true;
    }

    public static boolean G(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static long H(long j4) {
        if (j4 != -9223372036854775807L && j4 != Long.MIN_VALUE) {
            return j4 * 1000;
        }
        return j4;
    }

    public static String I(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String L8 = u0.L(str);
        int i9 = 0;
        String str2 = L8.split("-", 2)[0];
        if (j == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f20562k;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                hashMap.put(strArr[i10], strArr[i10 + 1]);
            }
            j = hashMap;
        }
        String str4 = (String) j.get(str2);
        if (str4 != null) {
            L8 = str4 + L8.substring(str2.length());
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return L8;
        }
        while (true) {
            String[] strArr2 = f20563l;
            if (i9 < strArr2.length) {
                if (L8.startsWith(strArr2[i9])) {
                    return strArr2[i9 + 1] + L8.substring(strArr2[i9].length());
                }
                i9 += 2;
            } else {
                return L8;
            }
        }
    }

    public static Object[] J(int i9, Object[] objArr) {
        boolean z9;
        if (i9 <= objArr.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        return Arrays.copyOf(objArr, i9);
    }

    public static long K(String str) {
        Matcher matcher = f20559g.matcher(str);
        if (matcher.matches()) {
            int i9 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i9 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                if ("-".equals(matcher.group(11))) {
                    i9 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i9 != 0) {
                return timeInMillis - (i9 * 60000);
            }
            return timeInMillis;
        }
        throw j0.a("Invalid date/time format: " + str, null);
    }

    public static void L(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static Intent M(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Intent registerReceiver;
        if (f20553a >= 33) {
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, 4);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public static void N(ArrayList arrayList, int i9, int i10) {
        if (i9 >= 0 && i10 <= arrayList.size() && i9 <= i10) {
            if (i9 != i10) {
                arrayList.subList(i9, i10).clear();
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static long O(long j4, long j9, long j10) {
        if (j10 >= j9 && j10 % j9 == 0) {
            return j4 / (j10 / j9);
        }
        if (j10 < j9 && j9 % j10 == 0) {
            return (j9 / j10) * j4;
        }
        return (long) (j4 * (j9 / j10));
    }

    public static void P(long[] jArr, long j4) {
        int i9 = 0;
        if (j4 >= 1000000 && j4 % 1000000 == 0) {
            long j9 = j4 / 1000000;
            while (i9 < jArr.length) {
                jArr[i9] = jArr[i9] / j9;
                i9++;
            }
            return;
        }
        if (j4 < 1000000 && 1000000 % j4 == 0) {
            long j10 = 1000000 / j4;
            while (i9 < jArr.length) {
                jArr[i9] = jArr[i9] * j10;
                i9++;
            }
            return;
        }
        double d9 = 1000000 / j4;
        while (i9 < jArr.length) {
            jArr[i9] = (long) (jArr[i9] * d9);
            i9++;
        }
    }

    public static String[] Q(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.trim().split("(\\s*,\\s*)", -1);
    }

    public static byte[] R(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static String S(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i9 = 0; i9 < bArr.length; i9++) {
            sb.append(Character.forDigit((bArr[i9] >> 4) & 15, 16));
            sb.append(Character.forDigit(bArr[i9] & 15, 16));
        }
        return sb.toString();
    }

    public static long T(long j4) {
        if (j4 != -9223372036854775807L && j4 != Long.MIN_VALUE) {
            return j4 / 1000;
        }
        return j4;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static int b(long[] jArr, long j4, boolean z9) {
        int i9;
        int binarySearch = Arrays.binarySearch(jArr, j4);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i9 = binarySearch + 1;
            if (i9 >= jArr.length || jArr[i9] != j4) {
                break;
            }
            binarySearch = i9;
        }
        if (z9) {
            return binarySearch;
        }
        return i9;
    }

    public static int c(List list, Long l9, boolean z9) {
        int i9;
        int binarySearch = Collections.binarySearch(list, l9);
        if (binarySearch < 0) {
            i9 = -(binarySearch + 2);
        } else {
            while (true) {
                int i10 = binarySearch - 1;
                if (i10 < 0 || ((Comparable) list.get(i10)).compareTo(l9) != 0) {
                    break;
                }
                binarySearch = i10;
            }
            i9 = binarySearch;
        }
        if (z9) {
            return Math.max(0, i9);
        }
        return i9;
    }

    public static int d(int[] iArr, int i9, boolean z9, boolean z10) {
        int i10;
        int i11;
        int binarySearch = Arrays.binarySearch(iArr, i9);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                i10 = binarySearch - 1;
                if (i10 < 0 || iArr[i10] != i9) {
                    break;
                }
                binarySearch = i10;
            }
            if (z9) {
                i11 = binarySearch;
            } else {
                i11 = i10;
            }
        }
        if (z10) {
            return Math.max(0, i11);
        }
        return i11;
    }

    public static int e(long[] jArr, long j4, boolean z9) {
        int i9;
        int binarySearch = Arrays.binarySearch(jArr, j4);
        if (binarySearch < 0) {
            i9 = -(binarySearch + 2);
        } else {
            while (true) {
                int i10 = binarySearch - 1;
                if (i10 < 0 || jArr[i10] != j4) {
                    break;
                }
                binarySearch = i10;
            }
            i9 = binarySearch;
        }
        if (z9) {
            return Math.max(0, i9);
        }
        return i9;
    }

    public static int f(int i9, int i10) {
        return ((i9 + i10) - 1) / i10;
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float h(float f9, float f10, float f11) {
        return Math.max(f10, Math.min(f9, f11));
    }

    public static int i(int i9, int i10, int i11) {
        return Math.max(i10, Math.min(i9, i11));
    }

    public static long j(long j4, long j9, long j10) {
        return Math.max(j9, Math.min(j4, j10));
    }

    public static boolean k(Object[] objArr, Comparable comparable) {
        for (Object obj : objArr) {
            if (a(obj, comparable)) {
                return true;
            }
        }
        return false;
    }

    public static Handler l(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        AbstractC1566a.n(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String m(byte[] bArr) {
        return new String(bArr, O5.e.f5491c);
    }

    public static int n(int i9) {
        if (i9 != 12) {
            switch (i9) {
                case 1:
                    return 4;
                case 2:
                    return 12;
                case 3:
                    return 28;
                case 4:
                    return 204;
                case 5:
                    return 220;
                case 6:
                    return 252;
                case 7:
                    return 1276;
                case 8:
                    return 6396;
                default:
                    return 0;
            }
        }
        return 743676;
    }

    public static n0 o(D.n nVar, n0 n0Var) {
        boolean z9;
        int k5;
        boolean z10;
        int e8;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean g9 = nVar.g();
        E0 I4 = nVar.I();
        boolean p9 = I4.p();
        boolean z19 = false;
        D0 d02 = (D0) nVar.f1707a;
        if (!p9 && I4.m(nVar.z(), d02, 0L).f19310h) {
            z9 = true;
        } else {
            z9 = false;
        }
        E0 I8 = nVar.I();
        if (I8.p()) {
            k5 = -1;
        } else {
            int z20 = nVar.z();
            int j4 = nVar.j();
            if (j4 == 1) {
                j4 = 0;
            }
            k5 = I8.k(z20, j4, nVar.L());
        }
        if (k5 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        E0 I9 = nVar.I();
        if (I9.p()) {
            e8 = -1;
        } else {
            int z21 = nVar.z();
            int j9 = nVar.j();
            if (j9 == 1) {
                j9 = 0;
            }
            e8 = I9.e(z21, j9, nVar.L());
        }
        if (e8 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean c02 = nVar.c0();
        E0 I10 = nVar.I();
        if (!I10.p() && I10.m(nVar.z(), d02, 0L).f19311i) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean p10 = nVar.I().p();
        com.google.firebase.messaging.u uVar = new com.google.firebase.messaging.u(9);
        f fVar = n0Var.f19699a;
        A6.i iVar = (A6.i) uVar.f16512a;
        iVar.getClass();
        for (int i9 = 0; i9 < fVar.f20498a.size(); i9++) {
            iVar.b(fVar.a(i9));
        }
        boolean z22 = !g9;
        uVar.n(4, z22);
        if (z9 && !g9) {
            z13 = true;
        } else {
            z13 = false;
        }
        uVar.n(5, z13);
        if (z10 && !g9) {
            z14 = true;
        } else {
            z14 = false;
        }
        uVar.n(6, z14);
        if (!p10 && ((z10 || !c02 || z9) && !g9)) {
            z15 = true;
        } else {
            z15 = false;
        }
        uVar.n(7, z15);
        if (z11 && !g9) {
            z16 = true;
        } else {
            z16 = false;
        }
        uVar.n(8, z16);
        if (!p10 && ((z11 || (c02 && z12)) && !g9)) {
            z17 = true;
        } else {
            z17 = false;
        }
        uVar.n(9, z17);
        uVar.n(10, z22);
        if (z9 && !g9) {
            z18 = true;
        } else {
            z18 = false;
        }
        uVar.n(11, z18);
        if (z9 && !g9) {
            z19 = true;
        }
        uVar.n(12, z19);
        return new n0(iVar.c());
    }

    public static byte[] p(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = i9 * 2;
            bArr[i9] = (byte) (Character.digit(str.charAt(i10 + 1), 16) + (Character.digit(str.charAt(i10), 16) << 4));
        }
        return bArr;
    }

    public static int q(int i9, String str) {
        int i10 = 0;
        for (String str2 : Q(str)) {
            if (i9 == n.h(n.d(str2))) {
                i10++;
            }
        }
        return i10;
    }

    public static String r(int i9, String str) {
        String[] Q7 = Q(str);
        if (Q7.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : Q7) {
                if (i9 == n.h(n.d(str2))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str2);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        }
        return null;
    }

    public static int s(int i9) {
        if (i9 != 2 && i9 != 4) {
            if (i9 != 10) {
                if (i9 != 7) {
                    if (i9 != 8) {
                        switch (i9) {
                            case 15:
                                return 6003;
                            case 16:
                            case 18:
                                return 6005;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                return 6004;
                            default:
                                switch (i9) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return 6003;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }

    public static int t(String str) {
        String[] split;
        int length;
        boolean z9;
        int i9 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z9 = true;
        } else {
            z9 = false;
        }
        try {
            str2.getClass();
            i9 = Integer.parseInt(str2);
            if (z9) {
                return -i9;
            }
        } catch (NumberFormatException unused) {
        }
        return i9;
    }

    public static long u(long j4, float f9) {
        if (f9 == 1.0f) {
            return j4;
        }
        return Math.round(j4 * f9);
    }

    public static long v(long j4) {
        if (j4 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime() + j4;
    }

    public static int w(int i9) {
        if (i9 != 8) {
            if (i9 != 16) {
                if (i9 != 24) {
                    if (i9 != 32) {
                        return 0;
                    }
                    return 805306368;
                }
                return 536870912;
            }
            return 2;
        }
        return 3;
    }

    public static int x(int i9, int i10) {
        if (i9 != 2) {
            if (i9 != 3) {
                if (i9 != 4) {
                    if (i9 != 268435456) {
                        if (i9 != 536870912) {
                            if (i9 != 805306368) {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            return i10 * 3;
                        }
                    }
                }
                return i10 * 4;
            }
            return i10;
        }
        return i10 * 2;
    }

    public static long y(long j4, float f9) {
        if (f9 == 1.0f) {
            return j4;
        }
        return Math.round(j4 / f9);
    }

    public static int z(int i9) {
        if (i9 != 13) {
            switch (i9) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case R.styleable.GradientColor_android_endX /* 10 */:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
        return 1;
    }
}
