package i4;

import F0.C0096b;
import j3.G0;
import j3.w0;
import l4.y;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f18650a;

    /* renamed from: b, reason: collision with root package name */
    public final w0[] f18651b;

    /* renamed from: c, reason: collision with root package name */
    public final q[] f18652c;

    /* renamed from: d, reason: collision with root package name */
    public final G0 f18653d;

    /* renamed from: e, reason: collision with root package name */
    public final C0096b f18654e;

    public w(w0[] w0VarArr, q[] qVarArr, G0 g02, C0096b c0096b) {
        this.f18651b = w0VarArr;
        this.f18652c = (q[]) qVarArr.clone();
        this.f18653d = g02;
        this.f18654e = c0096b;
        this.f18650a = w0VarArr.length;
    }

    public final boolean a(w wVar, int i9) {
        if (wVar == null || !y.a(this.f18651b[i9], wVar.f18651b[i9]) || !y.a(this.f18652c[i9], wVar.f18652c[i9])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i9) {
        if (this.f18651b[i9] != null) {
            return true;
        }
        return false;
    }
}
