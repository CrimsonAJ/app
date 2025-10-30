package co.notix;

/* loaded from: classes.dex */
public final class tk extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vk f13238b;

    /* renamed from: c, reason: collision with root package name */
    public int f13239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(vk vkVar, E7.d dVar) {
        super(dVar);
        this.f13238b = vkVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f13237a = obj;
        this.f13239c |= Integer.MIN_VALUE;
        Object a5 = this.f13238b.a(this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
