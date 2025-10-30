.class public Lcom/anilab/exoplayer/StyledPlayerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic D:I


# instance fields
.field public A:Z

.field public B:I

.field public final C:Landroid/view/GestureDetector;

.field public final a:LQ2/K;

.field public final b:Lcom/anilab/exoplayer/AspectRatioFrameLayout;

.field public final c:Landroid/view/View;

.field public final d:Landroid/view/View;

.field public final e:Z

.field public final f:Landroid/widget/ImageView;

.field public final g:Lcom/anilab/exoplayer/SubtitleView;

.field public final h:Landroid/view/View;

.field public final i:Landroid/widget/TextView;

.field public final j:LQ2/D;

.field public final k:Landroid/widget/FrameLayout;

.field public final l:Landroid/widget/FrameLayout;

.field public final m:Landroid/view/View;

.field public final n:Landroid/view/View;

.field public o:Lj3/r0;

.field public p:Z

.field public q:LQ2/C;

.field public r:LQ2/M;

.field public s:Z

.field public t:Landroid/graphics/drawable/Drawable;

.field public u:I

.field public v:Z

.field public w:Ljava/lang/CharSequence;

.field public x:I

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    invoke-direct {v1, v0, v2, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 10
    .line 11
    .line 12
    new-instance v5, Landroid/view/GestureDetector;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    new-instance v7, LQ2/J;

    .line 19
    .line 20
    invoke-direct {v7, v1}, LQ2/J;-><init>(Lcom/anilab/exoplayer/StyledPlayerView;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v5, v6, v7}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 24
    .line 25
    .line 26
    iput-object v5, v1, Lcom/anilab/exoplayer/StyledPlayerView;->C:Landroid/view/GestureDetector;

    .line 27
    .line 28
    new-instance v5, LQ2/K;

    .line 29
    .line 30
    invoke-direct {v5, v1}, LQ2/K;-><init>(Lcom/anilab/exoplayer/StyledPlayerView;)V

    .line 31
    .line 32
    .line 33
    iput-object v5, v1, Lcom/anilab/exoplayer/StyledPlayerView;->a:LQ2/K;

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/view/View;->isInEditMode()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const/4 v7, 0x0

    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->b:Lcom/anilab/exoplayer/AspectRatioFrameLayout;

    .line 43
    .line 44
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->c:Landroid/view/View;

    .line 45
    .line 46
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->d:Landroid/view/View;

    .line 47
    .line 48
    iput-boolean v4, v1, Lcom/anilab/exoplayer/StyledPlayerView;->e:Z

    .line 49
    .line 50
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->f:Landroid/widget/ImageView;

    .line 51
    .line 52
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->g:Lcom/anilab/exoplayer/SubtitleView;

    .line 53
    .line 54
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->h:Landroid/view/View;

    .line 55
    .line 56
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->i:Landroid/widget/TextView;

    .line 57
    .line 58
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 59
    .line 60
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->k:Landroid/widget/FrameLayout;

    .line 61
    .line 62
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->l:Landroid/widget/FrameLayout;

    .line 63
    .line 64
    new-instance v2, Landroid/widget/ImageView;

    .line 65
    .line 66
    invoke-direct {v2, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 67
    .line 68
    .line 69
    sget v0, Ll4/y;->a:I

    .line 70
    .line 71
    const/16 v3, 0x17

    .line 72
    .line 73
    const v4, 0x7f0600b3

    .line 74
    .line 75
    .line 76
    const v5, 0x7f080113

    .line 77
    .line 78
    .line 79
    if-lt v0, v3, :cond_0

    .line 80
    .line 81
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0, v5, v7}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v4, v7}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 116
    .line 117
    .line 118
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_1
    const/16 v8, 0x8

    .line 123
    .line 124
    const v9, 0x7f0d0043

    .line 125
    .line 126
    .line 127
    const/16 v10, 0x1388

    .line 128
    .line 129
    if-eqz v2, :cond_2

    .line 130
    .line 131
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 132
    .line 133
    .line 134
    move-result-object v11

    .line 135
    sget-object v12, LQ2/h;->e:[I

    .line 136
    .line 137
    invoke-virtual {v11, v2, v12, v4, v4}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    const/16 v12, 0x1b

    .line 142
    .line 143
    :try_start_0
    invoke-virtual {v11, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 144
    .line 145
    .line 146
    move-result v13

    .line 147
    invoke-virtual {v11, v12, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 148
    .line 149
    .line 150
    move-result v12

    .line 151
    const/16 v14, 0xe

    .line 152
    .line 153
    invoke-virtual {v11, v14, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    const/16 v14, 0x20

    .line 158
    .line 159
    invoke-virtual {v11, v14, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 160
    .line 161
    .line 162
    move-result v14

    .line 163
    invoke-virtual {v11, v8, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 164
    .line 165
    .line 166
    move-result v15

    .line 167
    const/16 v8, 0x21

    .line 168
    .line 169
    invoke-virtual {v11, v8, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    const/16 v7, 0x1c

    .line 174
    .line 175
    invoke-virtual {v11, v7, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    const/16 v6, 0x10

    .line 180
    .line 181
    invoke-virtual {v11, v6, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    const/16 v4, 0x19

    .line 186
    .line 187
    invoke-virtual {v11, v4, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    const/16 v4, 0xa

    .line 192
    .line 193
    invoke-virtual {v11, v4, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    move/from16 v17, v4

    .line 198
    .line 199
    const/4 v4, 0x3

    .line 200
    invoke-virtual {v11, v4, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 201
    .line 202
    .line 203
    move-result v18

    .line 204
    const/16 v4, 0x16

    .line 205
    .line 206
    const/4 v3, 0x0

    .line 207
    invoke-virtual {v11, v4, v3}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    iget-boolean v3, v1, Lcom/anilab/exoplayer/StyledPlayerView;->v:Z

    .line 212
    .line 213
    move/from16 v19, v4

    .line 214
    .line 215
    const/16 v4, 0xb

    .line 216
    .line 217
    invoke-virtual {v11, v4, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 218
    .line 219
    .line 220
    move-result v3

    .line 221
    iput-boolean v3, v1, Lcom/anilab/exoplayer/StyledPlayerView;->v:Z

    .line 222
    .line 223
    const/16 v3, 0x9

    .line 224
    .line 225
    const/4 v4, 0x1

    .line 226
    invoke-virtual {v11, v3, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 227
    .line 228
    .line 229
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 230
    invoke-virtual {v11}, Landroid/content/res/TypedArray;->recycle()V

    .line 231
    .line 232
    .line 233
    move v4, v10

    .line 234
    move v10, v9

    .line 235
    move/from16 v9, v18

    .line 236
    .line 237
    move/from16 v18, v4

    .line 238
    .line 239
    move/from16 v4, v17

    .line 240
    .line 241
    move/from16 v17, v8

    .line 242
    .line 243
    move v8, v7

    .line 244
    move v7, v6

    .line 245
    move v6, v3

    .line 246
    move/from16 v3, v19

    .line 247
    .line 248
    goto :goto_1

    .line 249
    :catchall_0
    move-exception v0

    .line 250
    invoke-virtual {v11}, Landroid/content/res/TypedArray;->recycle()V

    .line 251
    .line 252
    .line 253
    throw v0

    .line 254
    :cond_2
    move/from16 v18, v10

    .line 255
    .line 256
    const/4 v3, 0x0

    .line 257
    const/4 v4, 0x1

    .line 258
    const/4 v6, 0x1

    .line 259
    const/4 v7, 0x0

    .line 260
    const/4 v8, 0x1

    .line 261
    const/4 v12, 0x0

    .line 262
    const/4 v13, 0x0

    .line 263
    const/4 v14, 0x1

    .line 264
    const/4 v15, 0x0

    .line 265
    const/16 v17, 0x1

    .line 266
    .line 267
    move v10, v9

    .line 268
    const/4 v9, 0x1

    .line 269
    :goto_1
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 270
    .line 271
    .line 272
    move-result-object v11

    .line 273
    invoke-virtual {v11, v10, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 274
    .line 275
    .line 276
    const/high16 v10, 0x40000

    .line 277
    .line 278
    invoke-virtual {v1, v10}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 279
    .line 280
    .line 281
    const v10, 0x7f0a013c

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 285
    .line 286
    .line 287
    move-result-object v10

    .line 288
    check-cast v10, Lcom/anilab/exoplayer/AspectRatioFrameLayout;

    .line 289
    .line 290
    iput-object v10, v1, Lcom/anilab/exoplayer/StyledPlayerView;->b:Lcom/anilab/exoplayer/AspectRatioFrameLayout;

    .line 291
    .line 292
    if-eqz v10, :cond_3

    .line 293
    .line 294
    invoke-virtual {v10, v7}, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->setResizeMode(I)V

    .line 295
    .line 296
    .line 297
    :cond_3
    const v7, 0x7f0a015d

    .line 298
    .line 299
    .line 300
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->c:Landroid/view/View;

    .line 305
    .line 306
    if-eqz v7, :cond_4

    .line 307
    .line 308
    if-eqz v13, :cond_4

    .line 309
    .line 310
    invoke-virtual {v7, v12}, Landroid/view/View;->setBackgroundColor(I)V

    .line 311
    .line 312
    .line 313
    :cond_4
    const/4 v7, 0x2

    .line 314
    if-eqz v10, :cond_8

    .line 315
    .line 316
    if-eqz v8, :cond_8

    .line 317
    .line 318
    new-instance v11, Landroid/view/ViewGroup$LayoutParams;

    .line 319
    .line 320
    const/4 v12, -0x1

    .line 321
    invoke-direct {v11, v12, v12}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 322
    .line 323
    .line 324
    if-eq v8, v7, :cond_7

    .line 325
    .line 326
    const-class v12, Landroid/content/Context;

    .line 327
    .line 328
    const/4 v13, 0x3

    .line 329
    if-eq v8, v13, :cond_6

    .line 330
    .line 331
    const/4 v13, 0x4

    .line 332
    if-eq v8, v13, :cond_5

    .line 333
    .line 334
    new-instance v8, Landroid/view/SurfaceView;

    .line 335
    .line 336
    invoke-direct {v8, v0}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 337
    .line 338
    .line 339
    iput-object v8, v1, Lcom/anilab/exoplayer/StyledPlayerView;->d:Landroid/view/View;

    .line 340
    .line 341
    goto :goto_2

    .line 342
    :cond_5
    :try_start_1
    const-class v8, Lm4/m;

    .line 343
    .line 344
    sget v13, Lm4/m;->b:I

    .line 345
    .line 346
    const/4 v13, 0x1

    .line 347
    new-array v7, v13, [Ljava/lang/Class;

    .line 348
    .line 349
    const/16 v16, 0x0

    .line 350
    .line 351
    aput-object v12, v7, v16

    .line 352
    .line 353
    invoke-virtual {v8, v7}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    new-array v8, v13, [Ljava/lang/Object;

    .line 358
    .line 359
    aput-object v0, v8, v16

    .line 360
    .line 361
    invoke-virtual {v7, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    check-cast v7, Landroid/view/View;

    .line 366
    .line 367
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->d:Landroid/view/View;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 368
    .line 369
    goto :goto_2

    .line 370
    :catch_0
    move-exception v0

    .line 371
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 372
    .line 373
    const-string v3, "video_decoder_gl_surface_view requires an ExoPlayer dependency"

    .line 374
    .line 375
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 376
    .line 377
    .line 378
    throw v2

    .line 379
    :cond_6
    :try_start_2
    const-class v7, Ln4/k;

    .line 380
    .line 381
    sget v8, Ln4/k;->l:I

    .line 382
    .line 383
    const/4 v13, 0x1

    .line 384
    new-array v8, v13, [Ljava/lang/Class;

    .line 385
    .line 386
    const/16 v16, 0x0

    .line 387
    .line 388
    aput-object v12, v8, v16

    .line 389
    .line 390
    invoke-virtual {v7, v8}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 391
    .line 392
    .line 393
    move-result-object v7

    .line 394
    new-array v8, v13, [Ljava/lang/Object;

    .line 395
    .line 396
    aput-object v0, v8, v16

    .line 397
    .line 398
    invoke-virtual {v7, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v7

    .line 402
    check-cast v7, Landroid/view/View;

    .line 403
    .line 404
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->d:Landroid/view/View;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 405
    .line 406
    const/4 v7, 0x1

    .line 407
    goto :goto_3

    .line 408
    :catch_1
    move-exception v0

    .line 409
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 410
    .line 411
    const-string v3, "spherical_gl_surface_view requires an ExoPlayer dependency"

    .line 412
    .line 413
    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 414
    .line 415
    .line 416
    throw v2

    .line 417
    :cond_7
    new-instance v7, Landroid/view/TextureView;

    .line 418
    .line 419
    invoke-direct {v7, v0}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    .line 420
    .line 421
    .line 422
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->d:Landroid/view/View;

    .line 423
    .line 424
    :goto_2
    const/4 v7, 0x0

    .line 425
    :goto_3
    iget-object v8, v1, Lcom/anilab/exoplayer/StyledPlayerView;->d:Landroid/view/View;

    .line 426
    .line 427
    invoke-virtual {v8, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 428
    .line 429
    .line 430
    iget-object v8, v1, Lcom/anilab/exoplayer/StyledPlayerView;->d:Landroid/view/View;

    .line 431
    .line 432
    invoke-virtual {v8, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 433
    .line 434
    .line 435
    iget-object v8, v1, Lcom/anilab/exoplayer/StyledPlayerView;->d:Landroid/view/View;

    .line 436
    .line 437
    const/4 v11, 0x0

    .line 438
    invoke-virtual {v8, v11}, Landroid/view/View;->setClickable(Z)V

    .line 439
    .line 440
    .line 441
    iget-object v8, v1, Lcom/anilab/exoplayer/StyledPlayerView;->d:Landroid/view/View;

    .line 442
    .line 443
    invoke-virtual {v10, v8, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 444
    .line 445
    .line 446
    goto :goto_4

    .line 447
    :cond_8
    const/4 v11, 0x0

    .line 448
    const/4 v7, 0x0

    .line 449
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->d:Landroid/view/View;

    .line 450
    .line 451
    move v7, v11

    .line 452
    :goto_4
    iput-boolean v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->e:Z

    .line 453
    .line 454
    const v7, 0x7f0a0134

    .line 455
    .line 456
    .line 457
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 458
    .line 459
    .line 460
    move-result-object v7

    .line 461
    check-cast v7, Landroid/widget/FrameLayout;

    .line 462
    .line 463
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->k:Landroid/widget/FrameLayout;

    .line 464
    .line 465
    const v7, 0x7f0a014e

    .line 466
    .line 467
    .line 468
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 469
    .line 470
    .line 471
    move-result-object v7

    .line 472
    check-cast v7, Landroid/widget/FrameLayout;

    .line 473
    .line 474
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->l:Landroid/widget/FrameLayout;

    .line 475
    .line 476
    const v7, 0x7f0a0135

    .line 477
    .line 478
    .line 479
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 480
    .line 481
    .line 482
    move-result-object v7

    .line 483
    check-cast v7, Landroid/widget/ImageView;

    .line 484
    .line 485
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->f:Landroid/widget/ImageView;

    .line 486
    .line 487
    if-eqz v14, :cond_9

    .line 488
    .line 489
    if-eqz v7, :cond_9

    .line 490
    .line 491
    const/4 v7, 0x1

    .line 492
    goto :goto_5

    .line 493
    :cond_9
    move v7, v11

    .line 494
    :goto_5
    iput-boolean v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->s:Z

    .line 495
    .line 496
    if-eqz v15, :cond_a

    .line 497
    .line 498
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 499
    .line 500
    .line 501
    move-result-object v7

    .line 502
    invoke-virtual {v7, v15}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 503
    .line 504
    .line 505
    move-result-object v7

    .line 506
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->t:Landroid/graphics/drawable/Drawable;

    .line 507
    .line 508
    :cond_a
    const v7, 0x7f0a0160

    .line 509
    .line 510
    .line 511
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 512
    .line 513
    .line 514
    move-result-object v7

    .line 515
    check-cast v7, Lcom/anilab/exoplayer/SubtitleView;

    .line 516
    .line 517
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->g:Lcom/anilab/exoplayer/SubtitleView;

    .line 518
    .line 519
    if-eqz v7, :cond_b

    .line 520
    .line 521
    invoke-virtual {v7}, Lcom/anilab/exoplayer/SubtitleView;->a()V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v7}, Lcom/anilab/exoplayer/SubtitleView;->b()V

    .line 525
    .line 526
    .line 527
    :cond_b
    const v7, 0x7f0a01bd

    .line 528
    .line 529
    .line 530
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 531
    .line 532
    .line 533
    move-result-object v7

    .line 534
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->m:Landroid/view/View;

    .line 535
    .line 536
    const v7, 0x7f0a01be

    .line 537
    .line 538
    .line 539
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 540
    .line 541
    .line 542
    move-result-object v7

    .line 543
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->n:Landroid/view/View;

    .line 544
    .line 545
    const v7, 0x7f0a0139

    .line 546
    .line 547
    .line 548
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 549
    .line 550
    .line 551
    move-result-object v7

    .line 552
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->h:Landroid/view/View;

    .line 553
    .line 554
    const/16 v8, 0x8

    .line 555
    .line 556
    if-eqz v7, :cond_c

    .line 557
    .line 558
    invoke-virtual {v7, v8}, Landroid/view/View;->setVisibility(I)V

    .line 559
    .line 560
    .line 561
    :cond_c
    iput v3, v1, Lcom/anilab/exoplayer/StyledPlayerView;->u:I

    .line 562
    .line 563
    const v3, 0x7f0a0141

    .line 564
    .line 565
    .line 566
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 567
    .line 568
    .line 569
    move-result-object v3

    .line 570
    check-cast v3, Landroid/widget/TextView;

    .line 571
    .line 572
    iput-object v3, v1, Lcom/anilab/exoplayer/StyledPlayerView;->i:Landroid/widget/TextView;

    .line 573
    .line 574
    if-eqz v3, :cond_d

    .line 575
    .line 576
    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 577
    .line 578
    .line 579
    :cond_d
    const v3, 0x7f0a013d

    .line 580
    .line 581
    .line 582
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 583
    .line 584
    .line 585
    move-result-object v7

    .line 586
    check-cast v7, LQ2/D;

    .line 587
    .line 588
    const v8, 0x7f0a013e

    .line 589
    .line 590
    .line 591
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 592
    .line 593
    .line 594
    move-result-object v8

    .line 595
    if-eqz v7, :cond_e

    .line 596
    .line 597
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 598
    .line 599
    goto :goto_6

    .line 600
    :cond_e
    if-eqz v8, :cond_f

    .line 601
    .line 602
    new-instance v7, LQ2/D;

    .line 603
    .line 604
    invoke-direct {v7, v0, v2}, LQ2/D;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 605
    .line 606
    .line 607
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 608
    .line 609
    invoke-virtual {v7, v3}, Landroid/view/View;->setId(I)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    invoke-virtual {v7, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    check-cast v0, Landroid/view/ViewGroup;

    .line 624
    .line 625
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v0, v7, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 633
    .line 634
    .line 635
    goto :goto_6

    .line 636
    :cond_f
    const/4 v7, 0x0

    .line 637
    iput-object v7, v1, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 638
    .line 639
    :goto_6
    iget-object v0, v1, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 640
    .line 641
    if-eqz v0, :cond_10

    .line 642
    .line 643
    move/from16 v3, v18

    .line 644
    .line 645
    goto :goto_7

    .line 646
    :cond_10
    move v3, v11

    .line 647
    :goto_7
    iput v3, v1, Lcom/anilab/exoplayer/StyledPlayerView;->x:I

    .line 648
    .line 649
    iput-boolean v4, v1, Lcom/anilab/exoplayer/StyledPlayerView;->A:Z

    .line 650
    .line 651
    iput-boolean v9, v1, Lcom/anilab/exoplayer/StyledPlayerView;->y:Z

    .line 652
    .line 653
    iput-boolean v6, v1, Lcom/anilab/exoplayer/StyledPlayerView;->z:Z

    .line 654
    .line 655
    if-eqz v17, :cond_11

    .line 656
    .line 657
    if-eqz v0, :cond_11

    .line 658
    .line 659
    const/4 v4, 0x1

    .line 660
    goto :goto_8

    .line 661
    :cond_11
    move v4, v11

    .line 662
    :goto_8
    iput-boolean v4, v1, Lcom/anilab/exoplayer/StyledPlayerView;->p:Z

    .line 663
    .line 664
    if-eqz v0, :cond_14

    .line 665
    .line 666
    iget-object v0, v0, LQ2/D;->B0:LQ2/I;

    .line 667
    .line 668
    iget v2, v0, LQ2/I;->z:I

    .line 669
    .line 670
    const/4 v13, 0x3

    .line 671
    if-eq v2, v13, :cond_13

    .line 672
    .line 673
    const/4 v3, 0x2

    .line 674
    if-ne v2, v3, :cond_12

    .line 675
    .line 676
    goto :goto_9

    .line 677
    :cond_12
    invoke-virtual {v0}, LQ2/I;->f()V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v0, v3}, LQ2/I;->i(I)V

    .line 681
    .line 682
    .line 683
    :cond_13
    :goto_9
    iget-object v0, v1, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 684
    .line 685
    iget-object v0, v0, LQ2/D;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 686
    .line 687
    invoke-virtual {v0, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 688
    .line 689
    .line 690
    :cond_14
    if-eqz v17, :cond_15

    .line 691
    .line 692
    const/4 v13, 0x1

    .line 693
    invoke-virtual {v1, v13}, Landroid/view/View;->setClickable(Z)V

    .line 694
    .line 695
    .line 696
    :cond_15
    invoke-virtual {v1}, Lcom/anilab/exoplayer/StyledPlayerView;->j()V

    .line 697
    .line 698
    .line 699
    return-void
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
.end method

.method public static a(Lcom/anilab/exoplayer/StyledPlayerView;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, LQ2/D;->f()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x4

    .line 15
    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p0, Landroid/view/animation/AlphaAnimation;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    const/high16 v1, 0x3f800000    # 1.0f

    .line 23
    .line 24
    invoke-direct {p0, v0, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 25
    .line 26
    .line 27
    const-wide/16 v0, 0xfa

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-virtual {p0, v0}, Landroid/view/animation/Animation;->setRepeatCount(I)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x2

    .line 37
    invoke-virtual {p0, v0}, Landroid/view/animation/Animation;->setRepeatMode(I)V

    .line 38
    .line 39
    .line 40
    new-instance v0, LP1/q;

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-direct {v0, v1, p1}, LP1/q;-><init>(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static b(Landroid/view/TextureView;I)V
    .locals 6

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    int-to-float v1, v1

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    int-to-float v2, v2

    .line 16
    const/4 v3, 0x0

    .line 17
    cmpl-float v4, v1, v3

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    cmpl-float v4, v2, v3

    .line 22
    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/high16 v4, 0x40000000    # 2.0f

    .line 28
    .line 29
    div-float v5, v1, v4

    .line 30
    .line 31
    div-float v4, v2, v4

    .line 32
    .line 33
    int-to-float p1, p1

    .line 34
    invoke-virtual {v0, p1, v5, v4}, Landroid/graphics/Matrix;->postRotate(FFF)Z

    .line 35
    .line 36
    .line 37
    new-instance p1, Landroid/graphics/RectF;

    .line 38
    .line 39
    invoke-direct {p1, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 40
    .line 41
    .line 42
    new-instance v3, Landroid/graphics/RectF;

    .line 43
    .line 44
    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v3, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    div-float/2addr v1, p1

    .line 55
    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    div-float/2addr v2, p1

    .line 60
    invoke-virtual {v0, v1, v2, v5, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 61
    .line 62
    .line 63
    :cond_0
    invoke-virtual {p0, v0}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    .line 64
    .line 65
    .line 66
    return-void
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
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
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
.end method


# virtual methods
.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lj3/r0;->g()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 12
    .line 13
    invoke-interface {v0}, Lj3/r0;->m()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
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

.method public final d(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->z:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->m()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 19
    .line 20
    invoke-virtual {v0}, LQ2/D;->f()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, LQ2/D;->getShowTimeoutMs()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-gtz v0, :cond_1

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    :goto_0
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->f()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    :cond_2
    invoke-virtual {p0, v1}, Lcom/anilab/exoplayer/StyledPlayerView;->g(Z)V

    .line 46
    .line 47
    .line 48
    :cond_3
    :goto_1
    return-void
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

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lj3/r0;->g()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1

    .line 16
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/16 v1, 0x13

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x1

    .line 24
    if-eq v0, v1, :cond_2

    .line 25
    .line 26
    const/16 v1, 0x10e

    .line 27
    .line 28
    if-eq v0, v1, :cond_2

    .line 29
    .line 30
    const/16 v1, 0x16

    .line 31
    .line 32
    if-eq v0, v1, :cond_2

    .line 33
    .line 34
    const/16 v1, 0x10f

    .line 35
    .line 36
    if-eq v0, v1, :cond_2

    .line 37
    .line 38
    const/16 v1, 0x14

    .line 39
    .line 40
    if-eq v0, v1, :cond_2

    .line 41
    .line 42
    const/16 v1, 0x10d

    .line 43
    .line 44
    if-eq v0, v1, :cond_2

    .line 45
    .line 46
    const/16 v1, 0x15

    .line 47
    .line 48
    if-eq v0, v1, :cond_2

    .line 49
    .line 50
    const/16 v1, 0x10c

    .line 51
    .line 52
    if-eq v0, v1, :cond_2

    .line 53
    .line 54
    const/16 v1, 0x17

    .line 55
    .line 56
    if-ne v0, v1, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move v0, v2

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    :goto_0
    move v0, v3

    .line 62
    :goto_1
    iget-object v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->m()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_3

    .line 71
    .line 72
    invoke-virtual {v1}, LQ2/D;->f()Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_3

    .line 77
    .line 78
    invoke-virtual {p0, v3}, Lcom/anilab/exoplayer/StyledPlayerView;->d(Z)V

    .line 79
    .line 80
    .line 81
    return v3

    .line 82
    :cond_3
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->m()Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_4

    .line 87
    .line 88
    invoke-virtual {v1, p1}, LQ2/D;->b(Landroid/view/KeyEvent;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_4

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_5

    .line 100
    .line 101
    :goto_2
    invoke-virtual {p0, v3}, Lcom/anilab/exoplayer/StyledPlayerView;->d(Z)V

    .line 102
    .line 103
    .line 104
    return v3

    .line 105
    :cond_5
    if-eqz v0, :cond_6

    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->m()Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_6

    .line 112
    .line 113
    invoke-virtual {p0, v3}, Lcom/anilab/exoplayer/StyledPlayerView;->d(Z)V

    .line 114
    .line 115
    .line 116
    :cond_6
    return v2
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
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
.end method

.method public final e(Landroid/graphics/drawable/Drawable;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-lez v1, :cond_1

    .line 13
    .line 14
    if-lez v2, :cond_1

    .line 15
    .line 16
    int-to-float v1, v1

    .line 17
    int-to-float v2, v2

    .line 18
    div-float/2addr v1, v2

    .line 19
    iget-object v2, p0, Lcom/anilab/exoplayer/StyledPlayerView;->b:Lcom/anilab/exoplayer/AspectRatioFrameLayout;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->setAspectRatio(F)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->f:Landroid/widget/ImageView;

    .line 27
    .line 28
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    return p1

    .line 36
    :cond_1
    return v0
    .line 37
    .line 38
.end method

.method public final f()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-interface {v0}, Lj3/r0;->e()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-boolean v2, p0, Lcom/anilab/exoplayer/StyledPlayerView;->y:Z

    .line 12
    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    iget-object v2, p0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 16
    .line 17
    invoke-interface {v2}, Lj3/r0;->I()Lj3/E0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Lj3/E0;->p()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_2

    .line 26
    .line 27
    if-eq v0, v1, :cond_1

    .line 28
    .line 29
    const/4 v2, 0x4

    .line 30
    if-eq v0, v2, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-interface {v0}, Lj3/r0;->m()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    :cond_1
    return v1

    .line 44
    :cond_2
    const/4 v0, 0x0

    .line 45
    return v0
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

.method public final g(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->m()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    move p1, v0

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    iget p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->x:I

    .line 14
    .line 15
    :goto_0
    iget-object v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, LQ2/D;->setShowTimeoutMs(I)V

    .line 18
    .line 19
    .line 20
    iget-object p1, v1, LQ2/D;->B0:LQ2/I;

    .line 21
    .line 22
    iget-object v1, p1, LQ2/I;->a:LQ2/D;

    .line 23
    .line 24
    invoke-virtual {v1}, LQ2/D;->g()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, LQ2/D;->i()V

    .line 34
    .line 35
    .line 36
    iget-object v0, v1, LQ2/D;->f:Landroid/view/View;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {p1}, LQ2/I;->k()V

    .line 44
    .line 45
    .line 46
    return-void
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

.method public getAdOverlayInfos()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LP/v;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->l:Landroid/widget/FrameLayout;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v2, LP/v;

    .line 11
    .line 12
    invoke-direct {v2, v1}, LP/v;-><init>(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    new-instance v2, LP/v;

    .line 23
    .line 24
    invoke-direct {v2, v1}, LP/v;-><init>(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {v0}, LP5/F;->o(Ljava/util/Collection;)LP5/F;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
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

.method public getAdViewGroup()Landroid/view/ViewGroup;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->k:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    const-string v1, "exo_ad_overlay must be present for ad playback"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ll4/a;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
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

.method public getContentFrame()Lcom/anilab/exoplayer/AspectRatioFrameLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->b:Lcom/anilab/exoplayer/AspectRatioFrameLayout;

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

.method public getControllerAutoShow()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->y:Z

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

.method public getControllerHideOnTouch()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->A:Z

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

.method public getControllerShowTimeoutMs()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->x:I

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

.method public getDefaultArtwork()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->t:Landroid/graphics/drawable/Drawable;

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

.method public getOverlayFrameLayout()Landroid/widget/FrameLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->l:Landroid/widget/FrameLayout;

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

.method public getPlayer()Lj3/r0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

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

.method public getResizeMode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->b:Lcom/anilab/exoplayer/AspectRatioFrameLayout;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->getResizeMode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
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

.method public getSubtitleView()Lcom/anilab/exoplayer/SubtitleView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->g:Lcom/anilab/exoplayer/SubtitleView;

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

.method public getUseArtwork()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->s:Z

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

.method public getUseController()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->p:Z

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

.method public getVideoSurfaceView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->d:Landroid/view/View;

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

.method public final h()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lj3/r0;->w()Lm4/v;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object v0, Lm4/v;->e:Lm4/v;

    .line 11
    .line 12
    :goto_0
    iget v1, v0, Lm4/v;->a:I

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iget v3, v0, Lm4/v;->b:I

    .line 16
    .line 17
    if-eqz v3, :cond_2

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    int-to-float v1, v1

    .line 23
    iget v4, v0, Lm4/v;->d:F

    .line 24
    .line 25
    mul-float/2addr v1, v4

    .line 26
    int-to-float v3, v3

    .line 27
    div-float/2addr v1, v3

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    :goto_1
    move v1, v2

    .line 30
    :goto_2
    iget-object v3, p0, Lcom/anilab/exoplayer/StyledPlayerView;->d:Landroid/view/View;

    .line 31
    .line 32
    instance-of v4, v3, Landroid/view/TextureView;

    .line 33
    .line 34
    if-eqz v4, :cond_7

    .line 35
    .line 36
    cmpl-float v4, v1, v2

    .line 37
    .line 38
    iget v0, v0, Lm4/v;->c:I

    .line 39
    .line 40
    if-lez v4, :cond_4

    .line 41
    .line 42
    const/16 v4, 0x5a

    .line 43
    .line 44
    if-eq v0, v4, :cond_3

    .line 45
    .line 46
    const/16 v4, 0x10e

    .line 47
    .line 48
    if-ne v0, v4, :cond_4

    .line 49
    .line 50
    :cond_3
    const/high16 v4, 0x3f800000    # 1.0f

    .line 51
    .line 52
    div-float v1, v4, v1

    .line 53
    .line 54
    :cond_4
    iget v4, p0, Lcom/anilab/exoplayer/StyledPlayerView;->B:I

    .line 55
    .line 56
    iget-object v5, p0, Lcom/anilab/exoplayer/StyledPlayerView;->a:LQ2/K;

    .line 57
    .line 58
    if-eqz v4, :cond_5

    .line 59
    .line 60
    invoke-virtual {v3, v5}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 61
    .line 62
    .line 63
    :cond_5
    iput v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->B:I

    .line 64
    .line 65
    if-eqz v0, :cond_6

    .line 66
    .line 67
    invoke-virtual {v3, v5}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 68
    .line 69
    .line 70
    :cond_6
    check-cast v3, Landroid/view/TextureView;

    .line 71
    .line 72
    iget v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->B:I

    .line 73
    .line 74
    invoke-static {v3, v0}, Lcom/anilab/exoplayer/StyledPlayerView;->b(Landroid/view/TextureView;I)V

    .line 75
    .line 76
    .line 77
    :cond_7
    iget-boolean v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->e:Z

    .line 78
    .line 79
    if-eqz v0, :cond_8

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_8
    move v2, v1

    .line 83
    :goto_3
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->b:Lcom/anilab/exoplayer/AspectRatioFrameLayout;

    .line 84
    .line 85
    if-eqz v0, :cond_9

    .line 86
    .line 87
    invoke-virtual {v0, v2}, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->setAspectRatio(F)V

    .line 88
    .line 89
    .line 90
    :cond_9
    return-void
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

.method public final i()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->h:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-interface {v1}, Lj3/r0;->e()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v3, 0x2

    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    iget v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->u:I

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    if-eq v1, v3, :cond_1

    .line 21
    .line 22
    if-ne v1, v4, :cond_0

    .line 23
    .line 24
    iget-object v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 25
    .line 26
    invoke-interface {v1}, Lj3/r0;->m()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v4, v2

    .line 34
    :cond_1
    :goto_0
    if-eqz v4, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const/16 v2, 0x8

    .line 38
    .line 39
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    :cond_3
    return-void
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

.method public final j()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 3
    .line 4
    if-eqz v1, :cond_3

    .line 5
    .line 6
    iget-boolean v2, p0, Lcom/anilab/exoplayer/StyledPlayerView;->p:Z

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v1}, LQ2/D;->f()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-boolean v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->A:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const v1, 0x7f14007d

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const v1, 0x7f14008b

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 52
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

.method public final k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->i:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->w:Ljava/lang/CharSequence;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v1}, Lj3/r0;->d()Lj3/m;

    .line 22
    .line 23
    .line 24
    :cond_1
    const/16 v1, 0x8

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    :cond_2
    return-void
    .line 30
    .line 31
    .line 32
.end method

.method public final l(Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const v2, 0x106000d

    .line 5
    .line 6
    .line 7
    iget-object v3, p0, Lcom/anilab/exoplayer/StyledPlayerView;->c:Landroid/view/View;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/anilab/exoplayer/StyledPlayerView;->f:Landroid/widget/ImageView;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz v0, :cond_7

    .line 13
    .line 14
    invoke-interface {v0}, Lj3/r0;->q()Lj3/G0;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    iget-object v6, v6, Lj3/G0;->a:LP5/F;

    .line 19
    .line 20
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-eqz v6, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-boolean p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->v:Z

    .line 30
    .line 31
    if-nez p1, :cond_1

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-interface {v0}, Lj3/r0;->q()Lj3/G0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const/4 v6, 0x2

    .line 43
    invoke-virtual {p1, v6}, Lj3/G0;->a(I)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    if-eqz v4, :cond_9

    .line 50
    .line 51
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    if-eqz v3, :cond_3

    .line 59
    .line 60
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 61
    .line 62
    .line 63
    :cond_3
    iget-boolean p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->s:Z

    .line 64
    .line 65
    if-eqz p1, :cond_6

    .line 66
    .line 67
    invoke-static {v4}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v0}, Lj3/r0;->R()Lj3/b0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object p1, p1, Lj3/b0;->j:[B

    .line 75
    .line 76
    if-nez p1, :cond_4

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    array-length v0, p1

    .line 80
    invoke-static {p1, v5, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-direct {v0, v3, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v0}, Lcom/anilab/exoplayer/StyledPlayerView;->e(Landroid/graphics/drawable/Drawable;)Z

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    :goto_0
    if-eqz v5, :cond_5

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_5
    iget-object p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->t:Landroid/graphics/drawable/Drawable;

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Lcom/anilab/exoplayer/StyledPlayerView;->e(Landroid/graphics/drawable/Drawable;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_6

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_6
    if-eqz v4, :cond_9

    .line 110
    .line 111
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_7
    :goto_1
    iget-boolean p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->v:Z

    .line 119
    .line 120
    if-nez p1, :cond_9

    .line 121
    .line 122
    if-eqz v4, :cond_8

    .line 123
    .line 124
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 128
    .line 129
    .line 130
    :cond_8
    if-eqz v3, :cond_9

    .line 131
    .line 132
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 133
    .line 134
    .line 135
    :cond_9
    :goto_2
    return-void
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
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 6
    .line 7
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
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

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->C:Landroid/view/GestureDetector;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
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

.method public final onTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->m()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-object p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x1

    .line 13
    invoke-virtual {p0, p1}, Lcom/anilab/exoplayer/StyledPlayerView;->d(Z)V

    .line 14
    .line 15
    .line 16
    return p1

    .line 17
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 18
    return p1
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

.method public setAspectRatioListener(LQ2/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->b:Lcom/anilab/exoplayer/AspectRatioFrameLayout;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->setAspectRatioListener(LQ2/a;)V

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

.method public setControllerAutoShow(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->y:Z

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

.method public setControllerHideDuringAds(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->z:Z

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

.method public setControllerHideOnTouch(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-boolean p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->A:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->j()V

    .line 9
    .line 10
    .line 11
    return-void
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

.method public setControllerOnFullScreenModeChangedListener(LQ2/r;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->r:LQ2/M;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LQ2/D;->setOnFullScreenModeChangedListener(LQ2/r;)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public setControllerShowTimeoutMs(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->x:I

    .line 7
    .line 8
    invoke-virtual {v0}, LQ2/D;->f()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->f()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p0, p1}, Lcom/anilab/exoplayer/StyledPlayerView;->g(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
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

.method public setControllerVisibilityListener(LQ2/C;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 3
    iget-object v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->q:LQ2/C;

    if-ne v1, p1, :cond_0

    return-void

    .line 4
    :cond_0
    iget-object v0, v0, LQ2/D;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 6
    :cond_1
    iput-object p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->q:LQ2/C;

    if-eqz p1, :cond_2

    .line 7
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Lcom/anilab/exoplayer/StyledPlayerView;->setControllerVisibilityListener(LQ2/L;)V

    return-void
.end method

.method public setControllerVisibilityListener(LQ2/L;)V
    .locals 0

    const/4 p1, 0x0

    .line 1
    invoke-virtual {p0, p1}, Lcom/anilab/exoplayer/StyledPlayerView;->setControllerVisibilityListener(LQ2/C;)V

    return-void
.end method

.method public setCustomErrorMessage(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->i:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-static {v0}, Ll4/a;->m(Z)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->w:Ljava/lang/CharSequence;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->k()V

    .line 14
    .line 15
    .line 16
    return-void
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

.method public setDefaultArtwork(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->t:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->t:Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Lcom/anilab/exoplayer/StyledPlayerView;->l(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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

.method public setErrorMessageProvider(Ll4/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll4/e;",
            ")V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->k()V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
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

.method public setFullscreenButtonClickListener(LQ2/M;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->r:LQ2/M;

    .line 7
    .line 8
    iget-object p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->a:LQ2/K;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, LQ2/D;->setOnFullScreenModeChangedListener(LQ2/r;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method public setKeepContentOnPlayerReset(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->v:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->v:Z

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Lcom/anilab/exoplayer/StyledPlayerView;->l(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
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

.method public setPlayer(Lj3/r0;)V
    .locals 7

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    move v0, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    invoke-static {v0}, Ll4/a;->m(Z)V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-interface {p1}, Lj3/r0;->J()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-ne v0, v1, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v0, v2

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    :goto_1
    move v0, v3

    .line 35
    :goto_2
    invoke-static {v0}, Ll4/a;->h(Z)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 39
    .line 40
    if-ne v0, p1, :cond_3

    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_3
    iget-object v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->d:Landroid/view/View;

    .line 45
    .line 46
    iget-object v4, p0, Lcom/anilab/exoplayer/StyledPlayerView;->a:LQ2/K;

    .line 47
    .line 48
    if-eqz v0, :cond_5

    .line 49
    .line 50
    invoke-interface {v0, v4}, Lj3/r0;->x(Lj3/p0;)V

    .line 51
    .line 52
    .line 53
    instance-of v5, v1, Landroid/view/TextureView;

    .line 54
    .line 55
    if-eqz v5, :cond_4

    .line 56
    .line 57
    move-object v5, v1

    .line 58
    check-cast v5, Landroid/view/TextureView;

    .line 59
    .line 60
    invoke-interface {v0, v5}, Lj3/r0;->v(Landroid/view/TextureView;)V

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    instance-of v5, v1, Landroid/view/SurfaceView;

    .line 65
    .line 66
    if-eqz v5, :cond_5

    .line 67
    .line 68
    move-object v5, v1

    .line 69
    check-cast v5, Landroid/view/SurfaceView;

    .line 70
    .line 71
    invoke-interface {v0, v5}, Lj3/r0;->D(Landroid/view/SurfaceView;)V

    .line 72
    .line 73
    .line 74
    :cond_5
    :goto_3
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->g:Lcom/anilab/exoplayer/SubtitleView;

    .line 75
    .line 76
    if-eqz v0, :cond_6

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    invoke-virtual {v0, v5}, Lcom/anilab/exoplayer/SubtitleView;->setCues(Ljava/util/List;)V

    .line 80
    .line 81
    .line 82
    :cond_6
    iput-object p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->m()Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    iget-object v6, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 89
    .line 90
    if-eqz v5, :cond_7

    .line 91
    .line 92
    invoke-virtual {v6, p1}, LQ2/D;->setPlayer(Lj3/r0;)V

    .line 93
    .line 94
    .line 95
    :cond_7
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->i()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->k()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v3}, Lcom/anilab/exoplayer/StyledPlayerView;->l(Z)V

    .line 102
    .line 103
    .line 104
    if-eqz p1, :cond_c

    .line 105
    .line 106
    move-object v3, p1

    .line 107
    check-cast v3, LD/n;

    .line 108
    .line 109
    const/16 v5, 0x1b

    .line 110
    .line 111
    invoke-virtual {v3, v5}, LD/n;->b0(I)Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    if-eqz v5, :cond_a

    .line 116
    .line 117
    instance-of v5, v1, Landroid/view/TextureView;

    .line 118
    .line 119
    if-eqz v5, :cond_8

    .line 120
    .line 121
    check-cast v1, Landroid/view/TextureView;

    .line 122
    .line 123
    invoke-interface {p1, v1}, Lj3/r0;->O(Landroid/view/TextureView;)V

    .line 124
    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_8
    instance-of v5, v1, Landroid/view/SurfaceView;

    .line 128
    .line 129
    if-eqz v5, :cond_9

    .line 130
    .line 131
    check-cast v1, Landroid/view/SurfaceView;

    .line 132
    .line 133
    invoke-interface {p1, v1}, Lj3/r0;->C(Landroid/view/SurfaceView;)V

    .line 134
    .line 135
    .line 136
    :cond_9
    :goto_4
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->h()V

    .line 137
    .line 138
    .line 139
    :cond_a
    if-eqz v0, :cond_b

    .line 140
    .line 141
    const/16 v1, 0x1c

    .line 142
    .line 143
    invoke-virtual {v3, v1}, LD/n;->b0(I)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-eqz v1, :cond_b

    .line 148
    .line 149
    invoke-interface {p1}, Lj3/r0;->u()LY3/c;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    iget-object v1, v1, LY3/c;->a:LP5/F;

    .line 154
    .line 155
    invoke-virtual {v0, v1}, Lcom/anilab/exoplayer/SubtitleView;->setCues(Ljava/util/List;)V

    .line 156
    .line 157
    .line 158
    :cond_b
    invoke-interface {p1, v4}, Lj3/r0;->y(Lj3/p0;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, v2}, Lcom/anilab/exoplayer/StyledPlayerView;->d(Z)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_c
    if-eqz v6, :cond_d

    .line 166
    .line 167
    invoke-virtual {v6}, LQ2/D;->e()V

    .line 168
    .line 169
    .line 170
    :cond_d
    :goto_5
    return-void
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
.end method

.method public setRepeatToggleModes(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, LQ2/D;->setRepeatToggleModes(I)V

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

.method public setResizeMode(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->b:Lcom/anilab/exoplayer/AspectRatioFrameLayout;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/anilab/exoplayer/AspectRatioFrameLayout;->setResizeMode(I)V

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

.method public setShowBuffering(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->u:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->u:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->i()V

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

.method public setShowFastForwardButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, LQ2/D;->setShowFastForwardButton(Z)V

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

.method public setShowMultiWindowTimeBar(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, LQ2/D;->setShowMultiWindowTimeBar(Z)V

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

.method public setShowNextButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, LQ2/D;->setShowNextButton(Z)V

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

.method public setShowPreviousButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, LQ2/D;->setShowPreviousButton(Z)V

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

.method public setShowRewindButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, LQ2/D;->setShowRewindButton(Z)V

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

.method public setShowShuffleButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, LQ2/D;->setShowShuffleButton(Z)V

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

.method public setShowSubtitleButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, LQ2/D;->setShowSubtitleButton(Z)V

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

.method public setShowVrButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 2
    .line 3
    invoke-static {v0}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, LQ2/D;->setShowVrButton(Z)V

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

.method public setShutterBackgroundColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->c:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
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

.method public setUseArtwork(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->f:Landroid/widget/ImageView;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    goto :goto_1

    .line 11
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 12
    :goto_1
    invoke-static {v1}, Ll4/a;->m(Z)V

    .line 13
    .line 14
    .line 15
    iget-boolean v1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->s:Z

    .line 16
    .line 17
    if-eq v1, p1, :cond_2

    .line 18
    .line 19
    iput-boolean p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->s:Z

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/anilab/exoplayer/StyledPlayerView;->l(Z)V

    .line 22
    .line 23
    .line 24
    :cond_2
    return-void
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

.method public setUseController(Z)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, Lcom/anilab/exoplayer/StyledPlayerView;->j:LQ2/D;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v3, v1

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    move v3, v0

    .line 13
    :goto_1
    invoke-static {v3}, Ll4/a;->m(Z)V

    .line 14
    .line 15
    .line 16
    if-nez p1, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->hasOnClickListeners()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_2

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_2
    move v0, v1

    .line 26
    :cond_3
    :goto_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 27
    .line 28
    .line 29
    iget-boolean v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->p:Z

    .line 30
    .line 31
    if-ne v0, p1, :cond_4

    .line 32
    .line 33
    return-void

    .line 34
    :cond_4
    iput-boolean p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->p:Z

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->m()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_5

    .line 41
    .line 42
    iget-object p1, p0, Lcom/anilab/exoplayer/StyledPlayerView;->o:Lj3/r0;

    .line 43
    .line 44
    invoke-virtual {v2, p1}, LQ2/D;->setPlayer(Lj3/r0;)V

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_5
    if-eqz v2, :cond_6

    .line 49
    .line 50
    invoke-virtual {v2}, LQ2/D;->e()V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    invoke-virtual {v2, p1}, LQ2/D;->setPlayer(Lj3/r0;)V

    .line 55
    .line 56
    .line 57
    :cond_6
    :goto_3
    invoke-virtual {p0}, Lcom/anilab/exoplayer/StyledPlayerView;->j()V

    .line 58
    .line 59
    .line 60
    return-void
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

.method public setVisibility(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/anilab/exoplayer/StyledPlayerView;->d:Landroid/view/View;

    .line 5
    .line 6
    instance-of v1, v0, Landroid/view/SurfaceView;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
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
