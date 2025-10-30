package D1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1773a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f1774b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g[] f1775c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, D1.g] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, D1.g] */
    static {
        ?? r22 = new Enum("FILL", 0);
        f1773a = r22;
        ?? r32 = new Enum("FIT", 1);
        f1774b = r32;
        f1775c = new g[]{r22, r32};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f1775c.clone();
    }
}
