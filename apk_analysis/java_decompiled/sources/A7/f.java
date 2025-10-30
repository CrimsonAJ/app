package A7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f545a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f[] f546b;

    /* JADX INFO: Fake field, exist only in values array */
    f EF3;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [A7.f, java.lang.Enum] */
    static {
        Enum r32 = new Enum("SYNCHRONIZED", 0);
        Enum r42 = new Enum("PUBLICATION", 1);
        ?? r5 = new Enum("NONE", 2);
        f545a = r5;
        f546b = new f[]{r32, r42, r5};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f546b.clone();
    }
}
