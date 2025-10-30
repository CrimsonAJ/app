package j7;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends G7.c {

    /* renamed from: r, reason: collision with root package name */
    public Map f19783r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f19784s;

    /* renamed from: t, reason: collision with root package name */
    public d f19785t;

    /* renamed from: u, reason: collision with root package name */
    public g8.a f19786u;

    /* renamed from: v, reason: collision with root package name */
    public Map f19787v;

    /* renamed from: w, reason: collision with root package name */
    public Object f19788w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f19789x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f19790y;

    /* renamed from: z, reason: collision with root package name */
    public int f19791z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, G7.c cVar2) {
        super(cVar2);
        this.f19790y = cVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f19789x = obj;
        this.f19791z |= Integer.MIN_VALUE;
        return this.f19790y.b(this);
    }
}
