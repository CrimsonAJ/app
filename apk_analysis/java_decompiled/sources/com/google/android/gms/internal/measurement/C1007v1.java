package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.measurement.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1007v1 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15622b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1007v1(int i9, Object obj) {
        super(null);
        this.f15621a = i9;
        this.f15622b = obj;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z9) {
        switch (this.f15621a) {
            case 0:
                ((AtomicBoolean) ((E6.e) this.f15622b).f1967a).set(true);
                return;
            default:
                C1027z1 c1027z1 = (C1027z1) this.f15622b;
                synchronized (c1027z1.f15707e) {
                    c1027z1.f15708f = null;
                    c1027z1.f15705c.run();
                }
                synchronized (c1027z1) {
                    try {
                        Iterator it = c1027z1.f15709g.iterator();
                        if (it.hasNext()) {
                            if (it.next() == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
