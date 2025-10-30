package q8;

import java.io.IOException;

/* loaded from: classes.dex */
public final class m extends m8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f22492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22493f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f22494g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, n nVar, int i9, long j) {
        super(str, true);
        this.f22492e = nVar;
        this.f22493f = i9;
        this.f22494g = j;
    }

    @Override // m8.a
    public final long a() {
        n nVar = this.f22492e;
        try {
            nVar.f22517w.O(this.f22494g, this.f22493f);
            return -1L;
        } catch (IOException e8) {
            nVar.a(2, 2, e8);
            return -1L;
        }
    }
}
