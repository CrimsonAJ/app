package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ml extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb f12788a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml(gb gbVar) {
        super(1);
        this.f12788a = gbVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        JSONObject it = (JSONObject) obj;
        kotlin.jvm.internal.h.e(it, "it");
        return (tj) this.f12788a.a(it);
    }
}
