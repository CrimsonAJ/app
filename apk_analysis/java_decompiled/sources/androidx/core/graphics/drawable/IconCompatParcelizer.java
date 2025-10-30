package androidx.core.graphics.drawable;

import Z0.b;
import Z0.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f9578a = bVar.f(iconCompat.f9578a, 1);
        byte[] bArr = iconCompat.f9580c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f8918e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f9580c = bArr;
        iconCompat.f9581d = bVar.g(iconCompat.f9581d, 3);
        iconCompat.f9582e = bVar.f(iconCompat.f9582e, 4);
        iconCompat.f9583f = bVar.f(iconCompat.f9583f, 5);
        iconCompat.f9584g = (ColorStateList) bVar.g(iconCompat.f9584g, 6);
        String str = iconCompat.f9586i;
        if (bVar.e(7)) {
            str = ((c) bVar).f8918e.readString();
        }
        iconCompat.f9586i = str;
        String str2 = iconCompat.j;
        if (bVar.e(8)) {
            str2 = ((c) bVar).f8918e.readString();
        }
        iconCompat.j = str2;
        iconCompat.f9585h = PorterDuff.Mode.valueOf(iconCompat.f9586i);
        switch (iconCompat.f9578a) {
            case -1:
                Parcelable parcelable = iconCompat.f9581d;
                if (parcelable != null) {
                    iconCompat.f9579b = parcelable;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f9581d;
                if (parcelable2 != null) {
                    iconCompat.f9579b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f9580c;
                iconCompat.f9579b = bArr3;
                iconCompat.f9578a = 3;
                iconCompat.f9582e = 0;
                iconCompat.f9583f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f9580c, Charset.forName("UTF-16"));
                iconCompat.f9579b = str3;
                if (iconCompat.f9578a == 2 && iconCompat.j == null) {
                    iconCompat.j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f9579b = iconCompat.f9580c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f9586i = iconCompat.f9585h.name();
        switch (iconCompat.f9578a) {
            case -1:
                iconCompat.f9581d = (Parcelable) iconCompat.f9579b;
                break;
            case 1:
            case 5:
                iconCompat.f9581d = (Parcelable) iconCompat.f9579b;
                break;
            case 2:
                iconCompat.f9580c = ((String) iconCompat.f9579b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f9580c = (byte[]) iconCompat.f9579b;
                break;
            case 4:
            case 6:
                iconCompat.f9580c = iconCompat.f9579b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i9 = iconCompat.f9578a;
        if (-1 != i9) {
            bVar.j(i9, 1);
        }
        byte[] bArr = iconCompat.f9580c;
        if (bArr != null) {
            bVar.i(2);
            int length = bArr.length;
            Parcel parcel = ((c) bVar).f8918e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f9581d;
        if (parcelable != null) {
            bVar.k(parcelable, 3);
        }
        int i10 = iconCompat.f9582e;
        if (i10 != 0) {
            bVar.j(i10, 4);
        }
        int i11 = iconCompat.f9583f;
        if (i11 != 0) {
            bVar.j(i11, 5);
        }
        ColorStateList colorStateList = iconCompat.f9584g;
        if (colorStateList != null) {
            bVar.k(colorStateList, 6);
        }
        String str = iconCompat.f9586i;
        if (str != null) {
            bVar.i(7);
            ((c) bVar).f8918e.writeString(str);
        }
        String str2 = iconCompat.j;
        if (str2 != null) {
            bVar.i(8);
            ((c) bVar).f8918e.writeString(str2);
        }
    }
}
