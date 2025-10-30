package u1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2057e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2057e f23577a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC2057e f23578b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2057e f23579c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2057e f23580d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC2057e[] f23581e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, u1.e] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, u1.e] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, u1.e] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, u1.e] */
    static {
        ?? r42 = new Enum("MEMORY_CACHE", 0);
        f23577a = r42;
        ?? r5 = new Enum("MEMORY", 1);
        f23578b = r5;
        ?? r62 = new Enum("DISK", 2);
        f23579c = r62;
        ?? r7 = new Enum("NETWORK", 3);
        f23580d = r7;
        f23581e = new EnumC2057e[]{r42, r5, r62, r7};
    }

    public static EnumC2057e valueOf(String str) {
        return (EnumC2057e) Enum.valueOf(EnumC2057e.class, str);
    }

    public static EnumC2057e[] values() {
        return (EnumC2057e[]) f23581e.clone();
    }
}
