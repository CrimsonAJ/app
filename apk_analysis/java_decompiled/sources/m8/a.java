package m8;

import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f20918a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20919b;

    /* renamed from: c, reason: collision with root package name */
    public b f20920c;

    /* renamed from: d, reason: collision with root package name */
    public long f20921d;

    public a(String name, boolean z9) {
        h.e(name, "name");
        this.f20918a = name;
        this.f20919b = z9;
        this.f20921d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f20918a;
    }
}
