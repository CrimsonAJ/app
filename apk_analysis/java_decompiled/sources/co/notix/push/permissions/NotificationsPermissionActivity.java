package co.notix.push.permissions;

import android.app.Activity;
import android.os.Bundle;
import co.notix.lf;
import co.notix.wq;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class NotificationsPermissionActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public final lf f13002a = wq.o();

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13002a.getClass();
        lf.a(this);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f13002a.c();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i9, String[] permissions, int[] grantResults) {
        h.e(permissions, "permissions");
        h.e(grantResults, "grantResults");
        super.onRequestPermissionsResult(i9, permissions, grantResults);
        if (i9 == 71283) {
            this.f13002a.c();
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        this.f13002a.c();
    }
}
