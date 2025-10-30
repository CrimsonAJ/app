package p2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1853f {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1853f f22147a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1853f f22148b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1853f f22149c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1853f f22150d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1853f f22151e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC1853f[] f22152f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, p2.f] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, p2.f] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, p2.f] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, p2.f] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, p2.f] */
    static {
        ?? r5 = new Enum("INIT", 0);
        f22147a = r5;
        ?? r62 = new Enum("OPEN_WELCOME", 1);
        f22148b = r62;
        ?? r7 = new Enum("OPEN_HOME", 2);
        f22149c = r7;
        ?? r82 = new Enum("OPEN_UPDATE", 3);
        f22150d = r82;
        ?? r9 = new Enum("COMMON_ERROR", 4);
        f22151e = r9;
        f22152f = new EnumC1853f[]{r5, r62, r7, r82, r9};
    }

    public static EnumC1853f valueOf(String str) {
        return (EnumC1853f) Enum.valueOf(EnumC1853f.class, str);
    }

    public static EnumC1853f[] values() {
        return (EnumC1853f[]) f22152f.clone();
    }
}
