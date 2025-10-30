package com.google.android.exoplayer2.source.rtsp;

import N3.AbstractC0250a;
import N3.InterfaceC0274z;
import U3.t;
import e1.q;
import j3.Y;
import javax.net.SocketFactory;
import z2.C2235a;

/* loaded from: classes.dex */
public final class RtspMediaSource$Factory implements InterfaceC0274z {

    /* renamed from: a, reason: collision with root package name */
    public final SocketFactory f14513a = SocketFactory.getDefault();

    @Override // N3.InterfaceC0274z
    public final AbstractC0250a b(Y y9) {
        y9.f19492b.getClass();
        return new t(y9, new C2235a(13), this.f14513a);
    }

    @Override // N3.InterfaceC0274z
    public final InterfaceC0274z a(q qVar) {
        return this;
    }
}
