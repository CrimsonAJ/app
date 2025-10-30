package m1;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1584b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Notification f20675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20676c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f20677d;

    public RunnableC1584b(SystemForegroundService systemForegroundService, int i9, Notification notification, int i10) {
        this.f20677d = systemForegroundService;
        this.f20674a = i9;
        this.f20675b = notification;
        this.f20676c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = Build.VERSION.SDK_INT;
        Notification notification = this.f20675b;
        int i10 = this.f20674a;
        SystemForegroundService systemForegroundService = this.f20677d;
        if (i9 >= 29) {
            systemForegroundService.startForeground(i10, notification, this.f20676c);
        } else {
            systemForegroundService.startForeground(i10, notification);
        }
    }
}
