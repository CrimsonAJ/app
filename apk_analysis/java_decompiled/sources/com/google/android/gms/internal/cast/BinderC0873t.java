package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import t0.AbstractC1989x;
import t0.C1971e;
import t0.C1988w;
import u4.C2078c;

/* renamed from: com.google.android.gms.internal.cast.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0873t extends AbstractBinderC0838k {

    /* renamed from: n, reason: collision with root package name */
    public static final y4.b f14981n = new y4.b("MediaRouterProxy", null);

    /* renamed from: g, reason: collision with root package name */
    public final t0.D f14982g;

    /* renamed from: h, reason: collision with root package name */
    public final C2078c f14983h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f14984i;
    public final C0885w j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f14985k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14986l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14987m;

    public BinderC0873t(Context context, t0.D d9, C2078c c2078c, y4.r rVar) {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter", 0);
        this.f14984i = new HashMap();
        this.f14982g = d9;
        this.f14983h = c2078c;
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        f14981n.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.j = new C0885w(c2078c);
        new Intent(context, (Class<?>) t0.I.class).setPackage(context.getPackageName());
        this.f14985k = !context.getPackageManager().queryBroadcastReceivers(r6, 0).isEmpty();
        this.f14986l = true;
        rVar.d(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).k(new W2(1, this));
    }

    public final void h1(android.support.v4.media.session.y yVar) {
        b5.G1 g12;
        this.f14982g.getClass();
        t0.D.b();
        C1971e c3 = t0.D.c();
        c3.f22961D = yVar;
        if (yVar != null) {
            g12 = new b5.G1(c3, yVar);
        } else {
            g12 = null;
        }
        b5.G1 g13 = c3.f22960C;
        if (g13 != null) {
            g13.e();
        }
        c3.f22960C = g12;
        if (g12 != null) {
            c3.m();
        }
    }

    public final boolean i1() {
        C2078c c2078c;
        return this.f14985k && this.f14986l && (c2078c = this.f14983h) != null && c2078c.f23669m;
    }

    public final void j1(C1988w c1988w, int i9) {
        Set set = (Set) this.f14984i.get(c1988w);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f14982g.a(c1988w, (AbstractC1989x) it.next(), i9);
            }
        }
    }

    public final void k1(C1988w c1988w) {
        Set set = (Set) this.f14984i.get(c1988w);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f14982g.h((AbstractC1989x) it.next());
            }
        }
    }
}
