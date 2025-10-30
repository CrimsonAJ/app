package co.notix;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class kr extends G7.c {

    /* renamed from: a, reason: collision with root package name */
    public no f12642a;

    /* renamed from: b, reason: collision with root package name */
    public O7.p f12643b;

    /* renamed from: c, reason: collision with root package name */
    public O7.l f12644c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f12645d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f12646e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f12647f;

    /* renamed from: g, reason: collision with root package name */
    public int f12648g;

    public kr(E7.d dVar) {
        super(dVar);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        this.f12647f = obj;
        this.f12648g |= Integer.MIN_VALUE;
        Object a5 = lr.a(null, null, null, this);
        if (a5 == F7.a.f2587a) {
            return a5;
        }
        return new A7.j(a5);
    }
}
