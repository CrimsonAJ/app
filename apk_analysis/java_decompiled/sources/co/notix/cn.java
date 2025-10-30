package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class cn extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb f12054a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn(gb gbVar) {
        super(1);
        this.f12054a = gbVar;
    }

    @Override // O7.l
    public final Object invoke(Object value) {
        kotlin.jvm.internal.h.e(value, "value");
        return this.f12054a.a((JSONObject) value);
    }
}
