package X2;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f8322a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ H[] f8323b;

    /* JADX INFO: Fake field, exist only in values array */
    H EF3;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Enum r32 = new Enum("MOBILE", 0);
        Enum r42 = new Enum("WIFI", 1);
        Enum r22 = new Enum("MOBILE_MMS", 2);
        Enum r1 = new Enum("MOBILE_SUPL", 3);
        Enum r0 = new Enum("MOBILE_DUN", 4);
        Enum r15 = new Enum("MOBILE_HIPRI", 5);
        Enum r14 = new Enum("WIMAX", 6);
        Enum r13 = new Enum("BLUETOOTH", 7);
        Enum r12 = new Enum("DUMMY", 8);
        Enum r11 = new Enum("ETHERNET", 9);
        Enum r10 = new Enum("MOBILE_FOTA", 10);
        Enum r9 = new Enum("MOBILE_IMS", 11);
        Enum r82 = new Enum("MOBILE_CBS", 12);
        Enum r7 = new Enum("WIFI_P2P", 13);
        Enum r62 = new Enum("MOBILE_IA", 14);
        Enum r5 = new Enum("MOBILE_EMERGENCY", 15);
        Enum r63 = new Enum("PROXY", 16);
        Enum r52 = new Enum("VPN", 17);
        Enum r64 = new Enum("NONE", 18);
        f8323b = new H[]{r32, r42, r22, r1, r0, r15, r14, r13, r12, r11, r10, r9, r82, r7, r62, r5, r63, r52, r64};
        SparseArray sparseArray = new SparseArray();
        f8322a = sparseArray;
        sparseArray.put(0, r32);
        sparseArray.put(1, r42);
        sparseArray.put(2, r22);
        sparseArray.put(3, r1);
        sparseArray.put(4, r0);
        sparseArray.put(5, r15);
        sparseArray.put(6, r14);
        sparseArray.put(7, r13);
        sparseArray.put(8, r12);
        sparseArray.put(9, r11);
        sparseArray.put(10, r10);
        sparseArray.put(11, r9);
        sparseArray.put(12, r82);
        sparseArray.put(13, r7);
        sparseArray.put(14, r62);
        sparseArray.put(15, r5);
        sparseArray.put(16, r63);
        sparseArray.put(17, r52);
        sparseArray.put(-1, r64);
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f8323b.clone();
    }
}
