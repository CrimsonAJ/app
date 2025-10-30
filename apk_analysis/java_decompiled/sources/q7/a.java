package q7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22437a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f22438b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f22439c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f22440d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f22441e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f22442f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, q7.a] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, q7.a] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, q7.a] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, q7.a] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, q7.a] */
    static {
        ?? r5 = new Enum("LevelDebug", 0);
        f22437a = r5;
        ?? r62 = new Enum("LevelInfo", 1);
        f22438b = r62;
        ?? r7 = new Enum("LevelWarning", 2);
        f22439c = r7;
        ?? r82 = new Enum("LevelError", 3);
        f22440d = r82;
        ?? r9 = new Enum("LevelNone", 4);
        f22441e = r9;
        f22442f = new a[]{r5, r62, r7, r82, r9};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f22442f.clone();
    }
}
