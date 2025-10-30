package t0;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f22905a;

    public T(U u9) {
        this.f22905a = u9;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        U u9 = this.f22905a;
        u9.f22908h = string;
        u9.f22909i = bundle.getString("transferableTitle");
    }
}
