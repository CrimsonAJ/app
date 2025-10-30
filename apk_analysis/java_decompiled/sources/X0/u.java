package X0;

import android.view.View;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public final View f8227b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8226a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8228c = new ArrayList();

    public u(View view) {
        this.f8227b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f8227b == uVar.f8227b && this.f8226a.equals(uVar.f8226a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8226a.hashCode() + (this.f8227b.hashCode() * 31);
    }

    public final String toString() {
        String n7 = AbstractC0953k1.n(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f8227b + "\n", "    values:");
        HashMap hashMap = this.f8226a;
        for (String str : hashMap.keySet()) {
            n7 = n7 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return n7;
    }
}
