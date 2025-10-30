package F5;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: c, reason: collision with root package name */
    public final float f2465c;

    public f(float f9) {
        super(0);
        this.f2465c = f9 - 0.001f;
    }

    @Override // F5.e
    public final void r(float f9, float f10, float f11, w wVar) {
        double d9 = this.f2465c;
        float sqrt = (float) ((Math.sqrt(2.0d) * d9) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(d9, 2.0d) - Math.pow(sqrt, 2.0d));
        wVar.d(f10 - sqrt, ((float) (-((Math.sqrt(2.0d) * d9) - d9))) + sqrt2, 270.0f, 0.0f);
        wVar.c(f10, (float) (-((Math.sqrt(2.0d) * d9) - d9)));
        wVar.c(f10 + sqrt, ((float) (-((Math.sqrt(2.0d) * d9) - d9))) + sqrt2);
    }
}
