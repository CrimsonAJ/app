package F5;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public float f2560a;

    /* renamed from: b, reason: collision with root package name */
    public float f2561b;

    /* renamed from: c, reason: collision with root package name */
    public float f2562c;

    /* renamed from: d, reason: collision with root package name */
    public float f2563d;

    /* renamed from: e, reason: collision with root package name */
    public float f2564e;

    /* renamed from: f, reason: collision with root package name */
    public float f2565f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2566g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2567h = new ArrayList();

    public w() {
        d(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f9) {
        float f10 = this.f2564e;
        if (f10 != f9) {
            float f11 = ((f9 - f10) + 360.0f) % 360.0f;
            if (f11 > 180.0f) {
                return;
            }
            float f12 = this.f2562c;
            float f13 = this.f2563d;
            s sVar = new s(f12, f13, f12, f13);
            sVar.f2553f = this.f2564e;
            sVar.f2554g = f11;
            this.f2567h.add(new q(sVar));
            this.f2564e = f9;
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f2566g;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((u) arrayList.get(i9)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [F5.t, F5.u, java.lang.Object] */
    public final void c(float f9, float f10) {
        ?? uVar = new u();
        uVar.f2555b = f9;
        uVar.f2556c = f10;
        this.f2566g.add(uVar);
        r rVar = new r(uVar, this.f2562c, this.f2563d);
        float b9 = rVar.b() + 270.0f;
        float b10 = rVar.b() + 270.0f;
        a(b9);
        this.f2567h.add(rVar);
        this.f2564e = b10;
        this.f2562c = f9;
        this.f2563d = f10;
    }

    public final void d(float f9, float f10, float f11, float f12) {
        this.f2560a = f9;
        this.f2561b = f10;
        this.f2562c = f9;
        this.f2563d = f10;
        this.f2564e = f11;
        this.f2565f = (f11 + f12) % 360.0f;
        this.f2566g.clear();
        this.f2567h.clear();
    }
}
