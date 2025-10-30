package Y7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f8740a;

    /* renamed from: b, reason: collision with root package name */
    public static final A f8741b;

    /* renamed from: c, reason: collision with root package name */
    public static final A f8742c;

    /* renamed from: d, reason: collision with root package name */
    public static final A f8743d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ A[] f8744e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, Y7.A] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Y7.A] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Y7.A] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Y7.A] */
    static {
        ?? r42 = new Enum("DEFAULT", 0);
        f8740a = r42;
        ?? r5 = new Enum("LAZY", 1);
        f8741b = r5;
        ?? r62 = new Enum("ATOMIC", 2);
        f8742c = r62;
        ?? r7 = new Enum("UNDISPATCHED", 3);
        f8743d = r7;
        f8744e = new A[]{r42, r5, r62, r7};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f8744e.clone();
    }
}
