package k4;

import B6.u0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* renamed from: k4.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1496B extends C1514n {

    /* renamed from: c, reason: collision with root package name */
    public final int f19981c;

    public C1496B(int i9) {
        super(i9 == 2000 ? 2001 : i9);
        this.f19981c = 1;
    }

    public static C1496B a(int i9, IOException iOException) {
        int i10;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i10 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i10 = 1004;
        } else if (message != null && u0.L(message).matches("cleartext.*not permitted.*")) {
            i10 = 2007;
        } else {
            i10 = 2001;
        }
        if (i10 == 2007) {
            return new C1496B("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, 2007);
        }
        return new C1496B(i10, i9, iOException);
    }

    public C1496B(String str, int i9) {
        super(str, i9 == 2000 ? 2001 : i9);
        this.f19981c = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1496B(int r2, int r3, java.io.IOException r4) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r2 != r0) goto L9
            r0 = 1
            if (r3 != r0) goto L9
            r2 = 2001(0x7d1, float:2.804E-42)
        L9:
            r1.<init>(r4, r2)
            r1.f19981c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.C1496B.<init>(int, int, java.io.IOException):void");
    }

    public C1496B(String str, IOException iOException, int i9) {
        super(str, iOException, i9 == 2000 ? 2001 : i9);
        this.f19981c = 1;
    }
}
