package co.notix;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class yj extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sk f13616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13617b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(sk skVar, long j) {
        super(1);
        this.f13616a = skVar;
        this.f13617b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [B7.t] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    @Override // O7.l
    public final Object invoke(Object obj) {
        ?? r0;
        List list = (List) obj;
        if (list != null) {
            sk skVar = this.f13616a;
            long j = this.f13617b;
            skVar.getClass();
            r0 = new ArrayList();
            for (Object obj2 : list) {
                if (((Number) obj2).longValue() >= j - sk.f13184d) {
                    r0.add(obj2);
                }
            }
        } else {
            r0 = B7.t.f1135a;
        }
        return B7.k.z0(r0, Long.valueOf(this.f13617b));
    }
}
