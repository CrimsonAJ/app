package com.google.android.gms.internal.cast;

import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d.C1065f;
import f5.AbstractC1178j;
import f5.C1177i;
import f5.C1185q;
import h1.C1268g;
import java.io.Serializable;
import t0.C1988w;

/* renamed from: com.google.android.gms.internal.cast.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0869s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14968a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14969b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14970c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14971d;

    public /* synthetic */ RunnableC0869s(Object obj, int i9, Object obj2, int i10) {
        this.f14968a = i10;
        this.f14971d = obj;
        this.f14969b = i9;
        this.f14970c = obj2;
    }

    private final void a() {
        D4.q qVar;
        C1185q c1185q;
        Y y9 = (Y) this.f14970c;
        O0 o02 = (O0) this.f14971d;
        int i9 = this.f14969b;
        C0897z c0897z = y9.f14798h;
        if (c0897z == null) {
            return;
        }
        synchronized (c0897z) {
            C1177i c1177i = new C1177i();
            D4.n g9 = D4.n.g();
            L l9 = c0897z.f15171c;
            g9.f1864e = new C0886w0(l9);
            g9.f1863d = 4501;
            C1185q c3 = l9.c(0, g9.f());
            C0889x c0889x = new C0889x(c1177i);
            c3.getClass();
            qVar = AbstractC1178j.f17414a;
            c3.d(qVar, c0889x);
            c3.c(qVar, new C0889x(c1177i));
            c0897z.f15170b.postDelayed(new RunnableC0893y(0, c1177i), c0897z.f15169a * 1000);
            c1185q = c1177i.f17413a;
        }
        A3.E e8 = new A3.E(y9, o02, i9, 11);
        c1185q.getClass();
        c1185q.d(qVar, e8);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14968a) {
            case 0:
                BinderC0873t binderC0873t = (BinderC0873t) this.f14970c;
                C1988w c1988w = (C1988w) this.f14971d;
                int i9 = this.f14969b;
                synchronized (binderC0873t.f14984i) {
                    binderC0873t.j1(c1988w, i9);
                }
                return;
            case 1:
                a();
                return;
            case 2:
                Serializable serializable = (Serializable) ((com.google.firebase.messaging.u) this.f14970c).f16512a;
                C1065f c1065f = (C1065f) this.f14971d;
                String str = (String) c1065f.f16565a.get(Integer.valueOf(this.f14969b));
                if (str != null) {
                    f.f fVar = (f.f) c1065f.f16569e.get(str);
                    if (fVar != null) {
                        f.b bVar = fVar.f17234a;
                        if (c1065f.f16568d.remove(str)) {
                            bVar.d(serializable);
                            return;
                        }
                        return;
                    }
                    c1065f.f16571g.remove(str);
                    c1065f.f16570f.put(str, serializable);
                    return;
                }
                return;
            case 3:
                ((C1065f) this.f14971d).a(this.f14969b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f14970c));
                return;
            case 4:
                ((C1268g) this.f14970c).b((Intent) this.f14971d, this.f14969b);
                return;
            case 5:
                ((SystemForegroundService) this.f14971d).f10445e.notify(this.f14969b, (Notification) this.f14970c);
                return;
            case 6:
                ((BottomSheetBehavior) this.f14971d).L((View) this.f14970c, this.f14969b, false);
                return;
            default:
                ((TextView) this.f14970c).setTypeface((Typeface) this.f14971d, this.f14969b);
                return;
        }
    }

    public /* synthetic */ RunnableC0869s(Object obj, Object obj2, int i9, int i10) {
        this.f14968a = i10;
        this.f14970c = obj;
        this.f14971d = obj2;
        this.f14969b = i9;
    }

    public RunnableC0869s(BottomSheetBehavior bottomSheetBehavior, View view, int i9) {
        this.f14968a = 6;
        this.f14971d = bottomSheetBehavior;
        this.f14970c = view;
        this.f14969b = i9;
    }
}
