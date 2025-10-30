package g8;

import A7.n;
import O7.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.i implements l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f17782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f17783f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i9) {
        super(1);
        this.f17781d = i9;
        this.f17782e = dVar;
        this.f17783f = cVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        switch (this.f17781d) {
            case 0:
                this.f17783f.getClass();
                this.f17782e.a(null);
                return n.f558a;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f17786h;
                this.f17783f.getClass();
                d dVar = this.f17782e;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.a(null);
                return n.f558a;
        }
    }
}
