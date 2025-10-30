package T6;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final long f7233b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f7234c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static k f7235d;

    /* renamed from: a, reason: collision with root package name */
    public final F5.e f7236a;

    public k(F5.e eVar) {
        this.f7236a = eVar;
    }

    public final boolean a(U6.b bVar) {
        if (!TextUtils.isEmpty(bVar.f7530c)) {
            long j = bVar.f7533f + bVar.f7532e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f7236a.getClass();
            if (j < timeUnit.toSeconds(System.currentTimeMillis()) + f7233b) {
                return true;
            }
            return false;
        }
        return true;
    }
}
