package u1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2061i {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC2061i f23589a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC2061i[] f23590b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2061i EF3;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [u1.i, java.lang.Enum] */
    static {
        Enum r32 = new Enum("IGNORE", 0);
        ?? r42 = new Enum("RESPECT_PERFORMANCE", 1);
        f23589a = r42;
        f23590b = new EnumC2061i[]{r32, r42, new Enum("RESPECT_ALL", 2)};
    }

    public static EnumC2061i valueOf(String str) {
        return (EnumC2061i) Enum.valueOf(EnumC2061i.class, str);
    }

    public static EnumC2061i[] values() {
        return (EnumC2061i[]) f23590b.clone();
    }
}
