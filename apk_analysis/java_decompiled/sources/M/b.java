package M;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f4646a;

    /* renamed from: b, reason: collision with root package name */
    public String f4647b;

    /* renamed from: c, reason: collision with root package name */
    public List f4648c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f4646a, bVar.f4646a) && Objects.equals(this.f4647b, bVar.f4647b) && Objects.equals(this.f4648c, bVar.f4648c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f4646a, this.f4647b, this.f4648c);
    }
}
