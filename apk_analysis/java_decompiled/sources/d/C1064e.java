package d;

import android.os.Bundle;
import e.InterfaceC1132a;
import i0.AbstractActivityC1369y;
import i0.C1368x;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: d.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1064e implements InterfaceC1132a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1369y f16564b;

    public /* synthetic */ C1064e(AbstractActivityC1369y abstractActivityC1369y, int i9) {
        this.f16563a = i9;
        this.f16564b = abstractActivityC1369y;
    }

    @Override // e.InterfaceC1132a
    public final void a() {
        switch (this.f16563a) {
            case 0:
                AbstractActivityC1369y abstractActivityC1369y = this.f16564b;
                Bundle c3 = ((N0.f) abstractActivityC1369y.f16589e.f15188c).c("android:support:activity-result");
                if (c3 != null) {
                    C1065f c1065f = abstractActivityC1369y.f16595l;
                    c1065f.getClass();
                    ArrayList<Integer> integerArrayList = c3.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c3.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        c1065f.f16568d = c3.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        Bundle bundle = c3.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = c1065f.f16571g;
                        bundle2.putAll(bundle);
                        for (int i9 = 0; i9 < stringArrayList.size(); i9++) {
                            String str = stringArrayList.get(i9);
                            HashMap hashMap = c1065f.f16566b;
                            boolean containsKey = hashMap.containsKey(str);
                            HashMap hashMap2 = c1065f.f16565a;
                            if (containsKey) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i9);
                            num2.intValue();
                            String str2 = stringArrayList.get(i9);
                            hashMap2.put(num2, str2);
                            hashMap.put(str2, num2);
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C1368x c1368x = (C1368x) this.f16564b.f18431t.f16512a;
                c1368x.f18429q.b(c1368x, c1368x, null);
                return;
        }
    }
}
