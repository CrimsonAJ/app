package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xi extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb f13537a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(gb gbVar) {
        super(1);
        this.f13537a = gbVar;
    }

    @Override // O7.l
    public final Object invoke(Object value) {
        kotlin.jvm.internal.h.e(value, "value");
        return this.f13537a.a((JSONObject) value);
    }
}
