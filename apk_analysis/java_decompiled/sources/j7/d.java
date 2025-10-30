package j7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f19794a;

    /* renamed from: b, reason: collision with root package name */
    public static final d f19795b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f19796c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [j7.d, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [j7.d, java.lang.Enum] */
    static {
        ?? r32 = new Enum("CRASHLYTICS", 0);
        f19794a = r32;
        ?? r42 = new Enum("PERFORMANCE", 1);
        f19795b = r42;
        f19796c = new d[]{r32, r42, new Enum("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f19796c.clone();
    }
}
