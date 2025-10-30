package V7;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final j f7824a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7825b;

    /* renamed from: c, reason: collision with root package name */
    public final O7.l f7826c;

    public g(j jVar, boolean z9, O7.l lVar) {
        this.f7824a = jVar;
        this.f7825b = z9;
        this.f7826c = lVar;
    }

    @Override // V7.j
    public final Iterator iterator() {
        return new f(this);
    }
}
