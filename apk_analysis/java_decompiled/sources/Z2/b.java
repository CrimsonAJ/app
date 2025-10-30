package Z2;

import android.content.Context;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import h3.InterfaceC1276a;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8950a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1276a f8951b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1276a f8952c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8953d;

    public b(Context context, InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2, String str) {
        if (context != null) {
            this.f8950a = context;
            if (interfaceC1276a != null) {
                this.f8951b = interfaceC1276a;
                if (interfaceC1276a2 != null) {
                    this.f8952c = interfaceC1276a2;
                    if (str != null) {
                        this.f8953d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f8950a.equals(((b) cVar).f8950a)) {
                b bVar = (b) cVar;
                if (this.f8951b.equals(bVar.f8951b) && this.f8952c.equals(bVar.f8952c) && this.f8953d.equals(bVar.f8953d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f8950a.hashCode() ^ 1000003) * 1000003) ^ this.f8951b.hashCode()) * 1000003) ^ this.f8952c.hashCode()) * 1000003) ^ this.f8953d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f8950a);
        sb.append(", wallClock=");
        sb.append(this.f8951b);
        sb.append(", monotonicClock=");
        sb.append(this.f8952c);
        sb.append(", backendName=");
        return AbstractC0953k1.q(sb, this.f8953d, "}");
    }
}
