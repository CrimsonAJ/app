package d2;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements androidx.lifecycle.F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O7.l f16816b;

    public /* synthetic */ u(int i9, O7.l lVar) {
        this.f16815a = i9;
        this.f16816b = lVar;
    }

    @Override // androidx.lifecycle.F
    public final /* synthetic */ void a(Object obj) {
        switch (this.f16815a) {
            case 0:
                ((C1112f) this.f16816b).invoke(obj);
                return;
            default:
                ((w0.h) this.f16816b).invoke(obj);
                return;
        }
    }

    public final A7.a b() {
        switch (this.f16815a) {
            case 0:
                return (C1112f) this.f16816b;
            default:
                return (w0.h) this.f16816b;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f16815a) {
            case 0:
                if ((obj instanceof androidx.lifecycle.F) && (obj instanceof u)) {
                    return ((C1112f) this.f16816b).equals(((u) obj).b());
                }
                return false;
            default:
                if ((obj instanceof androidx.lifecycle.F) && (obj instanceof u)) {
                    return ((w0.h) this.f16816b).equals(((u) obj).b());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f16815a) {
            case 0:
                return ((C1112f) this.f16816b).hashCode();
            default:
                return ((w0.h) this.f16816b).hashCode();
        }
    }
}
