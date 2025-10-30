package a6;

import U5.f;
import android.content.Context;
import android.preference.PreferenceManager;
import android.support.v4.media.session.y;
import p.c1;

/* renamed from: a6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501a {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f9158b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final f f9159a;

    public C0501a(c1 c1Var) {
        Context context = (Context) c1Var.f21976a;
        String str = (String) c1Var.f21977b;
        String str2 = (String) c1Var.f21978c;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                applicationContext.getSharedPreferences(str2, 0).edit();
            }
            this.f9159a = (f) c1Var.f21982g;
            return;
        }
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    public final synchronized y a() {
        return this.f9159a.c();
    }
}
