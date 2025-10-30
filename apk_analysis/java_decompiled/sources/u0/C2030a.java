package u0;

import android.os.Bundle;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2030a implements D {

    /* renamed from: a, reason: collision with root package name */
    public final int f23466a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f23467b = new Bundle();

    public C2030a(int i9) {
        this.f23466a = i9;
    }

    @Override // u0.D
    public final Bundle a() {
        return this.f23467b;
    }

    @Override // u0.D
    public final int b() {
        return this.f23466a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C2030a.class.equals(obj.getClass()) && this.f23466a == ((C2030a) obj).f23466a) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 31 + this.f23466a;
    }

    public final String toString() {
        return "ActionOnlyNavDirections(actionId=" + this.f23466a + ')';
    }
}
