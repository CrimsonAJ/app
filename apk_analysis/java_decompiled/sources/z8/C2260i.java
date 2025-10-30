package z8;

import f5.C1183o;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: z8.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2260i extends AbstractC2256e {
    @Override // z8.AbstractC2256e
    public final InterfaceC2257f a(Type type, Annotation[] annotationArr) {
        if (X.h(type) != s8.a.b()) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type g9 = X.g(0, (ParameterizedType) type);
            if (X.h(g9) != O.class) {
                return new C1183o(25, g9);
            }
            if (g9 instanceof ParameterizedType) {
                return new i.G(25, X.g(0, (ParameterizedType) g9));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
