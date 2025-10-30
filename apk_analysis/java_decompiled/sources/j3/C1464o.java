package j3;

import android.util.Base64;
import k3.C1491g;

/* renamed from: j3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1464o implements O5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19700a = 1;

    @Override // O5.n
    public final Object get() {
        switch (this.f19700a) {
            case 0:
                return new C1458i();
            default:
                byte[] bArr = new byte[12];
                C1491g.f19945h.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}
