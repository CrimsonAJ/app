package G0;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.crypto.tink.shaded.protobuf.AbstractC1030a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2663a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2664b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f2665c;

    public H(E database) {
        kotlin.jvm.internal.h.e(database, "database");
        this.f2663a = database;
        this.f2664b = new AtomicBoolean(false);
        this.f2665c = Z0.a.q(new B2.i(2, this));
    }

    public R0.j a() {
        E e8 = (E) this.f2663a;
        e8.a();
        if (((AtomicBoolean) this.f2664b).compareAndSet(false, true)) {
            return (R0.j) ((A7.l) this.f2665c).getValue();
        }
        String b9 = b();
        e8.getClass();
        e8.a();
        e8.b();
        return e8.i().Z().q(b9);
    }

    public abstract String b();

    public int c() {
        return 1;
    }

    public abstract String d();

    public Object e(AbstractC1030a abstractC1030a, Class cls) {
        V5.f fVar = (V5.f) ((Map) this.f2664b).get(cls);
        if (fVar != null) {
            return fVar.a(abstractC1030a);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract D.n f();

    public abstract h6.X g();

    public abstract AbstractC1030a h(AbstractC1037h abstractC1037h);

    public void i(R0.j statement) {
        kotlin.jvm.internal.h.e(statement, "statement");
        if (statement == ((R0.j) ((A7.l) this.f2665c).getValue())) {
            ((AtomicBoolean) this.f2664b).set(false);
        }
    }

    public abstract void j(AbstractC1030a abstractC1030a);

    public H(Class cls, V5.f... fVarArr) {
        this.f2663a = cls;
        HashMap hashMap = new HashMap();
        for (V5.f fVar : fVarArr) {
            boolean containsKey = hashMap.containsKey(fVar.f7740a);
            Class cls2 = fVar.f7740a;
            if (!containsKey) {
                hashMap.put(cls2, fVar);
            } else {
                throw new IllegalArgumentException(AbstractC0953k1.l(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
        }
        if (fVarArr.length > 0) {
            this.f2665c = fVarArr[0].f7740a;
        } else {
            this.f2665c = Void.class;
        }
        this.f2664b = Collections.unmodifiableMap(hashMap);
    }
}
