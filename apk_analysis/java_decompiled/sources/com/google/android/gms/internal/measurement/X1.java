package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class X1 {

    /* renamed from: b, reason: collision with root package name */
    public static final X1 f15399b;

    /* renamed from: c, reason: collision with root package name */
    public static final X1 f15400c;

    /* renamed from: d, reason: collision with root package name */
    public static final X1[] f15401d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ X1[] f15402e;

    /* renamed from: a, reason: collision with root package name */
    public final int f15403a;

    /* JADX INFO: Fake field, exist only in values array */
    X1 EF0;

    static {
        EnumC0959l2 enumC0959l2 = EnumC0959l2.f15526e;
        X1 x12 = new X1("DOUBLE", 0, 0, 1, enumC0959l2);
        EnumC0959l2 enumC0959l22 = EnumC0959l2.f15525d;
        X1 x13 = new X1("FLOAT", 1, 1, 1, enumC0959l22);
        EnumC0959l2 enumC0959l23 = EnumC0959l2.f15524c;
        X1 x14 = new X1("INT64", 2, 2, 1, enumC0959l23);
        X1 x15 = new X1("UINT64", 3, 3, 1, enumC0959l23);
        EnumC0959l2 enumC0959l24 = EnumC0959l2.f15523b;
        X1 x16 = new X1("INT32", 4, 4, 1, enumC0959l24);
        X1 x17 = new X1("FIXED64", 5, 5, 1, enumC0959l23);
        X1 x18 = new X1("FIXED32", 6, 6, 1, enumC0959l24);
        EnumC0959l2 enumC0959l25 = EnumC0959l2.f15527f;
        X1 x19 = new X1("BOOL", 7, 7, 1, enumC0959l25);
        EnumC0959l2 enumC0959l26 = EnumC0959l2.f15528g;
        X1 x110 = new X1("STRING", 8, 8, 1, enumC0959l26);
        EnumC0959l2 enumC0959l27 = EnumC0959l2.j;
        X1 x111 = new X1("MESSAGE", 9, 9, 1, enumC0959l27);
        EnumC0959l2 enumC0959l28 = EnumC0959l2.f15529h;
        X1 x112 = new X1("BYTES", 10, 10, 1, enumC0959l28);
        X1 x113 = new X1("UINT32", 11, 11, 1, enumC0959l24);
        EnumC0959l2 enumC0959l29 = EnumC0959l2.f15530i;
        X1 x114 = new X1("ENUM", 12, 12, 1, enumC0959l29);
        X1 x115 = new X1("SFIXED32", 13, 13, 1, enumC0959l24);
        X1 x116 = new X1("SFIXED64", 14, 14, 1, enumC0959l23);
        X1 x117 = new X1("SINT32", 15, 15, 1, enumC0959l24);
        X1 x118 = new X1("SINT64", 16, 16, 1, enumC0959l23);
        X1 x119 = new X1("GROUP", 17, 17, 1, enumC0959l27);
        X1 x120 = new X1("DOUBLE_LIST", 18, 18, 2, enumC0959l2);
        X1 x121 = new X1("FLOAT_LIST", 19, 19, 2, enumC0959l22);
        X1 x122 = new X1("INT64_LIST", 20, 20, 2, enumC0959l23);
        X1 x123 = new X1("UINT64_LIST", 21, 21, 2, enumC0959l23);
        X1 x124 = new X1("INT32_LIST", 22, 22, 2, enumC0959l24);
        X1 x125 = new X1("FIXED64_LIST", 23, 23, 2, enumC0959l23);
        X1 x126 = new X1("FIXED32_LIST", 24, 24, 2, enumC0959l24);
        X1 x127 = new X1("BOOL_LIST", 25, 25, 2, enumC0959l25);
        X1 x128 = new X1("STRING_LIST", 26, 26, 2, enumC0959l26);
        X1 x129 = new X1("MESSAGE_LIST", 27, 27, 2, enumC0959l27);
        X1 x130 = new X1("BYTES_LIST", 28, 28, 2, enumC0959l28);
        X1 x131 = new X1("UINT32_LIST", 29, 29, 2, enumC0959l24);
        X1 x132 = new X1("ENUM_LIST", 30, 30, 2, enumC0959l29);
        X1 x133 = new X1("SFIXED32_LIST", 31, 31, 2, enumC0959l24);
        X1 x134 = new X1("SFIXED64_LIST", 32, 32, 2, enumC0959l23);
        X1 x135 = new X1("SINT32_LIST", 33, 33, 2, enumC0959l24);
        X1 x136 = new X1("SINT64_LIST", 34, 34, 2, enumC0959l23);
        X1 x137 = new X1("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0959l2);
        f15399b = x137;
        X1 x138 = new X1("FLOAT_LIST_PACKED", 36, 36, 3, enumC0959l22);
        X1 x139 = new X1("INT64_LIST_PACKED", 37, 37, 3, enumC0959l23);
        X1 x140 = new X1("UINT64_LIST_PACKED", 38, 38, 3, enumC0959l23);
        X1 x141 = new X1("INT32_LIST_PACKED", 39, 39, 3, enumC0959l24);
        X1 x142 = new X1("FIXED64_LIST_PACKED", 40, 40, 3, enumC0959l23);
        X1 x143 = new X1("FIXED32_LIST_PACKED", 41, 41, 3, enumC0959l24);
        X1 x144 = new X1("BOOL_LIST_PACKED", 42, 42, 3, enumC0959l25);
        X1 x145 = new X1("UINT32_LIST_PACKED", 43, 43, 3, enumC0959l24);
        X1 x146 = new X1("ENUM_LIST_PACKED", 44, 44, 3, enumC0959l29);
        X1 x147 = new X1("SFIXED32_LIST_PACKED", 45, 45, 3, enumC0959l24);
        X1 x148 = new X1("SFIXED64_LIST_PACKED", 46, 46, 3, enumC0959l23);
        X1 x149 = new X1("SINT32_LIST_PACKED", 47, 47, 3, enumC0959l24);
        X1 x150 = new X1("SINT64_LIST_PACKED", 48, 48, 3, enumC0959l23);
        f15400c = x150;
        f15402e = new X1[]{x12, x13, x14, x15, x16, x17, x18, x19, x110, x111, x112, x113, x114, x115, x116, x117, x118, x119, x120, x121, x122, x123, x124, x125, x126, x127, x128, x129, x130, x131, x132, x133, x134, x135, x136, x137, x138, x139, x140, x141, x142, x143, x144, x145, x146, x147, x148, x149, x150, new X1("GROUP_LIST", 49, 49, 2, enumC0959l27), new X1("MAP", 50, 50, 4, EnumC0959l2.f15522a)};
        X1[] values = values();
        f15401d = new X1[values.length];
        for (X1 x151 : values) {
            f15401d[x151.f15403a] = x151;
        }
    }

    public X1(String str, int i9, int i10, int i11, EnumC0959l2 enumC0959l2) {
        this.f15403a = i10;
        int i12 = i11 - 1;
        if (i12 != 1) {
            if (i12 == 3) {
                enumC0959l2.getClass();
            }
        } else {
            enumC0959l2.getClass();
        }
        if (i11 == 1) {
            EnumC0959l2 enumC0959l22 = EnumC0959l2.f15522a;
            enumC0959l2.ordinal();
        }
    }

    public static X1[] values() {
        return (X1[]) f15402e.clone();
    }
}
