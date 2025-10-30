package X0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;

/* renamed from: X0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0426a extends m {

    /* renamed from: C, reason: collision with root package name */
    public int f8159C;

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f8157A = new ArrayList();

    /* renamed from: B, reason: collision with root package name */
    public boolean f8158B = true;

    /* renamed from: D, reason: collision with root package name */
    public boolean f8160D = false;

    /* renamed from: X, reason: collision with root package name */
    public int f8161X = 0;

    public C0426a() {
        O(1);
        L(new g(2));
        L(new m());
        L(new g(1));
    }

    @Override // X0.m
    public final m A(j jVar) {
        super.A(jVar);
        return this;
    }

    @Override // X0.m
    public final void B(View view) {
        super.B(view);
        int size = this.f8157A.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((m) this.f8157A.get(i9)).B(view);
        }
    }

    @Override // X0.m
    public final void C() {
        if (this.f8157A.isEmpty()) {
            J();
            o();
            return;
        }
        r rVar = new r();
        rVar.f8224b = this;
        ArrayList arrayList = this.f8157A;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m) obj).b(rVar);
        }
        this.f8159C = this.f8157A.size();
        if (!this.f8158B) {
            for (int i11 = 1; i11 < this.f8157A.size(); i11++) {
                ((m) this.f8157A.get(i11 - 1)).b(new r((m) this.f8157A.get(i11)));
            }
            m mVar = (m) this.f8157A.get(0);
            if (mVar != null) {
                mVar.C();
                return;
            }
            return;
        }
        ArrayList arrayList2 = this.f8157A;
        int size2 = arrayList2.size();
        while (i9 < size2) {
            Object obj2 = arrayList2.get(i9);
            i9++;
            ((m) obj2).C();
        }
    }

    @Override // X0.m
    public final void E(s8.n nVar) {
        this.f8161X |= 8;
        int size = this.f8157A.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((m) this.f8157A.get(i9)).E(nVar);
        }
    }

    @Override // X0.m
    public final void G(Q6.f fVar) {
        super.G(fVar);
        this.f8161X |= 4;
        if (this.f8157A != null) {
            for (int i9 = 0; i9 < this.f8157A.size(); i9++) {
                ((m) this.f8157A.get(i9)).G(fVar);
            }
        }
    }

    @Override // X0.m
    public final void H() {
        this.f8161X |= 2;
        int size = this.f8157A.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((m) this.f8157A.get(i9)).H();
        }
    }

    @Override // X0.m
    public final void I(long j) {
        this.f8196b = j;
    }

    @Override // X0.m
    public final String K(String str) {
        String K = super.K(str);
        for (int i9 = 0; i9 < this.f8157A.size(); i9++) {
            StringBuilder sb = new StringBuilder();
            sb.append(K);
            sb.append("\n");
            sb.append(((m) this.f8157A.get(i9)).K(str + "  "));
            K = sb.toString();
        }
        return K;
    }

    public final void L(m mVar) {
        this.f8157A.add(mVar);
        mVar.f8203i = this;
        long j = this.f8197c;
        if (j >= 0) {
            mVar.D(j);
        }
        if ((this.f8161X & 1) != 0) {
            mVar.F(this.f8198d);
        }
        if ((this.f8161X & 2) != 0) {
            mVar.H();
        }
        if ((this.f8161X & 4) != 0) {
            mVar.G(this.f8215v);
        }
        if ((this.f8161X & 8) != 0) {
            mVar.E(null);
        }
    }

    @Override // X0.m
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void D(long j) {
        ArrayList arrayList;
        this.f8197c = j;
        if (j >= 0 && (arrayList = this.f8157A) != null) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((m) this.f8157A.get(i9)).D(j);
            }
        }
    }

    @Override // X0.m
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void F(TimeInterpolator timeInterpolator) {
        this.f8161X |= 1;
        ArrayList arrayList = this.f8157A;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((m) this.f8157A.get(i9)).F(timeInterpolator);
            }
        }
        this.f8198d = timeInterpolator;
    }

    public final void O(int i9) {
        if (i9 != 0) {
            if (i9 == 1) {
                this.f8158B = false;
                return;
            }
            throw new AndroidRuntimeException(AbstractC0953k1.j(i9, "Invalid parameter for TransitionSet ordering: "));
        }
        this.f8158B = true;
    }

    @Override // X0.m
    public final void cancel() {
        super.cancel();
        int size = this.f8157A.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((m) this.f8157A.get(i9)).cancel();
        }
    }

    @Override // X0.m
    public final void e(u uVar) {
        if (w(uVar.f8227b)) {
            ArrayList arrayList = this.f8157A;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                m mVar = (m) obj;
                if (mVar.w(uVar.f8227b)) {
                    mVar.e(uVar);
                    uVar.f8228c.add(mVar);
                }
            }
        }
    }

    @Override // X0.m
    public final void h(u uVar) {
        int size = this.f8157A.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((m) this.f8157A.get(i9)).h(uVar);
        }
    }

    @Override // X0.m
    public final void i(u uVar) {
        if (w(uVar.f8227b)) {
            ArrayList arrayList = this.f8157A;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                m mVar = (m) obj;
                if (mVar.w(uVar.f8227b)) {
                    mVar.i(uVar);
                    uVar.f8228c.add(mVar);
                }
            }
        }
    }

    @Override // X0.m
    /* renamed from: l */
    public final m clone() {
        C0426a c0426a = (C0426a) super.clone();
        c0426a.f8157A = new ArrayList();
        int size = this.f8157A.size();
        for (int i9 = 0; i9 < size; i9++) {
            m clone = ((m) this.f8157A.get(i9)).clone();
            c0426a.f8157A.add(clone);
            clone.f8203i = c0426a;
        }
        return c0426a;
    }

    @Override // X0.m
    public final void n(ViewGroup viewGroup, com.google.firebase.messaging.s sVar, com.google.firebase.messaging.s sVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f8196b;
        int size = this.f8157A.size();
        for (int i9 = 0; i9 < size; i9++) {
            m mVar = (m) this.f8157A.get(i9);
            if (j > 0 && (this.f8158B || i9 == 0)) {
                long j4 = mVar.f8196b;
                if (j4 > 0) {
                    mVar.I(j4 + j);
                } else {
                    mVar.I(j);
                }
            }
            mVar.n(viewGroup, sVar, sVar2, arrayList, arrayList2);
        }
    }

    @Override // X0.m
    public final void z(ViewGroup viewGroup) {
        super.z(viewGroup);
        int size = this.f8157A.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((m) this.f8157A.get(i9)).z(viewGroup);
        }
    }
}
