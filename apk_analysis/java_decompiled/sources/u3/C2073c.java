package u3;

import A4.r;
import D.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: u3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2073c extends n {

    /* renamed from: b, reason: collision with root package name */
    public long f23626b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f23627c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f23628d;

    public static Serializable m0(int i9, r rVar) {
        if (i9 != 0) {
            boolean z9 = true;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 8) {
                            if (i9 != 10) {
                                if (i9 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(rVar.q()));
                                rVar.I(2);
                                return date;
                            }
                            int A2 = rVar.A();
                            ArrayList arrayList = new ArrayList(A2);
                            for (int i10 = 0; i10 < A2; i10++) {
                                Serializable m02 = m0(rVar.x(), rVar);
                                if (m02 != null) {
                                    arrayList.add(m02);
                                }
                            }
                            return arrayList;
                        }
                        return n0(rVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String o02 = o0(rVar);
                        int x5 = rVar.x();
                        if (x5 == 9) {
                            return hashMap;
                        }
                        Serializable m03 = m0(x5, rVar);
                        if (m03 != null) {
                            hashMap.put(o02, m03);
                        }
                    }
                } else {
                    return o0(rVar);
                }
            } else {
                if (rVar.x() != 1) {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(rVar.q()));
        }
    }

    public static HashMap n0(r rVar) {
        int A2 = rVar.A();
        HashMap hashMap = new HashMap(A2);
        for (int i9 = 0; i9 < A2; i9++) {
            String o02 = o0(rVar);
            Serializable m02 = m0(rVar.x(), rVar);
            if (m02 != null) {
                hashMap.put(o02, m02);
            }
        }
        return hashMap;
    }

    public static String o0(r rVar) {
        int C8 = rVar.C();
        int i9 = rVar.f382a;
        rVar.I(C8);
        return new String((byte[]) rVar.f384c, i9, C8);
    }
}
