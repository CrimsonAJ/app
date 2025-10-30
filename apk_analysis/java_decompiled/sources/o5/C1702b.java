package o5;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: o5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1702b extends Q0.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21639c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f21640d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702b(CarouselLayoutManager carouselLayoutManager, int i9) {
        super(1, 2);
        this.f21639c = i9;
        switch (i9) {
            case 1:
                this.f21640d = carouselLayoutManager;
                super(0, 2);
                return;
            default:
                this.f21640d = carouselLayoutManager;
                return;
        }
    }

    @Override // Q0.b
    public final int f() {
        switch (this.f21639c) {
            case 0:
                return this.f21640d.f10350o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f21640d;
                return carouselLayoutManager.f10350o - carouselLayoutManager.H();
        }
    }

    @Override // Q0.b
    public final int g() {
        switch (this.f21639c) {
            case 0:
                return this.f21640d.I();
            default:
                return 0;
        }
    }

    @Override // Q0.b
    public final int h() {
        switch (this.f21639c) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f21640d;
                return carouselLayoutManager.f10349n - carouselLayoutManager.J();
            default:
                return this.f21640d.f10349n;
        }
    }

    @Override // Q0.b
    public final int i() {
        switch (this.f21639c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f21640d;
                if (carouselLayoutManager.L0()) {
                    return carouselLayoutManager.f10349n;
                }
                return 0;
        }
    }

    @Override // Q0.b
    public final int j() {
        switch (this.f21639c) {
            case 0:
                return 0;
            default:
                return this.f21640d.K();
        }
    }
}
