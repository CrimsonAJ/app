package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import w5.o;

/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f16276a;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f16276a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f16276a;
        if (isEmpty) {
            chipTextInputComboView.f16245a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a5 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f16245a;
        if (TextUtils.isEmpty(a5)) {
            a5 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a5);
    }
}
