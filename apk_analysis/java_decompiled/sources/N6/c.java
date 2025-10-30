package N6;

import L6.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class c implements L6.f {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f5233a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f5233a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // L6.a
    public final void a(Object obj, Object obj2) {
        ((g) obj2).d(f5233a.format((Date) obj));
    }
}
