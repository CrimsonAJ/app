package m5;

import D4.n;
import S5.p;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.messaging.u;
import d2.v;
import e1.m;
import e1.q;
import f1.k;
import j1.C1433c;
import java.util.Collections;
import java.util.logging.Level;
import kotlin.jvm.internal.h;
import n1.C1613j;
import p.C1805l;
import p.C1812o0;
import t0.X;
import u0.z;
import w4.i;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20840b;

    public /* synthetic */ c(int i9, Object obj) {
        this.f20839a = i9;
        this.f20840b = obj;
    }

    private final void a() {
        m8.a c3;
        long j;
        while (true) {
            m8.c cVar = (m8.c) this.f20840b;
            synchronized (cVar) {
                c3 = cVar.c();
            }
            if (c3 == null) {
                return;
            }
            m8.b bVar = c3.f20920c;
            h.b(bVar);
            m8.c cVar2 = (m8.c) this.f20840b;
            boolean isLoggable = m8.c.f20929i.isLoggable(Level.FINE);
            if (isLoggable) {
                u uVar = bVar.f20922a.f20930a;
                j = System.nanoTime();
                AbstractC1002u1.a(c3, bVar, "starting");
            } else {
                j = -1;
            }
            try {
                m8.c.a(cVar2, c3);
                if (isLoggable) {
                    u uVar2 = bVar.f20922a.f20930a;
                    AbstractC1002u1.a(c3, bVar, "finished run in ".concat(AbstractC1002u1.B(System.nanoTime() - j)));
                }
            } finally {
            }
        }
    }

    private final void b() {
        String str;
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f20840b;
        Object obj = constraintTrackingWorker.getInputData().f17050a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            q.d().c(ConstraintTrackingWorker.f10447m, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.f10450k.j(new m());
            return;
        }
        ListenableWorker a5 = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), str, constraintTrackingWorker.f10448h);
        constraintTrackingWorker.f10451l = a5;
        if (a5 == null) {
            q.d().a(ConstraintTrackingWorker.f10447m, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.f10450k.j(new m());
            return;
        }
        C1613j l9 = k.b0(constraintTrackingWorker.getApplicationContext()).j.v().l(constraintTrackingWorker.getId().toString());
        if (l9 == null) {
            constraintTrackingWorker.f10450k.j(new m());
            return;
        }
        C1433c c1433c = new C1433c(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
        c1433c.c(Collections.singletonList(l9));
        if (c1433c.a(constraintTrackingWorker.getId().toString())) {
            q.d().a(ConstraintTrackingWorker.f10447m, z.e("Constraints met for delegate ", str), new Throwable[0]);
            try {
                p startWork = constraintTrackingWorker.f10451l.startWork();
                startWork.a(new v(constraintTrackingWorker, 14, startWork), constraintTrackingWorker.getBackgroundExecutor());
                return;
            } catch (Throwable th) {
                q d9 = q.d();
                String str2 = ConstraintTrackingWorker.f10447m;
                d9.a(str2, A0.a.n("Delegated worker ", str, " threw exception in startWork."), th);
                synchronized (constraintTrackingWorker.f10449i) {
                    try {
                        if (constraintTrackingWorker.j) {
                            q.d().a(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                            constraintTrackingWorker.f10450k.j(new Object());
                        } else {
                            constraintTrackingWorker.f10450k.j(new m());
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        q.d().a(ConstraintTrackingWorker.f10447m, A0.a.n("Constraints not met for delegate ", str, ". Requesting retry."), new Throwable[0]);
        constraintTrackingWorker.f10450k.j(new Object());
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1805l c1805l;
        switch (this.f20839a) {
            case 0:
                n nVar = (n) this.f20840b;
                nVar.f1862c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) nVar.f1861b;
                V.d dVar = bottomSheetBehavior.f15849M;
                if (dVar != null && dVar.f()) {
                    nVar.h(nVar.f1863d);
                    return;
                } else {
                    if (bottomSheetBehavior.f15848L == 2) {
                        bottomSheetBehavior.J(nVar.f1863d);
                        return;
                    }
                    return;
                }
            case 1:
                a();
                return;
            case 2:
                C1812o0 c1812o0 = (C1812o0) this.f20840b;
                c1812o0.f22050l = null;
                c1812o0.drawableStateChanged();
                return;
            case 3:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f20840b;
                if (searchView$SearchAutoComplete.f9480f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f9480f = false;
                    return;
                }
                return;
            case 4:
                ActionMenuView actionMenuView = ((Toolbar) this.f20840b).f9486a;
                if (actionMenuView != null && (c1805l = actionMenuView.f9426t) != null) {
                    c1805l.n();
                    return;
                }
                return;
            case 5:
                b();
                return;
            case 6:
                ((X) this.f20840b).a();
                return;
            case 7:
                ((i) this.f20840b).g(false);
                return;
            default:
                y4.p pVar = (y4.p) this.f20840b;
                synchronized (y4.p.f24961i) {
                    try {
                        if (pVar.d()) {
                            pVar.f(15);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
