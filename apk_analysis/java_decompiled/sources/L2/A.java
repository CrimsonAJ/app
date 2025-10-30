package L2;

import a.AbstractC0485a;
import android.content.SharedPreferences;
import y2.C2203a;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final C2203a f4577a;

    public A(C2203a encryptedPreference) {
        kotlin.jvm.internal.h.e(encryptedPreference, "encryptedPreference");
        this.f4577a = encryptedPreference;
    }

    public final boolean a() {
        Object h7;
        C2203a c2203a = this.f4577a;
        kotlin.jvm.internal.h.e(c2203a, "<this>");
        String j02 = g6.o.f17761a.j0();
        Object obj = Boolean.TRUE;
        kotlin.jvm.internal.d a5 = kotlin.jvm.internal.p.a(Boolean.class);
        boolean equals = a5.equals(kotlin.jvm.internal.p.a(Float.TYPE));
        SharedPreferences sharedPreferences = c2203a.f24771a;
        if (equals) {
            obj = (Boolean) Float.valueOf(sharedPreferences.getFloat(j02, ((Float) obj).floatValue()));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Integer.TYPE))) {
            obj = (Boolean) Integer.valueOf(sharedPreferences.getInt(j02, ((Integer) obj).intValue()));
        } else if (a5.equals(kotlin.jvm.internal.p.a(Long.TYPE))) {
            obj = (Boolean) Long.valueOf(sharedPreferences.getLong(j02, ((Long) obj).longValue()));
        } else if (a5.equals(kotlin.jvm.internal.p.a(String.class))) {
            Object string = sharedPreferences.getString(j02, (String) obj);
            if (string != null) {
                obj = (Boolean) string;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
        } else if (a5.equals(kotlin.jvm.internal.p.a(Boolean.TYPE))) {
            obj = Boolean.valueOf(sharedPreferences.getBoolean(j02, true));
        } else {
            String string2 = sharedPreferences.getString(j02, "");
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
        return ((Boolean) obj).booleanValue();
    }
}
