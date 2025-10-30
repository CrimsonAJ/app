package androidx.profileinstaller;

import A6.r;
import D0.g;
import F5.e;
import T0.b;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // T0.b
    public final Object create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new e(4);
        }
        g.a(new r(this, 1, context.getApplicationContext()));
        return new e(4);
    }

    @Override // T0.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
