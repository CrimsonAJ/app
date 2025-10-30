package U3;

import com.google.android.gms.internal.measurement.D1;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final TreeSet f7394a = new TreeSet(new E6.a(7));

    /* renamed from: b, reason: collision with root package name */
    public int f7395b;

    /* renamed from: c, reason: collision with root package name */
    public int f7396c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7397d;

    public k() {
        e();
    }

    public static int b(int i9, int i10) {
        int min;
        int i11 = i9 - i10;
        if (Math.abs(i11) > 1000 && (min = (Math.min(i9, i10) - Math.max(i9, i10)) + 65535) < 1000) {
            if (i9 < i10) {
                return min;
            }
            return -min;
        }
        return i11;
    }

    public final synchronized void a(j jVar) {
        this.f7395b = jVar.f7392a.f7388c;
        this.f7394a.add(jVar);
    }

    public final synchronized void c(i iVar, long j) {
        if (this.f7394a.size() < 5000) {
            int i9 = iVar.f7388c;
            if (!this.f7397d) {
                e();
                this.f7396c = D1.F(i9 - 1);
                this.f7397d = true;
                a(new j(iVar, j));
                return;
            }
            if (Math.abs(b(i9, i.a(this.f7395b))) < 1000) {
                if (b(i9, this.f7396c) > 0) {
                    a(new j(iVar, j));
                    return;
                }
                return;
            } else {
                this.f7396c = D1.F(i9 - 1);
                this.f7394a.clear();
                a(new j(iVar, j));
                return;
            }
        }
        throw new IllegalStateException("Queue size limit of 5000 reached.");
    }

    public final synchronized i d(long j) {
        if (this.f7394a.isEmpty()) {
            return null;
        }
        j jVar = (j) this.f7394a.first();
        int i9 = jVar.f7392a.f7388c;
        if (i9 != i.a(this.f7396c) && j < jVar.f7393b) {
            return null;
        }
        this.f7394a.pollFirst();
        this.f7396c = i9;
        return jVar.f7392a;
    }

    public final synchronized void e() {
        this.f7394a.clear();
        this.f7397d = false;
        this.f7396c = -1;
        this.f7395b = -1;
    }
}
