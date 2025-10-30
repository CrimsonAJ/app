package y0;

import android.util.SparseBooleanArray;
import java.util.ArrayList;
import s.C1935e;
import s.C1939i;

/* renamed from: y0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2198f {

    /* renamed from: e, reason: collision with root package name */
    public static final C2195c f24756e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24757a;

    /* renamed from: d, reason: collision with root package name */
    public final C2197e f24760d;

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f24759c = new SparseBooleanArray();

    /* renamed from: b, reason: collision with root package name */
    public final C1935e f24758b = new C1939i(0);

    /* JADX WARN: Type inference failed for: r7v2, types: [s.e, s.i] */
    public C2198f(ArrayList arrayList, ArrayList arrayList2) {
        this.f24757a = arrayList;
        int size = arrayList.size();
        int i9 = Integer.MIN_VALUE;
        C2197e c2197e = null;
        for (int i10 = 0; i10 < size; i10++) {
            C2197e c2197e2 = (C2197e) arrayList.get(i10);
            int i11 = c2197e2.f24751e;
            if (i11 > i9) {
                c2197e = c2197e2;
                i9 = i11;
            }
        }
        this.f24760d = c2197e;
    }
}
