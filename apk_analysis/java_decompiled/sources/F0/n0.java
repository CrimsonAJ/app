package F0;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2164a;

    /* renamed from: b, reason: collision with root package name */
    public int f2165b;

    /* renamed from: c, reason: collision with root package name */
    public int f2166c;

    /* renamed from: d, reason: collision with root package name */
    public int f2167d;

    /* renamed from: e, reason: collision with root package name */
    public int f2168e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2169f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2170g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2171h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2172i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2173k;

    /* renamed from: l, reason: collision with root package name */
    public int f2174l;

    /* renamed from: m, reason: collision with root package name */
    public long f2175m;

    /* renamed from: n, reason: collision with root package name */
    public int f2176n;

    public final void a(int i9) {
        if ((this.f2167d & i9) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i9) + " but it is " + Integer.toBinaryString(this.f2167d));
    }

    public final int b() {
        if (this.f2170g) {
            return this.f2165b - this.f2166c;
        }
        return this.f2168e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f2164a + ", mData=null, mItemCount=" + this.f2168e + ", mIsMeasuring=" + this.f2172i + ", mPreviousLayoutItemCount=" + this.f2165b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2166c + ", mStructureChanged=" + this.f2169f + ", mInPreLayout=" + this.f2170g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.f2173k + '}';
    }
}
