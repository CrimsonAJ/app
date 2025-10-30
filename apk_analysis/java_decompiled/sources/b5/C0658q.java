package b5;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: b5.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0658q extends AbstractC0674x0 {

    /* renamed from: c, reason: collision with root package name */
    public long f11274c;

    /* renamed from: d, reason: collision with root package name */
    public String f11275d;

    @Override // b5.AbstractC0674x0
    public final boolean m0() {
        Calendar calendar = Calendar.getInstance();
        this.f11274c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f11275d = AbstractC0953k1.o(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long p0() {
        n0();
        return this.f11274c;
    }

    public final String q0() {
        n0();
        return this.f11275d;
    }
}
