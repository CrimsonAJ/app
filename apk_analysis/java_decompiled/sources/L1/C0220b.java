package L1;

import android.content.Intent;
import com.anilab.android.ui.activity.MainActivity;
import f.C1148a;
import f5.AbstractC1176h;
import f5.InterfaceC1171c;
import java.util.List;

/* renamed from: L1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0220b implements InterfaceC1171c, f.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4515a;

    public /* synthetic */ C0220b(MainActivity mainActivity) {
        this.f4515a = mainActivity;
    }

    @Override // f5.InterfaceC1171c
    public void G(AbstractC1176h task) {
        MainActivity mainActivity = this.f4515a;
        int i9 = MainActivity.f13724k0;
        kotlin.jvm.internal.h.e(task, "task");
        try {
            if (task.j()) {
                if (W7.d.U(mainActivity.V().f4496i.a(""))) {
                    S V8 = mainActivity.V();
                    String uuid = s8.e.u(mainActivity);
                    kotlin.jvm.internal.h.e(uuid, "uuid");
                    V8.d(false, new O(V8, uuid, null));
                }
                S V9 = mainActivity.V();
                Object g9 = task.g();
                kotlin.jvm.internal.h.d(g9, "getResult(...)");
                V9.d(false, new L(V9, (String) g9, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override // f.b
    public void d(Object obj) {
        String str;
        String str2;
        C1148a c1148a = (C1148a) obj;
        int i9 = MainActivity.f13724k0;
        Intent intent = c1148a.f17225b;
        if (c1148a.f17224a == -1 && intent != null) {
            long longExtra = intent.getLongExtra("extra_id", -1L);
            long longExtra2 = intent.getLongExtra("extra_episode_id", -1L);
            long longExtra3 = intent.getLongExtra("extra_position_ms", 0L);
            String stringExtra = intent.getStringExtra("extra_name");
            if (stringExtra == null) {
                str = "";
            } else {
                str = stringExtra;
            }
            String stringExtra2 = intent.getStringExtra("extra_poster");
            if (stringExtra2 == null) {
                str2 = "";
            } else {
                str2 = stringExtra2;
            }
            int intExtra = intent.getIntExtra("extra_percent", 0);
            int intExtra2 = intent.getIntExtra("extra_year", 0);
            List stringArrayListExtra = intent.getStringArrayListExtra("extra_al_names");
            if (stringArrayListExtra == null) {
                stringArrayListExtra = B7.t.f1135a;
            }
            this.f4515a.V().g(new H2.u(longExtra, longExtra2, longExtra3, str, str2, intExtra, intExtra2, stringArrayListExtra));
        }
    }
}
