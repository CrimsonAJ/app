package F7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2587a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f2588b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, F7.a] */
    static {
        ?? r32 = new Enum("COROUTINE_SUSPENDED", 0);
        f2587a = r32;
        f2588b = new a[]{r32, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2588b.clone();
    }
}
