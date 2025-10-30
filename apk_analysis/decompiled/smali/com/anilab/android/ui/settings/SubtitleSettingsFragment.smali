.class public final Lcom/anilab/android/ui/settings/SubtitleSettingsFragment;
.super Lo2/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo2/b<",
        "Lo2/s;",
        "LJ1/C0;",
        ">;"
    }
.end annotation


# instance fields
.field public final D0:LY2/r;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lo2/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Le2/e;

    .line 5
    .line 6
    const/16 v1, 0x12

    .line 7
    .line 8
    invoke-direct {v0, v1, p0}, Le2/e;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object v1, LA7/f;->a:LA7/f;

    .line 12
    .line 13
    new-instance v2, Le2/e;

    .line 14
    .line 15
    const/16 v3, 0x13

    .line 16
    .line 17
    invoke-direct {v2, v3, v0}, Le2/e;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, LZ0/a;->p(LA7/f;LO7/a;)LA7/e;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-class v1, Lo2/s;

    .line 25
    .line 26
    invoke-static {v1}, Lkotlin/jvm/internal/p;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v2, Lo2/o;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-direct {v2, v0, v3}, Lo2/o;-><init>(LA7/e;I)V

    .line 34
    .line 35
    .line 36
    new-instance v3, Lo2/o;

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    invoke-direct {v3, v0, v4}, Lo2/o;-><init>(LA7/e;I)V

    .line 40
    .line 41
    .line 42
    new-instance v4, Lo2/p;

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    invoke-direct {v4, p0, v0, v5}, Lo2/p;-><init>(Li0/v;LA7/e;I)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0, v1, v2, v3, v4}, LM4/a;->i(Li0/v;Lkotlin/jvm/internal/d;LO7/a;LO7/a;LO7/a;)LY2/r;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lcom/anilab/android/ui/settings/SubtitleSettingsFragment;->D0:LY2/r;

    .line 53
    .line 54
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method

.method public static s0(LJ2/d;)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_4

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_3

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    if-ne p0, v0, :cond_0

    .line 18
    .line 19
    sget-object p0, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    new-instance p0, LA7/b;

    .line 23
    .line 24
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw p0

    .line 28
    :cond_1
    sget-object p0, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_2
    sget-object p0, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_3
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_4
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 38
    .line 39
    return-object p0
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method


# virtual methods
.method public final f0()I
    .locals 1

    .line 1
    const v0, 0x7f0d0063

    return v0
.end method

