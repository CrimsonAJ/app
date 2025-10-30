package G0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f2800a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f2801b;

    /* renamed from: c, reason: collision with root package name */
    public static final r f2802c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ r[] f2803d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, G0.r] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, G0.r] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, G0.r] */
    static {
        ?? r32 = new Enum("NO_OP", 0);
        f2800a = r32;
        ?? r42 = new Enum("ADD", 1);
        f2801b = r42;
        ?? r5 = new Enum("REMOVE", 2);
        f2802c = r5;
        f2803d = new r[]{r32, r42, r5};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f2803d.clone();
    }
}
