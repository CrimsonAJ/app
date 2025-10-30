package co.notix;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class dj extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O7.l f12106b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(String str, O7.l lVar) {
        super(1);
        this.f12105a = str;
        this.f12106b = lVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        List<ni> list = (List) obj;
        if (list != null) {
            String str = this.f12105a;
            O7.l lVar = this.f12106b;
            ArrayList arrayList = new ArrayList(B7.m.f0(list, 10));
            for (ni niVar : list) {
                if (kotlin.jvm.internal.h.a(niVar.f12824a, str)) {
                    niVar = (ni) lVar.invoke(niVar);
                }
                arrayList.add(niVar);
            }
            return arrayList;
        }
        return null;
    }
}
