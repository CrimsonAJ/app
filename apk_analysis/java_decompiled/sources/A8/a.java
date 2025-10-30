package A8;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import o7.InterfaceC1721m;
import o7.y;
import z8.AbstractC2261j;
import z8.InterfaceC2262k;
import z8.Q;

/* loaded from: classes.dex */
public final class a extends AbstractC2261j {

    /* renamed from: a, reason: collision with root package name */
    public final y f561a;

    public a(y yVar) {
        this.f561a = yVar;
    }

    public static Set c(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC1721m.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        if (linkedHashSet != null) {
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return Collections.EMPTY_SET;
    }

    @Override // z8.AbstractC2261j
    public final InterfaceC2262k a(Type type, Annotation[] annotationArr) {
        return new b(this.f561a.b(type, c(annotationArr), null));
    }

    @Override // z8.AbstractC2261j
    public final InterfaceC2262k b(Type type, Annotation[] annotationArr, Q q9) {
        return new c(this.f561a.b(type, c(annotationArr), null));
    }
}
