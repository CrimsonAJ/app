package r2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f22597a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f22598b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f22599c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f22600d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c[] f22601e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [r2.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [r2.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [r2.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [r2.c, java.lang.Enum] */
    static {
        ?? r42 = new Enum("GONE", 0);
        f22597a = r42;
        ?? r5 = new Enum("INTRO", 1);
        f22598b = r5;
        ?? r62 = new Enum("OUTRO", 2);
        f22599c = r62;
        ?? r7 = new Enum("FORCE", 3);
        f22600d = r7;
        f22601e = new c[]{r42, r5, r62, r7};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f22601e.clone();
    }
}
