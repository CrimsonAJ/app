package B4;

import F4.y;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class n extends S4.c implements F4.t {

    /* renamed from: f, reason: collision with root package name */
    public final int f717f;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 1);
        boolean z9;
        if (bArr.length == 25) {
            z9 = true;
        } else {
            z9 = false;
        }
        y.b(z9);
        this.f717f = Arrays.hashCode(bArr);
    }

    public static byte[] h1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e8) {
            throw new AssertionError(e8);
        }
    }

    public final boolean equals(Object obj) {
        N4.a f9;
        if (obj != null && (obj instanceof F4.t)) {
            try {
                F4.t tVar = (F4.t) obj;
                if (tVar.l() == this.f717f && (f9 = tVar.f()) != null) {
                    return Arrays.equals(i1(), (byte[]) N4.b.i1(f9));
                }
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            }
        }
        return false;
    }

    @Override // F4.t
    public final N4.a f() {
        return new N4.b(i1());
    }

    @Override // S4.c
    public final boolean g1(int i9, Parcel parcel, Parcel parcel2) {
        if (i9 != 1) {
            if (i9 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f717f);
            return true;
        }
        N4.a f9 = f();
        parcel2.writeNoException();
        V4.a.c(parcel2, f9);
        return true;
    }

    public final int hashCode() {
        return this.f717f;
    }

    public abstract byte[] i1();

    @Override // F4.t
    public final int l() {
        return this.f717f;
    }
}
