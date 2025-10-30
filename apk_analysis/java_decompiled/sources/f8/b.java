package f8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f17450a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f17451b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f17452c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f17453d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f17454e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f17455f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, f8.b] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, f8.b] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, f8.b] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, f8.b] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, f8.b] */
    static {
        ?? r5 = new Enum("CPU_ACQUIRED", 0);
        f17450a = r5;
        ?? r62 = new Enum("BLOCKING", 1);
        f17451b = r62;
        ?? r7 = new Enum("PARKING", 2);
        f17452c = r7;
        ?? r82 = new Enum("DORMANT", 3);
        f17453d = r82;
        ?? r9 = new Enum("TERMINATED", 4);
        f17454e = r9;
        f17455f = new b[]{r5, r62, r7, r82, r9};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f17455f.clone();
    }
}
