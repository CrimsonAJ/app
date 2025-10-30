package u0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.k f23526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f23527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f23528f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ H f23529g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f23530h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kotlin.jvm.internal.k kVar, ArrayList arrayList, kotlin.jvm.internal.m mVar, H h7, Bundle bundle) {
        super(1);
        this.f23526d = kVar;
        this.f23527e = arrayList;
        this.f23528f = mVar;
        this.f23529g = h7;
        this.f23530h = bundle;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        List list;
        C2042m entry = (C2042m) obj;
        kotlin.jvm.internal.h.e(entry, "entry");
        this.f23526d.f20155a = true;
        ArrayList arrayList = this.f23527e;
        int indexOf = arrayList.indexOf(entry);
        if (indexOf != -1) {
            kotlin.jvm.internal.m mVar = this.f23528f;
            int i9 = indexOf + 1;
            list = arrayList.subList(mVar.f20157a, i9);
            mVar.f20157a = i9;
        } else {
            list = B7.t.f1135a;
        }
        this.f23529g.a(entry.f23496b, this.f23530h, entry, list);
        return A7.n.f558a;
    }
}
