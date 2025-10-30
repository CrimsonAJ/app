package R0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f6474a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f6475b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f6476c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f6477d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f6478e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f[] f6479f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [R0.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [R0.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [R0.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [R0.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [R0.f, java.lang.Enum] */
    static {
        ?? r5 = new Enum("ON_CONFIGURE", 0);
        f6474a = r5;
        ?? r62 = new Enum("ON_CREATE", 1);
        f6475b = r62;
        ?? r7 = new Enum("ON_UPGRADE", 2);
        f6476c = r7;
        ?? r82 = new Enum("ON_DOWNGRADE", 3);
        f6477d = r82;
        ?? r9 = new Enum("ON_OPEN", 4);
        f6478e = r9;
        f6479f = new f[]{r5, r62, r7, r82, r9};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f6479f.clone();
    }
}
