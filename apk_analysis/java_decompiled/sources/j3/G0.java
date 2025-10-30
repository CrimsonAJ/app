package j3;

/* loaded from: classes.dex */
public final class G0 implements InterfaceC1453f {

    /* renamed from: b, reason: collision with root package name */
    public static final G0 f19337b;

    /* renamed from: a, reason: collision with root package name */
    public final P5.F f19338a;

    static {
        P5.D d9 = P5.F.f5901b;
        f19337b = new G0(P5.S.f5926e);
    }

    public G0(P5.F f9) {
        this.f19338a = P5.F.o(f9);
    }

    public final boolean a(int i9) {
        int i10 = 0;
        while (true) {
            P5.F f9 = this.f19338a;
            if (i10 >= f9.size()) {
                return false;
            }
            F0 f02 = (F0) f9.get(i10);
            boolean[] zArr = f02.f19329e;
            int length = zArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (zArr[i11]) {
                    if (f02.f19326b.f5166c == i9) {
                        return true;
                    }
                } else {
                    i11++;
                }
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G0.class == obj.getClass()) {
            return this.f19338a.equals(((G0) obj).f19338a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19338a.hashCode();
    }
}
