package co.notix;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class pi extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni f12973a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(ni niVar) {
        super(1);
        this.f12973a = niVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        Collection collection = (List) obj;
        if (collection == null) {
            collection = B7.t.f1135a;
        }
        return B7.k.z0(collection, this.f12973a);
    }
}
