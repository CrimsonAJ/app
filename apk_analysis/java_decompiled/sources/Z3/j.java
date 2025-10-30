package Z3;

import f5.AbstractC1176h;
import f5.InterfaceC1169a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l4.AbstractC1566a;
import s8.n;

/* loaded from: classes.dex */
public final class j implements Y3.g, InterfaceC1169a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9055a;

    /* renamed from: b, reason: collision with root package name */
    public List f9056b;

    @Override // Y3.g
    public int J() {
        switch (this.f9055a) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }

    @Override // Y3.g
    public int a(long j) {
        switch (this.f9055a) {
            case 0:
                return j < 0 ? 0 : -1;
            default:
                return -1;
        }
    }

    @Override // f5.InterfaceC1169a
    public /* bridge */ /* synthetic */ Object i(AbstractC1176h abstractC1176h) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f9056b);
        return n.p(arrayList);
    }

    @Override // Y3.g
    public long m(int i9) {
        boolean z9;
        switch (this.f9055a) {
            case 0:
                if (i9 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC1566a.h(z9);
                return 0L;
            default:
                return 0L;
        }
    }

    @Override // Y3.g
    public List w(long j) {
        switch (this.f9055a) {
            case 0:
                if (j >= 0) {
                    return this.f9056b;
                }
                return Collections.EMPTY_LIST;
            default:
                return this.f9056b;
        }
    }

    public /* synthetic */ j(List list, int i9) {
        this.f9055a = i9;
        this.f9056b = list;
    }
}
