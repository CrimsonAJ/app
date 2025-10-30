package t0;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: t0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1965A {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1984s f22826a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22827b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22828c;

    /* renamed from: d, reason: collision with root package name */
    public final C f22829d;

    /* renamed from: e, reason: collision with root package name */
    public final C f22830e;

    /* renamed from: f, reason: collision with root package name */
    public final C f22831f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f22832g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakReference f22833h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22834i = false;
    public boolean j = false;

    public C1965A(C1971e c1971e, C c3, AbstractC1984s abstractC1984s, int i9, boolean z9, C c9, ArrayList arrayList) {
        ArrayList arrayList2;
        this.f22833h = new WeakReference(c1971e);
        this.f22830e = c3;
        this.f22826a = abstractC1984s;
        this.f22827b = i9;
        this.f22828c = z9;
        this.f22829d = c1971e.f22966d;
        this.f22831f = c9;
        if (arrayList == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(arrayList);
        }
        this.f22832g = arrayList2;
        c1971e.f22963a.postDelayed(new RunnableC1967a(2, this), 15000L);
    }

    public final void a() {
        C1991z a5;
        D.b();
        if (!this.f22834i && !this.j) {
            WeakReference weakReference = this.f22833h;
            C1971e c1971e = (C1971e) weakReference.get();
            AbstractC1984s abstractC1984s = this.f22826a;
            if (c1971e != null && c1971e.f22968f == this) {
                this.f22834i = true;
                c1971e.f22968f = null;
                C1971e c1971e2 = (C1971e) weakReference.get();
                int i9 = this.f22827b;
                C c3 = this.f22829d;
                if (c1971e2 != null && c1971e2.f22966d == c3) {
                    Message obtainMessage = c1971e2.f22963a.obtainMessage(263, c3);
                    obtainMessage.arg1 = i9;
                    obtainMessage.sendToTarget();
                    AbstractC1984s abstractC1984s2 = c1971e2.f22967e;
                    if (abstractC1984s2 != null) {
                        abstractC1984s2.h(i9);
                        c1971e2.f22967e.d();
                    }
                    HashMap hashMap = c1971e2.f22964b;
                    if (!hashMap.isEmpty()) {
                        for (AbstractC1984s abstractC1984s3 : hashMap.values()) {
                            abstractC1984s3.h(i9);
                            abstractC1984s3.d();
                        }
                        hashMap.clear();
                    }
                    c1971e2.f22967e = null;
                }
                C1971e c1971e3 = (C1971e) weakReference.get();
                if (c1971e3 != null) {
                    C c9 = this.f22830e;
                    c1971e3.f22966d = c9;
                    c1971e3.f22967e = abstractC1984s;
                    boolean z9 = this.f22828c;
                    HandlerC1968b handlerC1968b = c1971e3.f22963a;
                    C c10 = this.f22831f;
                    if (c10 == null) {
                        handlerC1968b.getClass();
                        Message obtainMessage2 = handlerC1968b.obtainMessage(262, new C1970d(c3, c9, z9));
                        obtainMessage2.arg1 = i9;
                        obtainMessage2.sendToTarget();
                    } else {
                        handlerC1968b.getClass();
                        Message obtainMessage3 = handlerC1968b.obtainMessage(264, new C1970d(c10, c9, z9));
                        obtainMessage3.arg1 = i9;
                        obtainMessage3.sendToTarget();
                    }
                    c1971e3.f22964b.clear();
                    c1971e3.i();
                    c1971e3.m();
                    ArrayList arrayList = this.f22832g;
                    if (arrayList != null && (a5 = c1971e3.f22966d.a()) != null) {
                        a5.p(arrayList);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.f22834i && !this.j) {
                this.j = true;
                if (abstractC1984s != null) {
                    abstractC1984s.h(0);
                    abstractC1984s.d();
                }
            }
        }
    }
}
