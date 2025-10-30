.class public Landroidx/appcompat/widget/LinearLayoutCompat;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:F

.field public h:Z

.field public i:[I

.field public j:[I

.field public k:Landroid/graphics/drawable/Drawable;

.field public l:I

.field public m:I

.field public n:I

.field public o:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    const/4 v5, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v5}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x1

    .line 3
    iput-boolean p3, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->a:Z

    const/4 v6, -0x1

    .line 4
    iput v6, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->b:I

    const/4 v7, 0x0

    .line 5
    iput v7, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->c:I

    const v0, 0x800033

    .line 6
    iput v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I

    .line 7
    sget-object v2, Lh/a;->n:[I

    invoke-static {p1, p2, v2, v5}, Lb5/G1;->w(Landroid/content/Context;Landroid/util/AttributeSet;[II)Lb5/G1;

    move-result-object v8

    .line 8
    iget-object v0, v8, Lb5/G1;->c:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroid/content/res/TypedArray;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    invoke-static/range {v0 .. v5}, LP/Q;->l(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 9
    iget-object p1, v8, Lb5/G1;->c:Ljava/lang/Object;

    check-cast p1, Landroid/content/res/TypedArray;

    invoke-virtual {p1, p3, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    if-ltz p2, :cond_0

    .line 10
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->setOrientation(I)V

    .line 11
    :cond_0
    invoke-virtual {p1, v7, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    if-ltz p2, :cond_1

    .line 12
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->setGravity(I)V

    :cond_1
    const/4 p2, 0x2

    .line 13
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    if-nez p2, :cond_2

    .line 14
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->setBaselineAligned(Z)V

    :cond_2
    const/4 p2, 0x4

    const/high16 p3, -0x40800000    # -1.0f

    .line 15
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p2

    .line 16
    iput p2, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->g:F

    const/4 p2, 0x3

    .line 17
    invoke-virtual {p1, p2, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    .line 18
    iput p2, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->b:I

    const/4 p2, 0x7

    .line 19
    invoke-virtual {p1, p2, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 20
    iput-boolean p2, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->h:Z

    const/4 p2, 0x5

    .line 21
    invoke-virtual {v8, p2}, Lb5/G1;->o(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/LinearLayoutCompat;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V

    const/16 p2, 0x8

    .line 22
    invoke-virtual {p1, p2, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    .line 23
    iput p2, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->n:I

    const/4 p2, 0x6

    .line 24
    invoke-virtual {p1, p2, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    .line 25
    iput p1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->o:I

    .line 26
    invoke-virtual {v8}, Lb5/G1;->y()V

    return-void
.end method


# virtual methods
.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Lp/s0;

    .line 2
    .line 3
    return p1
    .line 4
    .line 5
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final d(Landroid/graphics/Canvas;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->k:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->o:I

    .line 8
    .line 9
    add-int/2addr v1, v2

    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    sub-int/2addr v2, v3

    .line 19
    iget v3, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->o:I

    .line 20
    .line 21
    sub-int/2addr v2, v3

    .line 22
    iget v3, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I

    .line 23
    .line 24
    add-int/2addr v3, p2

    .line 25
    invoke-virtual {v0, v1, p2, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->k:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method

.method public final e(Landroid/graphics/Canvas;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->k:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget v2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->o:I

    .line 8
    .line 9
    add-int/2addr v1, v2

    .line 10
    iget v2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->l:I

    .line 11
    .line 12
    add-int/2addr v2, p2

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    sub-int/2addr v3, v4

    .line 22
    iget v4, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->o:I

    .line 23
    .line 24
    sub-int/2addr v3, v4

    .line 25
    invoke-virtual {v0, p2, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 26
    .line 27
    .line 28
    iget-object p2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->k:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
.end method

.method public f()Lp/s0;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->d:I

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lp/s0;

    .line 7
    .line 8
    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v2, 0x1

    .line 13
    if-ne v0, v2, :cond_1

    .line 14
    .line 15
    new-instance v0, Lp/s0;

    .line 16
    .line 17
    const/4 v2, -0x1

    .line 18
    invoke-direct {v0, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    return-object v0
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

.method public g(Landroid/util/AttributeSet;)Lp/s0;
    .locals 2

    .line 1
    new-instance v0, Lp/s0;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    .line 9
    .line 10
    return-object v0
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->f()Lp/s0;

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

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->g(Landroid/util/AttributeSet;)Lp/s0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/LinearLayoutCompat;->h(Landroid/view/ViewGroup$LayoutParams;)Lp/s0;

    move-result-object p1

    return-object p1
.end method

.method public getBaseline()I
    .locals 5

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->b:I

    .line 2
    .line 3
    if-gez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Landroid/view/ViewGroup;->getBaseline()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->b:I

    .line 15
    .line 16
    if-le v0, v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getBaseline()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, -0x1

    .line 27
    if-ne v1, v2, :cond_2

    .line 28
    .line 29
    iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->b:I

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    return v2

    .line 34
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 35
    .line 36
    const-string v1, "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline."

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_2
    iget v2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->c:I

    .line 43
    .line 44
    iget v3, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->d:I

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    if-ne v3, v4, :cond_5

    .line 48
    .line 49
    iget v3, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I

    .line 50
    .line 51
    and-int/lit8 v3, v3, 0x70

    .line 52
    .line 53
    const/16 v4, 0x30

    .line 54
    .line 55
    if-eq v3, v4, :cond_5

    .line 56
    .line 57
    const/16 v4, 0x10

    .line 58
    .line 59
    if-eq v3, v4, :cond_4

    .line 60
    .line 61
    const/16 v4, 0x50

    .line 62
    .line 63
    if-eq v3, v4, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    sub-int/2addr v2, v3

    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    sub-int/2addr v2, v3

    .line 80
    iget v3, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 81
    .line 82
    sub-int/2addr v2, v3

    .line 83
    goto :goto_0

    .line 84
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    sub-int/2addr v3, v4

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    sub-int/2addr v3, v4

    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    sub-int/2addr v3, v4

    .line 103
    iget v4, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 104
    .line 105
    sub-int/2addr v3, v4

    .line 106
    div-int/lit8 v3, v3, 0x2

    .line 107
    .line 108
    add-int/2addr v2, v3

    .line 109
    :cond_5
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, Lp/s0;

    .line 114
    .line 115
    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 116
    .line 117
    add-int/2addr v2, v0

    .line 118
    add-int/2addr v2, v1

    .line 119
    return v2

    .line 120
    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    .line 121
    .line 122
    const-string v1, "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."

    .line 123
    .line 124
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw v0
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
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

.method public getBaselineAlignedChildIndex()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->b:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
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

.method public getDividerDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->k:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
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

.method public getDividerPadding()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->o:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
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

.method public getDividerWidth()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->l:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
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

.method public getGravity()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
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

.method public getOrientation()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->d:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
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

.method public getShowDividers()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->n:I

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
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

.method public getVirtualChildCount()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
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

.method public getWeightSum()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->g:F

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
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

.method public h(Landroid/view/ViewGroup$LayoutParams;)Lp/s0;
    .locals 1

    .line 1
    instance-of v0, p1, Lp/s0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lp/s0;

    .line 6
    .line 7
    check-cast p1, Lp/s0;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Lp/s0;

    .line 18
    .line 19
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_1
    new-instance v0, Lp/s0;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 28
    .line 29
    .line 30
    return-object v0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final i(I)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->n:I

    .line 6
    .line 7
    and-int/2addr p1, v1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    return v0

    .line 12
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-ne p1, v2, :cond_3

    .line 17
    .line 18
    iget p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->n:I

    .line 19
    .line 20
    and-int/lit8 p1, p1, 0x4

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    return v1

    .line 25
    :cond_2
    return v0

    .line 26
    :cond_3
    iget v2, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->n:I

    .line 27
    .line 28
    and-int/lit8 v2, v2, 0x2

    .line 29
    .line 30
    if-eqz v2, :cond_5

    .line 31
    .line 32
    sub-int/2addr p1, v1

    .line 33
    :goto_0
    if-ltz p1, :cond_5

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/16 v3, 0x8

    .line 44
    .line 45
    if-eq v2, v3, :cond_4

    .line 46
    .line 47
    return v1

    .line 48
    :cond_4
    add-int/lit8 p1, p1, -0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    return v0
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

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->k:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    goto/16 :goto_6

    .line 7
    .line 8
    :cond_0
    iget v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->d:I

    .line 9
    .line 10
    const/16 v2, 0x8

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v1, v0, :cond_4

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->getVirtualChildCount()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_0
    if-ge v3, v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eq v5, v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/LinearLayoutCompat;->i(I)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Lp/s0;

    .line 44
    .line 45
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 50
    .line 51
    sub-int/2addr v4, v5

    .line 52
    iget v5, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I

    .line 53
    .line 54
    sub-int/2addr v4, v5

    .line 55
    invoke-virtual {p0, p1, v4}, Landroidx/appcompat/widget/LinearLayoutCompat;->d(Landroid/graphics/Canvas;I)V

    .line 56
    .line 57
    .line 58
    :cond_1
    add-int/2addr v3, v0

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/LinearLayoutCompat;->i(I)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_c

    .line 65
    .line 66
    sub-int/2addr v1, v0

    .line 67
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-nez v0, :cond_3

    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    sub-int/2addr v0, v1

    .line 82
    iget v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I

    .line 83
    .line 84
    sub-int/2addr v0, v1

    .line 85
    goto :goto_1

    .line 86
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Lp/s0;

    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 97
    .line 98
    add-int/2addr v0, v1

    .line 99
    :goto_1
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->d(Landroid/graphics/Canvas;I)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_4
    invoke-virtual {p0}, Landroidx/appcompat/widget/LinearLayoutCompat;->getVirtualChildCount()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    sget-boolean v4, Lp/g1;->a:Z

    .line 108
    .line 109
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-ne v4, v0, :cond_5

    .line 114
    .line 115
    move v4, v0

    .line 116
    goto :goto_2

    .line 117
    :cond_5
    move v4, v3

    .line 118
    :goto_2
    if-ge v3, v1, :cond_8

    .line 119
    .line 120
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    if-eqz v5, :cond_7

    .line 125
    .line 126
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-eq v6, v2, :cond_7

    .line 131
    .line 132
    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/LinearLayoutCompat;->i(I)Z

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-eqz v6, :cond_7

    .line 137
    .line 138
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    check-cast v6, Lp/s0;

    .line 143
    .line 144
    if-eqz v4, :cond_6

    .line 145
    .line 146
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    iget v6, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 151
    .line 152
    add-int/2addr v5, v6

    .line 153
    goto :goto_3

    .line 154
    :cond_6
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    iget v6, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 159
    .line 160
    sub-int/2addr v5, v6

    .line 161
    iget v6, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->l:I

    .line 162
    .line 163
    sub-int/2addr v5, v6

    .line 164
    :goto_3
    invoke-virtual {p0, p1, v5}, Landroidx/appcompat/widget/LinearLayoutCompat;->e(Landroid/graphics/Canvas;I)V

    .line 165
    .line 166
    .line 167
    :cond_7
    add-int/2addr v3, v0

    .line 168
    goto :goto_2

    .line 169
    :cond_8
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/LinearLayoutCompat;->i(I)Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_c

    .line 174
    .line 175
    sub-int/2addr v1, v0

    .line 176
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    if-nez v0, :cond_a

    .line 181
    .line 182
    if-eqz v4, :cond_9

    .line 183
    .line 184
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    goto :goto_5

    .line 189
    :cond_9
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    sub-int/2addr v0, v1

    .line 198
    iget v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->l:I

    .line 199
    .line 200
    :goto_4
    sub-int/2addr v0, v1

    .line 201
    goto :goto_5

    .line 202
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    check-cast v1, Lp/s0;

    .line 207
    .line 208
    if-eqz v4, :cond_b

    .line 209
    .line 210
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 215
    .line 216
    sub-int/2addr v0, v1

    .line 217
    iget v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->l:I

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 225
    .line 226
    add-int/2addr v0, v1

    .line 227
    :goto_5
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->e(Landroid/graphics/Canvas;I)V

    .line 228
    .line 229
    .line 230
    :cond_c
    :goto_6
    return-void
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

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public onLayout(ZIIII)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->d:I

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    const/16 v5, 0x50

    .line 9
    .line 10
    const/4 v6, 0x2

    .line 11
    const/16 v7, 0x10

    .line 12
    .line 13
    const v8, 0x800007

    .line 14
    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    if-ne v1, v9, :cond_8

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    sub-int v10, p4, p2

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 26
    .line 27
    .line 28
    move-result v11

    .line 29
    sub-int v11, v10, v11

    .line 30
    .line 31
    sub-int/2addr v10, v1

    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    sub-int/2addr v10, v12

    .line 37
    invoke-virtual {v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->getVirtualChildCount()I

    .line 38
    .line 39
    .line 40
    move-result v12

    .line 41
    iget v13, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I

    .line 42
    .line 43
    and-int/lit8 v14, v13, 0x70

    .line 44
    .line 45
    and-int/2addr v8, v13

    .line 46
    if-eq v14, v7, :cond_1

    .line 47
    .line 48
    if-eq v14, v5, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    add-int v5, v5, p5

    .line 60
    .line 61
    sub-int v5, v5, p3

    .line 62
    .line 63
    iget v7, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 64
    .line 65
    sub-int/2addr v5, v7

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    sub-int v7, p5, p3

    .line 72
    .line 73
    iget v13, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 74
    .line 75
    sub-int/2addr v7, v13

    .line 76
    div-int/2addr v7, v6

    .line 77
    add-int/2addr v5, v7

    .line 78
    :goto_0
    const/4 v4, 0x0

    .line 79
    :goto_1
    if-ge v4, v12, :cond_17

    .line 80
    .line 81
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    if-nez v7, :cond_3

    .line 86
    .line 87
    :cond_2
    move/from16 p1, v6

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_3
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 91
    .line 92
    .line 93
    move-result v13

    .line 94
    if-eq v13, v3, :cond_2

    .line 95
    .line 96
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 101
    .line 102
    .line 103
    move-result v14

    .line 104
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 105
    .line 106
    .line 107
    move-result-object v15

    .line 108
    check-cast v15, Lp/s0;

    .line 109
    .line 110
    move/from16 p1, v6

    .line 111
    .line 112
    iget v6, v15, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 113
    .line 114
    if-gez v6, :cond_4

    .line 115
    .line 116
    move v6, v8

    .line 117
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    invoke-static {v6, v3}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    and-int/lit8 v3, v3, 0x7

    .line 126
    .line 127
    if-eq v3, v9, :cond_6

    .line 128
    .line 129
    if-eq v3, v2, :cond_5

    .line 130
    .line 131
    iget v3, v15, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 132
    .line 133
    add-int/2addr v3, v1

    .line 134
    goto :goto_3

    .line 135
    :cond_5
    sub-int v3, v11, v13

    .line 136
    .line 137
    iget v6, v15, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 138
    .line 139
    :goto_2
    sub-int/2addr v3, v6

    .line 140
    goto :goto_3

    .line 141
    :cond_6
    sub-int v3, v10, v13

    .line 142
    .line 143
    div-int/lit8 v3, v3, 0x2

    .line 144
    .line 145
    add-int/2addr v3, v1

    .line 146
    iget v6, v15, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 147
    .line 148
    add-int/2addr v3, v6

    .line 149
    iget v6, v15, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :goto_3
    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/LinearLayoutCompat;->i(I)Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    if-eqz v6, :cond_7

    .line 157
    .line 158
    iget v6, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I

    .line 159
    .line 160
    add-int/2addr v5, v6

    .line 161
    :cond_7
    iget v6, v15, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 162
    .line 163
    add-int/2addr v5, v6

    .line 164
    add-int/2addr v13, v3

    .line 165
    add-int v6, v5, v14

    .line 166
    .line 167
    invoke-virtual {v7, v3, v5, v13, v6}, Landroid/view/View;->layout(IIII)V

    .line 168
    .line 169
    .line 170
    iget v3, v15, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 171
    .line 172
    add-int/2addr v14, v3

    .line 173
    add-int/2addr v14, v5

    .line 174
    move v5, v14

    .line 175
    :goto_4
    add-int/2addr v4, v9

    .line 176
    move/from16 v6, p1

    .line 177
    .line 178
    const/16 v3, 0x8

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_8
    move/from16 p1, v6

    .line 182
    .line 183
    sget-boolean v1, Lp/g1;->a:Z

    .line 184
    .line 185
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-ne v1, v9, :cond_9

    .line 190
    .line 191
    move v1, v9

    .line 192
    goto :goto_5

    .line 193
    :cond_9
    const/4 v1, 0x0

    .line 194
    :goto_5
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    sub-int v6, p5, p3

    .line 199
    .line 200
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 201
    .line 202
    .line 203
    move-result v10

    .line 204
    sub-int v10, v6, v10

    .line 205
    .line 206
    sub-int/2addr v6, v3

    .line 207
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 208
    .line 209
    .line 210
    move-result v11

    .line 211
    sub-int/2addr v6, v11

    .line 212
    invoke-virtual {v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->getVirtualChildCount()I

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    iget v12, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I

    .line 217
    .line 218
    and-int/2addr v8, v12

    .line 219
    and-int/lit8 v12, v12, 0x70

    .line 220
    .line 221
    iget-boolean v13, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->a:Z

    .line 222
    .line 223
    iget-object v14, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->i:[I

    .line 224
    .line 225
    iget-object v15, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->j:[I

    .line 226
    .line 227
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    invoke-static {v8, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-eq v4, v9, :cond_b

    .line 236
    .line 237
    if-eq v4, v2, :cond_a

    .line 238
    .line 239
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    goto :goto_6

    .line 244
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    add-int v2, v2, p4

    .line 249
    .line 250
    sub-int v2, v2, p2

    .line 251
    .line 252
    iget v4, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 253
    .line 254
    sub-int/2addr v2, v4

    .line 255
    goto :goto_6

    .line 256
    :cond_b
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    sub-int v4, p4, p2

    .line 261
    .line 262
    iget v8, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 263
    .line 264
    sub-int/2addr v4, v8

    .line 265
    div-int/lit8 v4, v4, 0x2

    .line 266
    .line 267
    add-int/2addr v2, v4

    .line 268
    :goto_6
    if-eqz v1, :cond_c

    .line 269
    .line 270
    add-int/lit8 v1, v11, -0x1

    .line 271
    .line 272
    const/4 v8, -0x1

    .line 273
    goto :goto_7

    .line 274
    :cond_c
    move v8, v9

    .line 275
    const/4 v1, 0x0

    .line 276
    :goto_7
    move/from16 v17, v9

    .line 277
    .line 278
    const/4 v9, 0x0

    .line 279
    :goto_8
    if-ge v9, v11, :cond_17

    .line 280
    .line 281
    mul-int v18, v8, v9

    .line 282
    .line 283
    add-int v5, v18, v1

    .line 284
    .line 285
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 286
    .line 287
    .line 288
    move-result-object v7

    .line 289
    if-nez v7, :cond_d

    .line 290
    .line 291
    move/from16 p3, v1

    .line 292
    .line 293
    :goto_9
    move/from16 v19, v3

    .line 294
    .line 295
    goto/16 :goto_e

    .line 296
    .line 297
    :cond_d
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    move/from16 p3, v1

    .line 302
    .line 303
    const/16 v1, 0x8

    .line 304
    .line 305
    if-eq v4, v1, :cond_16

    .line 306
    .line 307
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 312
    .line 313
    .line 314
    move-result v16

    .line 315
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 316
    .line 317
    .line 318
    move-result-object v19

    .line 319
    move-object/from16 v1, v19

    .line 320
    .line 321
    check-cast v1, Lp/s0;

    .line 322
    .line 323
    move/from16 p5, v2

    .line 324
    .line 325
    if-eqz v13, :cond_e

    .line 326
    .line 327
    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 328
    .line 329
    move/from16 v19, v3

    .line 330
    .line 331
    const/4 v3, -0x1

    .line 332
    if-eq v2, v3, :cond_f

    .line 333
    .line 334
    invoke-virtual {v7}, Landroid/view/View;->getBaseline()I

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    goto :goto_a

    .line 339
    :cond_e
    move/from16 v19, v3

    .line 340
    .line 341
    :cond_f
    const/4 v3, -0x1

    .line 342
    :goto_a
    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 343
    .line 344
    if-gez v2, :cond_10

    .line 345
    .line 346
    move v2, v12

    .line 347
    :cond_10
    and-int/lit8 v2, v2, 0x70

    .line 348
    .line 349
    move/from16 v20, v4

    .line 350
    .line 351
    const/16 v4, 0x10

    .line 352
    .line 353
    if-eq v2, v4, :cond_13

    .line 354
    .line 355
    const/16 v4, 0x30

    .line 356
    .line 357
    if-eq v2, v4, :cond_12

    .line 358
    .line 359
    const/16 v4, 0x50

    .line 360
    .line 361
    if-eq v2, v4, :cond_11

    .line 362
    .line 363
    move/from16 v2, v19

    .line 364
    .line 365
    const/4 v4, -0x1

    .line 366
    goto :goto_c

    .line 367
    :cond_11
    sub-int v2, v10, v16

    .line 368
    .line 369
    iget v4, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 370
    .line 371
    sub-int/2addr v2, v4

    .line 372
    const/4 v4, -0x1

    .line 373
    if-eq v3, v4, :cond_14

    .line 374
    .line 375
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredHeight()I

    .line 376
    .line 377
    .line 378
    move-result v21

    .line 379
    sub-int v21, v21, v3

    .line 380
    .line 381
    aget v3, v15, p1

    .line 382
    .line 383
    sub-int v3, v3, v21

    .line 384
    .line 385
    :goto_b
    sub-int/2addr v2, v3

    .line 386
    goto :goto_c

    .line 387
    :cond_12
    const/4 v4, -0x1

    .line 388
    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 389
    .line 390
    add-int v2, v19, v2

    .line 391
    .line 392
    if-eq v3, v4, :cond_14

    .line 393
    .line 394
    aget v21, v14, v17

    .line 395
    .line 396
    sub-int v21, v21, v3

    .line 397
    .line 398
    add-int v2, v21, v2

    .line 399
    .line 400
    goto :goto_c

    .line 401
    :cond_13
    const/4 v4, -0x1

    .line 402
    sub-int v2, v6, v16

    .line 403
    .line 404
    div-int/lit8 v2, v2, 0x2

    .line 405
    .line 406
    add-int v2, v2, v19

    .line 407
    .line 408
    iget v3, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 409
    .line 410
    add-int/2addr v2, v3

    .line 411
    iget v3, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 412
    .line 413
    goto :goto_b

    .line 414
    :cond_14
    :goto_c
    invoke-virtual {v0, v5}, Landroidx/appcompat/widget/LinearLayoutCompat;->i(I)Z

    .line 415
    .line 416
    .line 417
    move-result v3

    .line 418
    if-eqz v3, :cond_15

    .line 419
    .line 420
    iget v3, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->l:I

    .line 421
    .line 422
    add-int v3, p5, v3

    .line 423
    .line 424
    goto :goto_d

    .line 425
    :cond_15
    move/from16 v3, p5

    .line 426
    .line 427
    :goto_d
    iget v5, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 428
    .line 429
    add-int/2addr v3, v5

    .line 430
    add-int v5, v3, v20

    .line 431
    .line 432
    add-int v4, v2, v16

    .line 433
    .line 434
    invoke-virtual {v7, v3, v2, v5, v4}, Landroid/view/View;->layout(IIII)V

    .line 435
    .line 436
    .line 437
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 438
    .line 439
    add-int v4, v20, v1

    .line 440
    .line 441
    add-int/2addr v4, v3

    .line 442
    move v2, v4

    .line 443
    goto :goto_e

    .line 444
    :cond_16
    move/from16 p5, v2

    .line 445
    .line 446
    goto/16 :goto_9

    .line 447
    .line 448
    :goto_e
    add-int/lit8 v9, v9, 0x1

    .line 449
    .line 450
    move/from16 v1, p3

    .line 451
    .line 452
    move/from16 v3, v19

    .line 453
    .line 454
    const/16 v5, 0x50

    .line 455
    .line 456
    const/16 v7, 0x10

    .line 457
    .line 458
    goto/16 :goto_8

    .line 459
    .line 460
    :cond_17
    return-void
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
.end method

.method public onMeasure(II)V
    .locals 38

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->d:I

    .line 4
    .line 5
    const/4 v7, -0x2

    .line 6
    const/high16 v8, 0x40000000    # 2.0f

    .line 7
    .line 8
    const/16 v9, 0x8

    .line 9
    .line 10
    const/4 v13, 0x0

    .line 11
    const/4 v14, 0x1

    .line 12
    if-ne v1, v14, :cond_29

    .line 13
    .line 14
    iput v13, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->getVirtualChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v15

    .line 20
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    iget v3, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->b:I

    .line 29
    .line 30
    iget-boolean v4, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->h:Z

    .line 31
    .line 32
    move v5, v13

    .line 33
    move v6, v5

    .line 34
    move v12, v6

    .line 35
    move/from16 v19, v12

    .line 36
    .line 37
    move/from16 v22, v19

    .line 38
    .line 39
    move/from16 v23, v22

    .line 40
    .line 41
    move/from16 v20, v14

    .line 42
    .line 43
    move/from16 v24, v20

    .line 44
    .line 45
    const/16 v16, 0x0

    .line 46
    .line 47
    const v17, 0xffffff

    .line 48
    .line 49
    .line 50
    const/16 v18, 0x0

    .line 51
    .line 52
    move/from16 v14, v23

    .line 53
    .line 54
    :goto_0
    if-ge v5, v15, :cond_11

    .line 55
    .line 56
    move/from16 v25, v1

    .line 57
    .line 58
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-nez v1, :cond_0

    .line 63
    .line 64
    iget v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 65
    .line 66
    iput v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 67
    .line 68
    :goto_1
    move/from16 v29, v2

    .line 69
    .line 70
    move v7, v3

    .line 71
    move/from16 v28, v4

    .line 72
    .line 73
    move v11, v5

    .line 74
    move/from16 v10, v25

    .line 75
    .line 76
    move/from16 v2, p1

    .line 77
    .line 78
    move/from16 v4, p2

    .line 79
    .line 80
    goto/16 :goto_c

    .line 81
    .line 82
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-ne v10, v9, :cond_1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-virtual {v0, v5}, Landroidx/appcompat/widget/LinearLayoutCompat;->i(I)Z

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    if-eqz v10, :cond_2

    .line 94
    .line 95
    iget v10, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 96
    .line 97
    iget v9, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I

    .line 98
    .line 99
    add-int/2addr v10, v9

    .line 100
    iput v10, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 101
    .line 102
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    check-cast v9, Lp/s0;

    .line 107
    .line 108
    iget v10, v9, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 109
    .line 110
    add-float v16, v16, v10

    .line 111
    .line 112
    if-ne v2, v8, :cond_3

    .line 113
    .line 114
    iget v8, v9, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 115
    .line 116
    if-nez v8, :cond_3

    .line 117
    .line 118
    cmpl-float v8, v10, v18

    .line 119
    .line 120
    if-lez v8, :cond_3

    .line 121
    .line 122
    iget v8, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 123
    .line 124
    iget v10, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 125
    .line 126
    add-int/2addr v10, v8

    .line 127
    iget v11, v9, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 128
    .line 129
    add-int/2addr v10, v11

    .line 130
    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    iput v8, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 135
    .line 136
    move-object/from16 v30, v1

    .line 137
    .line 138
    move/from16 v29, v2

    .line 139
    .line 140
    move v7, v3

    .line 141
    move/from16 v28, v4

    .line 142
    .line 143
    move v11, v5

    .line 144
    move/from16 v19, v20

    .line 145
    .line 146
    move/from16 v10, v25

    .line 147
    .line 148
    move/from16 v2, p1

    .line 149
    .line 150
    move/from16 v4, p2

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_3
    iget v8, v9, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 154
    .line 155
    if-nez v8, :cond_4

    .line 156
    .line 157
    cmpl-float v8, v10, v18

    .line 158
    .line 159
    if-lez v8, :cond_4

    .line 160
    .line 161
    iput v7, v9, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 162
    .line 163
    const/4 v8, 0x0

    .line 164
    goto :goto_2

    .line 165
    :cond_4
    const/high16 v8, -0x80000000

    .line 166
    .line 167
    :goto_2
    cmpl-float v10, v16, v18

    .line 168
    .line 169
    if-nez v10, :cond_5

    .line 170
    .line 171
    iget v10, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 172
    .line 173
    move v11, v10

    .line 174
    move v10, v5

    .line 175
    move v5, v11

    .line 176
    :goto_3
    move v11, v3

    .line 177
    goto :goto_4

    .line 178
    :cond_5
    move v10, v5

    .line 179
    const/4 v5, 0x0

    .line 180
    goto :goto_3

    .line 181
    :goto_4
    const/4 v3, 0x0

    .line 182
    move/from16 v29, v2

    .line 183
    .line 184
    move/from16 v28, v4

    .line 185
    .line 186
    move v7, v11

    .line 187
    move/from16 v2, p1

    .line 188
    .line 189
    move/from16 v4, p2

    .line 190
    .line 191
    move v11, v10

    .line 192
    move/from16 v10, v25

    .line 193
    .line 194
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 195
    .line 196
    .line 197
    const/high16 v3, -0x80000000

    .line 198
    .line 199
    if-eq v8, v3, :cond_6

    .line 200
    .line 201
    iput v8, v9, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 202
    .line 203
    :cond_6
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    iget v5, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 208
    .line 209
    add-int v8, v5, v3

    .line 210
    .line 211
    move-object/from16 v30, v1

    .line 212
    .line 213
    iget v1, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 214
    .line 215
    add-int/2addr v8, v1

    .line 216
    iget v1, v9, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 217
    .line 218
    add-int/2addr v8, v1

    .line 219
    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    iput v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 224
    .line 225
    if-eqz v28, :cond_7

    .line 226
    .line 227
    invoke-static {v3, v14}, Ljava/lang/Math;->max(II)I

    .line 228
    .line 229
    .line 230
    move-result v14

    .line 231
    :cond_7
    :goto_5
    if-ltz v7, :cond_8

    .line 232
    .line 233
    add-int/lit8 v5, v11, 0x1

    .line 234
    .line 235
    if-ne v7, v5, :cond_8

    .line 236
    .line 237
    iget v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 238
    .line 239
    iput v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->c:I

    .line 240
    .line 241
    :cond_8
    if-ge v11, v7, :cond_9

    .line 242
    .line 243
    iget v1, v9, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 244
    .line 245
    cmpl-float v1, v1, v18

    .line 246
    .line 247
    if-gtz v1, :cond_a

    .line 248
    .line 249
    :cond_9
    const/high16 v1, 0x40000000    # 2.0f

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_a
    new-instance v1, Ljava/lang/RuntimeException;

    .line 253
    .line 254
    const-string v2, "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex."

    .line 255
    .line 256
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw v1

    .line 260
    :goto_6
    if-eq v10, v1, :cond_b

    .line 261
    .line 262
    iget v1, v9, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 263
    .line 264
    const/4 v3, -0x1

    .line 265
    if-ne v1, v3, :cond_b

    .line 266
    .line 267
    move/from16 v1, v20

    .line 268
    .line 269
    move/from16 v23, v1

    .line 270
    .line 271
    goto :goto_7

    .line 272
    :cond_b
    const/4 v1, 0x0

    .line 273
    :goto_7
    iget v3, v9, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 274
    .line 275
    iget v5, v9, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 276
    .line 277
    add-int/2addr v3, v5

    .line 278
    invoke-virtual/range {v30 .. v30}, Landroid/view/View;->getMeasuredWidth()I

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    add-int/2addr v5, v3

    .line 283
    invoke-static {v13, v5}, Ljava/lang/Math;->max(II)I

    .line 284
    .line 285
    .line 286
    move-result v8

    .line 287
    invoke-virtual/range {v30 .. v30}, Landroid/view/View;->getMeasuredState()I

    .line 288
    .line 289
    .line 290
    move-result v13

    .line 291
    move/from16 v30, v1

    .line 292
    .line 293
    move/from16 v1, v22

    .line 294
    .line 295
    invoke-static {v1, v13}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    if-eqz v24, :cond_c

    .line 300
    .line 301
    iget v13, v9, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 302
    .line 303
    move/from16 v22, v1

    .line 304
    .line 305
    const/4 v1, -0x1

    .line 306
    if-ne v13, v1, :cond_d

    .line 307
    .line 308
    move/from16 v1, v20

    .line 309
    .line 310
    goto :goto_8

    .line 311
    :cond_c
    move/from16 v22, v1

    .line 312
    .line 313
    :cond_d
    const/4 v1, 0x0

    .line 314
    :goto_8
    iget v9, v9, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 315
    .line 316
    cmpl-float v9, v9, v18

    .line 317
    .line 318
    if-lez v9, :cond_f

    .line 319
    .line 320
    if-eqz v30, :cond_e

    .line 321
    .line 322
    goto :goto_9

    .line 323
    :cond_e
    move v3, v5

    .line 324
    :goto_9
    invoke-static {v12, v3}, Ljava/lang/Math;->max(II)I

    .line 325
    .line 326
    .line 327
    move-result v12

    .line 328
    goto :goto_b

    .line 329
    :cond_f
    if-eqz v30, :cond_10

    .line 330
    .line 331
    goto :goto_a

    .line 332
    :cond_10
    move v3, v5

    .line 333
    :goto_a
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    :goto_b
    move/from16 v24, v1

    .line 338
    .line 339
    move v13, v8

    .line 340
    :goto_c
    add-int/lit8 v5, v11, 0x1

    .line 341
    .line 342
    move v3, v7

    .line 343
    move v1, v10

    .line 344
    move/from16 v4, v28

    .line 345
    .line 346
    move/from16 v2, v29

    .line 347
    .line 348
    const/4 v7, -0x2

    .line 349
    const/high16 v8, 0x40000000    # 2.0f

    .line 350
    .line 351
    const/16 v9, 0x8

    .line 352
    .line 353
    goto/16 :goto_0

    .line 354
    .line 355
    :cond_11
    move v10, v1

    .line 356
    move/from16 v29, v2

    .line 357
    .line 358
    move/from16 v28, v4

    .line 359
    .line 360
    move/from16 v1, v22

    .line 361
    .line 362
    move/from16 v2, p1

    .line 363
    .line 364
    move/from16 v4, p2

    .line 365
    .line 366
    iget v3, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 367
    .line 368
    if-lez v3, :cond_12

    .line 369
    .line 370
    invoke-virtual {v0, v15}, Landroidx/appcompat/widget/LinearLayoutCompat;->i(I)Z

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    if-eqz v3, :cond_12

    .line 375
    .line 376
    iget v3, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 377
    .line 378
    iget v5, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I

    .line 379
    .line 380
    add-int/2addr v3, v5

    .line 381
    iput v3, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 382
    .line 383
    :cond_12
    move/from16 v5, v29

    .line 384
    .line 385
    if-eqz v28, :cond_16

    .line 386
    .line 387
    const/high16 v3, -0x80000000

    .line 388
    .line 389
    if-eq v5, v3, :cond_13

    .line 390
    .line 391
    if-nez v5, :cond_16

    .line 392
    .line 393
    :cond_13
    const/4 v3, 0x0

    .line 394
    iput v3, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 395
    .line 396
    const/4 v3, 0x0

    .line 397
    :goto_d
    if-ge v3, v15, :cond_16

    .line 398
    .line 399
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 400
    .line 401
    .line 402
    move-result-object v7

    .line 403
    if-nez v7, :cond_14

    .line 404
    .line 405
    iget v7, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 406
    .line 407
    iput v7, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 408
    .line 409
    goto :goto_e

    .line 410
    :cond_14
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 411
    .line 412
    .line 413
    move-result v8

    .line 414
    const/16 v9, 0x8

    .line 415
    .line 416
    if-ne v8, v9, :cond_15

    .line 417
    .line 418
    goto :goto_e

    .line 419
    :cond_15
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 420
    .line 421
    .line 422
    move-result-object v7

    .line 423
    check-cast v7, Lp/s0;

    .line 424
    .line 425
    iget v8, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 426
    .line 427
    add-int v9, v8, v14

    .line 428
    .line 429
    iget v11, v7, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 430
    .line 431
    add-int/2addr v9, v11

    .line 432
    iget v7, v7, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 433
    .line 434
    add-int/2addr v9, v7

    .line 435
    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    .line 436
    .line 437
    .line 438
    move-result v7

    .line 439
    iput v7, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 440
    .line 441
    :goto_e
    add-int/lit8 v3, v3, 0x1

    .line 442
    .line 443
    goto :goto_d

    .line 444
    :cond_16
    iget v3, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 445
    .line 446
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 447
    .line 448
    .line 449
    move-result v7

    .line 450
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 451
    .line 452
    .line 453
    move-result v8

    .line 454
    add-int/2addr v8, v7

    .line 455
    add-int/2addr v8, v3

    .line 456
    iput v8, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 457
    .line 458
    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 459
    .line 460
    .line 461
    move-result v3

    .line 462
    invoke-static {v8, v3}, Ljava/lang/Math;->max(II)I

    .line 463
    .line 464
    .line 465
    move-result v3

    .line 466
    const/4 v7, 0x0

    .line 467
    invoke-static {v3, v4, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    and-int v7, v3, v17

    .line 472
    .line 473
    iget v8, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 474
    .line 475
    sub-int/2addr v7, v8

    .line 476
    if-nez v19, :cond_1a

    .line 477
    .line 478
    if-eqz v7, :cond_17

    .line 479
    .line 480
    cmpl-float v8, v16, v18

    .line 481
    .line 482
    if-lez v8, :cond_17

    .line 483
    .line 484
    goto :goto_11

    .line 485
    :cond_17
    invoke-static {v6, v12}, Ljava/lang/Math;->max(II)I

    .line 486
    .line 487
    .line 488
    move-result v6

    .line 489
    if-eqz v28, :cond_26

    .line 490
    .line 491
    const/high16 v7, 0x40000000    # 2.0f

    .line 492
    .line 493
    if-eq v5, v7, :cond_26

    .line 494
    .line 495
    const/4 v5, 0x0

    .line 496
    :goto_f
    if-ge v5, v15, :cond_26

    .line 497
    .line 498
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 499
    .line 500
    .line 501
    move-result-object v7

    .line 502
    if-eqz v7, :cond_19

    .line 503
    .line 504
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 505
    .line 506
    .line 507
    move-result v8

    .line 508
    const/16 v9, 0x8

    .line 509
    .line 510
    if-ne v8, v9, :cond_18

    .line 511
    .line 512
    goto :goto_10

    .line 513
    :cond_18
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 514
    .line 515
    .line 516
    move-result-object v8

    .line 517
    check-cast v8, Lp/s0;

    .line 518
    .line 519
    iget v8, v8, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 520
    .line 521
    cmpl-float v8, v8, v18

    .line 522
    .line 523
    if-lez v8, :cond_19

    .line 524
    .line 525
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 526
    .line 527
    .line 528
    move-result v8

    .line 529
    const/high16 v9, 0x40000000    # 2.0f

    .line 530
    .line 531
    invoke-static {v8, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 532
    .line 533
    .line 534
    move-result v8

    .line 535
    invoke-static {v14, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 536
    .line 537
    .line 538
    move-result v11

    .line 539
    invoke-virtual {v7, v8, v11}, Landroid/view/View;->measure(II)V

    .line 540
    .line 541
    .line 542
    :cond_19
    :goto_10
    add-int/lit8 v5, v5, 0x1

    .line 543
    .line 544
    goto :goto_f

    .line 545
    :cond_1a
    :goto_11
    iget v8, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->g:F

    .line 546
    .line 547
    cmpl-float v9, v8, v18

    .line 548
    .line 549
    if-lez v9, :cond_1b

    .line 550
    .line 551
    move/from16 v16, v8

    .line 552
    .line 553
    :cond_1b
    const/4 v8, 0x0

    .line 554
    iput v8, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 555
    .line 556
    move v8, v1

    .line 557
    const/4 v1, 0x0

    .line 558
    :goto_12
    if-ge v1, v15, :cond_25

    .line 559
    .line 560
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 561
    .line 562
    .line 563
    move-result-object v9

    .line 564
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    .line 565
    .line 566
    .line 567
    move-result v11

    .line 568
    const/16 v12, 0x8

    .line 569
    .line 570
    if-ne v11, v12, :cond_1c

    .line 571
    .line 572
    move/from16 v17, v1

    .line 573
    .line 574
    goto/16 :goto_19

    .line 575
    .line 576
    :cond_1c
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 577
    .line 578
    .line 579
    move-result-object v11

    .line 580
    check-cast v11, Lp/s0;

    .line 581
    .line 582
    iget v12, v11, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 583
    .line 584
    cmpl-float v14, v12, v18

    .line 585
    .line 586
    if-lez v14, :cond_21

    .line 587
    .line 588
    int-to-float v14, v7

    .line 589
    mul-float/2addr v14, v12

    .line 590
    div-float v14, v14, v16

    .line 591
    .line 592
    float-to-int v14, v14

    .line 593
    sub-float v16, v16, v12

    .line 594
    .line 595
    sub-int/2addr v7, v14

    .line 596
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 597
    .line 598
    .line 599
    move-result v12

    .line 600
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 601
    .line 602
    .line 603
    move-result v17

    .line 604
    add-int v17, v17, v12

    .line 605
    .line 606
    iget v12, v11, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 607
    .line 608
    add-int v17, v17, v12

    .line 609
    .line 610
    iget v12, v11, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 611
    .line 612
    add-int v12, v17, v12

    .line 613
    .line 614
    move/from16 v17, v1

    .line 615
    .line 616
    iget v1, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 617
    .line 618
    invoke-static {v2, v12, v1}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 619
    .line 620
    .line 621
    move-result v1

    .line 622
    iget v12, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 623
    .line 624
    if-nez v12, :cond_1f

    .line 625
    .line 626
    const/high16 v12, 0x40000000    # 2.0f

    .line 627
    .line 628
    if-eq v5, v12, :cond_1d

    .line 629
    .line 630
    goto :goto_14

    .line 631
    :cond_1d
    if-lez v14, :cond_1e

    .line 632
    .line 633
    goto :goto_13

    .line 634
    :cond_1e
    const/4 v14, 0x0

    .line 635
    :goto_13
    invoke-static {v14, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 636
    .line 637
    .line 638
    move-result v14

    .line 639
    invoke-virtual {v9, v1, v14}, Landroid/view/View;->measure(II)V

    .line 640
    .line 641
    .line 642
    goto :goto_15

    .line 643
    :cond_1f
    const/high16 v12, 0x40000000    # 2.0f

    .line 644
    .line 645
    :goto_14
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    .line 646
    .line 647
    .line 648
    move-result v19

    .line 649
    add-int v14, v19, v14

    .line 650
    .line 651
    if-gez v14, :cond_20

    .line 652
    .line 653
    const/4 v14, 0x0

    .line 654
    :cond_20
    invoke-static {v14, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 655
    .line 656
    .line 657
    move-result v14

    .line 658
    invoke-virtual {v9, v1, v14}, Landroid/view/View;->measure(II)V

    .line 659
    .line 660
    .line 661
    :goto_15
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredState()I

    .line 662
    .line 663
    .line 664
    move-result v1

    .line 665
    and-int/lit16 v1, v1, -0x100

    .line 666
    .line 667
    invoke-static {v8, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 668
    .line 669
    .line 670
    move-result v8

    .line 671
    goto :goto_16

    .line 672
    :cond_21
    move/from16 v17, v1

    .line 673
    .line 674
    :goto_16
    iget v1, v11, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 675
    .line 676
    iget v12, v11, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 677
    .line 678
    add-int/2addr v1, v12

    .line 679
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    .line 680
    .line 681
    .line 682
    move-result v12

    .line 683
    add-int/2addr v12, v1

    .line 684
    invoke-static {v13, v12}, Ljava/lang/Math;->max(II)I

    .line 685
    .line 686
    .line 687
    move-result v13

    .line 688
    const/high16 v14, 0x40000000    # 2.0f

    .line 689
    .line 690
    if-eq v10, v14, :cond_22

    .line 691
    .line 692
    iget v14, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 693
    .line 694
    move/from16 v19, v1

    .line 695
    .line 696
    const/4 v1, -0x1

    .line 697
    if-ne v14, v1, :cond_23

    .line 698
    .line 699
    move/from16 v12, v19

    .line 700
    .line 701
    goto :goto_17

    .line 702
    :cond_22
    const/4 v1, -0x1

    .line 703
    :cond_23
    :goto_17
    invoke-static {v6, v12}, Ljava/lang/Math;->max(II)I

    .line 704
    .line 705
    .line 706
    move-result v6

    .line 707
    if-eqz v24, :cond_24

    .line 708
    .line 709
    iget v12, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 710
    .line 711
    if-ne v12, v1, :cond_24

    .line 712
    .line 713
    move/from16 v1, v20

    .line 714
    .line 715
    goto :goto_18

    .line 716
    :cond_24
    const/4 v1, 0x0

    .line 717
    :goto_18
    iget v12, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 718
    .line 719
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    .line 720
    .line 721
    .line 722
    move-result v9

    .line 723
    add-int/2addr v9, v12

    .line 724
    iget v14, v11, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 725
    .line 726
    add-int/2addr v9, v14

    .line 727
    iget v11, v11, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 728
    .line 729
    add-int/2addr v9, v11

    .line 730
    invoke-static {v12, v9}, Ljava/lang/Math;->max(II)I

    .line 731
    .line 732
    .line 733
    move-result v9

    .line 734
    iput v9, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 735
    .line 736
    move/from16 v24, v1

    .line 737
    .line 738
    :goto_19
    add-int/lit8 v1, v17, 0x1

    .line 739
    .line 740
    goto/16 :goto_12

    .line 741
    .line 742
    :cond_25
    iget v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 743
    .line 744
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 745
    .line 746
    .line 747
    move-result v5

    .line 748
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 749
    .line 750
    .line 751
    move-result v7

    .line 752
    add-int/2addr v7, v5

    .line 753
    add-int/2addr v7, v1

    .line 754
    iput v7, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 755
    .line 756
    move v1, v8

    .line 757
    :cond_26
    if-nez v24, :cond_27

    .line 758
    .line 759
    const/high16 v14, 0x40000000    # 2.0f

    .line 760
    .line 761
    if-eq v10, v14, :cond_27

    .line 762
    .line 763
    goto :goto_1a

    .line 764
    :cond_27
    move v6, v13

    .line 765
    :goto_1a
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 766
    .line 767
    .line 768
    move-result v5

    .line 769
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 770
    .line 771
    .line 772
    move-result v7

    .line 773
    add-int/2addr v7, v5

    .line 774
    add-int/2addr v7, v6

    .line 775
    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 776
    .line 777
    .line 778
    move-result v5

    .line 779
    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    .line 780
    .line 781
    .line 782
    move-result v5

    .line 783
    invoke-static {v5, v2, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 784
    .line 785
    .line 786
    move-result v1

    .line 787
    invoke-virtual {v0, v1, v3}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 788
    .line 789
    .line 790
    if-eqz v23, :cond_63

    .line 791
    .line 792
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 793
    .line 794
    .line 795
    move-result v1

    .line 796
    const/high16 v14, 0x40000000    # 2.0f

    .line 797
    .line 798
    invoke-static {v1, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 799
    .line 800
    .line 801
    move-result v2

    .line 802
    const/4 v13, 0x0

    .line 803
    :goto_1b
    if-ge v13, v15, :cond_63

    .line 804
    .line 805
    invoke-virtual {v0, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 806
    .line 807
    .line 808
    move-result-object v1

    .line 809
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 810
    .line 811
    .line 812
    move-result v3

    .line 813
    const/16 v9, 0x8

    .line 814
    .line 815
    if-eq v3, v9, :cond_28

    .line 816
    .line 817
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 818
    .line 819
    .line 820
    move-result-object v3

    .line 821
    move-object v6, v3

    .line 822
    check-cast v6, Lp/s0;

    .line 823
    .line 824
    iget v3, v6, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 825
    .line 826
    const/4 v5, -0x1

    .line 827
    if-ne v3, v5, :cond_28

    .line 828
    .line 829
    iget v7, v6, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 830
    .line 831
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 832
    .line 833
    .line 834
    move-result v3

    .line 835
    iput v3, v6, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 836
    .line 837
    const/4 v3, 0x0

    .line 838
    const/4 v5, 0x0

    .line 839
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 840
    .line 841
    .line 842
    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 843
    .line 844
    :cond_28
    add-int/lit8 v13, v13, 0x1

    .line 845
    .line 846
    move/from16 v4, p2

    .line 847
    .line 848
    goto :goto_1b

    .line 849
    :cond_29
    move/from16 v2, p1

    .line 850
    .line 851
    move v3, v13

    .line 852
    move/from16 v20, v14

    .line 853
    .line 854
    const v17, 0xffffff

    .line 855
    .line 856
    .line 857
    const/16 v18, 0x0

    .line 858
    .line 859
    iput v3, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 860
    .line 861
    invoke-virtual {v0}, Landroidx/appcompat/widget/LinearLayoutCompat;->getVirtualChildCount()I

    .line 862
    .line 863
    .line 864
    move-result v6

    .line 865
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 866
    .line 867
    .line 868
    move-result v7

    .line 869
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 870
    .line 871
    .line 872
    move-result v8

    .line 873
    iget-object v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->i:[I

    .line 874
    .line 875
    const/4 v9, 0x4

    .line 876
    if-eqz v1, :cond_2a

    .line 877
    .line 878
    iget-object v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->j:[I

    .line 879
    .line 880
    if-nez v1, :cond_2b

    .line 881
    .line 882
    :cond_2a
    new-array v1, v9, [I

    .line 883
    .line 884
    iput-object v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->i:[I

    .line 885
    .line 886
    new-array v1, v9, [I

    .line 887
    .line 888
    iput-object v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->j:[I

    .line 889
    .line 890
    :cond_2b
    iget-object v10, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->i:[I

    .line 891
    .line 892
    iget-object v11, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->j:[I

    .line 893
    .line 894
    const/4 v12, 0x3

    .line 895
    const/16 v26, -0x1

    .line 896
    .line 897
    aput v26, v10, v12

    .line 898
    .line 899
    const/4 v13, 0x2

    .line 900
    aput v26, v10, v13

    .line 901
    .line 902
    aput v26, v10, v20

    .line 903
    .line 904
    const/16 v21, 0x0

    .line 905
    .line 906
    aput v26, v10, v21

    .line 907
    .line 908
    aput v26, v11, v12

    .line 909
    .line 910
    aput v26, v11, v13

    .line 911
    .line 912
    aput v26, v11, v20

    .line 913
    .line 914
    aput v26, v11, v21

    .line 915
    .line 916
    iget-boolean v14, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->a:Z

    .line 917
    .line 918
    iget-boolean v15, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->h:Z

    .line 919
    .line 920
    const/high16 v1, 0x40000000    # 2.0f

    .line 921
    .line 922
    if-ne v7, v1, :cond_2c

    .line 923
    .line 924
    move/from16 v16, v20

    .line 925
    .line 926
    goto :goto_1c

    .line 927
    :cond_2c
    const/16 v16, 0x0

    .line 928
    .line 929
    :goto_1c
    move/from16 v23, v9

    .line 930
    .line 931
    move/from16 v24, v12

    .line 932
    .line 933
    move/from16 v28, v18

    .line 934
    .line 935
    move/from16 v29, v20

    .line 936
    .line 937
    const/4 v1, 0x0

    .line 938
    const/4 v3, 0x0

    .line 939
    const/4 v4, 0x0

    .line 940
    const/4 v5, 0x0

    .line 941
    const/4 v9, 0x0

    .line 942
    const/4 v12, 0x0

    .line 943
    const/16 v19, 0x0

    .line 944
    .line 945
    const/16 v22, 0x0

    .line 946
    .line 947
    :goto_1d
    if-ge v1, v6, :cond_40

    .line 948
    .line 949
    move/from16 v30, v13

    .line 950
    .line 951
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 952
    .line 953
    .line 954
    move-result-object v13

    .line 955
    if-nez v13, :cond_2d

    .line 956
    .line 957
    iget v13, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 958
    .line 959
    iput v13, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 960
    .line 961
    move/from16 v33, v1

    .line 962
    .line 963
    move v1, v4

    .line 964
    move-object/from16 v31, v10

    .line 965
    .line 966
    move-object/from16 v32, v11

    .line 967
    .line 968
    move/from16 v34, v14

    .line 969
    .line 970
    move/from16 v35, v15

    .line 971
    .line 972
    move/from16 v4, p2

    .line 973
    .line 974
    goto/16 :goto_2b

    .line 975
    .line 976
    :cond_2d
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    .line 977
    .line 978
    .line 979
    move-result v2

    .line 980
    move/from16 v31, v3

    .line 981
    .line 982
    const/16 v3, 0x8

    .line 983
    .line 984
    if-ne v2, v3, :cond_2e

    .line 985
    .line 986
    move/from16 v2, p1

    .line 987
    .line 988
    move/from16 v33, v1

    .line 989
    .line 990
    move v1, v4

    .line 991
    move-object/from16 v32, v11

    .line 992
    .line 993
    move/from16 v34, v14

    .line 994
    .line 995
    move/from16 v35, v15

    .line 996
    .line 997
    move/from16 v3, v31

    .line 998
    .line 999
    move/from16 v4, p2

    .line 1000
    .line 1001
    move-object/from16 v31, v10

    .line 1002
    .line 1003
    goto/16 :goto_2b

    .line 1004
    .line 1005
    :cond_2e
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/LinearLayoutCompat;->i(I)Z

    .line 1006
    .line 1007
    .line 1008
    move-result v2

    .line 1009
    if-eqz v2, :cond_2f

    .line 1010
    .line 1011
    iget v2, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1012
    .line 1013
    iget v3, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->l:I

    .line 1014
    .line 1015
    add-int/2addr v2, v3

    .line 1016
    iput v2, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1017
    .line 1018
    :cond_2f
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v2

    .line 1022
    check-cast v2, Lp/s0;

    .line 1023
    .line 1024
    iget v3, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 1025
    .line 1026
    add-float v28, v28, v3

    .line 1027
    .line 1028
    move/from16 v32, v1

    .line 1029
    .line 1030
    const/high16 v1, 0x40000000    # 2.0f

    .line 1031
    .line 1032
    if-ne v7, v1, :cond_32

    .line 1033
    .line 1034
    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1035
    .line 1036
    if-nez v1, :cond_32

    .line 1037
    .line 1038
    cmpl-float v1, v3, v18

    .line 1039
    .line 1040
    if-lez v1, :cond_32

    .line 1041
    .line 1042
    if-eqz v16, :cond_30

    .line 1043
    .line 1044
    iget v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1045
    .line 1046
    iget v3, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1047
    .line 1048
    move/from16 v33, v1

    .line 1049
    .line 1050
    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1051
    .line 1052
    add-int/2addr v3, v1

    .line 1053
    add-int v3, v3, v33

    .line 1054
    .line 1055
    iput v3, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1056
    .line 1057
    goto :goto_1e

    .line 1058
    :cond_30
    iget v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1059
    .line 1060
    iget v3, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1061
    .line 1062
    add-int/2addr v3, v1

    .line 1063
    move/from16 v33, v3

    .line 1064
    .line 1065
    iget v3, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1066
    .line 1067
    add-int v3, v33, v3

    .line 1068
    .line 1069
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 1070
    .line 1071
    .line 1072
    move-result v1

    .line 1073
    iput v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1074
    .line 1075
    :goto_1e
    if-eqz v14, :cond_31

    .line 1076
    .line 1077
    const/4 v3, 0x0

    .line 1078
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1079
    .line 1080
    .line 1081
    move-result v1

    .line 1082
    invoke-virtual {v13, v1, v1}, Landroid/view/View;->measure(II)V

    .line 1083
    .line 1084
    .line 1085
    move-object/from16 v36, v13

    .line 1086
    .line 1087
    move/from16 v34, v14

    .line 1088
    .line 1089
    move/from16 v35, v15

    .line 1090
    .line 1091
    move/from16 v13, v31

    .line 1092
    .line 1093
    move/from16 v33, v32

    .line 1094
    .line 1095
    move-object v14, v2

    .line 1096
    move-object/from16 v31, v10

    .line 1097
    .line 1098
    move-object/from16 v32, v11

    .line 1099
    .line 1100
    move/from16 v2, p1

    .line 1101
    .line 1102
    move v10, v4

    .line 1103
    move v11, v5

    .line 1104
    move/from16 v4, p2

    .line 1105
    .line 1106
    goto/16 :goto_23

    .line 1107
    .line 1108
    :cond_31
    move-object/from16 v36, v13

    .line 1109
    .line 1110
    move/from16 v34, v14

    .line 1111
    .line 1112
    move/from16 v35, v15

    .line 1113
    .line 1114
    move/from16 v22, v20

    .line 1115
    .line 1116
    move/from16 v13, v31

    .line 1117
    .line 1118
    move/from16 v33, v32

    .line 1119
    .line 1120
    const/high16 v1, 0x40000000    # 2.0f

    .line 1121
    .line 1122
    move-object v14, v2

    .line 1123
    move-object/from16 v31, v10

    .line 1124
    .line 1125
    move-object/from16 v32, v11

    .line 1126
    .line 1127
    move/from16 v2, p1

    .line 1128
    .line 1129
    move v10, v4

    .line 1130
    move v11, v5

    .line 1131
    move/from16 v4, p2

    .line 1132
    .line 1133
    goto/16 :goto_24

    .line 1134
    .line 1135
    :cond_32
    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1136
    .line 1137
    if-nez v1, :cond_33

    .line 1138
    .line 1139
    cmpl-float v1, v3, v18

    .line 1140
    .line 1141
    if-lez v1, :cond_33

    .line 1142
    .line 1143
    const/4 v1, -0x2

    .line 1144
    iput v1, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1145
    .line 1146
    const/4 v1, 0x0

    .line 1147
    goto :goto_1f

    .line 1148
    :cond_33
    const/high16 v1, -0x80000000

    .line 1149
    .line 1150
    :goto_1f
    cmpl-float v3, v28, v18

    .line 1151
    .line 1152
    if-nez v3, :cond_34

    .line 1153
    .line 1154
    iget v3, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1155
    .line 1156
    :goto_20
    move/from16 v33, v5

    .line 1157
    .line 1158
    goto :goto_21

    .line 1159
    :cond_34
    const/4 v3, 0x0

    .line 1160
    goto :goto_20

    .line 1161
    :goto_21
    const/4 v5, 0x0

    .line 1162
    move/from16 v34, v32

    .line 1163
    .line 1164
    move-object/from16 v32, v11

    .line 1165
    .line 1166
    move/from16 v11, v33

    .line 1167
    .line 1168
    move/from16 v33, v34

    .line 1169
    .line 1170
    move/from16 v34, v14

    .line 1171
    .line 1172
    move/from16 v35, v15

    .line 1173
    .line 1174
    move v15, v1

    .line 1175
    move-object v14, v2

    .line 1176
    move-object v1, v13

    .line 1177
    move/from16 v13, v31

    .line 1178
    .line 1179
    move/from16 v2, p1

    .line 1180
    .line 1181
    move-object/from16 v31, v10

    .line 1182
    .line 1183
    move v10, v4

    .line 1184
    move/from16 v4, p2

    .line 1185
    .line 1186
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 1187
    .line 1188
    .line 1189
    const/high16 v3, -0x80000000

    .line 1190
    .line 1191
    if-eq v15, v3, :cond_35

    .line 1192
    .line 1193
    iput v15, v14, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1194
    .line 1195
    :cond_35
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 1196
    .line 1197
    .line 1198
    move-result v3

    .line 1199
    if-eqz v16, :cond_36

    .line 1200
    .line 1201
    iget v5, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1202
    .line 1203
    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1204
    .line 1205
    add-int/2addr v15, v3

    .line 1206
    move-object/from16 v36, v1

    .line 1207
    .line 1208
    iget v1, v14, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1209
    .line 1210
    add-int/2addr v15, v1

    .line 1211
    add-int/2addr v15, v5

    .line 1212
    iput v15, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1213
    .line 1214
    goto :goto_22

    .line 1215
    :cond_36
    move-object/from16 v36, v1

    .line 1216
    .line 1217
    iget v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1218
    .line 1219
    add-int v5, v1, v3

    .line 1220
    .line 1221
    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1222
    .line 1223
    add-int/2addr v5, v15

    .line 1224
    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1225
    .line 1226
    add-int/2addr v5, v15

    .line 1227
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 1228
    .line 1229
    .line 1230
    move-result v1

    .line 1231
    iput v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1232
    .line 1233
    :goto_22
    if-eqz v35, :cond_37

    .line 1234
    .line 1235
    invoke-static {v3, v9}, Ljava/lang/Math;->max(II)I

    .line 1236
    .line 1237
    .line 1238
    move-result v9

    .line 1239
    :cond_37
    :goto_23
    const/high16 v1, 0x40000000    # 2.0f

    .line 1240
    .line 1241
    :goto_24
    if-eq v8, v1, :cond_38

    .line 1242
    .line 1243
    iget v1, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 1244
    .line 1245
    const/4 v3, -0x1

    .line 1246
    if-ne v1, v3, :cond_38

    .line 1247
    .line 1248
    move/from16 v1, v20

    .line 1249
    .line 1250
    move/from16 v19, v1

    .line 1251
    .line 1252
    goto :goto_25

    .line 1253
    :cond_38
    const/4 v1, 0x0

    .line 1254
    :goto_25
    iget v3, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1255
    .line 1256
    iget v5, v14, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1257
    .line 1258
    add-int/2addr v3, v5

    .line 1259
    invoke-virtual/range {v36 .. v36}, Landroid/view/View;->getMeasuredHeight()I

    .line 1260
    .line 1261
    .line 1262
    move-result v5

    .line 1263
    add-int/2addr v5, v3

    .line 1264
    invoke-virtual/range {v36 .. v36}, Landroid/view/View;->getMeasuredState()I

    .line 1265
    .line 1266
    .line 1267
    move-result v15

    .line 1268
    invoke-static {v12, v15}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 1269
    .line 1270
    .line 1271
    move-result v12

    .line 1272
    if-eqz v34, :cond_3a

    .line 1273
    .line 1274
    invoke-virtual/range {v36 .. v36}, Landroid/view/View;->getBaseline()I

    .line 1275
    .line 1276
    .line 1277
    move-result v15

    .line 1278
    move/from16 v36, v1

    .line 1279
    .line 1280
    const/4 v1, -0x1

    .line 1281
    if-eq v15, v1, :cond_3b

    .line 1282
    .line 1283
    iget v1, v14, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1284
    .line 1285
    if-gez v1, :cond_39

    .line 1286
    .line 1287
    iget v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I

    .line 1288
    .line 1289
    :cond_39
    and-int/lit8 v1, v1, 0x70

    .line 1290
    .line 1291
    shr-int/lit8 v1, v1, 0x4

    .line 1292
    .line 1293
    const/16 v25, -0x2

    .line 1294
    .line 1295
    and-int/lit8 v1, v1, -0x2

    .line 1296
    .line 1297
    shr-int/lit8 v1, v1, 0x1

    .line 1298
    .line 1299
    move/from16 v37, v1

    .line 1300
    .line 1301
    aget v1, v31, v37

    .line 1302
    .line 1303
    invoke-static {v1, v15}, Ljava/lang/Math;->max(II)I

    .line 1304
    .line 1305
    .line 1306
    move-result v1

    .line 1307
    aput v1, v31, v37

    .line 1308
    .line 1309
    aget v1, v32, v37

    .line 1310
    .line 1311
    sub-int v15, v5, v15

    .line 1312
    .line 1313
    invoke-static {v1, v15}, Ljava/lang/Math;->max(II)I

    .line 1314
    .line 1315
    .line 1316
    move-result v1

    .line 1317
    aput v1, v32, v37

    .line 1318
    .line 1319
    goto :goto_26

    .line 1320
    :cond_3a
    move/from16 v36, v1

    .line 1321
    .line 1322
    :cond_3b
    :goto_26
    invoke-static {v13, v5}, Ljava/lang/Math;->max(II)I

    .line 1323
    .line 1324
    .line 1325
    move-result v1

    .line 1326
    if-eqz v29, :cond_3c

    .line 1327
    .line 1328
    iget v13, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 1329
    .line 1330
    const/4 v15, -0x1

    .line 1331
    if-ne v13, v15, :cond_3c

    .line 1332
    .line 1333
    move/from16 v13, v20

    .line 1334
    .line 1335
    goto :goto_27

    .line 1336
    :cond_3c
    const/4 v13, 0x0

    .line 1337
    :goto_27
    iget v14, v14, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 1338
    .line 1339
    cmpl-float v14, v14, v18

    .line 1340
    .line 1341
    if-lez v14, :cond_3e

    .line 1342
    .line 1343
    if-eqz v36, :cond_3d

    .line 1344
    .line 1345
    goto :goto_28

    .line 1346
    :cond_3d
    move v3, v5

    .line 1347
    :goto_28
    invoke-static {v11, v3}, Ljava/lang/Math;->max(II)I

    .line 1348
    .line 1349
    .line 1350
    move-result v5

    .line 1351
    move v3, v10

    .line 1352
    goto :goto_2a

    .line 1353
    :cond_3e
    if-eqz v36, :cond_3f

    .line 1354
    .line 1355
    goto :goto_29

    .line 1356
    :cond_3f
    move v3, v5

    .line 1357
    :goto_29
    invoke-static {v10, v3}, Ljava/lang/Math;->max(II)I

    .line 1358
    .line 1359
    .line 1360
    move-result v3

    .line 1361
    move v5, v11

    .line 1362
    :goto_2a
    move/from16 v29, v3

    .line 1363
    .line 1364
    move v3, v1

    .line 1365
    move/from16 v1, v29

    .line 1366
    .line 1367
    move/from16 v29, v13

    .line 1368
    .line 1369
    :goto_2b
    add-int/lit8 v10, v33, 0x1

    .line 1370
    .line 1371
    move v4, v1

    .line 1372
    move v1, v10

    .line 1373
    move/from16 v13, v30

    .line 1374
    .line 1375
    move-object/from16 v10, v31

    .line 1376
    .line 1377
    move-object/from16 v11, v32

    .line 1378
    .line 1379
    move/from16 v14, v34

    .line 1380
    .line 1381
    move/from16 v15, v35

    .line 1382
    .line 1383
    goto/16 :goto_1d

    .line 1384
    .line 1385
    :cond_40
    move-object/from16 v31, v10

    .line 1386
    .line 1387
    move-object/from16 v32, v11

    .line 1388
    .line 1389
    move/from16 v30, v13

    .line 1390
    .line 1391
    move/from16 v34, v14

    .line 1392
    .line 1393
    move/from16 v35, v15

    .line 1394
    .line 1395
    move v13, v3

    .line 1396
    move v10, v4

    .line 1397
    move v11, v5

    .line 1398
    move/from16 v4, p2

    .line 1399
    .line 1400
    iget v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1401
    .line 1402
    if-lez v1, :cond_41

    .line 1403
    .line 1404
    invoke-virtual {v0, v6}, Landroidx/appcompat/widget/LinearLayoutCompat;->i(I)Z

    .line 1405
    .line 1406
    .line 1407
    move-result v1

    .line 1408
    if-eqz v1, :cond_41

    .line 1409
    .line 1410
    iget v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1411
    .line 1412
    iget v3, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->l:I

    .line 1413
    .line 1414
    add-int/2addr v1, v3

    .line 1415
    iput v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1416
    .line 1417
    :cond_41
    aget v1, v31, v20

    .line 1418
    .line 1419
    const/4 v3, -0x1

    .line 1420
    if-ne v1, v3, :cond_43

    .line 1421
    .line 1422
    const/16 v21, 0x0

    .line 1423
    .line 1424
    aget v5, v31, v21

    .line 1425
    .line 1426
    if-ne v5, v3, :cond_43

    .line 1427
    .line 1428
    aget v5, v31, v30

    .line 1429
    .line 1430
    if-ne v5, v3, :cond_43

    .line 1431
    .line 1432
    aget v5, v31, v24

    .line 1433
    .line 1434
    if-eq v5, v3, :cond_42

    .line 1435
    .line 1436
    goto :goto_2c

    .line 1437
    :cond_42
    move v3, v13

    .line 1438
    goto :goto_2d

    .line 1439
    :cond_43
    :goto_2c
    aget v3, v31, v24

    .line 1440
    .line 1441
    const/16 v21, 0x0

    .line 1442
    .line 1443
    aget v5, v31, v21

    .line 1444
    .line 1445
    aget v14, v31, v30

    .line 1446
    .line 1447
    invoke-static {v1, v14}, Ljava/lang/Math;->max(II)I

    .line 1448
    .line 1449
    .line 1450
    move-result v1

    .line 1451
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    .line 1452
    .line 1453
    .line 1454
    move-result v1

    .line 1455
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    .line 1456
    .line 1457
    .line 1458
    move-result v1

    .line 1459
    aget v3, v32, v24

    .line 1460
    .line 1461
    aget v5, v32, v21

    .line 1462
    .line 1463
    aget v14, v32, v20

    .line 1464
    .line 1465
    aget v15, v32, v30

    .line 1466
    .line 1467
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    .line 1468
    .line 1469
    .line 1470
    move-result v14

    .line 1471
    invoke-static {v5, v14}, Ljava/lang/Math;->max(II)I

    .line 1472
    .line 1473
    .line 1474
    move-result v5

    .line 1475
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 1476
    .line 1477
    .line 1478
    move-result v3

    .line 1479
    add-int/2addr v3, v1

    .line 1480
    invoke-static {v13, v3}, Ljava/lang/Math;->max(II)I

    .line 1481
    .line 1482
    .line 1483
    move-result v3

    .line 1484
    :goto_2d
    if-eqz v35, :cond_48

    .line 1485
    .line 1486
    const/high16 v1, -0x80000000

    .line 1487
    .line 1488
    if-eq v7, v1, :cond_44

    .line 1489
    .line 1490
    if-nez v7, :cond_48

    .line 1491
    .line 1492
    :cond_44
    const/4 v1, 0x0

    .line 1493
    iput v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1494
    .line 1495
    const/4 v1, 0x0

    .line 1496
    :goto_2e
    if-ge v1, v6, :cond_48

    .line 1497
    .line 1498
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v5

    .line 1502
    if-nez v5, :cond_45

    .line 1503
    .line 1504
    iget v5, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1505
    .line 1506
    iput v5, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1507
    .line 1508
    goto :goto_2f

    .line 1509
    :cond_45
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 1510
    .line 1511
    .line 1512
    move-result v13

    .line 1513
    const/16 v14, 0x8

    .line 1514
    .line 1515
    if-ne v13, v14, :cond_46

    .line 1516
    .line 1517
    goto :goto_2f

    .line 1518
    :cond_46
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v5

    .line 1522
    check-cast v5, Lp/s0;

    .line 1523
    .line 1524
    if-eqz v16, :cond_47

    .line 1525
    .line 1526
    iget v13, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1527
    .line 1528
    iget v14, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1529
    .line 1530
    add-int/2addr v14, v9

    .line 1531
    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1532
    .line 1533
    add-int/2addr v14, v5

    .line 1534
    add-int/2addr v14, v13

    .line 1535
    iput v14, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1536
    .line 1537
    goto :goto_2f

    .line 1538
    :cond_47
    iget v13, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1539
    .line 1540
    add-int v14, v13, v9

    .line 1541
    .line 1542
    iget v15, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1543
    .line 1544
    add-int/2addr v14, v15

    .line 1545
    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1546
    .line 1547
    add-int/2addr v14, v5

    .line 1548
    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    .line 1549
    .line 1550
    .line 1551
    move-result v5

    .line 1552
    iput v5, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1553
    .line 1554
    :goto_2f
    add-int/lit8 v1, v1, 0x1

    .line 1555
    .line 1556
    goto :goto_2e

    .line 1557
    :cond_48
    iget v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1558
    .line 1559
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 1560
    .line 1561
    .line 1562
    move-result v5

    .line 1563
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 1564
    .line 1565
    .line 1566
    move-result v13

    .line 1567
    add-int/2addr v13, v5

    .line 1568
    add-int/2addr v13, v1

    .line 1569
    iput v13, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1570
    .line 1571
    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 1572
    .line 1573
    .line 1574
    move-result v1

    .line 1575
    invoke-static {v13, v1}, Ljava/lang/Math;->max(II)I

    .line 1576
    .line 1577
    .line 1578
    move-result v1

    .line 1579
    const/4 v5, 0x0

    .line 1580
    invoke-static {v1, v2, v5}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 1581
    .line 1582
    .line 1583
    move-result v1

    .line 1584
    and-int v5, v1, v17

    .line 1585
    .line 1586
    iget v13, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1587
    .line 1588
    sub-int/2addr v5, v13

    .line 1589
    if-nez v22, :cond_4d

    .line 1590
    .line 1591
    if-eqz v5, :cond_49

    .line 1592
    .line 1593
    cmpl-float v14, v28, v18

    .line 1594
    .line 1595
    if-lez v14, :cond_49

    .line 1596
    .line 1597
    goto :goto_32

    .line 1598
    :cond_49
    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    .line 1599
    .line 1600
    .line 1601
    move-result v5

    .line 1602
    if-eqz v35, :cond_4c

    .line 1603
    .line 1604
    const/high16 v14, 0x40000000    # 2.0f

    .line 1605
    .line 1606
    if-eq v7, v14, :cond_4c

    .line 1607
    .line 1608
    const/4 v7, 0x0

    .line 1609
    :goto_30
    if-ge v7, v6, :cond_4c

    .line 1610
    .line 1611
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v10

    .line 1615
    if-eqz v10, :cond_4b

    .line 1616
    .line 1617
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    .line 1618
    .line 1619
    .line 1620
    move-result v11

    .line 1621
    const/16 v14, 0x8

    .line 1622
    .line 1623
    if-ne v11, v14, :cond_4a

    .line 1624
    .line 1625
    goto :goto_31

    .line 1626
    :cond_4a
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v11

    .line 1630
    check-cast v11, Lp/s0;

    .line 1631
    .line 1632
    iget v11, v11, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 1633
    .line 1634
    cmpl-float v11, v11, v18

    .line 1635
    .line 1636
    if-lez v11, :cond_4b

    .line 1637
    .line 1638
    const/high16 v14, 0x40000000    # 2.0f

    .line 1639
    .line 1640
    invoke-static {v9, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1641
    .line 1642
    .line 1643
    move-result v11

    .line 1644
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    .line 1645
    .line 1646
    .line 1647
    move-result v15

    .line 1648
    invoke-static {v15, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1649
    .line 1650
    .line 1651
    move-result v15

    .line 1652
    invoke-virtual {v10, v11, v15}, Landroid/view/View;->measure(II)V

    .line 1653
    .line 1654
    .line 1655
    :cond_4b
    :goto_31
    add-int/lit8 v7, v7, 0x1

    .line 1656
    .line 1657
    goto :goto_30

    .line 1658
    :cond_4c
    move/from16 v22, v1

    .line 1659
    .line 1660
    const/high16 v17, -0x1000000

    .line 1661
    .line 1662
    const/16 v21, 0x0

    .line 1663
    .line 1664
    goto/16 :goto_41

    .line 1665
    .line 1666
    :cond_4d
    :goto_32
    iget v3, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->g:F

    .line 1667
    .line 1668
    cmpl-float v9, v3, v18

    .line 1669
    .line 1670
    if-lez v9, :cond_4e

    .line 1671
    .line 1672
    move/from16 v28, v3

    .line 1673
    .line 1674
    :cond_4e
    const/16 v26, -0x1

    .line 1675
    .line 1676
    aput v26, v31, v24

    .line 1677
    .line 1678
    aput v26, v31, v30

    .line 1679
    .line 1680
    aput v26, v31, v20

    .line 1681
    .line 1682
    const/4 v3, 0x0

    .line 1683
    aput v26, v31, v3

    .line 1684
    .line 1685
    aput v26, v32, v24

    .line 1686
    .line 1687
    aput v26, v32, v30

    .line 1688
    .line 1689
    aput v26, v32, v20

    .line 1690
    .line 1691
    aput v26, v32, v3

    .line 1692
    .line 1693
    iput v3, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1694
    .line 1695
    const/4 v3, -0x1

    .line 1696
    const/4 v9, 0x0

    .line 1697
    :goto_33
    if-ge v9, v6, :cond_5d

    .line 1698
    .line 1699
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v11

    .line 1703
    if-eqz v11, :cond_4f

    .line 1704
    .line 1705
    invoke-virtual {v11}, Landroid/view/View;->getVisibility()I

    .line 1706
    .line 1707
    .line 1708
    move-result v14

    .line 1709
    const/16 v15, 0x8

    .line 1710
    .line 1711
    if-ne v14, v15, :cond_50

    .line 1712
    .line 1713
    :cond_4f
    move/from16 v22, v1

    .line 1714
    .line 1715
    const/high16 v17, -0x1000000

    .line 1716
    .line 1717
    const/16 v25, -0x2

    .line 1718
    .line 1719
    goto/16 :goto_3e

    .line 1720
    .line 1721
    :cond_50
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v14

    .line 1725
    check-cast v14, Lp/s0;

    .line 1726
    .line 1727
    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 1728
    .line 1729
    cmpl-float v17, v15, v18

    .line 1730
    .line 1731
    if-lez v17, :cond_55

    .line 1732
    .line 1733
    const/high16 v17, -0x1000000

    .line 1734
    .line 1735
    int-to-float v13, v5

    .line 1736
    mul-float/2addr v13, v15

    .line 1737
    div-float v13, v13, v28

    .line 1738
    .line 1739
    float-to-int v13, v13

    .line 1740
    sub-float v28, v28, v15

    .line 1741
    .line 1742
    sub-int/2addr v5, v13

    .line 1743
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 1744
    .line 1745
    .line 1746
    move-result v15

    .line 1747
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 1748
    .line 1749
    .line 1750
    move-result v22

    .line 1751
    add-int v22, v22, v15

    .line 1752
    .line 1753
    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1754
    .line 1755
    add-int v22, v22, v15

    .line 1756
    .line 1757
    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1758
    .line 1759
    add-int v15, v22, v15

    .line 1760
    .line 1761
    move/from16 v22, v1

    .line 1762
    .line 1763
    iget v1, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 1764
    .line 1765
    invoke-static {v4, v15, v1}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 1766
    .line 1767
    .line 1768
    move-result v1

    .line 1769
    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1770
    .line 1771
    if-nez v15, :cond_53

    .line 1772
    .line 1773
    const/high16 v15, 0x40000000    # 2.0f

    .line 1774
    .line 1775
    if-eq v7, v15, :cond_51

    .line 1776
    .line 1777
    goto :goto_35

    .line 1778
    :cond_51
    if-lez v13, :cond_52

    .line 1779
    .line 1780
    goto :goto_34

    .line 1781
    :cond_52
    const/4 v13, 0x0

    .line 1782
    :goto_34
    invoke-static {v13, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1783
    .line 1784
    .line 1785
    move-result v13

    .line 1786
    invoke-virtual {v11, v13, v1}, Landroid/view/View;->measure(II)V

    .line 1787
    .line 1788
    .line 1789
    goto :goto_36

    .line 1790
    :cond_53
    const/high16 v15, 0x40000000    # 2.0f

    .line 1791
    .line 1792
    :goto_35
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 1793
    .line 1794
    .line 1795
    move-result v27

    .line 1796
    add-int v13, v27, v13

    .line 1797
    .line 1798
    if-gez v13, :cond_54

    .line 1799
    .line 1800
    const/4 v13, 0x0

    .line 1801
    :cond_54
    invoke-static {v13, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1802
    .line 1803
    .line 1804
    move-result v13

    .line 1805
    invoke-virtual {v11, v13, v1}, Landroid/view/View;->measure(II)V

    .line 1806
    .line 1807
    .line 1808
    :goto_36
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredState()I

    .line 1809
    .line 1810
    .line 1811
    move-result v1

    .line 1812
    and-int v1, v1, v17

    .line 1813
    .line 1814
    invoke-static {v12, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 1815
    .line 1816
    .line 1817
    move-result v12

    .line 1818
    goto :goto_37

    .line 1819
    :cond_55
    move/from16 v22, v1

    .line 1820
    .line 1821
    const/high16 v17, -0x1000000

    .line 1822
    .line 1823
    :goto_37
    if-eqz v16, :cond_56

    .line 1824
    .line 1825
    iget v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1826
    .line 1827
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 1828
    .line 1829
    .line 1830
    move-result v13

    .line 1831
    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1832
    .line 1833
    add-int/2addr v13, v15

    .line 1834
    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1835
    .line 1836
    add-int/2addr v13, v15

    .line 1837
    add-int/2addr v13, v1

    .line 1838
    iput v13, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1839
    .line 1840
    :goto_38
    const/high16 v1, 0x40000000    # 2.0f

    .line 1841
    .line 1842
    goto :goto_39

    .line 1843
    :cond_56
    iget v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1844
    .line 1845
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 1846
    .line 1847
    .line 1848
    move-result v13

    .line 1849
    add-int/2addr v13, v1

    .line 1850
    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1851
    .line 1852
    add-int/2addr v13, v15

    .line 1853
    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1854
    .line 1855
    add-int/2addr v13, v15

    .line 1856
    invoke-static {v1, v13}, Ljava/lang/Math;->max(II)I

    .line 1857
    .line 1858
    .line 1859
    move-result v1

    .line 1860
    iput v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1861
    .line 1862
    goto :goto_38

    .line 1863
    :goto_39
    if-eq v8, v1, :cond_57

    .line 1864
    .line 1865
    iget v1, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 1866
    .line 1867
    const/4 v15, -0x1

    .line 1868
    if-ne v1, v15, :cond_57

    .line 1869
    .line 1870
    move/from16 v1, v20

    .line 1871
    .line 1872
    goto :goto_3a

    .line 1873
    :cond_57
    const/4 v1, 0x0

    .line 1874
    :goto_3a
    iget v13, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1875
    .line 1876
    iget v15, v14, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1877
    .line 1878
    add-int/2addr v13, v15

    .line 1879
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 1880
    .line 1881
    .line 1882
    move-result v15

    .line 1883
    add-int/2addr v15, v13

    .line 1884
    invoke-static {v3, v15}, Ljava/lang/Math;->max(II)I

    .line 1885
    .line 1886
    .line 1887
    move-result v3

    .line 1888
    if-eqz v1, :cond_58

    .line 1889
    .line 1890
    goto :goto_3b

    .line 1891
    :cond_58
    move v13, v15

    .line 1892
    :goto_3b
    invoke-static {v10, v13}, Ljava/lang/Math;->max(II)I

    .line 1893
    .line 1894
    .line 1895
    move-result v1

    .line 1896
    if-eqz v29, :cond_59

    .line 1897
    .line 1898
    iget v10, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 1899
    .line 1900
    const/4 v13, -0x1

    .line 1901
    if-ne v10, v13, :cond_5a

    .line 1902
    .line 1903
    move/from16 v10, v20

    .line 1904
    .line 1905
    goto :goto_3c

    .line 1906
    :cond_59
    const/4 v13, -0x1

    .line 1907
    :cond_5a
    const/4 v10, 0x0

    .line 1908
    :goto_3c
    if-eqz v34, :cond_5c

    .line 1909
    .line 1910
    invoke-virtual {v11}, Landroid/view/View;->getBaseline()I

    .line 1911
    .line 1912
    .line 1913
    move-result v11

    .line 1914
    if-eq v11, v13, :cond_5c

    .line 1915
    .line 1916
    iget v13, v14, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1917
    .line 1918
    if-gez v13, :cond_5b

    .line 1919
    .line 1920
    iget v13, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I

    .line 1921
    .line 1922
    :cond_5b
    and-int/lit8 v13, v13, 0x70

    .line 1923
    .line 1924
    shr-int/lit8 v13, v13, 0x4

    .line 1925
    .line 1926
    const/16 v25, -0x2

    .line 1927
    .line 1928
    and-int/lit8 v13, v13, -0x2

    .line 1929
    .line 1930
    shr-int/lit8 v13, v13, 0x1

    .line 1931
    .line 1932
    aget v14, v31, v13

    .line 1933
    .line 1934
    invoke-static {v14, v11}, Ljava/lang/Math;->max(II)I

    .line 1935
    .line 1936
    .line 1937
    move-result v14

    .line 1938
    aput v14, v31, v13

    .line 1939
    .line 1940
    aget v14, v32, v13

    .line 1941
    .line 1942
    sub-int/2addr v15, v11

    .line 1943
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    .line 1944
    .line 1945
    .line 1946
    move-result v11

    .line 1947
    aput v11, v32, v13

    .line 1948
    .line 1949
    goto :goto_3d

    .line 1950
    :cond_5c
    const/16 v25, -0x2

    .line 1951
    .line 1952
    :goto_3d
    move/from16 v29, v10

    .line 1953
    .line 1954
    move v10, v1

    .line 1955
    :goto_3e
    add-int/lit8 v9, v9, 0x1

    .line 1956
    .line 1957
    move/from16 v1, v22

    .line 1958
    .line 1959
    goto/16 :goto_33

    .line 1960
    .line 1961
    :cond_5d
    move/from16 v22, v1

    .line 1962
    .line 1963
    const/high16 v17, -0x1000000

    .line 1964
    .line 1965
    iget v1, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1966
    .line 1967
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 1968
    .line 1969
    .line 1970
    move-result v5

    .line 1971
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 1972
    .line 1973
    .line 1974
    move-result v7

    .line 1975
    add-int/2addr v7, v5

    .line 1976
    add-int/2addr v7, v1

    .line 1977
    iput v7, v0, Landroidx/appcompat/widget/LinearLayoutCompat;->f:I

    .line 1978
    .line 1979
    aget v1, v31, v20

    .line 1980
    .line 1981
    const/4 v15, -0x1

    .line 1982
    if-ne v1, v15, :cond_5f

    .line 1983
    .line 1984
    const/16 v21, 0x0

    .line 1985
    .line 1986
    aget v5, v31, v21

    .line 1987
    .line 1988
    if-ne v5, v15, :cond_5f

    .line 1989
    .line 1990
    aget v5, v31, v30

    .line 1991
    .line 1992
    if-ne v5, v15, :cond_5f

    .line 1993
    .line 1994
    aget v5, v31, v24

    .line 1995
    .line 1996
    if-eq v5, v15, :cond_5e

    .line 1997
    .line 1998
    goto :goto_3f

    .line 1999
    :cond_5e
    const/16 v21, 0x0

    .line 2000
    .line 2001
    goto :goto_40

    .line 2002
    :cond_5f
    :goto_3f
    aget v5, v31, v24

    .line 2003
    .line 2004
    const/16 v21, 0x0

    .line 2005
    .line 2006
    aget v7, v31, v21

    .line 2007
    .line 2008
    aget v9, v31, v30

    .line 2009
    .line 2010
    invoke-static {v1, v9}, Ljava/lang/Math;->max(II)I

    .line 2011
    .line 2012
    .line 2013
    move-result v1

    .line 2014
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 2015
    .line 2016
    .line 2017
    move-result v1

    .line 2018
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    .line 2019
    .line 2020
    .line 2021
    move-result v1

    .line 2022
    aget v5, v32, v24

    .line 2023
    .line 2024
    aget v7, v32, v21

    .line 2025
    .line 2026
    aget v9, v32, v20

    .line 2027
    .line 2028
    aget v11, v32, v30

    .line 2029
    .line 2030
    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    .line 2031
    .line 2032
    .line 2033
    move-result v9

    .line 2034
    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    .line 2035
    .line 2036
    .line 2037
    move-result v7

    .line 2038
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 2039
    .line 2040
    .line 2041
    move-result v5

    .line 2042
    add-int/2addr v5, v1

    .line 2043
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 2044
    .line 2045
    .line 2046
    move-result v1

    .line 2047
    move v3, v1

    .line 2048
    :goto_40
    move v5, v10

    .line 2049
    :goto_41
    if-nez v29, :cond_60

    .line 2050
    .line 2051
    const/high16 v14, 0x40000000    # 2.0f

    .line 2052
    .line 2053
    if-eq v8, v14, :cond_60

    .line 2054
    .line 2055
    move v3, v5

    .line 2056
    :cond_60
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 2057
    .line 2058
    .line 2059
    move-result v1

    .line 2060
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 2061
    .line 2062
    .line 2063
    move-result v5

    .line 2064
    add-int/2addr v5, v1

    .line 2065
    add-int/2addr v5, v3

    .line 2066
    invoke-virtual {v0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 2067
    .line 2068
    .line 2069
    move-result v1

    .line 2070
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    .line 2071
    .line 2072
    .line 2073
    move-result v1

    .line 2074
    and-int v3, v12, v17

    .line 2075
    .line 2076
    or-int v3, v22, v3

    .line 2077
    .line 2078
    shl-int/lit8 v5, v12, 0x10

    .line 2079
    .line 2080
    invoke-static {v1, v4, v5}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 2081
    .line 2082
    .line 2083
    move-result v1

    .line 2084
    invoke-virtual {v0, v3, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 2085
    .line 2086
    .line 2087
    if-eqz v19, :cond_63

    .line 2088
    .line 2089
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 2090
    .line 2091
    .line 2092
    move-result v1

    .line 2093
    const/high16 v14, 0x40000000    # 2.0f

    .line 2094
    .line 2095
    invoke-static {v1, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 2096
    .line 2097
    .line 2098
    move-result v4

    .line 2099
    move/from16 v13, v21

    .line 2100
    .line 2101
    :goto_42
    if-ge v13, v6, :cond_63

    .line 2102
    .line 2103
    invoke-virtual {v0, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 2104
    .line 2105
    .line 2106
    move-result-object v1

    .line 2107
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 2108
    .line 2109
    .line 2110
    move-result v3

    .line 2111
    const/16 v9, 0x8

    .line 2112
    .line 2113
    if-eq v3, v9, :cond_61

    .line 2114
    .line 2115
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2116
    .line 2117
    .line 2118
    move-result-object v3

    .line 2119
    move-object v7, v3

    .line 2120
    check-cast v7, Lp/s0;

    .line 2121
    .line 2122
    iget v3, v7, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 2123
    .line 2124
    const/4 v15, -0x1

    .line 2125
    if-ne v3, v15, :cond_62

    .line 2126
    .line 2127
    iget v8, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 2128
    .line 2129
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 2130
    .line 2131
    .line 2132
    move-result v3

    .line 2133
    iput v3, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 2134
    .line 2135
    const/4 v3, 0x0

    .line 2136
    const/4 v5, 0x0

    .line 2137
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 2138
    .line 2139
    .line 2140
    iput v8, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 2141
    .line 2142
    goto :goto_43

    .line 2143
    :cond_61
    const/4 v15, -0x1

    .line 2144
    :cond_62
    :goto_43
    add-int/lit8 v13, v13, 0x1

    .line 2145
    .line 2146
    move-object/from16 v0, p0

    .line 2147
    .line 2148
    move/from16 v2, p1

    .line 2149
    .line 2150
    goto :goto_42

    .line 2151
    :cond_63
    return-void
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
    .line 2791
    .line 2792
    .line 2793
    .line 2794
    .line 2795
    .line 2796
    .line 2797
    .line 2798
    .line 2799
    .line 2800
    .line 2801
    .line 2802
    .line 2803
    .line 2804
    .line 2805
    .line 2806
    .line 2807
    .line 2808
    .line 2809
    .line 2810
    .line 2811
    .line 2812
    .line 2813
    .line 2814
    .line 2815
    .line 2816
    .line 2817
    .line 2818
    .line 2819
    .line 2820
    .line 2821
    .line 2822
    .line 2823
    .line 2824
    .line 2825
    .line 2826
    .line 2827
    .line 2828
    .line 2829
    .line 2830
    .line 2831
    .line 2832
    .line 2833
    .line 2834
    .line 2835
    .line 2836
    .line 2837
    .line 2838
    .line 2839
    .line 2840
    .line 2841
    .line 2842
    .line 2843
    .line 2844
    .line 2845
    .line 2846
    .line 2847
    .line 2848
    .line 2849
    .line 2850
    .line 2851
    .line 2852
    .line 2853
    .line 2854
    .line 2855
    .line 2856
    .line 2857
    .line 2858
    .line 2859
    .line 2860
    .line 2861
    .line 2862
    .line 2863
    .line 2864
    .line 2865
    .line 2866
    .line 2867
    .line 2868
    .line 2869
    .line 2870
    .line 2871
    .line 2872
    .line 2873
    .line 2874
    .line 2875
    .line 2876
    .line 2877
    .line 2878
    .line 2879
    .line 2880
    .line 2881
    .line 2882
    .line 2883
    .line 2884
    .line 2885
    .line 2886
    .line 2887
    .line 2888
    .line 2889
    .line 2890
    .line 2891
    .line 2892
    .line 2893
    .line 2894
    .line 2895
    .line 2896
    .line 2897
    .line 2898
    .line 2899
    .line 2900
    .line 2901
    .line 2902
    .line 2903
    .line 2904
    .line 2905
    .line 2906
    .line 2907
    .line 2908
    .line 2909
    .line 2910
    .line 2911
    .line 2912
    .line 2913
    .line 2914
    .line 2915
    .line 2916
    .line 2917
    .line 2918
    .line 2919
    .line 2920
    .line 2921
    .line 2922
    .line 2923
    .line 2924
    .line 2925
    .line 2926
    .line 2927
    .line 2928
    .line 2929
    .line 2930
    .line 2931
    .line 2932
    .line 2933
    .line 2934
    .line 2935
    .line 2936
    .line 2937
    .line 2938
    .line 2939
    .line 2940
    .line 2941
    .line 2942
    .line 2943
    .line 2944
    .line 2945
    .line 2946
    .line 2947
    .line 2948
    .line 2949
    .line 2950
    .line 2951
    .line 2952
    .line 2953
    .line 2954
    .line 2955
    .line 2956
    .line 2957
    .line 2958
    .line 2959
    .line 2960
    .line 2961
    .line 2962
    .line 2963
    .line 2964
    .line 2965
    .line 2966
    .line 2967
    .line 2968
    .line 2969
    .line 2970
    .line 2971
    .line 2972
    .line 2973
    .line 2974
    .line 2975
    .line 2976
    .line 2977
    .line 2978
    .line 2979
    .line 2980
    .line 2981
    .line 2982
    .line 2983
    .line 2984
    .line 2985
    .line 2986
    .line 2987
    .line 2988
    .line 2989
    .line 2990
    .line 2991
    .line 2992
    .line 2993
    .line 2994
    .line 2995
    .line 2996
    .line 2997
    .line 2998
    .line 2999
    .line 3000
    .line 3001
    .line 3002
    .line 3003
    .line 3004
    .line 3005
    .line 3006
    .line 3007
    .line 3008
    .line 3009
    .line 3010
    .line 3011
    .line 3012
    .line 3013
    .line 3014
    .line 3015
    .line 3016
    .line 3017
    .line 3018
    .line 3019
    .line 3020
    .line 3021
    .line 3022
    .line 3023
    .line 3024
    .line 3025
    .line 3026
    .line 3027
    .line 3028
    .line 3029
    .line 3030
    .line 3031
    .line 3032
    .line 3033
    .line 3034
    .line 3035
    .line 3036
    .line 3037
    .line 3038
    .line 3039
    .line 3040
    .line 3041
    .line 3042
    .line 3043
    .line 3044
    .line 3045
    .line 3046
    .line 3047
    .line 3048
    .line 3049
    .line 3050
    .line 3051
    .line 3052
    .line 3053
    .line 3054
    .line 3055
    .line 3056
    .line 3057
    .line 3058
    .line 3059
    .line 3060
    .line 3061
    .line 3062
    .line 3063
    .line 3064
    .line 3065
    .line 3066
    .line 3067
    .line 3068
    .line 3069
    .line 3070
    .line 3071
    .line 3072
    .line 3073
    .line 3074
    .line 3075
    .line 3076
    .line 3077
    .line 3078
    .line 3079
    .line 3080
    .line 3081
    .line 3082
    .line 3083
    .line 3084
    .line 3085
    .line 3086
    .line 3087
    .line 3088
    .line 3089
    .line 3090
    .line 3091
    .line 3092
    .line 3093
    .line 3094
    .line 3095
    .line 3096
    .line 3097
    .line 3098
    .line 3099
    .line 3100
    .line 3101
    .line 3102
    .line 3103
    .line 3104
    .line 3105
    .line 3106
    .line 3107
    .line 3108
    .line 3109
    .line 3110
    .line 3111
    .line 3112
    .line 3113
    .line 3114
    .line 3115
    .line 3116
    .line 3117
    .line 3118
    .line 3119
    .line 3120
    .line 3121
    .line 3122
    .line 3123
    .line 3124
    .line 3125
    .line 3126
    .line 3127
    .line 3128
    .line 3129
    .line 3130
    .line 3131
    .line 3132
    .line 3133
    .line 3134
    .line 3135
    .line 3136
    .line 3137
    .line 3138
    .line 3139
    .line 3140
    .line 3141
    .line 3142
    .line 3143
    .line 3144
    .line 3145
    .line 3146
    .line 3147
    .line 3148
    .line 3149
    .line 3150
    .line 3151
    .line 3152
    .line 3153
    .line 3154
    .line 3155
    .line 3156
    .line 3157
    .line 3158
    .line 3159
    .line 3160
    .line 3161
    .line 3162
    .line 3163
    .line 3164
    .line 3165
    .line 3166
    .line 3167
    .line 3168
    .line 3169
    .line 3170
    .line 3171
    .line 3172
    .line 3173
    .line 3174
    .line 3175
    .line 3176
    .line 3177
    .line 3178
    .line 3179
    .line 3180
    .line 3181
    .line 3182
    .line 3183
    .line 3184
    .line 3185
    .line 3186
    .line 3187
    .line 3188
    .line 3189
    .line 3190
    .line 3191
    .line 3192
    .line 3193
    .line 3194
    .line 3195
    .line 3196
    .line 3197
    .line 3198
    .line 3199
    .line 3200
    .line 3201
    .line 3202
    .line 3203
    .line 3204
    .line 3205
    .line 3206
    .line 3207
    .line 3208
    .line 3209
    .line 3210
    .line 3211
    .line 3212
    .line 3213
    .line 3214
    .line 3215
    .line 3216
    .line 3217
    .line 3218
    .line 3219
    .line 3220
    .line 3221
    .line 3222
    .line 3223
    .line 3224
    .line 3225
    .line 3226
    .line 3227
    .line 3228
    .line 3229
    .line 3230
    .line 3231
    .line 3232
    .line 3233
    .line 3234
    .line 3235
    .line 3236
    .line 3237
    .line 3238
    .line 3239
    .line 3240
    .line 3241
    .line 3242
    .line 3243
    .line 3244
    .line 3245
    .line 3246
    .line 3247
    .line 3248
    .line 3249
    .line 3250
    .line 3251
    .line 3252
    .line 3253
    .line 3254
    .line 3255
    .line 3256
    .line 3257
    .line 3258
    .line 3259
    .line 3260
    .line 3261
    .line 3262
    .line 3263
    .line 3264
    .line 3265
    .line 3266
    .line 3267
    .line 3268
    .line 3269
    .line 3270
    .line 3271
    .line 3272
    .line 3273
    .line 3274
    .line 3275
    .line 3276
    .line 3277
    .line 3278
    .line 3279
    .line 3280
    .line 3281
    .line 3282
    .line 3283
    .line 3284
    .line 3285
    .line 3286
    .line 3287
    .line 3288
    .line 3289
    .line 3290
    .line 3291
    .line 3292
    .line 3293
    .line 3294
    .line 3295
    .line 3296
    .line 3297
    .line 3298
    .line 3299
    .line 3300
    .line 3301
    .line 3302
    .line 3303
    .line 3304
    .line 3305
    .line 3306
    .line 3307
    .line 3308
    .line 3309
    .line 3310
    .line 3311
    .line 3312
    .line 3313
    .line 3314
    .line 3315
    .line 3316
    .line 3317
    .line 3318
    .line 3319
    .line 3320
    .line 3321
    .line 3322
    .line 3323
    .line 3324
    .line 3325
    .line 3326
    .line 3327
    .line 3328
    .line 3329
    .line 3330
    .line 3331
    .line 3332
    .line 3333
    .line 3334
    .line 3335
    .line 3336
    .line 3337
    .line 3338
    .line 3339
    .line 3340
    .line 3341
    .line 3342
    .line 3343
    .line 3344
    .line 3345
    .line 3346
    .line 3347
    .line 3348
    .line 3349
    .line 3350
    .line 3351
    .line 3352
    .line 3353
    .line 3354
    .line 3355
    .line 3356
    .line 3357
    .line 3358
    .line 3359
    .line 3360
    .line 3361
    .line 3362
    .line 3363
    .line 3364
    .line 3365
    .line 3366
    .line 3367
    .line 3368
    .line 3369
    .line 3370
    .line 3371
    .line 3372
    .line 3373
    .line 3374
    .line 3375
    .line 3376
    .line 3377
    .line 3378
    .line 3379
    .line 3380
    .line 3381
    .line 3382
    .line 3383
    .line 3384
    .line 3385
    .line 3386
    .line 3387
    .line 3388
    .line 3389
    .line 3390
    .line 3391
    .line 3392
    .line 3393
    .line 3394
    .line 3395
    .line 3396
    .line 3397
    .line 3398
    .line 3399
    .line 3400
    .line 3401
    .line 3402
    .line 3403
    .line 3404
    .line 3405
    .line 3406
    .line 3407
    .line 3408
    .line 3409
    .line 3410
    .line 3411
    .line 3412
    .line 3413
    .line 3414
    .line 3415
    .line 3416
    .line 3417
    .line 3418
    .line 3419
    .line 3420
    .line 3421
    .line 3422
    .line 3423
    .line 3424
    .line 3425
    .line 3426
    .line 3427
    .line 3428
    .line 3429
    .line 3430
    .line 3431
    .line 3432
    .line 3433
    .line 3434
    .line 3435
    .line 3436
    .line 3437
    .line 3438
    .line 3439
    .line 3440
    .line 3441
    .line 3442
    .line 3443
    .line 3444
    .line 3445
    .line 3446
    .line 3447
    .line 3448
    .line 3449
    .line 3450
    .line 3451
    .line 3452
    .line 3453
    .line 3454
    .line 3455
    .line 3456
    .line 3457
    .line 3458
    .line 3459
    .line 3460
    .line 3461
    .line 3462
    .line 3463
    .line 3464
    .line 3465
    .line 3466
    .line 3467
    .line 3468
    .line 3469
    .line 3470
    .line 3471
    .line 3472
    .line 3473
    .line 3474
    .line 3475
    .line 3476
    .line 3477
    .line 3478
    .line 3479
    .line 3480
    .line 3481
    .line 3482
    .line 3483
    .line 3484
    .line 3485
    .line 3486
    .line 3487
    .line 3488
    .line 3489
    .line 3490
    .line 3491
    .line 3492
    .line 3493
    .line 3494
    .line 3495
    .line 3496
    .line 3497
    .line 3498
    .line 3499
    .line 3500
    .line 3501
    .line 3502
    .line 3503
    .line 3504
    .line 3505
    .line 3506
    .line 3507
    .line 3508
    .line 3509
    .line 3510
    .line 3511
    .line 3512
    .line 3513
    .line 3514
    .line 3515
    .line 3516
    .line 3517
    .line 3518
    .line 3519
    .line 3520
    .line 3521
    .line 3522
    .line 3523
    .line 3524
    .line 3525
    .line 3526
    .line 3527
    .line 3528
    .line 3529
    .line 3530
    .line 3531
    .line 3532
    .line 3533
    .line 3534
    .line 3535
    .line 3536
    .line 3537
    .line 3538
    .line 3539
    .line 3540
    .line 3541
    .line 3542
    .line 3543
    .line 3544
    .line 3545
    .line 3546
    .line 3547
    .line 3548
    .line 3549
    .line 3550
    .line 3551
    .line 3552
    .line 3553
    .line 3554
    .line 3555
    .line 3556
    .line 3557
    .line 3558
    .line 3559
    .line 3560
    .line 3561
    .line 3562
    .line 3563
    .line 3564
    .line 3565
    .line 3566
    .line 3567
    .line 3568
    .line 3569
    .line 3570
    .line 3571
    .line 3572
    .line 3573
    .line 3574
    .line 3575
    .line 3576
    .line 3577
    .line 3578
    .line 3579
    .line 3580
    .line 3581
    .line 3582
    .line 3583
    .line 3584
    .line 3585
    .line 3586
    .line 3587
    .line 3588
    .line 3589
    .line 3590
    .line 3591
    .line 3592
    .line 3593
    .line 3594
    .line 3595
    .line 3596
    .line 3597
    .line 3598
    .line 3599
    .line 3600
    .line 3601
    .line 3602
    .line 3603
    .line 3604
    .line 3605
    .line 3606
    .line 3607
    .line 3608
    .line 3609
    .line 3610
    .line 3611
    .line 3612
    .line 3613
    .line 3614
    .line 3615
    .line 3616
    .line 3617
    .line 3618
    .line 3619
    .line 3620
    .line 3621
    .line 3622
    .line 3623
    .line 3624
    .line 3625
    .line 3626
    .line 3627
    .line 3628
    .line 3629
    .line 3630
    .line 3631
    .line 3632
    .line 3633
    .line 3634
    .line 3635
    .line 3636
    .line 3637
    .line 3638
    .line 3639
    .line 3640
    .line 3641
    .line 3642
    .line 3643
    .line 3644
    .line 3645
    .line 3646
    .line 3647
    .line 3648
    .line 3649
    .line 3650
    .line 3651
    .line 3652
    .line 3653
    .line 3654
    .line 3655
    .line 3656
    .line 3657
    .line 3658
    .line 3659
    .line 3660
    .line 3661
    .line 3662
    .line 3663
    .line 3664
    .line 3665
    .line 3666
    .line 3667
    .line 3668
    .line 3669
    .line 3670
    .line 3671
    .line 3672
    .line 3673
    .line 3674
    .line 3675
    .line 3676
    .line 3677
    .line 3678
    .line 3679
    .line 3680
    .line 3681
    .line 3682
    .line 3683
    .line 3684
    .line 3685
    .line 3686
    .line 3687
    .line 3688
    .line 3689
    .line 3690
    .line 3691
    .line 3692
    .line 3693
    .line 3694
    .line 3695
    .line 3696
    .line 3697
    .line 3698
    .line 3699
    .line 3700
    .line 3701
    .line 3702
    .line 3703
    .line 3704
    .line 3705
    .line 3706
    .line 3707
    .line 3708
    .line 3709
    .line 3710
    .line 3711
    .line 3712
    .line 3713
    .line 3714
    .line 3715
    .line 3716
    .line 3717
    .line 3718
    .line 3719
    .line 3720
    .line 3721
    .line 3722
    .line 3723
    .line 3724
    .line 3725
    .line 3726
    .line 3727
    .line 3728
    .line 3729
    .line 3730
    .line 3731
    .line 3732
    .line 3733
    .line 3734
    .line 3735
    .line 3736
    .line 3737
    .line 3738
    .line 3739
    .line 3740
    .line 3741
    .line 3742
    .line 3743
    .line 3744
    .line 3745
    .line 3746
    .line 3747
    .line 3748
    .line 3749
    .line 3750
    .line 3751
    .line 3752
    .line 3753
    .line 3754
    .line 3755
    .line 3756
    .line 3757
    .line 3758
    .line 3759
    .line 3760
    .line 3761
    .line 3762
    .line 3763
    .line 3764
    .line 3765
    .line 3766
    .line 3767
    .line 3768
    .line 3769
    .line 3770
    .line 3771
    .line 3772
    .line 3773
    .line 3774
    .line 3775
    .line 3776
    .line 3777
    .line 3778
    .line 3779
    .line 3780
    .line 3781
    .line 3782
    .line 3783
    .line 3784
    .line 3785
    .line 3786
    .line 3787
    .line 3788
    .line 3789
    .line 3790
    .line 3791
    .line 3792
    .line 3793
    .line 3794
    .line 3795
    .line 3796
    .line 3797
    .line 3798
    .line 3799
    .line 3800
    .line 3801
    .line 3802
    .line 3803
    .line 3804
    .line 3805
    .line 3806
    .line 3807
    .line 3808
    .line 3809
    .line 3810
    .line 3811
    .line 3812
    .line 3813
    .line 3814
    .line 3815
    .line 3816
    .line 3817
    .line 3818
    .line 3819
    .line 3820
    .line 3821
    .line 3822
    .line 3823
    .line 3824
    .line 3825
    .line 3826
    .line 3827
    .line 3828
    .line 3829
    .line 3830
    .line 3831
    .line 3832
    .line 3833
    .line 3834
    .line 3835
    .line 3836
    .line 3837
    .line 3838
    .line 3839
    .line 3840
    .line 3841
    .line 3842
    .line 3843
    .line 3844
    .line 3845
    .line 3846
    .line 3847
    .line 3848
    .line 3849
    .line 3850
    .line 3851
    .line 3852
    .line 3853
    .line 3854
    .line 3855
    .line 3856
    .line 3857
    .line 3858
    .line 3859
    .line 3860
    .line 3861
    .line 3862
    .line 3863
    .line 3864
    .line 3865
    .line 3866
    .line 3867
    .line 3868
    .line 3869
    .line 3870
    .line 3871
    .line 3872
    .line 3873
    .line 3874
    .line 3875
    .line 3876
    .line 3877
    .line 3878
    .line 3879
    .line 3880
    .line 3881
    .line 3882
    .line 3883
    .line 3884
    .line 3885
    .line 3886
    .line 3887
    .line 3888
    .line 3889
    .line 3890
    .line 3891
    .line 3892
    .line 3893
    .line 3894
    .line 3895
    .line 3896
    .line 3897
    .line 3898
    .line 3899
    .line 3900
    .line 3901
    .line 3902
    .line 3903
    .line 3904
    .line 3905
    .line 3906
    .line 3907
    .line 3908
    .line 3909
    .line 3910
    .line 3911
    .line 3912
    .line 3913
    .line 3914
    .line 3915
    .line 3916
    .line 3917
    .line 3918
    .line 3919
    .line 3920
    .line 3921
    .line 3922
    .line 3923
    .line 3924
    .line 3925
    .line 3926
    .line 3927
    .line 3928
    .line 3929
    .line 3930
    .line 3931
    .line 3932
    .line 3933
    .line 3934
    .line 3935
    .line 3936
    .line 3937
    .line 3938
    .line 3939
    .line 3940
    .line 3941
    .line 3942
    .line 3943
    .line 3944
    .line 3945
    .line 3946
    .line 3947
    .line 3948
    .line 3949
    .line 3950
    .line 3951
    .line 3952
    .line 3953
    .line 3954
    .line 3955
    .line 3956
    .line 3957
    .line 3958
    .line 3959
    .line 3960
    .line 3961
    .line 3962
    .line 3963
    .line 3964
    .line 3965
    .line 3966
    .line 3967
    .line 3968
    .line 3969
    .line 3970
    .line 3971
    .line 3972
    .line 3973
    .line 3974
    .line 3975
    .line 3976
    .line 3977
    .line 3978
    .line 3979
    .line 3980
    .line 3981
    .line 3982
    .line 3983
    .line 3984
    .line 3985
    .line 3986
    .line 3987
    .line 3988
    .line 3989
    .line 3990
    .line 3991
    .line 3992
    .line 3993
    .line 3994
    .line 3995
    .line 3996
    .line 3997
    .line 3998
    .line 3999
    .line 4000
    .line 4001
    .line 4002
    .line 4003
    .line 4004
    .line 4005
    .line 4006
    .line 4007
    .line 4008
    .line 4009
    .line 4010
    .line 4011
    .line 4012
    .line 4013
    .line 4014
    .line 4015
    .line 4016
    .line 4017
    .line 4018
    .line 4019
    .line 4020
    .line 4021
    .line 4022
    .line 4023
    .line 4024
    .line 4025
    .line 4026
    .line 4027
    .line 4028
    .line 4029
    .line 4030
    .line 4031
    .line 4032
    .line 4033
    .line 4034
    .line 4035
    .line 4036
    .line 4037
    .line 4038
    .line 4039
    .line 4040
    .line 4041
    .line 4042
    .line 4043
    .line 4044
    .line 4045
    .line 4046
    .line 4047
    .line 4048
    .line 4049
    .line 4050
    .line 4051
    .line 4052
    .line 4053
    .line 4054
    .line 4055
    .line 4056
    .line 4057
    .line 4058
    .line 4059
    .line 4060
    .line 4061
    .line 4062
    .line 4063
    .line 4064
    .line 4065
    .line 4066
    .line 4067
    .line 4068
    .line 4069
    .line 4070
    .line 4071
    .line 4072
    .line 4073
    .line 4074
    .line 4075
    .line 4076
    .line 4077
    .line 4078
    .line 4079
    .line 4080
    .line 4081
    .line 4082
    .line 4083
    .line 4084
    .line 4085
    .line 4086
    .line 4087
    .line 4088
    .line 4089
    .line 4090
    .line 4091
    .line 4092
    .line 4093
    .line 4094
    .line 4095
    .line 4096
    .line 4097
    .line 4098
    .line 4099
    .line 4100
    .line 4101
    .line 4102
    .line 4103
    .line 4104
    .line 4105
    .line 4106
    .line 4107
    .line 4108
    .line 4109
    .line 4110
    .line 4111
    .line 4112
    .line 4113
    .line 4114
    .line 4115
    .line 4116
    .line 4117
    .line 4118
    .line 4119
    .line 4120
    .line 4121
    .line 4122
    .line 4123
    .line 4124
    .line 4125
    .line 4126
    .line 4127
    .line 4128
    .line 4129
    .line 4130
    .line 4131
    .line 4132
    .line 4133
    .line 4134
    .line 4135
    .line 4136
    .line 4137
    .line 4138
    .line 4139
    .line 4140
    .line 4141
    .line 4142
    .line 4143
    .line 4144
    .line 4145
    .line 4146
    .line 4147
    .line 4148
    .line 4149
    .line 4150
    .line 4151
    .line 4152
    .line 4153
    .line 4154
    .line 4155
    .line 4156
    .line 4157
    .line 4158
    .line 4159
    .line 4160
    .line 4161
    .line 4162
    .line 4163
    .line 4164
    .line 4165
    .line 4166
    .line 4167
    .line 4168
    .line 4169
    .line 4170
    .line 4171
    .line 4172
    .line 4173
    .line 4174
    .line 4175
    .line 4176
    .line 4177
    .line 4178
    .line 4179
    .line 4180
    .line 4181
    .line 4182
    .line 4183
    .line 4184
    .line 4185
    .line 4186
    .line 4187
    .line 4188
    .line 4189
    .line 4190
    .line 4191
    .line 4192
    .line 4193
    .line 4194
    .line 4195
    .line 4196
    .line 4197
    .line 4198
    .line 4199
    .line 4200
    .line 4201
    .line 4202
    .line 4203
    .line 4204
    .line 4205
    .line 4206
    .line 4207
    .line 4208
    .line 4209
    .line 4210
    .line 4211
    .line 4212
    .line 4213
    .line 4214
    .line 4215
    .line 4216
    .line 4217
    .line 4218
    .line 4219
    .line 4220
    .line 4221
    .line 4222
    .line 4223
    .line 4224
    .line 4225
    .line 4226
    .line 4227
    .line 4228
    .line 4229
    .line 4230
    .line 4231
    .line 4232
    .line 4233
    .line 4234
    .line 4235
    .line 4236
    .line 4237
    .line 4238
    .line 4239
    .line 4240
    .line 4241
    .line 4242
    .line 4243
    .line 4244
    .line 4245
    .line 4246
    .line 4247
    .line 4248
    .line 4249
    .line 4250
    .line 4251
    .line 4252
    .line 4253
    .line 4254
    .line 4255
    .line 4256
    .line 4257
    .line 4258
    .line 4259
    .line 4260
    .line 4261
    .line 4262
    .line 4263
    .line 4264
    .line 4265
    .line 4266
    .line 4267
    .line 4268
    .line 4269
    .line 4270
    .line 4271
    .line 4272
    .line 4273
    .line 4274
    .line 4275
    .line 4276
    .line 4277
    .line 4278
    .line 4279
    .line 4280
    .line 4281
    .line 4282
    .line 4283
    .line 4284
    .line 4285
    .line 4286
    .line 4287
    .line 4288
    .line 4289
    .line 4290
    .line 4291
    .line 4292
    .line 4293
    .line 4294
    .line 4295
    .line 4296
    .line 4297
    .line 4298
    .line 4299
    .line 4300
    .line 4301
    .line 4302
    .line 4303
    .line 4304
    .line 4305
    .line 4306
    .line 4307
    .line 4308
    .line 4309
    .line 4310
    .line 4311
    .line 4312
    .line 4313
    .line 4314
    .line 4315
    .line 4316
    .line 4317
    .line 4318
    .line 4319
    .line 4320
    .line 4321
    .line 4322
    .line 4323
    .line 4324
    .line 4325
    .line 4326
    .line 4327
    .line 4328
    .line 4329
    .line 4330
    .line 4331
    .line 4332
    .line 4333
    .line 4334
    .line 4335
    .line 4336
    .line 4337
    .line 4338
    .line 4339
    .line 4340
    .line 4341
    .line 4342
    .line 4343
    .line 4344
    .line 4345
    .line 4346
    .line 4347
    .line 4348
    .line 4349
    .line 4350
    .line 4351
    .line 4352
    .line 4353
    .line 4354
    .line 4355
    .line 4356
    .line 4357
    .line 4358
    .line 4359
    .line 4360
    .line 4361
    .line 4362
    .line 4363
    .line 4364
    .line 4365
    .line 4366
    .line 4367
    .line 4368
    .line 4369
    .line 4370
    .line 4371
    .line 4372
    .line 4373
    .line 4374
    .line 4375
    .line 4376
    .line 4377
    .line 4378
    .line 4379
    .line 4380
    .line 4381
    .line 4382
    .line 4383
    .line 4384
    .line 4385
    .line 4386
    .line 4387
    .line 4388
    .line 4389
    .line 4390
    .line 4391
    .line 4392
    .line 4393
    .line 4394
    .line 4395
    .line 4396
    .line 4397
    .line 4398
    .line 4399
    .line 4400
    .line 4401
    .line 4402
    .line 4403
    .line 4404
    .line 4405
    .line 4406
    .line 4407
    .line 4408
    .line 4409
    .line 4410
    .line 4411
    .line 4412
    .line 4413
    .line 4414
    .line 4415
    .line 4416
    .line 4417
    .line 4418
    .line 4419
    .line 4420
    .line 4421
    .line 4422
    .line 4423
    .line 4424
    .line 4425
    .line 4426
    .line 4427
    .line 4428
    .line 4429
    .line 4430
    .line 4431
    .line 4432
    .line 4433
    .line 4434
    .line 4435
    .line 4436
    .line 4437
    .line 4438
    .line 4439
    .line 4440
    .line 4441
    .line 4442
    .line 4443
    .line 4444
    .line 4445
    .line 4446
    .line 4447
    .line 4448
    .line 4449
    .line 4450
    .line 4451
    .line 4452
    .line 4453
    .line 4454
    .line 4455
    .line 4456
    .line 4457
    .line 4458
    .line 4459
    .line 4460
    .line 4461
    .line 4462
    .line 4463
    .line 4464
    .line 4465
    .line 4466
    .line 4467
    .line 4468
    .line 4469
    .line 4470
    .line 4471
    .line 4472
    .line 4473
    .line 4474
    .line 4475
    .line 4476
    .line 4477
    .line 4478
    .line 4479
    .line 4480
    .line 4481
    .line 4482
    .line 4483
    .line 4484
    .line 4485
    .line 4486
    .line 4487
    .line 4488
    .line 4489
    .line 4490
    .line 4491
    .line 4492
    .line 4493
    .line 4494
    .line 4495
    .line 4496
    .line 4497
    .line 4498
    .line 4499
    .line 4500
    .line 4501
    .line 4502
    .line 4503
    .line 4504
    .line 4505
    .line 4506
    .line 4507
    .line 4508
    .line 4509
    .line 4510
    .line 4511
    .line 4512
    .line 4513
    .line 4514
    .line 4515
    .line 4516
    .line 4517
    .line 4518
    .line 4519
    .line 4520
    .line 4521
    .line 4522
    .line 4523
    .line 4524
    .line 4525
    .line 4526
    .line 4527
    .line 4528
    .line 4529
    .line 4530
    .line 4531
    .line 4532
    .line 4533
    .line 4534
    .line 4535
    .line 4536
    .line 4537
    .line 4538
    .line 4539
    .line 4540
    .line 4541
    .line 4542
    .line 4543
    .line 4544
    .line 4545
    .line 4546
    .line 4547
    .line 4548
    .line 4549
    .line 4550
    .line 4551
    .line 4552
    .line 4553
    .line 4554
    .line 4555
    .line 4556
    .line 4557
    .line 4558
    .line 4559
    .line 4560
    .line 4561
    .line 4562
    .line 4563
    .line 4564
    .line 4565
    .line 4566
    .line 4567
    .line 4568
    .line 4569
    .line 4570
    .line 4571
    .line 4572
    .line 4573
    .line 4574
    .line 4575
    .line 4576
    .line 4577
    .line 4578
    .line 4579
    .line 4580
    .line 4581
    .line 4582
    .line 4583
    .line 4584
    .line 4585
    .line 4586
    .line 4587
    .line 4588
    .line 4589
    .line 4590
    .line 4591
    .line 4592
    .line 4593
    .line 4594
    .line 4595
    .line 4596
    .line 4597
    .line 4598
    .line 4599
    .line 4600
    .line 4601
    .line 4602
    .line 4603
    .line 4604
    .line 4605
    .line 4606
    .line 4607
    .line 4608
    .line 4609
    .line 4610
    .line 4611
    .line 4612
    .line 4613
    .line 4614
    .line 4615
    .line 4616
    .line 4617
    .line 4618
.end method

.method public setBaselineAligned(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->a:Z

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public setBaselineAlignedChildIndex(I)V
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->b:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "base aligned child index out of range (0, "

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ")"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
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

.method public setDividerDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->k:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->k:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->l:I

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iput v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->l:I

    .line 25
    .line 26
    iput v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->m:I

    .line 27
    .line 28
    :goto_0
    if-nez p1, :cond_2

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 35
    .line 36
    .line 37
    return-void
    .line 38
.end method

.method public setDividerPadding(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->o:I

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public setGravity(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    const v0, 0x800007

    .line 6
    .line 7
    .line 8
    and-int/2addr v0, p1

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const v0, 0x800003

    .line 12
    .line 13
    .line 14
    or-int/2addr p1, v0

    .line 15
    :cond_0
    and-int/lit8 v0, p1, 0x70

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    or-int/lit8 p1, p1, 0x30

    .line 20
    .line 21
    :cond_1
    iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 24
    .line 25
    .line 26
    :cond_2
    return-void
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

.method public setHorizontalGravity(I)V
    .locals 2

    .line 1
    const v0, 0x800007

    .line 2
    .line 3
    .line 4
    and-int/2addr p1, v0

    .line 5
    iget v1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I

    .line 6
    .line 7
    and-int/2addr v0, v1

    .line 8
    if-eq v0, p1, :cond_0

    .line 9
    .line 10
    const v0, -0x800008

    .line 11
    .line 12
    .line 13
    and-int/2addr v0, v1

    .line 14
    or-int/2addr p1, v0

    .line 15
    iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
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

.method public setMeasureWithLargestChildEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->h:Z

    .line 2
    .line 3
    return-void
    .line 4
    .line 5
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public setOrientation(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->d:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->d:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public setShowDividers(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->n:I

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->n:I

    .line 9
    .line 10
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public setVerticalGravity(I)V
    .locals 2

    .line 1
    and-int/lit8 p1, p1, 0x70

    .line 2
    .line 3
    iget v0, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I

    .line 4
    .line 5
    and-int/lit8 v1, v0, 0x70

    .line 6
    .line 7
    if-eq v1, p1, :cond_0

    .line 8
    .line 9
    and-int/lit8 v0, v0, -0x71

    .line 10
    .line 11
    or-int/2addr p1, v0

    .line 12
    iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->e:I

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public setWeightSum(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    iput p1, p0, Landroidx/appcompat/widget/LinearLayoutCompat;->g:F

    .line 7
    .line 8
    return-void
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
