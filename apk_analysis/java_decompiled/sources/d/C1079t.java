package d;

import android.window.OnBackInvokedCallback;

/* renamed from: d.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1079t {

    /* renamed from: a, reason: collision with root package name */
    public static final C1079t f16620a = new Object();

    public final OnBackInvokedCallback a(O7.l onBackStarted, O7.l onBackProgressed, O7.a onBackInvoked, O7.a onBackCancelled) {
        kotlin.jvm.internal.h.e(onBackStarted, "onBackStarted");
        kotlin.jvm.internal.h.e(onBackProgressed, "onBackProgressed");
        kotlin.jvm.internal.h.e(onBackInvoked, "onBackInvoked");
        kotlin.jvm.internal.h.e(onBackCancelled, "onBackCancelled");
        return new C1078s(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
