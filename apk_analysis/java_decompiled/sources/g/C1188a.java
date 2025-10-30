package g;

import B7.j;
import B7.m;
import B7.y;
import E.d;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.u;
import f.C1148a;
import i0.AbstractActivityC1369y;
import i0.AbstractC1336M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.h;
import v4.e;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1188a extends e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17488h;

    public /* synthetic */ C1188a(int i9) {
        this.f17488h = i9;
    }

    @Override // v4.e
    public u B(AbstractActivityC1369y abstractActivityC1369y, Object obj) {
        switch (this.f17488h) {
            case 0:
                String[] input = (String[]) obj;
                h.e(input, "input");
                if (input.length == 0) {
                    return new u(B7.u.f1136a);
                }
                for (String str : input) {
                    if (d.a(abstractActivityC1369y, str) != 0) {
                        return null;
                    }
                }
                int D8 = y.D(input.length);
                if (D8 < 16) {
                    D8 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(D8);
                for (String str2 : input) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new u(linkedHashMap);
            case 1:
                String input2 = (String) obj;
                h.e(input2, "input");
                if (d.a(abstractActivityC1369y, input2) == 0) {
                    return new u(Boolean.TRUE);
                }
                return null;
            default:
                return super.B(abstractActivityC1369y, obj);
        }
    }

    @Override // v4.e
    public final Object K(Intent intent, int i9) {
        boolean z9;
        switch (this.f17488h) {
            case 0:
                B7.u uVar = B7.u.f1136a;
                if (i9 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i10 : intArrayExtra) {
                            if (i10 == 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            arrayList.add(Boolean.valueOf(z9));
                        }
                        ArrayList k02 = j.k0(stringArrayExtra);
                        Iterator it = k02.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(m.f0(k02, 10), m.f0(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new A7.h(it.next(), it2.next()));
                        }
                        return y.G(arrayList2);
                    }
                    return uVar;
                }
                return uVar;
            case 1:
                if (intent != null && i9 == -1) {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z10 = false;
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                if (intArrayExtra2[i11] == 0) {
                                    z10 = true;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z10);
                }
                return Boolean.FALSE;
            case 2:
                return new C1148a(intent, i9);
            default:
                return new C1148a(intent, i9);
        }
    }

    @Override // v4.e
    public final Intent h(AbstractActivityC1369y abstractActivityC1369y, Object obj) {
        Bundle bundleExtra;
        switch (this.f17488h) {
            case 0:
                String[] input = (String[]) obj;
                h.e(input, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
                h.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            case 1:
                String input2 = (String) obj;
                h.e(input2, "input");
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{input2});
                h.d(putExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra2;
            case 2:
                Intent input3 = (Intent) obj;
                h.e(input3, "input");
                return input3;
            default:
                f.h hVar = (f.h) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = hVar.f17239b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        hVar = new f.h(hVar.f17238a, null, hVar.f17240c, hVar.f17241d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
                if (AbstractC1336M.H(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
        }
    }
}
