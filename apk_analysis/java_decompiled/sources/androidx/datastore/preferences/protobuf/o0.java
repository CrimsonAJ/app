package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f9741c;

    /* renamed from: d, reason: collision with root package name */
    public static final l0 f9742d;

    /* renamed from: e, reason: collision with root package name */
    public static final m0 f9743e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ o0[] f9744f;

    /* renamed from: a, reason: collision with root package name */
    public final p0 f9745a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9746b;

    /* JADX INFO: Fake field, exist only in values array */
    o0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    o0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    o0 EF12;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.preferences.protobuf.k0, androidx.datastore.preferences.protobuf.o0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.datastore.preferences.protobuf.m0, androidx.datastore.preferences.protobuf.o0] */
    /* JADX WARN: Type inference failed for: r8v2, types: [androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.o0] */
    static {
        o0 o0Var = new o0("DOUBLE", 0, p0.DOUBLE, 1);
        o0 o0Var2 = new o0("FLOAT", 1, p0.FLOAT, 5);
        p0 p0Var = p0.LONG;
        o0 o0Var3 = new o0("INT64", 2, p0Var, 0);
        o0 o0Var4 = new o0("UINT64", 3, p0Var, 0);
        p0 p0Var2 = p0.INT;
        o0 o0Var5 = new o0("INT32", 4, p0Var2, 0);
        o0 o0Var6 = new o0("FIXED64", 5, p0Var, 1);
        o0 o0Var7 = new o0("FIXED32", 6, p0Var2, 5);
        o0 o0Var8 = new o0("BOOL", 7, p0.BOOLEAN, 0);
        ?? o0Var9 = new o0("STRING", 8, p0.STRING, 2);
        f9741c = o0Var9;
        p0 p0Var3 = p0.MESSAGE;
        ?? o0Var10 = new o0("GROUP", 9, p0Var3, 3);
        f9742d = o0Var10;
        ?? o0Var11 = new o0("MESSAGE", 10, p0Var3, 2);
        f9743e = o0Var11;
        f9744f = new o0[]{o0Var, o0Var2, o0Var3, o0Var4, o0Var5, o0Var6, o0Var7, o0Var8, o0Var9, o0Var10, o0Var11, new o0("BYTES", 11, p0.BYTE_STRING, 2), new o0("UINT32", 12, p0Var2, 0), new o0("ENUM", 13, p0.ENUM, 0), new o0("SFIXED32", 14, p0Var2, 5), new o0("SFIXED64", 15, p0Var, 1), new o0("SINT32", 16, p0Var2, 0), new o0("SINT64", 17, p0Var, 0)};
    }

    public o0(String str, int i9, p0 p0Var, int i10) {
        this.f9745a = p0Var;
        this.f9746b = i10;
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f9744f.clone();
    }
}
