package i2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f18468a;

    /* renamed from: b, reason: collision with root package name */
    public static final k f18469b;

    /* renamed from: c, reason: collision with root package name */
    public static final k f18470c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k[] f18471d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, i2.k] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, i2.k] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, i2.k] */
    static {
        ?? r32 = new Enum("INIT", 0);
        f18468a = r32;
        ?? r42 = new Enum("SUBMIT", 1);
        f18469b = r42;
        ?? r5 = new Enum("LOGIN_REQUIRE", 2);
        f18470c = r5;
        f18471d = new k[]{r32, r42, r5};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f18471d.clone();
    }
}
