package c0;

import A5.k;
import A5.l;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0750d {

    /* renamed from: n, reason: collision with root package name */
    public static final C0748b f11560n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public static final C0748b f11561o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static final C0748b f11562p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public static final C0748b f11563q = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final C0748b f11564r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static final C0748b f11565s = new Object();

    /* renamed from: a, reason: collision with root package name */
    public float f11566a;

    /* renamed from: b, reason: collision with root package name */
    public float f11567b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11568c;

    /* renamed from: d, reason: collision with root package name */
    public final l f11569d;

    /* renamed from: e, reason: collision with root package name */
    public final k f11570e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11571f;

    /* renamed from: g, reason: collision with root package name */
    public long f11572g;

    /* renamed from: h, reason: collision with root package name */
    public final float f11573h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f11574i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public C0751e f11575k;

    /* renamed from: l, reason: collision with root package name */
    public float f11576l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11577m;

    public C0750d(l lVar) {
        k kVar = l.f429q;
        this.f11566a = 0.0f;
        this.f11567b = Float.MAX_VALUE;
        this.f11568c = false;
        this.f11571f = false;
        this.f11572g = 0L;
        this.f11574i = new ArrayList();
        this.j = new ArrayList();
        this.f11569d = lVar;
        this.f11570e = kVar;
        if (kVar != f11562p && kVar != f11563q && kVar != f11564r) {
            if (kVar == f11565s) {
                this.f11573h = 0.00390625f;
            } else if (kVar != f11560n && kVar != f11561o) {
                this.f11573h = 1.0f;
            } else {
                this.f11573h = 0.00390625f;
            }
        } else {
            this.f11573h = 0.1f;
        }
        this.f11575k = null;
        this.f11576l = Float.MAX_VALUE;
        this.f11577m = false;
    }

    public final void a(float f9) {
        this.f11570e.getClass();
        l lVar = this.f11569d;
        lVar.f433o.f448b = f9 / 10000.0f;
        lVar.invalidateSelf();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i9 < arrayList.size()) {
                if (arrayList.get(i9) == null) {
                    i9++;
                } else {
                    arrayList.get(i9).getClass();
                    throw new ClassCastException();
                }
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
        }
    }

    public final void b() {
        if (this.f11575k.f11579b > 0.0d) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f11571f) {
                    this.f11577m = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}
