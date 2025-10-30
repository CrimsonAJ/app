package Y7;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final G f8760a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [Z7.d] */
    /* JADX WARN: Type inference failed for: r0v7, types: [Y7.C] */
    /* JADX WARN: Type inference failed for: r0v8, types: [Y7.G] */
    /* JADX WARN: Type inference failed for: r0v9, types: [Y7.C] */
    static {
        String str;
        boolean z9;
        ?? r0;
        int i9 = d8.w.f17009a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        boolean z10 = false;
        if (str != null) {
            z9 = Boolean.parseBoolean(str);
        } else {
            z9 = false;
        }
        if (!z9) {
            r0 = C.f8758i;
        } else {
            f8.e eVar = K.f8773a;
            r0 = d8.o.f17003a;
            Z7.d dVar = r0.f9070d;
            if (r0 != 0) {
                z10 = true;
            }
            if (!z10) {
                r0 = C.f8758i;
            }
        }
        f8760a = r0;
    }
}
