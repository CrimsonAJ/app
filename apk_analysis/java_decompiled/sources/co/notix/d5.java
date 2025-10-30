package co.notix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class d5 extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f12072a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(yh yhVar) {
        super(1);
        this.f12072a = yhVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        O7.l c5Var;
        if (obj != null) {
            ic icVar = this.f12072a.f13609c;
            JSONArray jSONArray = (JSONArray) obj;
            if (B7.k.l0(kc.f12605a, kotlin.jvm.internal.p.a(t4.class))) {
                c5Var = new b5(icVar);
            } else {
                gb gbVar = (gb) icVar.f12450b.get(t4.class);
                if (gbVar != null) {
                    c5Var = new c5(gbVar);
                } else {
                    throw new NullPointerException(n2.a("FromJsonAdapter for class ", t4.class, " not found"));
                }
            }
            List H02 = B7.k.H0(B6.u0.N(0, jSONArray.length()));
            ArrayList arrayList = new ArrayList(B7.m.f0(H02, 10));
            Iterator it = H02.iterator();
            while (it.hasNext()) {
                Object obj2 = jSONArray.get(((Number) it.next()).intValue());
                kotlin.jvm.internal.h.d(obj2, "jsonArray.get(it)");
                arrayList.add(c5Var.invoke(obj2));
            }
            return arrayList;
        }
        return null;
    }
}
