package b5;

import android.content.SharedPreferences;

/* renamed from: b5.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11034a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11035b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11036c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0623e0 f11038e;

    public C0614b0(C0623e0 c0623e0, String str, boolean z9) {
        this.f11038e = c0623e0;
        F4.y.e(str);
        this.f11034a = str;
        this.f11035b = z9;
    }

    public final void a(boolean z9) {
        SharedPreferences.Editor edit = this.f11038e.q0().edit();
        edit.putBoolean(this.f11034a, z9);
        edit.apply();
        this.f11037d = z9;
    }

    public final boolean b() {
        if (!this.f11036c) {
            this.f11036c = true;
            this.f11037d = this.f11038e.q0().getBoolean(this.f11034a, this.f11035b);
        }
        return this.f11037d;
    }
}
