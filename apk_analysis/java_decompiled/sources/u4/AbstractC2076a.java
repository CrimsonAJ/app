package u4;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.gms.internal.cast.C0890x0;
import com.google.android.gms.internal.cast.EnumC0894y0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import t0.C1988w;

/* renamed from: u4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2076a {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f23641a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f23642b;

    static {
        F4.y.f("CastButtonFactory", "The log tag cannot be null or empty.");
        new ArrayList();
        f23641a = new ArrayList();
        f23642b = new Object();
    }

    public static void a(Context context, MediaRouteButton mediaRouteButton) {
        C2077b c2077b;
        F4.y.d();
        if (mediaRouteButton != null) {
            F4.y.d();
            y4.b bVar = C2077b.f23643k;
            F4.y.d();
            C1988w c1988w = null;
            try {
                c2077b = C2077b.a(context);
            } catch (RuntimeException e8) {
                Object[] objArr = {e8};
                y4.b bVar2 = C2077b.f23643k;
                Log.e(bVar2.f24917a, bVar2.d("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", objArr));
                c2077b = null;
            }
            if (c2077b != null) {
                F4.y.d();
                try {
                    l lVar = (l) c2077b.f23647b;
                    Parcel f12 = lVar.f1(lVar.Q(), 1);
                    Bundle bundle = (Bundle) com.google.android.gms.internal.cast.C.a(f12, Bundle.CREATOR);
                    f12.recycle();
                    c1988w = C1988w.b(bundle);
                } catch (RemoteException e9) {
                    C2077b.f23643k.a(e9, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
                }
                if (c1988w != null) {
                    mediaRouteButton.setRouteSelector(c1988w);
                }
            }
            synchronized (f23642b) {
                f23641a.add(new WeakReference(mediaRouteButton));
            }
        }
        C0890x0.a(EnumC0894y0.CAST_DEFAULT_MEDIA_ROUTER_DIALOG);
    }
}
