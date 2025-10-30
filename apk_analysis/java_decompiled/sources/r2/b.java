package r2;

import J1.AbstractC0199s;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import co.notix.R;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class b extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    public String f22591a;

    /* renamed from: b, reason: collision with root package name */
    public String f22592b;

    /* renamed from: c, reason: collision with root package name */
    public String f22593c;

    /* renamed from: d, reason: collision with root package name */
    public String f22594d;

    /* renamed from: e, reason: collision with root package name */
    public O7.a f22595e;

    /* renamed from: f, reason: collision with root package name */
    public O7.a f22596f;

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z9;
        int i9;
        int i10;
        final int i11 = 0;
        super.onCreate(bundle);
        final int i12 = 1;
        requestWindowFeature(1);
        LayoutInflater from = LayoutInflater.from(getContext());
        int i13 = AbstractC0199s.f4069z;
        AbstractC0199s abstractC0199s = (AbstractC0199s) W.c.b(from, R.layout.confirm_dialog, null, false);
        h.d(abstractC0199s, "inflate(...)");
        setContentView(abstractC0199s.f7853k);
        AppCompatTextView textTitle = abstractC0199s.f4073y;
        h.d(textTitle, "textTitle");
        if (this.f22591a.length() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i14 = 8;
        if (z9) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        textTitle.setVisibility(i9);
        textTitle.setText(this.f22591a);
        abstractC0199s.f4072x.setText(this.f22592b);
        MaterialButton buttonPositive = abstractC0199s.f4071w;
        h.d(buttonPositive, "buttonPositive");
        if (this.f22593c.length() > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        buttonPositive.setVisibility(i10);
        buttonPositive.setText(this.f22593c);
        buttonPositive.setOnClickListener(new View.OnClickListener(this) { // from class: r2.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f22590b;

            {
                this.f22590b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        b bVar = this.f22590b;
                        O7.a aVar = bVar.f22595e;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        bVar.dismiss();
                        return;
                    default:
                        b bVar2 = this.f22590b;
                        O7.a aVar2 = bVar2.f22596f;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        bVar2.dismiss();
                        return;
                }
            }
        });
        MaterialButton buttonNegative = abstractC0199s.f4070v;
        h.d(buttonNegative, "buttonNegative");
        if (this.f22594d.length() > 0) {
            i14 = 0;
        }
        buttonNegative.setVisibility(i14);
        buttonNegative.setText(this.f22594d);
        buttonNegative.setOnClickListener(new View.OnClickListener(this) { // from class: r2.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f22590b;

            {
                this.f22590b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        b bVar = this.f22590b;
                        O7.a aVar = bVar.f22595e;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        bVar.dismiss();
                        return;
                    default:
                        b bVar2 = this.f22590b;
                        O7.a aVar2 = bVar2.f22596f;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        bVar2.dismiss();
                        return;
                }
            }
        });
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
    }
}
