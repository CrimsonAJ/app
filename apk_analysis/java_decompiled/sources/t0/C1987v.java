package t0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: t0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1987v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23043a = 1;

    /* renamed from: b, reason: collision with root package name */
    public List f23044b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23045c;

    public /* synthetic */ C1987v() {
    }

    public static C1987v a(Bundle bundle) {
        C1980n c1980n;
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i9 = 0; i9 < parcelableArrayList.size(); i9++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i9);
                if (bundle2 != null) {
                    c1980n = new C1980n(bundle2);
                } else {
                    c1980n = null;
                }
                arrayList.add(c1980n);
            }
        }
        return new C1987v(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public String toString() {
        switch (this.f23043a) {
            case 0:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = this.f23044b;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z9 = false;
                int i9 = 0;
                while (true) {
                    if (i9 < size) {
                        C1980n c1980n = (C1980n) list.get(i9);
                        if (c1980n != null && c1980n.e()) {
                            i9++;
                        }
                    } else {
                        z9 = true;
                    }
                }
                sb.append(z9);
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C1987v(ArrayList arrayList, boolean z9) {
        if (arrayList.isEmpty()) {
            this.f23044b = Collections.EMPTY_LIST;
        } else {
            this.f23044b = Collections.unmodifiableList(new ArrayList(arrayList));
        }
        this.f23045c = z9;
    }
}
