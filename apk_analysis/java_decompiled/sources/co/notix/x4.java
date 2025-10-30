package co.notix;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class x4 extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public static final x4 f13503a = new x4();

    public x4() {
        super(1);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        List list = (List) obj;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((t4) obj2).f13211d > System.currentTimeMillis()) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        return null;
    }
}
