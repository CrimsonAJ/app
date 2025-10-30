package P;

import android.view.View;

/* loaded from: classes.dex */
public abstract class K {
    public static int a(View view) {
        return view.getImportantForAutofill();
    }

    public static void b(View view, int i9) {
        view.setImportantForAutofill(i9);
    }
}
