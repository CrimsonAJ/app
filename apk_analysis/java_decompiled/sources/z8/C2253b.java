package z8;

import f5.C1183o;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: z8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2253b extends AbstractC2261j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25615a;

    public /* synthetic */ C2253b(int i9) {
        this.f25615a = i9;
    }

    @Override // z8.AbstractC2261j
    public InterfaceC2262k a(Type type, Annotation[] annotationArr) {
        switch (this.f25615a) {
            case 0:
                if (i8.J.class.isAssignableFrom(X.h(type))) {
                    return C2252a.f25610d;
                }
                return null;
            default:
                return super.a(type, annotationArr);
        }
    }

    @Override // z8.AbstractC2261j
    public final InterfaceC2262k b(Type type, Annotation[] annotationArr, Q q9) {
        switch (this.f25615a) {
            case 0:
                if (type == i8.N.class) {
                    if (X.l(annotationArr, B8.w.class)) {
                        return C2252a.f25611e;
                    }
                    return C2252a.f25609c;
                }
                if (type == Void.class) {
                    return C2252a.f25613g;
                }
                if (X.m(type)) {
                    return C2252a.f25612f;
                }
                return null;
            default:
                if (X.h(type) != s8.a.j()) {
                    return null;
                }
                return new C1183o(26, q9.d(X.g(0, (ParameterizedType) type), annotationArr));
        }
    }
}
