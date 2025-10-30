package co.notix;

import org.json.JSONException;

/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.i implements O7.l {
    public h0(ic icVar) {
        super(1);
    }

    @Override // O7.l
    public final Object invoke(Object value) {
        double doubleValue;
        float doubleValue2;
        long doubleValue3;
        kotlin.jvm.internal.h.e(value, "value");
        kotlin.jvm.internal.d a5 = kotlin.jvm.internal.p.a(Long.class);
        if (a5.equals(kotlin.jvm.internal.p.a(Long.TYPE))) {
            if (value instanceof Integer) {
                doubleValue3 = ((Number) value).intValue();
            } else if (value instanceof Long) {
                doubleValue3 = ((Number) value).longValue();
            } else if (value instanceof Double) {
                doubleValue3 = (long) ((Number) value).doubleValue();
            } else {
                throw new JSONException(o2.a(Long.class, A0.a.q("Expected ", Long.class, ", but ", value, " is not ")));
            }
            value = Long.valueOf(doubleValue3);
        } else if (a5.equals(kotlin.jvm.internal.p.a(Float.TYPE))) {
            if (value instanceof Integer) {
                doubleValue2 = ((Number) value).intValue();
            } else if (value instanceof Long) {
                doubleValue2 = (float) ((Number) value).longValue();
            } else if (value instanceof Double) {
                doubleValue2 = (float) ((Number) value).doubleValue();
            } else {
                throw new JSONException(o2.a(Long.class, A0.a.q("Expected ", Long.class, ", but ", value, " is not ")));
            }
            value = Float.valueOf(doubleValue2);
        } else if (a5.equals(kotlin.jvm.internal.p.a(Double.TYPE))) {
            if (value instanceof Integer) {
                doubleValue = ((Number) value).intValue();
            } else if (value instanceof Long) {
                doubleValue = ((Number) value).longValue();
            } else if (value instanceof Double) {
                doubleValue = ((Number) value).doubleValue();
            } else {
                throw new JSONException(o2.a(Long.class, A0.a.q("Expected ", Long.class, ", but ", value, " is not ")));
            }
            value = Double.valueOf(doubleValue);
        }
        return (Long) value;
    }
}
