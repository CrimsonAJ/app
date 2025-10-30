package z8;

import F0.ExecutorC0101e;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import k4.C1499E;

/* renamed from: z8.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2264m extends AbstractC2256e {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorC0101e f25619a;

    public C2264m(ExecutorC0101e executorC0101e) {
        this.f25619a = executorC0101e;
    }

    @Override // z8.AbstractC2256e
    public final InterfaceC2257f a(Type type, Annotation[] annotationArr) {
        ExecutorC0101e executorC0101e = null;
        if (X.h(type) != InterfaceC2255d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type g9 = X.g(0, (ParameterizedType) type);
            if (!X.l(annotationArr, S.class)) {
                executorC0101e = this.f25619a;
            }
            return new C1499E(g9, 28, executorC0101e);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
