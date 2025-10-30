package e1;

import android.app.Notification;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f17053a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17054b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f17055c;

    public j(int i9, Notification notification, int i10) {
        this.f17053a = i9;
        this.f17055c = notification;
        this.f17054b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f17053a != jVar.f17053a || this.f17054b != jVar.f17054b) {
            return false;
        }
        return this.f17055c.equals(jVar.f17055c);
    }

    public final int hashCode() {
        return this.f17055c.hashCode() + (((this.f17053a * 31) + this.f17054b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f17053a + ", mForegroundServiceType=" + this.f17054b + ", mNotification=" + this.f17055c + '}';
    }
}
