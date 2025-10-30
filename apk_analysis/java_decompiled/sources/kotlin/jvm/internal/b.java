package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b implements U7.b, Serializable {
    public static final Object NO_RECEIVER = a.f20148a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient U7.b reflected;
    private final String signature;

    public b(Object obj, Class cls, String str, String str2, boolean z9) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z9;
    }

    @Override // U7.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // U7.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public U7.b compute() {
        U7.b bVar = this.reflected;
        if (bVar == null) {
            U7.b computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return bVar;
    }

    public abstract U7.b computeReflected();

    @Override // U7.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public U7.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            p.f20160a.getClass();
            return new j(cls);
        }
        return p.a(cls);
    }

    @Override // U7.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract U7.b getReflected();

    @Override // U7.b
    public U7.g getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // U7.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // U7.b
    public U7.h getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // U7.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // U7.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // U7.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
