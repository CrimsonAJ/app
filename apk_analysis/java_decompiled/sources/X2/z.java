package X2;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f8411a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ z[] f8412b;

    /* JADX INFO: Fake field, exist only in values array */
    z EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, java.lang.Object, X2.z] */
    static {
        Enum r22 = new Enum("NOT_SET", 0);
        ?? r32 = new Enum("EVENT_OVERRIDE", 1);
        f8411a = r32;
        f8412b = new z[]{r22, r32};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r22);
        sparseArray.put(5, r32);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f8412b.clone();
    }
}
