package t0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: t0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1988w {

    /* renamed from: c, reason: collision with root package name */
    public static final C1988w f23046c = new C1988w(new Bundle(), null);

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f23047a;

    /* renamed from: b, reason: collision with root package name */
    public List f23048b;

    public C1988w(Bundle bundle, ArrayList arrayList) {
        this.f23047a = bundle;
        this.f23048b = arrayList;
    }

    public static C1988w b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new C1988w(bundle, null);
    }

    public final void a() {
        if (this.f23048b == null) {
            ArrayList<String> stringArrayList = this.f23047a.getStringArrayList("controlCategories");
            this.f23048b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f23048b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f23048b);
    }

    public final boolean d() {
        a();
        return this.f23048b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1988w) {
            C1988w c1988w = (C1988w) obj;
            a();
            c1988w.a();
            return this.f23048b.equals(c1988w.f23048b);
        }
        return false;
    }

    public final int hashCode() {
        a();
        return this.f23048b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
