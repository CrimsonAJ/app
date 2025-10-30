package q7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f22443a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f22444b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f22445c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, q7.b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, q7.b] */
    static {
        ?? r22 = new Enum("OnErrorDiscard", 0);
        f22443a = r22;
        ?? r32 = new Enum("OnErrorRecover", 1);
        f22444b = r32;
        f22445c = new b[]{r22, r32};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f22445c.clone();
    }
}
