package n;

import com.google.android.gms.internal.measurement.D1;
import p.C1780Y0;

/* loaded from: classes.dex */
public final class i extends D1 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20992g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20993h;

    /* renamed from: i, reason: collision with root package name */
    public int f20994i;
    public final /* synthetic */ Object j;

    public i(j jVar) {
        this.f20992g = 0;
        this.j = jVar;
        this.f20993h = false;
        this.f20994i = 0;
    }

    @Override // P.Y
    public final void a() {
        switch (this.f20992g) {
            case 0:
                int i9 = this.f20994i + 1;
                this.f20994i = i9;
                j jVar = (j) this.j;
                if (i9 == jVar.f20995a.size()) {
                    D1 d12 = jVar.f20998d;
                    if (d12 != null) {
                        d12.a();
                    }
                    this.f20994i = 0;
                    this.f20993h = false;
                    jVar.f20999e = false;
                    return;
                }
                return;
            default:
                if (!this.f20993h) {
                    ((C1780Y0) this.j).f21928a.setVisibility(this.f20994i);
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.D1, P.Y
    public void b() {
        switch (this.f20992g) {
            case 1:
                this.f20993h = true;
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.D1, P.Y
    public final void c() {
        switch (this.f20992g) {
            case 0:
                if (!this.f20993h) {
                    this.f20993h = true;
                    D1 d12 = ((j) this.j).f20998d;
                    if (d12 != null) {
                        d12.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((C1780Y0) this.j).f21928a.setVisibility(0);
                return;
        }
    }

    public i(C1780Y0 c1780y0, int i9) {
        this.f20992g = 1;
        this.j = c1780y0;
        this.f20994i = i9;
        this.f20993h = false;
    }
}
