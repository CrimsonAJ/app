package O1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f5272a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f5273b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f5274c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e[] f5275d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, O1.e] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, O1.e] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, O1.e] */
    static {
        ?? r32 = new Enum("INIT", 0);
        f5272a = r32;
        ?? r42 = new Enum("NOT_MATCH", 1);
        f5273b = r42;
        ?? r5 = new Enum("SUCCESSFUL", 2);
        f5274c = r5;
        f5275d = new e[]{r32, r42, r5};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f5275d.clone();
    }
}
