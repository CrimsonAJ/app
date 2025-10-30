package d8;

/* loaded from: classes.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.b implements O7.a, U7.f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16990a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j(java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r8 = this;
            r0 = 1
            r13 = r13 & r0
            r1 = 0
            if (r13 != r0) goto Lc
            r7 = r0
        L6:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            goto Le
        Lc:
            r7 = r1
            goto L6
        Le:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.f16990a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.j.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // kotlin.jvm.internal.b
    public final U7.b compute() {
        if (this.f16990a) {
            return this;
        }
        return super.compute();
    }

    @Override // kotlin.jvm.internal.b
    public final U7.b computeReflected() {
        kotlin.jvm.internal.p.f20160a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (getOwner().equals(jVar.getOwner()) && getName().equals(jVar.getName()) && getSignature().equals(jVar.getSignature()) && kotlin.jvm.internal.h.a(getBoundReceiver(), jVar.getBoundReceiver())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof U7.f)) {
            return false;
        }
        return obj.equals(compute());
    }

    @Override // kotlin.jvm.internal.b
    public final U7.b getReflected() {
        if (!this.f16990a) {
            U7.b compute = compute();
            if (compute != this) {
                return (U7.f) compute;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // O7.a
    public final Object invoke() {
        return this.receiver.getClass().getSimpleName();
    }

    public final String toString() {
        U7.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
