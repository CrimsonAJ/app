.class public final LI5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LI5/j;


# direct methods
.method public synthetic constructor <init>(LI5/j;I)V
    .locals 0

    .line 1
    iput p2, p0, LI5/d;->a:I

    iput-object p1, p0, LI5/d;->b:LI5/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, LI5/d;->b:LI5/j;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget v4, p0, LI5/d;->a:I

    .line 7
    .line 8
    packed-switch v4, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v4, v0, LI5/j;->i:LI5/i;

    .line 12
    .line 13
    if-nez v4, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-object v5, v0, LI5/j;->i:LI5/i;

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {v5}, LI5/i;->getAnimationMode()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-ne v4, v2, :cond_2

    .line 33
    .line 34
    new-array v4, v1, [F

    .line 35
    .line 36
    fill-array-data v4, :array_0

    .line 37
    .line 38
    .line 39
    invoke-static {v4}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-object v5, v0, LI5/j;->d:Landroid/animation/TimeInterpolator;

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 46
    .line 47
    .line 48
    new-instance v5, LI5/b;

    .line 49
    .line 50
    invoke-direct {v5, v0, v3, v3}, LI5/b;-><init>(LI5/j;IB)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 54
    .line 55
    .line 56
    new-array v5, v1, [F

    .line 57
    .line 58
    fill-array-data v5, :array_1

    .line 59
    .line 60
    .line 61
    invoke-static {v5}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    iget-object v6, v0, LI5/j;->f:Landroid/animation/TimeInterpolator;

    .line 66
    .line 67
    invoke-virtual {v5, v6}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 68
    .line 69
    .line 70
    new-instance v6, LI5/b;

    .line 71
    .line 72
    invoke-direct {v6, v0, v2, v3}, LI5/b;-><init>(LI5/j;IB)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 76
    .line 77
    .line 78
    new-instance v6, Landroid/animation/AnimatorSet;

    .line 79
    .line 80
    invoke-direct {v6}, Landroid/animation/AnimatorSet;-><init>()V

    .line 81
    .line 82
    .line 83
    new-array v1, v1, [Landroid/animation/Animator;

    .line 84
    .line 85
    aput-object v4, v1, v3

    .line 86
    .line 87
    aput-object v5, v1, v2

    .line 88
    .line 89
    invoke-virtual {v6, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 90
    .line 91
    .line 92
    iget v1, v0, LI5/j;->a:I

    .line 93
    .line 94
    int-to-long v1, v1

    .line 95
    invoke-virtual {v6, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 96
    .line 97
    .line 98
    new-instance v1, LI5/a;

    .line 99
    .line 100
    const/4 v2, 0x3

    .line 101
    invoke-direct {v1, v0, v2}, LI5/a;-><init>(LI5/j;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6}, Landroid/animation/AnimatorSet;->start()V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_2
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    instance-of v6, v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 120
    .line 121
    if-eqz v6, :cond_3

    .line 122
    .line 123
    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 124
    .line 125
    iget v4, v4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 126
    .line 127
    add-int/2addr v1, v4

    .line 128
    :cond_3
    int-to-float v4, v1

    .line 129
    invoke-virtual {v5, v4}, Landroid/view/View;->setTranslationY(F)V

    .line 130
    .line 131
    .line 132
    new-instance v4, Landroid/animation/ValueAnimator;

    .line 133
    .line 134
    invoke-direct {v4}, Landroid/animation/ValueAnimator;-><init>()V

    .line 135
    .line 136
    .line 137
    filled-new-array {v1, v3}, [I

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v4, v3}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    .line 142
    .line 143
    .line 144
    iget-object v3, v0, LI5/j;->e:Landroid/animation/TimeInterpolator;

    .line 145
    .line 146
    invoke-virtual {v4, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 147
    .line 148
    .line 149
    iget v3, v0, LI5/j;->c:I

    .line 150
    .line 151
    int-to-long v5, v3

    .line 152
    invoke-virtual {v4, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 153
    .line 154
    .line 155
    new-instance v3, LI5/a;

    .line 156
    .line 157
    invoke-direct {v3, v0, v2}, LI5/a;-><init>(LI5/j;I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 161
    .line 162
    .line 163
    new-instance v2, LI5/b;

    .line 164
    .line 165
    invoke-direct {v2, v0, v1}, LI5/b;-><init>(LI5/j;I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->start()V

    .line 172
    .line 173
    .line 174
    :goto_0
    return-void

    .line 175
    :pswitch_0
    invoke-virtual {v0}, LI5/j;->c()V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :pswitch_1
    iget-object v3, v0, LI5/j;->i:LI5/i;

    .line 180
    .line 181
    if-eqz v3, :cond_7

    .line 182
    .line 183
    iget-object v3, v0, LI5/j;->h:Landroid/content/Context;

    .line 184
    .line 185
    sget v4, Lw5/p;->d:I

    .line 186
    .line 187
    const-string v4, "window"

    .line 188
    .line 189
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    check-cast v3, Landroid/view/WindowManager;

    .line 194
    .line 195
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 196
    .line 197
    const/16 v5, 0x1e

    .line 198
    .line 199
    if-lt v4, v5, :cond_4

    .line 200
    .line 201
    invoke-static {v3}, Lt0/f;->j(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-static {v3}, Lt0/f;->c(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    goto :goto_1

    .line 210
    :cond_4
    invoke-interface {v3}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    new-instance v4, Landroid/graphics/Point;

    .line 215
    .line 216
    invoke-direct {v4}, Landroid/graphics/Point;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v3, v4}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 220
    .line 221
    .line 222
    new-instance v3, Landroid/graphics/Rect;

    .line 223
    .line 224
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 225
    .line 226
    .line 227
    iget v5, v4, Landroid/graphics/Point;->x:I

    .line 228
    .line 229
    iput v5, v3, Landroid/graphics/Rect;->right:I

    .line 230
    .line 231
    iget v4, v4, Landroid/graphics/Point;->y:I

    .line 232
    .line 233
    iput v4, v3, Landroid/graphics/Rect;->bottom:I

    .line 234
    .line 235
    :goto_1
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    new-array v1, v1, [I

    .line 240
    .line 241
    iget-object v4, v0, LI5/j;->i:LI5/i;

    .line 242
    .line 243
    invoke-virtual {v4, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 244
    .line 245
    .line 246
    aget v1, v1, v2

    .line 247
    .line 248
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    add-int/2addr v2, v1

    .line 253
    sub-int/2addr v3, v2

    .line 254
    invoke-virtual {v4}, Landroid/view/View;->getTranslationY()F

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    float-to-int v1, v1

    .line 259
    add-int/2addr v3, v1

    .line 260
    iget v1, v0, LI5/j;->q:I

    .line 261
    .line 262
    if-lt v3, v1, :cond_5

    .line 263
    .line 264
    iput v1, v0, LI5/j;->r:I

    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_5
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    instance-of v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 272
    .line 273
    if-nez v2, :cond_6

    .line 274
    .line 275
    sget-object v0, LI5/j;->A:Ljava/lang/String;

    .line 276
    .line 277
    const-string v1, "Unable to apply gesture inset because layout params are not MarginLayoutParams"

    .line 278
    .line 279
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 280
    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_6
    iget v2, v0, LI5/j;->q:I

    .line 284
    .line 285
    iput v2, v0, LI5/j;->r:I

    .line 286
    .line 287
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 288
    .line 289
    iget v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 290
    .line 291
    sub-int/2addr v2, v3

    .line 292
    add-int/2addr v2, v0

    .line 293
    iput v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 294
    .line 295
    invoke-virtual {v4}, Landroid/view/View;->requestLayout()V

    .line 296
    .line 297
    .line 298
    :cond_7
    :goto_2
    return-void

    .line 299
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    :array_1
    .array-data 4
        0x3f4ccccd    # 0.8f
        0x3f800000    # 1.0f
    .end array-data
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
