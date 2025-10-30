package S;

import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public abstract class f {
    public static void a(NestedScrollView nestedScrollView, float f9) {
        try {
            nestedScrollView.setFrameContentVelocity(f9);
        } catch (LinkageError unused) {
        }
    }
}
