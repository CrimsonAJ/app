package G0;

import Y7.InterfaceC0484z;
import a8.EnumC0509a;
import android.content.Context;
import android.content.Intent;
import b8.AbstractC0714M;
import b8.C0713L;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: G0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149o {

    /* renamed from: a, reason: collision with root package name */
    public final String f2787a;

    /* renamed from: b, reason: collision with root package name */
    public final C0145k f2788b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2789c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0484z f2790d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f2791e;

    /* renamed from: f, reason: collision with root package name */
    public int f2792f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0140f f2793g;

    /* renamed from: h, reason: collision with root package name */
    public final C0713L f2794h;

    /* renamed from: i, reason: collision with root package name */
    public final A1.g f2795i;
    public final BinderC0147m j;

    /* renamed from: k, reason: collision with root package name */
    public final ServiceConnectionC0148n f2796k;

    public C0149o(Context context, String name, C0145k c0145k) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(name, "name");
        this.f2787a = name;
        this.f2788b = c0145k;
        this.f2789c = context.getApplicationContext();
        d8.e eVar = c0145k.f2771a.f2642a;
        if (eVar != null) {
            this.f2790d = eVar;
            this.f2791e = new AtomicBoolean(true);
            this.f2794h = AbstractC0714M.a(0, EnumC0509a.f9184a);
            this.f2795i = new A1.g(this, c0145k.f2772b, 21, false);
            this.j = new BinderC0147m(this);
            this.f2796k = new ServiceConnectionC0148n(0, this);
            return;
        }
        kotlin.jvm.internal.h.h("coroutineScope");
        throw null;
    }

    public final void a(Intent serviceIntent) {
        C0153t c0153t;
        kotlin.jvm.internal.h.e(serviceIntent, "serviceIntent");
        if (this.f2791e.compareAndSet(true, false)) {
            this.f2789c.bindService(serviceIntent, this.f2796k, 1);
            C0145k c0145k = this.f2788b;
            A1.g observer = this.f2795i;
            kotlin.jvm.internal.h.e(observer, "observer");
            X x5 = c0145k.f2773c;
            x5.getClass();
            String[] strArr = (String[]) observer.f18b;
            C7.j jVar = new C7.j();
            for (String str : strArr) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
                Set set = (Set) x5.f2731c.get(lowerCase);
                if (set != null) {
                    jVar.addAll(set);
                } else {
                    jVar.add(str);
                }
            }
            String[] strArr2 = (String[]) O4.h.e(jVar).toArray(new String[0]);
            int length = strArr2.length;
            int[] iArr = new int[length];
            for (int i9 = 0; i9 < length; i9++) {
                String str2 = strArr2[i9];
                LinkedHashMap linkedHashMap = x5.f2734f;
                String lowerCase2 = str2.toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.h.d(lowerCase2, "toLowerCase(...)");
                Integer num = (Integer) linkedHashMap.get(lowerCase2);
                if (num != null) {
                    iArr[i9] = num.intValue();
                } else {
                    throw new IllegalArgumentException("There is no table with name ".concat(str2));
                }
            }
            C0153t c0153t2 = new C0153t(observer, iArr, strArr2);
            ReentrantLock reentrantLock = c0145k.f2775e;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap2 = c0145k.f2774d;
            try {
                if (linkedHashMap2.containsKey(observer)) {
                    c0153t = (C0153t) B7.y.C(linkedHashMap2, observer);
                } else {
                    c0153t = (C0153t) linkedHashMap2.put(observer, c0153t2);
                }
                reentrantLock.unlock();
                if (c0153t == null) {
                    A6.t tVar = x5.f2736h;
                    tVar.getClass();
                    ReentrantLock reentrantLock2 = (ReentrantLock) tVar.f540b;
                    reentrantLock2.lock();
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            int i11 = iArr[i10];
                            long[] jArr = (long[]) tVar.f541c;
                            long j = jArr[i11];
                            jArr[i11] = 1 + j;
                            if (j == 0) {
                                tVar.f539a = true;
                            }
                        } finally {
                            reentrantLock2.unlock();
                        }
                    }
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }
}
