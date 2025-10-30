package L2;

import android.content.SharedPreferences;
import y2.C2203a;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final C2203a f4586a;

    public G(C2203a encryptedPreference) {
        kotlin.jvm.internal.h.e(encryptedPreference, "encryptedPreference");
        this.f4586a = encryptedPreference;
    }

    public final String a(String str) {
        boolean U8 = W7.d.U(str);
        C2203a c2203a = this.f4586a;
        if (!U8) {
            kotlin.jvm.internal.h.e(c2203a, "<this>");
            String T8 = g6.o.f17761a.T();
            SharedPreferences.Editor edit = c2203a.f24771a.edit();
            edit.putString(T8, str);
            edit.apply();
            return str;
        }
        return O4.h.v(c2203a);
    }
}
