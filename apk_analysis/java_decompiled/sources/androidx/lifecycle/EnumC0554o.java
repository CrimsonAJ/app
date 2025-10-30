package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0554o {
    private static final /* synthetic */ EnumC0554o[] $VALUES;
    public static final C0552m Companion;
    public static final EnumC0554o ON_ANY;
    public static final EnumC0554o ON_CREATE;
    public static final EnumC0554o ON_DESTROY;
    public static final EnumC0554o ON_PAUSE;
    public static final EnumC0554o ON_RESUME;
    public static final EnumC0554o ON_START;
    public static final EnumC0554o ON_STOP;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.lifecycle.m] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.lifecycle.o] */
    static {
        ?? r7 = new Enum("ON_CREATE", 0);
        ON_CREATE = r7;
        ?? r82 = new Enum("ON_START", 1);
        ON_START = r82;
        ?? r9 = new Enum("ON_RESUME", 2);
        ON_RESUME = r9;
        ?? r10 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r10;
        ?? r11 = new Enum("ON_STOP", 4);
        ON_STOP = r11;
        ?? r12 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r12;
        ?? r13 = new Enum("ON_ANY", 6);
        ON_ANY = r13;
        $VALUES = new EnumC0554o[]{r7, r82, r9, r10, r11, r12, r13};
        Companion = new Object();
    }

    public static EnumC0554o valueOf(String str) {
        return (EnumC0554o) Enum.valueOf(EnumC0554o.class, str);
    }

    public static EnumC0554o[] values() {
        return (EnumC0554o[]) $VALUES.clone();
    }

    public final EnumC0555p a() {
        switch (AbstractC0553n.f9892a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0555p.f9895c;
            case 3:
            case 4:
                return EnumC0555p.f9896d;
            case 5:
                return EnumC0555p.f9897e;
            case 6:
                return EnumC0555p.f9893a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
