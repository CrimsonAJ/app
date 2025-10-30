package l4;

import B6.u0;
import F0.Y;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f20511a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f20512b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : y.Q(str)) {
            String d9 = d(str2);
            if (d9 != null && j(d9)) {
                return d9;
            }
        }
        return null;
    }

    public static String b(String str, String str2) {
        if (str != null && str2 != null) {
            String[] Q7 = y.Q(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : Q7) {
                if (str2.equals(d(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static int c(String str, String str2) {
        Y f9;
        str.getClass();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c3 = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c3 = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c3 = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c3 = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c3 = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c3 = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c3 = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c3 = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c3 = '\b';
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (f9 = f(str2)) == null) {
                    return 0;
                }
                return f9.a();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        Y f9;
        String str2 = null;
        if (str != null) {
            String L8 = u0.L(str.trim());
            if (!L8.startsWith("avc1") && !L8.startsWith("avc3")) {
                if (!L8.startsWith("hev1") && !L8.startsWith("hvc1")) {
                    if (!L8.startsWith("dvav") && !L8.startsWith("dva1") && !L8.startsWith("dvhe") && !L8.startsWith("dvh1")) {
                        if (L8.startsWith("av01")) {
                            return "video/av01";
                        }
                        if (!L8.startsWith("vp9") && !L8.startsWith("vp09")) {
                            if (!L8.startsWith("vp8") && !L8.startsWith("vp08")) {
                                if (L8.startsWith("mp4a")) {
                                    if (L8.startsWith("mp4a.") && (f9 = f(L8)) != null) {
                                        str2 = e(f9.f2058a);
                                    }
                                    if (str2 == null) {
                                        return "audio/mp4a-latm";
                                    }
                                    return str2;
                                }
                                if (L8.startsWith("mha1")) {
                                    return "audio/mha1";
                                }
                                if (L8.startsWith("mhm1")) {
                                    return "audio/mhm1";
                                }
                                if (!L8.startsWith("ac-3") && !L8.startsWith("dac3")) {
                                    if (!L8.startsWith("ec-3") && !L8.startsWith("dec3")) {
                                        if (L8.startsWith("ec+3")) {
                                            return "audio/eac3-joc";
                                        }
                                        if (!L8.startsWith("ac-4") && !L8.startsWith("dac4")) {
                                            if (L8.startsWith("dtsc")) {
                                                return "audio/vnd.dts";
                                            }
                                            if (L8.startsWith("dtse")) {
                                                return "audio/vnd.dts.hd;profile=lbr";
                                            }
                                            if (!L8.startsWith("dtsh") && !L8.startsWith("dtsl")) {
                                                if (L8.startsWith("dtsx")) {
                                                    return "audio/vnd.dts.uhd;profile=p2";
                                                }
                                                if (L8.startsWith("opus")) {
                                                    return "audio/opus";
                                                }
                                                if (L8.startsWith("vorbis")) {
                                                    return "audio/vorbis";
                                                }
                                                if (L8.startsWith("flac")) {
                                                    return "audio/flac";
                                                }
                                                if (L8.startsWith("stpp")) {
                                                    return "application/ttml+xml";
                                                }
                                                if (L8.startsWith("wvtt")) {
                                                    return "text/vtt";
                                                }
                                                if (L8.contains("cea708")) {
                                                    return "application/cea-708";
                                                }
                                                if (!L8.contains("eia608") && !L8.contains("cea608")) {
                                                    ArrayList arrayList = f20511a;
                                                    if (arrayList.size() > 0) {
                                                        arrayList.get(0).getClass();
                                                        throw new ClassCastException();
                                                    }
                                                } else {
                                                    return "application/cea-608";
                                                }
                                            } else {
                                                return "audio/vnd.dts.hd";
                                            }
                                        } else {
                                            return "audio/ac4";
                                        }
                                    } else {
                                        return "audio/eac3";
                                    }
                                } else {
                                    return "audio/ac3";
                                }
                            } else {
                                return "video/x-vnd.on2.vp8";
                            }
                        } else {
                            return "video/x-vnd.on2.vp9";
                        }
                    } else {
                        return "video/dolby-vision";
                    }
                } else {
                    return "video/hevc";
                }
            } else {
                return "video/avc";
            }
        }
        return null;
    }

    public static String e(int i9) {
        if (i9 != 32) {
            if (i9 != 33) {
                if (i9 != 35) {
                    if (i9 != 64) {
                        if (i9 != 163) {
                            if (i9 != 177) {
                                if (i9 != 165) {
                                    if (i9 != 166) {
                                        switch (i9) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return "video/mpeg2";
                                            case 102:
                                            case 103:
                                            case 104:
                                                return "audio/mp4a-latm";
                                            case 105:
                                            case 107:
                                                return "audio/mpeg";
                                            case 106:
                                                return "video/mpeg";
                                            default:
                                                switch (i9) {
                                                    case 169:
                                                    case 172:
                                                        return "audio/vnd.dts";
                                                    case 170:
                                                    case 171:
                                                        return "audio/vnd.dts.hd";
                                                    case 173:
                                                        return "audio/opus";
                                                    case 174:
                                                        return "audio/ac4";
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    public static Y f(String str) {
        int i9;
        Matcher matcher = f20512b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            try {
                int parseInt = Integer.parseInt(group, 16);
                if (group2 != null) {
                    i9 = Integer.parseInt(group2);
                } else {
                    i9 = 0;
                }
                return new Y(parseInt, i9);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static String g(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int h(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (j(str)) {
                return 1;
            }
            if (l(str)) {
                return 2;
            }
            if (k(str)) {
                return 3;
            }
            if ("image".equals(g(str))) {
                return 4;
            }
            if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str)) {
                if ("application/x-camera-motion".equals(str)) {
                    return 6;
                }
                ArrayList arrayList = f20511a;
                if (arrayList.size() <= 0) {
                    return -1;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            return 5;
        }
        return -1;
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : y.Q(str)) {
            String d9 = d(str2);
            if (d9 != null && l(d9)) {
                return d9;
            }
        }
        return null;
    }

    public static boolean j(String str) {
        return "audio".equals(g(str));
    }

    public static boolean k(String str) {
        if (!"text".equals(g(str)) && !"application/cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/x-subrip".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-rawcc".equals(str) && !"application/vobsub".equals(str) && !"application/pgs".equals(str) && !"application/dvbsubs".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean l(String str) {
        return "video".equals(g(str));
    }
}
