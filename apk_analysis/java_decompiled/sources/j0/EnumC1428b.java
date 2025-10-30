package j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1428b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1428b f19179a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1428b f19180b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1428b f19181c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1428b f19182d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1428b[] f19183e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1428b EF9;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, j0.b] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, j0.b] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, j0.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, j0.b] */
    static {
        Enum r9 = new Enum("PENALTY_LOG", 0);
        Enum r10 = new Enum("PENALTY_DEATH", 1);
        ?? r11 = new Enum("DETECT_FRAGMENT_REUSE", 2);
        f19179a = r11;
        ?? r12 = new Enum("DETECT_FRAGMENT_TAG_USAGE", 3);
        f19180b = r12;
        ?? r13 = new Enum("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f19181c = r13;
        Enum r14 = new Enum("DETECT_RETAIN_INSTANCE_USAGE", 5);
        Enum r15 = new Enum("DETECT_SET_USER_VISIBLE_HINT", 6);
        Enum r32 = new Enum("DETECT_TARGET_FRAGMENT_USAGE", 7);
        ?? r22 = new Enum("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f19182d = r22;
        f19183e = new EnumC1428b[]{r9, r10, r11, r12, r13, r14, r15, r32, r22};
    }

    public static EnumC1428b valueOf(String str) {
        return (EnumC1428b) Enum.valueOf(EnumC1428b.class, str);
    }

    public static EnumC1428b[] values() {
        return (EnumC1428b[]) f19183e.clone();
    }
}
