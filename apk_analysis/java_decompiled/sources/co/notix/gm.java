package co.notix;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class gm extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ll f12340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gm(ll llVar, long j) {
        super(1);
        this.f12340a = llVar;
        this.f12341b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [B7.t] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // O7.l
    public final Object invoke(Object obj) {
        ?? r22;
        List list = (List) obj;
        if (list != null) {
            long j = this.f12341b;
            r22 = new ArrayList();
            for (Object obj2 : list) {
                if (((qo) obj2).f13067a + lm.f12727f > j) {
                    r22.add(obj2);
                }
            }
        } else {
            r22 = B7.t.f1135a;
        }
        ll llVar = this.f12340a;
        return B7.k.z0(r22, new qo(llVar.f12724d, llVar.f12721a));
    }
}
