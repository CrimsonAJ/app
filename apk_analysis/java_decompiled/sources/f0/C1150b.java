package f0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import com.google.firebase.messaging.s;
import d0.C1088f;
import d0.C1091i;
import java.nio.ByteBuffer;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1150b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f17245a;

    /* renamed from: b, reason: collision with root package name */
    public final e0.c f17246b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1150b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i9;
        e0.c cVar = new e0.c(1);
        this.f17245a = editText;
        this.f17246b = cVar;
        if (C1091i.f16642k != null) {
            C1091i a5 = C1091i.a();
            if (a5.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C1088f c1088f = a5.f16647e;
            c1088f.getClass();
            Bundle bundle = editorInfo.extras;
            e0.b bVar = (e0.b) ((s) c1088f.f16640b).f16504b;
            int a9 = bVar.a(4);
            if (a9 != 0) {
                i9 = ((ByteBuffer) bVar.f1637d).getInt(a9 + bVar.f1634a);
            } else {
                i9 = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i9);
            Bundle bundle2 = editorInfo.extras;
            ((C1091i) c1088f.f16641c).getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i9, int i10) {
        Editable editableText = this.f17245a.getEditableText();
        this.f17246b.getClass();
        if (!e0.c.E(this, editableText, i9, i10, false) && !super.deleteSurroundingText(i9, i10)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i9, int i10) {
        Editable editableText = this.f17245a.getEditableText();
        this.f17246b.getClass();
        if (e0.c.E(this, editableText, i9, i10, true) || super.deleteSurroundingTextInCodePoints(i9, i10)) {
            return true;
        }
        return false;
    }
}
