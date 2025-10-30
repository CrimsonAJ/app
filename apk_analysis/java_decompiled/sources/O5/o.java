package O5;

import com.google.android.gms.internal.measurement.H1;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class o implements n, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final H1 f5505a;

    /* renamed from: b, reason: collision with root package name */
    public volatile transient boolean f5506b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object f5507c;

    public o(H1 h12) {
        this.f5505a = h12;
    }

    @Override // O5.n
    public final Object get() {
        if (!this.f5506b) {
            synchronized (this) {
                try {
                    if (!this.f5506b) {
                        Object obj = this.f5505a.get();
                        this.f5507c = obj;
                        this.f5506b = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f5507c;
    }

    public final String toString() {
        Object obj;
        if (this.f5506b) {
            String valueOf = String.valueOf(this.f5507c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f5505a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
