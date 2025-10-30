package O6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f5515a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f5516b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, O6.d] */
    static {
        ?? r32 = new Enum("DEFAULT", 0);
        f5515a = r32;
        f5516b = new d[]{r32, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f5516b.clone();
    }
}
