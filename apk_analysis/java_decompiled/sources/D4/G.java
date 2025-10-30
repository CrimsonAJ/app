package D4;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import f5.C1177i;
import f5.C1183o;

/* loaded from: classes.dex */
public final class G extends y {

    /* renamed from: b, reason: collision with root package name */
    public final C1177i f1818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1819c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1820d;

    public G(int i9, C1177i c1177i) {
        super(i9);
        this.f1818b = c1177i;
    }

    @Override // D4.I
    public final void a(Status status) {
        this.f1818b.c(new C4.e(status));
    }

    @Override // D4.I
    public final void b(RuntimeException runtimeException) {
        this.f1818b.c(runtimeException);
    }

    @Override // D4.I
    public final void c(t tVar) {
        try {
            h(tVar);
        } catch (DeadObjectException e8) {
            a(I.e(e8));
            throw e8;
        } catch (RemoteException e9) {
            a(I.e(e9));
        } catch (RuntimeException e10) {
            this.f1818b.c(e10);
        }
    }

    @Override // D4.I
    public final /* bridge */ /* synthetic */ void d(A1.g gVar, boolean z9) {
        int i9 = this.f1819c;
    }

    @Override // D4.y
    public final boolean f(t tVar) {
        switch (this.f1819c) {
            case 0:
                ((C) this.f1820d).f1807a.getClass();
                return true;
            default:
                if (((C) tVar.j.get((C0090i) this.f1820d)) != null) {
                    return true;
                }
                return false;
        }
    }

    @Override // D4.y
    public final B4.d[] g(t tVar) {
        switch (this.f1819c) {
            case 0:
                return (B4.d[]) ((C) this.f1820d).f1807a.f9332c;
            default:
                C c3 = (C) tVar.j.get((C0090i) this.f1820d);
                if (c3 == null) {
                    return null;
                }
                return (B4.d[]) c3.f1807a.f9332c;
        }
    }

    public final void h(t tVar) {
        switch (this.f1819c) {
            case 0:
                android.support.v4.media.session.y yVar = ((C) this.f1820d).f1807a;
                ((C1183o) ((A3.F) yVar.f9333d).f51c).H(tVar.f1882f, this.f1818b);
                C0090i c0090i = ((C0091j) ((C) this.f1820d).f1807a.f9331b).f1858a;
                if (c0090i != null) {
                    tVar.j.put(c0090i, (C) this.f1820d);
                    return;
                }
                return;
            default:
                C c3 = (C) tVar.j.remove((C0090i) this.f1820d);
                if (c3 != null) {
                    ((e0.c) ((A3.F) c3.f1808b.f21473b).f52d).H(tVar.f1882f, this.f1818b);
                    ((C0091j) c3.f1807a.f9331b).f1858a = null;
                    return;
                }
                this.f1818b.d(Boolean.FALSE);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public G(C0090i c0090i, C1177i c1177i) {
        this(4, c1177i);
        this.f1819c = 1;
        this.f1820d = c0090i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public G(C c3, C1177i c1177i) {
        this(3, c1177i);
        this.f1819c = 0;
        this.f1820d = c3;
    }

    private final /* bridge */ /* synthetic */ void i(A1.g gVar, boolean z9) {
    }

    private final /* bridge */ /* synthetic */ void j(A1.g gVar, boolean z9) {
    }
}
