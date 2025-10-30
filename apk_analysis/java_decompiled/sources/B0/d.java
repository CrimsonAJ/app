package B0;

import B6.u0;
import C0.g;
import C0.i;
import C0.j;
import S5.p;
import Y7.B;
import Y7.K;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final g f597a;

    public d(g gVar) {
        this.f597a = gVar;
    }

    public p a(C0.a deletionRequest) {
        h.e(deletionRequest, "deletionRequest");
        throw null;
    }

    public p b() {
        return u0.b(B.c(B.a(K.f8773a), null, new a(this, null), 3));
    }

    public p c(C0.h request) {
        h.e(request, "request");
        throw null;
    }

    public p d(Uri attributionSource, InputEvent inputEvent) {
        h.e(attributionSource, "attributionSource");
        return u0.b(B.c(B.a(K.f8773a), null, new b(this, attributionSource, inputEvent, null), 3));
    }

    public p e(Uri trigger) {
        h.e(trigger, "trigger");
        return u0.b(B.c(B.a(K.f8773a), null, new c(this, trigger, null), 3));
    }

    public p f(i request) {
        h.e(request, "request");
        throw null;
    }

    public p g(j request) {
        h.e(request, "request");
        throw null;
    }
}
