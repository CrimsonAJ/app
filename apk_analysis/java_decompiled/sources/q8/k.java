package q8;

import java.io.IOException;
import x8.C2187g;

/* loaded from: classes.dex */
public final class k extends m8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f22485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2187g f22487g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22488h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, n nVar, int i9, C2187g c2187g, int i10, boolean z9) {
        super(str, true);
        this.f22485e = nVar;
        this.f22486f = i9;
        this.f22487g = c2187g;
        this.f22488h = i10;
    }

    @Override // m8.a
    public final long a() {
        try {
            y yVar = this.f22485e.f22505k;
            C2187g c2187g = this.f22487g;
            int i9 = this.f22488h;
            yVar.getClass();
            c2187g.n(i9);
            this.f22485e.f22517w.I(this.f22486f, 9);
            synchronized (this.f22485e) {
                this.f22485e.f22519y.remove(Integer.valueOf(this.f22486f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
