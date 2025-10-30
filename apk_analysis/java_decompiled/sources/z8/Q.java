package z8;

import i8.InterfaceC1419i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f25593a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1419i f25594b;

    /* renamed from: c, reason: collision with root package name */
    public final i8.y f25595c;

    /* renamed from: d, reason: collision with root package name */
    public final List f25596d;

    /* renamed from: e, reason: collision with root package name */
    public final List f25597e;

    public Q(InterfaceC1419i interfaceC1419i, i8.y yVar, List list, List list2) {
        this.f25594b = interfaceC1419i;
        this.f25595c = yVar;
        this.f25596d = list;
        this.f25597e = list2;
    }

    public final InterfaceC2257f a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f25597e;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i9 = indexOf; i9 < size; i9++) {
            InterfaceC2257f a5 = ((AbstractC2256e) list.get(i9)).a(type, annotationArr);
            if (a5 != null) {
                return a5;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC2256e) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final Object b(Class cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new P(this, cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public final InterfaceC2262k c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.f25596d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i9 = indexOf; i9 < size; i9++) {
            InterfaceC2262k a5 = ((AbstractC2261j) list.get(i9)).a(type, annotationArr);
            if (a5 != null) {
                return a5;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC2261j) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final InterfaceC2262k d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f25596d;
        int indexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i9 = indexOf; i9 < size; i9++) {
            InterfaceC2262k b9 = ((AbstractC2261j) list.get(i9)).b(type, annotationArr, this);
            if (b9 != null) {
                return b9;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC2261j) list.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.f25596d;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((AbstractC2261j) list.get(i9)).getClass();
        }
    }
}
