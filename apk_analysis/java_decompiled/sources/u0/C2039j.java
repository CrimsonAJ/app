package u0;

import androidx.lifecycle.Y;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import m0.C1581d;

/* renamed from: u0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2039j extends i0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public N0.f f23490a;

    /* renamed from: b, reason: collision with root package name */
    public D.n f23491b;

    @Override // androidx.lifecycle.h0
    public final e0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            if (this.f23491b != null) {
                N0.f fVar = this.f23490a;
                kotlin.jvm.internal.h.b(fVar);
                D.n nVar = this.f23491b;
                kotlin.jvm.internal.h.b(nVar);
                androidx.lifecycle.W b9 = Y.b(fVar, nVar, canonicalName, null);
                C2040k c2040k = new C2040k(b9.f9849b);
                c2040k.c(b9, "androidx.lifecycle.savedstate.vm.tag");
                return c2040k;
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.h0
    public final e0 b(Class cls, C1581d c1581d) {
        String str = (String) c1581d.f20661a.get(f0.f9884b);
        if (str != null) {
            N0.f fVar = this.f23490a;
            if (fVar != null) {
                kotlin.jvm.internal.h.b(fVar);
                D.n nVar = this.f23491b;
                kotlin.jvm.internal.h.b(nVar);
                androidx.lifecycle.W b9 = Y.b(fVar, nVar, str, null);
                C2040k c2040k = new C2040k(b9.f9849b);
                c2040k.c(b9, "androidx.lifecycle.savedstate.vm.tag");
                return c2040k;
            }
            return new C2040k(Y.d(c1581d));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.i0
    public final void c(e0 e0Var) {
        N0.f fVar = this.f23490a;
        if (fVar != null) {
            D.n nVar = this.f23491b;
            kotlin.jvm.internal.h.b(nVar);
            Y.a(e0Var, fVar, nVar);
        }
    }
}
