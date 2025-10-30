package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
import p0.C1835a;

/* loaded from: classes.dex */
public class u extends t {
    /* JADX WARN: Type inference failed for: r1v0, types: [p0.a, java.lang.Object] */
    @Override // android.support.v4.media.session.t
    public final C1835a c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo;
        String packageName;
        String packageName2;
        int pid;
        int uid;
        currentControllerInfo = this.f9318a.getCurrentControllerInfo();
        ?? obj = new Object();
        packageName = currentControllerInfo.getPackageName();
        if (packageName != null) {
            if (!TextUtils.isEmpty(packageName)) {
                packageName2 = currentControllerInfo.getPackageName();
                pid = currentControllerInfo.getPid();
                uid = currentControllerInfo.getUid();
                obj.f22101a = new p0.d(packageName2, pid, uid);
                return obj;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    @Override // android.support.v4.media.session.t
    public final void f(C1835a c1835a) {
    }
}
