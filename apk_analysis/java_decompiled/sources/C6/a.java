package C6;

import B6.O0;
import I3.g;
import K5.C;
import N3.a0;
import N3.m0;
import N3.n0;
import P5.D;
import P5.F;
import P5.S;
import V2.e;
import V5.j;
import V5.k;
import V5.n;
import V5.q;
import V5.s;
import V5.w;
import X0.l;
import X0.m;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.y;
import b6.C0693o;
import b6.InterfaceC0680b;
import co.notix.R;
import com.anilab.android.ui.activity.MainActivity;
import com.google.crypto.tink.shaded.protobuf.AbstractC1037h;
import com.google.crypto.tink.shaded.protobuf.B;
import com.google.crypto.tink.shaded.protobuf.C1043n;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import h6.C1308x;
import h6.J;
import h6.r;
import h6.r0;
import h6.u0;
import i.G;
import j3.InterfaceC1451e;
import j3.InterfaceC1453f;
import j3.M;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import l4.AbstractC1566a;
import s6.d;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements e, g, d, C, f.b, InterfaceC1451e, InterfaceC0680b, l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1614a;

    public /* synthetic */ a(int i9) {
        this.f1614a = i9;
    }

    @Override // b6.InterfaceC0680b
    public U5.b a(C0693o c0693o) {
        j jVar;
        j jVar2;
        byte b9 = 0;
        int i9 = 4;
        switch (this.f1614a) {
            case 23:
                if (((String) c0693o.f11382a).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    try {
                        r D8 = r.D((AbstractC1037h) c0693o.f11384c, C1043n.a());
                        if (D8.B() == 0) {
                            j jVar3 = j.f7747e;
                            int size = D8.z().size();
                            if (size != 16 && size != 24 && size != 32) {
                                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                            }
                            int y9 = D8.A().y();
                            if (y9 != 12 && y9 != 16) {
                                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(y9)));
                            }
                            r0 r0Var = (r0) c0693o.f11386e;
                            int ordinal = r0Var.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        if (ordinal != 4) {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
                                        }
                                    }
                                }
                                jVar3 = j.f7746d;
                            } else {
                                jVar3 = j.f7745c;
                            }
                            k kVar = new k(size, y9, 16, jVar3);
                            y yVar = new y(18, b9);
                            yVar.f9332c = null;
                            yVar.f9333d = null;
                            yVar.f9331b = kVar;
                            yVar.f9332c = new G(i9, k6.a.a(D8.z().f()));
                            yVar.f9333d = (Integer) c0693o.f11387f;
                            return yVar.y();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (B unused) {
                        throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
            case 24:
                if (((String) c0693o.f11382a).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    try {
                        C1308x B9 = C1308x.B((AbstractC1037h) c0693o.f11384c, C1043n.a());
                        if (B9.z() == 0) {
                            j jVar4 = j.f7750h;
                            int size2 = B9.y().size();
                            if (size2 != 16 && size2 != 24 && size2 != 32) {
                                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size2)));
                            }
                            r0 r0Var2 = (r0) c0693o.f11386e;
                            int ordinal2 = r0Var2.ordinal();
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 != 3) {
                                        if (ordinal2 != 4) {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var2.b());
                                        }
                                    }
                                }
                                jVar4 = j.f7749g;
                            } else {
                                jVar4 = j.f7748f;
                            }
                            n nVar = new n(size2, 12, 16, jVar4);
                            y yVar2 = new y(19, b9);
                            yVar2.f9332c = null;
                            yVar2.f9333d = null;
                            yVar2.f9331b = nVar;
                            yVar2.f9332c = new G(i9, k6.a.a(B9.y().f()));
                            yVar2.f9333d = (Integer) c0693o.f11387f;
                            return yVar2.z();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (B unused2) {
                        throw new GeneralSecurityException("Parsing AesGcmKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
            case 25:
                if (((String) c0693o.f11382a).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    try {
                        h6.B B10 = h6.B.B((AbstractC1037h) c0693o.f11384c, C1043n.a());
                        if (B10.z() == 0) {
                            j jVar5 = j.f7752k;
                            int size3 = B10.y().size();
                            if (size3 != 16 && size3 != 32) {
                                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                            }
                            r0 r0Var3 = (r0) c0693o.f11386e;
                            int ordinal3 = r0Var3.ordinal();
                            if (ordinal3 != 1) {
                                if (ordinal3 != 2) {
                                    if (ordinal3 != 3) {
                                        if (ordinal3 != 4) {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var3.b());
                                        }
                                    }
                                }
                                jVar5 = j.j;
                            } else {
                                jVar5 = j.f7751i;
                            }
                            q qVar = new q(size3, jVar5);
                            y yVar3 = new y(20, b9);
                            yVar3.f9332c = null;
                            yVar3.f9333d = null;
                            yVar3.f9331b = qVar;
                            yVar3.f9332c = new G(i9, k6.a.a(B10.y().f()));
                            yVar3.f9333d = (Integer) c0693o.f11387f;
                            return yVar3.A();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (B unused3) {
                        throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
            case 26:
                if (((String) c0693o.f11382a).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    try {
                        J B11 = J.B((AbstractC1037h) c0693o.f11384c, C1043n.a());
                        if (B11.z() == 0) {
                            r0 r0Var4 = (r0) c0693o.f11386e;
                            int ordinal4 = r0Var4.ordinal();
                            if (ordinal4 != 1) {
                                if (ordinal4 != 2) {
                                    if (ordinal4 != 3) {
                                        if (ordinal4 != 4) {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var4.b());
                                        }
                                    } else {
                                        jVar = j.f7755n;
                                    }
                                }
                                jVar = j.f7754m;
                            } else {
                                jVar = j.f7753l;
                            }
                            return s.b(jVar, new G(i9, k6.a.a(B11.y().f())), (Integer) c0693o.f11387f);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (B unused4) {
                        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
            default:
                if (((String) c0693o.f11382a).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    try {
                        u0 B12 = u0.B((AbstractC1037h) c0693o.f11384c, C1043n.a());
                        if (B12.z() == 0) {
                            r0 r0Var5 = (r0) c0693o.f11386e;
                            int ordinal5 = r0Var5.ordinal();
                            if (ordinal5 != 1) {
                                if (ordinal5 != 2) {
                                    if (ordinal5 != 3) {
                                        if (ordinal5 != 4) {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var5.b());
                                        }
                                    } else {
                                        jVar2 = j.f7758q;
                                    }
                                }
                                jVar2 = j.f7757p;
                            } else {
                                jVar2 = j.f7756o;
                            }
                            return w.b(jVar2, new G(i9, k6.a.a(B12.y().f())), (Integer) c0693o.f11387f);
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (B unused5) {
                        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
    }

    @Override // V2.e
    public Object apply(Object obj) {
        F6.a.f2568b.getClass();
        return b.f1615a.u((O0) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // I3.g
    public boolean b(int i9, int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override // j3.InterfaceC1451e
    public InterfaceC1453f c(Bundle bundle) {
        S x5;
        O3.a[] aVarArr;
        switch (this.f1614a) {
            case 14:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
                if (parcelableArrayList == null) {
                    D d9 = F.f5901b;
                    x5 = S.f5926e;
                } else {
                    x5 = AbstractC1566a.x(M.f19419f0, parcelableArrayList);
                }
                return new m0(bundle.getString(Integer.toString(1, 36), ""), (M[]) x5.toArray(new M[0]));
            case 15:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(Integer.toString(0, 36));
                if (parcelableArrayList2 == null) {
                    return new n0(new m0[0]);
                }
                return new n0((m0[]) AbstractC1566a.x(m0.f5163f, parcelableArrayList2).toArray(new m0[0]));
            case 16:
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(Integer.toString(1, 36));
                if (parcelableArrayList3 == null) {
                    aVarArr = new O3.a[0];
                } else {
                    O3.a[] aVarArr2 = new O3.a[parcelableArrayList3.size()];
                    for (int i9 = 0; i9 < parcelableArrayList3.size(); i9++) {
                        aVarArr2[i9] = (O3.a) O3.a.f5442i.c((Bundle) parcelableArrayList3.get(i9));
                    }
                    aVarArr = aVarArr2;
                }
                return new O3.b(aVarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
            default:
                long j = bundle.getLong(Integer.toString(0, 36));
                int i10 = bundle.getInt(Integer.toString(1, 36), -1);
                int i11 = bundle.getInt(Integer.toString(7, 36), -1);
                ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(Integer.toString(2, 36));
                int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
                long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
                long j4 = bundle.getLong(Integer.toString(5, 36));
                boolean z9 = bundle.getBoolean(Integer.toString(6, 36));
                if (intArray == null) {
                    intArray = new int[0];
                }
                int[] iArr = intArray;
                Uri[] uriArr = new Uri[0];
                if (parcelableArrayList4 != null) {
                    uriArr = (Uri[]) parcelableArrayList4.toArray(uriArr);
                }
                Uri[] uriArr2 = uriArr;
                if (longArray == null) {
                    longArray = new long[0];
                }
                return new O3.a(j, i10, i11, iArr, uriArr2, longArray, j4, z9);
        }
    }

    @Override // f.b
    public void d(Object obj) {
        int i9 = MainActivity.f13724k0;
    }

    @Override // s6.d
    public Object e(Y2.r rVar) {
        switch (this.f1614a) {
            case 8:
                return TransportRegistrar.c(rVar);
            case 9:
                return TransportRegistrar.b(rVar);
            case R.styleable.GradientColor_android_endX /* 10 */:
                return TransportRegistrar.a(rVar);
            default:
                return FirebaseInstallationsRegistrar.a(rVar);
        }
    }

    @Override // X0.l
    public void f(X0.j jVar, m mVar) {
        switch (this.f1614a) {
            case 28:
                jVar.c(mVar);
                return;
            default:
                jVar.b(mVar);
                return;
        }
    }

    public void g(Object obj) {
        ((a0) obj).f5043b.a();
    }
}
