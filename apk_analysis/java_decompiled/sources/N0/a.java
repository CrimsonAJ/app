package N0;

import android.os.Bundle;
import i.AbstractActivityC1322h;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4814a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4815b;

    public a(f registry) {
        h.e(registry, "registry");
        this.f4815b = new LinkedHashSet();
        registry.f("androidx.savedstate.Restarter", this);
    }

    @Override // N0.e
    public final Bundle a() {
        switch (this.f4814a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f4815b));
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                ((AbstractActivityC1322h) this.f4815b).R().getClass();
                return bundle2;
        }
    }

    public a(AbstractActivityC1322h abstractActivityC1322h) {
        this.f4815b = abstractActivityC1322h;
    }
}
