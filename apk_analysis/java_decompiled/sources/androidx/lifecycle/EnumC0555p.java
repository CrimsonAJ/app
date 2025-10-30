package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0555p {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0555p f9893a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0555p f9894b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0555p f9895c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0555p f9896d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0555p f9897e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0555p[] f9898f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, androidx.lifecycle.p] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, androidx.lifecycle.p] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, androidx.lifecycle.p] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.lifecycle.p] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.lifecycle.p] */
    static {
        ?? r5 = new Enum("DESTROYED", 0);
        f9893a = r5;
        ?? r62 = new Enum("INITIALIZED", 1);
        f9894b = r62;
        ?? r7 = new Enum("CREATED", 2);
        f9895c = r7;
        ?? r82 = new Enum("STARTED", 3);
        f9896d = r82;
        ?? r9 = new Enum("RESUMED", 4);
        f9897e = r9;
        f9898f = new EnumC0555p[]{r5, r62, r7, r82, r9};
    }

    public static EnumC0555p valueOf(String str) {
        return (EnumC0555p) Enum.valueOf(EnumC0555p.class, str);
    }

    public static EnumC0555p[] values() {
        return (EnumC0555p[]) f9898f.clone();
    }
}
