package q8;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.IOException;

/* loaded from: classes.dex */
public final class j extends m8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f22482f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22483g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22484h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, n nVar, int i9, int i10, int i11) {
        super(str, true);
        this.f22481e = i11;
        this.f22482f = nVar;
        this.f22483g = i9;
        this.f22484h = i10;
    }

    @Override // m8.a
    public final long a() {
        switch (this.f22481e) {
            case 0:
                int i9 = this.f22483g;
                int i10 = this.f22484h;
                n nVar = this.f22482f;
                nVar.getClass();
                try {
                    nVar.f22517w.F(i9, i10, true);
                    return -1L;
                } catch (IOException e8) {
                    nVar.a(2, 2, e8);
                    return -1L;
                }
            case 1:
                y yVar = this.f22482f.f22505k;
                int i11 = this.f22484h;
                yVar.getClass();
                AbstractC0953k1.t(i11, "errorCode");
                synchronized (this.f22482f) {
                    this.f22482f.f22519y.remove(Integer.valueOf(this.f22483g));
                }
                return -1L;
            default:
                n nVar2 = this.f22482f;
                try {
                    int i12 = this.f22483g;
                    int i13 = this.f22484h;
                    nVar2.getClass();
                    AbstractC0953k1.t(i13, "statusCode");
                    nVar2.f22517w.I(i12, i13);
                    return -1L;
                } catch (IOException e9) {
                    nVar2.a(2, 2, e9);
                    return -1L;
                }
        }
    }
}
