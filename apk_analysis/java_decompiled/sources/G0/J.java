package G0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public static final J f2671a;

    /* renamed from: b, reason: collision with root package name */
    public static final J f2672b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ J[] f2673c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, G0.J] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, G0.J] */
    static {
        ?? r32 = new Enum("DEFERRED", 0);
        f2671a = r32;
        ?? r42 = new Enum("IMMEDIATE", 1);
        f2672b = r42;
        f2673c = new J[]{r32, r42, new Enum("EXCLUSIVE", 2)};
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f2673c.clone();
    }
}
