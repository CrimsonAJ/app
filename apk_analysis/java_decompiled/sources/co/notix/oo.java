package co.notix;

import java.util.NoSuchElementException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class oo implements gb {
    @Override // co.notix.td
    public final Object a(Object obj) {
        JSONObject from = (JSONObject) obj;
        kotlin.jvm.internal.h.e(from, "from");
        long j = from.getLong("timestamp");
        String string = from.getString("level");
        kotlin.jvm.internal.h.d(string, "from.getString(F_LEVEL)");
        for (ql qlVar : ql.values()) {
            if (kotlin.jvm.internal.h.a(qlVar.f13063a, string)) {
                return new qo(j, qlVar);
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
