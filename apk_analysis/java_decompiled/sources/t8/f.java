package t8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import s8.p;

/* loaded from: classes.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f23326f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Class f23327a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f23328b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f23329c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f23330d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f23331e;

    public f(Class cls) {
        this.f23327a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        kotlin.jvm.internal.h.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f23328b = declaredMethod;
        this.f23329c = cls.getMethod("setHostname", String.class);
        this.f23330d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f23331e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // t8.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.f23327a.isInstance(sSLSocket);
    }

    @Override // t8.m
    public final String b(SSLSocket sSLSocket) {
        if (this.f23327a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f23330d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, W7.a.f7934a);
                }
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (InvocationTargetException e9) {
                Throwable cause = e9.getCause();
                if (!(cause instanceof NullPointerException) || !kotlin.jvm.internal.h.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e9);
                }
            }
        }
        return null;
    }

    @Override // t8.m
    public final boolean c() {
        boolean z9 = s8.d.f22788e;
        return s8.d.f22788e;
    }

    @Override // t8.m
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        if (this.f23327a.isInstance(sSLSocket)) {
            try {
                this.f23328b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f23329c.invoke(sSLSocket, str);
                }
                Method method = this.f23331e;
                p pVar = p.f22822a;
                method.invoke(sSLSocket, e0.c.A(protocols));
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (InvocationTargetException e9) {
                throw new AssertionError(e9);
            }
        }
    }
}
