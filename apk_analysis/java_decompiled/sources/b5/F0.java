package b5;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10706a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10707b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10708c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10709d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f10710e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10711f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.U f10712g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10713h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f10714i;
    public final String j;

    public F0(Context context, com.google.android.gms.internal.measurement.U u9, Long l9) {
        this.f10713h = true;
        F4.y.h(context);
        Context applicationContext = context.getApplicationContext();
        F4.y.h(applicationContext);
        this.f10706a = applicationContext;
        this.f10714i = l9;
        if (u9 != null) {
            this.f10712g = u9;
            this.f10707b = u9.f15308f;
            this.f10708c = u9.f15307e;
            this.f10709d = u9.f15306d;
            this.f10713h = u9.f15305c;
            this.f10711f = u9.f15304b;
            this.j = u9.f15310h;
            Bundle bundle = u9.f15309g;
            if (bundle != null) {
                this.f10710e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
