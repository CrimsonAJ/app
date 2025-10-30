package o8;

import D4.K;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final K f21749a = new K(9);

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f21750b;

    /* renamed from: c, reason: collision with root package name */
    public static final DateFormat[] f21751c;

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f21750b = strArr;
        f21751c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        h.e(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f21749a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f21750b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i9 = 0; i9 < length; i9++) {
                    DateFormat[] dateFormatArr = f21751c;
                    DateFormat dateFormat = dateFormatArr[i9];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(f21750b[i9], Locale.US);
                        dateFormat.setTimeZone(k8.c.f20145e);
                        dateFormatArr[i9] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
