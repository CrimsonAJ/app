package e3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f17152a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f17153b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f17154c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e[] f17155d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, e3.e] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, e3.e] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, e3.e] */
    static {
        ?? r32 = new Enum("NETWORK_UNMETERED", 0);
        f17152a = r32;
        ?? r42 = new Enum("DEVICE_IDLE", 1);
        f17153b = r42;
        ?? r5 = new Enum("DEVICE_CHARGING", 2);
        f17154c = r5;
        f17155d = new e[]{r32, r42, r5};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f17155d.clone();
    }
}
