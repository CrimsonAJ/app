package co.notix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class sn extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f13192a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn(yh yhVar) {
        super(1);
        this.f13192a = yhVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        O7.l rnVar;
        if (obj != null) {
            ic icVar = this.f13192a.f13609c;
            JSONArray jSONArray = (JSONArray) obj;
            if (B7.k.l0(kc.f12605a, kotlin.jvm.internal.p.a(qo.class))) {
                rnVar = new qn(icVar);
            } else {
                gb gbVar = (gb) icVar.f12450b.get(qo.class);
                if (gbVar != null) {
                    rnVar = new rn(gbVar);
                } else {
                    throw new NullPointerException(n2.a("FromJsonAdapter for class ", qo.class, " not found"));
                }
            }
            List H02 = B7.k.H0(B6.u0.N(0, jSONArray.length()));
            ArrayList arrayList = new ArrayList(B7.m.f0(H02, 10));
            Iterator it = H02.iterator();
            while (it.hasNext()) {
                Object obj2 = jSONArray.get(((Number) it.next()).intValue());
                kotlin.jvm.internal.h.d(obj2, "jsonArray.get(it)");
                arrayList.add(rnVar.invoke(obj2));
            }
            return arrayList;
        }
        return null;
    }
}
