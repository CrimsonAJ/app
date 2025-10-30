package X2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f8409a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ x[] f8410b;

    /* JADX INFO: Fake field, exist only in values array */
    x EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, X2.x] */
    static {
        Enum r22 = new Enum("UNKNOWN", 0);
        ?? r32 = new Enum("ANDROID_FIREBASE", 1);
        f8409a = r32;
        f8410b = new x[]{r22, r32};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f8410b.clone();
    }
}
