package co.notix;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class fm extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ll f12275a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm(ll llVar) {
        super(1);
        this.f12275a = llVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        Collection collection;
        List list = (List) obj;
        if (list != null) {
            collection = B7.k.E0(list, 19);
        } else {
            collection = B7.t.f1135a;
        }
        ll llVar = this.f12275a;
        return B7.k.z0(collection, new tj(llVar.f12724d, W7.d.h0(200, llVar.f12722b)));
    }
}
