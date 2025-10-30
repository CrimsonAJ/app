package co.notix;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f12285a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(yh yhVar) {
        super(1);
        this.f12285a = yhVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        O7.l f0Var;
        List list = (List) obj;
        if (list != null) {
            ic icVar = this.f12285a.f13609c;
            if (B7.k.l0(kc.f12605a, kotlin.jvm.internal.p.a(Long.class))) {
                f0Var = new e0(icVar);
            } else {
                gr grVar = (gr) icVar.f12449a.get(Long.class);
                if (grVar != null) {
                    f0Var = new f0(grVar);
                } else {
                    throw new NullPointerException(n2.a("ToJsonAdapter for class ", Long.class, " not found"));
                }
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(f0Var.invoke(it.next()));
            }
            return jSONArray;
        }
        return null;
    }
}
