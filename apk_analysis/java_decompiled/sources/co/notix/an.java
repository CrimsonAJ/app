package co.notix;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class an extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f11868a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(yh yhVar) {
        super(1);
        this.f11868a = yhVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        O7.l zmVar;
        List list = (List) obj;
        if (list != null) {
            ic icVar = this.f11868a.f13609c;
            if (B7.k.l0(kc.f12605a, kotlin.jvm.internal.p.a(tj.class))) {
                zmVar = new ym(icVar);
            } else {
                gr grVar = (gr) icVar.f12449a.get(tj.class);
                if (grVar != null) {
                    zmVar = new zm(grVar);
                } else {
                    throw new NullPointerException(n2.a("ToJsonAdapter for class ", tj.class, " not found"));
                }
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(zmVar.invoke(it.next()));
            }
            return jSONArray;
        }
        return null;
    }
}
