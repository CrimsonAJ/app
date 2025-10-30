package d;

import android.os.Bundle;
import androidx.lifecycle.EnumC0554o;
import i0.AbstractActivityC1369y;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: d.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1063d implements N0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1369y f16562b;

    public /* synthetic */ C1063d(AbstractActivityC1369y abstractActivityC1369y, int i9) {
        this.f16561a = i9;
        this.f16562b = abstractActivityC1369y;
    }

    @Override // N0.e
    public final Bundle a() {
        switch (this.f16561a) {
            case 0:
                AbstractActivityC1369y abstractActivityC1369y = this.f16562b;
                Bundle bundle = new Bundle();
                C1065f c1065f = abstractActivityC1369y.f16595l;
                c1065f.getClass();
                HashMap hashMap = c1065f.f16566b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c1065f.f16568d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c1065f.f16571g.clone());
                return bundle;
            default:
                AbstractActivityC1369y abstractActivityC1369y2 = this.f16562b;
                do {
                } while (AbstractActivityC1369y.Q(abstractActivityC1369y2.P()));
                abstractActivityC1369y2.f18432u.o0(EnumC0554o.ON_STOP);
                return new Bundle();
        }
    }
}
