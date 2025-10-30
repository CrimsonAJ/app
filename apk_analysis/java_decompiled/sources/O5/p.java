package O5;

import com.google.android.gms.internal.measurement.H1;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p implements n {

    /* renamed from: a, reason: collision with root package name */
    public volatile H1 f5508a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f5509b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5510c;

    @Override // O5.n
    public final Object get() {
        if (!this.f5509b) {
            synchronized (this) {
                try {
                    if (!this.f5509b) {
                        H1 h12 = this.f5508a;
                        Objects.requireNonNull(h12);
                        Object obj = h12.get();
                        this.f5510c = obj;
                        this.f5509b = true;
                        this.f5508a = null;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f5510c;
    }

    public final String toString() {
        Object obj = this.f5508a;
        if (obj == null) {
            String valueOf = String.valueOf(this.f5510c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
