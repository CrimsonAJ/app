package C7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends f implements Iterator, P7.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1630e;

    public d(g map, int i9) {
        this.f1630e = i9;
        kotlin.jvm.internal.h.e(map, "map");
        this.f1637d = map;
        this.f1635b = -1;
        this.f1636c = map.f1646h;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1630e) {
            case 0:
                b();
                int i9 = this.f1634a;
                g gVar = (g) this.f1637d;
                if (i9 < gVar.f1644f) {
                    this.f1634a = i9 + 1;
                    this.f1635b = i9;
                    e eVar = new e(gVar, i9);
                    e();
                    return eVar;
                }
                throw new NoSuchElementException();
            case 1:
                b();
                int i10 = this.f1634a;
                g gVar2 = (g) this.f1637d;
                if (i10 < gVar2.f1644f) {
                    this.f1634a = i10 + 1;
                    this.f1635b = i10;
                    Object obj = gVar2.f1639a[i10];
                    e();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                b();
                int i11 = this.f1634a;
                g gVar3 = (g) this.f1637d;
                if (i11 < gVar3.f1644f) {
                    this.f1634a = i11 + 1;
                    this.f1635b = i11;
                    Object[] objArr = gVar3.f1640b;
                    kotlin.jvm.internal.h.b(objArr);
                    Object obj2 = objArr[this.f1635b];
                    e();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }
}
