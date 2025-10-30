package co.notix;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k5 extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12595a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(String str) {
        super(1);
        this.f12595a = str;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        if (list != null) {
            String str = this.f12595a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!kotlin.jvm.internal.h.a(((t4) obj2).f13208a, str)) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        return null;
    }
}
