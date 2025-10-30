package j2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f19207a;

    /* renamed from: b, reason: collision with root package name */
    public static final g f19208b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f19209c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g[] f19210d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [j2.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [j2.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [j2.g, java.lang.Enum] */
    static {
        ?? r32 = new Enum("INIT", 0);
        f19207a = r32;
        ?? r42 = new Enum("NOT_MATCH", 1);
        f19208b = r42;
        ?? r5 = new Enum("SUCCESSFUL", 2);
        f19209c = r5;
        f19210d = new g[]{r32, r42, r5};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f19210d.clone();
    }
}
