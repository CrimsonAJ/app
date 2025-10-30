package G0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public static final B f2636a;

    /* renamed from: b, reason: collision with root package name */
    public static final B f2637b;

    /* renamed from: c, reason: collision with root package name */
    public static final B f2638c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ B[] f2639d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, G0.B] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, G0.B] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, G0.B] */
    static {
        ?? r32 = new Enum("AUTOMATIC", 0);
        f2636a = r32;
        ?? r42 = new Enum("TRUNCATE", 1);
        f2637b = r42;
        ?? r5 = new Enum("WRITE_AHEAD_LOGGING", 2);
        f2638c = r5;
        f2639d = new B[]{r32, r42, r5};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f2639d.clone();
    }
}
