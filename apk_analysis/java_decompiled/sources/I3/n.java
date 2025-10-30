package I3;

import android.os.Parcel;
import android.os.Parcelable;
import co.notix.R;
import j3.C1444a0;
import java.util.ArrayList;
import l4.y;
import u0.z;

/* loaded from: classes.dex */
public final class n extends j {
    public static final Parcelable.Creator<n> CREATOR = new H3.b(13);

    /* renamed from: b, reason: collision with root package name */
    public final String f3520b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3521c;

    public n(String str, String str2, String str3) {
        super(str);
        this.f3520b = str2;
        this.f3521c = str3;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // I3.j, D3.b
    public final void b(C1444a0 c1444a0) {
        char c3;
        Integer num;
        String str = this.f3509a;
        str.getClass();
        String str2 = this.f3521c;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c3 = 14;
                    break;
                }
                c3 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c3 = 15;
                    break;
                }
                c3 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c3 = 16;
                    break;
                }
                c3 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c3 = 17;
                    break;
                }
                c3 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c3 = 18;
                    break;
                }
                c3 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c3 = 19;
                    break;
                }
                c3 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c3 = 20;
                    break;
                }
                c3 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c3 = 21;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        try {
            switch (c3) {
                case 0:
                case R.styleable.GradientColor_android_endX /* 10 */:
                    c1444a0.f19508c = str2;
                    return;
                case 1:
                case R.styleable.GradientColor_android_endY /* 11 */:
                    c1444a0.f19528x = str2;
                    return;
                case 2:
                case '\f':
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    c1444a0.f19522r = Integer.valueOf(parseInt);
                    c1444a0.f19523s = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 17:
                    c1444a0.f19507b = str2;
                    return;
                case 4:
                case 18:
                    c1444a0.f19509d = str2;
                    return;
                case 5:
                case 19:
                    c1444a0.f19529y = str2;
                    return;
                case 6:
                case 20:
                    int i9 = y.f20553a;
                    String[] split = str2.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    c1444a0.f19517m = Integer.valueOf(parseInt3);
                    c1444a0.f19518n = num;
                    return;
                case 7:
                case 16:
                    c1444a0.f19506a = str2;
                    return;
                case '\b':
                case 15:
                    c1444a0.f19527w = str2;
                    return;
                case '\t':
                case 21:
                    c1444a0.f19521q = Integer.valueOf(Integer.parseInt(str2));
                    return;
                case '\r':
                    ArrayList a5 = a(str2);
                    int size = a5.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c1444a0.f19523s = (Integer) a5.get(2);
                            } else {
                                return;
                            }
                        }
                        c1444a0.f19522r = (Integer) a5.get(1);
                    }
                    c1444a0.f19521q = (Integer) a5.get(0);
                    return;
                case 14:
                    ArrayList a9 = a(str2);
                    int size2 = a9.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c1444a0.f19526v = (Integer) a9.get(2);
                            } else {
                                return;
                            }
                        }
                        c1444a0.f19525u = (Integer) a9.get(1);
                    }
                    c1444a0.f19524t = (Integer) a9.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (y.a(this.f3509a, nVar.f3509a) && y.a(this.f3520b, nVar.f3520b) && y.a(this.f3521c, nVar.f3521c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int c3 = z.c(this.f3509a, 527, 31);
        int i10 = 0;
        String str = this.f3520b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i11 = (c3 + i9) * 31;
        String str2 = this.f3521c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @Override // I3.j
    public final String toString() {
        return this.f3509a + ": description=" + this.f3520b + ": value=" + this.f3521c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f3509a);
        parcel.writeString(this.f3520b);
        parcel.writeString(this.f3521c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = l4.y.f20553a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f3520b = r0
            java.lang.String r3 = r3.readString()
            r2.f3521c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.n.<init>(android.os.Parcel):void");
    }
}
