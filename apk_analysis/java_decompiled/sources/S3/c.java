package S3;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f6758b = {8, 13, 11, 2, 0, 1, 7};

    public static void a(int i9, ArrayList arrayList) {
        if (v4.e.C(f6758b, i9, 0, 7) != -1 && !arrayList.contains(Integer.valueOf(i9))) {
            arrayList.add(Integer.valueOf(i9));
        }
    }
}
