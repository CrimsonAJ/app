package K5;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.SeekBar;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;

/* loaded from: classes.dex */
public final class t extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4388b;

    public /* synthetic */ t(int i9, Object obj) {
        this.f4387a = i9;
        this.f4388b = obj;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f4387a) {
            case 1:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setClassName(SeekBar.class.getName());
                CastSeekBar castSeekBar = (CastSeekBar) this.f4388b;
                castSeekBar.f14642a.getClass();
                accessibilityEvent.setItemCount(1);
                accessibilityEvent.setCurrentItemIndex(castSeekBar.getProgress());
                return;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                return;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f4387a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                EditText editText = ((u) this.f4388b).f4398h.getEditText();
                if (editText != null) {
                    accessibilityNodeInfo.setLabeledBy(editText);
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(SeekBar.class.getName());
                if (view.isEnabled()) {
                    accessibilityNodeInfo.addAction(4096);
                    accessibilityNodeInfo.addAction(8192);
                    return;
                }
                return;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(View view, int i9, Bundle bundle) {
        switch (this.f4387a) {
            case 1:
                if (!view.isEnabled()) {
                    return false;
                }
                if (super.performAccessibilityAction(view, i9, bundle)) {
                    return true;
                }
                if (i9 != 4096 && i9 != 8192) {
                    return false;
                }
                int i10 = CastSeekBar.j;
                CastSeekBar castSeekBar = (CastSeekBar) this.f4388b;
                castSeekBar.f14642a.getClass();
                castSeekBar.getProgress();
                castSeekBar.f14642a.getClass();
                return false;
            default:
                return super.performAccessibilityAction(view, i9, bundle);
        }
    }
}
