package e2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f17134a;

    /* renamed from: b, reason: collision with root package name */
    public static final x f17135b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ x[] f17136c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, e2.x] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, e2.x] */
    static {
        ?? r22 = new Enum("NOTHING", 0);
        f17134a = r22;
        ?? r32 = new Enum("RELOAD", 1);
        f17135b = r32;
        f17136c = new x[]{r22, r32};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f17136c.clone();
    }
}
