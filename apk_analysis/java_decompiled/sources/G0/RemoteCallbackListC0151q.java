package G0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: G0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RemoteCallbackListC0151q extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f2799a;

    public RemoteCallbackListC0151q(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f2799a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        InterfaceC0138d callback = (InterfaceC0138d) iInterface;
        kotlin.jvm.internal.h.e(callback, "callback");
        kotlin.jvm.internal.h.e(cookie, "cookie");
        this.f2799a.f10352b.remove((Integer) cookie);
    }
}
