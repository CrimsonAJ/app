package D1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1770a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d[] f1771b;

    /* JADX INFO: Fake field, exist only in values array */
    d EF3;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, D1.d] */
    static {
        Enum r32 = new Enum("EXACT", 0);
        Enum r42 = new Enum("INEXACT", 1);
        ?? r5 = new Enum("AUTOMATIC", 2);
        f1770a = r5;
        f1771b = new d[]{r32, r42, r5};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f1771b.clone();
    }
}
