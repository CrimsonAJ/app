package i4;

import N3.m0;
import P5.AbstractC0356y;
import P5.P;
import P5.Q;
import P5.S;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;
import j3.M;
import java.util.Locale;
import l4.y;

/* loaded from: classes.dex */
public final class e extends m implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public final int f18511e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18512f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18513g;

    /* renamed from: h, reason: collision with root package name */
    public final h f18514h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f18515i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18516k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18517l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f18518m;

    /* renamed from: n, reason: collision with root package name */
    public final int f18519n;

    /* renamed from: o, reason: collision with root package name */
    public final int f18520o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f18521p;

    /* renamed from: q, reason: collision with root package name */
    public final int f18522q;

    /* renamed from: r, reason: collision with root package name */
    public final int f18523r;

    /* renamed from: s, reason: collision with root package name */
    public final int f18524s;

    /* renamed from: t, reason: collision with root package name */
    public final int f18525t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f18526u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f18527v;

    public e(int i9, m0 m0Var, int i10, h hVar, int i11, boolean z9, d dVar) {
        super(i9, m0Var, i10);
        int i12;
        int i13;
        int bitCount;
        boolean z10;
        boolean z11;
        boolean z12;
        String locale;
        String[] strArr;
        int i14;
        boolean z13;
        boolean z14;
        boolean z15;
        LocaleList locales;
        String languageTags;
        this.f18514h = hVar;
        this.f18513g = o.g(this.f18571d.f19427c);
        int i15 = 0;
        this.f18515i = o.e(i11, false);
        int i16 = 0;
        while (true) {
            S s9 = hVar.f18637n;
            i12 = Integer.MAX_VALUE;
            if (i16 < s9.f5928d) {
                i13 = o.c(this.f18571d, (String) s9.get(i16), false);
                if (i13 > 0) {
                    break;
                } else {
                    i16++;
                }
            } else {
                i13 = 0;
                i16 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f18516k = i16;
        this.j = i13;
        int i17 = this.f18571d.f19429e;
        int i18 = hVar.f18638o;
        if (i17 != 0 && i17 == i18) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i17 & i18);
        }
        this.f18517l = bitCount;
        M m9 = this.f18571d;
        int i19 = m9.f19429e;
        if (i19 != 0 && (i19 & 1) == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f18518m = z10;
        if ((m9.f19428d & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f18521p = z11;
        int i20 = m9.f19448y;
        this.f18522q = i20;
        this.f18523r = m9.f19449z;
        int i21 = m9.f19432h;
        this.f18524s = i21;
        if ((i21 == -1 || i21 <= hVar.f18640q) && ((i20 == -1 || i20 <= hVar.f18639p) && dVar.apply(m9))) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f18512f = z12;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i22 = y.f20553a;
        if (i22 >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            strArr = languageTags.split(",", -1);
        } else {
            Locale locale2 = configuration.locale;
            if (i22 >= 21) {
                locale = locale2.toLanguageTag();
            } else {
                locale = locale2.toString();
            }
            strArr = new String[]{locale};
        }
        for (int i23 = 0; i23 < strArr.length; i23++) {
            strArr[i23] = y.I(strArr[i23]);
        }
        int i24 = 0;
        while (true) {
            if (i24 < strArr.length) {
                i14 = o.c(this.f18571d, strArr[i24], false);
                if (i14 > 0) {
                    break;
                } else {
                    i24++;
                }
            } else {
                i14 = 0;
                i24 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f18519n = i24;
        this.f18520o = i14;
        int i25 = 0;
        while (true) {
            S s10 = hVar.f18641r;
            if (i25 >= s10.f5928d) {
                break;
            }
            String str = this.f18571d.f19435l;
            if (str != null && str.equals(s10.get(i25))) {
                i12 = i25;
                break;
            }
            i25++;
        }
        this.f18525t = i12;
        if ((i11 & 384) == 128) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f18526u = z13;
        if ((i11 & 64) == 64) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f18527v = z14;
        h hVar2 = this.f18514h;
        if (o.e(i11, hVar2.f18554j0) && ((z15 = this.f18512f) || hVar2.Y)) {
            i15 = (!o.e(i11, false) || !z15 || this.f18571d.f19432h == -1 || hVar2.f18647x || hVar2.f18646w || (!hVar2.f18556l0 && z9)) ? 1 : 2;
        }
        this.f18511e = i15;
    }

    @Override // i4.m
    public final int a() {
        return this.f18511e;
    }

    @Override // i4.m
    public final boolean b(m mVar) {
        int i9;
        String str;
        int i10;
        e eVar = (e) mVar;
        h hVar = this.f18514h;
        boolean z9 = hVar.f18551g0;
        M m9 = eVar.f18571d;
        M m10 = this.f18571d;
        if (z9 || ((i10 = m10.f19448y) != -1 && i10 == m9.f19448y)) {
            if (hVar.f18549Z || ((str = m10.f19435l) != null && TextUtils.equals(str, m9.f19435l))) {
                if (hVar.f18550f0 || ((i9 = m10.f19449z) != -1 && i9 == m9.f19449z)) {
                    if (!hVar.f18552h0) {
                        if (this.f18526u != eVar.f18526u || this.f18527v != eVar.f18527v) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        Q a5;
        Q q9;
        boolean z9 = this.f18515i;
        boolean z10 = this.f18512f;
        if (z10 && z9) {
            a5 = o.j;
        } else {
            a5 = o.j.a();
        }
        AbstractC0356y c3 = AbstractC0356y.f6012a.c(z9, eVar.f18515i);
        Integer valueOf = Integer.valueOf(this.f18516k);
        Integer valueOf2 = Integer.valueOf(eVar.f18516k);
        P p9 = P.f5924c;
        AbstractC0356y b9 = c3.b(valueOf, valueOf2, p9).a(this.j, eVar.j).a(this.f18517l, eVar.f18517l).c(this.f18521p, eVar.f18521p).c(this.f18518m, eVar.f18518m).b(Integer.valueOf(this.f18519n), Integer.valueOf(eVar.f18519n), p9).a(this.f18520o, eVar.f18520o).c(z10, eVar.f18512f).b(Integer.valueOf(this.f18525t), Integer.valueOf(eVar.f18525t), p9);
        int i9 = this.f18524s;
        Integer valueOf3 = Integer.valueOf(i9);
        int i10 = eVar.f18524s;
        Integer valueOf4 = Integer.valueOf(i10);
        if (this.f18514h.f18646w) {
            q9 = o.j.a();
        } else {
            q9 = o.f18585k;
        }
        AbstractC0356y b10 = b9.b(valueOf3, valueOf4, q9).c(this.f18526u, eVar.f18526u).c(this.f18527v, eVar.f18527v).b(Integer.valueOf(this.f18522q), Integer.valueOf(eVar.f18522q), a5).b(Integer.valueOf(this.f18523r), Integer.valueOf(eVar.f18523r), a5);
        Integer valueOf5 = Integer.valueOf(i9);
        Integer valueOf6 = Integer.valueOf(i10);
        if (!y.a(this.f18513g, eVar.f18513g)) {
            a5 = o.f18585k;
        }
        return b10.b(valueOf5, valueOf6, a5).e();
    }
}
