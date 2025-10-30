package Q3;

import android.net.Uri;
import java.io.IOException;
import k4.H;
import k4.J;
import k4.M;
import k4.P;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class f implements H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f6357a;

    public /* synthetic */ f(h hVar) {
        this.f6357a = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public B3.f e(J j, IOException iOException, int i9) {
        P p9 = (P) j;
        h hVar = this.f6357a;
        hVar.getClass();
        long j4 = p9.f20008a;
        Uri uri = p9.f20011d.f20034c;
        hVar.f6381q.j(new Object(), p9.f20010c, iOException, true);
        hVar.f6378n.getClass();
        AbstractC1566a.u("DashMediaSource", "Failed to resolve time offset.", iOException);
        hVar.x(true);
        return M.f20003e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public void f(J j, long j4, long j9) {
        P p9 = (P) j;
        h hVar = this.f6357a;
        hVar.getClass();
        long j10 = p9.f20008a;
        Uri uri = p9.f20011d.f20034c;
        ?? obj = new Object();
        hVar.f6378n.getClass();
        hVar.f6381q.f(obj, p9.f20010c);
        hVar.f6371j0 = ((Long) p9.f20013f).longValue() - j4;
        hVar.x(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public void s(J j, long j4, long j9, boolean z9) {
        P p9 = (P) j;
        h hVar = this.f6357a;
        hVar.getClass();
        long j10 = p9.f20008a;
        Uri uri = p9.f20011d.f20034c;
        ?? obj = new Object();
        hVar.f6378n.getClass();
        hVar.f6381q.d(obj, p9.f20010c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
