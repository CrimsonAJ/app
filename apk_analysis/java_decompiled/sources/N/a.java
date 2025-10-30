package N;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f4795e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f4796a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4797b;

    /* renamed from: c, reason: collision with root package name */
    public int f4798c;

    /* renamed from: d, reason: collision with root package name */
    public char f4799d;

    static {
        for (int i9 = 0; i9 < 1792; i9++) {
            f4795e[i9] = Character.getDirectionality(i9);
        }
    }

    public a(CharSequence charSequence) {
        this.f4796a = charSequence;
        this.f4797b = charSequence.length();
    }

    public final byte a() {
        int i9 = this.f4798c - 1;
        CharSequence charSequence = this.f4796a;
        char charAt = charSequence.charAt(i9);
        this.f4799d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f4798c);
            this.f4798c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f4798c--;
        char c3 = this.f4799d;
        if (c3 < 1792) {
            return f4795e[c3];
        }
        return Character.getDirectionality(c3);
    }
}
