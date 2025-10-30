package u4;

import android.os.Parcel;
import co.notix.R;

/* loaded from: classes.dex */
public final class z extends S4.c {

    /* renamed from: f, reason: collision with root package name */
    public final i f23699f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f23700g;

    public z(i iVar) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 2);
        this.f23699f = iVar;
        this.f23700g = C2079d.class;
    }

    @Override // S4.c
    public final boolean g1(int i9, Parcel parcel, Parcel parcel2) {
        boolean z9 = false;
        Class cls = this.f23700g;
        i iVar = this.f23699f;
        switch (i9) {
            case 1:
                N4.b bVar = new N4.b(iVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.C.d(parcel2, bVar);
                return true;
            case 2:
                N4.a h12 = N4.b.h1(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.C.b(parcel);
                g gVar = (g) N4.b.i1(h12);
                if (cls.isInstance(gVar) && iVar != null) {
                    iVar.e((g) cls.cast(gVar));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                N4.a h13 = N4.b.h1(parcel.readStrongBinder());
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.C.b(parcel);
                g gVar2 = (g) N4.b.i1(h13);
                if (cls.isInstance(gVar2) && iVar != null) {
                    iVar.h((g) cls.cast(gVar2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                N4.a h14 = N4.b.h1(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                com.google.android.gms.internal.cast.C.b(parcel);
                g gVar3 = (g) N4.b.i1(h14);
                if (cls.isInstance(gVar3) && iVar != null) {
                    iVar.a((g) cls.cast(gVar3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                N4.a h15 = N4.b.h1(parcel.readStrongBinder());
                com.google.android.gms.internal.cast.C.b(parcel);
                g gVar4 = (g) N4.b.i1(h15);
                if (cls.isInstance(gVar4) && iVar != null) {
                    iVar.d((g) cls.cast(gVar4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                N4.a h16 = N4.b.h1(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                com.google.android.gms.internal.cast.C.b(parcel);
                g gVar5 = (g) N4.b.i1(h16);
                if (cls.isInstance(gVar5) && iVar != null) {
                    iVar.i((g) cls.cast(gVar5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                N4.a h17 = N4.b.h1(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                com.google.android.gms.internal.cast.C.b(parcel);
                g gVar6 = (g) N4.b.i1(h17);
                if (cls.isInstance(gVar6) && iVar != null) {
                    iVar.f((g) cls.cast(gVar6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                N4.a h18 = N4.b.h1(parcel.readStrongBinder());
                int i10 = com.google.android.gms.internal.cast.C.f14693a;
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                com.google.android.gms.internal.cast.C.b(parcel);
                g gVar7 = (g) N4.b.i1(h18);
                if (cls.isInstance(gVar7) && iVar != null) {
                    iVar.j((g) cls.cast(gVar7), z9);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                N4.a h19 = N4.b.h1(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                com.google.android.gms.internal.cast.C.b(parcel);
                g gVar8 = (g) N4.b.i1(h19);
                if (cls.isInstance(gVar8) && iVar != null) {
                    iVar.k((g) cls.cast(gVar8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case R.styleable.GradientColor_android_endX /* 10 */:
                N4.a h110 = N4.b.h1(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                com.google.android.gms.internal.cast.C.b(parcel);
                g gVar9 = (g) N4.b.i1(h110);
                if (cls.isInstance(gVar9) && iVar != null) {
                    iVar.g((g) cls.cast(gVar9), readInt4);
                }
                parcel2.writeNoException();
                return true;
            case R.styleable.GradientColor_android_endY /* 11 */:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
    }
}
