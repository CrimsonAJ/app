package b5;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class O0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10826b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10827c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f10828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f10829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f10830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f10831g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S0 f10832h;

    public O0(S0 s02, String str, String str2, long j, Bundle bundle, boolean z9, boolean z10, boolean z11) {
        this.f10825a = str;
        this.f10826b = str2;
        this.f10827c = j;
        this.f10828d = bundle;
        this.f10829e = z9;
        this.f10830f = z10;
        this.f10831g = z11;
        this.f10832h = s02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10832h.y0(this.f10825a, this.f10826b, this.f10827c, this.f10828d, this.f10829e, this.f10830f, this.f10831g);
    }
}
