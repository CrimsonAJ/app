package co.notix;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l2 f13010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13011b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l2 l2Var, long j) {
        super(1);
        this.f13010a = l2Var;
        this.f13011b = j;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        Collection collection;
        List list = (List) obj;
        if (list != null) {
            l2 l2Var = this.f13010a;
            long j = this.f13011b;
            l2Var.getClass();
            collection = l2.a(list, j);
        } else {
            collection = B7.t.f1135a;
        }
        return B7.k.z0(collection, Long.valueOf(this.f13011b));
    }
}
