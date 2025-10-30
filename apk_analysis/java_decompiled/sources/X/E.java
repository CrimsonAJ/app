package X;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class E extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public Object f7964r;

    /* renamed from: s, reason: collision with root package name */
    public Object f7965s;

    /* renamed from: t, reason: collision with root package name */
    public Serializable f7966t;

    /* renamed from: u, reason: collision with root package name */
    public kotlin.jvm.internal.o f7967u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7968v;

    /* renamed from: w, reason: collision with root package name */
    public int f7969w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f7970x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ O f7971y;

    /* renamed from: z, reason: collision with root package name */
    public int f7972z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(O o9, G7.c cVar) {
        super(cVar);
        this.f7971y = o9;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f7970x = obj;
        this.f7972z |= Integer.MIN_VALUE;
        return O.g(this.f7971y, false, this);
    }
}
