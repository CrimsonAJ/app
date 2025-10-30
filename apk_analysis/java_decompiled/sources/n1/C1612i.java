package n1;

import java.util.ArrayList;
import w.AbstractC2128h;

/* renamed from: n1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1612i {

    /* renamed from: a, reason: collision with root package name */
    public String f21023a;

    /* renamed from: b, reason: collision with root package name */
    public int f21024b;

    /* renamed from: c, reason: collision with root package name */
    public e1.h f21025c;

    /* renamed from: d, reason: collision with root package name */
    public int f21026d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f21027e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f21028f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1612i) {
                C1612i c1612i = (C1612i) obj;
                if (this.f21026d == c1612i.f21026d) {
                    String str = this.f21023a;
                    if (str != null) {
                        if (!str.equals(c1612i.f21023a)) {
                            return false;
                        }
                    } else if (c1612i.f21023a != null) {
                        return false;
                    }
                    if (this.f21024b == c1612i.f21024b) {
                        e1.h hVar = this.f21025c;
                        if (hVar != null) {
                            if (!hVar.equals(c1612i.f21025c)) {
                                return false;
                            }
                        } else if (c1612i.f21025c != null) {
                            return false;
                        }
                        ArrayList arrayList = this.f21027e;
                        if (arrayList != null) {
                            if (!arrayList.equals(c1612i.f21027e)) {
                                return false;
                            }
                        } else if (c1612i.f21027e != null) {
                            return false;
                        }
                        ArrayList arrayList2 = this.f21028f;
                        ArrayList arrayList3 = c1612i.f21028f;
                        if (arrayList2 != null) {
                            return arrayList2.equals(arrayList3);
                        }
                        if (arrayList3 == null) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11;
        int i12;
        String str = this.f21023a;
        int i13 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i14 = i9 * 31;
        int i15 = this.f21024b;
        if (i15 != 0) {
            i10 = AbstractC2128h.b(i15);
        } else {
            i10 = 0;
        }
        int i16 = (i14 + i10) * 31;
        e1.h hVar = this.f21025c;
        if (hVar != null) {
            i11 = hVar.hashCode();
        } else {
            i11 = 0;
        }
        int i17 = (((i16 + i11) * 31) + this.f21026d) * 31;
        ArrayList arrayList = this.f21027e;
        if (arrayList != null) {
            i12 = arrayList.hashCode();
        } else {
            i12 = 0;
        }
        int i18 = (i17 + i12) * 31;
        ArrayList arrayList2 = this.f21028f;
        if (arrayList2 != null) {
            i13 = arrayList2.hashCode();
        }
        return i18 + i13;
    }
}
