package co.notix;

/* loaded from: classes.dex */
public final class ek extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public long f12180a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sk f12182c;

    /* renamed from: d, reason: collision with root package name */
    public int f12183d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(sk skVar, E7.d dVar) {
        super(dVar);
        this.f12182c = skVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12181b = obj;
        this.f12183d |= Integer.MIN_VALUE;
        return this.f12182c.c(0L, this);
    }
}
