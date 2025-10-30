package t0;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: t0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1980n {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f23015a;

    public C1980n(Bundle bundle) {
        this.f23015a = bundle;
    }

    public final HashSet a() {
        Bundle bundle = this.f23015a;
        if (!bundle.containsKey("allowedPackages")) {
            return new HashSet();
        }
        return new HashSet(bundle.getStringArrayList("allowedPackages"));
    }

    public final ArrayList b() {
        Bundle bundle = this.f23015a;
        if (!bundle.containsKey("controlFilters")) {
            return new ArrayList();
        }
        return new ArrayList(bundle.getParcelableArrayList("controlFilters"));
    }

    public final ArrayList c() {
        Bundle bundle = this.f23015a;
        if (!bundle.containsKey("groupMemberIds")) {
            return new ArrayList();
        }
        return new ArrayList(bundle.getStringArrayList("groupMemberIds"));
    }

    public final String d() {
        return this.f23015a.getString("id");
    }

    public final boolean e() {
        if (!TextUtils.isEmpty(d()) && !TextUtils.isEmpty(this.f23015a.getString("name")) && !b().contains(null)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Uri parse;
        StringBuilder sb = new StringBuilder("MediaRouteDescriptor{ id=");
        sb.append(d());
        sb.append(", groupMemberIds=");
        sb.append(c());
        sb.append(", name=");
        Bundle bundle = this.f23015a;
        sb.append(bundle.getString("name"));
        sb.append(", description=");
        sb.append(bundle.getString("status"));
        sb.append(", iconUri=");
        String string = bundle.getString("iconUri");
        if (string == null) {
            parse = null;
        } else {
            parse = Uri.parse(string);
        }
        sb.append(parse);
        sb.append(", isEnabled=");
        sb.append(bundle.getBoolean("enabled", true));
        sb.append(", isSystemRoute=");
        sb.append(bundle.getBoolean("isSystemRoute", false));
        sb.append(", connectionState=");
        sb.append(bundle.getInt("connectionState", 0));
        sb.append(", controlFilters=");
        sb.append(Arrays.toString(b().toArray()));
        sb.append(", playbackType=");
        sb.append(bundle.getInt("playbackType", 1));
        sb.append(", playbackStream=");
        sb.append(bundle.getInt("playbackStream", -1));
        sb.append(", deviceType=");
        sb.append(bundle.getInt("deviceType"));
        sb.append(", volume=");
        sb.append(bundle.getInt("volume"));
        sb.append(", volumeMax=");
        sb.append(bundle.getInt("volumeMax"));
        sb.append(", volumeHandling=");
        sb.append(bundle.getInt("volumeHandling", 0));
        sb.append(", presentationDisplayId=");
        sb.append(bundle.getInt("presentationDisplayId", -1));
        sb.append(", extras=");
        sb.append(bundle.getBundle("extras"));
        sb.append(", isValid=");
        sb.append(e());
        sb.append(", minClientVersion=");
        sb.append(bundle.getInt("minClientVersion", 1));
        sb.append(", maxClientVersion=");
        sb.append(bundle.getInt("maxClientVersion", Integer.MAX_VALUE));
        sb.append(", isVisibilityPublic=");
        sb.append(bundle.getBoolean("isVisibilityPublic", true));
        sb.append(", allowedPackages=");
        sb.append(Arrays.toString(a().toArray()));
        sb.append(" }");
        return sb.toString();
    }
}
