package F5;

import N3.AbstractC0250a;
import N3.B;
import N3.C0269u;
import N3.G;
import N3.InterfaceC0272x;
import N3.g0;
import a.AbstractC0485a;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import b7.C0701c;
import j3.C1456g0;
import j3.E0;
import j3.J;
import j3.h0;
import j3.i0;
import j3.u0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import k3.C1489e;
import k4.W;
import l4.y;
import n3.C1635l;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2531a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2532b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2533c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2534d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2535e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2536f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2537g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2538h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2539i;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public Object f2540k;

    /* renamed from: l, reason: collision with root package name */
    public Object f2541l;

    public o() {
        this.f2532b = new w[4];
        this.f2533c = new Matrix[4];
        this.f2534d = new Matrix[4];
        this.f2535e = new PointF();
        this.f2536f = new Path();
        this.f2537g = new Path();
        this.j = new w();
        this.f2540k = new float[2];
        this.f2541l = new float[2];
        this.f2538h = new Path();
        this.f2539i = new Path();
        this.f2531a = true;
        for (int i9 = 0; i9 < 4; i9++) {
            ((w[]) this.f2532b)[i9] = new w();
            ((Matrix[]) this.f2533c)[i9] = new Matrix();
            ((Matrix[]) this.f2534d)[i9] = new Matrix();
        }
    }

    public E0 a(int i9, ArrayList arrayList, g0 g0Var) {
        if (!arrayList.isEmpty()) {
            this.f2540k = g0Var;
            for (int i10 = i9; i10 < arrayList.size() + i9; i10++) {
                i0 i0Var = (i0) arrayList.get(i10 - i9);
                ArrayList arrayList2 = (ArrayList) this.f2533c;
                if (i10 > 0) {
                    i0 i0Var2 = (i0) arrayList2.get(i10 - 1);
                    i0Var.f19650d = i0Var2.f19647a.f5195o.f5173b.o() + i0Var2.f19650d;
                    i0Var.f19651e = false;
                    i0Var.f19649c.clear();
                } else {
                    i0Var.f19650d = 0;
                    i0Var.f19651e = false;
                    i0Var.f19649c.clear();
                }
                int o9 = i0Var.f19647a.f5195o.f5173b.o();
                for (int i11 = i10; i11 < arrayList2.size(); i11++) {
                    ((i0) arrayList2.get(i11)).f19650d += o9;
                }
                arrayList2.add(i10, i0Var);
                ((HashMap) this.f2535e).put(i0Var.f19648b, i0Var);
                if (this.f2531a) {
                    g(i0Var);
                    if (((IdentityHashMap) this.f2534d).isEmpty()) {
                        ((HashSet) this.j).add(i0Var);
                    } else {
                        h0 h0Var = (h0) ((HashMap) this.f2539i).get(i0Var);
                        if (h0Var != null) {
                            h0Var.f19635a.c(h0Var.f19636b);
                        }
                    }
                }
            }
        }
        return c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public void b(m mVar, float f9, RectF rectF, C0701c c0701c, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        w[] wVarArr;
        int i9;
        boolean z9;
        float[] fArr;
        float abs;
        e eVar;
        boolean z10;
        c cVar;
        AbstractC0485a abstractC0485a;
        int i10;
        path.rewind();
        Path path2 = (Path) this.f2536f;
        path2.rewind();
        Path path3 = (Path) this.f2537g;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            matrixArr = (Matrix[]) this.f2534d;
            matrixArr2 = (Matrix[]) this.f2533c;
            wVarArr = (w[]) this.f2532b;
            z9 = 0;
            fArr = (float[]) this.f2540k;
            if (i11 >= 4) {
                break;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        cVar = mVar.f2524f;
                    } else {
                        cVar = mVar.f2523e;
                    }
                } else {
                    cVar = mVar.f2526h;
                }
            } else {
                cVar = mVar.f2525g;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        abstractC0485a = mVar.f2520b;
                    } else {
                        abstractC0485a = mVar.f2519a;
                    }
                } else {
                    abstractC0485a = mVar.f2522d;
                }
            } else {
                abstractC0485a = mVar.f2521c;
            }
            w wVar = wVarArr[i11];
            abstractC0485a.getClass();
            abstractC0485a.p(wVar, f9, cVar.a(rectF));
            int i12 = i11 + 1;
            float f10 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = (PointF) this.f2535e;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        i10 = i11;
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        i10 = i11;
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    i10 = i11;
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                i10 = i11;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i10].setTranslate(pointF.x, pointF.y);
            matrixArr2[i10].preRotate(f10);
            w wVar2 = wVarArr[i10];
            fArr[0] = wVar2.f2562c;
            fArr[1] = wVar2.f2563d;
            matrixArr2[i10].mapPoints(fArr);
            matrixArr[i10].reset();
            matrixArr[i10].setTranslate(fArr[0], fArr[1]);
            matrixArr[i10].preRotate(f10);
            i11 = i12;
        }
        int i13 = 0;
        for (i9 = 4; i13 < i9; i9 = 4) {
            w wVar3 = wVarArr[i13];
            fArr[z9] = wVar3.f2560a;
            fArr[1] = wVar3.f2561b;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path.moveTo(fArr[z9], fArr[1]);
            } else {
                path.lineTo(fArr[z9], fArr[1]);
            }
            wVarArr[i13].b(matrixArr2[i13], path);
            if (c0701c != null) {
                w wVar4 = wVarArr[i13];
                Matrix matrix = matrixArr2[i13];
                h hVar = (h) c0701c.f11404b;
                BitSet bitSet = hVar.f2486d;
                wVar4.getClass();
                bitSet.set(i13, z9);
                wVar4.a(wVar4.f2565f);
                hVar.f2484b[i13] = new p(new ArrayList(wVar4.f2567h), new Matrix(matrix));
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            w wVar5 = wVarArr[i13];
            fArr[0] = wVar5.f2562c;
            fArr[1] = wVar5.f2563d;
            matrixArr2[i13].mapPoints(fArr);
            w wVar6 = wVarArr[i15];
            float f11 = wVar6.f2560a;
            float[] fArr2 = (float[]) this.f2541l;
            fArr2[0] = f11;
            fArr2[1] = wVar6.f2561b;
            matrixArr2[i15].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr2;
            w[] wVarArr2 = wVarArr;
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            w wVar7 = wVarArr2[i13];
            fArr[0] = wVar7.f2562c;
            fArr[1] = wVar7.f2563d;
            matrixArr3[i13].mapPoints(fArr);
            if (i13 != 1 && i13 != 3) {
                abs = Math.abs(rectF.centerY() - fArr[1]);
            } else {
                abs = Math.abs(rectF.centerX() - fArr[0]);
            }
            w wVar8 = (w) this.j;
            wVar8.d(0.0f, 0.0f, 270.0f, 0.0f);
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        eVar = mVar.j;
                    } else {
                        eVar = mVar.f2527i;
                    }
                } else {
                    eVar = mVar.f2529l;
                }
            } else {
                eVar = mVar.f2528k;
            }
            eVar.r(max, abs, f9, wVar8);
            Path path4 = (Path) this.f2538h;
            path4.reset();
            wVar8.b(matrixArr[i13], path4);
            if (this.f2531a && (eVar.q() || f(path4, i13) || f(path4, i15))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = wVar8.f2560a;
                fArr[1] = wVar8.f2561b;
                matrixArr[i13].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                wVar8.b(matrixArr[i13], path2);
            } else {
                wVar8.b(matrixArr[i13], path);
            }
            if (c0701c != null) {
                Matrix matrix2 = matrixArr[i13];
                h hVar2 = (h) c0701c.f11404b;
                z10 = false;
                hVar2.f2486d.set(i13 + 4, false);
                wVar8.a(wVar8.f2565f);
                hVar2.f2485c[i13] = new p(new ArrayList(wVar8.f2567h), new Matrix(matrix2));
            } else {
                z10 = false;
            }
            i13 = i14;
            z9 = z10;
            wVarArr = wVarArr2;
            matrixArr2 = matrixArr3;
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public E0 c() {
        ArrayList arrayList = (ArrayList) this.f2533c;
        if (arrayList.isEmpty()) {
            return E0.f19320a;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i0 i0Var = (i0) arrayList.get(i10);
            i0Var.f19650d = i9;
            i9 += i0Var.f19647a.f5195o.f5173b.o();
        }
        return new u0(arrayList, (g0) this.f2540k);
    }

    public void d() {
        Iterator it = ((HashSet) this.j).iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) it.next();
            if (i0Var.f19649c.isEmpty()) {
                h0 h0Var = (h0) ((HashMap) this.f2539i).get(i0Var);
                if (h0Var != null) {
                    h0Var.f19635a.c(h0Var.f19636b);
                }
                it.remove();
            }
        }
    }

    public void e(i0 i0Var) {
        if (i0Var.f19651e && i0Var.f19649c.isEmpty()) {
            h0 h0Var = (h0) ((HashMap) this.f2539i).remove(i0Var);
            h0Var.getClass();
            C1456g0 c1456g0 = h0Var.f19636b;
            AbstractC0250a abstractC0250a = h0Var.f19635a;
            abstractC0250a.q(c1456g0);
            com.google.firebase.messaging.s sVar = h0Var.f19637c;
            abstractC0250a.u(sVar);
            abstractC0250a.t(sVar);
            ((HashSet) this.j).remove(i0Var);
        }
    }

    public boolean f(Path path, int i9) {
        Path path2 = (Path) this.f2539i;
        path2.reset();
        ((w[]) this.f2532b)[i9].b(((Matrix[]) this.f2533c)[i9], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [j3.g0, N3.B] */
    /* JADX WARN: Type inference failed for: r4v2, types: [n3.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [N3.F, java.lang.Object] */
    public void g(i0 i0Var) {
        C0269u c0269u = i0Var.f19647a;
        ?? r1 = new B() { // from class: j3.g0
            @Override // N3.B
            public final void a(AbstractC0250a abstractC0250a, E0 e02) {
                ((J) F5.o.this.f2536f).f19363h.c(22);
            }
        };
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(this, i0Var);
        ((HashMap) this.f2539i).put(i0Var, new h0(c0269u, r1, sVar));
        int i9 = y.f20553a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        c0269u.getClass();
        G g9 = c0269u.f5037c;
        g9.getClass();
        ?? obj = new Object();
        obj.f4919a = handler;
        obj.f4920b = sVar;
        g9.f4923c.add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler2 = new Handler(myLooper2, null);
        C1635l c1635l = c0269u.f5038d;
        c1635l.getClass();
        ?? obj2 = new Object();
        obj2.f21128a = handler2;
        obj2.f21129b = sVar;
        c1635l.f21132c.add(obj2);
        c0269u.m(r1, (W) this.f2541l, (k3.l) this.f2532b);
    }

    public void h(InterfaceC0272x interfaceC0272x) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.f2534d;
        i0 i0Var = (i0) identityHashMap.remove(interfaceC0272x);
        i0Var.getClass();
        i0Var.f19647a.p(interfaceC0272x);
        i0Var.f19649c.remove(((N3.r) interfaceC0272x).f5181a);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(i0Var);
    }

    public void i(int i9, int i10) {
        for (int i11 = i10 - 1; i11 >= i9; i11--) {
            ArrayList arrayList = (ArrayList) this.f2533c;
            i0 i0Var = (i0) arrayList.remove(i11);
            ((HashMap) this.f2535e).remove(i0Var.f19648b);
            int i12 = -i0Var.f19647a.f5195o.f5173b.o();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((i0) arrayList.get(i13)).f19650d += i12;
            }
            i0Var.f19651e = true;
            if (this.f2531a) {
                e(i0Var);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [N3.F, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [n3.k, java.lang.Object] */
    public o(J j, C1489e c1489e, Handler handler, k3.l lVar) {
        this.f2532b = lVar;
        this.f2536f = j;
        this.f2540k = new g0();
        this.f2534d = new IdentityHashMap();
        this.f2535e = new HashMap();
        this.f2533c = new ArrayList();
        G g9 = new G();
        this.f2537g = g9;
        C1635l c1635l = new C1635l();
        this.f2538h = c1635l;
        this.f2539i = new HashMap();
        this.j = new HashSet();
        c1489e.getClass();
        ?? obj = new Object();
        obj.f4919a = handler;
        obj.f4920b = c1489e;
        g9.f4923c.add(obj);
        ?? obj2 = new Object();
        obj2.f21128a = handler;
        obj2.f21129b = c1489e;
        c1635l.f21132c.add(obj2);
    }
}
