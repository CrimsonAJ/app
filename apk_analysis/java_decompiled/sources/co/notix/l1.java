package co.notix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class l1 extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f12657a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(yh yhVar) {
        super(1);
        this.f12657a = yhVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        O7.l k1Var;
        if (obj != null) {
            ic icVar = this.f12657a.f13609c;
            JSONArray jSONArray = (JSONArray) obj;
            if (B7.k.l0(kc.f12605a, kotlin.jvm.internal.p.a(Long.class))) {
                k1Var = new j1(icVar);
            } else {
                gb gbVar = (gb) icVar.f12450b.get(Long.class);
                if (gbVar != null) {
                    k1Var = new k1(gbVar);
                } else {
                    throw new NullPointerException(n2.a("FromJsonAdapter for class ", Long.class, " not found"));
                }
            }
            List H02 = B7.k.H0(B6.u0.N(0, jSONArray.length()));
            ArrayList arrayList = new ArrayList(B7.m.f0(H02, 10));
            Iterator it = H02.iterator();
            while (it.hasNext()) {
                Object obj2 = jSONArray.get(((Number) it.next()).intValue());
                kotlin.jvm.internal.h.d(obj2, "jsonArray.get(it)");
                arrayList.add(k1Var.invoke(obj2));
            }
            return arrayList;
        }
        return null;
    }
}
