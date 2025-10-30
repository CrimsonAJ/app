package P;

import android.graphics.Rect;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteListingPreference;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: P.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0324z {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float b(VelocityTracker velocityTracker, int i9) {
        return velocityTracker.getAxisVelocity(i9);
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static Set e(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getDeduplicationIds();
    }

    public static int f(ViewConfiguration viewConfiguration, int i9, int i10, int i11) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i9, i10, i11);
    }

    public static int g(ViewConfiguration viewConfiguration, int i9, int i10, int i11) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i9, i10, i11);
    }

    public static int h(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getType();
    }

    public static boolean i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void j(TextView textView, int i9, float f9) {
        textView.setLineHeight(i9, f9);
    }

    public static void k(MediaRouter2 mediaRouter2, RouteListingPreference routeListingPreference) {
        mediaRouter2.setRouteListingPreference(routeListingPreference);
    }

    public static boolean l(MediaRouter2 mediaRouter2) {
        return mediaRouter2.showSystemOutputSwitcher();
    }

    public static RouteListingPreference m(t0.Z z9) {
        ArrayList arrayList = new ArrayList();
        for (t0.Y y9 : z9.f22943a) {
            arrayList.add(new RouteListingPreference.Item.Builder(y9.f22941a).setFlags(0).setSubText(0).setCustomSubtextMessage(null).setSelectionBehavior(y9.f22942b).build());
        }
        return new RouteListingPreference.Builder().setItems(arrayList).setLinkedItemComponentName(null).setUseSystemOrdering(z9.f22944b).build();
    }
}
