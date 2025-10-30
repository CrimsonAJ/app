package w4;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import v4.v;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final y4.b f24209a = new y4.b("MediaSessionUtils", null);

    public static ArrayList a(v vVar) {
        try {
            Parcel f12 = vVar.f1(vVar.Q(), 3);
            ArrayList createTypedArrayList = f12.createTypedArrayList(v4.d.CREATOR);
            f12.recycle();
            return createTypedArrayList;
        } catch (RemoteException e8) {
            Object[] objArr = {"getNotificationActions", v.class.getSimpleName()};
            y4.b bVar = f24209a;
            Log.e(bVar.f24917a, bVar.d("Unable to call %s on %s.", objArr), e8);
            return null;
        }
    }

    public static int[] b(v vVar) {
        try {
            Parcel f12 = vVar.f1(vVar.Q(), 4);
            int[] createIntArray = f12.createIntArray();
            f12.recycle();
            return createIntArray;
        } catch (RemoteException e8) {
            Object[] objArr = {"getCompactViewActionIndices", v.class.getSimpleName()};
            y4.b bVar = f24209a;
            Log.e(bVar.f24917a, bVar.d("Unable to call %s on %s.", objArr), e8);
            return null;
        }
    }
}
