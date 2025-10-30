package w1;

import android.net.Uri;

/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    public final A7.l f24012a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.l f24013b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24014c;

    public i(A7.l lVar, A7.l lVar2, boolean z9) {
        this.f24012a = lVar;
        this.f24013b = lVar2;
        this.f24014c = z9;
    }

    @Override // w1.f
    public final g a(Object obj, C1.m mVar) {
        Uri uri = (Uri) obj;
        if (!kotlin.jvm.internal.h.a(uri.getScheme(), "http") && !kotlin.jvm.internal.h.a(uri.getScheme(), "https")) {
            return null;
        }
        return new l(uri.toString(), mVar, this.f24012a, this.f24013b, this.f24014c);
    }
}
