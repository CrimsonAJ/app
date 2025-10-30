package J0;

import s8.n;

/* loaded from: classes.dex */
public abstract class g implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    public final Q0.a f3598a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3599b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3600c;

    public g(Q0.a aVar, String str) {
        this.f3598a = aVar;
        this.f3599b = str;
    }

    @Override // P0.c
    public final boolean K() {
        if (H(0) == 0) {
            return false;
        }
        return true;
    }

    public final void a() {
        if (!this.f3600c) {
            return;
        }
        n.y(21, "statement is closed");
        throw null;
    }
}
