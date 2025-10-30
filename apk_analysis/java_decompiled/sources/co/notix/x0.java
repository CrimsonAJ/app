package co.notix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f13499a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(yh yhVar) {
        super(1);
        this.f13499a = yhVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        O7.l w0Var;
        if (obj != null) {
            ic icVar = this.f13499a.f13609c;
            JSONArray jSONArray = (JSONArray) obj;
            if (B7.k.l0(kc.f12605a, kotlin.jvm.internal.p.a(Long.class))) {
                w0Var = new v0(icVar);
            } else {
                gb gbVar = (gb) icVar.f12450b.get(Long.class);
                if (gbVar != null) {
                    w0Var = new w0(gbVar);
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
                arrayList.add(w0Var.invoke(obj2));
            }
            return arrayList;
        }
        return null;
    }
}
