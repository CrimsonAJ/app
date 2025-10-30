package androidx.mediarouter.app;

import K5.ViewOnClickListenerC0215a;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import co.notix.R;
import com.google.android.gms.internal.measurement.Y1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l6.AbstractC1570b;
import t0.C1988w;

/* renamed from: androidx.mediarouter.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC0569e extends i.y {

    /* renamed from: f, reason: collision with root package name */
    public final t0.D f10073f;

    /* renamed from: g, reason: collision with root package name */
    public final F f10074g;

    /* renamed from: h, reason: collision with root package name */
    public C1988w f10075h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f10076i;
    public TextView j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f10077k;

    /* renamed from: l, reason: collision with root package name */
    public RelativeLayout f10078l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f10079m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f10080n;

    /* renamed from: o, reason: collision with root package name */
    public LinearLayout f10081o;

    /* renamed from: p, reason: collision with root package name */
    public Button f10082p;

    /* renamed from: q, reason: collision with root package name */
    public ProgressBar f10083q;

    /* renamed from: r, reason: collision with root package name */
    public ListView f10084r;

    /* renamed from: s, reason: collision with root package name */
    public C0566b f10085s;

    /* renamed from: t, reason: collision with root package name */
    public final C0568d f10086t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10087u;

    /* renamed from: v, reason: collision with root package name */
    public long f10088v;

    /* renamed from: w, reason: collision with root package name */
    public final C3.e f10089w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC0569e(android.content.Context r2) {
        /*
            r1 = this;
            r0 = 0
            android.view.ContextThemeWrapper r2 = s8.e.q(r2, r0)
            r0 = 2130969431(0x7f040357, float:1.7547544E38)
            int r0 = s8.e.H(r2, r0)
            if (r0 != 0) goto L12
            int r0 = s8.e.E(r2)
        L12:
            r1.<init>(r2, r0)
            t0.w r2 = t0.C1988w.f23046c
            r1.f10075h = r2
            C3.e r2 = new C3.e
            r0 = 2
            r2.<init>(r0, r1)
            r1.f10089w = r2
            android.content.Context r2 = r1.getContext()
            t0.D r2 = t0.D.d(r2)
            r1.f10073f = r2
            androidx.mediarouter.app.F r2 = new androidx.mediarouter.app.F
            r2.<init>(r1, r0)
            r1.f10074g = r2
            androidx.mediarouter.app.d r2 = new androidx.mediarouter.app.d
            r0 = 0
            r2.<init>(r0, r1)
            r1.f10086t = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.DialogC0569e.<init>(android.content.Context):void");
    }

    @Override // i.y, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.f10086t);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void f(List list) {
        this.f10088v = SystemClock.uptimeMillis();
        this.f10076i.clear();
        this.f10076i.addAll(list);
        this.f10085s.notifyDataSetChanged();
        C3.e eVar = this.f10089w;
        eVar.removeMessages(3);
        eVar.removeMessages(2);
        if (list.isEmpty()) {
            i(0);
            eVar.sendMessageDelayed(eVar.obtainMessage(2), 5000L);
        } else {
            i(1);
        }
    }

    public final void g() {
        if (this.f10087u) {
            this.f10073f.getClass();
            t0.D.b();
            ArrayList arrayList = new ArrayList(t0.D.c().f22971i);
            int size = arrayList.size();
            while (true) {
                int i9 = size - 1;
                if (size <= 0) {
                    break;
                }
                t0.C c3 = (t0.C) arrayList.get(i9);
                if (c3.d() || !c3.f22846g || !c3.h(this.f10075h)) {
                    arrayList.remove(i9);
                }
                size = i9;
            }
            Collections.sort(arrayList, C0567c.f10067b);
            if (SystemClock.uptimeMillis() - this.f10088v >= 300) {
                f(arrayList);
                return;
            }
            C3.e eVar = this.f10089w;
            eVar.removeMessages(1);
            eVar.sendMessageAtTime(eVar.obtainMessage(1, arrayList), this.f10088v + 300);
        }
    }

    public final void h(C1988w c1988w) {
        if (c1988w != null) {
            if (!this.f10075h.equals(c1988w)) {
                this.f10075h = c1988w;
                if (this.f10087u) {
                    t0.D d9 = this.f10073f;
                    F f9 = this.f10074g;
                    d9.h(f9);
                    d9.a(c1988w, f9, 1);
                }
                g();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void i(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        return;
                    }
                    setTitle(R.string.mr_chooser_zero_routes_found_title);
                    this.f10084r.setVisibility(8);
                    this.f10077k.setVisibility(8);
                    this.f10083q.setVisibility(8);
                    this.f10081o.setVisibility(0);
                    this.f10082p.setVisibility(0);
                    this.f10080n.setVisibility(0);
                    this.f10078l.setVisibility(0);
                    return;
                }
                setTitle(R.string.mr_chooser_title);
                this.f10084r.setVisibility(8);
                this.f10077k.setVisibility(8);
                this.f10083q.setVisibility(0);
                this.f10081o.setVisibility(8);
                this.f10082p.setVisibility(8);
                this.f10080n.setVisibility(4);
                this.f10078l.setVisibility(0);
                return;
            }
            setTitle(R.string.mr_chooser_title);
            this.f10084r.setVisibility(0);
            this.f10077k.setVisibility(8);
            this.f10083q.setVisibility(8);
            this.f10081o.setVisibility(8);
            this.f10082p.setVisibility(8);
            this.f10080n.setVisibility(8);
            this.f10078l.setVisibility(8);
            return;
        }
        setTitle(R.string.mr_chooser_title);
        this.f10084r.setVisibility(8);
        this.f10077k.setVisibility(0);
        this.f10083q.setVisibility(0);
        this.f10081o.setVisibility(8);
        this.f10082p.setVisibility(8);
        this.f10080n.setVisibility(8);
        this.f10078l.setVisibility(8);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10087u = true;
        this.f10073f.a(this.f10075h, this.f10074g, 1);
        g();
        C3.e eVar = this.f10089w;
        eVar.removeMessages(2);
        eVar.removeMessages(3);
        eVar.removeMessages(1);
        eVar.sendMessageDelayed(eVar.obtainMessage(2), 5000L);
    }

    @Override // i.y, d.DialogC1072m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z9;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.f10076i = new ArrayList();
        this.f10085s = new C0566b(getContext(), this.f10076i);
        this.j = (TextView) findViewById(R.id.mr_chooser_title);
        this.f10077k = (TextView) findViewById(R.id.mr_chooser_searching);
        this.f10078l = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.f10079m = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.f10080n = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.f10081o = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.f10082p = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.f10083q = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        boolean z10 = false;
        if (Y1.f15412d == null) {
            if (!Y1.s(context)) {
                PackageManager packageManager = context.getPackageManager();
                if (Y1.f15416h == null) {
                    Y1.f15416h = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (!Y1.f15416h.booleanValue() && !Y1.q(context) && !Y1.t(context)) {
                    z9 = true;
                    Y1.f15412d = Boolean.valueOf(z9);
                }
            }
            z9 = false;
            Y1.f15412d = Boolean.valueOf(z9);
        }
        if (!Y1.f15412d.booleanValue()) {
            if (Y1.f15414f == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z10 = true;
                }
                Y1.f15414f = Boolean.valueOf(z10);
            }
            if (!Y1.f15414f.booleanValue()) {
                if (!Y1.s(context) && !Y1.r(context.getResources())) {
                    if (Y1.t(context)) {
                        string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
                    } else {
                        PackageManager packageManager2 = context.getPackageManager();
                        if (Y1.f15416h == null) {
                            Y1.f15416h = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                        }
                        if (Y1.f15416h.booleanValue()) {
                            string = context.getString(R.string.mr_chooser_wifi_warning_description_watch);
                        } else if (Y1.q(context)) {
                            string = context.getString(R.string.mr_chooser_wifi_warning_description_car);
                        } else {
                            string = context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                        }
                    }
                } else {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
                }
                this.f10079m.setText(string);
                this.f10080n.setMovementMethod(LinkMovementMethod.getInstance());
                this.f10082p.setOnClickListener(new ViewOnClickListenerC0215a(10, this));
                ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
                this.f10084r = listView;
                listView.setAdapter((ListAdapter) this.f10085s);
                this.f10084r.setOnItemClickListener(this.f10085s);
                this.f10084r.setEmptyView(findViewById(android.R.id.empty));
                getWindow().setLayout(AbstractC1570b.e(getContext()), -2);
                getContext().registerReceiver(this.f10086t, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        this.f10079m.setText(string);
        this.f10080n.setMovementMethod(LinkMovementMethod.getInstance());
        this.f10082p.setOnClickListener(new ViewOnClickListenerC0215a(10, this));
        ListView listView2 = (ListView) findViewById(R.id.mr_chooser_list);
        this.f10084r = listView2;
        listView2.setAdapter((ListAdapter) this.f10085s);
        this.f10084r.setOnItemClickListener(this.f10085s);
        this.f10084r.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(AbstractC1570b.e(getContext()), -2);
        getContext().registerReceiver(this.f10086t, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f10087u = false;
        this.f10073f.h(this.f10074g);
        C3.e eVar = this.f10089w;
        eVar.removeMessages(1);
        eVar.removeMessages(2);
        eVar.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // i.y, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.j.setText(charSequence);
    }

    @Override // i.y, android.app.Dialog
    public final void setTitle(int i9) {
        this.j.setText(i9);
    }
}
