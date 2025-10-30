package a8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0509a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0509a f9184a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0509a f9185b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0509a f9186c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC0509a[] f9187d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, a8.a] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, a8.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, a8.a] */
    static {
        ?? r32 = new Enum("SUSPEND", 0);
        f9184a = r32;
        ?? r42 = new Enum("DROP_OLDEST", 1);
        f9185b = r42;
        ?? r5 = new Enum("DROP_LATEST", 2);
        f9186c = r5;
        f9187d = new EnumC0509a[]{r32, r42, r5};
    }

    public static EnumC0509a valueOf(String str) {
        return (EnumC0509a) Enum.valueOf(EnumC0509a.class, str);
    }

    public static EnumC0509a[] values() {
        return (EnumC0509a[]) f9187d.clone();
    }
}
