package com.google.android.gms.internal.cast;

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
public final class L2 {

    /* renamed from: b, reason: collision with root package name */
    public static final L2 f14741b;

    /* renamed from: c, reason: collision with root package name */
    public static final L2 f14742c;

    /* renamed from: d, reason: collision with root package name */
    public static final L2[] f14743d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ L2[] f14744e;

    /* renamed from: a, reason: collision with root package name */
    public final int f14745a;

    /* JADX INFO: Fake field, exist only in values array */
    L2 EF0;

    static {
        T2 t22 = T2.f14769e;
        L2 l22 = new L2("DOUBLE", 0, 0, 1, t22);
        T2 t23 = T2.f14768d;
        L2 l23 = new L2("FLOAT", 1, 1, 1, t23);
        T2 t24 = T2.f14767c;
        L2 l24 = new L2("INT64", 2, 2, 1, t24);
        L2 l25 = new L2("UINT64", 3, 3, 1, t24);
        T2 t25 = T2.f14766b;
        L2 l26 = new L2("INT32", 4, 4, 1, t25);
        L2 l27 = new L2("FIXED64", 5, 5, 1, t24);
        L2 l28 = new L2("FIXED32", 6, 6, 1, t25);
        T2 t26 = T2.f14770f;
        L2 l29 = new L2("BOOL", 7, 7, 1, t26);
        T2 t27 = T2.f14771g;
        L2 l210 = new L2("STRING", 8, 8, 1, t27);
        T2 t28 = T2.j;
        L2 l211 = new L2("MESSAGE", 9, 9, 1, t28);
        T2 t29 = T2.f14772h;
        L2 l212 = new L2("BYTES", 10, 10, 1, t29);
        L2 l213 = new L2("UINT32", 11, 11, 1, t25);
        T2 t210 = T2.f14773i;
        L2 l214 = new L2("ENUM", 12, 12, 1, t210);
        L2 l215 = new L2("SFIXED32", 13, 13, 1, t25);
        L2 l216 = new L2("SFIXED64", 14, 14, 1, t24);
        L2 l217 = new L2("SINT32", 15, 15, 1, t25);
        L2 l218 = new L2("SINT64", 16, 16, 1, t24);
        L2 l219 = new L2("GROUP", 17, 17, 1, t28);
        L2 l220 = new L2("DOUBLE_LIST", 18, 18, 2, t22);
        L2 l221 = new L2("FLOAT_LIST", 19, 19, 2, t23);
        L2 l222 = new L2("INT64_LIST", 20, 20, 2, t24);
        L2 l223 = new L2("UINT64_LIST", 21, 21, 2, t24);
        L2 l224 = new L2("INT32_LIST", 22, 22, 2, t25);
        L2 l225 = new L2("FIXED64_LIST", 23, 23, 2, t24);
        L2 l226 = new L2("FIXED32_LIST", 24, 24, 2, t25);
        L2 l227 = new L2("BOOL_LIST", 25, 25, 2, t26);
        L2 l228 = new L2("STRING_LIST", 26, 26, 2, t27);
        L2 l229 = new L2("MESSAGE_LIST", 27, 27, 2, t28);
        L2 l230 = new L2("BYTES_LIST", 28, 28, 2, t29);
        L2 l231 = new L2("UINT32_LIST", 29, 29, 2, t25);
        L2 l232 = new L2("ENUM_LIST", 30, 30, 2, t210);
        L2 l233 = new L2("SFIXED32_LIST", 31, 31, 2, t25);
        L2 l234 = new L2("SFIXED64_LIST", 32, 32, 2, t24);
        L2 l235 = new L2("SINT32_LIST", 33, 33, 2, t25);
        L2 l236 = new L2("SINT64_LIST", 34, 34, 2, t24);
        L2 l237 = new L2("DOUBLE_LIST_PACKED", 35, 35, 3, t22);
        f14741b = l237;
        L2 l238 = new L2("FLOAT_LIST_PACKED", 36, 36, 3, t23);
        L2 l239 = new L2("INT64_LIST_PACKED", 37, 37, 3, t24);
        L2 l240 = new L2("UINT64_LIST_PACKED", 38, 38, 3, t24);
        L2 l241 = new L2("INT32_LIST_PACKED", 39, 39, 3, t25);
        L2 l242 = new L2("FIXED64_LIST_PACKED", 40, 40, 3, t24);
        L2 l243 = new L2("FIXED32_LIST_PACKED", 41, 41, 3, t25);
        L2 l244 = new L2("BOOL_LIST_PACKED", 42, 42, 3, t26);
        L2 l245 = new L2("UINT32_LIST_PACKED", 43, 43, 3, t25);
        L2 l246 = new L2("ENUM_LIST_PACKED", 44, 44, 3, t210);
        L2 l247 = new L2("SFIXED32_LIST_PACKED", 45, 45, 3, t25);
        L2 l248 = new L2("SFIXED64_LIST_PACKED", 46, 46, 3, t24);
        L2 l249 = new L2("SINT32_LIST_PACKED", 47, 47, 3, t25);
        L2 l250 = new L2("SINT64_LIST_PACKED", 48, 48, 3, t24);
        f14742c = l250;
        f14744e = new L2[]{l22, l23, l24, l25, l26, l27, l28, l29, l210, l211, l212, l213, l214, l215, l216, l217, l218, l219, l220, l221, l222, l223, l224, l225, l226, l227, l228, l229, l230, l231, l232, l233, l234, l235, l236, l237, l238, l239, l240, l241, l242, l243, l244, l245, l246, l247, l248, l249, l250, new L2("GROUP_LIST", 49, 49, 2, t28), new L2("MAP", 50, 50, 4, T2.f14765a)};
        L2[] values = values();
        f14743d = new L2[values.length];
        for (L2 l251 : values) {
            f14743d[l251.f14745a] = l251;
        }
    }

    public L2(String str, int i9, int i10, int i11, T2 t22) {
        this.f14745a = i10;
        int i12 = i11 - 1;
        if (i12 != 1) {
            if (i12 == 3) {
                t22.getClass();
            }
        } else {
            t22.getClass();
        }
        if (i11 == 1) {
            T2 t23 = T2.f14765a;
            t22.ordinal();
        }
    }

    public static L2[] values() {
        return (L2[]) f14744e.clone();
    }
}
