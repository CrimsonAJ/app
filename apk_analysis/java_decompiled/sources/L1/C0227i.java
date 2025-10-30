package L1;

import co.notix.R;
import com.anilab.android.ui.activity.MainActivity;

/* renamed from: L1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4527a;

    public C0227i(MainActivity mainActivity) {
        this.f4527a = mainActivity;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        Exception it = (Exception) obj;
        kotlin.jvm.internal.h.e(it, "it");
        M1.D d9 = new M1.D(R.string.msg_unknown_error);
        MainActivity mainActivity = this.f4527a;
        int i9 = MainActivity.f13724k0;
        mainActivity.Z(d9);
        return A7.n.f558a;
    }
}
