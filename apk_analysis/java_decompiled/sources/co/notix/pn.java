package co.notix;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class pn extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f12993a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(yh yhVar) {
        super(1);
        this.f12993a = yhVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        O7.l onVar;
        List list = (List) obj;
        if (list != null) {
            ic icVar = this.f12993a.f13609c;
            if (B7.k.l0(kc.f12605a, kotlin.jvm.internal.p.a(qo.class))) {
                onVar = new nn(icVar);
            } else {
                gr grVar = (gr) icVar.f12449a.get(qo.class);
                if (grVar != null) {
                    onVar = new on(grVar);
                } else {
                    throw new NullPointerException(n2.a("ToJsonAdapter for class ", qo.class, " not found"));
                }
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(onVar.invoke(it.next()));
            }
            return jSONArray;
        }
        return null;
    }
}
