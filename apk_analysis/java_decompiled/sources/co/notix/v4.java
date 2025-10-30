package co.notix;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class v4 extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t4 f13332a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(t4 t4Var) {
        super(1);
        this.f13332a = t4Var;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        Collection collection = (List) obj;
        if (collection == null) {
            collection = B7.t.f1135a;
        }
        ArrayList I02 = B7.k.I0(collection);
        I02.add(this.f13332a);
        return I02;
    }
}
