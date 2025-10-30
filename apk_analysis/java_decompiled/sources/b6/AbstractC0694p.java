package b6;

import android.support.v4.media.session.y;
import b5.C0675y;
import e6.C1145a;
import e6.C1146b;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: b6.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0694p {

    /* renamed from: a, reason: collision with root package name */
    public static final C0675y f11388a = new C0675y(28);

    public static void a(y yVar) {
        Integer num;
        U5.f fVar;
        ArrayList arrayList = new ArrayList();
        C1145a c1145a = C1145a.f17215b;
        Iterator it = ((ConcurrentHashMap) yVar.f9331b).values().iterator();
        while (it.hasNext()) {
            for (U5.k kVar : (List) it.next()) {
                int ordinal = kVar.f7510d.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            fVar = U5.f.f7501e;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    } else {
                        fVar = U5.f.f7500d;
                    }
                } else {
                    fVar = U5.f.f7499c;
                }
                String str = kVar.f7513g;
                if (str.startsWith("type.googleapis.com/google.crypto.")) {
                    str = str.substring(34);
                }
                arrayList.add(new C1146b(fVar, kVar.f7512f, str, kVar.f7511e.name()));
            }
        }
        U5.k kVar2 = (U5.k) yVar.f9332c;
        if (kVar2 != null) {
            num = Integer.valueOf(kVar2.f7512f);
        } else {
            num = null;
        }
        if (num != null) {
            try {
                int intValue = num.intValue();
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    if (((C1146b) obj).f17218b == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e8) {
                throw new IllegalStateException(e8);
            }
        }
        Collections.unmodifiableList(arrayList);
    }
}
