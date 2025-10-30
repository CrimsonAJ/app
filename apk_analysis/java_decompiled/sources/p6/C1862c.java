package p6;

import F4.y;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C0922e0;
import com.google.android.gms.internal.measurement.C0952k0;
import f5.C1183o;
import java.util.concurrent.ConcurrentHashMap;
import k4.C1499E;
import q6.AbstractC1916a;
import s4.i;
import w4.InterfaceC2139a;

/* renamed from: p6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1862c implements InterfaceC1861b {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C1862c f22196c;

    /* renamed from: a, reason: collision with root package name */
    public final i f22197a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f22198b;

    public C1862c(i iVar) {
        y.h(iVar);
        this.f22197a = iVar;
        this.f22198b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (AbstractC1916a.c(str) && AbstractC1916a.b(str2, bundle) && AbstractC1916a.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            C0952k0 c0952k0 = (C0952k0) this.f22197a.f22734a;
            c0952k0.getClass();
            c0952k0.b(new C0922e0(c0952k0, str, str2, bundle, true));
        }
    }

    public final e0.c b(String str, C1499E c1499e) {
        InterfaceC2139a interfaceC2139a;
        if (AbstractC1916a.c(str)) {
            boolean isEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f22198b;
            if (isEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean equals = "fiam".equals(str);
                i iVar = this.f22197a;
                if (equals) {
                    interfaceC2139a = new C1499E(iVar, c1499e);
                } else if ("clx".equals(str)) {
                    interfaceC2139a = new C1183o(iVar, c1499e);
                } else {
                    interfaceC2139a = null;
                }
                if (interfaceC2139a != null) {
                    concurrentHashMap.put(str, interfaceC2139a);
                    return new e0.c(10);
                }
            }
        }
        return null;
    }
}
