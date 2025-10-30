package J2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f4162b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f4163c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f4164d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f4165e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f4166f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c[] f4167g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ H7.a f4168h;

    /* renamed from: a, reason: collision with root package name */
    public final int f4169a;

    static {
        c cVar = new c("AUTO", 0, 0);
        f4162b = cVar;
        c cVar2 = new c("FHD", 1, 1080);
        f4163c = cVar2;
        c cVar3 = new c("HD", 2, 720);
        f4164d = cVar3;
        c cVar4 = new c("SDP", 3, 480);
        f4165e = cVar4;
        c cVar5 = new c("SD", 4, 360);
        f4166f = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        f4167g = cVarArr;
        f4168h = new H7.a(cVarArr);
    }

    public c(String str, int i9, int i10) {
        this.f4169a = i10;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f4167g.clone();
    }
}
