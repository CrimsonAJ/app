package M1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f4753a;

    /* renamed from: b, reason: collision with root package name */
    public static final u f4754b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u[] f4755c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, M1.u] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, M1.u] */
    static {
        ?? r22 = new Enum("PORTRAIT", 0);
        f4753a = r22;
        ?? r32 = new Enum("LANDSCAPE", 1);
        f4754b = r32;
        f4755c = new u[]{r22, r32};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f4755c.clone();
    }
}
