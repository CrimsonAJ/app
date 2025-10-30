package co.notix;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class gn extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f12342a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn(Set set) {
        super(1);
        this.f12342a = set;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        if (list != null) {
            Set set = this.f12342a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!set.contains(((pl) obj2).f12983a)) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        return null;
    }
}
