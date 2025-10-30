package androidx.lifecycle;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.fragment.NavHostFragment;
import i0.AbstractC1336M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import u0.C2042m;
import u0.C2043n;

/* loaded from: classes.dex */
public final /* synthetic */ class T implements N0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9839b;

    public /* synthetic */ T(int i9, Object obj) {
        this.f9838a = i9;
        this.f9839b = obj;
    }

    @Override // N0.e
    public final Bundle a() {
        Bundle bundle;
        Object obj = this.f9839b;
        switch (this.f9838a) {
            case 0:
                return V.a((V) obj);
            case 1:
                return ((AbstractC1336M) obj).V();
            case 2:
                u0.H h7 = (u0.H) obj;
                ArrayList<String> arrayList = new ArrayList<>();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : B7.y.H(h7.f23413u.f23462a).entrySet()) {
                    String str = (String) entry.getKey();
                    Bundle h9 = ((u0.V) entry.getValue()).h();
                    if (h9 != null) {
                        arrayList.add(str);
                        bundle2.putBundle(str, h9);
                    }
                }
                if (!arrayList.isEmpty()) {
                    bundle = new Bundle();
                    bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
                } else {
                    bundle = null;
                }
                B7.i iVar = h7.f23400g;
                if (!iVar.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Parcelable[] parcelableArr = new Parcelable[iVar.f1131c];
                    Iterator<E> it = iVar.iterator();
                    int i9 = 0;
                    while (it.hasNext()) {
                        parcelableArr[i9] = new C2043n((C2042m) it.next());
                        i9++;
                    }
                    bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
                }
                LinkedHashMap linkedHashMap = h7.f23404l;
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    int[] iArr = new int[linkedHashMap.size()];
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    int i10 = 0;
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        int intValue = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        iArr[i10] = intValue;
                        arrayList2.add(str2);
                        i10++;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
                }
                LinkedHashMap linkedHashMap2 = h7.f23405m;
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        B7.i iVar2 = (B7.i) entry3.getValue();
                        arrayList3.add(str3);
                        Parcelable[] parcelableArr2 = new Parcelable[iVar2.f1131c];
                        Iterator it2 = iVar2.iterator();
                        int i11 = 0;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i12 = i11 + 1;
                            if (i11 >= 0) {
                                parcelableArr2[i11] = (C2043n) next;
                                i11 = i12;
                            } else {
                                B7.l.e0();
                                throw null;
                            }
                        }
                        bundle.putParcelableArray(u0.z.e("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
                    }
                    bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
                }
                if (h7.f23399f) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", h7.f23399f);
                }
                if (bundle == null) {
                    Bundle EMPTY = Bundle.EMPTY;
                    kotlin.jvm.internal.h.d(EMPTY, "EMPTY");
                    return EMPTY;
                }
                return bundle;
            default:
                NavHostFragment this$0 = (NavHostFragment) obj;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                int i13 = this$0.f10204x0;
                if (i13 != 0) {
                    return Z0.a.c(new A7.h("android-support-nav:fragment:graphId", Integer.valueOf(i13)));
                }
                Bundle bundle3 = Bundle.EMPTY;
                kotlin.jvm.internal.h.d(bundle3, "{\n                    Bu…e.EMPTY\n                }");
                return bundle3;
        }
    }
}
