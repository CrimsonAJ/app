package co.notix;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class si extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f13183a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(String str) {
        super(1);
        this.f13183a = str;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        if (list != null) {
            String str = this.f13183a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!kotlin.jvm.internal.h.a(((ni) obj2).f12824a, str)) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        return null;
    }
}
