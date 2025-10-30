package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0533t f9660a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9661b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f9662c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9663d;

    public S(AbstractC0533t abstractC0533t, String str, Object[] objArr) {
        this.f9660a = abstractC0533t;
        this.f9661b = str;
        this.f9662c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f9663d = charAt;
            return;
        }
        int i9 = charAt & 8191;
        int i10 = 1;
        int i11 = 13;
        while (true) {
            int i12 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 >= 55296) {
                i9 |= (charAt2 & 8191) << i11;
                i11 += 13;
                i10 = i12;
            } else {
                this.f9663d = i9 | (charAt2 << i11);
                return;
            }
        }
    }

    public final int a() {
        int i9 = this.f9663d;
        if ((i9 & 1) != 0) {
            return 1;
        }
        if ((i9 & 4) == 4) {
            return 3;
        }
        return 2;
    }
}
