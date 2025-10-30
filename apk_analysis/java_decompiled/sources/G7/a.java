package G7;

import A7.n;
import a.AbstractC0485a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a implements E7.d, d, Serializable {
    private final E7.d<Object> completion;

    public a(E7.d dVar) {
        this.completion = dVar;
    }

    public E7.d<n> create(E7.d<?> completion) {
        kotlin.jvm.internal.h.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // G7.d
    public d getCallerFrame() {
        E7.d<Object> dVar = this.completion;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final E7.d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i9;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i10;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v8 = eVar.v();
        if (v8 <= 1) {
            int i11 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this);
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = 0;
                }
                i9 = i10 - 1;
            } catch (Exception unused) {
                i9 = -1;
            }
            if (i9 >= 0) {
                i11 = eVar.l()[i9];
            }
            f fVar = g.f2910b;
            f fVar2 = g.f2909a;
            if (fVar == null) {
                try {
                    f fVar3 = new f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    g.f2910b = fVar3;
                    fVar = fVar3;
                } catch (Exception unused2) {
                    g.f2910b = fVar2;
                    fVar = fVar2;
                }
            }
            if (fVar != fVar2 && (method = fVar.f2906a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = fVar.f2907b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = fVar.f2908c;
                if (method3 != null) {
                    obj = method3.invoke(invoke2, null);
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str2 = (String) obj;
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i11);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v8 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // E7.d
    public final void resumeWith(Object obj) {
        E7.d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            E7.d dVar2 = aVar.completion;
            kotlin.jvm.internal.h.b(dVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == F7.a.f2587a) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0485a.h(th);
            }
            aVar.releaseIntercepted();
            if (dVar2 instanceof a) {
                dVar = dVar2;
            } else {
                dVar2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public E7.d<n> create(Object obj, E7.d<?> completion) {
        kotlin.jvm.internal.h.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
