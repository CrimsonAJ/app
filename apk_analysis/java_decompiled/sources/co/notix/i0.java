package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb f12424a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(gb gbVar) {
        super(1);
        this.f12424a = gbVar;
    }

    @Override // O7.l
    public final Object invoke(Object value) {
        kotlin.jvm.internal.h.e(value, "value");
        return this.f12424a.a((JSONObject) value);
    }
}
