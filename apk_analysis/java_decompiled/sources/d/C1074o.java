package d;

import java.util.ListIterator;

/* renamed from: d.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1074o extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1082w f16610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1074o(C1082w c1082w, int i9) {
        super(1);
        this.f16609d = i9;
        this.f16610e = c1082w;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f16609d) {
            case 0:
                C1061b backEvent = (C1061b) obj;
                kotlin.jvm.internal.h.e(backEvent, "backEvent");
                C1082w c1082w = this.f16610e;
                B7.i iVar = c1082w.f16628b;
                ListIterator listIterator = iVar.listIterator(iVar.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((AbstractC1073n) obj2).f16606a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                c1082w.f16629c = (AbstractC1073n) obj2;
                return A7.n.f558a;
            default:
                C1061b backEvent2 = (C1061b) obj;
                kotlin.jvm.internal.h.e(backEvent2, "backEvent");
                B7.i iVar2 = this.f16610e.f16628b;
                ListIterator listIterator2 = iVar2.listIterator(iVar2.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        obj3 = listIterator2.previous();
                        if (((AbstractC1073n) obj3).f16606a) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                return A7.n.f558a;
        }
    }
}
