package V2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f7660a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f7661b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f7662c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f7663d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, V2.d] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, V2.d] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, V2.d] */
    static {
        ?? r32 = new Enum("DEFAULT", 0);
        f7660a = r32;
        ?? r42 = new Enum("VERY_LOW", 1);
        f7661b = r42;
        ?? r5 = new Enum("HIGHEST", 2);
        f7662c = r5;
        f7663d = new d[]{r32, r42, r5};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f7663d.clone();
    }
}
