package z8;

/* loaded from: classes.dex */
public final class G extends X {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25532d;

    public G(boolean z9) {
        this.f25532d = z9;
    }

    @Override // z8.X
    public final void a(L l9, Object obj) {
        if (obj == null) {
            return;
        }
        l9.d(obj.toString(), null, this.f25532d);
    }
}