.method public final bridge synthetic h0()LM1/r;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/anilab/android/ui/settings/SubtitleSettingsFragment;->t0()Lo2/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final k0(I)V
    .locals 2

    .line 1
    const v0, 0x7f0a0071

    .line 2
    .line 3
    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const v0, 0x7f0a00b1

    .line 7
    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/anilab/android/ui/settings/SubtitleSettingsFragment;->t0()Lo2/s;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v0, Lo2/r;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, p1, v1}, Lo2/r;-><init>(Lo2/s;LE7/d;)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {p1, v1, v0}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 27
    .line 28
    .line 29
    new-instance p1, LM1/D;

    .line 30
    .line 31
    const v0, 0x7f140212

    .line 32
    .line 33
    .line 34
    invoke-direct {p1, v0}, LM1/D;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, LM1/n;->o0(LM1/E;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    invoke-static {p0}, LM1/n;->q0(LM1/n;)V

    .line 42
    .line 43
    .line 44
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method

.method public final m0(LW/g;)Ljava/util/List;
    .locals 3

    .line 1
    check-cast p1, LJ1/C0;

    .line 2
    .line 3
    iget-object v0, p1, LJ1/C0;->v:Landroidx/appcompat/widget/AppCompatImageView;

    .line 4
    .line 5
    iget-object p1, p1, LJ1/C0;->w:Lcom/google/android/material/button/MaterialButton;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    new-array v1, v1, [Landroid/view/View;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aput-object v0, v1, v2

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    aput-object p1, v1, v0

    .line 15
    .line 16
    invoke-static {v1}, LB7/l;->b0([Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final p0()V
    .locals 14

    .line 1
    invoke-virtual {p0}, LM1/n;->e0()LW/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LJ1/C0;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/anilab/android/ui/settings/SubtitleSettingsFragment;->t0()Lo2/s;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v1, v1, Lo2/s;->g:LI2/f;

    .line 12
    .line 13
    iget v2, v1, LI2/f;->d:I

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    const/16 v4, 0x8

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    if-gt v4, v2, :cond_0

    .line 23
    .line 24
    const/16 v4, 0x29

    .line 25
    .line 26
    if-ge v2, v4, :cond_0

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    :cond_0
    const/4 v2, 0x0

    .line 30
    if-eqz v5, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v3, v2

    .line 34
    :goto_0
    if-eqz v3, :cond_2

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const/16 v3, 0x16

    .line 42
    .line 43
    :goto_1
    int-to-float v3, v3

    .line 44
    iget-object v4, v0, LJ1/C0;->B:Lcom/google/android/material/slider/Slider;

    .line 45
    .line 46
    invoke-virtual {v4, v3}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    .line 47
    .line 48
    .line 49
    iget v3, v1, LI2/f;->i:F

    .line 50
    .line 51
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    const/4 v6, 0x0

    .line 56
    cmpg-float v7, v6, v3

    .line 57
    .line 58
    if-gtz v7, :cond_3

    .line 59
    .line 60
    const/high16 v7, 0x42000000    # 32.0f

    .line 61
    .line 62
    cmpg-float v3, v3, v7

    .line 63
    .line 64
    if-gtz v3, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    move-object v5, v2

    .line 68
    :goto_2
    if-eqz v5, :cond_4

    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    goto :goto_3

    .line 75
    :cond_4
    move v3, v6

    .line 76
    :goto_3
    iget-object v5, v0, LJ1/C0;->A:Lcom/google/android/material/slider/Slider;

    .line 77
    .line 78
    invoke-virtual {v5, v3}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    .line 79
    .line 80
    .line 81
    iget-object v3, v1, LI2/f;->e:LJ2/d;

    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    int-to-float v3, v3

    .line 88
    iget-object v7, v0, LJ1/C0;->C:Lcom/google/android/material/slider/Slider;

    .line 89
    .line 90
    invoke-virtual {v7, v3}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    .line 91
    .line 92
    .line 93
    iget v3, v1, LI2/f;->c:I

    .line 94
    .line 95
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    if-ltz v3, :cond_5

    .line 100
    .line 101
    const/16 v9, 0x1ad

    .line 102
    .line 103
    if-ge v3, v9, :cond_5

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_5
    move-object v8, v2

    .line 107
    :goto_4
    if-eqz v8, :cond_6

    .line 108
    .line 109
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    goto :goto_5

    .line 114
    :cond_6
    const/16 v3, 0x12

    .line 115
    .line 116
    :goto_5
    int-to-float v3, v3

    .line 117
    iget-object v8, v0, LJ1/C0;->z:Lcom/google/android/material/slider/Slider;

    .line 118
    .line 119
    invoke-virtual {v8, v3}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    .line 120
    .line 121
    .line 122
    iget v3, v1, LI2/f;->a:I

    .line 123
    .line 124
    invoke-static {v3}, Landroid/graphics/Color;->alpha(I)I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    int-to-float v3, v3

    .line 129
    iget-object v9, v0, LJ1/C0;->y:Lcom/google/android/material/slider/Slider;

    .line 130
    .line 131
    invoke-virtual {v9, v3}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    .line 132
    .line 133
    .line 134
    sget-object v3, Lo2/n;->d:LH7/a;

    .line 135
    .line 136
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance v10, LB7/b;

    .line 140
    .line 141
    const/4 v11, 0x0

    .line 142
    invoke-direct {v10, v11, v3}, LB7/b;-><init>(ILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_7
    invoke-virtual {v10}, LB7/b;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_8

    .line 150
    .line 151
    invoke-virtual {v10}, LB7/b;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    move-object v11, v3

    .line 156
    check-cast v11, Lo2/n;

    .line 157
    .line 158
    iget v11, v11, Lo2/n;->a:I

    .line 159
    .line 160
    iget v12, v1, LI2/f;->b:I

    .line 161
    .line 162
    if-ne v11, v12, :cond_7

    .line 163
    .line 164
    move-object v2, v3

    .line 165
    :cond_8
    check-cast v2, Lo2/n;

    .line 166
    .line 167
    if-nez v2, :cond_9

    .line 168
    .line 169
    sget-object v2, Lo2/n;->b:Lo2/n;

    .line 170
    .line 171
    :cond_9
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    int-to-float v2, v2

    .line 176
    iget-object v3, v0, LJ1/C0;->x:Lcom/google/android/material/slider/Slider;

    .line 177
    .line 178
    invoke-virtual {v3, v2}, Lcom/google/android/material/slider/Slider;->setValue(F)V

    .line 179
    .line 180
    .line 181
    iget-object v2, v0, LJ1/C0;->D:Landroid/widget/TextView;

    .line 182
    .line 183
    invoke-static {v2}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    if-eqz v10, :cond_a

    .line 191
    .line 192
    check-cast v10, Landroid/widget/FrameLayout$LayoutParams;

    .line 193
    .line 194
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    const-string v12, "getContext(...)"

    .line 199
    .line 200
    invoke-static {v11, v12}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    iget v12, v1, LI2/f;->c:I

    .line 204
    .line 205
    int-to-float v12, v12

    .line 206
    const v13, 0x3f277a05

    .line 207
    .line 208
    .line 209
    mul-float/2addr v12, v13

    .line 210
    float-to-int v12, v12

    .line 211
    invoke-static {v11, v12}, LM4/a;->j(Landroid/content/Context;I)I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    iput v11, v10, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 216
    .line 217
    invoke-virtual {v2, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 218
    .line 219
    .line 220
    iget v10, v1, LI2/f;->a:I

    .line 221
    .line 222
    invoke-virtual {v2, v10}, Landroid/view/View;->setBackgroundColor(I)V

    .line 223
    .line 224
    .line 225
    iget v10, v1, LI2/f;->d:I

    .line 226
    .line 227
    int-to-float v10, v10

    .line 228
    mul-float/2addr v10, v13

    .line 229
    const/4 v11, 0x2

    .line 230
    invoke-virtual {v2, v11, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 231
    .line 232
    .line 233
    iget-object v10, v1, LI2/f;->e:LJ2/d;

    .line 234
    .line 235
    invoke-static {v10}, Lcom/anilab/android/ui/settings/SubtitleSettingsFragment;->s0(LJ2/d;)Landroid/graphics/Typeface;

    .line 236
    .line 237
    .line 238
    move-result-object v10

    .line 239
    invoke-virtual {v2, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 240
    .line 241
    .line 242
    iget v10, v1, LI2/f;->b:I

    .line 243
    .line 244
    invoke-virtual {v2, v10}, Landroid/widget/TextView;->setTextColor(I)V

    .line 245
    .line 246
    .line 247
    iget v1, v1, LI2/f;->i:F

    .line 248
    .line 249
    const/high16 v10, -0x1000000

    .line 250
    .line 251
    invoke-virtual {v2, v1, v6, v6, v10}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 252
    .line 253
    .line 254
    new-instance v1, Lo2/m;

    .line 255
    .line 256
    const/4 v2, 0x0

    .line 257
    invoke-direct {v1, p0, v2, v0}, Lo2/m;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v3, v1}, LH5/d;->a(Lo2/m;)V

    .line 261
    .line 262
    .line 263
    new-instance v1, Lo2/m;

    .line 264
    .line 265
    const/4 v2, 0x1

    .line 266
    invoke-direct {v1, p0, v2, v0}, Lo2/m;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v4, v1}, LH5/d;->a(Lo2/m;)V

    .line 270
    .line 271
    .line 272
    new-instance v1, Lo2/m;

    .line 273
    .line 274
    const/4 v2, 0x2

    .line 275
    invoke-direct {v1, p0, v2, v0}, Lo2/m;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v7, v1}, LH5/d;->a(Lo2/m;)V

    .line 279
    .line 280
    .line 281
    new-instance v1, Lo2/m;

    .line 282
    .line 283
    const/4 v2, 0x3

    .line 284
    invoke-direct {v1, p0, v2, v0}, Lo2/m;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v8, v1}, LH5/d;->a(Lo2/m;)V

    .line 288
    .line 289
    .line 290
    new-instance v1, Lo2/m;

    .line 291
    .line 292
    const/4 v2, 0x4

    .line 293
    invoke-direct {v1, p0, v2, v0}, Lo2/m;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v5, v1}, LH5/d;->a(Lo2/m;)V

    .line 297
    .line 298
    .line 299
    new-instance v1, Lo2/m;

    .line 300
    .line 301
    const/4 v2, 0x5

    .line 302
    invoke-direct {v1, p0, v2, v0}, Lo2/m;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v9, v1}, LH5/d;->a(Lo2/m;)V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :cond_a
    new-instance v0, Ljava/lang/NullPointerException;

    .line 310
    .line 311
    const-string v1, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    .line 312
    .line 313
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    throw v0
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
.end method

.method public final t0()Lo2/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/android/ui/settings/SubtitleSettingsFragment;->D0:LY2/r;

    .line 2
    .line 3
    invoke-virtual {v0}, LY2/r;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lo2/s;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method
