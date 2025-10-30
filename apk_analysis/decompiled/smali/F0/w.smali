.class public final LF0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LF0/w;->a:I

    iput-object p2, p0, LF0/w;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, LF0/w;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iget v3, p0, LF0/w;->a:I

    .line 6
    .line 7
    packed-switch v3, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Ljava/lang/Float;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    check-cast v2, Landroid/widget/TextView;

    .line 21
    .line 22
    invoke-virtual {v2, p1}, Landroid/view/View;->setScaleX(F)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, p1}, Landroid/view/View;->setScaleY(F)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Ljava/lang/Float;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    check-cast v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 40
    .line 41
    iget-object v0, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->i:LF5/h;

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iget-object v2, v0, LF5/h;->a:LF5/g;

    .line 46
    .line 47
    iget v3, v2, LF5/g;->i:F

    .line 48
    .line 49
    cmpl-float v3, v3, p1

    .line 50
    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    iput p1, v2, LF5/g;->i:F

    .line 54
    .line 55
    iput-boolean v1, v0, LF5/h;->e:Z

    .line 56
    .line 57
    invoke-virtual {v0}, LF5/h;->invalidateSelf()V

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void

    .line 61
    :pswitch_1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    check-cast v2, Lcom/google/android/material/appbar/CollapsingToolbarLayout;

    .line 72
    .line 73
    invoke-virtual {v2, p1}, Lcom/google/android/material/appbar/CollapsingToolbarLayout;->setScrimAlpha(I)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_2
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Ljava/lang/Float;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    check-cast v2, Landroid/view/View;

    .line 88
    .line 89
    invoke-virtual {v2, p1}, Landroid/view/View;->setX(F)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_3
    check-cast v2, Lcom/google/android/material/textfield/TextInputLayout;

    .line 94
    .line 95
    iget-object v0, v2, Lcom/google/android/material/textfield/TextInputLayout;->T0:Lw5/c;

    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Ljava/lang/Float;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    invoke-virtual {v0, p1}, Lw5/c;->p(F)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_4
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, Ljava/lang/Integer;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    check-cast v2, Lcom/google/android/material/tabs/TabLayout;

    .line 122
    .line 123
    invoke-virtual {v2, p1, v0}, Landroid/view/View;->scrollTo(II)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_5
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, Ljava/lang/Float;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    check-cast v2, LH5/d;

    .line 138
    .line 139
    iget-object v3, v2, LH5/d;->l:Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    :goto_0
    if-ge v0, v4, :cond_1

    .line 146
    .line 147
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    add-int/2addr v0, v1

    .line 152
    check-cast v5, LN5/b;

    .line 153
    .line 154
    const v6, 0x3f99999a    # 1.2f

    .line 155
    .line 156
    .line 157
    iput v6, v5, LN5/b;->l0:F

    .line 158
    .line 159
    iput p1, v5, LN5/b;->j0:F

    .line 160
    .line 161
    iput p1, v5, LN5/b;->k0:F

    .line 162
    .line 163
    const/4 v6, 0x0

    .line 164
    const/high16 v7, 0x3f800000    # 1.0f

    .line 165
    .line 166
    const v8, 0x3e428f5c    # 0.19f

    .line 167
    .line 168
    .line 169
    invoke-static {v6, v7, v8, v7, p1}, Lh5/a;->b(FFFFF)F

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    iput v6, v5, LN5/b;->m0:F

    .line 174
    .line 175
    invoke-virtual {v5}, LF5/h;->invalidateSelf()V

    .line 176
    .line 177
    .line 178
    goto :goto_0

    .line 179
    :cond_1
    sget-object p1, LP/Q;->a:Ljava/util/WeakHashMap;

    .line 180
    .line 181
    invoke-virtual {v2}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :pswitch_6
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, Ljava/lang/Float;

    .line 190
    .line 191
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    const/high16 v0, 0x437f0000    # 255.0f

    .line 196
    .line 197
    mul-float/2addr p1, v0

    .line 198
    float-to-int p1, p1

    .line 199
    check-cast v2, LF0/x;

    .line 200
    .line 201
    iget-object v0, v2, LF0/x;->c:Landroid/graphics/drawable/StateListDrawable;

    .line 202
    .line 203
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 204
    .line 205
    .line 206
    iget-object v0, v2, LF0/x;->d:Landroid/graphics/drawable/Drawable;

    .line 207
    .line 208
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 209
    .line 210
    .line 211
    iget-object p1, v2, LF0/x;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 212
    .line 213
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method
