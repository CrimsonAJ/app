package o2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1687n {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1687n f21538b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC1687n[] f21539c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ H7.a f21540d;

    /* renamed from: a, reason: collision with root package name */
    public final int f21541a;

    static {
        EnumC1687n enumC1687n = new EnumC1687n("WHITE", 0, -1);
        f21538b = enumC1687n;
        EnumC1687n[] enumC1687nArr = {enumC1687n, new EnumC1687n("YELLOW", 1, -256), new EnumC1687n("GREEN", 2, -16711936), new EnumC1687n("CYAN", 3, -16711681), new EnumC1687n("BLUE", 4, -16776961), new EnumC1687n("MAGENTA", 5, -65281), new EnumC1687n("RED", 6, -65536), new EnumC1687n("BLACK", 7, -16777216)};
        f21539c = enumC1687nArr;
        f21540d = new H7.a(enumC1687nArr);
    }

    public EnumC1687n(String str, int i9, int i10) {
        this.f21541a = i10;
    }

    public static EnumC1687n valueOf(String str) {
        return (EnumC1687n) Enum.valueOf(EnumC1687n.class, str);
    }

    public static EnumC1687n[] values() {
        return (EnumC1687n[]) f21539c.clone();
    }
}
