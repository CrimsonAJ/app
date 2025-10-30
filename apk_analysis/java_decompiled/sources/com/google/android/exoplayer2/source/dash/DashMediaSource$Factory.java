package com.google.android.exoplayer2.source.dash;

import F5.e;
import N3.AbstractC0250a;
import N3.InterfaceC0274z;
import Q3.h;
import b5.G1;
import e1.q;
import j3.Y;
import java.util.List;
import k4.InterfaceC1512l;
import k4.O;
import l4.AbstractC1566a;
import n3.InterfaceC1638o;
import o1.C1671f;
import z8.C2273w;

/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements InterfaceC0274z {

    /* renamed from: a, reason: collision with root package name */
    public final C1671f f14498a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1512l f14499b;

    /* renamed from: c, reason: collision with root package name */
    public final G1 f14500c = new G1(18);

    /* renamed from: e, reason: collision with root package name */
    public q f14502e = new q(-1);

    /* renamed from: f, reason: collision with root package name */
    public final long f14503f = 30000;

    /* renamed from: d, reason: collision with root package name */
    public final e f14501d = new e(9);

    public DashMediaSource$Factory(InterfaceC1512l interfaceC1512l) {
        this.f14498a = new C1671f(18, interfaceC1512l);
        this.f14499b = interfaceC1512l;
    }

    @Override // N3.InterfaceC0274z
    public final InterfaceC0274z a(q qVar) {
        AbstractC1566a.l(qVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f14502e = qVar;
        return this;
    }

    @Override // N3.InterfaceC0274z
    public final AbstractC0250a b(Y y9) {
        O o9;
        y9.f19492b.getClass();
        O eVar = new R3.e();
        List list = y9.f19492b.f19478d;
        if (!list.isEmpty()) {
            o9 = new C2273w(eVar, list);
        } else {
            o9 = eVar;
        }
        InterfaceC1638o m9 = this.f14500c.m(y9);
        q qVar = this.f14502e;
        return new h(y9, this.f14499b, o9, this.f14498a, this.f14501d, m9, qVar, this.f14503f);
    }
}
