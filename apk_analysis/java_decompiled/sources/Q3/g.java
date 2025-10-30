package Q3;

import android.net.Uri;
import android.text.TextUtils;
import j3.j0;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.C1515o;
import k4.O;

/* loaded from: classes.dex */
public final class g implements O {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f6358a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // k4.O
    public final Object k(Uri uri, C1515o c1515o) {
        long j;
        long parseLong;
        String readLine = new BufferedReader(new InputStreamReader(c1515o, O5.e.f5491c)).readLine();
        try {
            Matcher matcher = f6358a.matcher(readLine);
            if (matcher.matches()) {
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    if ("+".equals(matcher.group(4))) {
                        j = 1;
                    } else {
                        j = -1;
                    }
                    long parseLong2 = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    if (TextUtils.isEmpty(group2)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(group2);
                    }
                    time -= (((parseLong2 * 60) + parseLong) * 60000) * j;
                }
                return Long.valueOf(time);
            }
            throw j0.b("Couldn't parse timestamp: " + readLine, null);
        } catch (ParseException e8) {
            throw j0.b(null, e8);
        }
    }
}
