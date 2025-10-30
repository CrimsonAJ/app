package y3;

import A3.E;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.UUID;
import l4.AbstractC1566a;
import q3.InterfaceC1906k;

/* renamed from: y3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2214j {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f24841a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f24842b = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i9;
        int i10;
        if (bArr != null) {
            i9 = bArr.length;
        } else {
            i9 = 0;
        }
        int i11 = i9 + 32;
        if (uuidArr != null) {
            i11 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i11);
        allocate.putInt(i11);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i10 = 16777216;
        } else {
            i10 = 0;
        }
        allocate.putInt(i10);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static I3.e b(int i9, A4.r rVar) {
        int i10 = rVar.i();
        if (rVar.i() == 1684108385) {
            rVar.I(8);
            String s9 = rVar.s(i10 - 16);
            return new I3.e("und", s9, s9);
        }
        AbstractC1566a.P("MetadataUtil", "Failed to parse comment attribute: " + Q0.b.d(i9));
        return null;
    }

    public static I3.a c(A4.r rVar) {
        String str;
        int i9 = rVar.i();
        if (rVar.i() == 1684108385) {
            int i10 = rVar.i() & 16777215;
            if (i10 == 13) {
                str = "image/jpeg";
            } else if (i10 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                AbstractC0953k1.v("Unrecognized cover art flags: ", i10, "MetadataUtil");
                return null;
            }
            rVar.I(4);
            int i11 = i9 - 16;
            byte[] bArr = new byte[i11];
            rVar.h(bArr, 0, i11);
            return new I3.a(str, null, 3, bArr);
        }
        AbstractC1566a.P("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static I3.n d(int i9, A4.r rVar, String str) {
        int i10 = rVar.i();
        if (rVar.i() == 1684108385 && i10 >= 22) {
            rVar.I(10);
            int C8 = rVar.C();
            if (C8 > 0) {
                String j = AbstractC0953k1.j(C8, "");
                int C9 = rVar.C();
                if (C9 > 0) {
                    j = j + "/" + C9;
                }
                return new I3.n(str, null, j);
            }
        }
        AbstractC1566a.P("MetadataUtil", "Failed to parse index/count attribute: " + Q0.b.d(i9));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public static E e(byte[] bArr) {
        A4.r rVar = new A4.r(bArr);
        if (rVar.f383b >= 32) {
            rVar.H(0);
            if (rVar.i() == rVar.e() + 4 && rVar.i() == 1886614376) {
                int q9 = Q0.b.q(rVar.i());
                if (q9 > 1) {
                    AbstractC0953k1.v("Unsupported pssh version: ", q9, "PsshAtomUtil");
                    return null;
                }
                UUID uuid = new UUID(rVar.q(), rVar.q());
                if (q9 == 1) {
                    rVar.I(rVar.A() * 16);
                }
                int A2 = rVar.A();
                if (A2 == rVar.e()) {
                    ?? r22 = new byte[A2];
                    rVar.h(r22, 0, A2);
                    return new E(uuid, q9, (Serializable) r22, 16);
                }
            }
        }
        return null;
    }

    public static byte[] f(byte[] bArr, UUID uuid) {
        E e8 = e(bArr);
        if (e8 == null) {
            return null;
        }
        UUID uuid2 = (UUID) e8.f47c;
        if (!uuid.equals(uuid2)) {
            AbstractC1566a.P("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return (byte[]) e8.f48d;
    }

    public static I3.n g(int i9, A4.r rVar, String str) {
        int i10 = rVar.i();
        if (rVar.i() == 1684108385) {
            rVar.I(8);
            return new I3.n(str, null, rVar.s(i10 - 16));
        }
        AbstractC1566a.P("MetadataUtil", "Failed to parse text attribute: " + Q0.b.d(i9));
        return null;
    }

    public static I3.j h(int i9, String str, A4.r rVar, boolean z9, boolean z10) {
        int i10 = i(rVar);
        if (z10) {
            i10 = Math.min(1, i10);
        }
        if (i10 >= 0) {
            if (z9) {
                return new I3.n(str, null, Integer.toString(i10));
            }
            return new I3.e("und", str, Integer.toString(i10));
        }
        AbstractC1566a.P("MetadataUtil", "Failed to parse uint8 attribute: " + Q0.b.d(i9));
        return null;
    }

    public static int i(A4.r rVar) {
        rVar.I(4);
        if (rVar.i() == 1684108385) {
            rVar.I(8);
            return rVar.x();
        }
        AbstractC1566a.P("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static boolean j(InterfaceC1906k interfaceC1906k, boolean z9, boolean z10) {
        boolean z11;
        int i9;
        int i10;
        long j = interfaceC1906k.j();
        long j4 = -1;
        int i11 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        long j9 = 4096;
        if (i11 != 0 && j <= 4096) {
            j9 = j;
        }
        int i12 = (int) j9;
        A4.r rVar = new A4.r(64);
        int i13 = 0;
        int i14 = 0;
        boolean z12 = false;
        while (i14 < i12) {
            rVar.E(8);
            if (!interfaceC1906k.t((byte[]) rVar.f384c, i13, 8, true)) {
                break;
            }
            long y9 = rVar.y();
            int i15 = rVar.i();
            if (y9 == 1) {
                interfaceC1906k.B((byte[]) rVar.f384c, 8, 8);
                rVar.G(16);
                i9 = i14;
                i10 = 16;
                y9 = rVar.q();
            } else {
                if (y9 == 0) {
                    long j10 = interfaceC1906k.j();
                    if (j10 != j4) {
                        y9 = (j10 - interfaceC1906k.w()) + 8;
                    }
                }
                i9 = i14;
                i10 = 8;
            }
            long j11 = i10;
            if (y9 < j11) {
                return false;
            }
            int i16 = i9 + i10;
            if (i15 == 1836019574) {
                i12 += (int) y9;
                if (i11 != 0 && i12 > j) {
                    i12 = (int) j;
                }
                i14 = i16;
            } else if (i15 != 1836019558 && i15 != 1836475768) {
                int i17 = i11;
                if ((i16 + y9) - j11 >= i12) {
                    break;
                }
                int i18 = (int) (y9 - j11);
                i14 = i16 + i18;
                if (i15 == 1718909296) {
                    if (i18 < 8) {
                        return false;
                    }
                    rVar.E(i18);
                    interfaceC1906k.B((byte[]) rVar.f384c, 0, i18);
                    int i19 = i18 / 4;
                    for (int i20 = 0; i20 < i19; i20++) {
                        if (i20 == 1) {
                            rVar.I(4);
                        } else {
                            int i21 = rVar.i();
                            if ((i21 >>> 8) != 3368816 && (i21 != 1751476579 || !z10)) {
                                int[] iArr = f24842b;
                                for (int i22 = 0; i22 < 29; i22++) {
                                    if (iArr[i22] != i21) {
                                    }
                                }
                            }
                            z12 = true;
                            break;
                        }
                    }
                    if (!z12) {
                        return false;
                    }
                } else if (i18 != 0) {
                    interfaceC1906k.C(i18);
                }
                i11 = i17;
            } else {
                z11 = true;
                break;
            }
            j4 = -1;
            i13 = 0;
        }
        z11 = false;
        if (!z12 || z9 != z11) {
            return false;
        }
        return true;
    }
}
