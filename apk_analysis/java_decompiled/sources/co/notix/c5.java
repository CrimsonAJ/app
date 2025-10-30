package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c5 extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb f11985a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(gb gbVar) {
        super(1);
        this.f11985a = gbVar;
    }

    @Override // O7.l
    public final Object invoke(Object value) {
        kotlin.jvm.internal.h.e(value, "value");
        return this.f11985a.a((JSONObject) value);
    }
}
