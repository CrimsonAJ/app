package D4;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import f5.C1177i;
import java.util.Map;

/* loaded from: classes.dex */
public final class H extends y {

    /* renamed from: b, reason: collision with root package name */
    public final n f1821b;

    /* renamed from: c, reason: collision with root package name */
    public final C1177i f1822c;

    /* renamed from: d, reason: collision with root package name */
    public final C0082a f1823d;

    public H(int i9, n nVar, C1177i c1177i, C0082a c0082a) {
        super(i9);
        this.f1822c = c1177i;
        this.f1821b = nVar;
        this.f1823d = c0082a;
        if (i9 == 2 && nVar.f1862c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // D4.I
    public final void a(Status status) {
        this.f1823d.getClass();
        this.f1822c.c(F4.y.l(status));
    }

    @Override // D4.I
    public final void b(RuntimeException runtimeException) {
        this.f1822c.c(runtimeException);
    }

    @Override // D4.I
    public final void c(t tVar) {
        C1177i c1177i = this.f1822c;
        try {
            n nVar = this.f1821b;
            ((InterfaceC0093l) ((n) nVar.f1864e).f1864e).H(tVar.f1882f, c1177i);
        } catch (DeadObjectException e8) {
            throw e8;
        } catch (RemoteException e9) {
            a(I.e(e9));
        } catch (RuntimeException e10) {
            c1177i.c(e10);
        }
    }

    @Override // D4.I
    public final void d(A1.g gVar, boolean z9) {
        Boolean valueOf = Boolean.valueOf(z9);
        Map map = (Map) gVar.f19c;
        C1177i c1177i = this.f1822c;
        map.put(c1177i, valueOf);
        c1177i.f17413a.k(new A1.g(gVar, c1177i, 7, false));
    }

    @Override // D4.y
    public final boolean f(t tVar) {
        return this.f1821b.f1862c;
    }

    @Override // D4.y
    public final B4.d[] g(t tVar) {
        return (B4.d[]) this.f1821b.f1861b;
    }
}
