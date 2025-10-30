package Z3;

import A4.r;
import android.text.SpannableStringBuilder;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: g, reason: collision with root package name */
    public final r f9040g = new r(5, false);

    /* renamed from: h, reason: collision with root package name */
    public final f f9041h = new f();

    /* renamed from: i, reason: collision with root package name */
    public int f9042i = -1;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final e[] f9043k;

    /* renamed from: l, reason: collision with root package name */
    public e f9044l;

    /* renamed from: m, reason: collision with root package name */
    public List f9045m;

    /* renamed from: n, reason: collision with root package name */
    public List f9046n;

    /* renamed from: o, reason: collision with root package name */
    public f f9047o;

    /* renamed from: p, reason: collision with root package name */
    public int f9048p;

    public g(List list, int i9) {
        this.j = i9 == -1 ? 1 : i9;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b9 = ((byte[]) list.get(0))[0];
        }
        this.f9043k = new e[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f9043k[i10] = new e();
        }
        this.f9044l = this.f9043k[0];
    }

    @Override // Z3.i
    public final j f() {
        List list = this.f9045m;
        this.f9046n = list;
        list.getClass();
        return new j(list, 0);
    }

    @Override // Z3.i, m3.c
    public final void flush() {
        super.flush();
        this.f9045m = null;
        this.f9046n = null;
        this.f9048p = 0;
        this.f9044l = this.f9043k[0];
        l();
        this.f9047o = null;
    }

    @Override // Z3.i
    public final void g(h hVar) {
        boolean z9;
        ByteBuffer byteBuffer = hVar.f20704d;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        r rVar = this.f9040g;
        rVar.F(limit, array);
        while (rVar.e() >= 3) {
            int x5 = rVar.x();
            int i9 = x5 & 3;
            boolean z10 = false;
            if ((x5 & 4) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            byte x9 = (byte) rVar.x();
            byte x10 = (byte) rVar.x();
            if (i9 == 2 || i9 == 3) {
                if (z9) {
                    if (i9 == 3) {
                        j();
                        int i10 = (x9 & 192) >> 6;
                        int i11 = this.f9042i;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            l();
                            AbstractC1566a.P("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f9042i + " current=" + i10);
                        }
                        this.f9042i = i10;
                        int i12 = x9 & 63;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        f fVar = new f(i10, i12);
                        this.f9047o = fVar;
                        fVar.f9039e = 1;
                        fVar.f9036b[0] = x10;
                    } else {
                        if (i9 == 2) {
                            z10 = true;
                        }
                        AbstractC1566a.h(z10);
                        f fVar2 = this.f9047o;
                        if (fVar2 == null) {
                            AbstractC1566a.t("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = fVar2.f9036b;
                            int i13 = fVar2.f9039e;
                            int i14 = i13 + 1;
                            fVar2.f9039e = i14;
                            bArr[i13] = x9;
                            fVar2.f9039e = i13 + 2;
                            bArr[i14] = x10;
                        }
                    }
                    f fVar3 = this.f9047o;
                    if (fVar3.f9039e == (fVar3.f9038d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // Z3.i
    public final boolean i() {
        if (this.f9045m != this.f9046n) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x0144. Please report as an issue. */
    public final void j() {
        boolean z9;
        char c3;
        int i9;
        f fVar = this.f9047o;
        if (fVar == null) {
            return;
        }
        int i10 = 2;
        if (fVar.f9039e != (fVar.f9038d * 2) - 1) {
            AbstractC1566a.s("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f9047o.f9038d * 2) - 1) + ", but current index is " + this.f9047o.f9039e + " (sequence number " + this.f9047o.f9037c + ");");
        }
        f fVar2 = this.f9047o;
        byte[] bArr = fVar2.f9036b;
        int i11 = fVar2.f9039e;
        f fVar3 = this.f9041h;
        fVar3.n(i11, bArr);
        boolean z10 = false;
        while (true) {
            if (fVar3.b() > 0) {
                int i12 = 3;
                int i13 = fVar3.i(3);
                int i14 = fVar3.i(5);
                if (i13 == 7) {
                    fVar3.r(i10);
                    i13 = fVar3.i(6);
                    if (i13 < 7) {
                        AbstractC0953k1.v("Invalid extended service number: ", i13, "Cea708Decoder");
                    }
                }
                if (i14 == 0) {
                    if (i13 != 0) {
                        AbstractC1566a.P("Cea708Decoder", "serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                    }
                } else if (i13 != this.j) {
                    fVar3.s(i14);
                } else {
                    int g9 = (i14 * 8) + fVar3.g();
                    while (fVar3.g() < g9) {
                        int i15 = fVar3.i(8);
                        if (i15 != 16) {
                            if (i15 <= 31) {
                                if (i15 != 0) {
                                    if (i15 != i12) {
                                        if (i15 != 8) {
                                            switch (i15) {
                                                case 12:
                                                    l();
                                                    break;
                                                case 13:
                                                    this.f9044l.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i15 >= 17 && i15 <= 23) {
                                                        AbstractC1566a.P("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i15);
                                                        fVar3.r(8);
                                                        break;
                                                    } else if (i15 >= 24 && i15 <= 31) {
                                                        AbstractC1566a.P("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i15);
                                                        fVar3.r(16);
                                                        break;
                                                    } else {
                                                        AbstractC0953k1.v("Invalid C0 command: ", i15, "Cea708Decoder");
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f9044l.f9015b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f9045m = k();
                                    }
                                }
                                i9 = i10;
                            } else if (i15 <= 127) {
                                if (i15 == 127) {
                                    this.f9044l.a((char) 9835);
                                } else {
                                    this.f9044l.a((char) (i15 & 255));
                                }
                                i9 = i10;
                                z10 = true;
                            } else {
                                if (i15 <= 159) {
                                    e[] eVarArr = this.f9043k;
                                    switch (i15) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z9 = true;
                                            int i16 = i15 - 128;
                                            if (this.f9048p != i16) {
                                                this.f9048p = i16;
                                                this.f9044l = eVarArr[i16];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z9 = true;
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (fVar3.h()) {
                                                    e eVar = eVarArr[8 - i17];
                                                    eVar.f9014a.clear();
                                                    eVar.f9015b.clear();
                                                    eVar.f9028p = -1;
                                                    eVar.f9029q = -1;
                                                    eVar.f9030r = -1;
                                                    eVar.f9032t = -1;
                                                    eVar.f9034v = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (fVar3.h()) {
                                                    eVarArr[8 - i18].f9017d = true;
                                                }
                                            }
                                            z9 = true;
                                            break;
                                        case 138:
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (fVar3.h()) {
                                                    eVarArr[8 - i19].f9017d = false;
                                                }
                                            }
                                            z9 = true;
                                            break;
                                        case 139:
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (fVar3.h()) {
                                                    eVarArr[8 - i20].f9017d = !r2.f9017d;
                                                }
                                            }
                                            z9 = true;
                                            break;
                                        case 140:
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (fVar3.h()) {
                                                    eVarArr[8 - i21].d();
                                                }
                                            }
                                            z9 = true;
                                            break;
                                        case ModuleDescriptor.MODULE_VERSION /* 141 */:
                                            fVar3.r(8);
                                            z9 = true;
                                            break;
                                        case 142:
                                            z9 = true;
                                            break;
                                        case 143:
                                            l();
                                            z9 = true;
                                            break;
                                        case 144:
                                            if (!this.f9044l.f9016c) {
                                                fVar3.r(16);
                                                z9 = true;
                                                break;
                                            } else {
                                                fVar3.i(4);
                                                fVar3.i(2);
                                                fVar3.i(2);
                                                boolean h7 = fVar3.h();
                                                boolean h9 = fVar3.h();
                                                fVar3.i(3);
                                                fVar3.i(3);
                                                this.f9044l.e(h7, h9);
                                                z9 = true;
                                            }
                                        case 145:
                                            if (!this.f9044l.f9016c) {
                                                fVar3.r(24);
                                            } else {
                                                int c9 = e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), fVar3.i(2));
                                                int c10 = e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), fVar3.i(2));
                                                fVar3.r(2);
                                                e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), 0);
                                                this.f9044l.f(c9, c10);
                                            }
                                            z9 = true;
                                            break;
                                        case 146:
                                            if (!this.f9044l.f9016c) {
                                                fVar3.r(16);
                                            } else {
                                                fVar3.r(4);
                                                int i22 = fVar3.i(4);
                                                fVar3.r(2);
                                                fVar3.i(6);
                                                e eVar2 = this.f9044l;
                                                if (eVar2.f9034v != i22) {
                                                    eVar2.a('\n');
                                                }
                                                eVar2.f9034v = i22;
                                            }
                                            z9 = true;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            AbstractC0953k1.v("Invalid C1 command: ", i15, "Cea708Decoder");
                                            z9 = true;
                                            break;
                                        case 151:
                                            if (!this.f9044l.f9016c) {
                                                fVar3.r(32);
                                            } else {
                                                int c11 = e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), fVar3.i(2));
                                                fVar3.i(2);
                                                e.c(fVar3.i(2), fVar3.i(2), fVar3.i(2), 0);
                                                fVar3.h();
                                                fVar3.h();
                                                fVar3.i(2);
                                                fVar3.i(2);
                                                int i23 = fVar3.i(2);
                                                fVar3.r(8);
                                                e eVar3 = this.f9044l;
                                                eVar3.f9027o = c11;
                                                eVar3.f9024l = i23;
                                            }
                                            z9 = true;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i24 = i15 - 152;
                                            e eVar4 = eVarArr[i24];
                                            fVar3.r(i10);
                                            boolean h10 = fVar3.h();
                                            boolean h11 = fVar3.h();
                                            fVar3.h();
                                            int i25 = fVar3.i(i12);
                                            boolean h12 = fVar3.h();
                                            int i26 = fVar3.i(7);
                                            int i27 = fVar3.i(8);
                                            int i28 = fVar3.i(4);
                                            int i29 = fVar3.i(4);
                                            fVar3.r(i10);
                                            fVar3.i(6);
                                            fVar3.r(i10);
                                            int i30 = fVar3.i(3);
                                            int i31 = fVar3.i(3);
                                            eVar4.f9016c = true;
                                            eVar4.f9017d = h10;
                                            eVar4.f9023k = h11;
                                            eVar4.f9018e = i25;
                                            eVar4.f9019f = h12;
                                            eVar4.f9020g = i26;
                                            eVar4.f9021h = i27;
                                            eVar4.f9022i = i28;
                                            int i32 = i29 + 1;
                                            if (eVar4.j != i32) {
                                                eVar4.j = i32;
                                                while (true) {
                                                    ArrayList arrayList = eVar4.f9014a;
                                                    if ((h11 && arrayList.size() >= eVar4.j) || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i30 != 0 && eVar4.f9025m != i30) {
                                                eVar4.f9025m = i30;
                                                int i33 = i30 - 1;
                                                int i34 = e.f9006C[i33];
                                                boolean z11 = e.f9005B[i33];
                                                int i35 = e.f9013z[i33];
                                                int i36 = e.f9004A[i33];
                                                int i37 = e.f9012y[i33];
                                                eVar4.f9027o = i34;
                                                eVar4.f9024l = i37;
                                            }
                                            if (i31 != 0 && eVar4.f9026n != i31) {
                                                eVar4.f9026n = i31;
                                                int i38 = i31 - 1;
                                                int i39 = e.f9008E[i38];
                                                int i40 = e.f9007D[i38];
                                                eVar4.e(false, false);
                                                eVar4.f(e.f9010w, e.f9009F[i38]);
                                            }
                                            if (this.f9048p != i24) {
                                                this.f9048p = i24;
                                                this.f9044l = eVarArr[i24];
                                            }
                                            z9 = true;
                                            break;
                                    }
                                } else {
                                    z9 = true;
                                    if (i15 <= 255) {
                                        this.f9044l.a((char) (i15 & 255));
                                    } else {
                                        AbstractC0953k1.v("Invalid base command: ", i15, "Cea708Decoder");
                                        i9 = 2;
                                        c3 = 7;
                                    }
                                }
                                z10 = z9;
                                i9 = 2;
                                c3 = 7;
                            }
                            c3 = 7;
                            z9 = true;
                        } else {
                            z9 = true;
                            int i41 = fVar3.i(8);
                            if (i41 <= 31) {
                                c3 = 7;
                                if (i41 > 7) {
                                    if (i41 <= 15) {
                                        fVar3.r(8);
                                    } else if (i41 <= 23) {
                                        fVar3.r(16);
                                    } else if (i41 <= 31) {
                                        fVar3.r(24);
                                    }
                                }
                            } else {
                                c3 = 7;
                                if (i41 <= 127) {
                                    if (i41 != 32) {
                                        if (i41 != 33) {
                                            if (i41 != 37) {
                                                if (i41 != 42) {
                                                    if (i41 != 44) {
                                                        if (i41 != 63) {
                                                            if (i41 != 57) {
                                                                if (i41 != 58) {
                                                                    if (i41 != 60) {
                                                                        if (i41 != 61) {
                                                                            switch (i41) {
                                                                                case 48:
                                                                                    this.f9044l.a((char) 9608);
                                                                                    break;
                                                                                case 49:
                                                                                    this.f9044l.a((char) 8216);
                                                                                    break;
                                                                                case 50:
                                                                                    this.f9044l.a((char) 8217);
                                                                                    break;
                                                                                case 51:
                                                                                    this.f9044l.a((char) 8220);
                                                                                    break;
                                                                                case 52:
                                                                                    this.f9044l.a((char) 8221);
                                                                                    break;
                                                                                case 53:
                                                                                    this.f9044l.a((char) 8226);
                                                                                    break;
                                                                                default:
                                                                                    switch (i41) {
                                                                                        case 118:
                                                                                            this.f9044l.a((char) 8539);
                                                                                            break;
                                                                                        case 119:
                                                                                            this.f9044l.a((char) 8540);
                                                                                            break;
                                                                                        case 120:
                                                                                            this.f9044l.a((char) 8541);
                                                                                            break;
                                                                                        case 121:
                                                                                            this.f9044l.a((char) 8542);
                                                                                            break;
                                                                                        case 122:
                                                                                            this.f9044l.a((char) 9474);
                                                                                            break;
                                                                                        case 123:
                                                                                            this.f9044l.a((char) 9488);
                                                                                            break;
                                                                                        case 124:
                                                                                            this.f9044l.a((char) 9492);
                                                                                            break;
                                                                                        case 125:
                                                                                            this.f9044l.a((char) 9472);
                                                                                            break;
                                                                                        case 126:
                                                                                            this.f9044l.a((char) 9496);
                                                                                            break;
                                                                                        case 127:
                                                                                            this.f9044l.a((char) 9484);
                                                                                            break;
                                                                                        default:
                                                                                            AbstractC0953k1.v("Invalid G2 character: ", i41, "Cea708Decoder");
                                                                                            break;
                                                                                    }
                                                                            }
                                                                        } else {
                                                                            this.f9044l.a((char) 8480);
                                                                        }
                                                                    } else {
                                                                        this.f9044l.a((char) 339);
                                                                    }
                                                                } else {
                                                                    this.f9044l.a((char) 353);
                                                                }
                                                            } else {
                                                                this.f9044l.a((char) 8482);
                                                            }
                                                        } else {
                                                            this.f9044l.a((char) 376);
                                                        }
                                                    } else {
                                                        this.f9044l.a((char) 338);
                                                    }
                                                } else {
                                                    this.f9044l.a((char) 352);
                                                }
                                            } else {
                                                this.f9044l.a((char) 8230);
                                            }
                                        } else {
                                            this.f9044l.a((char) 160);
                                        }
                                    } else {
                                        this.f9044l.a(' ');
                                    }
                                    z10 = true;
                                } else if (i41 <= 159) {
                                    if (i41 <= 135) {
                                        fVar3.r(32);
                                    } else if (i41 <= 143) {
                                        fVar3.r(40);
                                    } else if (i41 <= 159) {
                                        i9 = 2;
                                        fVar3.r(2);
                                        fVar3.r(fVar3.i(6) * 8);
                                    }
                                } else {
                                    i9 = 2;
                                    if (i41 <= 255) {
                                        if (i41 == 160) {
                                            this.f9044l.a((char) 13252);
                                        } else {
                                            AbstractC0953k1.v("Invalid G3 character: ", i41, "Cea708Decoder");
                                            this.f9044l.a('_');
                                        }
                                        z10 = true;
                                    } else {
                                        AbstractC0953k1.v("Invalid extended command: ", i41, "Cea708Decoder");
                                    }
                                }
                            }
                            i9 = 2;
                        }
                        i12 = 3;
                        i10 = i9;
                    }
                }
            }
        }
        if (z10) {
            this.f9045m = k();
        }
        this.f9047o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.g.k():java.util.List");
    }

    public final void l() {
        for (int i9 = 0; i9 < 8; i9++) {
            this.f9043k[i9].d();
        }
    }
}
