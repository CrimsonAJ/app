package A5;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import android.view.View;
import androidx.mediarouter.app.C0568d;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.D1;
import i0.Z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import javax.crypto.AEADBadTagException;
import s.C1939i;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public Object f452a;

    /* renamed from: b, reason: collision with root package name */
    public Object f453b;

    public q(Context context) {
        this.f452a = context;
    }

    public static float j(int i9, int i10, int i11) {
        return (i9 - i10) / i11;
    }

    public static byte[] n(byte[] bArr, ByteBuffer byteBuffer) {
        int length;
        int i9;
        if (bArr.length % 16 == 0) {
            length = bArr.length;
        } else {
            length = (bArr.length + 16) - (bArr.length % 16);
        }
        int remaining = byteBuffer.remaining();
        int i10 = remaining % 16;
        if (i10 == 0) {
            i9 = remaining;
        } else {
            i9 = (remaining + 16) - i10;
        }
        int i11 = i9 + length;
        ByteBuffer order = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i11);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    public abstract void c();

    public void d() {
        C0568d c0568d = (C0568d) this.f452a;
        if (c0568d != null) {
            try {
                ((i.w) this.f453b).f18130k.unregisterReceiver(c0568d);
            } catch (IllegalArgumentException unused) {
            }
            this.f452a = null;
        }
    }

    public void e() {
        Z z9 = (Z) this.f452a;
        L.c cVar = (L.c) this.f453b;
        LinkedHashSet linkedHashSet = z9.f18278e;
        if (linkedHashSet.remove(cVar) && linkedHashSet.isEmpty()) {
            z9.b();
        }
    }

    public abstract IntentFilter f();

    public byte[] g(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                ((W5.d) this.f453b).a(0, bArr).get(bArr4);
                if (MessageDigest.isEqual(D1.i(bArr4, n(bArr2, byteBuffer)), bArr3)) {
                    byteBuffer.position(position);
                    W5.d dVar = (W5.d) this.f452a;
                    dVar.getClass();
                    ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                    dVar.k(bArr, allocate, byteBuffer);
                    return allocate.array();
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e8) {
                throw new AEADBadTagException(e8.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public void h(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            W5.d dVar = (W5.d) this.f452a;
            dVar.getClass();
            if (byteBuffer.remaining() >= bArr2.length) {
                dVar.k(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
                byteBuffer.position(position);
                byteBuffer.limit(byteBuffer.limit() - 16);
                if (bArr3 == null) {
                    bArr3 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                ((W5.d) this.f453b).a(0, bArr).get(bArr4);
                byte[] i9 = D1.i(bArr4, n(bArr3, byteBuffer));
                byteBuffer.limit(byteBuffer.limit() + 16);
                byteBuffer.put(i9);
                return;
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public abstract int i();

    public MenuItem k(MenuItem menuItem) {
        if (menuItem instanceof J.a) {
            J.a aVar = (J.a) menuItem;
            if (((C1939i) this.f453b) == null) {
                this.f453b = new C1939i(0);
            }
            MenuItem menuItem2 = (MenuItem) ((C1939i) this.f453b).get(aVar);
            if (menuItem2 == null) {
                o.s sVar = new o.s((Context) this.f452a, aVar);
                ((C1939i) this.f453b).put(aVar, sVar);
                return sVar;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public abstract void l();

    public boolean m() {
        Z z9 = (Z) this.f452a;
        View view = z9.f18276c.Y;
        kotlin.jvm.internal.h.d(view, "operation.fragment.mView");
        int i9 = 4;
        if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
            int visibility = view.getVisibility();
            if (visibility != 0) {
                if (visibility != 4) {
                    if (visibility == 8) {
                        i9 = 3;
                    } else {
                        throw new IllegalArgumentException(AbstractC0953k1.j(visibility, "Unknown visibility "));
                    }
                }
            } else {
                i9 = 2;
            }
        }
        int i10 = z9.f18274a;
        if (i9 != i10) {
            if (i9 == 2 || i10 == 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public abstract W5.d o(int i9, byte[] bArr);

    public abstract void p();

    public abstract void q(c cVar);

    public abstract void r();

    public void s() {
        d();
        IntentFilter f9 = f();
        if (f9.countActions() == 0) {
            return;
        }
        if (((C0568d) this.f452a) == null) {
            this.f452a = new C0568d(2, this);
        }
        ((i.w) this.f453b).f18130k.registerReceiver((C0568d) this.f452a, f9);
    }

    public abstract void t();

    public abstract void u();

    public q(int i9) {
        this.f453b = new ArrayList();
        for (int i10 = 0; i10 < i9; i10++) {
            ((ArrayList) this.f453b).add(new Object());
        }
    }

    public q(Z z9, L.c cVar) {
        this.f452a = z9;
        this.f453b = cVar;
    }

    public q(i.w wVar) {
        this.f453b = wVar;
    }
}
