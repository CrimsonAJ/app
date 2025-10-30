package J2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4153a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f4154b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f4155c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f4156d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, J2.a] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, J2.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, J2.a] */
    static {
        ?? r32 = new Enum("TEXT", 0);
        f4153a = r32;
        ?? r42 = new Enum("XML", 1);
        f4154b = r42;
        ?? r5 = new Enum("JSON", 2);
        f4155c = r5;
        f4156d = new a[]{r32, r42, r5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4156d.clone();
    }
}
