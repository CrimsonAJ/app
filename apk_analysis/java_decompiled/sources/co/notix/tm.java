package co.notix;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class tm extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f13243a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm(yh yhVar) {
        super(1);
        this.f13243a = yhVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        O7.l smVar;
        List list = (List) obj;
        if (list != null) {
            ic icVar = this.f13243a.f13609c;
            if (B7.k.l0(kc.f12605a, kotlin.jvm.internal.p.a(pl.class))) {
                smVar = new rm(icVar);
            } else {
                gr grVar = (gr) icVar.f12449a.get(pl.class);
                if (grVar != null) {
                    smVar = new sm(grVar);
                } else {
                    throw new NullPointerException(n2.a("ToJsonAdapter for class ", pl.class, " not found"));
                }
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(smVar.invoke(it.next()));
            }
            return jSONArray;
        }
        return null;
    }
}
