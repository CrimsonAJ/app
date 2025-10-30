package b5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final v1 f11335a;

    /* renamed from: b, reason: collision with root package name */
    public static final v1 f11336b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v1[] f11337c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, b5.v1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, b5.v1] */
    static {
        ?? r42 = new Enum("CONSENT", 0);
        f11335a = r42;
        Enum r5 = new Enum("LEGITIMATE_INTEREST", 1);
        Enum r62 = new Enum("FLEXIBLE_CONSENT", 2);
        ?? r7 = new Enum("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        f11336b = r7;
        f11337c = new v1[]{r42, r5, r62, r7};
    }

    public static v1[] values() {
        return (v1[]) f11337c.clone();
    }
}
