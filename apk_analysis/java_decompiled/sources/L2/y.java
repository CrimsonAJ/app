package L2;

import a.AbstractC0485a;
import y2.C2203a;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final C2203a f4638a;

    public y(C2203a encryptedPreference) {
        kotlin.jvm.internal.h.e(encryptedPreference, "encryptedPreference");
        this.f4638a = encryptedPreference;
    }

    public final H2.r a() {
        long j;
        Object h7;
        g6.o oVar = g6.o.f17761a;
        Long F2 = W7.k.F(oVar.F0());
        if (F2 != null) {
            j = F2.longValue();
        } else {
            j = -1;
        }
        Long valueOf = Long.valueOf(j);
        String W6 = oVar.W();
        boolean z9 = false;
        Object obj = 0;
        kotlin.jvm.internal.d a5 = kotlin.jvm.internal.p.a(Integer.class);
        boolean equals = a5.equals(kotlin.jvm.internal.p.a(Float.TYPE));
        C2203a c2203a = this.f4638a;
        if (equals) {
            obj = (Integer) Float.valueOf(c2203a.f24771a.getFloat(W6, ((Float) obj).floatValue()));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Integer.TYPE))) {
            obj = Integer.valueOf(c2203a.f24771a.getInt(W6, 0));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Long.TYPE))) {
            obj = (Integer) Long.valueOf(c2203a.f24771a.getLong(W6, ((Long) obj).longValue()));
        } else if (a5.equals(kotlin.jvm.internal.p.a(String.class))) {
            Object string = c2203a.f24771a.getString(W6, (String) obj);
            if (string != null) {
                obj = (Integer) string;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        } else if (a5.equals(kotlin.jvm.internal.p.a(Boolean.TYPE))) {
            obj = (Integer) Boolean.valueOf(c2203a.f24771a.getBoolean(W6, ((Boolean) obj).booleanValue()));
        } else {
            String string2 = c2203a.f24771a.getString(W6, "");
            if (string2 != null && string2.length() != 0) {
                try {
                    h7 = c2203a.f24772b.a(Integer.class).a(string2);
                } catch (Throwable th) {
                    h7 = AbstractC0485a.h(th);
                }
                if (h7 instanceof A7.i) {
                    h7 = null;
                }
                if (h7 != null) {
                    obj = h7;
                }
            }
        }
        if (((Number) obj).intValue() > 0) {
            z9 = true;
        }
        return new H2.r(valueOf, z9);
    }
}
