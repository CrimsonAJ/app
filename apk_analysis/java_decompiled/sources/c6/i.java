package c6;

import android.support.v4.media.session.y;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class i implements U5.m {

    /* renamed from: a, reason: collision with root package name */
    public static final i f11687a = new Object();

    @Override // U5.m
    public final Class a() {
        return g.class;
    }

    @Override // U5.m
    public final Object b(y yVar) {
        if (((U5.k) yVar.f9332c) != null) {
            Iterator it = ((ConcurrentHashMap) yVar.f9331b).values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                }
            }
            return new Object();
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }

    @Override // U5.m
    public final Class c() {
        return g.class;
    }
}
