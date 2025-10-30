package androidx.lifecycle;

import b8.C0718Q;
import b8.InterfaceC0707F;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class U extends E {

    /* renamed from: l, reason: collision with root package name */
    public String f9840l;

    /* renamed from: m, reason: collision with root package name */
    public V f9841m;

    @Override // androidx.lifecycle.E
    public final void i(Object obj) {
        V v8 = this.f9841m;
        if (v8 != null) {
            LinkedHashMap linkedHashMap = v8.f9843a;
            String str = this.f9840l;
            linkedHashMap.put(str, obj);
            InterfaceC0707F interfaceC0707F = (InterfaceC0707F) v8.f9846d.get(str);
            if (interfaceC0707F != null) {
                ((C0718Q) interfaceC0707F).i(obj);
            }
        }
        super.i(obj);
    }
}
