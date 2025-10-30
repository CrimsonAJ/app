package R0;

import A7.l;
import A7.m;
import android.content.Context;

/* loaded from: classes.dex */
public final class h implements Q0.d, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6487a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6488b;

    /* renamed from: c, reason: collision with root package name */
    public final Q0.b f6489c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6490d;

    /* renamed from: e, reason: collision with root package name */
    public final l f6491e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6492f;

    public h(Context context, String str, Q0.b callback, boolean z9) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(callback, "callback");
        this.f6487a = context;
        this.f6488b = str;
        this.f6489c = callback;
        this.f6490d = z9;
        this.f6491e = Z0.a.q(new B2.i(5, this));
    }

    @Override // Q0.d
    public final Q0.a Z() {
        return ((g) this.f6491e.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6491e.f555b != m.f557a) {
            ((g) this.f6491e.getValue()).close();
        }
    }

    @Override // Q0.d
    public final String getDatabaseName() {
        return this.f6488b;
    }

    @Override // Q0.d
    public final void setWriteAheadLoggingEnabled(boolean z9) {
        if (this.f6491e.f555b != m.f557a) {
            ((g) this.f6491e.getValue()).setWriteAheadLoggingEnabled(z9);
        }
        this.f6492f = z9;
    }
}
