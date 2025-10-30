package F6;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C6.b f2568b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final String f2569c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d, reason: collision with root package name */
    public static final String f2570d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e, reason: collision with root package name */
    public static final C6.a f2571e = new C6.a(6);

    /* renamed from: a, reason: collision with root package name */
    public final c f2572a;

    public a(c cVar) {
        this.f2572a = cVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i9 = 0; i9 < str.length(); i9++) {
                sb.append(str.charAt(i9));
                if (str2.length() > i9) {
                    sb.append(str2.charAt(i9));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
