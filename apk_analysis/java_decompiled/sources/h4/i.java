package h4;

import A4.r;
import j3.j0;
import java.util.regex.Pattern;
import l4.y;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f17924a = Pattern.compile("^NOTE([ \t].*)?$");

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        int i9 = y.f20553a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j4 = j * 1000;
        if (split.length == 2) {
            j4 += Long.parseLong(split[1]);
        }
        return j4 * 1000;
    }

    public static void c(r rVar) {
        int i9 = rVar.f382a;
        String j = rVar.j();
        if (j != null && j.startsWith("WEBVTT")) {
            return;
        }
        rVar.H(i9);
        throw j0.a("Expected WEBVTT. Got " + rVar.j(), null);
    }
}
