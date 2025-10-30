package y;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import x.C2148c;
import x.C2149d;
import x.C2150e;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f24702k;

    /* renamed from: l, reason: collision with root package name */
    public int f24703l;

    public c(C2149d c2149d, int i9) {
        super(c2149d);
        C2149d c2149d2;
        l lVar;
        int i10;
        l lVar2;
        this.f24702k = new ArrayList();
        this.f24726f = i9;
        C2149d c2149d3 = this.f24722b;
        C2149d k5 = c2149d3.k(i9);
        while (true) {
            C2149d c2149d4 = k5;
            c2149d2 = c2149d3;
            c2149d3 = c2149d4;
            if (c2149d3 == null) {
                break;
            } else {
                k5 = c2149d3.k(this.f24726f);
            }
        }
        this.f24722b = c2149d2;
        int i11 = this.f24726f;
        if (i11 == 0) {
            lVar = c2149d2.f24375d;
        } else if (i11 == 1) {
            lVar = c2149d2.f24376e;
        } else {
            lVar = null;
        }
        ArrayList arrayList = this.f24702k;
        arrayList.add(lVar);
        C2149d j = c2149d2.j(this.f24726f);
        while (j != null) {
            int i12 = this.f24726f;
            if (i12 == 0) {
                lVar2 = j.f24375d;
            } else if (i12 == 1) {
                lVar2 = j.f24376e;
            } else {
                lVar2 = null;
            }
            arrayList.add(lVar2);
            j = j.j(this.f24726f);
        }
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            l lVar3 = (l) obj;
            int i14 = this.f24726f;
            if (i14 == 0) {
                lVar3.f24722b.f24371b = this;
            } else if (i14 == 1) {
                lVar3.f24722b.f24373c = this;
            }
        }
        if (this.f24726f == 0 && ((C2150e) this.f24722b.f24353I).f24401h0 && arrayList.size() > 1) {
            this.f24722b = ((l) arrayList.get(arrayList.size() - 1)).f24722b;
        }
        if (this.f24726f == 0) {
            i10 = this.f24722b.f24367X;
        } else {
            i10 = this.f24722b.Y;
        }
        this.f24703l = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x019f, code lost:
    
        if (r1 != r10) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c4, code lost:
    
        r3.d(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c1, code lost:
    
        r15 = r15 + 1;
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01bf, code lost:
    
        if (r1 != r10) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x03b6, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00df  */
    @Override // y.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(y.d r28) {
        /*
            Method dump skipped, instructions count: 981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.c.a(y.d):void");
    }

    @Override // y.l
    public final void d() {
        ArrayList arrayList = this.f24702k;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((l) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        C2149d c2149d = ((l) arrayList.get(0)).f24722b;
        C2149d c2149d2 = ((l) arrayList.get(size2 - 1)).f24722b;
        int i10 = this.f24726f;
        e eVar = this.f24729i;
        e eVar2 = this.f24728h;
        if (i10 == 0) {
            C2148c c2148c = c2149d.f24394x;
            C2148c c2148c2 = c2149d2.f24396z;
            e i11 = l.i(c2148c, 0);
            int c3 = c2148c.c();
            C2149d m9 = m();
            if (m9 != null) {
                c3 = m9.f24394x.c();
            }
            if (i11 != null) {
                l.b(eVar2, i11, c3);
            }
            e i12 = l.i(c2148c2, 0);
            int c9 = c2148c2.c();
            C2149d n7 = n();
            if (n7 != null) {
                c9 = n7.f24396z.c();
            }
            if (i12 != null) {
                l.b(eVar, i12, -c9);
            }
        } else {
            C2148c c2148c3 = c2149d.f24395y;
            C2148c c2148c4 = c2149d2.f24345A;
            e i13 = l.i(c2148c3, 1);
            int c10 = c2148c3.c();
            C2149d m10 = m();
            if (m10 != null) {
                c10 = m10.f24395y.c();
            }
            if (i13 != null) {
                l.b(eVar2, i13, c10);
            }
            e i14 = l.i(c2148c4, 1);
            int c11 = c2148c4.c();
            C2149d n9 = n();
            if (n9 != null) {
                c11 = n9.f24345A.c();
            }
            if (i14 != null) {
                l.b(eVar, i14, -c11);
            }
        }
        eVar2.f24704a = this;
        eVar.f24704a = this;
    }

    @Override // y.l
    public final void e() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f24702k;
            if (i9 < arrayList.size()) {
                ((l) arrayList.get(i9)).e();
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // y.l
    public final void f() {
        this.f24723c = null;
        ArrayList arrayList = this.f24702k;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((l) obj).f();
        }
    }

    @Override // y.l
    public final long j() {
        ArrayList arrayList = this.f24702k;
        int size = arrayList.size();
        long j = 0;
        for (int i9 = 0; i9 < size; i9++) {
            j = r5.f24729i.f24709f + ((l) arrayList.get(i9)).j() + j + r5.f24728h.f24709f;
        }
        return j;
    }

    @Override // y.l
    public final boolean k() {
        ArrayList arrayList = this.f24702k;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (!((l) arrayList.get(i9)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C2149d m() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f24702k;
            if (i9 < arrayList.size()) {
                C2149d c2149d = ((l) arrayList.get(i9)).f24722b;
                if (c2149d.f24365V != 8) {
                    return c2149d;
                }
                i9++;
            } else {
                return null;
            }
        }
    }

    public final C2149d n() {
        ArrayList arrayList = this.f24702k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2149d c2149d = ((l) arrayList.get(size)).f24722b;
            if (c2149d.f24365V != 8) {
                return c2149d;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        if (this.f24726f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        String concat = "ChainRun ".concat(str);
        ArrayList arrayList = this.f24702k;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            concat = AbstractC0953k1.n(AbstractC0953k1.n(concat, "<") + ((l) obj), "> ");
        }
        return concat;
    }
}
