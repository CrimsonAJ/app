package androidx.datastore.preferences.protobuf;

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
/* renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0530p {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0530p f9747b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0530p f9748c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0530p[] f9749d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0530p[] f9750e;

    /* renamed from: a, reason: collision with root package name */
    public final int f9751a;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0530p EF0;

    static {
        EnumC0538y enumC0538y = EnumC0538y.DOUBLE;
        EnumC0530p enumC0530p = new EnumC0530p("DOUBLE", 0, 0, 1, enumC0538y);
        EnumC0538y enumC0538y2 = EnumC0538y.FLOAT;
        EnumC0530p enumC0530p2 = new EnumC0530p("FLOAT", 1, 1, 1, enumC0538y2);
        EnumC0538y enumC0538y3 = EnumC0538y.LONG;
        EnumC0530p enumC0530p3 = new EnumC0530p("INT64", 2, 2, 1, enumC0538y3);
        EnumC0530p enumC0530p4 = new EnumC0530p("UINT64", 3, 3, 1, enumC0538y3);
        EnumC0538y enumC0538y4 = EnumC0538y.INT;
        EnumC0530p enumC0530p5 = new EnumC0530p("INT32", 4, 4, 1, enumC0538y4);
        EnumC0530p enumC0530p6 = new EnumC0530p("FIXED64", 5, 5, 1, enumC0538y3);
        EnumC0530p enumC0530p7 = new EnumC0530p("FIXED32", 6, 6, 1, enumC0538y4);
        EnumC0538y enumC0538y5 = EnumC0538y.BOOLEAN;
        EnumC0530p enumC0530p8 = new EnumC0530p("BOOL", 7, 7, 1, enumC0538y5);
        EnumC0538y enumC0538y6 = EnumC0538y.STRING;
        EnumC0530p enumC0530p9 = new EnumC0530p("STRING", 8, 8, 1, enumC0538y6);
        EnumC0538y enumC0538y7 = EnumC0538y.MESSAGE;
        EnumC0530p enumC0530p10 = new EnumC0530p("MESSAGE", 9, 9, 1, enumC0538y7);
        EnumC0538y enumC0538y8 = EnumC0538y.BYTE_STRING;
        EnumC0530p enumC0530p11 = new EnumC0530p("BYTES", 10, 10, 1, enumC0538y8);
        EnumC0530p enumC0530p12 = new EnumC0530p("UINT32", 11, 11, 1, enumC0538y4);
        EnumC0538y enumC0538y9 = EnumC0538y.ENUM;
        EnumC0530p enumC0530p13 = new EnumC0530p("ENUM", 12, 12, 1, enumC0538y9);
        EnumC0530p enumC0530p14 = new EnumC0530p("SFIXED32", 13, 13, 1, enumC0538y4);
        EnumC0530p enumC0530p15 = new EnumC0530p("SFIXED64", 14, 14, 1, enumC0538y3);
        EnumC0530p enumC0530p16 = new EnumC0530p("SINT32", 15, 15, 1, enumC0538y4);
        EnumC0530p enumC0530p17 = new EnumC0530p("SINT64", 16, 16, 1, enumC0538y3);
        EnumC0530p enumC0530p18 = new EnumC0530p("GROUP", 17, 17, 1, enumC0538y7);
        EnumC0530p enumC0530p19 = new EnumC0530p("DOUBLE_LIST", 18, 18, 2, enumC0538y);
        EnumC0530p enumC0530p20 = new EnumC0530p("FLOAT_LIST", 19, 19, 2, enumC0538y2);
        EnumC0530p enumC0530p21 = new EnumC0530p("INT64_LIST", 20, 20, 2, enumC0538y3);
        EnumC0530p enumC0530p22 = new EnumC0530p("UINT64_LIST", 21, 21, 2, enumC0538y3);
        EnumC0530p enumC0530p23 = new EnumC0530p("INT32_LIST", 22, 22, 2, enumC0538y4);
        EnumC0530p enumC0530p24 = new EnumC0530p("FIXED64_LIST", 23, 23, 2, enumC0538y3);
        EnumC0530p enumC0530p25 = new EnumC0530p("FIXED32_LIST", 24, 24, 2, enumC0538y4);
        EnumC0530p enumC0530p26 = new EnumC0530p("BOOL_LIST", 25, 25, 2, enumC0538y5);
        EnumC0530p enumC0530p27 = new EnumC0530p("STRING_LIST", 26, 26, 2, enumC0538y6);
        EnumC0530p enumC0530p28 = new EnumC0530p("MESSAGE_LIST", 27, 27, 2, enumC0538y7);
        EnumC0530p enumC0530p29 = new EnumC0530p("BYTES_LIST", 28, 28, 2, enumC0538y8);
        EnumC0530p enumC0530p30 = new EnumC0530p("UINT32_LIST", 29, 29, 2, enumC0538y4);
        EnumC0530p enumC0530p31 = new EnumC0530p("ENUM_LIST", 30, 30, 2, enumC0538y9);
        EnumC0530p enumC0530p32 = new EnumC0530p("SFIXED32_LIST", 31, 31, 2, enumC0538y4);
        EnumC0530p enumC0530p33 = new EnumC0530p("SFIXED64_LIST", 32, 32, 2, enumC0538y3);
        EnumC0530p enumC0530p34 = new EnumC0530p("SINT32_LIST", 33, 33, 2, enumC0538y4);
        EnumC0530p enumC0530p35 = new EnumC0530p("SINT64_LIST", 34, 34, 2, enumC0538y3);
        EnumC0530p enumC0530p36 = new EnumC0530p("DOUBLE_LIST_PACKED", 35, 35, 3, enumC0538y);
        f9747b = enumC0530p36;
        EnumC0530p enumC0530p37 = new EnumC0530p("FLOAT_LIST_PACKED", 36, 36, 3, enumC0538y2);
        EnumC0530p enumC0530p38 = new EnumC0530p("INT64_LIST_PACKED", 37, 37, 3, enumC0538y3);
        EnumC0530p enumC0530p39 = new EnumC0530p("UINT64_LIST_PACKED", 38, 38, 3, enumC0538y3);
        EnumC0530p enumC0530p40 = new EnumC0530p("INT32_LIST_PACKED", 39, 39, 3, enumC0538y4);
        EnumC0530p enumC0530p41 = new EnumC0530p("FIXED64_LIST_PACKED", 40, 40, 3, enumC0538y3);
        EnumC0530p enumC0530p42 = new EnumC0530p("FIXED32_LIST_PACKED", 41, 41, 3, enumC0538y4);
        EnumC0530p enumC0530p43 = new EnumC0530p("BOOL_LIST_PACKED", 42, 42, 3, enumC0538y5);
        EnumC0530p enumC0530p44 = new EnumC0530p("UINT32_LIST_PACKED", 43, 43, 3, enumC0538y4);
        EnumC0530p enumC0530p45 = new EnumC0530p("ENUM_LIST_PACKED", 44, 44, 3, enumC0538y9);
        EnumC0530p enumC0530p46 = new EnumC0530p("SFIXED32_LIST_PACKED", 45, 45, 3, enumC0538y4);
        EnumC0530p enumC0530p47 = new EnumC0530p("SFIXED64_LIST_PACKED", 46, 46, 3, enumC0538y3);
        EnumC0530p enumC0530p48 = new EnumC0530p("SINT32_LIST_PACKED", 47, 47, 3, enumC0538y4);
        EnumC0530p enumC0530p49 = new EnumC0530p("SINT64_LIST_PACKED", 48, 48, 3, enumC0538y3);
        f9748c = enumC0530p49;
        f9750e = new EnumC0530p[]{enumC0530p, enumC0530p2, enumC0530p3, enumC0530p4, enumC0530p5, enumC0530p6, enumC0530p7, enumC0530p8, enumC0530p9, enumC0530p10, enumC0530p11, enumC0530p12, enumC0530p13, enumC0530p14, enumC0530p15, enumC0530p16, enumC0530p17, enumC0530p18, enumC0530p19, enumC0530p20, enumC0530p21, enumC0530p22, enumC0530p23, enumC0530p24, enumC0530p25, enumC0530p26, enumC0530p27, enumC0530p28, enumC0530p29, enumC0530p30, enumC0530p31, enumC0530p32, enumC0530p33, enumC0530p34, enumC0530p35, enumC0530p36, enumC0530p37, enumC0530p38, enumC0530p39, enumC0530p40, enumC0530p41, enumC0530p42, enumC0530p43, enumC0530p44, enumC0530p45, enumC0530p46, enumC0530p47, enumC0530p48, enumC0530p49, new EnumC0530p("GROUP_LIST", 49, 49, 2, enumC0538y7), new EnumC0530p("MAP", 50, 50, 4, EnumC0538y.VOID)};
        EnumC0530p[] values = values();
        f9749d = new EnumC0530p[values.length];
        for (EnumC0530p enumC0530p50 : values) {
            f9749d[enumC0530p50.f9751a] = enumC0530p50;
        }
    }

    public EnumC0530p(String str, int i9, int i10, int i11, EnumC0538y enumC0538y) {
        this.f9751a = i10;
        int b9 = AbstractC2128h.b(i11);
        if (b9 != 1) {
            if (b9 == 3) {
                enumC0538y.getClass();
            }
        } else {
            enumC0538y.getClass();
        }
        if (i11 == 1) {
            enumC0538y.ordinal();
        }
    }

    public static EnumC0530p valueOf(String str) {
        return (EnumC0530p) Enum.valueOf(EnumC0530p.class, str);
    }

    public static EnumC0530p[] values() {
        return (EnumC0530p[]) f9750e.clone();
    }
}
