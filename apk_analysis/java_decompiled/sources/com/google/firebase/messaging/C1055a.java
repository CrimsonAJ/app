package com.google.firebase.messaging;

import a7.C0507d;
import a7.EnumC0504a;
import a7.EnumC0506c;

/* renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1055a implements L6.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1055a f16452a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final L6.c f16453b = new L6.c("projectNumber", A0.a.s(A0.a.r(O6.e.class, new O6.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final L6.c f16454c = new L6.c("messageId", A0.a.s(A0.a.r(O6.e.class, new O6.a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final L6.c f16455d = new L6.c("instanceId", A0.a.s(A0.a.r(O6.e.class, new O6.a(3))));

    /* renamed from: e, reason: collision with root package name */
    public static final L6.c f16456e = new L6.c("messageType", A0.a.s(A0.a.r(O6.e.class, new O6.a(4))));

    /* renamed from: f, reason: collision with root package name */
    public static final L6.c f16457f = new L6.c("sdkPlatform", A0.a.s(A0.a.r(O6.e.class, new O6.a(5))));

    /* renamed from: g, reason: collision with root package name */
    public static final L6.c f16458g = new L6.c("packageName", A0.a.s(A0.a.r(O6.e.class, new O6.a(6))));

    /* renamed from: h, reason: collision with root package name */
    public static final L6.c f16459h = new L6.c("collapseKey", A0.a.s(A0.a.r(O6.e.class, new O6.a(7))));

    /* renamed from: i, reason: collision with root package name */
    public static final L6.c f16460i = new L6.c("priority", A0.a.s(A0.a.r(O6.e.class, new O6.a(8))));
    public static final L6.c j = new L6.c("ttl", A0.a.s(A0.a.r(O6.e.class, new O6.a(9))));

    /* renamed from: k, reason: collision with root package name */
    public static final L6.c f16461k = new L6.c("topic", A0.a.s(A0.a.r(O6.e.class, new O6.a(10))));

    /* renamed from: l, reason: collision with root package name */
    public static final L6.c f16462l = new L6.c("bulkId", A0.a.s(A0.a.r(O6.e.class, new O6.a(11))));

    /* renamed from: m, reason: collision with root package name */
    public static final L6.c f16463m = new L6.c("event", A0.a.s(A0.a.r(O6.e.class, new O6.a(12))));

    /* renamed from: n, reason: collision with root package name */
    public static final L6.c f16464n = new L6.c("analyticsLabel", A0.a.s(A0.a.r(O6.e.class, new O6.a(13))));

    /* renamed from: o, reason: collision with root package name */
    public static final L6.c f16465o = new L6.c("campaignId", A0.a.s(A0.a.r(O6.e.class, new O6.a(14))));

    /* renamed from: p, reason: collision with root package name */
    public static final L6.c f16466p = new L6.c("composerLabel", A0.a.s(A0.a.r(O6.e.class, new O6.a(15))));

    @Override // L6.a
    public final void a(Object obj, Object obj2) {
        C0507d c0507d = (C0507d) obj;
        L6.e eVar = (L6.e) obj2;
        eVar.f(f16453b, c0507d.f9173a);
        eVar.a(f16454c, c0507d.f9174b);
        eVar.a(f16455d, c0507d.f9175c);
        eVar.a(f16456e, c0507d.f9176d);
        eVar.a(f16457f, EnumC0506c.ANDROID);
        eVar.a(f16458g, c0507d.f9177e);
        eVar.a(f16459h, c0507d.f9178f);
        eVar.e(f16460i, c0507d.f9179g);
        eVar.e(j, c0507d.f9180h);
        eVar.a(f16461k, c0507d.f9181i);
        eVar.f(f16462l, 0L);
        eVar.a(f16463m, EnumC0504a.MESSAGE_DELIVERED);
        eVar.a(f16464n, c0507d.j);
        eVar.f(f16465o, 0L);
        eVar.a(f16466p, c0507d.f9182k);
    }
}
