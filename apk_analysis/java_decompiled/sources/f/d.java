package f;

import android.os.Bundle;
import androidx.lifecycle.EnumC0554o;
import androidx.lifecycle.InterfaceC0559u;
import androidx.lifecycle.InterfaceC0561w;
import d.C1065f;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d implements InterfaceC0559u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f17227b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v4.e f17228c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1065f f17229d;

    public d(C1065f c1065f, String str, b bVar, v4.e eVar) {
        this.f17229d = c1065f;
        this.f17226a = str;
        this.f17227b = bVar;
        this.f17228c = eVar;
    }

    @Override // androidx.lifecycle.InterfaceC0559u
    public final void d(InterfaceC0561w interfaceC0561w, EnumC0554o enumC0554o) {
        boolean equals = EnumC0554o.ON_START.equals(enumC0554o);
        String str = this.f17226a;
        C1065f c1065f = this.f17229d;
        if (equals) {
            HashMap hashMap = c1065f.f16569e;
            b bVar = this.f17227b;
            v4.e eVar = this.f17228c;
            hashMap.put(str, new f(bVar, eVar));
            HashMap hashMap2 = c1065f.f16570f;
            if (hashMap2.containsKey(str)) {
                Object obj = hashMap2.get(str);
                hashMap2.remove(str);
                bVar.d(obj);
            }
            Bundle bundle = c1065f.f16571g;
            C1148a c1148a = (C1148a) bundle.getParcelable(str);
            if (c1148a != null) {
                bundle.remove(str);
                bVar.d(eVar.K(c1148a.f17225b, c1148a.f17224a));
                return;
            }
            return;
        }
        if (EnumC0554o.ON_STOP.equals(enumC0554o)) {
            c1065f.f16569e.remove(str);
        } else if (EnumC0554o.ON_DESTROY.equals(enumC0554o)) {
            c1065f.f(str);
        }
    }
}
