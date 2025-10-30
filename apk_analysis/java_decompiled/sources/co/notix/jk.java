package co.notix;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jk extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb f12564a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(gb gbVar) {
        super(1);
        this.f12564a = gbVar;
    }

    @Override // O7.l
    public final Object invoke(Object value) {
        kotlin.jvm.internal.h.e(value, "value");
        return this.f12564a.a((JSONObject) value);
    }
}
