package F0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2246a;

    /* renamed from: b, reason: collision with root package name */
    public int f2247b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2248c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2249d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2250e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f2252g;

    public v0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f2252g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f2246a = -1;
        this.f2247b = Integer.MIN_VALUE;
        this.f2248c = false;
        this.f2249d = false;
        this.f2250e = false;
        int[] iArr = this.f2251f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
