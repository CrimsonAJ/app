package q8;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends m8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22489e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f22490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22491g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, n nVar, int i9, List list) {
        super(str, true);
        this.f22490f = nVar;
        this.f22491g = i9;
    }

    private final long b() {
        this.f22490f.f22505k.getClass();
        try {
            this.f22490f.f22517w.I(this.f22491g, 9);
            synchronized (this.f22490f) {
                this.f22490f.f22519y.remove(Integer.valueOf(this.f22491g));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }

    @Override // m8.a
    public final long a() {
        switch (this.f22489e) {
            case 0:
                return b();
            default:
                this.f22490f.f22505k.getClass();
                try {
                    this.f22490f.f22517w.I(this.f22491g, 9);
                    synchronized (this.f22490f) {
                        this.f22490f.f22519y.remove(Integer.valueOf(this.f22491g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, n nVar, int i9, List list, boolean z9) {
        super(str, true);
        this.f22490f = nVar;
        this.f22491g = i9;
    }
}
