package c6;

import android.support.v4.media.session.y;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class p implements U5.m {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f11701a = Logger.getLogger(p.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f11702b = {0};

    /* renamed from: c, reason: collision with root package name */
    public static final p f11703c = new Object();

    @Override // U5.m
    public final Class a() {
        return U5.j.class;
    }

    @Override // U5.m
    public final Object b(y yVar) {
        byte[] copyOf;
        Iterator it = ((ConcurrentHashMap) yVar.f9331b).values().iterator();
        while (it.hasNext()) {
            for (U5.k kVar : (List) it.next()) {
                U5.b bVar = kVar.f7514h;
                if (bVar instanceof n) {
                    n nVar = (n) bVar;
                    byte[] bArr = kVar.f7509c;
                    if (bArr == null) {
                        copyOf = null;
                    } else {
                        copyOf = Arrays.copyOf(bArr, bArr.length);
                    }
                    k6.a a5 = k6.a.a(copyOf);
                    if (!a5.equals(nVar.b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + nVar.c() + " has wrong output prefix (" + nVar.b() + ") instead of (" + a5 + ")");
                    }
                }
            }
        }
        return new o(yVar);
    }

    @Override // U5.m
    public final Class c() {
        return U5.j.class;
    }
}
