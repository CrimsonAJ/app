package d0;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.EnumC0555p;
import com.google.firebase.components.ComponentRegistrar;
import h3.InterfaceC1276a;
import java.io.File;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.crypto.Cipher;
import k4.J;
import k4.N;
import l4.AbstractC1566a;
import q3.InterfaceC1907l;
import s6.C1962b;
import u0.C;
import u0.C2042m;
import u0.C2049u;
import x8.C2190j;

/* loaded from: classes.dex */
public class o implements InterfaceC1276a, i6.j, N, J, P6.a, InterfaceC1907l, w6.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16661a;

    public /* synthetic */ o(int i9) {
        this.f16661a = i9;
    }

    public static C2042m e(Context context, C destination, Bundle bundle, EnumC0555p hostLifecycleState, C2049u c2049u) {
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.h.d(uuid, "randomUUID().toString()");
        kotlin.jvm.internal.h.e(destination, "destination");
        kotlin.jvm.internal.h.e(hostLifecycleState, "hostLifecycleState");
        return new C2042m(context, destination, bundle, hostLifecycleState, c2049u, uuid, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, x8.g] */
    public static x8.y g(String str, boolean z9) {
        kotlin.jvm.internal.h.e(str, "<this>");
        C2190j c2190j = y8.c.f25134a;
        ?? obj = new Object();
        obj.B0(str);
        return y8.c.d(obj, z9);
    }

    public static x8.y h(File file) {
        String str = x8.y.f24685b;
        String file2 = file.toString();
        kotlin.jvm.internal.h.d(file2, "toString(...)");
        return g(file2, false);
    }

    @Override // k4.J
    public void a() {
        synchronized (AbstractC1566a.f20480h) {
            Object obj = AbstractC1566a.f20481i;
            synchronized (obj) {
                if (AbstractC1566a.j) {
                    return;
                }
                long a5 = AbstractC1566a.a();
                synchronized (obj) {
                    AbstractC1566a.f20482k = a5;
                    AbstractC1566a.j = true;
                }
            }
        }
    }

    public float d(float f9, float f10) {
        return 1.0f;
    }

    @Override // i6.j
    public Object f(String str, Provider provider) {
        switch (this.f16661a) {
            case 4:
                if (provider == null) {
                    return Cipher.getInstance(str);
                }
                return Cipher.getInstance(str, provider);
            case 5:
                if (provider == null) {
                    return KeyPairGenerator.getInstance(str);
                }
                return KeyPairGenerator.getInstance(str, provider);
            default:
                if (provider == null) {
                    return Signature.getInstance(str);
                }
                return Signature.getInstance(str, provider);
        }
    }

    @Override // q3.InterfaceC1907l
    public void i() {
        throw new UnsupportedOperationException();
    }

    @Override // w6.a
    public void j(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    public List k(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C1962b c1962b : componentRegistrar.getComponents()) {
            String str = c1962b.f22747a;
            if (str != null) {
                N1.h hVar = new N1.h(str, 21, c1962b);
                c1962b = new C1962b(str, c1962b.f22748b, c1962b.f22749c, c1962b.f22750d, c1962b.f22751e, hVar, c1962b.f22753g);
            }
            arrayList.add(c1962b);
        }
        return arrayList;
    }

    @Override // h3.InterfaceC1276a
    public long l() {
        return System.currentTimeMillis();
    }

    @Override // q3.InterfaceC1907l
    public void r(q3.r rVar) {
        throw new UnsupportedOperationException();
    }

    @Override // q3.InterfaceC1907l
    public q3.u u(int i9, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // k4.N
    public void b() {
    }

    @Override // k4.J
    public void c() {
    }
}
