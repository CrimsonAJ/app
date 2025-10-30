package G0;

import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: G0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145k {

    /* renamed from: a, reason: collision with root package name */
    public final E f2771a;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f2772b;

    /* renamed from: c, reason: collision with root package name */
    public final X f2773c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f2774d;

    /* renamed from: e, reason: collision with root package name */
    public final ReentrantLock f2775e;

    /* renamed from: f, reason: collision with root package name */
    public final C0141g f2776f;

    /* renamed from: g, reason: collision with root package name */
    public final C0141g f2777g;

    /* renamed from: h, reason: collision with root package name */
    public Intent f2778h;

    /* renamed from: i, reason: collision with root package name */
    public C0149o f2779i;
    public final Object j;

    public C0145k(E e8, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.f2771a = e8;
        this.f2772b = strArr;
        X x5 = new X(e8, hashMap, hashMap2, strArr, e8.j, new C0142h(1, this, C0145k.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0));
        this.f2773c = x5;
        this.f2774d = new LinkedHashMap();
        this.f2775e = new ReentrantLock();
        this.f2776f = new C0141g(this, 0);
        this.f2777g = new C0141g(this, 1);
        kotlin.jvm.internal.h.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.j = new Object();
        x5.f2738k = new C0141g(this, 2);
    }
}
