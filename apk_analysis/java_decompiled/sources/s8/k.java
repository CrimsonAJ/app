package s8;

import i8.F;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class k extends p {

    /* renamed from: c, reason: collision with root package name */
    public final Method f22803c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f22804d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f22805e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f22806f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f22807g;

    public k(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f22803c = method;
        this.f22804d = method2;
        this.f22805e = method3;
        this.f22806f = cls;
        this.f22807g = cls2;
    }

    @Override // s8.p
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f22805e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e8) {
            throw new AssertionError("failed to remove ALPN", e8);
        } catch (InvocationTargetException e9) {
            throw new AssertionError("failed to remove ALPN", e9);
        }
    }

    @Override // s8.p
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        kotlin.jvm.internal.h.e(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((F) obj) != F.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(B7.m.f0(arrayList, 10));
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj2 = arrayList.get(i9);
            i9++;
            arrayList2.add(((F) obj2).f19004a);
        }
        try {
            this.f22803c.invoke(null, sSLSocket, Proxy.newProxyInstance(p.class.getClassLoader(), new Class[]{this.f22806f, this.f22807g}, new j(arrayList2)));
        } catch (IllegalAccessException e8) {
            throw new AssertionError("failed to set ALPN", e8);
        } catch (InvocationTargetException e9) {
            throw new AssertionError("failed to set ALPN", e9);
        }
    }

    @Override // s8.p
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f22804d.invoke(null, sSLSocket));
            kotlin.jvm.internal.h.c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            j jVar = (j) invocationHandler;
            boolean z9 = jVar.f22801b;
            if (!z9 && jVar.f22802c == null) {
                p.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 6);
                return null;
            }
            if (z9) {
                return null;
            }
            return jVar.f22802c;
        } catch (IllegalAccessException e8) {
            throw new AssertionError("failed to get ALPN selected protocol", e8);
        } catch (InvocationTargetException e9) {
            throw new AssertionError("failed to get ALPN selected protocol", e9);
        }
    }
}
