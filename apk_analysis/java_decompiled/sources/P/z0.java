package P;

/* loaded from: classes.dex */
public final class z0 extends y0 {
    @Override // P.y0, s8.e
    public final boolean J() {
        int systemBarsAppearance;
        systemBarsAppearance = this.f5654e.getSystemBarsAppearance();
        if ((systemBarsAppearance & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override // P.y0, s8.e
    public final void b0() {
        this.f5654e.setSystemBarsBehavior(2);
    }
}
