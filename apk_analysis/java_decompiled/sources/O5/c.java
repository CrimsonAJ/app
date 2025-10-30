package O5;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: a, reason: collision with root package name */
    public final char f5487a;

    public c(char c3) {
        this.f5487a = c3;
    }

    @Override // O5.b
    public final boolean a(char c3) {
        if (c3 == this.f5487a) {
            return true;
        }
        return false;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c3 = this.f5487a;
        for (int i9 = 0; i9 < 4; i9++) {
            cArr[5 - i9] = "0123456789ABCDEF".charAt(c3 & 15);
            c3 = (char) (c3 >> 4);
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(copyValueOf);
        sb.append("')");
        return sb.toString();
    }
}
