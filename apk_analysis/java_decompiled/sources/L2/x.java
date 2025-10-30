package L2;

import a.AbstractC0485a;
import android.app.Application;
import android.content.SharedPreferences;
import y2.C2203a;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final C2203a f4637a;

    public x(C2203a encryptedPreference) {
        kotlin.jvm.internal.h.e(encryptedPreference, "encryptedPreference");
        this.f4637a = encryptedPreference;
    }

    public final String a(Application application) {
        Object h7;
        if (application == null) {
            return g6.o.f17761a.E0();
        }
        String H02 = g6.o.f17761a.H0();
        Object obj = Boolean.FALSE;
        kotlin.jvm.internal.d a5 = kotlin.jvm.internal.p.a(Boolean.class);
        boolean equals = a5.equals(kotlin.jvm.internal.p.a(Float.TYPE));
        C2203a c2203a = this.f4637a;
        if (equals) {
            obj = (Boolean) Float.valueOf(c2203a.f24771a.getFloat(H02, ((Float) obj).floatValue()));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Integer.TYPE))) {
            obj = (Boolean) Integer.valueOf(c2203a.f24771a.getInt(H02, ((Integer) obj).intValue()));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Long.TYPE))) {
            obj = (Boolean) Long.valueOf(c2203a.f24771a.getLong(H02, ((Long) obj).longValue()));
        } else if (a5.equals(kotlin.jvm.internal.p.a(String.class))) {
            Object string = c2203a.f24771a.getString(H02, (String) obj);
            if (string != null) {
                obj = (Boolean) string;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
        } else if (a5.equals(kotlin.jvm.internal.p.a(Boolean.TYPE))) {
            obj = Boolean.valueOf(c2203a.f24771a.getBoolean(H02, false));
        } else {
            String string2 = c2203a.f24771a.getString(H02, "");
            if (string2 != null && string2.length() != 0) {
                try {
                    h7 = c2203a.f24772b.a(Boolean.class).a(string2);
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
        if (!((Boolean) obj).booleanValue()) {
            g6.o oVar = g6.o.f17761a;
            oVar.s(application);
            String H03 = oVar.H0();
            SharedPreferences.Editor edit = c2203a.f24771a.edit();
            edit.putBoolean(H03, true);
            edit.apply();
        }
        return "";
    }
}
