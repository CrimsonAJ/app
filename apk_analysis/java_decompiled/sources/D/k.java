package D;

import android.app.Notification;
import l1.C1535g;

/* loaded from: classes.dex */
public final class k extends n {

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f1683b;

    @Override // D.n
    public final void W(C1535g c1535g) {
        new Notification.BigTextStyle((Notification.Builder) c1535g.f20183b).setBigContentTitle(null).bigText(this.f1683b);
    }

    @Override // D.n
    public final String Y() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
