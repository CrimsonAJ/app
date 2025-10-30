package V7;

import B7.B;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements Iterable, P7.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f7838a;

    public n(i iVar) {
        this.f7838a = iVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new B(this.f7838a);
    }
}
