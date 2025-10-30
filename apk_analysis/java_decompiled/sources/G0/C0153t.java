package G0;

import java.util.Collections;
import java.util.Set;

/* renamed from: G0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153t {

    /* renamed from: a, reason: collision with root package name */
    public final A1.g f2805a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2806b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f2807c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f2808d;

    public C0153t(A1.g observer, int[] iArr, String[] strArr) {
        Set singleton;
        kotlin.jvm.internal.h.e(observer, "observer");
        this.f2805a = observer;
        this.f2806b = iArr;
        this.f2807c = strArr;
        if (iArr.length == strArr.length) {
            if (strArr.length == 0) {
                singleton = B7.v.f1137a;
            } else {
                singleton = Collections.singleton(strArr[0]);
                kotlin.jvm.internal.h.d(singleton, "singleton(...)");
            }
            this.f2808d = singleton;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
