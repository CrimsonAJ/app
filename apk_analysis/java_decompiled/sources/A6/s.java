package A6;

import B6.u0;
import C3.v;
import J1.AbstractC0172e0;
import Q2.AbstractC0364g;
import Q2.D;
import R1.C;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.lifecycle.C0563y;
import androidx.lifecycle.EnumC0554o;
import androidx.lifecycle.J;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import d.DialogC1072m;
import d.ExecutorC1070k;
import i0.AbstractActivityC1369y;
import i0.AbstractComponentCallbacksC1366v;
import j3.SurfaceHolderCallbackC1438A;
import j3.z0;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import k3.C1486b;
import k3.C1489e;
import n3.C1625b;
import n3.C1627d;
import n3.InterfaceC1632i;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f538b;

    public /* synthetic */ s(int i9, Object obj) {
        this.f537a = i9;
        this.f538b = obj;
    }

    private final void a() {
        C3.h hVar = (C3.h) this.f538b;
        synchronized (hVar.f1456a) {
            try {
                if (hVar.f1466l) {
                    return;
                }
                long j = hVar.f1465k - 1;
                hVar.f1465k = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    hVar.b(new IllegalStateException());
                } else {
                    hVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        Y2.r rVar = (Y2.r) this.f538b;
        synchronized (((ArrayDeque) rVar.f8650d)) {
            SharedPreferences.Editor edit = ((SharedPreferences) rVar.f8647a).edit();
            String str = (String) rVar.f8648b;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) rVar.f8650d).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) rVar.f8649c);
            }
            edit.putString(str, sb.toString()).commit();
        }
    }

    private final void c() {
        d0.p pVar = (d0.p) this.f538b;
        synchronized (pVar.f16665d) {
            try {
                if (pVar.f16669h == null) {
                    return;
                }
                try {
                    M.i d9 = pVar.d();
                    int i9 = d9.f4673e;
                    if (i9 == 2) {
                        synchronized (pVar.f16665d) {
                        }
                    }
                    if (i9 == 0) {
                        try {
                            Method method = L.k.f4453b;
                            Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            d0.o oVar = pVar.f16664c;
                            Context context = pVar.f16662a;
                            oVar.getClass();
                            M.i[] iVarArr = {d9};
                            M4.a aVar = H.f.f2921a;
                            u0.d("TypefaceCompat.createFromFontInfo");
                            try {
                                Typeface e8 = H.f.f2921a.e(context, iVarArr, 0);
                                Trace.endSection();
                                MappedByteBuffer C8 = O4.h.C(pVar.f16662a, d9.f4669a);
                                if (C8 != null && e8 != null) {
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(e8, AbstractC1002u1.W(C8));
                                        Trace.endSection();
                                        synchronized (pVar.f16665d) {
                                            try {
                                                Z0.a aVar2 = pVar.f16669h;
                                                if (aVar2 != null) {
                                                    aVar2.t(sVar);
                                                }
                                            } finally {
                                            }
                                        }
                                        pVar.b();
                                        return;
                                    } finally {
                                        Method method2 = L.k.f4453b;
                                    }
                                }
                                throw new RuntimeException("Unable to open file.");
                            } finally {
                                Trace.endSection();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + i9 + ")");
                } catch (Throwable th2) {
                    synchronized (pVar.f16665d) {
                        try {
                            Z0.a aVar3 = pVar.f16669h;
                            if (aVar3 != null) {
                                aVar3.s(th2);
                            }
                            pVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        Object obj;
        boolean z10;
        int i9 = 3;
        int i10 = 27;
        int i11 = 4;
        Map map = null;
        switch (this.f537a) {
            case 0:
                t tVar = (t) this.f538b;
                ((AtomicReference) tVar.f541c).set(null);
                synchronized (tVar) {
                    try {
                        if (((AtomicMarkableReference) tVar.f540b).isMarked()) {
                            map = ((e) ((AtomicMarkableReference) tVar.f540b).getReference()).a();
                            AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) tVar.f540b;
                            atomicMarkableReference.set((e) atomicMarkableReference.getReference(), false);
                        }
                    } finally {
                    }
                }
                if (map != null) {
                    E6.e eVar = (E6.e) tVar.f542d;
                    ((h) eVar.f1968b).h((String) eVar.f1967a, map, tVar.f539a);
                    return;
                }
                return;
            case 1:
                a();
                return;
            case 2:
                Activity activity = (Activity) this.f538b;
                if (!activity.isFinishing()) {
                    int i12 = Build.VERSION.SDK_INT;
                    if (i12 >= 28) {
                        Class cls = D.b.f1662a;
                        activity.recreate();
                        return;
                    }
                    Class cls2 = D.b.f1662a;
                    if (i12 != 26 && i12 != 27) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    Method method = D.b.f1667f;
                    if ((!z9 || method != null) && (D.b.f1666e != null || D.b.f1665d != null)) {
                        try {
                            Object obj2 = D.b.f1664c.get(activity);
                            if (obj2 != null && (obj = D.b.f1663b.get(activity)) != null) {
                                Application application = activity.getApplication();
                                D.a aVar = new D.a(activity);
                                application.registerActivityLifecycleCallbacks(aVar);
                                Handler handler = D.b.f1668g;
                                handler.post(new S5.o(aVar, i9, obj2));
                                if (i12 != 26 && i12 != 27) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                try {
                                    if (z10) {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } else {
                                        activity.recreate();
                                    }
                                    handler.post(new S5.o(application, i11, aVar));
                                    return;
                                } finally {
                                    handler.post(new S5.o(application, i11, aVar));
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    activity.recreate();
                    return;
                }
                return;
            case 3:
                D4.n nVar = (D4.n) this.f538b;
                nVar.f1862c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) nVar.f1861b;
                V.d dVar = sideSheetBehavior.f16099i;
                if (dVar != null && dVar.f()) {
                    nVar.h(nVar.f1863d);
                    return;
                } else {
                    if (sideSheetBehavior.f16098h == 2) {
                        sideSheetBehavior.x(nVar.f1863d);
                        return;
                    }
                    return;
                }
            case 4:
                ((K5.e) this.f538b).t(true);
                return;
            case 5:
                K5.l lVar = (K5.l) this.f538b;
                boolean isPopupShowing = lVar.f4339h.isPopupShowing();
                lVar.t(isPopupShowing);
                lVar.f4343m = isPopupShowing;
                return;
            case 6:
                ((TextInputLayout) this.f538b).f16203d.requestLayout();
                return;
            case 7:
                ((AbstractC0364g) this.f538b).d(false);
                return;
            case 8:
                ((D) this.f538b).n();
                return;
            case 9:
                C c3 = (C) this.f538b;
                c3.f6509g.invoke();
                List list = c3.f2039d.f2100f;
                kotlin.jvm.internal.h.d(list, "getCurrentList(...)");
                if (!list.isEmpty()) {
                    c3.e(0);
                    return;
                }
                return;
            case R.styleable.GradientColor_android_endX /* 10 */:
                ((s4.i) this.f538b).P();
                return;
            case R.styleable.GradientColor_android_endY /* 11 */:
                ((HandlerThread) this.f538b).quit();
                return;
            case 12:
                ((W3.c) this.f538b).w();
                return;
            case 13:
                J this$0 = (J) this.f538b;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                int i13 = this$0.f9802b;
                C0563y c0563y = this$0.f9806f;
                if (i13 == 0) {
                    this$0.f9803c = true;
                    c0563y.o0(EnumC0554o.ON_PAUSE);
                }
                if (this$0.f9801a == 0 && this$0.f9803c) {
                    c0563y.o0(EnumC0554o.ON_STOP);
                    this$0.f9804d = true;
                    return;
                }
                return;
            case 14:
                ((com.google.android.material.timepicker.e) this.f538b).f();
                return;
            case 15:
                b();
                return;
            case 16:
                StringBuilder sb = new StringBuilder("Service took too long to process intent: ");
                com.google.firebase.messaging.D d9 = (com.google.firebase.messaging.D) this.f538b;
                sb.append(d9.f16431a.getAction());
                sb.append(" finishing.");
                Log.w("FirebaseMessaging", sb.toString());
                d9.f16432b.d(null);
                return;
            case 17:
                ((AbstractActivityC1369y) this.f538b).invalidateOptionsMenu();
                return;
            case 18:
                ExecutorC1070k executorC1070k = (ExecutorC1070k) this.f538b;
                Runnable runnable = executorC1070k.f16583b;
                if (runnable != null) {
                    runnable.run();
                    executorC1070k.f16583b = null;
                    return;
                }
                return;
            case 19:
                DialogC1072m.a((DialogC1072m) this.f538b);
                return;
            case 20:
                c();
                return;
            case 21:
                ((AbstractC0172e0) this.f538b).f3901M.setSelected(true);
                return;
            case 22:
                e3.l lVar2 = (e3.l) this.f538b;
                lVar2.getClass();
                ((f3.h) lVar2.f17190d).F(new v(i10, lVar2));
                return;
            case 23:
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = (AbstractComponentCallbacksC1366v) this.f538b;
                abstractComponentCallbacksC1366v.f18406n0.f18268f.b(abstractComponentCallbacksC1366v.f18388d);
                abstractComponentCallbacksC1366v.f18388d = null;
                return;
            case 24:
                ((z0) this.f538b).b();
                return;
            case 25:
                C1489e c1489e = (C1489e) this.f538b;
                c1489e.T(c1489e.O(), 1028, new C1486b(21));
                l4.l lVar3 = c1489e.f19933f;
                CopyOnWriteArraySet copyOnWriteArraySet = lVar3.f20507d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    l4.k kVar = (l4.k) it.next();
                    kVar.f20503d = true;
                    if (kVar.f20502c) {
                        kVar.f20502c = false;
                        lVar3.f20506c.a(kVar.f20500a, kVar.f20501b.c());
                    }
                }
                copyOnWriteArraySet.clear();
                lVar3.f20510g = true;
                return;
            case 26:
                C1627d c1627d = (C1627d) this.f538b;
                if (!c1627d.f21093c) {
                    InterfaceC1632i interfaceC1632i = c1627d.f21092b;
                    if (interfaceC1632i != null) {
                        interfaceC1632i.e(c1627d.f21091a);
                    }
                    c1627d.f21094d.f21104k.remove(c1627d);
                    c1627d.f21093c = true;
                    return;
                }
                return;
            case 27:
                ((C1625b) this.f538b).e(null);
                return;
            case 28:
                n4.k kVar2 = (n4.k) this.f538b;
                Surface surface = kVar2.f21208h;
                if (surface != null) {
                    Iterator it2 = kVar2.f21201a.iterator();
                    while (it2.hasNext()) {
                        ((SurfaceHolderCallbackC1438A) it2.next()).f19226a.G0(null);
                    }
                }
                SurfaceTexture surfaceTexture = kVar2.f21207g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                kVar2.f21207g = null;
                kVar2.f21208h = null;
                return;
            default:
                ((CarouselLayoutManager) this.f538b).v0();
                return;
        }
    }
}
