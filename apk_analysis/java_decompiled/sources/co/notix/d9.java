package co.notix;

import Y7.InterfaceC0484z;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import b8.AbstractC0714M;
import b8.InterfaceC0707F;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d9 implements y8, e9 {

    /* renamed from: a, reason: collision with root package name */
    public Context f12077a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0707F f12078b;

    public d9(InterfaceC0484z cs) {
        kotlin.jvm.internal.h.e(cs, "cs");
        this.f12078b = AbstractC0714M.c(new WeakHashMap());
    }

    public static Activity a(WeakHashMap weakHashMap, f fVar) {
        Object next;
        kotlin.jvm.internal.h.e(weakHashMap, "<this>");
        int size = weakHashMap.size();
        Iterable iterable = B7.t.f1135a;
        if (size != 0) {
            Iterator it = weakHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    iterable = B6.u0.D(new A7.h(entry.getKey(), entry.getValue()));
                } else {
                    ArrayList arrayList = new ArrayList(weakHashMap.size());
                    arrayList.add(new A7.h(entry.getKey(), entry.getValue()));
                    do {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        arrayList.add(new A7.h(entry2.getKey(), entry2.getValue()));
                    } while (it.hasNext());
                    iterable = arrayList;
                }
            }
        }
        Iterator it2 = iterable.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                f fVar2 = (f) ((A7.h) next).f548b;
                do {
                    Object next2 = it2.next();
                    f fVar3 = (f) ((A7.h) next2).f548b;
                    if (fVar2.compareTo(fVar3) < 0) {
                        next = next2;
                        fVar2 = fVar3;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        A7.h hVar = (A7.h) next;
        if (hVar != null) {
            if (((f) hVar.f548b).compareTo(fVar) < 0) {
                hVar = null;
            }
            if (hVar != null) {
                return (Activity) hVar.f547a;
            }
        }
        return null;
    }

    public final Context a() {
        Context context = this.f12077a;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.h.h("appContext");
        throw null;
    }

    public final void a(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        if (this.f12077a != null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.h.d(applicationContext, "context.applicationContext");
        this.f12077a = applicationContext;
        Context a5 = a();
        kotlin.jvm.internal.h.c(a5, "null cannot be cast to non-null type android.app.Application");
        ((Application) a5).registerActivityLifecycleCallbacks(new c(new c9(this)));
    }
}
