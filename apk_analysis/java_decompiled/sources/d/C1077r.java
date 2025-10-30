package d;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: d.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1077r {

    /* renamed from: a, reason: collision with root package name */
    public static final C1077r f16615a = new Object();

    public final OnBackInvokedCallback a(O7.a onBackInvoked) {
        kotlin.jvm.internal.h.e(onBackInvoked, "onBackInvoked");
        return new C1076q(0, onBackInvoked);
    }

    public final void b(Object dispatcher, int i9, Object callback) {
        kotlin.jvm.internal.h.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.h.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i9, (OnBackInvokedCallback) callback);
    }

    public final void c(Object dispatcher, Object callback) {
        kotlin.jvm.internal.h.e(dispatcher, "dispatcher");
        kotlin.jvm.internal.h.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
