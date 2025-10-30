package a8;

import Y7.InterfaceC0462g;
import d8.AbstractC1130a;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final m f9207a = new m(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f9208b = AbstractC1130a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f9209c = AbstractC1130a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final G6.a f9210d = new G6.a("BUFFERED", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final G6.a f9211e = new G6.a("SHOULD_BUFFER", 3);

    /* renamed from: f, reason: collision with root package name */
    public static final G6.a f9212f = new G6.a("S_RESUMING_BY_RCV", 3);

    /* renamed from: g, reason: collision with root package name */
    public static final G6.a f9213g = new G6.a("RESUMING_BY_EB", 3);

    /* renamed from: h, reason: collision with root package name */
    public static final G6.a f9214h = new G6.a("POISONED", 3);

    /* renamed from: i, reason: collision with root package name */
    public static final G6.a f9215i = new G6.a("DONE_RCV", 3);
    public static final G6.a j = new G6.a("INTERRUPTED_SEND", 3);

    /* renamed from: k, reason: collision with root package name */
    public static final G6.a f9216k = new G6.a("INTERRUPTED_RCV", 3);

    /* renamed from: l, reason: collision with root package name */
    public static final G6.a f9217l = new G6.a("CHANNEL_CLOSED", 3);

    /* renamed from: m, reason: collision with root package name */
    public static final G6.a f9218m = new G6.a("SUSPEND", 3);

    /* renamed from: n, reason: collision with root package name */
    public static final G6.a f9219n = new G6.a("SUSPEND_NO_WAITER", 3);

    /* renamed from: o, reason: collision with root package name */
    public static final G6.a f9220o = new G6.a("FAILED", 3);

    /* renamed from: p, reason: collision with root package name */
    public static final G6.a f9221p = new G6.a("NO_RECEIVE_RESULT", 3);

    /* renamed from: q, reason: collision with root package name */
    public static final G6.a f9222q = new G6.a("CLOSE_HANDLER_CLOSED", 3);

    /* renamed from: r, reason: collision with root package name */
    public static final G6.a f9223r = new G6.a("CLOSE_HANDLER_INVOKED", 3);

    /* renamed from: s, reason: collision with root package name */
    public static final G6.a f9224s = new G6.a("NO_CLOSE_CAUSE", 3);

    public static final boolean a(InterfaceC0462g interfaceC0462g, Object obj, d8.p pVar) {
        G6.a e8 = interfaceC0462g.e(obj, pVar);
        if (e8 != null) {
            interfaceC0462g.k(e8);
            return true;
        }
        return false;
    }
}
