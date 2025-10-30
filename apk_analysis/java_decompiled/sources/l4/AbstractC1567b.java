package l4;

import B6.u0;
import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u0.z;

/* renamed from: l4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1567b {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f20483a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f20484b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f20485c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f20486d;

    static {
        HashMap hashMap = new HashMap();
        f20486d = hashMap;
        z.h(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        hashMap.put("aqua", -16711681);
        hashMap.put("aquamarine", -8388652);
        z.h(-983041, hashMap, "azure", -657956, "beige");
        z.h(-6972, hashMap, "bisque", -16777216, "black");
        z.h(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        z.h(-7722014, hashMap, "blueviolet", -5952982, "brown");
        z.h(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        z.h(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        z.h(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        z.h(-1828, hashMap, "cornsilk", -2354116, "crimson");
        hashMap.put("cyan", -16711681);
        hashMap.put("darkblue", -16777077);
        z.h(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        hashMap.put("darkgray", -5658199);
        hashMap.put("darkgreen", -16751616);
        hashMap.put("darkgrey", -5658199);
        hashMap.put("darkkhaki", -4343957);
        z.h(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        z.h(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        z.h(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        z.h(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        hashMap.put("darkturquoise", -16724271);
        hashMap.put("darkviolet", -7077677);
        z.h(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        hashMap.put("dodgerblue", -14774017);
        hashMap.put("firebrick", -5103070);
        z.h(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        hashMap.put("fuchsia", -65281);
        hashMap.put("gainsboro", -2302756);
        z.h(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        z.h(-16744448, hashMap, "green", -5374161, "greenyellow");
        hashMap.put("grey", -8355712);
        hashMap.put("honeydew", -983056);
        z.h(-38476, hashMap, "hotpink", -3318692, "indianred");
        z.h(-11861886, hashMap, "indigo", -16, "ivory");
        z.h(-989556, hashMap, "khaki", -1644806, "lavender");
        z.h(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        z.h(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        z.h(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        z.h(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        z.h(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        hashMap.put("lightsteelblue", -5192482);
        hashMap.put("lightyellow", -32);
        z.h(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        z.h(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        z.h(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        z.h(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        z.h(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        z.h(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        z.h(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        z.h(-6943, hashMap, "mistyrose", -6987, "moccasin");
        z.h(-8531, hashMap, "navajowhite", -16777088, "navy");
        z.h(-133658, hashMap, "oldlace", -8355840, "olive");
        z.h(-9728477, hashMap, "olivedrab", -23296, "orange");
        z.h(-47872, hashMap, "orangered", -2461482, "orchid");
        z.h(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        z.h(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        z.h(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        z.h(-3308225, hashMap, "peru", -16181, "pink");
        z.h(-2252579, hashMap, "plum", -5185306, "powderblue");
        z.h(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        z.h(-65536, hashMap, "red", -4419697, "rosybrown");
        z.h(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        z.h(-360334, hashMap, "salmon", -744352, "sandybrown");
        z.h(-13726889, hashMap, "seagreen", -2578, "seashell");
        z.h(-6270419, hashMap, "sienna", -4144960, "silver");
        z.h(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        hashMap.put("snow", -1286);
        hashMap.put("springgreen", -16711809);
        z.h(-12156236, hashMap, "steelblue", -2968436, "tan");
        z.h(-16744320, hashMap, "teal", -2572328, "thistle");
        z.h(-40121, hashMap, "tomato", 0, "transparent");
        z.h(-12525360, hashMap, "turquoise", -1146130, "violet");
        z.h(-663885, hashMap, "wheat", -1, "white");
        z.h(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z9) {
        Pattern pattern;
        int parseInt;
        AbstractC1566a.h(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            if (z9) {
                pattern = f20485c;
            } else {
                pattern = f20484b;
            }
            Matcher matcher = pattern.matcher(replace);
            if (matcher.matches()) {
                if (z9) {
                    String group = matcher.group(4);
                    group.getClass();
                    parseInt = (int) (Float.parseFloat(group) * 255.0f);
                } else {
                    String group2 = matcher.group(4);
                    group2.getClass();
                    parseInt = Integer.parseInt(group2, 10);
                }
                String group3 = matcher.group(1);
                group3.getClass();
                int parseInt2 = Integer.parseInt(group3, 10);
                String group4 = matcher.group(2);
                group4.getClass();
                int parseInt3 = Integer.parseInt(group4, 10);
                String group5 = matcher.group(3);
                group5.getClass();
                return Color.argb(parseInt, parseInt2, parseInt3, Integer.parseInt(group5, 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f20483a.matcher(replace);
            if (matcher2.matches()) {
                String group6 = matcher2.group(1);
                group6.getClass();
                int parseInt4 = Integer.parseInt(group6, 10);
                String group7 = matcher2.group(2);
                group7.getClass();
                int parseInt5 = Integer.parseInt(group7, 10);
                String group8 = matcher2.group(3);
                group8.getClass();
                return Color.rgb(parseInt4, parseInt5, Integer.parseInt(group8, 10));
            }
        } else {
            Integer num = (Integer) f20486d.get(u0.L(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
