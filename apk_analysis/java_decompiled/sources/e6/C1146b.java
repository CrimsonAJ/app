package e6;

import U5.f;
import java.util.Objects;

/* renamed from: e6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1146b {

    /* renamed from: a, reason: collision with root package name */
    public final f f17217a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17218b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17219c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17220d;

    public C1146b(f fVar, int i9, String str, String str2) {
        this.f17217a = fVar;
        this.f17218b = i9;
        this.f17219c = str;
        this.f17220d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1146b)) {
            return false;
        }
        C1146b c1146b = (C1146b) obj;
        if (this.f17217a != c1146b.f17217a || this.f17218b != c1146b.f17218b || !this.f17219c.equals(c1146b.f17219c) || !this.f17220d.equals(c1146b.f17220d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f17217a, Integer.valueOf(this.f17218b), this.f17219c, this.f17220d);
    }

    public final String toString() {
        return "(status=" + this.f17217a + ", keyId=" + this.f17218b + ", keyType='" + this.f17219c + "', keyPrefix='" + this.f17220d + "')";
    }
}
