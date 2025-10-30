package p8;

import java.io.IOException;
import kotlin.jvm.internal.h;
import n8.i;
import x8.C;
import x8.C2187g;
import x8.I;
import x8.K;
import x8.q;

/* loaded from: classes.dex */
public abstract class a implements I {

    /* renamed from: a, reason: collision with root package name */
    public final q f22210a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22211b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U6.a f22212c;

    public a(U6.a aVar) {
        this.f22212c = aVar;
        this.f22210a = new q(((C) aVar.f7524d).f24602a.c());
    }

    public final void a() {
        U6.a aVar = this.f22212c;
        int i9 = aVar.f7521a;
        if (i9 == 6) {
            return;
        }
        if (i9 == 5) {
            q qVar = this.f22210a;
            K k5 = qVar.f24667e;
            qVar.f24667e = K.f24618d;
            k5.a();
            k5.b();
            aVar.f7521a = 6;
            return;
        }
        throw new IllegalStateException("state: " + aVar.f7521a);
    }

    @Override // x8.I
    public long b0(C2187g sink, long j) {
        U6.a aVar = this.f22212c;
        h.e(sink, "sink");
        try {
            return ((C) aVar.f7524d).b0(sink, j);
        } catch (IOException e8) {
            ((i) aVar.f7523c).l();
            a();
            throw e8;
        }
    }

    @Override // x8.I
    public final K c() {
        return this.f22210a;
    }
}
