package com.google.crypto.tink.shaded.protobuf;

import w.AbstractC2128h;

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
/* renamed from: com.google.crypto.tink.shaded.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1046q {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1046q f16395b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1046q f16396c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1046q[] f16397d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1046q[] f16398e;

    /* renamed from: a, reason: collision with root package name */
    public final int f16399a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1046q EF0;

    static {
        C c3 = C.DOUBLE;
        EnumC1046q enumC1046q = new EnumC1046q("DOUBLE", 0, 0, 1, c3);
        C c9 = C.FLOAT;
        EnumC1046q enumC1046q2 = new EnumC1046q("FLOAT", 1, 1, 1, c9);
        C c10 = C.LONG;
        EnumC1046q enumC1046q3 = new EnumC1046q("INT64", 2, 2, 1, c10);
        EnumC1046q enumC1046q4 = new EnumC1046q("UINT64", 3, 3, 1, c10);
        C c11 = C.INT;
        EnumC1046q enumC1046q5 = new EnumC1046q("INT32", 4, 4, 1, c11);
        EnumC1046q enumC1046q6 = new EnumC1046q("FIXED64", 5, 5, 1, c10);
        EnumC1046q enumC1046q7 = new EnumC1046q("FIXED32", 6, 6, 1, c11);
        C c12 = C.BOOLEAN;
        EnumC1046q enumC1046q8 = new EnumC1046q("BOOL", 7, 7, 1, c12);
        C c13 = C.STRING;
        EnumC1046q enumC1046q9 = new EnumC1046q("STRING", 8, 8, 1, c13);
        C c14 = C.MESSAGE;
        EnumC1046q enumC1046q10 = new EnumC1046q("MESSAGE", 9, 9, 1, c14);
        C c15 = C.BYTE_STRING;
        EnumC1046q enumC1046q11 = new EnumC1046q("BYTES", 10, 10, 1, c15);
        EnumC1046q enumC1046q12 = new EnumC1046q("UINT32", 11, 11, 1, c11);
        C c16 = C.ENUM;
        EnumC1046q enumC1046q13 = new EnumC1046q("ENUM", 12, 12, 1, c16);
        EnumC1046q enumC1046q14 = new EnumC1046q("SFIXED32", 13, 13, 1, c11);
        EnumC1046q enumC1046q15 = new EnumC1046q("SFIXED64", 14, 14, 1, c10);
        EnumC1046q enumC1046q16 = new EnumC1046q("SINT32", 15, 15, 1, c11);
        EnumC1046q enumC1046q17 = new EnumC1046q("SINT64", 16, 16, 1, c10);
        EnumC1046q enumC1046q18 = new EnumC1046q("GROUP", 17, 17, 1, c14);
        EnumC1046q enumC1046q19 = new EnumC1046q("DOUBLE_LIST", 18, 18, 2, c3);
        EnumC1046q enumC1046q20 = new EnumC1046q("FLOAT_LIST", 19, 19, 2, c9);
        EnumC1046q enumC1046q21 = new EnumC1046q("INT64_LIST", 20, 20, 2, c10);
        EnumC1046q enumC1046q22 = new EnumC1046q("UINT64_LIST", 21, 21, 2, c10);
        EnumC1046q enumC1046q23 = new EnumC1046q("INT32_LIST", 22, 22, 2, c11);
        EnumC1046q enumC1046q24 = new EnumC1046q("FIXED64_LIST", 23, 23, 2, c10);
        EnumC1046q enumC1046q25 = new EnumC1046q("FIXED32_LIST", 24, 24, 2, c11);
        EnumC1046q enumC1046q26 = new EnumC1046q("BOOL_LIST", 25, 25, 2, c12);
        EnumC1046q enumC1046q27 = new EnumC1046q("STRING_LIST", 26, 26, 2, c13);
        EnumC1046q enumC1046q28 = new EnumC1046q("MESSAGE_LIST", 27, 27, 2, c14);
        EnumC1046q enumC1046q29 = new EnumC1046q("BYTES_LIST", 28, 28, 2, c15);
        EnumC1046q enumC1046q30 = new EnumC1046q("UINT32_LIST", 29, 29, 2, c11);
        EnumC1046q enumC1046q31 = new EnumC1046q("ENUM_LIST", 30, 30, 2, c16);
        EnumC1046q enumC1046q32 = new EnumC1046q("SFIXED32_LIST", 31, 31, 2, c11);
        EnumC1046q enumC1046q33 = new EnumC1046q("SFIXED64_LIST", 32, 32, 2, c10);
        EnumC1046q enumC1046q34 = new EnumC1046q("SINT32_LIST", 33, 33, 2, c11);
        EnumC1046q enumC1046q35 = new EnumC1046q("SINT64_LIST", 34, 34, 2, c10);
        EnumC1046q enumC1046q36 = new EnumC1046q("DOUBLE_LIST_PACKED", 35, 35, 3, c3);
        f16395b = enumC1046q36;
        EnumC1046q enumC1046q37 = new EnumC1046q("FLOAT_LIST_PACKED", 36, 36, 3, c9);
        EnumC1046q enumC1046q38 = new EnumC1046q("INT64_LIST_PACKED", 37, 37, 3, c10);
        EnumC1046q enumC1046q39 = new EnumC1046q("UINT64_LIST_PACKED", 38, 38, 3, c10);
        EnumC1046q enumC1046q40 = new EnumC1046q("INT32_LIST_PACKED", 39, 39, 3, c11);
        EnumC1046q enumC1046q41 = new EnumC1046q("FIXED64_LIST_PACKED", 40, 40, 3, c10);
        EnumC1046q enumC1046q42 = new EnumC1046q("FIXED32_LIST_PACKED", 41, 41, 3, c11);
        EnumC1046q enumC1046q43 = new EnumC1046q("BOOL_LIST_PACKED", 42, 42, 3, c12);
        EnumC1046q enumC1046q44 = new EnumC1046q("UINT32_LIST_PACKED", 43, 43, 3, c11);
        EnumC1046q enumC1046q45 = new EnumC1046q("ENUM_LIST_PACKED", 44, 44, 3, c16);
        EnumC1046q enumC1046q46 = new EnumC1046q("SFIXED32_LIST_PACKED", 45, 45, 3, c11);
        EnumC1046q enumC1046q47 = new EnumC1046q("SFIXED64_LIST_PACKED", 46, 46, 3, c10);
        EnumC1046q enumC1046q48 = new EnumC1046q("SINT32_LIST_PACKED", 47, 47, 3, c11);
        EnumC1046q enumC1046q49 = new EnumC1046q("SINT64_LIST_PACKED", 48, 48, 3, c10);
        f16396c = enumC1046q49;
        f16398e = new EnumC1046q[]{enumC1046q, enumC1046q2, enumC1046q3, enumC1046q4, enumC1046q5, enumC1046q6, enumC1046q7, enumC1046q8, enumC1046q9, enumC1046q10, enumC1046q11, enumC1046q12, enumC1046q13, enumC1046q14, enumC1046q15, enumC1046q16, enumC1046q17, enumC1046q18, enumC1046q19, enumC1046q20, enumC1046q21, enumC1046q22, enumC1046q23, enumC1046q24, enumC1046q25, enumC1046q26, enumC1046q27, enumC1046q28, enumC1046q29, enumC1046q30, enumC1046q31, enumC1046q32, enumC1046q33, enumC1046q34, enumC1046q35, enumC1046q36, enumC1046q37, enumC1046q38, enumC1046q39, enumC1046q40, enumC1046q41, enumC1046q42, enumC1046q43, enumC1046q44, enumC1046q45, enumC1046q46, enumC1046q47, enumC1046q48, enumC1046q49, new EnumC1046q("GROUP_LIST", 49, 49, 2, c14), new EnumC1046q("MAP", 50, 50, 4, C.VOID)};
        EnumC1046q[] values = values();
        f16397d = new EnumC1046q[values.length];
        for (EnumC1046q enumC1046q50 : values) {
            f16397d[enumC1046q50.f16399a] = enumC1046q50;
        }
    }

    public EnumC1046q(String str, int i9, int i10, int i11, C c3) {
        this.f16399a = i10;
        int b9 = AbstractC2128h.b(i11);
        if (b9 != 1) {
            if (b9 == 3) {
                c3.getClass();
            }
        } else {
            c3.getClass();
        }
        if (i11 == 1) {
            c3.ordinal();
        }
    }

    public static EnumC1046q valueOf(String str) {
        return (EnumC1046q) Enum.valueOf(EnumC1046q.class, str);
    }

    public static EnumC1046q[] values() {
        return (EnumC1046q[]) f16398e.clone();
    }
}
