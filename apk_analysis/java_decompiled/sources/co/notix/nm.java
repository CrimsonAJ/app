package co.notix;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class nm extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pl f12831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12832b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(pl plVar, long j) {
        super(1);
        this.f12831a = plVar;
        this.f12832b = j;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        Collection collection = (List) obj;
        if (collection == null) {
            collection = B7.t.f1135a;
        }
        return B7.k.E0(B7.k.z0(collection, this.f12831a), (int) this.f12832b);
    }
}
