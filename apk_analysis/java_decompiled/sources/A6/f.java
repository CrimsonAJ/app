package A6;

/* loaded from: classes.dex */
public final class f implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final F5.e f503c = new F5.e(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f504a;

    /* renamed from: b, reason: collision with root package name */
    public Object f505b;

    public f(E6.e eVar) {
        this.f504a = eVar;
        this.f505b = f503c;
    }

    @Override // A6.l
    public void a(k kVar, int i9) {
        int[] iArr = (int[]) this.f505b;
        try {
            kVar.read((byte[]) this.f504a, iArr[0], i9);
            iArr[0] = iArr[0] + i9;
        } finally {
            kVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f504a = bArr;
        this.f505b = iArr;
    }
}
