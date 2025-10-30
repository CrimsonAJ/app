package y6;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f25042a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f25043b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ f[] f25044c;

    /* JADX INFO: Fake field, exist only in values array */
    f EF10;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [y6.f, java.lang.Enum] */
    static {
        Enum r10 = new Enum("X86_32", 0);
        Enum r11 = new Enum("X86_64", 1);
        Enum r12 = new Enum("ARM_UNKNOWN", 2);
        Enum r13 = new Enum("PPC", 3);
        Enum r14 = new Enum("PPC64", 4);
        Enum r15 = new Enum("ARMV6", 5);
        Enum r62 = new Enum("ARMV7", 6);
        ?? r42 = new Enum("UNKNOWN", 7);
        f25042a = r42;
        Enum r32 = new Enum("ARMV7S", 8);
        Enum r22 = new Enum("ARM64", 9);
        f25044c = new f[]{r10, r11, r12, r13, r14, r15, r62, r42, r32, r22};
        HashMap hashMap = new HashMap(4);
        f25043b = hashMap;
        hashMap.put("armeabi-v7a", r62);
        hashMap.put("armeabi", r15);
        hashMap.put("arm64-v8a", r22);
        hashMap.put("x86", r10);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f25044c.clone();
    }
}
