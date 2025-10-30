package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class f extends b implements e, U7.e {
    private final int arity;
    private final int flags;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r8 = this;
            r0 = 1
            r14 = r14 & r0
            r1 = 0
            if (r14 != r0) goto Lc
            r7 = r0
        L6:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            goto Le
        Lc:
            r7 = r1
            goto L6
        Le:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.arity = r9
            r2.flags = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.f.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    @Override // kotlin.jvm.internal.b
    public U7.b computeReflected() {
        p.f20160a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (getName().equals(fVar.getName()) && getSignature().equals(fVar.getSignature()) && this.flags == fVar.flags && this.arity == fVar.arity && h.a(getBoundReceiver(), fVar.getBoundReceiver()) && h.a(getOwner(), fVar.getOwner())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof U7.e)) {
            return false;
        }
        return obj.equals(compute());
    }

    @Override // kotlin.jvm.internal.e
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + hashCode) * 31);
    }

    @Override // U7.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // U7.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // U7.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // U7.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // U7.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        U7.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.b
    public U7.e getReflected() {
        U7.b compute = compute();
        if (compute != this) {
            return (U7.e) compute;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
