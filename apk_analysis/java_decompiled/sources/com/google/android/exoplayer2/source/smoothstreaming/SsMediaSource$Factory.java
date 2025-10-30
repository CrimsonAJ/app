package com.google.android.exoplayer2.source.smoothstreaming;

import F5.e;
import N3.AbstractC0250a;
import N3.InterfaceC0274z;
import W3.c;
import b5.G1;
import e1.q;
import j3.Y;
import java.util.List;
import k4.InterfaceC1512l;
import k4.O;
import l4.AbstractC1566a;
import n3.InterfaceC1638o;
import s4.i;
import z8.C2273w;

/* loaded from: classes.dex */
public final class SsMediaSource$Factory implements InterfaceC0274z {

    /* renamed from: a, reason: collision with root package name */
    public final i f14514a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1512l f14515b;

    /* renamed from: d, reason: collision with root package name */
    public final G1 f14517d = new G1(18);

    /* renamed from: e, reason: collision with root package name */
    public q f14518e = new q(-1);

    /* renamed from: f, reason: collision with root package name */
    public final long f14519f = 30000;

    /* renamed from: c, reason: collision with root package name */
    public final e f14516c = new e(9);

    public SsMediaSource$Factory(InterfaceC1512l interfaceC1512l) {
        this.f14514a = new i(interfaceC1512l);
        this.f14515b = interfaceC1512l;
    }

    @Override // N3.InterfaceC0274z
    public final InterfaceC0274z a(q qVar) {
        AbstractC1566a.l(qVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f14518e = qVar;
        return this;
    }

    @Override // N3.InterfaceC0274z
    public final AbstractC0250a b(Y y9) {
        O o9;
        y9.f19492b.getClass();
        O iVar = new i(15);
        List list = y9.f19492b.f19478d;
        if (!list.isEmpty()) {
            o9 = new C2273w(iVar, list);
        } else {
            o9 = iVar;
        }
        InterfaceC1638o m9 = this.f14517d.m(y9);
        q qVar = this.f14518e;
        return new c(y9, this.f14515b, o9, this.f14514a, this.f14516c, m9, qVar, this.f14519f);
    }
}
