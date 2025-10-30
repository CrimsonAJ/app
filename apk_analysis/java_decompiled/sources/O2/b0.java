package O2;

import com.anilab.data.model.preference.RecentlyWatchedJson;
import y2.C2203a;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2203a f5365a;

    public b0(C2203a encryptedPreference) {
        kotlin.jvm.internal.h.e(encryptedPreference, "encryptedPreference");
        this.f5365a = encryptedPreference;
    }

    public final void a(H2.u uVar) {
        C2203a c2203a = this.f5365a;
        if (uVar == null) {
            O4.h.J(c2203a, null);
        } else {
            O4.h.J(c2203a, new RecentlyWatchedJson(uVar.f3065a, uVar.f3066b, uVar.f3067c, uVar.f3068d, uVar.f3069e, uVar.f3071g, uVar.f3072h));
        }
    }
}
