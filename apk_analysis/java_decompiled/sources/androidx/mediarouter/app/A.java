package androidx.mediarouter.app;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.notix.R;
import java.util.ArrayList;
import java.util.Collections;
import l6.AbstractC1570b;
import t0.C1988w;

/* loaded from: classes.dex */
public final class A extends i.y {

    /* renamed from: f, reason: collision with root package name */
    public final t0.D f9923f;

    /* renamed from: g, reason: collision with root package name */
    public final F f9924g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f9925h;

    /* renamed from: i, reason: collision with root package name */
    public C1988w f9926i;
    public ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public z f9927k;

    /* renamed from: l, reason: collision with root package name */
    public RecyclerView f9928l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9929m;

    /* renamed from: n, reason: collision with root package name */
    public t0.C f9930n;

    /* renamed from: o, reason: collision with root package name */
    public final long f9931o;

    /* renamed from: p, reason: collision with root package name */
    public long f9932p;

    /* renamed from: q, reason: collision with root package name */
    public final C3.e f9933q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public A(android.content.Context r3) {
        /*
            r2 = this;
            r0 = 0
            android.view.ContextThemeWrapper r3 = s8.e.q(r3, r0)
            r0 = 2130969431(0x7f040357, float:1.7547544E38)
            int r0 = s8.e.H(r3, r0)
            if (r0 != 0) goto L12
            int r0 = s8.e.E(r3)
        L12:
            r2.<init>(r3, r0)
            t0.w r3 = t0.C1988w.f23046c
            r2.f9926i = r3
            C3.e r3 = new C3.e
            r0 = 3
            r3.<init>(r0, r2)
            r2.f9933q = r3
            android.content.Context r3 = r2.getContext()
            t0.D r0 = t0.D.d(r3)
            r2.f9923f = r0
            androidx.mediarouter.app.F r0 = new androidx.mediarouter.app.F
            r1 = 4
            r0.<init>(r2, r1)
            r2.f9924g = r0
            r2.f9925h = r3
            android.content.res.Resources r3 = r3.getResources()
            r0 = 2131427382(0x7f0b0036, float:1.8476379E38)
            int r3 = r3.getInteger(r0)
            long r0 = (long) r3
            r2.f9931o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.A.<init>(android.content.Context):void");
    }

    public final void f() {
        if (this.f9930n == null && this.f9929m) {
            this.f9923f.getClass();
            t0.D.b();
            ArrayList arrayList = new ArrayList(t0.D.c().f22971i);
            int size = arrayList.size();
            while (true) {
                int i9 = size - 1;
                if (size <= 0) {
                    break;
                }
                t0.C c3 = (t0.C) arrayList.get(i9);
                if (c3.d() || !c3.f22846g || !c3.h(this.f9926i)) {
                    arrayList.remove(i9);
                }
                size = i9;
            }
            Collections.sort(arrayList, C0567c.f10068c);
            long uptimeMillis = SystemClock.uptimeMillis() - this.f9932p;
            long j = this.f9931o;
            if (uptimeMillis >= j) {
                this.f9932p = SystemClock.uptimeMillis();
                this.j.clear();
                this.j.addAll(arrayList);
                this.f9927k.n();
                return;
            }
            C3.e eVar = this.f9933q;
            eVar.removeMessages(1);
            eVar.sendMessageAtTime(eVar.obtainMessage(1, arrayList), this.f9932p + j);
        }
    }

    public final void g(C1988w c1988w) {
        if (c1988w != null) {
            if (!this.f9926i.equals(c1988w)) {
                this.f9926i = c1988w;
                if (this.f9929m) {
                    t0.D d9 = this.f9923f;
                    F f9 = this.f9924g;
                    d9.h(f9);
                    d9.a(c1988w, f9, 1);
                }
                f();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9929m = true;
        this.f9923f.a(this.f9926i, this.f9924g, 1);
        f();
    }

    @Override // i.y, d.DialogC1072m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i9;
        int e8;
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        Context context = this.f9925h;
        View decorView = getWindow().getDecorView();
        if (s8.e.K(context)) {
            i9 = R.color.mr_dynamic_dialog_background_light;
        } else {
            i9 = R.color.mr_dynamic_dialog_background_dark;
        }
        decorView.setBackgroundColor(context.getColor(i9));
        this.j = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new D(2, this));
        this.f9927k = new z(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.f9928l = recyclerView;
        recyclerView.setAdapter(this.f9927k);
        this.f9928l.setLayoutManager(new LinearLayoutManager(1));
        Context context2 = this.f9925h;
        int i10 = -1;
        if (!context2.getResources().getBoolean(R.bool.is_tablet)) {
            e8 = -1;
        } else {
            e8 = AbstractC1570b.e(context2);
        }
        if (context2.getResources().getBoolean(R.bool.is_tablet)) {
            i10 = -2;
        }
        getWindow().setLayout(e8, i10);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9929m = false;
        this.f9923f.h(this.f9924g);
        this.f9933q.removeMessages(1);
    }
}
