package androidx.core.app;

import Z0.b;
import Z0.c;
import Z0.d;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.f9565a;
        boolean z9 = true;
        if (bVar.e(1)) {
            dVar = bVar.h();
        }
        remoteActionCompat.f9565a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.f9566b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f8918e);
        }
        remoteActionCompat.f9566b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f9567c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f8918e);
        }
        remoteActionCompat.f9567c = charSequence2;
        remoteActionCompat.f9568d = (PendingIntent) bVar.g(remoteActionCompat.f9568d, 4);
        boolean z10 = remoteActionCompat.f9569e;
        if (bVar.e(5)) {
            if (((c) bVar).f8918e.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        remoteActionCompat.f9569e = z10;
        boolean z11 = remoteActionCompat.f9570f;
        if (!bVar.e(6)) {
            z9 = z11;
        } else if (((c) bVar).f8918e.readInt() == 0) {
            z9 = false;
        }
        remoteActionCompat.f9570f = z9;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f9565a;
        bVar.i(1);
        bVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f9566b;
        bVar.i(2);
        Parcel parcel = ((c) bVar).f8918e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f9567c;
        bVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        bVar.k(remoteActionCompat.f9568d, 4);
        boolean z9 = remoteActionCompat.f9569e;
        bVar.i(5);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = remoteActionCompat.f9570f;
        bVar.i(6);
        parcel.writeInt(z10 ? 1 : 0);
    }
}
