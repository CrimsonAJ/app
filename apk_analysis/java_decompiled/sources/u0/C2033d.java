package u0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@U("activity")
/* renamed from: u0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2033d extends V {

    /* renamed from: c, reason: collision with root package name */
    public final Context f23479c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f23480d;

    public C2033d(Context context) {
        Object obj;
        this.f23479c = context;
        Iterator it = V7.l.g0(context, C2032c.f23470e).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f23480d = (Activity) obj;
    }

    @Override // u0.V
    public final C a() {
        return new C(this);
    }

    @Override // u0.V
    public final C c(C c3, Bundle bundle, J j) {
        Intent intent;
        int intExtra;
        T t7;
        String encode;
        C2031b c2031b = (C2031b) c3;
        if (c2031b.f23468k != null) {
            Intent intent2 = new Intent(c2031b.f23468k);
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = c2031b.f23469l;
                if (str != null && str.length() != 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            Map H8 = B7.y.H(c2031b.f23380g);
                            kotlin.jvm.internal.h.b(group);
                            C2038i c2038i = (C2038i) H8.get(group);
                            if (c2038i != null) {
                                t7 = c2038i.f23486a;
                            } else {
                                t7 = null;
                            }
                            if (t7 != null) {
                                encode = t7.f(t7.a(group, bundle));
                            } else {
                                encode = Uri.encode(String.valueOf(bundle.get(group)));
                            }
                            stringBuffer.append(encode);
                        } else {
                            throw new IllegalArgumentException(("Could not find " + group + " in " + bundle + " to fill data pattern " + str).toString());
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            Activity activity = this.f23480d;
            if (activity == null) {
                intent2.addFlags(268435456);
            }
            if (j != null && j.f23422a) {
                intent2.addFlags(536870912);
            }
            int i9 = 0;
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", c2031b.f23381h);
            Context context = this.f23479c;
            Resources resources = context.getResources();
            if (j != null) {
                int i10 = j.f23429h;
                int i11 = j.f23430i;
                if ((i10 > 0 && kotlin.jvm.internal.h.a(resources.getResourceTypeName(i10), "animator")) || (i11 > 0 && kotlin.jvm.internal.h.a(resources.getResourceTypeName(i11), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i10) + " and popExit resource " + resources.getResourceName(i11) + " when launching " + c2031b);
                } else {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i10);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i11);
                }
            }
            context.startActivity(intent2);
            if (j != null && activity != null) {
                int i12 = j.f23427f;
                int i13 = j.f23428g;
                if ((i12 > 0 && kotlin.jvm.internal.h.a(resources.getResourceTypeName(i12), "animator")) || (i13 > 0 && kotlin.jvm.internal.h.a(resources.getResourceTypeName(i13), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i12) + " and exit resource " + resources.getResourceName(i13) + "when launching " + c2031b);
                    return null;
                }
                if (i12 >= 0 || i13 >= 0) {
                    if (i12 < 0) {
                        i12 = 0;
                    }
                    if (i13 >= 0) {
                        i9 = i13;
                    }
                    activity.overridePendingTransition(i12, i9);
                }
            }
            return null;
        }
        throw new IllegalStateException(z.g(new StringBuilder("Destination "), c2031b.f23381h, " does not have an Intent set.").toString());
    }

    @Override // u0.V
    public final boolean j() {
        Activity activity = this.f23480d;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}
