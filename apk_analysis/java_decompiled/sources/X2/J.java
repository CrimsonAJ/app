package X2;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final J f8324a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ J[] f8325b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, java.lang.Object, X2.J] */
    static {
        ?? r62 = new Enum("DEFAULT", 0);
        f8324a = r62;
        Enum r7 = new Enum("UNMETERED_ONLY", 1);
        Enum r82 = new Enum("UNMETERED_OR_DAILY", 2);
        Enum r9 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        Enum r10 = new Enum("NEVER", 4);
        Enum r11 = new Enum("UNRECOGNIZED", 5);
        f8325b = new J[]{r62, r7, r82, r9, r10, r11};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r62);
        sparseArray.put(1, r7);
        sparseArray.put(2, r82);
        sparseArray.put(3, r9);
        sparseArray.put(4, r10);
        sparseArray.put(-1, r11);
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f8325b.clone();
    }
}
