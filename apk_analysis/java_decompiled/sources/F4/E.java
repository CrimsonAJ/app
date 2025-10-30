package F4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class E extends s {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0126e f2336g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(AbstractC0126e abstractC0126e, int i9, Bundle bundle) {
        super(abstractC0126e, i9, bundle);
        this.f2336g = abstractC0126e;
    }

    @Override // F4.s
    public final void a(B4.b bVar) {
        AbstractC0126e abstractC0126e = this.f2336g;
        abstractC0126e.getClass();
        abstractC0126e.f2377k.a(bVar);
        abstractC0126e.y(bVar);
    }

    @Override // F4.s
    public final boolean b() {
        this.f2336g.f2377k.a(B4.b.f683e);
        return true;
    }
}
