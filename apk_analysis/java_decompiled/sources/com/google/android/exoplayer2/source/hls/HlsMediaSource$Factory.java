package com.google.android.exoplayer2.source.hls;

import C6.a;
import F5.e;
import N3.AbstractC0250a;
import N3.InterfaceC0274z;
import S3.j;
import S3.m;
import T3.c;
import b5.G1;
import b7.C0701c;
import e1.q;
import j3.Y;
import java.util.List;
import k4.InterfaceC1512l;
import l4.AbstractC1566a;
import n3.InterfaceC1638o;

/* loaded from: classes.dex */
public final class HlsMediaSource$Factory implements InterfaceC0274z {

    /* renamed from: a, reason: collision with root package name */
    public final C0701c f14504a;

    /* renamed from: f, reason: collision with root package name */
    public final G1 f14509f = new G1(18);

    /* renamed from: c, reason: collision with root package name */
    public final e f14506c = new e(13);

    /* renamed from: d, reason: collision with root package name */
    public final a f14507d = c.f7078o;

    /* renamed from: b, reason: collision with root package name */
    public final S3.c f14505b = j.f6786a;

    /* renamed from: g, reason: collision with root package name */
    public q f14510g = new q(-1);

    /* renamed from: e, reason: collision with root package name */
    public final e f14508e = new e(9);

    /* renamed from: i, reason: collision with root package name */
    public final int f14512i = 1;
    public final long j = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14511h = true;

    public HlsMediaSource$Factory(InterfaceC1512l interfaceC1512l) {
        this.f14504a = new C0701c(17, interfaceC1512l);
    }

    @Override // N3.InterfaceC0274z
    public final InterfaceC0274z a(q qVar) {
        AbstractC1566a.l(qVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f14510g = qVar;
        return this;
    }

    @Override // N3.InterfaceC0274z
    public final AbstractC0250a b(Y y9) {
        y9.f19492b.getClass();
        T3.q qVar = this.f14506c;
        List list = y9.f19492b.f19478d;
        if (!list.isEmpty()) {
            qVar = new O0.c(qVar, 5, list);
        }
        S3.c cVar = this.f14505b;
        InterfaceC1638o m9 = this.f14509f.m(y9);
        q qVar2 = this.f14510g;
        this.f14507d.getClass();
        C0701c c0701c = this.f14504a;
        return new m(y9, c0701c, cVar, this.f14508e, m9, qVar2, new c(c0701c, qVar2, qVar), this.j, this.f14511h, this.f14512i);
    }
}
