package co.notix;

import org.json.JSONException;

/* loaded from: classes.dex */
public final class a2 extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f11819a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(yh yhVar) {
        super(1);
        this.f11819a = yhVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        double doubleValue;
        float doubleValue2;
        long doubleValue3;
        if (obj != null) {
            this.f11819a.getClass();
            kotlin.jvm.internal.d a5 = kotlin.jvm.internal.p.a(Integer.class);
            if (a5.equals(kotlin.jvm.internal.p.a(Long.TYPE))) {
                if (obj instanceof Integer) {
                    doubleValue3 = ((Number) obj).intValue();
                } else if (obj instanceof Long) {
                    doubleValue3 = ((Number) obj).longValue();
                } else if (obj instanceof Double) {
                    doubleValue3 = (long) ((Number) obj).doubleValue();
                } else {
                    throw new JSONException(o2.a(Integer.class, A0.a.q("Expected ", Integer.class, ", but ", obj, " is not ")));
                }
                obj = (Integer) Long.valueOf(doubleValue3);
            } else if (a5.equals(kotlin.jvm.internal.p.a(Float.TYPE))) {
                if (obj instanceof Integer) {
                    doubleValue2 = ((Number) obj).intValue();
                } else if (obj instanceof Long) {
                    doubleValue2 = (float) ((Number) obj).longValue();
                } else if (obj instanceof Double) {
                    doubleValue2 = (float) ((Number) obj).doubleValue();
                } else {
                    throw new JSONException(o2.a(Integer.class, A0.a.q("Expected ", Integer.class, ", but ", obj, " is not ")));
                }
                obj = Float.valueOf(doubleValue2);
            } else if (a5.equals(kotlin.jvm.internal.p.a(Double.TYPE))) {
                if (obj instanceof Integer) {
                    doubleValue = ((Number) obj).intValue();
                } else if (obj instanceof Long) {
                    doubleValue = ((Number) obj).longValue();
                } else if (obj instanceof Double) {
                    doubleValue = ((Number) obj).doubleValue();
                } else {
                    throw new JSONException(o2.a(Integer.class, A0.a.q("Expected ", Integer.class, ", but ", obj, " is not ")));
                }
                obj = Double.valueOf(doubleValue);
            }
            return (Integer) obj;
        }
        return null;
    }
}
