package F0;

import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2009a;

    /* renamed from: b, reason: collision with root package name */
    public int f2010b;

    /* renamed from: c, reason: collision with root package name */
    public int f2011c;

    /* renamed from: d, reason: collision with root package name */
    public int f2012d;

    /* renamed from: e, reason: collision with root package name */
    public int f2013e;

    /* renamed from: f, reason: collision with root package name */
    public int f2014f;

    /* renamed from: g, reason: collision with root package name */
    public int f2015g;

    /* renamed from: h, reason: collision with root package name */
    public int f2016h;

    /* renamed from: i, reason: collision with root package name */
    public int f2017i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public List f2018k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2019l;

    public final void a(View view) {
        int c3;
        int size = this.f2018k.size();
        View view2 = null;
        int i9 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((r0) this.f2018k.get(i10)).f2210a;
            C0099c0 c0099c0 = (C0099c0) view3.getLayoutParams();
            if (view3 != view && !c0099c0.f2083a.i() && (c3 = (c0099c0.f2083a.c() - this.f2012d) * this.f2013e) >= 0 && c3 < i9) {
                view2 = view3;
                if (c3 == 0) {
                    break;
                } else {
                    i9 = c3;
                }
            }
        }
        if (view2 == null) {
            this.f2012d = -1;
        } else {
            this.f2012d = ((C0099c0) view2.getLayoutParams()).f2083a.c();
        }
    }

    public final View b(h0 h0Var) {
        List list = this.f2018k;
        if (list != null) {
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view = ((r0) this.f2018k.get(i9)).f2210a;
                C0099c0 c0099c0 = (C0099c0) view.getLayoutParams();
                if (!c0099c0.f2083a.i() && this.f2012d == c0099c0.f2083a.c()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = h0Var.k(Long.MAX_VALUE, this.f2012d).f2210a;
        this.f2012d += this.f2013e;
        return view2;
    }
}
