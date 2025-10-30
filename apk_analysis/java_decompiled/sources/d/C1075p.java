package d;

import java.util.ListIterator;

/* renamed from: d.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1075p extends kotlin.jvm.internal.i implements O7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1082w f16612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1075p(C1082w c1082w, int i9) {
        super(0);
        this.f16611d = i9;
        this.f16612e = c1082w;
    }

    @Override // O7.a
    public final Object invoke() {
        Object obj;
        switch (this.f16611d) {
            case 0:
                this.f16612e.c();
                return A7.n.f558a;
            case 1:
                C1082w c1082w = this.f16612e;
                B7.i iVar = c1082w.f16628b;
                ListIterator listIterator = iVar.listIterator(iVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((AbstractC1073n) obj).f16606a) {
                        }
                    } else {
                        obj = null;
                    }
                }
                c1082w.f16629c = null;
                return A7.n.f558a;
            default:
                this.f16612e.c();
                return A7.n.f558a;
        }
    }
}
