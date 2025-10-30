package androidx.mediarouter.app;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10187a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10188b;

    public w(Object obj) {
        this.f10187a = obj;
        if (obj instanceof String) {
            this.f10188b = 1;
        } else {
            if (obj instanceof t0.C) {
                this.f10188b = 2;
                return;
            }
            throw new IllegalArgumentException();
        }
    }
}
