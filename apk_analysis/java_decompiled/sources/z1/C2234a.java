package z1;

import B7.k;
import C1.m;
import H1.f;
import W7.d;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.gms.internal.measurement.Y1;
import i8.y;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: z1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2234a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25364a;

    public /* synthetic */ C2234a(int i9) {
        this.f25364a = i9;
    }

    public final Object a(Object obj, m mVar) {
        String scheme;
        String authority;
        switch (this.f25364a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (!f.d(uri) && ((scheme = uri.getScheme()) == null || scheme.equals("file"))) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    if (path.length() > 0 && Y1.l(path.charAt(0), '/', false) && ((String) k.q0(uri.getPathSegments())) != null) {
                        if (h.a(uri.getScheme(), "file")) {
                            String path2 = uri.getPath();
                            if (path2 != null) {
                                return new File(path2);
                            }
                        } else {
                            return new File(uri.toString());
                        }
                    }
                }
                return null;
            case 2:
                return ((y) obj).f19177i;
            case 3:
                Context context = mVar.f1218a;
                int intValue = ((Number) obj).intValue();
                try {
                    if (context.getResources().getResourceEntryName(intValue) != null) {
                        return Uri.parse("android.resource://" + context.getPackageName() + '/' + intValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                Uri uri2 = (Uri) obj;
                if (h.a(uri2.getScheme(), "android.resource") && (authority = uri2.getAuthority()) != null && !d.U(authority) && uri2.getPathSegments().size() == 2) {
                    String authority2 = uri2.getAuthority();
                    if (authority2 == null) {
                        authority2 = "";
                    }
                    Resources resourcesForApplication = mVar.f1218a.getPackageManager().getResourcesForApplication(authority2);
                    List<String> pathSegments = uri2.getPathSegments();
                    int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                    if (identifier != 0) {
                        return Uri.parse("android.resource://" + authority2 + '/' + identifier);
                    }
                    throw new IllegalStateException(("Invalid android.resource URI: " + uri2).toString());
                }
                return null;
            default:
                return Uri.parse((String) obj);
        }
    }
}
