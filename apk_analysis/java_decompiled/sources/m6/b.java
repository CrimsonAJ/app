package m6;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p6.C1860a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f20856g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f20857h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public final String f20858a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20859b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20860c;

    /* renamed from: d, reason: collision with root package name */
    public final Date f20861d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20862e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20863f;

    public b(String str, String str2, String str3, Date date, long j, long j4) {
        this.f20858a = str;
        this.f20859b = str2;
        this.f20860c = str3;
        this.f20861d = date;
        this.f20862e = j;
        this.f20863f = j4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p6.a] */
    public final C1860a a() {
        ?? obj = new Object();
        obj.f22182a = "frc";
        obj.f22193m = this.f20861d.getTime();
        obj.f22183b = this.f20858a;
        obj.f22184c = this.f20859b;
        String str = this.f20860c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        obj.f22185d = str;
        obj.f22186e = this.f20862e;
        obj.j = this.f20863f;
        return obj;
    }
}
