package p;

import P.C0303d;
import P.InterfaceC0302c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: p.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1732A {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0302c interfaceC0302c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0302c = new s4.i(clipData, 3);
            } else {
                C0303d c0303d = new C0303d();
                c0303d.f5584b = clipData;
                c0303d.f5585c = 3;
                interfaceC0302c = c0303d;
            }
            P.Q.i(textView, interfaceC0302c.b());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0302c interfaceC0302c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0302c = new s4.i(clipData, 3);
        } else {
            C0303d c0303d = new C0303d();
            c0303d.f5584b = clipData;
            c0303d.f5585c = 3;
            interfaceC0302c = c0303d;
        }
        P.Q.i(view, interfaceC0302c.b());
        return true;
    }
}
