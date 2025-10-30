package J2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f4170a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f4171b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ H7.a f4172c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, J2.d] */
    static {
        ?? r5 = new Enum("DEFAULT", 0);
        f4170a = r5;
        d[] dVarArr = {r5, new Enum("DEFAULT_BOLD", 1), new Enum("SANS_SERIF", 2), new Enum("SERIF", 3), new Enum("MONOSPACE", 4)};
        f4171b = dVarArr;
        f4172c = new H7.a(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f4171b.clone();
    }
}
