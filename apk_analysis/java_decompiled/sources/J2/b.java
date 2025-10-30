package J2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f4157b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f4158c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b[] f4159d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ H7.a f4160e;

    /* renamed from: a, reason: collision with root package name */
    public final String f4161a;

    static {
        b bVar = new b("ALL", 0, "all");
        b bVar2 = new b("MOVIE", 1, "movie");
        f4157b = bVar2;
        b bVar3 = new b("TV_SERIES", 2, "tv");
        f4158c = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        f4159d = bVarArr;
        f4160e = new H7.a(bVarArr);
    }

    public b(String str, int i9, String str2) {
        this.f4161a = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f4159d.clone();
    }
}
