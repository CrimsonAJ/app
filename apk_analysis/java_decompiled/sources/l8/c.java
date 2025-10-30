package l8;

import x8.C2183c;
import x8.p;

/* loaded from: classes.dex */
public final class c extends p {

    /* renamed from: b, reason: collision with root package name */
    public boolean f20617b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f20618c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f20619d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C2183c c2183c, g gVar, d dVar) {
        super(c2183c);
        this.f20618c = gVar;
        this.f20619d = dVar;
    }

    @Override // x8.p, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (!this.f20617b) {
            this.f20617b = true;
            g gVar = this.f20618c;
            d dVar = this.f20619d;
            synchronized (gVar) {
                int i9 = dVar.f20627h - 1;
                dVar.f20627h = i9;
                if (i9 == 0 && dVar.f20625f) {
                    gVar.g0(dVar);
                }
            }
        }
    }
}
