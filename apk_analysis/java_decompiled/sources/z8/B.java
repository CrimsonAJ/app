package z8;

import java.util.Objects;

/* loaded from: classes.dex */
public final class B extends X {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25511d;

    /* renamed from: e, reason: collision with root package name */
    public final String f25512e;

    /* renamed from: f, reason: collision with root package name */
    public final C2252a f25513f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f25514g;

    public B(String str, boolean z9, int i9) {
        this.f25511d = i9;
        switch (i9) {
            case 1:
                C2252a c2252a = C2252a.f25608b;
                Objects.requireNonNull(str, "name == null");
                this.f25512e = str;
                this.f25513f = c2252a;
                this.f25514g = z9;
                return;
            case 2:
                C2252a c2252a2 = C2252a.f25608b;
                Objects.requireNonNull(str, "name == null");
                this.f25512e = str;
                this.f25513f = c2252a2;
                this.f25514g = z9;
                return;
            default:
                C2252a c2252a3 = C2252a.f25608b;
                Objects.requireNonNull(str, "name == null");
                this.f25512e = str;
                this.f25513f = c2252a3;
                this.f25514g = z9;
                return;
        }
    }

    @Override // z8.X
    public final void a(L l9, Object obj) {
        switch (this.f25511d) {
            case 0:
                if (obj != null) {
                    this.f25513f.getClass();
                    String obj2 = obj.toString();
                    if (obj2 != null) {
                        l9.a(this.f25512e, obj2, this.f25514g);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (obj != null) {
                    this.f25513f.getClass();
                    String obj3 = obj.toString();
                    if (obj3 != null) {
                        l9.b(this.f25512e, obj3, this.f25514g);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (obj != null) {
                    this.f25513f.getClass();
                    String obj4 = obj.toString();
                    if (obj4 != null) {
                        l9.d(this.f25512e, obj4, this.f25514g);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
