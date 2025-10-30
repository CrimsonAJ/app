package Z;

import A7.n;
import d0.o;
import x8.y;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f8874e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i9) {
        super(0);
        this.f8873d = i9;
        this.f8874e = fVar;
    }

    @Override // O7.a
    public final Object invoke() {
        switch (this.f8873d) {
            case 0:
                f fVar = this.f8874e;
                y yVar = (y) fVar.f8879c.invoke();
                if (y8.c.a(yVar) != -1) {
                    return o.g(yVar.f24686a.q(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + fVar.f8879c + ", instead got " + yVar).toString());
            default:
                Q6.f fVar2 = f.f8876f;
                f fVar3 = this.f8874e;
                synchronized (fVar2) {
                    f.f8875e.remove(((y) fVar3.f8880d.getValue()).f24686a.q());
                }
                return n.f558a;
        }
    }
}
